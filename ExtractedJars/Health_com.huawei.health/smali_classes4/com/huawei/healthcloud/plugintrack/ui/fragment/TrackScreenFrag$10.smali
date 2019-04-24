.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V
    .locals 0

    .line 939
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 942
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;

    .line 943
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$animator;->track_history_fade_out:I

    invoke-static {v1, v2}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 944
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/Animator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 945
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$animator;->track_history_fade_in:I

    invoke-static {v0, v1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v4

    .line 946
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 947
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/animation/Animator;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/Animator;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 948
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10$5;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 970
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;)V

    invoke-interface {v0, v1}, Lo/cha;->c(Lo/cha$b;)V

    .line 981
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cgt;

    move-result-object v2

    invoke-virtual {v2}, Lo/cgt;->b()Lo/cew;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/cha;->b(Landroid/os/Handler;Lo/cew;Z)V

    .line 982
    return-void
.end method
