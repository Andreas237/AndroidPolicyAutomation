.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 291
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 281
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 282
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;->d()V

    .line 286
    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 296
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 272
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 274
    return-void
.end method
