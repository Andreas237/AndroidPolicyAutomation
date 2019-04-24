.class public Lcom/stripe/android/view/CardMultilineWidget;
.super Landroid/widget/LinearLayout;
.source "CardMultilineWidget.java"


# instance fields
.field private mCardBrand:Ljava/lang/String;

.field private mCardInputListener:Lcom/stripe/android/view/CardInputListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

.field private mCardNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mCvcEditText:Lcom/stripe/android/view/StripeEditText;

.field private mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

.field private mExpiryTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mHasAdjustedDrawable:Z

.field private mIsEnabled:Z

.field private mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

.field private mPostalInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private mShouldShowPostalCode:Z

.field private mTintColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 71
    invoke-direct {p0, p2}, Lcom/stripe/android/view/CardMultilineWidget;->initView(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/CardMultilineWidget;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrand(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/ExpiryDateEditText;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object p0
.end method

.method static synthetic access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-object p0
.end method

.method static synthetic access$300(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    return-object p0
.end method

.method static synthetic access$400(Lcom/stripe/android/view/CardMultilineWidget;)Ljava/lang/String;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/stripe/android/view/CardMultilineWidget;)Z
    .locals 0

    .line 41
    iget-boolean p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    return p0
.end method

.method static synthetic access$600(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    return-object p0
.end method

.method static synthetic access$700(Lcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->flipToCvcIconIfNotFinished()V

    return-void
.end method

.method static synthetic access$800(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardNumberEditText;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    return-object p0
.end method

.method static synthetic access$900(Lcom/stripe/android/view/CardMultilineWidget;)I
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcHelperText()I

    move-result p0

    return p0
.end method

.method private checkAttributeSet(Landroid/util/AttributeSet;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 272
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/R$styleable;->CardMultilineWidget:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 278
    :try_start_0
    sget v0, Lcom/stripe/android/R$styleable;->CardMultilineWidget_shouldShowPostalCode:I

    .line 279
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 281
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method private flipToCvcIconIfNotFinished()V
    .locals 2

    .line 287
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/view/ViewUtils;->isCvcMaximalLength(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "American Express"

    .line 291
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/stripe/android/R$drawable;->ic_cvc_amex:I

    goto :goto_0

    :cond_1
    sget v0, Lcom/stripe/android/R$drawable;->ic_cvc:I

    :goto_0
    const/4 v1, 0x1

    .line 295
    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->updateDrawable(IZ)V

    return-void
.end method

.method private getCvcHelperText()I
    .locals 2
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    const-string v0, "American Express"

    .line 300
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/stripe/android/R$string;->cvc_multiline_helper_amex:I

    goto :goto_0

    :cond_0
    sget v0, Lcom/stripe/android/R$string;->cvc_multiline_helper:I

    :goto_0
    return v0
.end method

.method private getDynamicBufferInPixels()I
    .locals 4

    .line 306
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$dimen;->card_icon_multiline_padding_bottom:I

    .line 307
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 308
    new-instance v1, Ljava/math/BigDecimal;

    float-to-double v2, v0

    invoke-direct {v1, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 309
    sget-object v0, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    return v0
.end method

.method private initDeleteEmptyListeners()V
    .locals 3

    .line 417
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 420
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    .line 425
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    if-nez v0, :cond_0

    return-void

    .line 428
    :cond_0
    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    return-void
.end method

.method private initErrorMessages()V
    .locals 3

    .line 433
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->invalid_card_number:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 434
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->invalid_expiry_year:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 435
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->invalid_cvc:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    .line 436
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->invalid_zip:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method

.method private initFocusChangeListeners()V
    .locals 2

    .line 440
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$6;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$6;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 455
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$7;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$7;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 470
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$8;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$8;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 487
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    if-nez v0, :cond_0

    return-void

    .line 491
    :cond_0
    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$9;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$9;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initTextInputLayoutErrorHandlers(Landroid/support/design/widget/TextInputLayout;Landroid/support/design/widget/TextInputLayout;Landroid/support/design/widget/TextInputLayout;Landroid/support/design/widget/TextInputLayout;)V
    .locals 2

    .line 515
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {v1, p1}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 516
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v0, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {v0, p2}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/ExpiryDateEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 517
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance p2, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {p2, p3}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 518
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    if-nez p1, :cond_0

    return-void

    .line 521
    :cond_0
    new-instance p2, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {p2, p4}, Lcom/stripe/android/view/ErrorListener;-><init>(Landroid/support/design/widget/TextInputLayout;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method private initView(Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v0, 0x1

    .line 314
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setOrientation(I)V

    .line 315
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$layout;->card_multiline_widget:I

    invoke-static {v1, v2, p0}, Lcom/stripe/android/view/CardMultilineWidget;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 317
    sget v1, Lcom/stripe/android/R$id;->et_add_source_card_number_ml:I

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/CardNumberEditText;

    iput-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    .line 318
    sget v1, Lcom/stripe/android/R$id;->et_add_source_expiry_ml:I

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/ExpiryDateEditText;

    iput-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 319
    sget v1, Lcom/stripe/android/R$id;->et_add_source_cvc_ml:I

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    iput-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    .line 320
    sget v1, Lcom/stripe/android/R$id;->et_add_source_postal_ml:I

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    iput-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    .line 321
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getHintTextColors()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    iput v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mTintColorInt:I

    const-string v1, "Unknown"

    .line 323
    iput-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    .line 325
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->checkAttributeSet(Landroid/util/AttributeSet;)V

    .line 327
    sget p1, Lcom/stripe/android/R$id;->tl_add_source_card_number_ml:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/design/widget/TextInputLayout;

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 328
    sget p1, Lcom/stripe/android/R$id;->tl_add_source_expiry_ml:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/design/widget/TextInputLayout;

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 330
    sget p1, Lcom/stripe/android/R$id;->tl_add_source_cvc_ml:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/design/widget/TextInputLayout;

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 331
    sget p1, Lcom/stripe/android/R$id;->tl_add_source_postal_ml:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/design/widget/TextInputLayout;

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 333
    iget-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    if-eqz p1, :cond_0

    .line 335
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$string;->expiry_label_short:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 338
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {p0, p1, v1, v2, v3}, Lcom/stripe/android/view/CardMultilineWidget;->initTextInputLayoutErrorHandlers(Landroid/support/design/widget/TextInputLayout;Landroid/support/design/widget/TextInputLayout;Landroid/support/design/widget/TextInputLayout;Landroid/support/design/widget/TextInputLayout;)V

    .line 344
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->initErrorMessages()V

    .line 345
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners()V

    .line 346
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->initDeleteEmptyListeners()V

    .line 348
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$1;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setCardBrandChangeListener(Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;)V

    .line 356
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$2;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setCardNumberCompleteListener(Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;)V

    .line 367
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$3;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$3;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setExpiryDateEditListener(Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;)V

    .line 378
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$4;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$4;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    .line 397
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->adjustViewForPostalCodeAttribute()V

    .line 399
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/stripe/android/view/CardMultilineWidget$5;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardMultilineWidget$5;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    .line 411
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter()V

    const-string p1, "Unknown"

    .line 412
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrand(Ljava/lang/String;)V

    .line 413
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setEnabled(Z)V

    return-void
.end method

.method private isCvcLengthValid()Z
    .locals 3

    .line 259
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "American Express"

    .line 260
    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static isPostalCodeMaximalLength(ZLjava/lang/String;)Z
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 255
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    const/4 p1, 0x5

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private updateBrand(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 525
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    .line 526
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->updateCvc(Ljava/lang/String;)V

    .line 527
    sget-object v0, Lcom/stripe/android/model/Card;->BRAND_RESOURCE_MAP:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "Unknown"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->updateDrawable(IZ)V

    return-void
.end method

.method private updateCvc(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "American Express"

    .line 531
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 532
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v1, v0

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 536
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->cvc_amex_hint:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 538
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v1, v0

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 541
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->cvc_number_hint:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private updateDrawable(IZ)V
    .locals 5
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    .line 551
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 552
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    .line 556
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 559
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v2, 0x0

    .line 560
    aget-object v0, v0, v2

    if-nez v0, :cond_1

    return-void

    .line 565
    :cond_1
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 566
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 568
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCompoundDrawablePadding()I

    move-result v0

    .line 570
    iget-boolean v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->mHasAdjustedDrawable:Z

    if-nez v3, :cond_2

    .line 571
    iget v3, v2, Landroid/graphics/Rect;->top:I

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getDynamicBufferInPixels()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, v2, Landroid/graphics/Rect;->top:I

    .line 572
    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getDynamicBufferInPixels()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, v2, Landroid/graphics/Rect;->bottom:I

    const/4 v3, 0x1

    .line 573
    iput-boolean v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->mHasAdjustedDrawable:Z

    .line 576
    :cond_2
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 577
    invoke-static {p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p2, :cond_3

    .line 579
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iget v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mTintColorInt:I

    invoke-static {p2, v2}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 582
    :cond_3
    iget-object p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p2, v0}, Lcom/stripe/android/view/CardNumberEditText;->setCompoundDrawablePadding(I)V

    .line 583
    iget-object p2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p2, p1, v1, v1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method adjustViewForPostalCodeAttribute()V
    .locals 4

    .line 227
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    if-eqz v0, :cond_0

    sget v0, Lcom/stripe/android/R$string;->expiry_label_short:I

    goto :goto_0

    :cond_0
    sget v0, Lcom/stripe/android/R$string;->acc_label_expiry_date:I

    .line 230
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/design/widget/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 232
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    if-eqz v0, :cond_1

    sget v0, Lcom/stripe/android/R$id;->et_add_source_postal_ml:I

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    .line 235
    :goto_1
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setNextFocusForwardId(I)V

    .line 236
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setNextFocusDownId(I)V

    .line 238
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    const/16 v0, 0x8

    .line 239
    :goto_2
    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v2, v0}, Landroid/support/design/widget/TextInputLayout;->setVisibility(I)V

    .line 241
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    if-eqz v0, :cond_3

    .line 242
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/stripe/android/R$dimen;->add_card_expiry_middle_margin:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    .line 244
    :goto_3
    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 245
    invoke-virtual {v2}, Landroid/support/design/widget/TextInputLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 246
    invoke-virtual {v2, v1, v1, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 247
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v1, v3, :cond_4

    .line 248
    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 251
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v2}, Landroid/support/design/widget/TextInputLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getCard()Lcom/stripe/android/model/Card;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 118
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->validateAllFields()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardNumber()Ljava/lang/String;

    move-result-object v0

    .line 120
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidDateFields()[I

    move-result-object v1

    .line 121
    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 123
    new-instance v3, Lcom/stripe/android/model/Card;

    const/4 v4, 0x0

    aget v4, v1, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aget v1, v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/stripe/android/model/Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 124
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card;->setAddressZip(Ljava/lang/String;)V

    :cond_0
    const-string v0, "CardMultilineView"

    .line 127
    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card;->addLoggingToken(Ljava/lang/String;)Lcom/stripe/android/model/Card;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 213
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mIsEnabled:Z

    return v0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .line 164
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    .line 166
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardBrand:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrand(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setCardInputListener(Lcom/stripe/android/view/CardInputListener;)V
    .locals 0
    .param p1    # Lcom/stripe/android/view/CardInputListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 106
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-void
.end method

.method public setCardNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setCvcNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setEnabled(Z)V

    .line 219
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setEnabled(Z)V

    .line 220
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setEnabled(Z)V

    .line 221
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setEnabled(Z)V

    .line 222
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mIsEnabled:Z

    return-void
.end method

.method public setExpiryDateTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setPostalCodeTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setShouldShowPostalCode(Z)V
    .locals 0

    .line 171
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    .line 172
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->adjustViewForPostalCodeAttribute()V

    return-void
.end method

.method public validateAllFields()Z
    .locals 8

    .line 139
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    .line 140
    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/CardUtils;->isValidCardNumber(Ljava/lang/String;)Z

    move-result v0

    .line 141
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidDateFields()[I

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 142
    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 143
    :goto_0
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->isCvcLengthValid()Z

    move-result v4

    .line 144
    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    xor-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    .line 145
    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    xor-int/lit8 v6, v1, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/ExpiryDateEditText;->setShouldShowError(Z)V

    .line 146
    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->mCvcEditText:Lcom/stripe/android/view/StripeEditText;

    xor-int/lit8 v6, v4, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    .line 148
    iget-boolean v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->mShouldShowPostalCode:Z

    if-eqz v5, :cond_1

    .line 149
    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    .line 150
    invoke-virtual {v5}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 149
    invoke-static {v3, v5}, Lcom/stripe/android/view/CardMultilineWidget;->isPostalCodeMaximalLength(ZLjava/lang/String;)Z

    move-result v5

    .line 151
    iget-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->mPostalCodeEditText:Lcom/stripe/android/view/StripeEditText;

    xor-int/lit8 v7, v5, 0x1

    invoke-virtual {v6, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2
.end method
