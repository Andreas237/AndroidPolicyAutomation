.class public Lcom/stripe/android/view/CardInputWidget;
.super Landroid/widget/LinearLayout;
.source "CardInputWidget.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardInputWidget$PlacementParameters;,
        Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;
    }
.end annotation


# instance fields
.field private mCardIconImageView:Landroid/widget/ImageView;

.field private mCardInputListener:Lcom/stripe/android/view/CardInputListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

.field private mCardNumberIsViewed:Z

.field private mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

.field private mDimensionOverrides:Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;

.field private mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

.field private mFrameLayout:Landroid/widget/FrameLayout;

.field private mInitFlag:Z

.field private mIsAmEx:Z

.field private mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

.field private mTintColorInt:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private mTotalLengthInPixels:I


# direct methods
.method private applyTint(Z)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "Unknown"

    .line 859
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardBrand()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 860
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardIconImageView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 861
    invoke-static {p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 862
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/view/CardInputWidget;->mTintColorInt:I

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 863
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardIconImageView:Landroid/widget/ImageView;

    invoke-static {p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->unwrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method private getCvcPlaceHolderForBrand(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "American Express"

    .line 840
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "2345"

    return-object p1

    :cond_0
    const-string p1, "CVC"

    return-object p1
.end method

.method private getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/view/StripeEditText;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 458
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mDimensionOverrides:Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;

    if-nez v0, :cond_0

    .line 459
    invoke-virtual {p2}, Lcom/stripe/android/view/StripeEditText;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result p1

    float-to-int p1, p1

    goto :goto_0

    .line 460
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;->getPixelWidth(Ljava/lang/String;Landroid/widget/EditText;)I

    move-result p1

    :goto_0
    return p1
.end method

.method private getFrameWidth()I
    .locals 1

    .line 464
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mDimensionOverrides:Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mFrameLayout:Landroid/widget/FrameLayout;

    .line 465
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    goto :goto_0

    .line 466
    :cond_0
    invoke-interface {v0}, Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;->getFrameWidth()I

    move-result v0

    :goto_0
    return v0
.end method

.method private getHiddenTextForBrand(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "American Express"

    .line 831
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "3434 343434 "

    return-object p1

    :cond_0
    const-string p1, "4242 4242 4242 "

    return-object p1
.end method

.method private getPeekCardTextForBrand(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "American Express"

    .line 849
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "34343"

    return-object p1

    :cond_0
    const-string v0, "Diners Club"

    .line 851
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "88"

    return-object p1

    :cond_1
    const-string p1, "4242"

    return-object p1
.end method

.method private isCvcLengthValid()Z
    .locals 3

    .line 438
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 439
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 440
    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->mIsAmEx:Z

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

.method private setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V
    .locals 1
    .param p3    # Lcom/stripe/android/view/StripeEditText;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 451
    invoke-virtual {p3}, Lcom/stripe/android/view/StripeEditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 452
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 453
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 454
    invoke-virtual {p3, v0}, Lcom/stripe/android/view/StripeEditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public getCard()Lcom/stripe/android/model/Card;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardNumber()Ljava/lang/String;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidDateFields()[I

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    .line 117
    array-length v3, v1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v3}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 123
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 124
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->isCvcLengthValid()Z

    move-result v4

    if-nez v4, :cond_1

    return-object v2

    .line 128
    :cond_1
    new-instance v2, Lcom/stripe/android/model/Card;

    const/4 v4, 0x0

    aget v4, v1, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aget v1, v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v0, v4, v1, v3}, Lcom/stripe/android/model/Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v0, "CardInputView"

    .line 129
    invoke-virtual {v2, v0}, Lcom/stripe/android/model/Card;->addLoggingToken(Ljava/lang/String;)Lcom/stripe/android/model/Card;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    return-object v2
.end method

.method getFocusRequestOnTouch(I)Lcom/stripe/android/view/StripeEditText;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 316
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mFrameLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLeft()I

    move-result v0

    .line 318
    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 322
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    add-int/2addr v0, v1

    if-ge p1, v0, :cond_0

    return-object v2

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardTouchBufferLimit:I

    if-ge p1, v0, :cond_1

    .line 327
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    return-object p1

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    if-ge p1, v0, :cond_2

    .line 330
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object p1

    :cond_2
    return-object v2

    .line 338
    :cond_3
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    add-int/2addr v0, v1

    if-ge p1, v0, :cond_4

    return-object v2

    .line 341
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardTouchBufferLimit:I

    if-ge p1, v0, :cond_5

    .line 343
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    return-object p1

    .line 344
    :cond_5
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    if-ge p1, v0, :cond_6

    .line 346
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object p1

    .line 347
    :cond_6
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    add-int/2addr v0, v1

    if-ge p1, v0, :cond_7

    return-object v2

    .line 351
    :cond_7
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateRightTouchBufferLimit:I

    if-ge p1, v0, :cond_8

    .line 353
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object p1

    .line 354
    :cond_8
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcStartPosition:I

    if-ge p1, v0, :cond_9

    .line 356
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    return-object p1

    :cond_9
    return-object v2
.end method

.method getPlacementParameters()Lcom/stripe/android/view/CardInputWidget$PlacementParameters;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 376
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 242
    invoke-virtual {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    .line 243
    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 248
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 252
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->getFocusRequestOnTouch(I)Lcom/stripe/android/view/StripeEditText;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 254
    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->requestFocus()Z

    const/4 p1, 0x1

    return p1

    .line 257
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 803
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 804
    iget-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mInitFlag:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getWidth()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    .line 805
    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mInitFlag:Z

    .line 806
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/CardInputWidget;->mTotalLengthInPixels:I

    .line 808
    iget-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes(Z)V

    .line 810
    iget-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p1, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->hiddenCardWidth:I

    mul-int/lit8 p1, p1, -0x1

    .line 812
    :goto_0
    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, p2, p1, p3}, Lcom/stripe/android/view/CardInputWidget;->setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V

    .line 814
    iget-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p1, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p1, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    :goto_1
    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    add-int/2addr p1, p2

    .line 817
    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {p0, p2, p1, p3}, Lcom/stripe/android/view/CardInputWidget;->setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V

    .line 819
    iget-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/stripe/android/view/CardInputWidget;->mTotalLengthInPixels:I

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p1, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateCvcSeparation:I

    add-int/2addr p1, p2

    .line 825
    :goto_2
    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget p2, p2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcWidth:I

    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0, p2, p1, p3}, Lcom/stripe/android/view/CardInputWidget;->setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V

    :cond_3
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5

    .line 270
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 271
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "extra_card_viewed"

    const/4 v1, 0x1

    .line 272
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    .line 273
    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes(Z)V

    .line 274
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/CardInputWidget;->mTotalLengthInPixels:I

    .line 276
    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 278
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    add-int/2addr v1, v2

    .line 280
    iget v2, p0, Lcom/stripe/android/view/CardInputWidget;->mTotalLengthInPixels:I

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->hiddenCardWidth:I

    mul-int/lit8 v0, v0, -0x1

    .line 283
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    add-int/2addr v1, v2

    .line 285
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    add-int/2addr v2, v1

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v3, v3, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateCvcSeparation:I

    add-int/2addr v2, v3

    .line 290
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v3, v3, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v3, v0, v4}, Lcom/stripe/android/view/CardInputWidget;->setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V

    .line 291
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {p0, v0, v1, v3}, Lcom/stripe/android/view/CardInputWidget;->setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V

    .line 292
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcWidth:I

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0, v0, v2, v1}, Lcom/stripe/android/view/CardInputWidget;->setLayoutValues(IILcom/stripe/android/view/StripeEditText;)V

    const-string v0, "extra_super_state"

    .line 294
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_1

    .line 296
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_1
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 262
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "extra_super_state"

    .line 263
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "extra_card_viewed"

    .line 264
    iget-boolean v2, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .line 774
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 776
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->applyTint(Z)V

    :cond_0
    return-void
.end method

.method public setCardInputListener(Lcom/stripe/android/view/CardInputListener;)V
    .locals 0
    .param p1    # Lcom/stripe/android/view/CardInputListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 138
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->setCardNumberIsViewed(Z)V

    return-void
.end method

.method setCardNumberIsViewed(Z)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 370
    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberIsViewed:Z

    return-void
.end method

.method public setCardNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setCvcCode(Ljava/lang/String;)V
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCvcNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method setDimensionOverrideSettings(Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 365
    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mDimensionOverrides:Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberEditText;->setEnabled(Z)V

    .line 201
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setEnabled(Z)V

    .line 202
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->setEnabled(Z)V

    return-void
.end method

.method public setExpiryDateTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method updateSpaceSizes(Z)V
    .locals 6
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 381
    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result v0

    .line 382
    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mFrameLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLeft()I

    move-result v1

    if-nez v0, :cond_0

    return-void

    .line 388
    :cond_0
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    const-string v3, "4242 4242 4242 4242"

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    .line 389
    invoke-direct {p0, v3, v4}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v3

    iput v3, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    .line 391
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    const-string v3, "MM/MM"

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->mExpiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 392
    invoke-direct {p0, v3, v4}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v3

    iput v3, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    .line 394
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getCardBrand()Ljava/lang/String;

    move-result-object v2

    .line 395
    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    .line 396
    invoke-direct {p0, v2}, Lcom/stripe/android/view/CardInputWidget;->getHiddenTextForBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v4, v5}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v4

    iput v4, v3, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->hiddenCardWidth:I

    .line 398
    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    .line 399
    invoke-direct {p0, v2}, Lcom/stripe/android/view/CardInputWidget;->getCvcPlaceHolderForBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/view/CardInputWidget;->mCvcNumberEditText:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0, v4, v5}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v4

    iput v4, v3, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcWidth:I

    .line 401
    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    .line 402
    invoke-direct {p0, v2}, Lcom/stripe/android/view/CardInputWidget;->getPeekCardTextForBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->mCardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v2, v4}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v2

    iput v2, v3, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    if-eqz p1, :cond_1

    .line 405
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    sub-int/2addr v0, v2

    iput v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    .line 407
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    iput v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardTouchBufferLimit:I

    .line 409
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    add-int/2addr v1, v0

    iput v1, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    goto :goto_0

    .line 412
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    div-int/lit8 v2, v0, 0x2

    iget v3, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v3, v3, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iput v2, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    .line 415
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcWidth:I

    sub-int/2addr v0, v2

    iput v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateCvcSeparation:I

    .line 421
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v2, v2, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    iput v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardTouchBufferLimit:I

    .line 424
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, v0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    add-int/2addr v1, v0

    iput v1, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    .line 427
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateCvcSeparation:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iput v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateRightTouchBufferLimit:I

    .line 431
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->mPlacementParameters:Lcom/stripe/android/view/CardInputWidget$PlacementParameters;

    iget v1, v1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateCvcSeparation:I

    add-int/2addr v0, v1

    iput v0, p1, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcStartPosition:I

    :goto_0
    return-void
.end method
