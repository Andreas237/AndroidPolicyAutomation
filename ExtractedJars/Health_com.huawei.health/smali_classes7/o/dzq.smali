.class public Lo/dzq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Lo/dwk;)Z
    .locals 3

    .line 37
    invoke-virtual {p0}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 38
    invoke-virtual {p0}, Lo/dwk;->g()Lo/dwd;

    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    invoke-virtual {v2}, Lo/dwd;->l()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 43
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
