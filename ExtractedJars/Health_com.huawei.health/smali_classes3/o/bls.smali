.class public Lo/bls;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static d(Landroid/content/Context;)I
    .locals 3

    .line 64
    const/4 v1, 0x0

    .line 65
    const-string v0, "com.huawei.appmarket"

    invoke-static {v0, p0}, Lo/bnx;->c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 66
    if-nez v2, :cond_0

    .line 68
    const/4 v1, 0x0

    goto :goto_0

    .line 72
    :cond_0
    const/4 v1, 0x2

    .line 74
    :goto_0
    return v1
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;J)I
    .locals 4

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {p1, p0}, Lo/bnx;->c(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 41
    if-nez v3, :cond_0

    .line 43
    const/4 v2, 0x0

    goto :goto_0

    .line 45
    :cond_0
    iget v0, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v0, v0

    cmp-long v0, v0, p2

    if-gez v0, :cond_1

    .line 47
    const/4 v2, 0x1

    goto :goto_0

    .line 51
    :cond_1
    const/4 v2, 0x2

    .line 53
    :goto_0
    return v2
.end method
