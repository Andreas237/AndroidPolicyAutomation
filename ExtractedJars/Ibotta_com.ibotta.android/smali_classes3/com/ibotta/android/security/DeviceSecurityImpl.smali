.class public Lcom/ibotta/android/security/DeviceSecurityImpl;
.super Ljava/lang/Object;
.source "DeviceSecurityImpl.java"

# interfaces
.implements Lcom/ibotta/android/security/DeviceSecurity;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final ANDROID_ID_FILENAME:Ljava/lang/String; = ".2668e32f-554c-4c32-af00-e588570b3622"

.field private static final SILO_NAME:Ljava/lang/String; = "DevSec"


# instance fields
.field private final context:Landroid/content/Context;

.field private final uniqueId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/security/DeviceSecurityImpl;->context:Landroid/content/Context;

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/security/DeviceSecurityImpl;->constructUniqueId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/security/DeviceSecurityImpl;->uniqueId:Ljava/lang/String;

    return-void
.end method

.method private constructUniqueId()Ljava/lang/String;
    .locals 4

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/security/DeviceSecurityImpl;->loadUniqueId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/security/DeviceSecurityImpl;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Secure.ANDROID_ID=%1$s"

    const/4 v2, 0x1

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    .line 46
    invoke-direct {p0, v0}, Lcom/ibotta/android/security/DeviceSecurityImpl;->saveUniqueId(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private getSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 90
    new-instance v0, Lcom/ibotta/android/commons/disk/StorageSilo;

    iget-object v1, p0, Lcom/ibotta/android/security/DeviceSecurityImpl;->context:Landroid/content/Context;

    const-string v2, "DevSec"

    sget-object v3, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageSilo;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;)V

    return-object v0
.end method

.method private loadUniqueId()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    const-string v1, ".2668e32f-554c-4c32-af00-e588570b3622"

    .line 56
    invoke-direct {p0, v1}, Lcom/ibotta/android/security/DeviceSecurityImpl;->makeFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 59
    invoke-static {v1}, Lorg/apache/commons/io/FileUtils;->readFileToByteArray(Ljava/io/File;)[B

    move-result-object v1

    .line 60
    new-instance v2, Lcom/ibotta/android/security/crypto/DefaultCryptography;

    new-instance v3, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v4, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->DEVICE_SECURITY_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v3, v4}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-direct {v2, v3}, Lcom/ibotta/android/security/crypto/DefaultCryptography;-><init>(Lcom/ibotta/android/security/crypto/key/KeyProvider;)V

    .line 61
    invoke-interface {v2}, Lcom/ibotta/android/security/crypto/Cryptography;->init()V

    .line 62
    new-instance v3, Ljava/lang/String;

    const-string v4, "UTF-8"

    invoke-direct {v3, v1, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-interface {v2, v3}, Lcom/ibotta/android/security/crypto/Cryptography;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method private makeFile(Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/security/DeviceSecurityImpl;->getSilo()Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/disk/StorageSilo;->file(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method private saveUniqueId(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    const-string v0, ".2668e32f-554c-4c32-af00-e588570b3622"

    .line 73
    invoke-direct {p0, v0}, Lcom/ibotta/android/security/DeviceSecurityImpl;->makeFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/ibotta/android/security/crypto/DefaultCryptography;

    new-instance v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v3, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->DEVICE_SECURITY_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v2, v3}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/security/crypto/DefaultCryptography;-><init>(Lcom/ibotta/android/security/crypto/key/KeyProvider;)V

    .line 76
    invoke-interface {v1}, Lcom/ibotta/android/security/crypto/Cryptography;->init()V

    .line 77
    invoke-interface {v1, p1}, Lcom/ibotta/android/security/crypto/Cryptography;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x0

    .line 78
    invoke-static {v0, p1, v1}, Lorg/apache/commons/io/FileUtils;->writeByteArrayToFile(Ljava/io/File;[BZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public getUniqueId()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/security/DeviceSecurityImpl;->uniqueId:Ljava/lang/String;

    return-object v0
.end method
