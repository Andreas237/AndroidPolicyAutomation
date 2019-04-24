.class public abstract Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DE_EncryptSwitchFourToFive"

.field protected static final count:I = 0x14

.field static is5000:Z = false

.field static isRun5000:Z = false


# instance fields
.field private desEncryptKey:Ljava/lang/String;

.field private encryptKey:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field protected writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->is5000:Z

    .line 48
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->isRun5000:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->mContext:Landroid/content/Context;

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->encryptKey:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->desEncryptKey:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 31
    iput-object p3, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->encryptKey:Ljava/lang/String;

    .line 32
    iput-object p4, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->desEncryptKey:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->mContext:Landroid/content/Context;

    .line 34
    return-void
.end method

.method private static setIs5000True()V
    .locals 1

    .line 98
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->is5000:Z

    .line 99
    return-void
.end method

.method private static setIsRunTrue()V
    .locals 1

    .line 93
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->isRun5000:Z

    .line 94
    return-void
.end method


# virtual methods
.method public desEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 53
    const-string v0, "Debug_DE_EncryptSwitchFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 57
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    sget-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->is5000:Z

    if-eqz v0, :cond_1

    .line 62
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "ok is 5000 is5000"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_1
    sget-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->isRun5000:Z

    if-nez v0, :cond_2

    .line 68
    invoke-static {}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->setIsRunTrue()V

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->desEncryptKey:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 73
    const-string v0, "Debug_DE_EncryptSwitchFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt encrypt = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-static {}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->setIs5000True()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    goto :goto_0

    .line 77
    :catch_0
    move-exception v4

    .line 79
    const-string v0, "Debug_DE_EncryptSwitchFourToFive"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    :goto_0
    sget-boolean v0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->is5000:Z

    if-eqz v0, :cond_2

    .line 84
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "ok is 5000"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->desEncryptKey:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 38
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 40
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->initSecretKeyS(Landroid/content/Context;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->encryptKey:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/util/AES_CBC_HEX_Util_6_7;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchFourToFive;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method
