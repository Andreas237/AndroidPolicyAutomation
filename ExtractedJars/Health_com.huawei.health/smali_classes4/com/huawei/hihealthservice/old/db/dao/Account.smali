.class public Lcom/huawei/hihealthservice/old/db/dao/Account;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private LOG_TAG:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private systemPropertyData:Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-string v0, "Debug_DE_Account"

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->LOG_TAG:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->mContext:Landroid/content/Context;

    .line 41
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    invoke-direct {v0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->systemPropertyData:Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    .line 42
    return-void
.end method

.method private declared-synchronized deleteAccountSync()I
    .locals 3

    monitor-enter p0

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->systemPropertyData:Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    const-string v1, "Account"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->delete(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private get()Lcom/huawei/hihealthservice/old/model/AccountInfo;
    .locals 8

    .line 58
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->LOG_TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->systemPropertyData:Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    const-string v1, "Account"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->get(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v4

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 65
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v5

    .line 68
    :cond_0
    const/4 v6, 0x0

    .line 69
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 79
    goto :goto_0

    .line 75
    :catch_0
    move-exception v7

    .line 77
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->LOG_TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const-string v2, "get"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 81
    :goto_0
    const-class v0, Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealthservice/old/model/AccountInfo;

    .line 83
    :cond_1
    return-object v6
.end method

.method private declared-synchronized getAccountinfoSync()Lcom/huawei/hihealthservice/old/model/AccountInfo;
    .locals 5

    monitor-enter p0

    .line 50
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->LOG_TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccountinfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Account;->get()Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v4

    .line 52
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/Account;->LOG_TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method


# virtual methods
.method public deleteAccount()I
    .locals 1

    .line 87
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Account;->deleteAccountSync()I

    move-result v0

    return v0
.end method

.method public getAccountinfo()Lcom/huawei/hihealthservice/old/model/AccountInfo;
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/db/dao/Account;->getAccountinfoSync()Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v0

    return-object v0
.end method
