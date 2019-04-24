.class public Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final q:[I


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/TextView;

.field private e:Lo/emr;

.field private f:Z

.field private g:Landroid/widget/FrameLayout;

.field private h:Landroid/content/Context;

.field private i:Landroid/content/Intent;

.field private k:Ljava/lang/String;

.field private l:Lo/ewv;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private r:Lo/egd;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x1d
        0x1e
        0x3b
        0x3c
        0x4f
        0x50
        0x63
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->k:Ljava/lang/String;

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->u:Ljava/lang/String;

    .line 53
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->t:Ljava/lang/String;

    return-void
.end method

.method private a(I)I
    .locals 3

    .line 170
    const/4 v2, 0x0

    .line 171
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-gt v0, p1, :cond_0

    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    if-gt p1, v0, :cond_0

    .line 172
    const/4 v2, 0x1

    goto :goto_0

    .line 173
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    if-gt v0, p1, :cond_1

    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x3

    aget v0, v0, v1

    if-gt p1, v0, :cond_1

    .line 174
    const/4 v2, 0x2

    goto :goto_0

    .line 175
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    if-gt v0, p1, :cond_2

    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x5

    aget v0, v0, v1

    if-gt p1, v0, :cond_2

    .line 176
    const/4 v2, 0x3

    goto :goto_0

    .line 177
    :cond_2
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x6

    aget v0, v0, v1

    if-gt v0, p1, :cond_3

    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->q:[I

    const/4 v1, 0x7

    aget v0, v0, v1

    if-gt p1, v0, :cond_3

    .line 178
    const/4 v2, 0x4

    .line 180
    :cond_3
    :goto_0
    return v2
.end method

.method private a()V
    .locals 3

    .line 201
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 202
    const-string v0, "health_wifi_device_userId"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->u:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    const-string v0, "health_wifi_device_productId"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->t:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 205
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->finish()V

    .line 206
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;)Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->f:Z

    return v0
.end method

.method private c()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->e:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->r:Lo/egd;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->a()V

    return-void
.end method

.method private e(I)Ljava/lang/String;
    .locals 3

    .line 185
    const-string v2, ""

    .line 186
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_text_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 188
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_text_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 190
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_text_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 192
    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_text_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 195
    :cond_3
    :goto_0
    return-object v2
.end method

.method private e()V
    .locals 10

    .line 128
    const-string v0, "WifiDevicePressureCalibrateResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->f:Z

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->k:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ewd;->i(I)Ljava/lang/String;

    move-result-object v6

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_grade:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->k:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->a(I)I

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->r:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_calibrate_result_complete:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 146
    goto/16 :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_calibrate_answer_fail_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_result_fail_tips1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 157
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 156
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_result_fail_tips2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 159
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 158
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_result_fail_tips3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 161
    new-instance v9, Landroid/text/SpannableStringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_mgr_not_found_device_tips1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->r:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_again:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 166
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 58
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_wifi_device_pressure_calibrate_result:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->setContentView(I)V

    .line 60
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    .line 61
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->n(Z)V

    .line 62
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->i:Landroid/content/Intent;

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->i:Landroid/content/Intent;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->i:Landroid/content/Intent;

    const-string v1, "health_wifi_device_userId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->u:Ljava/lang/String;

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->i:Landroid/content/Intent;

    const-string v1, "health_wifi_device_productId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->t:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->i:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->f:Z

    .line 67
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->f:Z

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->i:Landroid/content/Intent;

    const-string v1, "mResultHrv"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->k:Ljava/lang/String;

    goto :goto_0

    .line 70
    :cond_0
    const-string v0, "WifiDevicePressureCalibrateResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHavedDatas is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :cond_1
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_wifi_device_result_pressure_calibrate_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->e:Lo/emr;

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_no_time_clock_frame:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->g:Landroid/widget/FrameLayout;

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_result_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->c:Landroid/widget/LinearLayout;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_result_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->n:Landroid/widget/TextView;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_result_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->m:Landroid/widget/TextView;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_result_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->a:Landroid/widget/LinearLayout;

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_result_fail_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->o:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->hw_wifi_device_pressure_calibrate_result_fail_reason:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->p:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->hw_wifi_device_pressure_calibrate_result_level:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->b:Landroid/widget/TextView;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->hw_wifi_device_pressure_calibrate_result_knowledge:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->d:Landroid/widget/TextView;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->hw_wifi_device_pressure_calibrate_result_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->r:Lo/egd;

    .line 89
    new-instance v0, Lo/ewv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->h:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ewv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->l:Lo/ewv;

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->g:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->l:Lo/ewv;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->c()V

    .line 92
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->e()V

    .line 93
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 119
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 120
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultActivity;->finish()V

    .line 121
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
