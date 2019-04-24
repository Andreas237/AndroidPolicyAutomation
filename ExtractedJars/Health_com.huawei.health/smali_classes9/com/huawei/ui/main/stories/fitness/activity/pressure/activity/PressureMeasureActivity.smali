.class public Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Intent;

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Lo/egd;

.field private e:Lo/emr;

.field private g:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->e()V

    return-void
.end method

.method private c()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d:Lo/egd;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->e:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    return-void
.end method

.method private d(Ljava/lang/Class;)V
    .locals 3

    .line 82
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->a:Landroid/content/Intent;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->a:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->a:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->startActivity(Landroid/content/Intent;)V

    .line 85
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->finish()V

    .line 86
    return-void
.end method

.method private e()V
    .locals 4

    .line 88
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c:Z

    if-eqz v0, :cond_0

    .line 89
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TO PressureMeasureDetailActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d(Ljava/lang/Class;)V

    goto :goto_0

    .line 92
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TO NoDataActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d(Ljava/lang/Class;)V

    .line 95
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;Ljava/lang/Class;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 38
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_pressure_measure_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->setContentView(I)V

    .line 40
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->g(Z)V

    .line 41
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->a:Landroid/content/Intent;

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->a:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->a:Landroid/content/Intent;

    const-string v1, "pressure_is_have_datas"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c:Z

    .line 44
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c:Z

    invoke-virtual {v0, v1}, Lo/ewd;->a(Z)V

    .line 45
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHaveDatas == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    :cond_0
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->b:Landroid/content/Context;

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_measure_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->e:Lo/emr;

    .line 49
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_measure_start_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d:Lo/egd;

    .line 50
    sget v0, Lcom/huawei/ui/main/R$id;->hw_pressure_measure_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->g:Landroid/widget/ImageView;

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->g:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->g:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_pressure_calibrate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_pressure_bracelet_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 55
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v4

    .line 56
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v5

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 58
    div-int/lit8 v0, v5, 0x2

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->d:Lo/egd;

    invoke-virtual {v0, v6}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c()V

    .line 62
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->finish()V

    .line 109
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 110
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 99
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 100
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->e()V

    .line 101
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
