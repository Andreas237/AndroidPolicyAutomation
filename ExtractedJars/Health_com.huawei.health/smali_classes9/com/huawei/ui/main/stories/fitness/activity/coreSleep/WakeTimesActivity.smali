.class public Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Ljava/lang/String;

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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 24

    .line 121
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sleep_referece_title_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 123
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 122
    const/4 v4, 0x2

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 124
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v9, v0, v1

    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->c:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->e:Ljava/lang/String;

    move-object/from16 v2, p0

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lo/dbf;->d(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->c(I)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 131
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    goto :goto_1

    .line 135
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 136
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    goto :goto_1

    .line 139
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 140
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->core_sleep_normal_tip_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 141
    goto :goto_1

    .line 143
    :goto_0
    const-string v0, "WakeTimesActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no status!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_explain_1:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 149
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_explain_2:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 155
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_content_1:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v13, v2, v3

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_content_3:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 160
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_content_4:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 161
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_content_5:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 162
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_content_6:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 163
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wake_times_content_7:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->g:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->m:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->n:Landroid/widget/TextView;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->o:Landroid/widget/TextView;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v20

    .line 172
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v21

    .line 173
    invoke-static/range {p0 .. p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->p:Landroid/widget/TextView;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    goto :goto_2

    .line 179
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->p:Landroid/widget/TextView;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x47
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b()V
    .locals 5

    .line 88
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 89
    if-nez v4, :cond_0

    .line 90
    const-string v0, "WakeTimesActivity"

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
    const-string v0, "wake_times"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->e:Ljava/lang/String;

    .line 94
    const-string v0, "wake_times_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->a:I

    .line 95
    return-void
.end method

.method private c(I)Landroid/text/SpannableStringBuilder;
    .locals 10

    .line 205
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 206
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 205
    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 207
    new-instance v8, Landroid/text/SpannableStringBuilder;

    invoke-direct {v8, v7}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 208
    int-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 209
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xd

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v8}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 212
    :cond_0
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xd

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 213
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0x18

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 214
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 216
    :goto_0
    return-object v8
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .line 192
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 193
    const-string v0, "wake_times"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    const-string v0, "wake_times_status"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 195
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 196
    return-void
.end method

.method private e()V
    .locals 1

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_times_reference:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->d:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->c:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_status:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->k:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->h:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_content_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->f:Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_little_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->i:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_little_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->g:Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_little_title_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->m:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_little_title_four:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->n:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_little_title_five:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->o:Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_mid_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->p:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_wake_mid_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->l:Landroid/widget/TextView;

    .line 114
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 77
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 78
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_waketimes:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->setContentView(I)V

    .line 79
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->b()V

    .line 80
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->e()V

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/WakeTimesActivity;->a()V

    .line 82
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 221
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 222
    return-void
.end method
