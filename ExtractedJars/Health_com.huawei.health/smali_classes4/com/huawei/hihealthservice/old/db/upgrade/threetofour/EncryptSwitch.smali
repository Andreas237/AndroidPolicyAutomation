.class public abstract Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected count:I

.field private desEncrypt:Ljava/lang/String;

.field private encryptKey:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field protected writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->mContext:Landroid/content/Context;

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->encryptKey:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->desEncrypt:Ljava/lang/String;

    .line 16
    const/16 v0, 0x14

    iput v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->count:I

    .line 22
    iput-object p2, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 23
    iput-object p3, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->encryptKey:Ljava/lang/String;

    .line 24
    iput-object p4, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->desEncrypt:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->mContext:Landroid/content/Context;

    .line 26
    return-void
.end method


# virtual methods
.method public desEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->init(Landroid/content/Context;)V

    .line 38
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->desEncrypt:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/AES_CBC_HEX_Util_OLD_ONE;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 31
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitch;->encryptKey:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
