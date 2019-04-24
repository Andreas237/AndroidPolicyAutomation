.class public Lo/abi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 31
    if-nez p0, :cond_0

    .line 32
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCloudState invalied param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    const-string v0, "-1"

    return-object v0

    .line 36
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    .line 39
    invoke-static {p0}, Lo/abe;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    const-string v6, "1"

    .line 43
    invoke-static {p0}, Lo/abe;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 44
    const-string v6, "0"

    .line 47
    :cond_1
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Statelogied cloud state : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    return-object v6

    .line 50
    :cond_2
    const-string v0, "cn"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "zh"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 52
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "If it is china, save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "1"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    const-string v0, "1"

    return-object v0

    .line 55
    :cond_3
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "If it is not china, save "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "0"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const-string v0, "0"

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 111
    const/16 v0, 0x271f

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "key_ui_if_show_area_select_alert"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-static {p0, v0, v1, p1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 115
    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 61
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isAllowedLogin() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {p0}, Lo/abe;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isAllowedLogin() ifAllowLogin true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const-string v0, "1"

    return-object v0

    .line 67
    :cond_0
    invoke-static {p0}, Lo/abi;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 72
    const-string v4, ""

    .line 73
    invoke-static {p0}, Lo/dbf;->F(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSameTelephonyNetWorkAndSim!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {p0}, Lo/dbf;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 77
    invoke-static {p0, v4}, Lo/dbf;->u(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeIfInAccountArea set allowedLogin!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const-string v0, "1"

    invoke-static {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    const-string v0, "cn"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    const-string v0, "1"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    goto :goto_0

    .line 84
    :cond_0
    const-string v0, "0"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 86
    :goto_0
    const-string v0, "1"

    return-object v0

    .line 90
    :cond_1
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeIfInAccountArea set notAllowedLogin!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const-string v0, "0"

    invoke-static {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 92
    const-string v0, "0"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 93
    const-string v0, "0"

    return-object v0

    .line 97
    :cond_2
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSameTelephonyNetWorkAndSim false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const-string v0, "1"

    invoke-static {p0, v0}, Lo/abi;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 100
    invoke-static {p0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0}, Lo/dbf;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 101
    :cond_3
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isAllowedLogin() true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const-string v0, "1"

    return-object v0

    .line 104
    :cond_4
    const-string v0, "Login_VersionIsCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isAllowedLogin() false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const-string v0, "0"

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 118
    const/16 v0, 0x271f

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "key_ui_if_show_area_select_alert"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 120
    return-object v2
.end method
