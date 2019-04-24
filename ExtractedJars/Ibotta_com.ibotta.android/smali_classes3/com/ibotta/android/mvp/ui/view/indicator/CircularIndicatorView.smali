.class public Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;
.super Landroid/widget/FrameLayout;
.source "CircularIndicatorView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;
    }
.end annotation


# instance fields
.field private imageResId:I

.field ivIndicator:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ae
    .end annotation
.end field

.field private text:Ljava/lang/String;

.field tvIndicator:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090531
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const v0, 0x7f0801da

    .line 110
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setBackgroundResource(I)V

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f0c013d

    const/4 v2, 0x1

    .line 113
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 115
    invoke-static {p0, p0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "x3"

    .line 118
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setText(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private initUI()V
    .locals 4

    .line 123
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->imageResId:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-lez v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->ivIndicator:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->ivIndicator:Landroid/widget/ImageView;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->imageResId:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->text:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->ivIndicator:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setSize(IF)V
    .locals 2

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 69
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 70
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 71
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 74
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 75
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 79
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 80
    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 81
    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->ivIndicator:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public setContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 105
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->tvIndicator:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setImage(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->imageResId:I

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->initUI()V

    return-void
.end method

.method public setImagePadding(IIII)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->ivIndicator:Landroid/widget/ImageView;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/ImageView;->setPadding(IIII)V

    return-void
.end method

.method public setSize(Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;)V
    .locals 2

    .line 51
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$indicator$CircularIndicatorView$Size:[I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView$Size;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const v0, 0x7f0700e2

    const v1, 0x7f07018d

    packed-switch p1, :pswitch_data_0

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 61
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setSize(IF)V

    goto :goto_0

    .line 57
    :pswitch_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 57
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setSize(IF)V

    goto :goto_0

    .line 53
    :pswitch_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f07017b

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0700e1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setSize(IF)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setText(I)V
    .locals 1

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->text:Ljava/lang/String;

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;->initUI()V

    return-void
.end method
