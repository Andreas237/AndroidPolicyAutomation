.class public Lo/ezl;
.super Lo/ezg;
.source "SourceFile"

# interfaces
.implements Lo/ezt;


# instance fields
.field private c:Lo/eyv;

.field private d:Lo/eyv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 24
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ezg;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezl;->c:Lo/eyv;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezl;->d:Lo/eyv;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Lo/eih;II)V
    .locals 8

    .line 30
    const/4 v5, 0x1

    .line 31
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 32
    iget-object v0, p0, Lo/ezl;->c:Lo/eyv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ezl;->d:Lo/eyv;

    if-nez v0, :cond_2

    .line 33
    :cond_0
    invoke-virtual {p1}, Lo/eih;->getShowMinMaxRangeByRatio()[F

    move-result-object v7

    .line 34
    if-eqz v7, :cond_1

    array-length v0, v7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 35
    const/4 v0, 0x0

    aget v6, v7, v0

    .line 36
    const/4 v0, 0x1

    aget v5, v7, v0

    .line 38
    :cond_1
    goto :goto_0

    .line 39
    :cond_2
    iget-object v0, p0, Lo/ezl;->c:Lo/eyv;

    iget-object v1, p0, Lo/ezl;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v5

    .line 40
    iget-object v0, p0, Lo/ezl;->d:Lo/eyv;

    iget-object v1, p0, Lo/ezl;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v6

    .line 42
    :goto_0
    cmpl-float v0, v5, v6

    if-ltz v0, :cond_3

    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_3

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    float-to-double v1, v5

    .line 50
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-virtual {p0, v0}, Lo/ezl;->setContentText(Ljava/lang/String;)V

    goto :goto_1

    .line 53
    :cond_3
    const-string v0, "--"

    invoke-virtual {p0, v0}, Lo/ezl;->setContentText(Ljava/lang/String;)V

    .line 55
    :goto_1
    return-void
.end method

.method public b(Lo/eyv;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/ezl;->d:Lo/eyv;

    .line 63
    return-void
.end method

.method public d(Lo/eyv;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/ezl;->c:Lo/eyv;

    .line 59
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 1

    .line 68
    const/4 v0, 0x0

    return-object v0
.end method
