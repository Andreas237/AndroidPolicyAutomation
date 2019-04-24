.class public Lo/abe;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 6

    .line 87
    const-string v0, "health_cloud.db"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIf1login: obtainOldHuid database exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    new-instance v4, Lcom/huawei/hihealthservice/old/db/dao/Account;

    invoke-direct {v4, p0}, Lcom/huawei/hihealthservice/old/db/dao/Account;-><init>(Landroid/content/Context;)V

    .line 91
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/db/dao/Account;->getAccountinfo()Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v5

    .line 93
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 94
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_0
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v4

    .line 99
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 100
    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    const/4 v4, 0x0

    .line 103
    :cond_1
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIf1login is loged "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return v4
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 138
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isAllowedLogin() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "allow_login_or_not"

    .line 140
    invoke-virtual {v0, v1}, Lo/dcq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 141
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: ifAllowLogin = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    invoke-static {p0}, Lo/abe;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    const-string v0, "1"

    invoke-static {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 145
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isAllowedLogin() ifAllowLogin true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 8

    .line 29
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "have_cloud_or_not"

    .line 30
    invoke-virtual {v0, v1}, Lo/dcq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 31
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Health APP VersionDbManager = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "local_country_code"

    .line 33
    invoke-virtual {v0, v1}, Lo/dcq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 34
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "local_language_code"

    .line 35
    invoke-virtual {v0, v1}, Lo/dcq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 37
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v5

    .line 39
    invoke-static {p0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "local_country_code"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Lo/dcq;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 41
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get the countryCode and save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    :cond_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    .line 47
    invoke-static {p0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "local_language_code"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v2}, Lo/dcq;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 49
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get the languageCode and save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 57
    invoke-static {p0}, Lo/abe;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    const-string v7, "1"

    .line 61
    invoke-static {p0}, Lo/abe;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 62
    const-string v7, "0"

    .line 65
    :cond_2
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logied cloud state : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 67
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "If have login save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    goto :goto_0

    :cond_3
    const-string v0, "cn"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "zh"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    const-string v0, "1"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 71
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "If it is china, save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "1"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 73
    :cond_4
    const-string v0, "0"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 74
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "If it is not china, save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "0"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    :cond_5
    invoke-static {}, Lo/dbf;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 77
    invoke-static {v4}, Lo/dbf;->c(Ljava/lang/String;)V

    .line 78
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CommonUtil.setIsNoCloud = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :cond_6
    :goto_0
    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 8

    .line 109
    const/4 v4, 0x1

    .line 111
    const/4 v5, -0x1

    .line 113
    const-string v0, "health_cloud.db"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "1.0 db exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    new-instance v6, Lcom/huawei/hihealthservice/old/db/dao/Account;

    invoke-direct {v6, p0}, Lcom/huawei/hihealthservice/old/db/dao/Account;-><init>(Landroid/content/Context;)V

    .line 119
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/db/dao/Account;->getAccountinfo()Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v7

    .line 121
    if-eqz v7, :cond_0

    .line 122
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getSiteId()I

    move-result v5

    .line 125
    :cond_0
    goto :goto_0

    .line 126
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v5

    .line 129
    :goto_0
    const-string v0, "Login_StorageIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "site is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x1

    if-ne v0, v5, :cond_2

    .line 132
    const/4 v0, 0x1

    return v0

    .line 134
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
