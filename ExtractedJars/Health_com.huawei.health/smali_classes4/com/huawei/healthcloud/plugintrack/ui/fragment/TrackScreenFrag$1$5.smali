.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$5;
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

    .line 298
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$5;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 312
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 306
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$5;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$5;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lo/chc;->a(Z)V

    .line 307
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 317
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 302
    return-void
.end method
