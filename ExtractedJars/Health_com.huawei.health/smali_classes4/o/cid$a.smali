.class public Lo/cid$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lo/cid$d;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Lo/cid$d;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cid$a;->c:Landroid/content/Context;

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/cid$a;->b:I

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cid$a;->e:Ljava/util/ArrayList;

    .line 51
    iput-object p1, p0, Lo/cid$a;->c:Landroid/content/Context;

    .line 52
    return-void
.end method

.method static synthetic b(Lo/cid$a;)Lo/cid$d;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/cid$a;->a:Lo/cid$d;

    return-object v0
.end method

.method static synthetic d(Lo/cid$a;)Lo/cid$d;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/cid$a;->d:Lo/cid$d;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)Lo/cid$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Double;>;)Lo/cid$a;"
        }
    .end annotation

    .line 70
    iput-object p1, p0, Lo/cid$a;->e:Ljava/util/ArrayList;

    .line 71
    return-object p0
.end method

.method public b(I)Lo/cid$a;
    .locals 0

    .line 65
    iput p1, p0, Lo/cid$a;->b:I

    .line 66
    return-object p0
.end method

.method public b(Lo/cid$d;)Lo/cid$a;
    .locals 0

    .line 55
    iput-object p1, p0, Lo/cid$a;->a:Lo/cid$d;

    .line 56
    return-object p0
.end method

.method public c()Lo/cid;
    .locals 13

    .line 75
    iget-object v0, p0, Lo/cid$a;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 76
    new-instance v4, Lo/cid;

    iget-object v0, p0, Lo/cid$a;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$style;->CustomDialog:I

    invoke-direct {v4, v0, v1}, Lo/cid;-><init>(Landroid/content/Context;I)V

    .line 77
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->layout_indoor_run_calibration_distance:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 78
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/cid;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_health_distance_picker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ciu;

    .line 80
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->datepicker_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Button;

    .line 81
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->datepicker_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/Button;

    .line 82
    iget-object v0, p0, Lo/cid$a;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_settings_button_ok:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lo/cid$a;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 84
    iget-object v0, p0, Lo/cid$a;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Lo/ciu;->setViewData(Ljava/util/ArrayList;)V

    .line 85
    iget v0, p0, Lo/cid$a;->b:I

    invoke-virtual {v6, v0}, Lo/ciu;->setSelectedDistance(I)V

    .line 88
    iget-object v0, p0, Lo/cid$a;->a:Lo/cid$d;

    if-eqz v0, :cond_0

    .line 89
    new-instance v0, Lo/cid$a$5;

    invoke-direct {v0, p0, v4, v6}, Lo/cid$a$5;-><init>(Lo/cid$a;Lo/cid;Lo/ciu;)V

    invoke-virtual {v7, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    :cond_0
    iget-object v0, p0, Lo/cid$a;->d:Lo/cid$d;

    if-eqz v0, :cond_1

    .line 97
    new-instance v0, Lo/cid$a$1;

    invoke-direct {v0, p0, v4}, Lo/cid$a$1;-><init>(Lo/cid$a;Lo/cid;)V

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    :cond_1
    invoke-virtual {v4}, Lo/cid;->getWindow()Landroid/view/Window;

    move-result-object v9

    .line 106
    const/16 v0, 0x50

    invoke-virtual {v9, v0}, Landroid/view/Window;->setGravity(I)V

    .line 107
    invoke-virtual {v9}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v10

    .line 108
    iget-object v0, p0, Lo/cid$a;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/view/WindowManager;

    .line 109
    invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v12

    .line 110
    const/16 v0, 0xa

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 111
    invoke-virtual {v12}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 112
    invoke-virtual {v9, v10}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 113
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$style;->track_dialog_anim:I

    invoke-virtual {v9, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 114
    invoke-virtual {v4}, Lo/cid;->show()V

    .line 115
    return-object v4
.end method

.method public e(Lo/cid$d;)Lo/cid$a;
    .locals 0

    .line 60
    iput-object p1, p0, Lo/cid$a;->d:Lo/cid$d;

    .line 61
    return-object p0
.end method
