.class public Lo/egk;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lo/egm;

.field private c:Lo/egm;

.field private d:I

.field private e:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    const/4 v0, 0x1

    iput v0, p0, Lo/egk;->e:I

    .line 24
    const/4 v0, 0x1

    iput v0, p0, Lo/egk;->d:I

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lo/egk;->a:I

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/egk;->i:I

    .line 31
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$layout;->commonui_health_height_inch_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 32
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_height_picker_foot:I

    invoke-virtual {p0, v0}, Lo/egk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egm;

    iput-object v0, p0, Lo/egk;->b:Lo/egm;

    .line 33
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_height_picker_inch:I

    invoke-virtual {p0, v0}, Lo/egk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egm;

    iput-object v0, p0, Lo/egk;->c:Lo/egm;

    .line 35
    iget-object v0, p0, Lo/egk;->b:Lo/egm;

    new-instance v1, Lo/egk$1;

    invoke-direct {v1, p0}, Lo/egk$1;-><init>(Lo/egk;)V

    invoke-virtual {v0, v1}, Lo/egm;->setOnSelectedListener(Lo/egm$e;)V

    .line 44
    iget-object v0, p0, Lo/egk;->c:Lo/egm;

    new-instance v1, Lo/egk$3;

    invoke-direct {v1, p0}, Lo/egk$3;-><init>(Lo/egk;)V

    invoke-virtual {v0, v1}, Lo/egm;->setOnSelectedListener(Lo/egm$e;)V

    .line 53
    return-void
.end method

.method static synthetic a(Lo/egk;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/egk;->d:I

    return p1
.end method

.method static synthetic b(Lo/egk;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/egk;->i:I

    return p1
.end method

.method static synthetic d(Lo/egk;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/egk;->e:I

    return p1
.end method

.method static synthetic e(Lo/egk;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/egk;->a:I

    return p1
.end method


# virtual methods
.method public getSelectedFoot()I
    .locals 1

    .line 56
    iget v0, p0, Lo/egk;->e:I

    return v0
.end method

.method public getSelectedInch()I
    .locals 1

    .line 59
    iget v0, p0, Lo/egk;->d:I

    return v0
.end method

.method public setFootMode(I)V
    .locals 3

    .line 63
    const-string v0, "HealthHeightPickerView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    iget-object v0, p0, Lo/egk;->b:Lo/egm;

    iget v1, p0, Lo/egk;->a:I

    invoke-virtual {v0, p1, v1}, Lo/egm;->setContentMode(II)V

    .line 65
    return-void
.end method

.method public setInchMode(I)V
    .locals 3

    .line 67
    const-string v0, "HealthHeightPickerView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    iget-object v0, p0, Lo/egk;->c:Lo/egm;

    iget v1, p0, Lo/egk;->i:I

    invoke-virtual {v0, p1, v1}, Lo/egm;->setContentMode(II)V

    .line 69
    return-void
.end method

.method public setSelectedFoot(I)V
    .locals 2

    .line 73
    iput p1, p0, Lo/egk;->e:I

    .line 74
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/egk;->a:I

    .line 76
    iget-object v0, p0, Lo/egk;->b:Lo/egm;

    iget v1, p0, Lo/egk;->a:I

    invoke-virtual {v0, v1}, Lo/egm;->setSelectedPosition(I)V

    .line 77
    return-void
.end method

.method public setSelectedInch(I)V
    .locals 2

    .line 80
    iput p1, p0, Lo/egk;->d:I

    .line 81
    iput p1, p0, Lo/egk;->i:I

    .line 82
    iget-object v0, p0, Lo/egk;->c:Lo/egm;

    iget v1, p0, Lo/egk;->i:I

    invoke-virtual {v0, v1}, Lo/egm;->setSelectedPosition(I)V

    .line 83
    return-void
.end method
