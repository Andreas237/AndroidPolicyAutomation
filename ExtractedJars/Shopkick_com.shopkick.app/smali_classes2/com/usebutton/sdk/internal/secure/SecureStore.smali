.class public Lcom/usebutton/sdk/internal/secure/SecureStore;
.super Ljava/lang/Object;
.source "SecureStore.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "SecureStore"


# instance fields
.field private final secureCrypto:Lcom/usebutton/sdk/internal/secure/SecureCrypto;

.field private final secureKeyStore:Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

.field private final secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureKeyStore;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureKeyStore:Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

    .line 45
    new-instance v0, Lcom/usebutton/sdk/internal/secure/SecureCrypto;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/secure/SecureCrypto;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureCrypto:Lcom/usebutton/sdk/internal/secure/SecureCrypto;

    .line 46
    new-instance v0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    return-void
.end method

.method private getSecretKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureKeyStore:Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureKeyStore;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureKeyStore:Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureKeyStore;->getKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object p1

    return-object p1

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureKeyStore:Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureKeyStore;->generateKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureKeyStore:Lcom/usebutton/sdk/internal/secure/SecureKeyStore;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/secure/SecureKeyStore;->deleteAllKeys()V

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->clear()V

    return-void
.end method

.method public has(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 100
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->hasString(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public retrieve(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 73
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->hasString(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 74
    sget-object v0, Lcom/usebutton/sdk/internal/secure/SecureStore;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No value found for key: \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/secure/SecureStore;->getSecretKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v2

    .line 85
    :try_start_0
    iget-object v3, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureCrypto:Lcom/usebutton/sdk/internal/secure/SecureCrypto;

    invoke-virtual {v3, v2, v0}, Lcom/usebutton/sdk/internal/secure/SecureCrypto;->decrypt(Ljavax/crypto/SecretKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 87
    :goto_0
    sget-object v2, Lcom/usebutton/sdk/internal/secure/SecureStore;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to decrypt data because of exception: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {v0}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 87
    invoke-static {v2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->deleteString(Ljava/lang/String;)V

    return-object v1
.end method

.method public save(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 57
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 63
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/secure/SecureStore;->getSecretKey(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureCrypto:Lcom/usebutton/sdk/internal/secure/SecureCrypto;

    invoke-virtual {v1, v0, p2}, Lcom/usebutton/sdk/internal/secure/SecureCrypto;->encrypt(Ljavax/crypto/SecretKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 65
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureStore;->secureSharedPrefs:Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->saveString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 58
    :cond_1
    :goto_0
    sget-object v0, Lcom/usebutton/sdk/internal/secure/SecureStore;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not save empty key or data... Key:\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" Data: \""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
