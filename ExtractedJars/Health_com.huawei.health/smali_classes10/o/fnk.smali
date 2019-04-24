.class public final Lo/fnk;
.super Lo/fng;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lo/fng;-><init>()V

    return-void
.end method


# virtual methods
.method protected e(Lo/fpp;Lo/fnf;)V
    .locals 2

    .line 37
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    const/16 v1, 0xd

    if-ge v0, v1, :cond_0

    .line 38
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 39
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->b()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    const/16 v1, 0x10d

    if-ge v0, v1, :cond_1

    .line 41
    const/16 v0, 0xd

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 42
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->b()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 43
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0xd

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    const v1, 0x1010d

    if-ge v0, v1, :cond_2

    .line 45
    const/16 v0, 0xe

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 46
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->b()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 47
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    add-int/lit16 v0, v0, -0x10d

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    goto :goto_0

    .line 49
    :cond_2
    const/16 v0, 0xf

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 50
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->b()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 51
    invoke-virtual {p2}, Lo/fnf;->c()I

    move-result v0

    const v1, 0x1010d

    sub-int/2addr v0, v1

    const/16 v1, 0x20

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 54
    :goto_0
    invoke-virtual {p2}, Lo/fnf;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 55
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->d()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fpp;->e([B)V

    .line 56
    return-void
.end method
