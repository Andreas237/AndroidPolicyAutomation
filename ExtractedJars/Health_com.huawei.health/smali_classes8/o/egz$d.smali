.class public Lo/egz$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Lo/egz$c;

.field private d:Landroid/content/Context;

.field private e:Lo/egz$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egz$d;->d:Landroid/content/Context;

    .line 50
    iput-object p1, p0, Lo/egz$d;->d:Landroid/content/Context;

    .line 51
    const/4 v0, 0x0

    invoke-static {v0}, Lo/egz;->b(I)I

    .line 52
    const/4 v0, 0x0

    invoke-static {v0}, Lo/egz;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    return-void
.end method

.method static synthetic a(Lo/egz$d;)Lo/egz$c;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/egz$d;->c:Lo/egz$c;

    return-object v0
.end method

.method static synthetic e(Lo/egz$d;)Lo/egz$c;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/egz$d;->e:Lo/egz$c;

    return-object v0
.end method


# virtual methods
.method public b(Lo/egz$c;)Lo/egz$d;
    .locals 0

    .line 66
    iput-object p1, p0, Lo/egz$d;->c:Lo/egz$c;

    .line 67
    return-object p0
.end method

.method public d(I)Lo/egz$d;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/egz$d;->d:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egz$d;->b:Ljava/lang/String;

    .line 57
    return-object p0
.end method

.method public d(Ljava/util/List;)Lo/egz$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lo/egz$d;"
        }
    .end annotation

    .line 61
    iput-object p1, p0, Lo/egz$d;->a:Ljava/util/List;

    .line 62
    return-object p0
.end method

.method public e(Lo/egz$c;)Lo/egz$d;
    .locals 0

    .line 71
    iput-object p1, p0, Lo/egz$d;->e:Lo/egz$c;

    .line 72
    return-object p0
.end method

.method public e()Lo/egz;
    .locals 16

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 77
    new-instance v4, Lo/egz;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {v4, v0, v1}, Lo/egz;-><init>(Landroid/content/Context;I)V

    .line 78
    sget v0, Lcom/huawei/ui/commonui/R$layout;->health_data_bloodsugar_timerperiod_wheel_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 79
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/egz;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    sget v0, Lcom/huawei/ui/commonui/R$id;->wheeltitle:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/ui/commonui/R$id;->wheelbut:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Button;

    .line 82
    sget v0, Lcom/huawei/ui/commonui/R$id;->wheelcancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    .line 83
    sget v0, Lcom/huawei/ui/commonui/R$id;->wheelviewselayout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/enk;

    .line 84
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lo/enk;->setOffset(I)V

    .line 85
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->a:Ljava/util/List;

    const/4 v1, -0x1

    invoke-virtual {v9, v0, v1}, Lo/enk;->setItems(Ljava/util/List;I)V

    .line 86
    new-instance v0, Lo/egz$d$2;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/egz$d$2;-><init>(Lo/egz$d;)V

    invoke-virtual {v9, v0}, Lo/enk;->setOnWheelViewListener(Lo/enk$c;)V

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->b:Ljava/lang/String;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->c:Lo/egz$c;

    if-eqz v0, :cond_1

    .line 97
    new-instance v0, Lo/egz$d$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Lo/egz$d$4;-><init>(Lo/egz$d;Lo/egz;)V

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->e:Lo/egz$c;

    if-eqz v0, :cond_2

    .line 105
    new-instance v0, Lo/egz$d$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Lo/egz$d$3;-><init>(Lo/egz$d;Lo/egz;)V

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    :cond_2
    invoke-virtual {v4}, Lo/egz;->getWindow()Landroid/view/Window;

    move-result-object v10

    .line 113
    const/16 v0, 0x50

    invoke-virtual {v10, v0}, Landroid/view/Window;->setGravity(I)V

    .line 114
    invoke-virtual {v10}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v11

    .line 115
    const v0, 0x3e4ccccd    # 0.2f

    iput v0, v11, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 116
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/view/WindowManager;

    .line 117
    invoke-interface {v12}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v13

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->d:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/egz;->b(Landroid/content/Context;F)I

    move-result v14

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egz$d;->d:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/egz;->b(Landroid/content/Context;F)I

    move-result v15

    .line 120
    iput v15, v11, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 121
    invoke-virtual {v13}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v14, 0x2

    sub-int/2addr v0, v1

    iput v0, v11, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 122
    invoke-virtual {v10, v11}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 123
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    invoke-virtual {v10, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 124
    invoke-virtual {v4}, Lo/egz;->show()V

    .line 125
    return-object v4
.end method
