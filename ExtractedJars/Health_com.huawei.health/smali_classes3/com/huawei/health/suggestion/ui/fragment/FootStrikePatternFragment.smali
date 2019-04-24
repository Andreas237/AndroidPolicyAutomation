.class public Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;
.super Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;
.source "SourceFile"


# instance fields
.field private o:Lo/end;

.field private q:Lo/egb;

.field private r:Lo/egb;

.field private u:Lo/egb;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;)V
    .locals 2

    .line 36
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_item_proportinbar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    sget v0, Lcom/huawei/health/suggestion/R$id;->proportion_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/end;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->o:Lo/end;

    .line 39
    sget v0, Lcom/huawei/health/suggestion/R$id;->running_posture_avg_foot_strike_pattern_fore_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->u:Lo/egb;

    .line 40
    sget v0, Lcom/huawei/health/suggestion/R$id;->running_posture_avg_foot_strike_pattern_whole_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->r:Lo/egb;

    .line 41
    sget v0, Lcom/huawei/health/suggestion/R$id;->running_posture_avg_foot_strike_pattern_hind_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->q:Lo/egb;

    .line 43
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->a(Landroid/view/View;)V

    .line 44
    return-void
.end method

.method public c()V
    .locals 10

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    if-nez v0, :cond_0

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 51
    return-void

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireValueList()[I

    move-result-object v5

    .line 55
    if-eqz v5, :cond_1

    array-length v0, v5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 57
    return-void

    .line 60
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->o:Lo/end;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->track_detail_running_posture_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$color;->track_detail_running_posture_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$color;->track_detail_running_posture_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/end;->setColors(III)V

    .line 61
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->o:Lo/end;

    const/4 v1, 0x0

    aget v1, v5, v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aget v2, v5, v2

    int-to-float v2, v2

    const/4 v3, 0x2

    aget v3, v5, v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lo/end;->setViewData(FFF)V

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->o:Lo/end;

    invoke-virtual {v0}, Lo/end;->postInvalidate()V

    .line 64
    const/4 v0, 0x0

    aget v0, v5, v0

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 65
    const/4 v0, 0x1

    aget v0, v5, v0

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 66
    const/4 v0, 0x2

    aget v0, v5, v0

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 67
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->u:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "\\d+.\\d+|\\d+"

    sget v3, Lcom/huawei/health/suggestion/R$style;->strike_pattern_text_result_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->strike_pattern_text_result_n:I

    invoke-static {v1, v2, v6, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->r:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "\\d+.\\d+|\\d+"

    sget v3, Lcom/huawei/health/suggestion/R$style;->strike_pattern_text_result_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->strike_pattern_text_result_n:I

    invoke-static {v1, v2, v7, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->q:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "\\d+.\\d+|\\d+"

    sget v3, Lcom/huawei/health/suggestion/R$style;->strike_pattern_text_result_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->strike_pattern_text_result_n:I

    invoke-static {v1, v2, v8, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->f:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireLevelLongTip()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->g:Lo/egb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->b:Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->acquireAdvice()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->h:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_what_landing_pattern:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->i:Lo/egb;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 77
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->m:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->img_ground_mode:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v9

    .line 78
    if-eqz v9, :cond_3

    .line 79
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    :cond_3
    goto :goto_0

    .line 82
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->img_ground_mode:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 84
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

    .line 29
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;->p:I

    .line 30
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 31
    return-object v1
.end method
