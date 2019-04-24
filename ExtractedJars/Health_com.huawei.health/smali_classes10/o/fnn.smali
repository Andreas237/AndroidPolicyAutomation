.class public final Lo/fnn;
.super Lo/fng;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/fng;-><init>()V

    return-void
.end method


# virtual methods
.method protected e(Lo/fpp;Lo/fnf;)V
    .locals 2

    .line 35
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 36
    invoke-virtual {p2}, Lo/fnf;->e()Lo/flj$e;

    move-result-object v0

    iget v0, v0, Lo/flj$e;->a:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 37
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->b()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 38
    invoke-virtual {p2}, Lo/fnf;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 39
    invoke-virtual {p2}, Lo/fnf;->a()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 40
    invoke-virtual {p2}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {v0}, Lo/flz;->d()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fpp;->e([B)V

    .line 41
    return-void
.end method
