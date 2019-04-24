.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V
    .locals 0

    .line 765
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 772
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScreenCutAnimation onAnimationEnd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 773
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 774
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->w(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->z(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 776
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->v(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 777
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 781
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 4

    .line 768
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScreenCutAnimation onAnimationStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    return-void
.end method
