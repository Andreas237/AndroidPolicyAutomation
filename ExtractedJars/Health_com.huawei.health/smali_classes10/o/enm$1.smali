.class Lo/enm$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/enm;


# direct methods
.method constructor <init>(Lo/enm;)V
    .locals 0

    .line 885
    iput-object p1, p0, Lo/enm$1;->b:Lo/enm;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 887
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 888
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 889
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v2

    .line 890
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->f(Lo/enm;)I

    move-result v0

    sub-int v3, v0, v2

    .line 891
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0, v2}, Lo/enm;->a(Lo/enm;I)I

    .line 892
    if-eqz v3, :cond_0

    .line 893
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0, v3}, Lo/enm;->d(Lo/enm;I)V

    .line 895
    :cond_0
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalY()I

    move-result v0

    sub-int v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 896
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 898
    :cond_1
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->c(Lo/enm;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    .line 899
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->k(Lo/enm;)Landroid/os/Handler;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 900
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_3

    .line 901
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-static {v0}, Lo/enm;->n(Lo/enm;)V

    goto :goto_0

    .line 903
    :cond_3
    iget-object v0, p0, Lo/enm$1;->b:Lo/enm;

    invoke-virtual {v0}, Lo/enm;->e()V

    .line 905
    :goto_0
    return-void
.end method
