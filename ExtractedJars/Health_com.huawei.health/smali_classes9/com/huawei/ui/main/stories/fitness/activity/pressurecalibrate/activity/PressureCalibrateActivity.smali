.class public Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/egb;

.field private b:Z

.field private c:Landroid/content/Intent;

.field private d:Landroid/content/Context;

.field private e:Z

.field private g:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;Ljava/lang/Class;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b(Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c()V

    return-void
.end method

.method private b(Ljava/lang/Class;)V
    .locals 4

    .line 99
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->e:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    const-string v1, "press_auto_monitor"

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 102
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "go to Question have data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->e:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->startActivity(Landroid/content/Intent;)V

    .line 104
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->finish()V

    .line 105
    return-void
.end method

.method private c()V
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b:Z

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->finish()V

    .line 109
    return-void

    .line 112
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->e:Z

    if-eqz v0, :cond_1

    .line 113
    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b(Ljava/lang/Class;)V

    goto :goto_0

    .line 115
    :cond_1
    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b(Ljava/lang/Class;)V

    .line 117
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->finish()V

    .line 118
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 13

    .line 45
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_pressure_calibrate_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->setContentView(I)V

    .line 47
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->d:Landroid/content/Context;

    .line 48
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->n(Z)V

    .line 49
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->e:Z

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c:Landroid/content/Intent;

    const-string v1, "press_auto_monitor"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b:Z

    .line 53
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->e:Z

    invoke-virtual {v0, v1}, Lo/ewd;->a(Z)V

    .line 54
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->b:Z

    invoke-virtual {v0, v1}, Lo/ewd;->o(Z)V

    .line 56
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/emr;

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->g:Landroid/widget/ImageView;

    .line 58
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_start_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/egd;

    .line 60
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;)V

    invoke-virtual {v8, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 69
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;)V

    invoke-virtual {v7, v0}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_notify_text_click:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->a:Lo/egb;

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_calibrate_notify_textcontent:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x404e000000000000L    # 60.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->a:Lo/egb;

    invoke-virtual {v0, v9}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->g:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->g:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_pressure_calibrate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_pressure_bracelet_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 82
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v10

    .line 83
    invoke-interface {v10}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v11

    .line 84
    invoke-virtual {v8}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    .line 85
    div-int/lit8 v0, v11, 0x2

    iput v0, v12, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 86
    invoke-virtual {v8, v12}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    :cond_1
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 91
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 92
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;->c()V

    .line 93
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
