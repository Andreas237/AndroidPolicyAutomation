.class public final Lo/for;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lo/fok;)Lo/fok;
    .locals 4

    .line 36
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lo/fok;->d()Lo/fma;

    move-result-object v2

    .line 40
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 41
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "missing request for observation!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_1
    new-instance v3, Lo/fma;

    invoke-virtual {v2}, Lo/fma;->E()Lo/flj$d;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/fma;-><init>(Lo/flj$d;)V

    .line 44
    invoke-virtual {v2}, Lo/fma;->u()Lo/fow;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fma;->e(Lo/fow;)Lo/fma;

    .line 45
    invoke-virtual {v2}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fma;->d(Lo/flj$e;)Lo/flq;

    .line 46
    invoke-virtual {v2}, Lo/fma;->a()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/fma;->d(I)Lo/flq;

    .line 47
    invoke-virtual {v2}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 48
    invoke-virtual {v2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fma;->e(Lo/flr;)Lo/flq;

    .line 49
    invoke-virtual {v2}, Lo/fma;->l()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fma;->c([B)Lo/fma;

    .line 50
    invoke-virtual {v2}, Lo/fma;->N()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fma;->a(Ljava/util/Map;)Lo/fma;

    .line 51
    new-instance v0, Lo/fok;

    invoke-virtual {p0}, Lo/fok;->b()Lo/fow;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Lo/fok;-><init>(Lo/fma;Lo/fow;)V

    return-object v0
.end method
