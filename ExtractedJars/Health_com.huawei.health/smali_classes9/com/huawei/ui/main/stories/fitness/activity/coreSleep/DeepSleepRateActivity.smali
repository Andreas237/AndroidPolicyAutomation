.class public Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:I

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:I

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 1

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_reference:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->c:Landroid/widget/TextView;

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->a:Landroid/widget/TextView;

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_status:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->g:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->f:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_little_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->k:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_little_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->i:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_little_title_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->h:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_little_title_four:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->p:Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_little_title_five:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->n:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_little_title_six:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->m:Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deepsleep_rate_mid_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->o:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deepsleep_rate_mid_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->l:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deepsleep_rate_mid_title_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->t:Landroid/widget/TextView;

    .line 112
    return-void
.end method

.method private d()V
    .locals 5

    .line 85
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 86
    if-nez v4, :cond_0

    .line 87
    const-string v0, "DeepSleepRateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void

    .line 90
    :cond_0
    const-string v0, "deepsleeprate"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->e:I

    .line 91
    const-string v0, "deepsleepstatus"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->b:I

    .line 92
    return-void
.end method

.method private e()V
    .locals 23

    .line 119
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 121
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sleep_referece_title_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 122
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->a:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->e:I

    int-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 129
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    goto :goto_1

    .line 133
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 135
    goto :goto_1

    .line 137
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->core_sleep_normal_tip_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    goto :goto_1

    .line 141
    :goto_0
    const-string v0, "DeepSleepRateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no status!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    :goto_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->e:I

    if-nez v0, :cond_0

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 148
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_deep_sleep_rate_explain_1:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_deep_sleep_rate_explain_2:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 152
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_light_sleep_rate_content_3:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 156
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_light_sleep_rate_content_4:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 157
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_light_sleep_rate_content_5:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 158
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_light_sleep_rate_content_6:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 159
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_light_sleep_rate_content_7:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 160
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_light_sleep_rate_content_8:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->m:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_reference_14:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 170
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_reference_14:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 171
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_reference_14:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    .line 172
    invoke-static/range {p0 .. p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    .line 174
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->o:Landroid/widget/TextView;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->t:Landroid/widget/TextView;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    goto :goto_2

    .line 180
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->o:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->t:Landroid/widget/TextView;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x47
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static e(Landroid/content/Context;II)V
    .locals 2

    .line 194
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    const-string v0, "deepsleeprate"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 196
    const-string v0, "deepsleepstatus"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 197
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 198
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 74
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 75
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_deepsleeprate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->setContentView(I)V

    .line 76
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->d()V

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->c()V

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepRateActivity;->e()V

    .line 79
    return-void
.end method
