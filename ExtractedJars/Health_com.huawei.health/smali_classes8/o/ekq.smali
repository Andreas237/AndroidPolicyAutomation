.class public Lo/ekq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lo/eie;Z)V
    .locals 2

    .line 13
    if-eqz p1, :cond_0

    .line 15
    const/high16 v0, 0x42200000    # 40.0f

    invoke-virtual {p0, v0}, Lo/eie;->setMinOffset(F)V

    .line 18
    invoke-virtual {p0}, Lo/eie;->getLegend()Lo/lm;

    move-result-object v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v0, v1}, Lo/lm;->f(F)V

    .line 19
    return-void

    .line 21
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eie;->setMinOffset(F)V

    .line 24
    invoke-virtual {p0}, Lo/eie;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/lm;->f(F)V

    .line 25
    return-void
.end method
