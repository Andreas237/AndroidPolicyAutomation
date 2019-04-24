.class public abstract Lo/ehs;
.super Lo/eii;
.source "SourceFile"

# interfaces
.implements Lo/ejm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eii<Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;>;Lo/ejm;"
    }
.end annotation


# instance fields
.field private q:I

.field private t:F

.field private u:I

.field private v:I

.field private w:[Ljava/lang/String;

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p1, p2}, Lo/eii;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 27
    const/4 v0, 0x1

    iput v0, p0, Lo/ehs;->q:I

    .line 32
    const/16 v0, 0xd7

    const/16 v1, 0xd7

    const/16 v2, 0xd7

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/ehs;->u:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/ehs;->t:F

    .line 36
    const/high16 v0, -0x1000000

    iput v0, p0, Lo/ehs;->v:I

    .line 41
    const/16 v0, 0x78

    iput v0, p0, Lo/ehs;->y:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/ehs;->z:I

    .line 51
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "Stack"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ehs;->w:[Ljava/lang/String;

    .line 58
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/ehs;->e:I

    .line 61
    invoke-direct {p0, p1}, Lo/ehs;->c(Ljava/util/List;)V

    .line 62
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;>;)V"
        }
    .end annotation

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/ehs;->z:I

    .line 77
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 81
    iget v0, p0, Lo/ehs;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ehs;->z:I

    .line 77
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 85
    :cond_0
    return-void
.end method


# virtual methods
.method public K()I
    .locals 1

    .line 131
    iget v0, p0, Lo/ehs;->q:I

    return v0
.end method

.method public L()Z
    .locals 2

    .line 136
    iget v0, p0, Lo/ehs;->q:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public Q()I
    .locals 1

    .line 202
    iget v0, p0, Lo/ehs;->v:I

    return v0
.end method

.method public R()I
    .locals 1

    .line 162
    iget v0, p0, Lo/ehs;->u:I

    return v0
.end method

.method public S()F
    .locals 1

    .line 183
    iget v0, p0, Lo/ehs;->t:F

    return v0
.end method

.method protected synthetic b(FLo/ejp;)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
    .locals 1

    .line 21
    invoke-virtual {p0, p1, p2}, Lo/ehs;->e(FLo/ejp;)Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;)V
    .locals 2

    .line 107
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    .line 111
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v0

    iget v1, p0, Lo/ehs;->m:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 112
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v0

    iput v0, p0, Lo/ehs;->m:F

    .line 114
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v0

    iget v1, p0, Lo/ehs;->p:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 115
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->getY()F

    move-result v0

    iput v0, p0, Lo/ehs;->p:F

    .line 125
    :cond_1
    invoke-virtual {p0, p1}, Lo/ehs;->d(Lcom/github/mikephil/charting/data/Entry;)V

    .line 127
    :cond_2
    return-void
.end method

.method protected e(FLo/ejp;)Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;
    .locals 4

    .line 254
    instance-of v0, p2, Lo/eju;

    if-eqz v0, :cond_0

    .line 255
    move-object v2, p2

    check-cast v2, Lo/eju;

    .line 256
    invoke-virtual {v2}, Lo/eju;->a()Lo/eju$c;

    move-result-object v3

    .line 258
    instance-of v0, v3, Lo/eju$b;

    if-eqz v0, :cond_0

    .line 260
    new-instance v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-direct {v0, p1, p2}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;-><init>(FLo/ejp;)V

    return-object v0

    .line 264
    :cond_0
    instance-of v0, p2, Lo/ehz;

    if-nez v0, :cond_1

    .line 265
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not BarChartDataStorageModel,logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :cond_1
    move-object v2, p2

    check-cast v2, Lo/ehz;

    .line 268
    new-instance v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-direct {v0, p1, v2}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;-><init>(FLo/ejp;)V

    return-object v0
.end method

.method protected synthetic e(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {p0, v0}, Lo/ehs;->c(Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;)V

    return-void
.end method

.method public abstract h(I)I
.end method

.method public abstract i(I)I
.end method

.method public abstract k(I)I
.end method
