.class Lo/cir$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->c(IIILandroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cir;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/cir;ZLandroid/view/View;II)V
    .locals 0

    .line 891
    iput-object p1, p0, Lo/cir$5;->a:Lo/cir;

    iput-boolean p2, p0, Lo/cir$5;->e:Z

    iput-object p3, p0, Lo/cir$5;->b:Landroid/view/View;

    iput p4, p0, Lo/cir$5;->d:I

    iput p5, p0, Lo/cir$5;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 6

    .line 904
    iget-object v0, p0, Lo/cir$5;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/cir$5;->e:Z

    if-nez v0, :cond_0

    .line 905
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p0, Lo/cir$5;->d:I

    iget v2, p0, Lo/cir$5;->c:I

    sub-int/2addr v1, v2

    sub-int v4, v0, v1

    goto :goto_0

    .line 907
    :cond_0
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, p0, Lo/cir$5;->d:I

    iget v2, p0, Lo/cir$5;->c:I

    sub-int/2addr v1, v2

    add-int v4, v0, v1

    .line 909
    :goto_0
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v5

    .line 910
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 911
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-static {v0, v4, v5}, Lo/cir;->e(Landroid/view/View;II)V

    .line 912
    iget-boolean v0, p0, Lo/cir$5;->e:Z

    if-eqz v0, :cond_2

    .line 913
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 914
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 916
    :cond_1
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 917
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_stop:I

    if-ne v0, v1, :cond_3

    .line 918
    iget-object v0, p0, Lo/cir$5;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 922
    :cond_2
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_stop:I

    if-ne v0, v1, :cond_3

    .line 923
    iget-object v0, p0, Lo/cir$5;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lo/cir$5;->d:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTranslationX(F)V

    .line 924
    iget-object v0, p0, Lo/cir$5;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chh;->e(Z)V

    .line 927
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/cir$5;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 929
    iget-object v0, p0, Lo/cir$5;->a:Lo/cir;

    invoke-static {v0}, Lo/cir;->f(Lo/cir;)Lo/cir$e;

    move-result-object v0

    new-instance v1, Lo/cir$5$5;

    invoke-direct {v1, p0}, Lo/cir$5$5;-><init>(Lo/cir$5;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Lo/cir$e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 935
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 899
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 894
    iget-object v0, p0, Lo/cir$5;->a:Lo/cir;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cir;->a(Lo/cir;Z)Z

    .line 895
    return-void
.end method
