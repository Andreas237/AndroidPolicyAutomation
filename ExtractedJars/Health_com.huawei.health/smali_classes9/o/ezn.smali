.class public Lo/ezn;
.super Lo/ezg;
.source "SourceFile"

# interfaces
.implements Lo/ezt;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezn$a;,
        Lo/ezn$b;
    }
.end annotation


# instance fields
.field private a:Lo/ezn$b;

.field private b:Lo/eyv;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ezg;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezn;->a:Lo/ezn$b;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezn;->e:Landroid/view/View;

    .line 33
    return-void
.end method


# virtual methods
.method public a(Lo/eih;II)V
    .locals 5

    .line 40
    iget-object v0, p0, Lo/ezn;->b:Lo/eyv;

    if-nez v0, :cond_0

    .line 41
    invoke-virtual {p1}, Lo/eih;->getShowDataAverage()F

    move-result v4

    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Lo/ezn;->b:Lo/eyv;

    iget-object v1, p0, Lo/ezn;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v4

    .line 46
    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_1

    .line 47
    float-to-int v0, v4

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ezn;->setContentText(Ljava/lang/String;)V

    goto :goto_1

    .line 49
    :cond_1
    const-string v0, "--"

    invoke-virtual {p0, v0}, Lo/ezn;->setContentText(Ljava/lang/String;)V

    .line 52
    :goto_1
    iget-object v0, p0, Lo/ezn;->a:Lo/ezn$b;

    if-eqz v0, :cond_2

    .line 53
    iget-object v0, p0, Lo/ezn;->a:Lo/ezn$b;

    invoke-interface {v0, v4}, Lo/ezn$b;->c(F)V

    .line 56
    :cond_2
    return-void
.end method

.method public c(Lo/eyv;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/ezn;->b:Lo/eyv;

    .line 60
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 3

    .line 79
    invoke-virtual {p0}, Lo/ezn;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v2

    .line 80
    if-nez v2, :cond_0

    .line 81
    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_0
    iget-object v0, p0, Lo/ezn;->e:Landroid/view/View;

    if-nez v0, :cond_1

    .line 84
    new-instance v0, Lo/ezn$a;

    invoke-virtual {p0}, Lo/ezn;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ezn$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ezn;->e:Landroid/view/View;

    .line 86
    :cond_1
    iget-object v0, p0, Lo/ezn;->e:Landroid/view/View;

    return-object v0
.end method

.method public setOnReferenceChangeListener(Lo/ezn$b;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lo/ezn;->a:Lo/ezn$b;

    .line 95
    return-void
.end method
