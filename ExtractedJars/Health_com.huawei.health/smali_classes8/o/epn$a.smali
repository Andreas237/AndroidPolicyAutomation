.class public Lo/epn$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lo/epn$d;

.field private c:Lo/epn$d;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    .line 57
    iput-object p1, p0, Lo/epn$a;->d:Landroid/content/Context;

    .line 58
    return-void
.end method

.method static synthetic b(Lo/epn$a;)Lo/epn$d;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/epn$a;->a:Lo/epn$d;

    return-object v0
.end method

.method static synthetic c(Lo/epn$a;)Lo/epn$d;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/epn$a;->c:Lo/epn$d;

    return-object v0
.end method


# virtual methods
.method public b(Lo/epn$d;)Lo/epn$a;
    .locals 0

    .line 61
    iput-object p1, p0, Lo/epn$a;->c:Lo/epn$d;

    .line 62
    return-object p0
.end method

.method public b()Lo/epn;
    .locals 13

    .line 71
    iget-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 72
    new-instance v4, Lo/epn;

    iget-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$style;->CustomDialog:I

    invoke-direct {v4, v0, v1}, Lo/epn;-><init>(Landroid/content/Context;I)V

    .line 73
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->health_track_voice__interval_setting_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 74
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/epn;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_voice_interval_setting_view:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eps;

    .line 76
    sget v0, Lcom/huawei/ui/homehealth/R$id;->targetpicker_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/egd;

    .line 77
    sget v0, Lcom/huawei/ui/homehealth/R$id;->targetpicker_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/egd;

    .line 79
    iget-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_ok:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 82
    invoke-static {v4, v6}, Lo/epn;->a(Lo/epn;Lo/eps;)Lo/eps;

    .line 84
    iget-object v0, p0, Lo/epn$a;->c:Lo/epn$d;

    if-eqz v0, :cond_0

    .line 85
    new-instance v0, Lo/epn$a$2;

    invoke-direct {v0, p0, v4, v6}, Lo/epn$a$2;-><init>(Lo/epn$a;Lo/epn;Lo/eps;)V

    invoke-virtual {v7, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    :cond_0
    iget-object v0, p0, Lo/epn$a;->a:Lo/epn$d;

    if-eqz v0, :cond_1

    .line 96
    new-instance v0, Lo/epn$a$1;

    invoke-direct {v0, p0, v4}, Lo/epn$a$1;-><init>(Lo/epn$a;Lo/epn;)V

    invoke-virtual {v8, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    :cond_1
    invoke-virtual {v4}, Lo/epn;->getWindow()Landroid/view/Window;

    move-result-object v9

    .line 107
    const/16 v0, 0x50

    invoke-virtual {v9, v0}, Landroid/view/Window;->setGravity(I)V

    .line 108
    invoke-virtual {v9}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v10

    .line 109
    iget-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/view/WindowManager;

    .line 110
    invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v12

    .line 111
    iget-object v0, p0, Lo/epn$a;->d:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 112
    invoke-virtual {v12}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 113
    invoke-virtual {v9, v10}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 115
    sget v0, Lcom/huawei/ui/homehealth/R$style;->track_dialog_anim:I

    invoke-virtual {v9, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 118
    return-object v4
.end method

.method public e(Lo/epn$d;)Lo/epn$a;
    .locals 0

    .line 66
    iput-object p1, p0, Lo/epn$a;->a:Lo/epn$d;

    .line 67
    return-object p0
.end method
