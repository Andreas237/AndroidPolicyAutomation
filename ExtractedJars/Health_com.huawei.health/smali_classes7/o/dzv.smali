.class public Lo/dzv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lo/dwk;)Z
    .locals 3

    .line 35
    invoke-virtual {p0}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 36
    invoke-virtual {p0}, Lo/dwk;->h()Lo/dwh;

    move-result-object v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    invoke-virtual {v2}, Lo/dwh;->n()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 41
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
