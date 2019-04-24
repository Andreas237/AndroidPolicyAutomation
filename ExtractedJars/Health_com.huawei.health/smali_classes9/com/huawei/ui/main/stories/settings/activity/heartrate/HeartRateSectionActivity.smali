.class public Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lo/emr;

.field private d:Lo/elk;

.field private e:Lo/elk;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:[Ljava/lang/String;

.field private i:[Ljava/lang/String;

.field private k:I

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:I

.field private o:I

.field private p:Landroid/widget/NumberPicker$OnValueChangeListener;

.field private r:Landroid/widget/NumberPicker$OnValueChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 21
    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g:Ljava/lang/String;

    .line 34
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$1;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->p:Landroid/widget/NumberPicker$OnValueChangeListener;

    .line 49
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$3;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->r:Landroid/widget/NumberPicker$OnValueChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 8

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 234
    iget v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    .line 235
    if-nez v5, :cond_0

    .line 236
    iget v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    .line 239
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sub-int v6, v0, v5

    .line 240
    if-le v4, v6, :cond_1

    .line 242
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 245
    goto :goto_0

    .line 243
    :catch_0
    move-exception v7

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :cond_1
    :goto_0
    invoke-direct {p0, v4, v6}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c(II)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setMinValue(I)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/elk;->setMaxValue(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 256
    const/4 v0, -0x1

    if-ne v7, v0, :cond_2

    .line 258
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 261
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetLowerWheelView start  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " end = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " index = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    const/4 v0, -0x1

    if-eq v7, v0, :cond_3

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    invoke-virtual {v0, v7}, Lo/elk;->setValue(I)V

    .line 268
    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)I
    .locals 1

    .line 20
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->o:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 20
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 271
    const-string v2, ""

    .line 272
    if-nez p1, :cond_0

    .line 273
    return-object v2

    .line 274
    :cond_0
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 275
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 277
    :cond_1
    move-object v2, p1

    .line 279
    :goto_0
    return-object v2
.end method

.method private b()V
    .locals 3

    .line 283
    sget v0, Lcom/huawei/ui/main/R$id;->rateZoneLower:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->l:Landroid/widget/TextView;

    .line 284
    sget v0, Lcom/huawei/ui/main/R$id;->rateZoneUpper:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->m:Landroid/widget/TextView;

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_upper_text:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_lower_text:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    sget v0, Lcom/huawei/ui/main/R$id;->heart_rate_section_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c:Lo/emr;

    .line 288
    sget v0, Lcom/huawei/ui/main/R$id;->wheelview_upper:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elk;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    .line 289
    sget v0, Lcom/huawei/ui/main/R$id;->wheelview_lower:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elk;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    return-void
.end method

.method private c()V
    .locals 13

    .line 76
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 83
    const-string v0, "upperValue"

    const/16 v1, 0xc8

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 84
    const-string v0, "lowerValue"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 86
    const-string v0, "upperSelected"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 87
    const-string v0, "lowerSelected"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    .line 89
    const-string v0, "intent_extra_span_value"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    .line 90
    const-string v0, "intent_extra_upper_span_value"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    .line 93
    const-string v0, "intent_extra_default_title"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 95
    const-string v0, "intent_extra_is_enable_upper_change"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->o:I

    .line 96
    const-string v0, "intent_extra_use_upper_span"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->n:I

    .line 100
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 101
    const-string v0, ""

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz v9, :cond_5

    .line 102
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_maximum_threshold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_heartrate_extreme_interval:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto/16 :goto_0

    .line 104
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_anaerobic_threshold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_heartrate_Anaerobic_interval:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_aerobic_threshold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_heartrate_Aerobic_interval:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_fatburn_threshold_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 109
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_heartrate_fatburning_interval:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_warmup_threshold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 111
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_heartrate_warmup_interval:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 114
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c:Lo/emr;

    invoke-virtual {v0, v10}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====upperValue"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "lowerValue"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "upperSelected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "lowerSelected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "====titleRes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "====spanValue="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "====enable_upper:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "upper_spanValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==use_upper_span"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-direct {p0, v6, v7, v8}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(III)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setMinValue(I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/elk;->setMaxValue(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setWrapSelectorWheel(Z)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->p:Landroid/widget/NumberPicker$OnValueChangeListener;

    invoke-virtual {v0, v1}, Lo/elk;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    .line 130
    invoke-direct {p0, v5, v8, v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e(III)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setMinValue(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/elk;->setMaxValue(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setWrapSelectorWheel(Z)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->r:Landroid/widget/NumberPicker$OnValueChangeListener;

    invoke-virtual {v0, v1}, Lo/elk;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    .line 138
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v11

    .line 139
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v12

    .line 141
    const/4 v0, -0x1

    if-eq v11, v0, :cond_6

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    invoke-virtual {v0, v11}, Lo/elk;->setValue(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    aget-object v0, v0, v11

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a:Ljava/lang/String;

    .line 145
    :cond_6
    const/4 v0, -0x1

    if-eq v12, v0, :cond_7

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d:Lo/elk;

    invoke-virtual {v0, v12}, Lo/elk;->setValue(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    aget-object v0, v0, v12

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g:Ljava/lang/String;

    .line 149
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upperPos = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " lowerPos = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d()V

    return-void
.end method

.method private c(II)[Ljava/lang/String;
    .locals 9

    .line 317
    if-le p1, p2, :cond_0

    .line 318
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0

    .line 321
    :cond_0
    sub-int v0, p2, p1

    add-int/lit8 v0, v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    .line 322
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 323
    move v8, p1

    :goto_0
    if-gt v8, p2, :cond_1

    .line 324
    sub-int v0, v8, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v2, v8

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v0

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u533a\u95f4\u6570\u7ec4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-int v3, v8, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-int v3, v8, p1

    aget-object v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 327
    :cond_1
    return-object v6
.end method

.method private d(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 4

    .line 336
    const/4 v1, -0x1

    .line 337
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 338
    :cond_0
    return v1

    .line 340
    :cond_1
    move-object v2, p1

    .line 341
    const/4 v3, 0x0

    :goto_0
    array-length v0, p2

    if-ge v3, v0, :cond_3

    .line 342
    aget-object v0, p2, v3

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 343
    move v1, v3

    .line 344
    goto :goto_1

    .line 341
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 347
    :cond_3
    :goto_1
    return v1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 8

    .line 202
    iget v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    .line 203
    if-nez v4, :cond_0

    .line 204
    iget v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    .line 206
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int v5, v0, v4

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 208
    if-le v5, v6, :cond_1

    .line 209
    move v5, v6

    .line 212
    :cond_1
    invoke-direct {p0, v5, v6}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c(II)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setMinValue(I)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/elk;->setMaxValue(I)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 219
    const/4 v0, -0x1

    if-ne v7, v0, :cond_2

    .line 221
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->d(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 224
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetUpperWheelView start  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " end = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " index = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    const/4 v0, -0x1

    if-eq v7, v0, :cond_3

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->e:Lo/elk;

    invoke-virtual {v0, v7}, Lo/elk;->setValue(I)V

    .line 230
    :cond_3
    return-void
.end method

.method private d(III)V
    .locals 6

    .line 153
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    add-int v4, p1, v0

    .line 154
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    sub-int v5, p2, v0

    .line 155
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 156
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    sub-int v5, p2, v0

    .line 159
    :cond_0
    if-ge v5, p3, :cond_1

    .line 160
    move v5, p3

    .line 163
    :cond_1
    if-le v4, p3, :cond_2

    .line 164
    move v4, p3

    .line 167
    :cond_2
    if-lt v4, v5, :cond_3

    .line 168
    move v4, p3

    .line 169
    move v5, p3

    .line 172
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====lowValue"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "upper_spanValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c(II)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    .line 175
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i:[Ljava/lang/String;

    return-object v0
.end method

.method private e(III)V
    .locals 6

    .line 178
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    add-int v4, p2, v0

    .line 179
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->k:I

    sub-int v5, p1, v0

    .line 181
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 182
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->f:I

    add-int v4, p2, v0

    .line 185
    :cond_0
    if-ge v5, p3, :cond_1

    .line 186
    move v5, p3

    .line 188
    :cond_1
    if-le v4, p3, :cond_2

    .line 189
    move v4, p3

    .line 191
    :cond_2
    if-ge v4, v5, :cond_3

    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 192
    :cond_3
    move v4, p3

    .line 193
    move v5, p3

    .line 196
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====upperValue"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "upper_spanValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c(II)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    .line 198
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)[Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->h:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 67
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 68
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_heart_rate_section:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->setContentView(I)V

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b()V

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->c()V

    .line 72
    return-void
.end method
