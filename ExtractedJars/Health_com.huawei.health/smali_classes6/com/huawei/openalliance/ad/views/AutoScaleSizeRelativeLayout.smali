.class public Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;
.super Landroid/widget/RelativeLayout;


# instance fields
.field private a:Ljava/lang/Float;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public getRatio()F
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected onMeasure(II)V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v4, v0, :cond_1

    int-to-float v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v3

    div-float v7, v0, v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v7, v0

    if-lez v0, :cond_0

    move v6, v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    int-to-float v1, v6

    mul-float/2addr v0, v1

    float-to-int v5, v0

    goto :goto_0

    :cond_0
    move v5, v2

    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v0, v1

    float-to-int v6, v0

    :goto_0
    goto :goto_1

    :cond_1
    move v5, v2

    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v0, v1

    float-to-int v6, v0

    :goto_1
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v6, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :cond_2
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    return-void
.end method

.method public setRatio(Ljava/lang/Float;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->a:Ljava/lang/Float;

    return-void
.end method
