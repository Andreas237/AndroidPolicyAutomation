.class public final Lcom/huawei/wallet/utils/nversion/NversionUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 42
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    .line 44
    const-string v0, "user"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/UserManager;

    .line 45
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 47
    const/4 v0, 0x1

    return v0

    .line 49
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 51
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
