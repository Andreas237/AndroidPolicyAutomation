.class public Lo/fey$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/fey$b;

.field private c:I

.field private d:I

.field private e:Lo/fey$b;

.field private h:I

.field private i:Z

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fey$c;->c:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/fey$c;->d:I

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fey$c;->i:Z

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/fey$c;->h:I

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fey$c;->k:Ljava/lang/String;

    .line 53
    iput-object p1, p0, Lo/fey$c;->a:Landroid/content/Context;

    .line 54
    return-void
.end method

.method static synthetic b(Lo/fey$c;)Lo/fey$b;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fey$c;->b:Lo/fey$b;

    return-object v0
.end method

.method static synthetic e(Lo/fey$c;)Lo/fey$b;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fey$c;->e:Lo/fey$b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/fey$c;
    .locals 0

    .line 75
    iput-object p1, p0, Lo/fey$c;->k:Ljava/lang/String;

    .line 76
    return-object p0
.end method

.method public b()Lo/fey;
    .locals 15

    .line 80
    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 81
    new-instance v4, Lo/fey;

    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$style;->CustomDialog:I

    invoke-direct {v4, v0, v1}, Lo/fey;-><init>(Landroid/content/Context;I)V

    .line 82
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_dialog_timepicker:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 83
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/fey;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_timepicker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fez;

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->datepicker_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Button;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->datepicker_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    .line 87
    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-boolean v0, p0, Lo/fey$c;->i:Z

    if-eqz v0, :cond_0

    .line 90
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lo/fez;->setTimeMode(I)V

    .line 91
    iget v0, p0, Lo/fey$c;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 92
    iget v0, p0, Lo/fey$c;->c:I

    add-int/lit8 v0, v0, 0xc

    iput v0, p0, Lo/fey$c;->c:I

    goto :goto_0

    .line 95
    :cond_0
    const/4 v0, 0x6

    invoke-virtual {v6, v0}, Lo/fez;->setTimeMode(I)V

    .line 97
    :cond_1
    :goto_0
    iget v0, p0, Lo/fey$c;->c:I

    invoke-virtual {v6, v0}, Lo/fez;->setSelectedHour(I)V

    .line 98
    iget v0, p0, Lo/fey$c;->d:I

    invoke-virtual {v6, v0}, Lo/fez;->setSelectedMinute(I)V

    .line 99
    iget v0, p0, Lo/fey$c;->h:I

    invoke-virtual {v6, v0}, Lo/fez;->setSelectedApm(I)V

    .line 101
    iget-object v0, p0, Lo/fey$c;->e:Lo/fey$b;

    if-eqz v0, :cond_2

    .line 102
    new-instance v0, Lo/fey$c$2;

    invoke-direct {v0, p0, v4, v6}, Lo/fey$c$2;-><init>(Lo/fey$c;Lo/fey;Lo/fez;)V

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    :cond_2
    iget-object v0, p0, Lo/fey$c;->b:Lo/fey$b;

    if-eqz v0, :cond_3

    .line 111
    new-instance v0, Lo/fey$c$5;

    invoke-direct {v0, p0, v4}, Lo/fey$c$5;-><init>(Lo/fey$c;Lo/fey;)V

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    :cond_3
    iget-object v0, p0, Lo/fey$c;->k:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fey$c;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 121
    sget v0, Lcom/huawei/ui/main/R$id;->layout_health_dialog_timepicker_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 122
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 123
    sget v0, Lcom/huawei/ui/main/R$id;->text_health_dialog_timepicker_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 124
    iget-object v0, p0, Lo/fey$c;->k:Ljava/lang/String;

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    :cond_4
    invoke-virtual {v4}, Lo/fey;->getWindow()Landroid/view/Window;

    move-result-object v9

    .line 128
    const/16 v0, 0x50

    invoke-virtual {v9, v0}, Landroid/view/Window;->setGravity(I)V

    .line 129
    invoke-virtual {v9}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v10

    .line 130
    const v0, 0x3e4ccccd    # 0.2f

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 131
    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/view/WindowManager;

    .line 132
    invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v12

    .line 133
    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/fey;->e(Landroid/content/Context;F)I

    move-result v13

    .line 134
    iget-object v0, p0, Lo/fey$c;->a:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/fey;->e(Landroid/content/Context;F)I

    move-result v14

    .line 135
    iput v14, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 136
    invoke-virtual {v12}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v13, 0x2

    sub-int/2addr v0, v1

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 137
    invoke-virtual {v9, v10}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 138
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v9, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 139
    invoke-virtual {v4}, Lo/fey;->show()V

    .line 140
    return-object v4
.end method

.method public c(Lo/fey$b;)Lo/fey$c;
    .locals 0

    .line 57
    iput-object p1, p0, Lo/fey$c;->e:Lo/fey$b;

    .line 58
    return-object p0
.end method

.method public d(IIZI)Lo/fey$c;
    .locals 0

    .line 67
    iput p1, p0, Lo/fey$c;->c:I

    .line 68
    iput p2, p0, Lo/fey$c;->d:I

    .line 69
    iput-boolean p3, p0, Lo/fey$c;->i:Z

    .line 70
    iput p4, p0, Lo/fey$c;->h:I

    .line 71
    return-object p0
.end method

.method public d(Lo/fey$b;)Lo/fey$c;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fey$c;->b:Lo/fey$b;

    .line 63
    return-object p0
.end method
