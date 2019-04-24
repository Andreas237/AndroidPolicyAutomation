.class public Lcom/ibotta/android/view/common/StatusResponseView;
.super Landroid/widget/RelativeLayout;
.source "StatusResponseView.java"


# instance fields
.field private isPositive:Z

.field private ivIcon:Landroid/widget/ImageView;

.field private negativeIconId:I

.field private positiveIconId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const v0, 0x7f08024f

    .line 14
    iput v0, p0, Lcom/ibotta/android/view/common/StatusResponseView;->positiveIconId:I

    const v0, 0x7f0800c7

    .line 15
    iput v0, p0, Lcom/ibotta/android/view/common/StatusResponseView;->negativeIconId:I

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/common/StatusResponseView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const p2, 0x7f08024f

    .line 14
    iput p2, p0, Lcom/ibotta/android/view/common/StatusResponseView;->positiveIconId:I

    const p2, 0x7f0800c7

    .line 15
    iput p2, p0, Lcom/ibotta/android/view/common/StatusResponseView;->negativeIconId:I

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/common/StatusResponseView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p2, 0x7f08024f

    .line 14
    iput p2, p0, Lcom/ibotta/android/view/common/StatusResponseView;->positiveIconId:I

    const p2, 0x7f0800c7

    .line 15
    iput p2, p0, Lcom/ibotta/android/view/common/StatusResponseView;->negativeIconId:I

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/common/StatusResponseView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method private inflateContent(Landroid/content/Context;)V
    .locals 1

    const-string v0, "layout_inflater"

    .line 50
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const v0, 0x7f0c01d5

    .line 51
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0902ac

    .line 52
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/StatusResponseView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/ibotta/android/view/common/StatusResponseView;->ivIcon:Landroid/widget/ImageView;

    return-void
.end method

.method private initView()V
    .locals 2

    .line 56
    iget-boolean v0, p0, Lcom/ibotta/android/view/common/StatusResponseView;->isPositive:Z

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/view/common/StatusResponseView;->ivIcon:Landroid/widget/ImageView;

    iget v1, p0, Lcom/ibotta/android/view/common/StatusResponseView;->positiveIconId:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/common/StatusResponseView;->ivIcon:Landroid/widget/ImageView;

    iget v1, p0, Lcom/ibotta/android/view/common/StatusResponseView;->negativeIconId:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public setIsPositive(Z)V
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/StatusResponseView;->isPositive:Z

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/view/common/StatusResponseView;->initView()V

    return-void
.end method

.method public setNegativeIcon(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/android/view/common/StatusResponseView;->negativeIconId:I

    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/StatusResponseView;->setIsPositive(Z)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/view/common/StatusResponseView;->initView()V

    return-void
.end method

.method public setPositiveIcon(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/ibotta/android/view/common/StatusResponseView;->positiveIconId:I

    const/4 p1, 0x1

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/StatusResponseView;->setIsPositive(Z)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/view/common/StatusResponseView;->initView()V

    return-void
.end method
