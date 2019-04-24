.class public Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/LinearLayout;

.field private b:Landroid/content/Context;

.field c:Landroid/support/v4/content/LocalBroadcastManager;

.field d:Lo/emr;

.field protected e:Lo/ewe;

.field private f:Z

.field private g:Landroid/content/Intent;

.field private h:Lo/ewg;

.field private i:Z

.field private k:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Landroid/content/BroadcastReceiver;

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 49
    const-string v0, "unknown"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->k:Ljava/lang/String;

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->o:Ljava/lang/String;

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->m:Ljava/lang/String;

    .line 134
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->n:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a()V
    .locals 8

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_calibrate_dialog_notify:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_calibrate_dialog_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_dialog_button_stop:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 166
    new-instance v7, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 167
    invoke-virtual {v7, v2}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 168
    invoke-virtual {v0, v3}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$7;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    .line 169
    invoke-virtual {v0, v5, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    .line 181
    invoke-virtual {v0, v4, v1}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 186
    invoke-virtual {v7}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 187
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 188
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 189
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;Ljava/lang/Class;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->c(Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->i:Z

    return v0
.end method

.method private c(Ljava/lang/Class;)V
    .locals 3

    .line 191
    const-string v0, "wifi_device"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->t()V

    .line 193
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->q()V

    .line 194
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->finish()V

    .line 195
    return-void

    .line 197
    :cond_0
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->x()V

    .line 198
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->f:Z

    if-eqz v0, :cond_1

    .line 199
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->t()V

    .line 200
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->q()V

    .line 201
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->finish()V

    .line 202
    return-void

    .line 204
    :cond_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->i:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->startActivity(Landroid/content/Intent;)V

    .line 207
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->t()V

    .line 208
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->q()V

    .line 209
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->finish()V

    .line 210
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->a()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 5

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    invoke-virtual {v0}, Lo/ewg;->getCurrentItem()I

    move-result v4

    .line 145
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "customViewPager position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    add-int/lit8 v1, v4, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ewg;->setCurrentItem(IZ)V

    .line 147
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewn;->g(Z)V

    .line 148
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 58
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_pressure_calibrate_question:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->setContentView(I)V

    .line 60
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    .line 61
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->l()V

    .line 62
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->i:Z

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    const-string v1, "health_device_type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->k:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    const-string v1, "health_wifi_device_userId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->o:Ljava/lang/String;

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    const-string v1, "health_wifi_device_productId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->m:Ljava/lang/String;

    .line 68
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ewn;->c(Ljava/lang/String;)V

    .line 69
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ewn;->d(Ljava/lang/String;)V

    .line 70
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ewn;->a(Ljava/lang/String;)V

    .line 71
    const-string v0, "wifi_device"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->i:Z

    invoke-virtual {v0, v1}, Lo/ewn;->c(Z)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->g:Landroid/content/Intent;

    const-string v1, "press_auto_monitor"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->f:Z

    .line 74
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->f:Z

    invoke-virtual {v0, v1}, Lo/ewn;->d(Z)V

    .line 77
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->d:Lo/emr;

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->d:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_viewpager_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->a:Landroid/widget/LinearLayout;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_question_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ewg;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    .line 89
    const-string v0, "wifi_device"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 90
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ewd;->b(I)V

    .line 91
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x4

    const/16 v2, 0x3c

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Lo/ewd;->e(III)V

    .line 95
    :cond_1
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ewn;->c(J)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewg;->setCurrentItem(I)V

    .line 98
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v5, v0, :cond_2

    .line 100
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v5}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;-><init>(Landroid/content/Context;I)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 102
    :cond_2
    new-instance v0, Lo/ewe;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Lo/ewe;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->e:Lo/ewe;

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->e:Lo/ewe;

    invoke-virtual {v0, v1}, Lo/ewg;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    invoke-virtual {v0, v1}, Lo/ewg;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->h:Lo/ewg;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    invoke-virtual {v0, v1}, Lo/ewg;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 126
    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 127
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;

    invoke-virtual {v0, v1}, Lo/ewd;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    .line 129
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 130
    const-string v0, "com.huawei.ui.pressure.question.next"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v6}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 132
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 152
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->x()V

    .line 154
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->t()V

    .line 156
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->finish()V

    .line 157
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 158
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 214
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 215
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureCalibrateQuestionActivity;->a()V

    .line 218
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 220
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
