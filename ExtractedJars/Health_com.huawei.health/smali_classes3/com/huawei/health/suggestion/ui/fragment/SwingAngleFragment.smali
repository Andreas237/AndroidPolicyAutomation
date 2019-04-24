.class public Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;
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
    .locals 9

    .line 31
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    if-nez v0, :cond_0

    .line 32
    return-void

    .line 34
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c()V

    .line 35
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->e:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_running_posture_avg_swing_angle:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireValueList()[I

    move-result-object v7

    .line 37
    if-eqz v7, :cond_1

    array-length v0, v7

    if-nez v0, :cond_2

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 39
    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->a:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->IDS_degree_unit_with_value:I

    const/4 v3, 0x0

    aget v3, v7, v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aget v5, v7, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 42
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->h:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_what_swing_angle:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->i:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x46

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x8c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 46
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 47
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->m:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->img_swing_angle:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v8

    .line 48
    if-eqz v8, :cond_3

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    :cond_3
    goto :goto_0

    .line 52
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->img_swing_angle:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 54
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
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;->p:I

    .line 24
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 26
    return-object v1
.end method
