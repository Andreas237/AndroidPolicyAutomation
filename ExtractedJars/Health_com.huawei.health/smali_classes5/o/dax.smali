.class public Lo/dax;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 52
    const/4 v1, 0x0

    .line 53
    const-string v0, "setMetricUnit"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const/4 v1, 0x1

    .line 57
    :cond_0
    return v1
.end method
