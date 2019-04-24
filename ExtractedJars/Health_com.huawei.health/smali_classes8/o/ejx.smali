.class public Lo/ejx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Lo/ejp;)Z
    .locals 3

    .line 11
    instance-of v0, p0, Lo/eju;

    if-nez v0, :cond_0

    .line 12
    const/4 v0, 0x0

    return v0

    .line 15
    :cond_0
    move-object v1, p0

    check-cast v1, Lo/eju;

    .line 16
    invoke-virtual {v1}, Lo/eju;->a()Lo/eju$c;

    move-result-object v2

    .line 18
    instance-of v0, v2, Lo/eju$d;

    if-eqz v0, :cond_1

    .line 20
    const/4 v0, 0x1

    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
