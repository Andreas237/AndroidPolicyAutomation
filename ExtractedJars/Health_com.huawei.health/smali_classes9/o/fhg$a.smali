.class public Lo/fhg$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fhg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Landroid/os/Handler;

.field private d:[Ljava/lang/String;

.field private e:Lo/elk;

.field private f:Landroid/widget/TextView;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fhg$a;->a:Landroid/content/Context;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fhg$a;->c:Landroid/os/Handler;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fhg$a;->d:[Ljava/lang/String;

    .line 51
    iput-object p1, p0, Lo/fhg$a;->a:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lo/fhg$a;->c:Landroid/os/Handler;

    .line 53
    iput p3, p0, Lo/fhg$a;->b:I

    .line 54
    return-void
.end method

.method static synthetic a(Lo/fhg$a;)Lo/elk;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    return-object v0
.end method

.method private b([Ljava/lang/String;)V
    .locals 5

    .line 112
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/fhg$a;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 113
    const/4 v4, 0x0

    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/fhg$a;->d:[Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v2, p1, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/fhg$a;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    .line 113
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 117
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/fhg$a;)Landroid/os/Handler;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fhg$a;->c:Landroid/os/Handler;

    return-object v0
.end method

.method private e(I[Ljava/lang/String;)I
    .locals 4

    .line 120
    const/4 v2, 0x2

    .line 121
    if-nez p2, :cond_0

    .line 122
    return v2

    .line 124
    :cond_0
    array-length v0, p2

    div-int/lit8 v2, v0, 0x2

    .line 125
    const/4 v3, 0x0

    :goto_0
    array-length v0, p2

    if-ge v3, v0, :cond_2

    .line 126
    aget-object v0, p2, v3

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 127
    return v3

    .line 125
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 130
    :cond_2
    return v2
.end method

.method static synthetic e(Lo/fhg$a;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/fhg$a;->b:I

    return v0
.end method


# virtual methods
.method public c([Ljava/lang/String;Ljava/lang/Integer;)Lo/fhg;
    .locals 13

    .line 58
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 59
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_1
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/fhg$a;->d:[Ljava/lang/String;

    .line 62
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/fhg$a;->k:I

    .line 63
    iget-object v0, p0, Lo/fhg$a;->d:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/fhg$a;->b([Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lo/fhg$a;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 65
    new-instance v4, Lo/fhg;

    iget-object v0, p0, Lo/fhg$a;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$style;->heart_rate_dialog:I

    invoke-direct {v4, v0, v1}, Lo/fhg;-><init>(Landroid/content/Context;I)V

    .line 66
    sget v0, Lcom/huawei/ui/main/R$layout;->dialog_heart_rate_zone_setting_upper_limit:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 67
    sget v0, Lcom/huawei/ui/main/R$id;->wheelviewselayout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elk;

    iput-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    .line 68
    sget v0, Lcom/huawei/ui/main/R$id;->heart_picker_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhg$a;->f:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    iget-object v1, p0, Lo/fhg$a;->d:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setMinValue(I)V

    .line 72
    iget-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/elk;->setMaxValue(I)V

    .line 73
    iget-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elk;->setWrapSelectorWheel(Z)V

    .line 74
    iget v0, p0, Lo/fhg$a;->k:I

    invoke-direct {p0, v0, p1}, Lo/fhg$a;->e(I[Ljava/lang/String;)I

    move-result v6

    .line 75
    iget-object v0, p0, Lo/fhg$a;->e:Lo/elk;

    invoke-virtual {v0, v6}, Lo/elk;->setValue(I)V

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->btn_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Button;

    .line 78
    new-instance v0, Lo/fhg$a$2;

    invoke-direct {v0, p0, v4}, Lo/fhg$a$2;-><init>(Lo/fhg$a;Lo/fhg;)V

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->btn_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    .line 85
    new-instance v0, Lo/fhg$a$3;

    invoke-direct {v0, p0, v4, p1}, Lo/fhg$a$3;-><init>(Lo/fhg$a;Lo/fhg;[Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/fhg;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    invoke-virtual {v4, v5}, Lo/fhg;->setContentView(Landroid/view/View;)V

    .line 99
    invoke-virtual {v4}, Lo/fhg;->getWindow()Landroid/view/Window;

    move-result-object v9

    .line 100
    const/16 v0, 0x50

    invoke-virtual {v9, v0}, Landroid/view/Window;->setGravity(I)V

    .line 101
    invoke-virtual {v9}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v10

    .line 102
    iget-object v0, p0, Lo/fhg$a;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/view/WindowManager;

    .line 103
    invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v12

    .line 104
    iget-object v0, p0, Lo/fhg$a;->a:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 105
    invoke-virtual {v12}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 106
    invoke-virtual {v9, v10}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 107
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v9, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 108
    return-object v4
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 134
    iget-object v0, p0, Lo/fhg$a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    return-void
.end method
