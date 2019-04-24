.class Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->finish()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 347
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d()V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 349
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 350
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 356
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 343
    return-void
.end method
