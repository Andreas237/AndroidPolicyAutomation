.class public final Lcom/ibotta/android/views/pwi/StripeInputView;
.super Landroid/support/design/widget/CoordinatorLayout;
.source "StripeInputView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/design/widget/CoordinatorLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/components/NoViewState;",
        "Lcom/ibotta/android/views/pwi/StripeInputViewListener;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u001c\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u00014B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0008\u0010\u0016\u001a\u00020\u0013H\u0002J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0013J\u0008\u0010\u001b\u001a\u00020\u0013H\u0002J\u0008\u0010\u001c\u001a\u00020\u0013H\u0002J\u0008\u0010\u001d\u001a\u00020\u0013H\u0002J\u0008\u0010\u001e\u001a\u00020\u0013H\u0002J\u0008\u0010\u001f\u001a\u00020\u0013H\u0002J\u0008\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\rH\u0002J\u0008\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\rH\u0002J\u0008\u0010&\u001a\u00020\u0013H\u0014J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\rH\u0002J\u0006\u0010(\u001a\u00020\u0013J\u0008\u0010)\u001a\u00020\u0013H\u0002J\u0008\u0010*\u001a\u00020\u0013H\u0002J\u0008\u0010+\u001a\u00020\u0013H\u0002J\u0008\u0010,\u001a\u00020\u0013H\u0002J\u0008\u0010-\u001a\u00020\u0013H\u0002J\u0008\u0010.\u001a\u00020\u0013H\u0002J\u0008\u0010/\u001a\u00020\u0013H\u0002J\u0008\u00100\u001a\u00020\u0013H\u0002J\u0008\u00101\u001a\u00020\u0013H\u0002J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0003H\u0016R\u0014\u0010\u000c\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/StripeInputView;",
        "Landroid/support/design/widget/CoordinatorLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/components/NoViewState;",
        "Lcom/ibotta/android/views/pwi/StripeInputViewListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "isCardInputValid",
        "",
        "()Z",
        "textValidationWatcher",
        "Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;",
        "viewEvents",
        "bindViewEvents",
        "",
        "buildCard",
        "Lcom/stripe/android/model/Card;",
        "checkAndClearErrors",
        "displayGenericStripeErrorMessage",
        "message",
        "",
        "displayInvalidFundingTypeMessage",
        "initCardNumber",
        "initContinueButton",
        "initCvc",
        "initExpDate",
        "initName",
        "initValidationWatcher",
        "onCardNumberFocusChange",
        "hasFocus",
        "onContinueClicked",
        "onCvcFocusChange",
        "onExpDateFocusChange",
        "onFinishInflate",
        "onNameFocusChange",
        "resetInputForm",
        "setCardNumberInputStateError",
        "setCardNumberInputStateValid",
        "setCvcInputStateError",
        "setCvcInputStateValid",
        "setExpDateInputStateError",
        "setExpDateInputStateValid",
        "setNameInputStateError",
        "setNameInputStateValid",
        "updateCardBrandIcon",
        "updateViewState",
        "viewState",
        "TextValidationWatcher",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private textValidationWatcher:Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

.field private viewEvents:Lcom/ibotta/android/views/pwi/StripeInputViewListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/StripeInputView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/StripeInputView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 19
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 20
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/StripeInputView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$checkAndClearErrors(Lcom/ibotta/android/views/pwi/StripeInputView;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->checkAndClearErrors()V

    return-void
.end method

.method public static final synthetic access$onCardNumberFocusChange(Lcom/ibotta/android/views/pwi/StripeInputView;Z)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->onCardNumberFocusChange(Z)V

    return-void
.end method

.method public static final synthetic access$onContinueClicked(Lcom/ibotta/android/views/pwi/StripeInputView;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->onContinueClicked()V

    return-void
.end method

.method public static final synthetic access$onCvcFocusChange(Lcom/ibotta/android/views/pwi/StripeInputView;Z)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->onCvcFocusChange(Z)V

    return-void
.end method

.method public static final synthetic access$onExpDateFocusChange(Lcom/ibotta/android/views/pwi/StripeInputView;Z)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->onExpDateFocusChange(Z)V

    return-void
.end method

.method public static final synthetic access$onNameFocusChange(Lcom/ibotta/android/views/pwi/StripeInputView;Z)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->onNameFocusChange(Z)V

    return-void
.end method

.method public static final synthetic access$updateCardBrandIcon(Lcom/ibotta/android/views/pwi/StripeInputView;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->updateCardBrandIcon()V

    return-void
.end method

.method private final buildCard()Lcom/stripe/android/model/Card;
    .locals 6

    .line 181
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    const-string v1, "etCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardNumber()Ljava/lang/String;

    move-result-object v0

    .line 182
    sget v1, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v2, "etExpirationDate"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidDateFields()[I

    move-result-object v1

    if-eqz v1, :cond_1

    .line 184
    array-length v2, v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    new-instance v2, Lcom/stripe/android/model/Card$Builder;

    const/4 v3, 0x0

    aget v3, v1, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aget v1, v1, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget v4, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v4}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/view/StripeEditText;

    const-string v5, "etCvc"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v0, v3, v1, v4}, Lcom/stripe/android/model/Card$Builder;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 187
    sget v0, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    const-string v1, "etName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/stripe/android/model/Card$Builder;->name(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    move-result-object v0

    .line 188
    invoke-virtual {v0}, Lcom/stripe/android/model/Card$Builder;->build()Lcom/stripe/android/model/Card;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method private final checkAndClearErrors()V
    .locals 3

    .line 163
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/design/widget/TextInputEditText;

    const-string v2, "etName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/support/design/widget/TextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setNameInputStateValid()V

    .line 167
    :cond_0
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    const-string v1, "etCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCardNumberInputStateValid()V

    .line 171
    :cond_1
    sget v0, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v1, "etExpirationDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 172
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setExpDateInputStateValid()V

    .line 175
    :cond_2
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    const-string v2, "etCvc"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isCvcValid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 176
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCvcInputStateValid()V

    :cond_3
    return-void
.end method

.method private final initCardNumber()V
    .locals 3

    .line 98
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->textValidationWatcher:Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

    if-nez v1, :cond_0

    const-string v2, "textValidationWatcher"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 99
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$color;->gray_4a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setErrorColor(I)V

    .line 100
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/ibotta/android/views/pwi/StripeInputView$initCardNumber$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/StripeInputView$initCardNumber$1;-><init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    check-cast v1, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private final initContinueButton()V
    .locals 3

    .line 115
    sget v0, Lcom/ibotta/views/R$id;->bContinue:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/views/pwi/StripeInputView$initContinueButton$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/StripeInputView$initContinueButton$1;-><init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private final initCvc()V
    .locals 3

    .line 110
    sget v0, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->textValidationWatcher:Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

    if-nez v1, :cond_0

    const-string v2, "textValidationWatcher"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 111
    sget v0, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    new-instance v1, Lcom/ibotta/android/views/pwi/StripeInputView$initCvc$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/StripeInputView$initCvc$1;-><init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    check-cast v1, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private final initExpDate()V
    .locals 3

    .line 104
    sget v0, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/ExpiryDateEditText;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->textValidationWatcher:Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

    if-nez v1, :cond_0

    const-string v2, "textValidationWatcher"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 105
    sget v0, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$color;->gray_4a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setErrorColor(I)V

    .line 106
    sget v0, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/ibotta/android/views/pwi/StripeInputView$initExpDate$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/StripeInputView$initExpDate$1;-><init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    check-cast v1, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private final initName()V
    .locals 3

    .line 93
    sget v0, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->textValidationWatcher:Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

    if-nez v1, :cond_0

    const-string v2, "textValidationWatcher"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 94
    sget v0, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    new-instance v1, Lcom/ibotta/android/views/pwi/StripeInputView$initName$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/StripeInputView$initName$1;-><init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    check-cast v1, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private final initValidationWatcher()V
    .locals 1

    .line 89
    new-instance v0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;-><init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->textValidationWatcher:Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;

    return-void
.end method

.method private final isCardInputValid()Z
    .locals 6

    .line 28
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/design/widget/TextInputEditText;

    const-string v2, "etName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/support/design/widget/TextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 29
    sget v1, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/CardNumberEditText;

    const-string v2, "etCardNumber"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result v1

    .line 30
    sget v2, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v3, "etExpirationDate"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result v2

    .line 31
    sget-object v3, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v3}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v3

    sget v4, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v4}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/view/StripeEditText;

    const-string v5, "etCvc"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/ibotta/android/util/Validation;->isCvcValid(Ljava/lang/String;)Z

    move-result v3

    if-nez v0, :cond_0

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setNameInputStateError()V

    :cond_0
    if-nez v1, :cond_1

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCardNumberInputStateError()V

    :cond_1
    if-nez v2, :cond_2

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setExpDateInputStateError()V

    :cond_2
    if-nez v3, :cond_3

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCvcInputStateError()V

    :cond_3
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    if-eqz v3, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final onCardNumberFocusChange(Z)V
    .locals 1

    if-nez p1, :cond_1

    .line 222
    sget p1, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/CardNumberEditText;

    const-string v0, "etCardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 223
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCardNumberInputStateValid()V

    goto :goto_0

    .line 225
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCardNumberInputStateError()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final onContinueClicked()V
    .locals 3

    .line 251
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->isCardInputValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->buildCard()Lcom/stripe/android/model/Card;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 254
    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->viewEvents:Lcom/ibotta/android/views/pwi/StripeInputViewListener;

    if-nez v1, :cond_0

    const-string v2, "viewEvents"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1, v0}, Lcom/ibotta/android/views/pwi/StripeInputViewListener;->buildAndValidateNewPaymentCard(Lcom/stripe/android/model/Card;)V

    :cond_1
    return-void
.end method

.method private final onCvcFocusChange(Z)V
    .locals 2

    if-nez p1, :cond_1

    .line 242
    sget-object p1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {p1}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object p1

    sget v0, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    const-string v1, "etCvc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/util/Validation;->isCvcValid(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 243
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCvcInputStateValid()V

    goto :goto_0

    .line 245
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCvcInputStateError()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final onExpDateFocusChange(Z)V
    .locals 1

    if-nez p1, :cond_1

    .line 232
    sget p1, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v0, "etExpirationDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->isDateValid()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 233
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setExpDateInputStateValid()V

    goto :goto_0

    .line 235
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setExpDateInputStateError()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final onNameFocusChange(Z)V
    .locals 2

    if-nez p1, :cond_1

    .line 212
    sget-object p1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {p1}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object p1

    sget v0, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    const-string v1, "etName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 213
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setNameInputStateValid()V

    goto :goto_0

    .line 215
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setNameInputStateError()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final setCardNumberInputStateError()V
    .locals 3

    .line 129
    sget v0, Lcom/ibotta/views/R$id;->tilCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 130
    sget v0, Lcom/ibotta/views/R$id;->tilCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$string;->stripe_error_card:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setCardNumberInputStateValid()V
    .locals 2

    .line 134
    sget v0, Lcom/ibotta/views/R$id;->tilCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 135
    sget v0, Lcom/ibotta/views/R$id;->tilCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method private final setCvcInputStateError()V
    .locals 3

    .line 149
    sget v0, Lcom/ibotta/views/R$id;->tilCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCvc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 150
    sget v0, Lcom/ibotta/views/R$id;->tilCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCvc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$string;->stripe_error_cvc:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setCvcInputStateValid()V
    .locals 2

    .line 154
    sget v0, Lcom/ibotta/views/R$id;->tilCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCvc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 155
    sget v0, Lcom/ibotta/views/R$id;->tilCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilCvc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method private final setExpDateInputStateError()V
    .locals 3

    .line 139
    sget v0, Lcom/ibotta/views/R$id;->tilExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilExpirationDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 140
    sget v0, Lcom/ibotta/views/R$id;->tilExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilExpirationDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$string;->stripe_error_date:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setExpDateInputStateValid()V
    .locals 2

    .line 144
    sget v0, Lcom/ibotta/views/R$id;->tilExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilExpirationDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 145
    sget v0, Lcom/ibotta/views/R$id;->tilExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilExpirationDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method private final setNameInputStateError()V
    .locals 3

    .line 119
    sget v0, Lcom/ibotta/views/R$id;->tilName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 120
    sget v0, Lcom/ibotta/views/R$id;->tilName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$string;->stripe_error_name:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setNameInputStateValid()V
    .locals 2

    .line 124
    sget v0, Lcom/ibotta/views/R$id;->tilName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 125
    sget v0, Lcom/ibotta/views/R$id;->tilName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "tilName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method private final updateCardBrandIcon()V
    .locals 4

    .line 159
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    .line 160
    sget-object v1, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->INSTANCE:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;

    sget v2, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getCardBrand()Ljava/lang/String;

    move-result-object v2

    const-string v3, "etCardNumber.getCardBrand()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->getBrandResId(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    .line 159
    invoke-virtual {v0, v2, v2, v1, v2}, Lcom/stripe/android/view/CardNumberEditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/pwi/StripeInputViewListener;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->bindViewEvents(Lcom/ibotta/android/views/pwi/StripeInputViewListener;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/StripeInputViewListener;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/StripeInputViewListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/StripeInputView;->viewEvents:Lcom/ibotta/android/views/pwi/StripeInputViewListener;

    return-void
.end method

.method public final displayGenericStripeErrorMessage(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final displayInvalidFundingTypeMessage()V
    .locals 3

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$string;->pwi_card_type_must_be_debit:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCardNumberInputStateError()V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 53
    invoke-super {p0}, Landroid/support/design/widget/CoordinatorLayout;->onFinishInflate()V

    .line 55
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->initValidationWatcher()V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->initName()V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->initCardNumber()V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->initExpDate()V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->initCvc()V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->initContinueButton()V

    return-void
.end method

.method public final resetInputForm()V
    .locals 2

    .line 78
    sget v0, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    const-string v1, ""

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputEditText;->setText(Ljava/lang/CharSequence;)V

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setNameInputStateValid()V

    .line 80
    sget v0, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    const-string v1, ""

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setText(Ljava/lang/CharSequence;)V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCardNumberInputStateValid()V

    .line 82
    sget v0, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v1, ""

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setText(Ljava/lang/CharSequence;)V

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setExpDateInputStateValid()V

    .line 84
    sget v0, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    const-string v1, ""

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->setCvcInputStateValid()V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/components/NoViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/NoViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/components/NoViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->updateViewState(Lcom/ibotta/android/views/components/NoViewState;)V

    return-void
.end method
