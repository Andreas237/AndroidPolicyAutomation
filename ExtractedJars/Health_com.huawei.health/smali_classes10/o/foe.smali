.class public Lo/foe;
.super Lo/foi;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lo/foi;-><init>(Lo/fmw;)V

    .line 28
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/foe;->b(Z)V

    .line 29
    return-void
.end method


# virtual methods
.method public b(JLo/fmb;I)V
    .locals 3

    .line 34
    invoke-virtual {p0, p3}, Lo/foe;->e(Lo/fmb;)Lo/fmu;

    move-result-object v1

    .line 35
    invoke-virtual {v1, p3}, Lo/fmu;->c(Lo/fmb;)I

    move-result v2

    .line 37
    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    invoke-virtual {v1}, Lo/fmu;->g()V

    .line 44
    invoke-virtual {v1}, Lo/fmu;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 47
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->b(Z)V

    .line 48
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/foe;->a(JILo/fmu;)V

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/foe;->d(JILo/fmu;)V

    .line 53
    :goto_0
    return-void
.end method
