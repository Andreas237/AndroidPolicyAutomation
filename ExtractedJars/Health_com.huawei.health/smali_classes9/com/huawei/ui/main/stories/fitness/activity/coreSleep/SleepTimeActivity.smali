.class public Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Lo/emr;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private c()V
    .locals 1

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->e:Lo/emr;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_reference:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->b:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_reference_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->a:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->d:Landroid/widget/TextView;

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->c:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_status:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->k:Landroid/widget/TextView;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->i:Landroid/widget/TextView;

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_advice_2002:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->h:Landroid/widget/TextView;

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_mid_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->g:Landroid/widget/TextView;

    .line 91
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_sleep_time_mid_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->m:Landroid/widget/TextView;

    .line 92
    return-void
.end method

.method private d(II)V
    .locals 3

    .line 252
    const/16 v0, 0x51

    if-ne p2, v0, :cond_1

    .line 253
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_late:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 259
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->health_sleep_red_txt_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 262
    :cond_1
    const/16 v0, 0x52

    if-ne p2, v0, :cond_3

    .line 263
    const/4 v0, 0x4

    if-ne v0, p1, :cond_2

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_early:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 266
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 269
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->health_sleep_yellow_txt_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 272
    :cond_3
    const/16 v0, 0x53

    if-ne p2, v0, :cond_4

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->health_sleep_green_txt_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 277
    :cond_4
    return-void
.end method

.method private e(Ljava/lang/String;)I
    .locals 4

    .line 241
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 242
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    mul-int/lit8 v0, v0, 0x3c

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    return v0
.end method

.method private e()V
    .locals 21

    .line 99
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 100
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 101
    const-string v0, "sleepTimeStatus"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 104
    const-string v8, ""

    .line 105
    const-string v9, ""

    .line 106
    const-string v10, ""

    .line 107
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v11

    .line 108
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_2

    .line 110
    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep_regularity:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 111
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v12

    .line 112
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

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 113
    const-string v0, "sleepTime"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 114
    goto/16 :goto_3

    .line 116
    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_start_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 122
    invoke-static/range {p0 .. p0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    const-string v9, "< 00:00"

    goto :goto_0

    .line 125
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "<"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v11, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 127
    :goto_0
    const-string v0, "sleepTimeScore"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 128
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 129
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->e(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_3

    .line 131
    :cond_1
    const-string v10, "--"

    .line 133
    goto/16 :goto_3

    .line 135
    :pswitch_2
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep_regularity:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 136
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 137
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

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 138
    const-string v0, "sleepTime"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 139
    goto :goto_3

    .line 141
    :pswitch_3
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_end_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 142
    const-string v0, "sleepTimeScore"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 143
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 144
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->e(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 146
    :cond_2
    const-string v10, "--"

    .line 148
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, ">"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v11, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "6:0"

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->e(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 149
    goto :goto_3

    .line 151
    :goto_2
    const-string v0, "SleepTimeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->e:Lo/emr;

    invoke-virtual {v0, v8}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 158
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sleep_referece_title_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 159
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v9, v0, v1

    invoke-static {v12, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 160
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    const/4 v0, 0x1

    if-eq v0, v6, :cond_3

    const/4 v0, 0x3

    if-ne v0, v6, :cond_7

    .line 167
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v14

    .line 169
    :try_start_0
    invoke-virtual {v14, v10}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v15

    .line 170
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    invoke-virtual {v0, v1, v15}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v16

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 172
    invoke-static/range {p0 .. p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static/range {p0 .. p0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 173
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 174
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->a:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    goto :goto_4

    .line 176
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->a:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->c:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    if-nez v15, :cond_6

    .line 181
    move-object/from16 v0, p0

    const/16 v1, 0x52

    invoke-direct {v0, v6, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->d(II)V

    .line 183
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->c:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_5

    .line 184
    :catch_0
    move-exception v15

    .line 185
    const-string v0, "SleepTimeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ParseException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_5
    goto :goto_6

    .line 188
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 193
    :goto_6
    move-object/from16 v0, p0

    invoke-direct {v0, v6, v7}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->d(II)V

    .line 196
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_regular_schedule_explain_1:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 197
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v15

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 203
    invoke-static/range {p0 .. p0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 204
    new-instance v16, Ljava/util/Date;

    invoke-direct/range {v16 .. v16}, Ljava/util/Date;-><init>()V

    .line 205
    move-object/from16 v0, v16

    const/16 v1, 0x16

    invoke-virtual {v0, v1}, Ljava/util/Date;->setHours(I)V

    .line 206
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Date;->setMinutes(I)V

    .line 207
    invoke-static/range {p0 .. p0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v17

    .line 208
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    .line 209
    move-object/from16 v0, v16

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/Date;->setHours(I)V

    .line 210
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Date;->setMinutes(I)V

    .line 211
    invoke-static/range {p0 .. p0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v17

    .line 212
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v19

    .line 213
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_core_sleep_advice_irregular_new_id_2002:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v18, v1, v2

    const/4 v2, 0x1

    aput-object v19, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->h:Landroid/widget/TextView;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    goto :goto_7

    .line 216
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->h:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_core_sleep_advice_irregular_id_2002:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 221
    :cond_9
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v16

    .line 222
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->getResources()Landroid/content/res/Resources;

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

    move-result-object v17

    .line 223
    invoke-static/range {p0 .. p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->g:Landroid/widget/TextView;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->m:Landroid/widget/TextView;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    goto :goto_8

    .line 229
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->g:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->m:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    :goto_8
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 71
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_sleep_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->setContentView(I)V

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->c()V

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;->e()V

    .line 75
    return-void
.end method
