.class public Lo/bar;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    .line 24
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    return-object v1

    .line 29
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 33
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 37
    :cond_2
    return-object v1
.end method
