.class public Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:I

.field private d:I

.field private e:Landroid/widget/TextView;

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

.field private r:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 22

    .line 123
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, 0x4051800000000000L    # 70.0

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

    .line 125
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sleep_referece_title_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 127
    invoke-static/range {p0 .. p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static/range {p0 .. p0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 130
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 132
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v9

    .line 135
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->c:I

    const/16 v1, 0x14

    if-ge v0, v1, :cond_2

    .line 139
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->b:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 142
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->b:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->c:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->i:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 149
    :goto_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->d:I

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 151
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 152
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 153
    goto :goto_3

    .line 155
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 157
    goto :goto_3

    .line 159
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 160
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->core_sleep_normal_tip_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 161
    goto :goto_3

    .line 163
    :goto_2
    const-string v0, "DeepSleepPartActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no status!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v10

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v11

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v12

    .line 176
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v13

    .line 177
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v14

    .line 178
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v15

    .line 179
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v16

    .line 180
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v17

    .line 182
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->o:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v18

    .line 190
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v19

    .line 191
    invoke-static/range {p0 .. p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    .line 193
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->u:Landroid/widget/TextView;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 195
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->r:Landroid/widget/TextView;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    goto :goto_4

    .line 197
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->u:Landroid/widget/TextView;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->r:Landroid/widget/TextView;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x51
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d()V
    .locals 5

    .line 88
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 89
    if-nez v4, :cond_0

    .line 90
    const-string v0, "DeepSleepPartActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-void

    .line 93
    :cond_0
    const-string v0, "deepSleepPart"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->c:I

    .line 94
    const-string v0, "deepSleepPartStatus"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->d:I

    .line 95
    return-void
.end method

.method public static d(Landroid/content/Context;II)V
    .locals 2

    .line 210
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 211
    const-string v0, "deepSleepPart"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 212
    const-string v0, "deepSleepPartStatus"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 213
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 214
    return-void
.end method

.method private e()V
    .locals 1

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_reference:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->a:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_reference_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->e:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->b:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->i:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_status:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->k:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->h:Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->f:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_little_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->g:Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_little_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->m:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_little_title_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->p:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_little_title_four:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->n:Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_little_title_five:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->o:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deep_sleep_part_little_title_six:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->l:Landroid/widget/TextView;

    .line 114
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deepsleep_part_mid_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->u:Landroid/widget/TextView;

    .line 115
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_deepsleep_part_mid_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->r:Landroid/widget/TextView;

    .line 116
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 77
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 78
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_deepsleep_part:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->setContentView(I)V

    .line 79
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->d()V

    .line 80
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->e()V

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DeepSleepPartActivity;->c()V

    .line 82
    return-void
.end method
