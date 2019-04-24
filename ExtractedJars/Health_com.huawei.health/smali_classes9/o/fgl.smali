.class public Lo/fgl;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Lo/fgh;

.field private d:Lo/fgh;

.field private e:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    const/4 v0, 0x1

    iput v0, p0, Lo/fgl;->a:I

    .line 24
    const/4 v0, 0x1

    iput v0, p0, Lo/fgl;->b:I

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lo/fgl;->e:I

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/fgl;->i:I

    .line 31
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hw_health_height_inch_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 32
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_height_picker_foot:I

    invoke-virtual {p0, v0}, Lo/fgl;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/fgl;->c:Lo/fgh;

    .line 33
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_height_picker_inch:I

    invoke-virtual {p0, v0}, Lo/fgl;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/fgl;->d:Lo/fgh;

    .line 35
    iget-object v0, p0, Lo/fgl;->c:Lo/fgh;

    new-instance v1, Lo/fgl$1;

    invoke-direct {v1, p0}, Lo/fgl$1;-><init>(Lo/fgl;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 44
    iget-object v0, p0, Lo/fgl;->d:Lo/fgh;

    new-instance v1, Lo/fgl$3;

    invoke-direct {v1, p0}, Lo/fgl$3;-><init>(Lo/fgl;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 53
    return-void
.end method

.method static synthetic a(Lo/fgl;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/fgl;->b:I

    return p1
.end method

.method static synthetic b(Lo/fgl;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/fgl;->i:I

    return p1
.end method

.method static synthetic d(Lo/fgl;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/fgl;->a:I

    return p1
.end method

.method static synthetic e(Lo/fgl;I)I
    .locals 0

    .line 16
    iput p1, p0, Lo/fgl;->e:I

    return p1
.end method


# virtual methods
.method public getSelectedFoot()I
    .locals 1

    .line 56
    iget v0, p0, Lo/fgl;->a:I

    return v0
.end method

.method public getSelectedInch()I
    .locals 1

    .line 59
    iget v0, p0, Lo/fgl;->b:I

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
    iget-object v0, p0, Lo/fgl;->c:Lo/fgh;

    iget v1, p0, Lo/fgl;->e:I

    invoke-virtual {v0, p1, v1}, Lo/fgh;->setContentMode(II)V

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
    iget-object v0, p0, Lo/fgl;->d:Lo/fgh;

    iget v1, p0, Lo/fgl;->i:I

    invoke-virtual {v0, p1, v1}, Lo/fgh;->setContentMode(II)V

    .line 69
    return-void
.end method

.method public setSelectedFoot(I)V
    .locals 2

    .line 73
    iput p1, p0, Lo/fgl;->a:I

    .line 74
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/fgl;->e:I

    .line 76
    iget-object v0, p0, Lo/fgl;->c:Lo/fgh;

    iget v1, p0, Lo/fgl;->e:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 77
    return-void
.end method

.method public setSelectedInch(I)V
    .locals 2

    .line 80
    iput p1, p0, Lo/fgl;->b:I

    .line 81
    iput p1, p0, Lo/fgl;->i:I

    .line 82
    iget-object v0, p0, Lo/fgl;->d:Lo/fgh;

    iget v1, p0, Lo/fgl;->i:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 83
    return-void
.end method
