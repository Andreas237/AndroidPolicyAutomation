.class public Lo/foh;
.super Lo/fnv;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/fnv;-><init>(Lo/fmw;)V

    .line 29
    return-void
.end method


# virtual methods
.method public b(JLo/fmb;I)V
    .locals 3

    .line 43
    invoke-virtual {p0, p3}, Lo/foh;->e(Lo/fmb;)Lo/fmu;

    move-result-object v1

    .line 44
    invoke-virtual {v1, p3}, Lo/fmu;->c(Lo/fmb;)I

    move-result v2

    .line 47
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->b(Z)V

    .line 48
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/fmu;->c(Z)V

    .line 50
    invoke-virtual {p0, p1, p2, v2, v1}, Lo/foh;->d(JILo/fmu;)V

    .line 52
    return-void
.end method

.method protected d(JILo/fmu;)V
    .locals 2

    .line 34
    move-wide v0, p1

    .line 37
    invoke-virtual {p4, v0, v1}, Lo/fmu;->e(J)V

    .line 38
    return-void
.end method
