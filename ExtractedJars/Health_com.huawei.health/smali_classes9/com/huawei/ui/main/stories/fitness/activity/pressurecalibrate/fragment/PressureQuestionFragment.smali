.class public abstract Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->a:Z

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->b:Z

    return-void
.end method

.method private c()V
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->a:Z

    if-nez v0, :cond_0

    .line 49
    return-void

    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->a()V

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->b:Z

    goto :goto_0

    .line 56
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->b:Z

    if-eqz v0, :cond_2

    .line 57
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->d()V

    .line 60
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected d()V
    .locals 0

    .line 110
    return-void
.end method

.method protected abstract e()I
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 25
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->e()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->c:Landroid/view/View;

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->a:Z

    .line 28
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->c()V

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->c:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 1

    .line 67
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->a:Z

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->b:Z

    .line 71
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 37
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;->c()V

    .line 39
    return-void
.end method
