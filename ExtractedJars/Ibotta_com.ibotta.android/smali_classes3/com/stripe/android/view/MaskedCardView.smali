.class public Lcom/stripe/android/view/MaskedCardView;
.super Landroid/widget/LinearLayout;
.source "MaskedCardView.java"


# annotations
.annotation build Landroid/support/annotation/RestrictTo;
    value = {
        .enum Landroid/support/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroid/support/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field static final TEMPLATE_RESOURCE_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCardBrand:Ljava/lang/String;

.field private mCardIconImageView:Landroid/support/v7/widget/AppCompatImageView;

.field private mCardInformationTextView:Landroid/support/v7/widget/AppCompatTextView;

.field private mCheckMarkImageView:Landroid/support/v7/widget/AppCompatImageView;

.field private mIsSelected:Z

.field private mLast4:Ljava/lang/String;

.field mSelectedAlphaColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field mSelectedColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field mUnselectedColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field mUnselectedTextAlphaColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field mUnselectedTextColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 62
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    .line 65
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "American Express"

    sget v2, Lcom/stripe/android/R$drawable;->ic_amex_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "Diners Club"

    sget v2, Lcom/stripe/android/R$drawable;->ic_diners_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "Discover"

    sget v2, Lcom/stripe/android/R$drawable;->ic_discover_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "JCB"

    sget v2, Lcom/stripe/android/R$drawable;->ic_jcb_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "MasterCard"

    sget v2, Lcom/stripe/android/R$drawable;->ic_mastercard_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "Visa"

    sget v2, Lcom/stripe/android/R$drawable;->ic_visa_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "UnionPay"

    sget v2, Lcom/stripe/android/R$drawable;->ic_unionpay_template_32:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    const-string v1, "Unknown"

    sget v2, Lcom/stripe/android/R$drawable;->ic_unknown:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 82
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->init()V

    return-void
.end method

.method private initializeCheckMark()V
    .locals 3

    .line 203
    sget v0, Lcom/stripe/android/R$drawable;->ic_checkmark:I

    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->mCheckMarkImageView:Landroid/support/v7/widget/AppCompatImageView;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/stripe/android/view/MaskedCardView;->updateDrawable(ILandroid/widget/ImageView;Z)V

    return-void
.end method

.method private setLightTextColorValues()V
    .locals 3

    .line 315
    iget v0, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    .line 317
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$integer;->light_text_alpha_hex:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    .line 315
    invoke-static {v0, v1}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedAlphaColorInt:I

    .line 318
    iget v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    .line 320
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$integer;->light_text_alpha_hex:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    .line 318
    invoke-static {v0, v1}, Landroid/support/v4/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextAlphaColorInt:I

    return-void
.end method

.method private updateBrandIcon()V
    .locals 3

    .line 207
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 210
    :cond_0
    sget-object v0, Lcom/stripe/android/view/MaskedCardView;->TEMPLATE_RESOURCE_MAP:Ljava/util/Map;

    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 211
    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->mCardIconImageView:Landroid/support/v7/widget/AppCompatImageView;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/stripe/android/view/MaskedCardView;->updateDrawable(ILandroid/widget/ImageView;Z)V

    return-void
.end method

.method private updateCardInformation()V
    .locals 9

    const-string v0, "American Express"

    .line 236
    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->amex_short:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    .line 239
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->ending_in:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 240
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 241
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    .line 242
    iget-object v4, p0, Lcom/stripe/android/view/MaskedCardView;->mLast4:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    .line 243
    iget-boolean v5, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    if-eqz v5, :cond_1

    iget v5, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    goto :goto_1

    :cond_1
    iget v5, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    .line 244
    :goto_1
    iget-boolean v6, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    if-eqz v6, :cond_2

    iget v6, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedAlphaColorInt:I

    goto :goto_2

    :cond_2
    iget v6, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextAlphaColorInt:I

    .line 248
    :goto_2
    new-instance v7, Landroid/text/SpannableString;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mLast4:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 249
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "sans-serif-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/16 v8, 0x21

    invoke-virtual {v7, v0, v1, v2, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 254
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v7, v0, v1, v2, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 259
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int/2addr v3, v2

    invoke-virtual {v7, v0, v2, v3, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 264
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "sans-serif-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    add-int/2addr v4, v3

    invoke-virtual {v7, v0, v3, v4, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 269
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v7, v0, v3, v4, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 274
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardInformationTextView:Landroid/support/v7/widget/AppCompatTextView;

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateCheckMark()V
    .locals 2

    .line 278
    iget-boolean v0, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCheckMarkImageView:Landroid/support/v7/widget/AppCompatImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/AppCompatImageView;->setVisibility(I)V

    goto :goto_0

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCheckMarkImageView:Landroid/support/v7/widget/AppCompatImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/AppCompatImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private updateDrawable(ILandroid/widget/ImageView;Z)V
    .locals 2
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 220
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 221
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p2}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    .line 225
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 228
    :goto_0
    iget-boolean v0, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    if-nez v0, :cond_2

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget p3, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    goto :goto_2

    :cond_2
    :goto_1
    iget p3, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    .line 230
    :goto_2
    invoke-static {p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 231
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, p3}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 232
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private useDefaultColorsIfThemeColorsAreInvisible()V
    .locals 4

    .line 287
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 288
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 289
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_3

    .line 290
    iget v2, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    invoke-static {v2}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Lcom/stripe/android/R$color;->accent_color_default:I

    .line 291
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    :goto_0
    iput v2, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    .line 293
    iget v2, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    invoke-static {v2}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lcom/stripe/android/R$color;->control_normal_color_default:I

    .line 294
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    goto :goto_1

    :cond_1
    iget v2, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    :goto_1
    iput v2, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    .line 296
    iget v2, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    invoke-static {v2}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Lcom/stripe/android/R$color;->color_text_secondary_default:I

    .line 297
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    :goto_2
    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    goto :goto_6

    .line 302
    :cond_3
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    invoke-static {v1}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v1

    if-eqz v1, :cond_4

    sget v1, Lcom/stripe/android/R$color;->accent_color_default:I

    .line 303
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    goto :goto_3

    :cond_4
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    :goto_3
    iput v1, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    .line 305
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    invoke-static {v1}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v1

    if-eqz v1, :cond_5

    sget v1, Lcom/stripe/android/R$color;->control_normal_color_default:I

    .line 306
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    goto :goto_4

    :cond_5
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    :goto_4
    iput v1, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    .line 308
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    invoke-static {v1}, Lcom/stripe/android/view/ViewUtils;->isColorTransparent(I)Z

    move-result v1

    if-eqz v1, :cond_6

    sget v1, Lcom/stripe/android/R$color;->color_text_secondary_default:I

    .line 309
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_5

    :cond_6
    iget v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    :goto_5
    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    :goto_6
    return-void
.end method


# virtual methods
.method getCardBrand()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    return-object v0
.end method

.method getLast4()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mLast4:Ljava/lang/String;

    return-object v0
.end method

.method getTextColorValues()[I
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x4

    .line 161
    new-array v0, v0, [I

    .line 162
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 163
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedAlphaColorInt:I

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 164
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 165
    iget v1, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextAlphaColorInt:I

    const/4 v2, 0x3

    aput v1, v0, v2

    return-object v0
.end method

.method init()V
    .locals 3

    .line 181
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$layout;->masked_card_view:I

    invoke-static {v0, v1, p0}, Lcom/stripe/android/view/MaskedCardView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    const/4 v0, 0x0

    .line 182
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/MaskedCardView;->setOrientation(I)V

    .line 183
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$dimen;->card_widget_min_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/MaskedCardView;->setMinimumWidth(I)V

    .line 184
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 185
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$dimen;->masked_card_vertical_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 186
    invoke-virtual {p0, v0, v1, v0, v1}, Lcom/stripe/android/view/MaskedCardView;->setPadding(IIII)V

    .line 188
    sget v0, Lcom/stripe/android/R$id;->masked_icon_view:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/MaskedCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardIconImageView:Landroid/support/v7/widget/AppCompatImageView;

    .line 189
    sget v0, Lcom/stripe/android/R$id;->masked_card_info_view:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/MaskedCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatTextView;

    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardInformationTextView:Landroid/support/v7/widget/AppCompatTextView;

    .line 190
    sget v0, Lcom/stripe/android/R$id;->masked_check_icon:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/MaskedCardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCheckMarkImageView:Landroid/support/v7/widget/AppCompatImageView;

    .line 192
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->getThemeAccentColor(Landroid/content/Context;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mSelectedColorInt:I

    .line 193
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->getThemeColorControlNormal(Landroid/content/Context;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedColorInt:I

    .line 194
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/view/ViewUtils;->getThemeTextColorSecondary(Landroid/content/Context;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    iput v0, p0, Lcom/stripe/android/view/MaskedCardView;->mUnselectedTextColorInt:I

    .line 195
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->useDefaultColorsIfThemeColorsAreInvisible()V

    .line 196
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->setLightTextColorValues()V

    .line 198
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->initializeCheckMark()V

    .line 199
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCheckMark()V

    return-void
.end method

.method public isSelected()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    return v0
.end method

.method setCard(Lcom/stripe/android/model/Card;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/Card;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 110
    invoke-virtual {p1}, Lcom/stripe/android/model/Card;->getBrand()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Lcom/stripe/android/model/Card;->getLast4()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->mLast4:Ljava/lang/String;

    .line 112
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateBrandIcon()V

    .line 113
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCardInformation()V

    return-void
.end method

.method setCustomerSource(Lcom/stripe/android/model/CustomerSource;)V
    .locals 3
    .param p1    # Lcom/stripe/android/model/CustomerSource;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 136
    invoke-virtual {p1}, Lcom/stripe/android/model/CustomerSource;->asSource()Lcom/stripe/android/model/Source;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/StripeSourceTypeModel;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "card"

    .line 139
    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 140
    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/StripeSourceTypeModel;

    move-result-object v1

    instance-of v1, v1, Lcom/stripe/android/model/SourceCardData;

    if-eqz v1, :cond_0

    .line 141
    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/StripeSourceTypeModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/SourceCardData;

    .line 142
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/MaskedCardView;->setSourceCardData(Lcom/stripe/android/model/SourceCardData;)V

    return-void

    .line 146
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/model/CustomerSource;->asCard()Lcom/stripe/android/model/Card;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 148
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/MaskedCardView;->setCard(Lcom/stripe/android/model/Card;)V

    :cond_1
    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 97
    iput-boolean p1, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    .line 98
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCheckMark()V

    .line 99
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateBrandIcon()V

    .line 100
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCardInformation()V

    return-void
.end method

.method setSourceCardData(Lcom/stripe/android/model/SourceCardData;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/SourceCardData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 122
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceCardData;->getBrand()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->mCardBrand:Ljava/lang/String;

    .line 123
    invoke-virtual {p1}, Lcom/stripe/android/model/SourceCardData;->getLast4()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->mLast4:Ljava/lang/String;

    .line 124
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateBrandIcon()V

    .line 125
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCardInformation()V

    return-void
.end method

.method toggleSelected()V
    .locals 1

    .line 156
    iget-boolean v0, p0, Lcom/stripe/android/view/MaskedCardView;->mIsSelected:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/MaskedCardView;->setSelected(Z)V

    return-void
.end method
