.class public Lo/epj$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lo/epj$a;

.field private b:Landroid/content/Context;

.field private d:Lo/epj$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    .line 47
    iput-object p1, p0, Lo/epj$b;->b:Landroid/content/Context;

    .line 48
    return-void
.end method

.method static synthetic a(Lo/epj$b;)Lo/epj$a;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/epj$b;->a:Lo/epj$a;

    return-object v0
.end method

.method static synthetic d(Lo/epj$b;)Lo/epj$a;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/epj$b;->d:Lo/epj$a;

    return-object v0
.end method


# virtual methods
.method public b()Lo/epj;
    .locals 14

    .line 62
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 63
    new-instance v4, Lo/epj;

    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$style;->CustomDialog:I

    invoke-direct {v4, v0, v1}, Lo/epj;-><init>(Landroid/content/Context;I)V

    .line 65
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->health_sport_target_choice_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 66
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/epj;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    sget v0, Lcom/huawei/ui/homehealth/R$id;->targetTwoWheelPicker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/epk;

    .line 68
    sget v0, Lcom/huawei/ui/homehealth/R$id;->targetpicker_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/egd;

    .line 69
    sget v0, Lcom/huawei/ui/homehealth/R$id;->targetpicker_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/egd;

    .line 71
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_ok:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 77
    iget-object v0, p0, Lo/epj$b;->a:Lo/epj$a;

    if-eqz v0, :cond_0

    .line 79
    new-instance v0, Lo/epj$b$2;

    invoke-direct {v0, p0, v4, v6}, Lo/epj$b$2;-><init>(Lo/epj$b;Lo/epj;Lo/epk;)V

    invoke-virtual {v7, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    :cond_0
    iget-object v0, p0, Lo/epj$b;->d:Lo/epj$a;

    if-eqz v0, :cond_1

    .line 90
    new-instance v0, Lo/epj$b$3;

    invoke-direct {v0, p0, v4, v6}, Lo/epj$b$3;-><init>(Lo/epj$b;Lo/epj;Lo/epk;)V

    invoke-virtual {v8, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    :cond_1
    invoke-virtual {v4}, Lo/epj;->getWindow()Landroid/view/Window;

    move-result-object v9

    .line 99
    const/16 v0, 0x50

    invoke-virtual {v9, v0}, Landroid/view/Window;->setGravity(I)V

    .line 100
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v9, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 101
    invoke-virtual {v9}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v10

    .line 102
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/view/WindowManager;

    .line 103
    invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v12

    .line 104
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 105
    const/4 v13, 0x0

    .line 106
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    const/high16 v1, 0x433b0000    # 187.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v13

    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lo/epj$b;->b:Landroid/content/Context;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v13

    .line 111
    :goto_0
    invoke-virtual {v12}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v13, 0x2

    sub-int/2addr v0, v1

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 112
    invoke-virtual {v9, v10}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 113
    sget v0, Lcom/huawei/ui/homehealth/R$style;->track_dialog_anim:I

    invoke-virtual {v9, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 115
    invoke-virtual {v4}, Lo/epj;->show()V

    .line 116
    return-object v4
.end method

.method public c(Lo/epj$a;)Lo/epj$b;
    .locals 0

    .line 51
    iput-object p1, p0, Lo/epj$b;->a:Lo/epj$a;

    .line 52
    return-object p0
.end method

.method public e(Lo/epj$a;)Lo/epj$b;
    .locals 0

    .line 56
    iput-object p1, p0, Lo/epj$b;->d:Lo/epj$a;

    .line 57
    return-object p0
.end method
