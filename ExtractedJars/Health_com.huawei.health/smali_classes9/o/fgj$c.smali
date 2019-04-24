.class public Lo/fgj$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fgj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/fgj$a;

.field private c:I

.field private d:Lo/fgj$a;

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fgj$c;->a:Landroid/content/Context;

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lo/fgj$c;->e:I

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/fgj$c;->c:I

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgj$c;->f:Z

    .line 35
    iput-object p1, p0, Lo/fgj$c;->a:Landroid/content/Context;

    .line 36
    return-void
.end method

.method static synthetic c(Lo/fgj$c;)Lo/fgj$a;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/fgj$c;->b:Lo/fgj$a;

    return-object v0
.end method

.method static synthetic e(Lo/fgj$c;)Lo/fgj$a;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/fgj$c;->d:Lo/fgj$a;

    return-object v0
.end method


# virtual methods
.method public a(II)Lo/fgj$c;
    .locals 0

    .line 49
    iput p1, p0, Lo/fgj$c;->e:I

    .line 50
    iput p2, p0, Lo/fgj$c;->c:I

    .line 51
    return-object p0
.end method

.method public a()Lo/fgj;
    .locals 15

    .line 60
    iget-object v0, p0, Lo/fgj$c;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 61
    new-instance v5, Lo/fgj;

    iget-object v0, p0, Lo/fgj$c;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$style;->CustomDialog:I

    invoke-direct {v5, v0, v1}, Lo/fgj;-><init>(Landroid/content/Context;I)V

    .line 62
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_inch_height_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 63
    sget v0, Lcom/huawei/ui/main/R$id;->tip_text_view:I

    invoke-static {v6, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    .line 64
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6, v0}, Lo/fgj;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_heightpicker:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/fgl;

    .line 66
    sget v0, Lcom/huawei/ui/main/R$id;->heightpicker_ok:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/Button;

    .line 67
    sget v0, Lcom/huawei/ui/main/R$id;->heightpicker_cancel:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/Button;

    .line 68
    const/16 v0, 0xa

    invoke-virtual {v8, v0}, Lo/fgl;->setFootMode(I)V

    .line 69
    const/16 v0, 0xb

    invoke-virtual {v8, v0}, Lo/fgl;->setInchMode(I)V

    .line 70
    iget v0, p0, Lo/fgj$c;->e:I

    invoke-virtual {v8, v0}, Lo/fgl;->setSelectedFoot(I)V

    .line 71
    iget v0, p0, Lo/fgj$c;->c:I

    invoke-virtual {v8, v0}, Lo/fgl;->setSelectedInch(I)V

    .line 72
    if-eqz v7, :cond_1

    .line 73
    iget-boolean v0, p0, Lo/fgj$c;->f:Z

    if-eqz v0, :cond_0

    .line 74
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 76
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 80
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/fgj$c;->b:Lo/fgj$a;

    if-eqz v0, :cond_2

    .line 81
    new-instance v0, Lo/fgj$c$3;

    invoke-direct {v0, p0, v5, v8}, Lo/fgj$c$3;-><init>(Lo/fgj$c;Lo/fgj;Lo/fgl;)V

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    :cond_2
    iget-object v0, p0, Lo/fgj$c;->d:Lo/fgj$a;

    if-eqz v0, :cond_3

    .line 90
    new-instance v0, Lo/fgj$c$4;

    invoke-direct {v0, p0, v5}, Lo/fgj$c$4;-><init>(Lo/fgj$c;Lo/fgj;)V

    invoke-virtual {v10, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    :cond_3
    invoke-virtual {v5}, Lo/fgj;->getWindow()Landroid/view/Window;

    move-result-object v11

    .line 99
    const/16 v0, 0x50

    invoke-virtual {v11, v0}, Landroid/view/Window;->setGravity(I)V

    .line 100
    invoke-virtual {v11}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v12

    .line 101
    iget-object v0, p0, Lo/fgj$c;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/view/WindowManager;

    .line 102
    const-string v0, "HeightPickerDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init params"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/16 v0, 0xa

    iput v0, v12, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 104
    invoke-interface {v13}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v14

    .line 105
    invoke-virtual {v14}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v12, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 106
    invoke-virtual {v11, v12}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 107
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v11, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 108
    invoke-virtual {v5}, Lo/fgj;->show()V

    .line 109
    return-object v5
.end method

.method public c(Lo/fgj$a;)Lo/fgj$c;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/fgj$c;->d:Lo/fgj$a;

    .line 45
    return-object p0
.end method

.method public c(Z)Lo/fgj$c;
    .locals 0

    .line 55
    iput-boolean p1, p0, Lo/fgj$c;->f:Z

    .line 56
    return-object p0
.end method

.method public d(Lo/fgj$a;)Lo/fgj$c;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/fgj$c;->b:Lo/fgj$a;

    .line 40
    return-object p0
.end method
