.class public Lo/bzp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bzp$e;
    }
.end annotation


# instance fields
.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/bzp;->d:I

    return-void
.end method

.method public static a()Lo/bzp;
    .locals 1

    .line 27
    invoke-static {}, Lo/bzp$e;->c()Lo/bzp;

    move-result-object v0

    return-object v0
.end method

.method public static c()Landroid/content/pm/PackageInfo;
    .locals 7

    .line 104
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 105
    const/4 v5, 0x0

    .line 107
    :try_start_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v6

    .line 109
    const-string v0, "AppManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    :goto_0
    return-object v5
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .line 86
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 71
    invoke-static {}, Lo/bzp;->c()Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 72
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 73
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    return-object v0

    .line 75
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static i()Z
    .locals 2

    .line 120
    invoke-static {}, Lo/bzp;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bzp;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.bone"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    .line 129
    invoke-static {}, Lo/bzp;->c()Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 130
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 131
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    return-object v0

    .line 133
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 2

    .line 35
    iget v0, p0, Lo/bzp;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 36
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const/4 v0, 0x2

    iput v0, p0, Lo/bzp;->d:I

    .line 39
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lo/bzp;->d:I

    .line 42
    const/4 v0, 0x1

    return v0

    .line 44
    :cond_1
    iget v0, p0, Lo/bzp;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 45
    const/4 v0, 0x0

    return v0

    .line 47
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
