.class public Lo/egn;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# instance fields
.field a:Landroid/content/Context;

.field private b:Lhuawei/widget/HwProgressBar;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/egn;->a:Landroid/content/Context;

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/egn;->a:Landroid/content/Context;

    .line 42
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/egn;
    .locals 9

    .line 54
    new-instance v3, Lo/egn;

    invoke-direct {v3, p0}, Lo/egn;-><init>(Landroid/content/Context;)V

    .line 55
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 56
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_loading21:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 57
    sget v0, Lcom/huawei/ui/commonui/R$id;->BasicInfo_check_textView:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/egn;->e:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/ui/commonui/R$id;->BasicInfo_check_img:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, v3, Lo/egn;->b:Lhuawei/widget/HwProgressBar;

    .line 59
    iget-object v0, v3, Lo/egn;->b:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 60
    iget-object v0, v3, Lo/egn;->b:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 61
    invoke-virtual {v3, v5}, Lo/egn;->setView(Landroid/view/View;)V

    .line 62
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 63
    invoke-virtual {v3}, Lo/egn;->getWindow()Landroid/view/Window;

    move-result-object v7

    .line 64
    invoke-virtual {v7}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v8

    .line 65
    const/16 v0, 0x50

    invoke-virtual {v7, v0}, Landroid/view/Window;->setGravity(I)V

    .line 66
    iput v6, v8, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 67
    invoke-virtual {v7, v8}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 68
    return-object v3
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 86
    invoke-virtual {p0}, Lo/egn;->show()V

    .line 87
    return-void
.end method

.method public dismiss()V
    .locals 4

    .line 91
    const-string v0, "CommonDialog21"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-super {p0}, Landroid/app/AlertDialog;->dismiss()V

    .line 93
    iget-object v0, p0, Lo/egn;->b:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egn;->b:Lhuawei/widget/HwProgressBar;

    .line 96
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    .line 72
    iget-object v0, p0, Lo/egn;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 73
    return-void

    .line 77
    :cond_0
    iget-object v0, p0, Lo/egn;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_dialog_content_text_color_emui9:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    .line 78
    iget-object v0, p0, Lo/egn;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$dimen;->default_text_font_size_large2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    .line 79
    iget-object v0, p0, Lo/egn;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    iget-object v0, p0, Lo/egn;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 82
    iget-object v0, p0, Lo/egn;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 46
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 47
    return-void
.end method
