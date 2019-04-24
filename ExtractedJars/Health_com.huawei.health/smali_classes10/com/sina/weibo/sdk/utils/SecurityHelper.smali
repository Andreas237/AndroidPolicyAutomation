.class public Lcom/sina/weibo/sdk/utils/SecurityHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkResponseAppLegal(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/WbAppInfo;Landroid/content/Intent;)Z
    .locals 3

    .line 71
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getSupportVersion()I

    move-result v0

    const/16 v1, 0x2870

    if-gt v0, v1, :cond_0

    .line 72
    const/4 v0, 0x1

    return v0

    .line 73
    :cond_0
    if-nez p1, :cond_1

    .line 74
    const/4 v0, 0x1

    return v0

    .line 77
    :cond_1
    if-eqz p2, :cond_2

    const-string v0, "_weibo_appPackage"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 79
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    const-string v0, "_weibo_transaction"

    .line 80
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 81
    invoke-static {p0, v2}, Lcom/sina/weibo/sdk/ApiUtils;->validateWeiboSign(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 82
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 84
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public static containSign([Landroid/content/pm/Signature;Ljava/lang/String;)Z
    .locals 6

    .line 94
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 95
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_1
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 98
    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest([B)Ljava/lang/String;

    move-result-object v5

    .line 99
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    const/4 v0, 0x1

    return v0

    .line 97
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 103
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static validateAppSignatureForIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 6

    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 46
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 47
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    .line 50
    if-nez v3, :cond_1

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_1
    iget-object v0, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 55
    const/16 v0, 0x40

    :try_start_0
    invoke-virtual {v2, v4, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    .line 56
    iget-object v0, v5, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const-string v1, "18da2bf10352443a00a5e046d9fca6bd"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/SecurityHelper;->containSign([Landroid/content/pm/Signature;Ljava/lang/String;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 57
    :catch_0
    move-exception v5

    .line 58
    invoke-virtual {v5}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 61
    goto :goto_0

    .line 59
    :catch_1
    move-exception v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 62
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
