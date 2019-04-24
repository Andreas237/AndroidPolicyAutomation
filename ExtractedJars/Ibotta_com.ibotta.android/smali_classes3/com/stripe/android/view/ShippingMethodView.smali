.class Lcom/stripe/android/view/ShippingMethodView;
.super Landroid/widget/RelativeLayout;
.source "ShippingMethodView.java"


# instance fields
.field private mAmount:Landroid/widget/TextView;

.field private mCheckmark:Landroid/widget/ImageView;

.field private mDetail:Landroid/widget/TextView;

.field private mLabel:Landroid/widget/TextView;

.field mSelectedColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

.field mUnselectedTextColorPrimaryInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field mUnselectedTextColorSecondaryInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingMethodView;->initView()V

    return-void
.end method

.method private initView()V
    .locals 3

    .line 69
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$layout;->shipping_method_view:I

    invoke-static {v0, v1, p0}, Lcom/stripe/android/view/ShippingMethodView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 70
    sget v0, Lcom/stripe/android/R$id;->tv_label_smv:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingMethodView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mLabel:Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/stripe/android/R$id;->tv_detail_smv:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingMethodView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mDetail:Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/stripe/android/R$id;->tv_amount_smv:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingMethodView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mAmount:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/stripe/android/R$id;->iv_selected_icon:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingMethodView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mCheckmark:Landroid/widget/ImageView;

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->getThemeAccentColor(Landroid/content/Context;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    .line 75
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->getThemeTextColorPrimary(Landroid/content/Context;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->getThemeTextColorSecondary(Landroid/content/Context;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    .line 77
    invoke-direct {p0}, Lcom/stripe/android/view/ShippingMethodView;->useDefaultColorsIfThemeColorsAreInvisible()V

    .line 78
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x10

    .line 80
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 81
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x48

    invoke-static {v1, v2}, Lcom/stripe/android/view/ViewUtils;->getPxFromDp(Landroid/content/Context;I)I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 82
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ShippingMethodView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private useDefaultColorsIfThemeColorsAreInvisible()V
    .locals 4

    .line 87
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 88
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 89
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_3

    .line 90
    iget v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    invoke-static {v2}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Lcom/stripe/android/R$color;->accent_color_default:I

    .line 91
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    :goto_0
    iput v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    .line 93
    iget v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    .line 94
    invoke-static {v2}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lcom/stripe/android/R$color;->color_text_unselected_primary_default:I

    .line 95
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    .line 94
    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    goto :goto_1

    :cond_1
    iget v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    :goto_1
    iput v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    .line 97
    iget v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    .line 98
    invoke-static {v2}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Lcom/stripe/android/R$color;->color_text_unselected_secondary_default:I

    .line 99
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    .line 98
    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    :goto_2
    iput v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    goto :goto_6

    .line 104
    :cond_3
    iget v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    invoke-static {v1}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v1

    if-eqz v1, :cond_4

    sget v1, Lcom/stripe/android/R$color;->accent_color_default:I

    .line 105
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    goto :goto_3

    :cond_4
    iget v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    :goto_3
    iput v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    .line 107
    iget v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    .line 108
    invoke-static {v1}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v1

    if-eqz v1, :cond_5

    sget v1, Lcom/stripe/android/R$color;->color_text_unselected_primary_default:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    goto :goto_4

    :cond_5
    iget v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    :goto_4
    iput v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    .line 110
    iget v1, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    .line 111
    invoke-static {v1}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v1

    if-eqz v1, :cond_6

    sget v1, Lcom/stripe/android/R$color;->color_text_unselected_secondary_default:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_5

    :cond_6
    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    :goto_5
    iput v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    :goto_6
    return-void
.end method


# virtual methods
.method public setSelected(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 56
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mLabel:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mDetail:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mAmount:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mSelectedColorInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 59
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mCheckmark:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 61
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mLabel:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mDetail:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorSecondaryInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mAmount:Landroid/widget/TextView;

    iget v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mUnselectedTextColorPrimaryInt:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mCheckmark:Landroid/widget/ImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 5
    .param p1    # Lcom/stripe/android/model/ShippingMethod;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 117
    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    .line 118
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mLabel:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {v0}, Lcom/stripe/android/model/ShippingMethod;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mDetail:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {v0}, Lcom/stripe/android/model/ShippingMethod;->getDetail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodView;->mAmount:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodView;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    .line 122
    invoke-virtual {v0}, Lcom/stripe/android/model/ShippingMethod;->getAmount()J

    move-result-wide v0

    iget-object v2, p0, Lcom/stripe/android/view/ShippingMethodView;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    .line 123
    invoke-virtual {v2}, Lcom/stripe/android/model/ShippingMethod;->getCurrency()Ljava/util/Currency;

    move-result-object v2

    .line 124
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodView;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/stripe/android/R$string;->price_free:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/view/PaymentUtils;->formatPriceStringUsingFree(JLjava/util/Currency;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
