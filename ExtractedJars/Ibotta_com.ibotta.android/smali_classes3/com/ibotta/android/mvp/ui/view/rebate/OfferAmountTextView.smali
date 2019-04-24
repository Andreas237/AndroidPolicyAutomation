.class public Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;
.super Landroid/support/v7/widget/AppCompatTextView;
.source "OfferAmountTextView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private createFormattingLayoutListener(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 60
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method


# virtual methods
.method public initText(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setMaxLines(I)V

    .line 43
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->createFormattingLayoutListener(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "%s %s"

    .line 45
    new-array p1, p1, [Ljava/lang/Object;

    aput-object p2, p1, v1

    aput-object p3, p1, v0

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 46
    sget-object p2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x8

    .line 49
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setVisibility(I)V

    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setVisibility(I)V

    .line 52
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setMaxLines(I)V

    .line 53
    invoke-virtual {p0, p3}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
