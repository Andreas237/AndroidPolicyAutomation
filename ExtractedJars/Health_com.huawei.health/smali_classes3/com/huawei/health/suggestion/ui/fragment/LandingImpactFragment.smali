.class public Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;
.super Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 7

    .line 31
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    if-nez v0, :cond_0

    .line 32
    return-void

    .line 34
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c()V

    .line 35
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->e:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_running_posture_avg_ground_impact_acceleration:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireValueList()[I

    move-result-object v5

    .line 37
    if-eqz v5, :cond_1

    array-length v0, v5

    if-nez v0, :cond_2

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 39
    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->a:Lo/egb;

    const/4 v1, 0x0

    aget v1, v5, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->c:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_gravity_unit:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->h:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_what_landing_impact:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->i:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodichongji_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->m:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->img_ground_impact:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v6

    .line 50
    if-eqz v6, :cond_3

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    :cond_3
    goto :goto_0

    .line 54
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->img_ground_impact:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    :goto_0
    return-void
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

    .line 23
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;->p:I

    .line 24
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 26
    return-object v1
.end method
