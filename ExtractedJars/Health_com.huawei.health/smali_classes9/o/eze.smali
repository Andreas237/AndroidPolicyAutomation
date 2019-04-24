.class public Lo/eze;
.super Lo/ezj;
.source "SourceFile"


# instance fields
.field private b:Lo/eyv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ezj;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    return-void
.end method


# virtual methods
.method public a(Lo/eih;II)V
    .locals 3

    .line 29
    const/4 v2, 0x0

    .line 30
    iget-object v0, p0, Lo/eze;->b:Lo/eyv;

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lo/eze;->b:Lo/eyv;

    iget-object v1, p0, Lo/eze;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v2

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Lo/eih;->getShowDataAverage()F

    move-result v2

    .line 36
    :goto_0
    iget-object v0, p0, Lo/eze;->f:Lo/ezh;

    invoke-virtual {v0, v2}, Lo/ezh;->d(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eze;->setContentText(Ljava/lang/String;)V

    .line 38
    return-void
.end method

.method public setCustomCalculator(Lo/eyv;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/eze;->b:Lo/eyv;

    .line 42
    return-void
.end method
