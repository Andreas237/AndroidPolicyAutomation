.class public final Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;
.super Landroid/support/constraint/ConstraintLayout;
.source "PwiAddMoneyView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u001bB%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0008\u0010\u0016\u001a\u00020\u000fH\u0002J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0002\u0010\u0018J\u0008\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvents",
        "viewState",
        "bindViewEvents",
        "",
        "initDefaultPaymentOption",
        "initInputAmount",
        "initMessage",
        "initNumberPad",
        "initPayButton",
        "initPendingStatusBar",
        "onContinueClicked",
        "onPaymentMethodsClicked",
        "()Lkotlin/Unit;",
        "onPendingStatusBarClicked",
        "updateViewState",
        "PwiPurchaseAmountState",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

.field private viewState:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 13
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

    move-object v1, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct/range {p0 .. p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    new-instance v0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1ff

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    iput-object v0, v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewState:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 21
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$onContinueClicked(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->onContinueClicked()V

    return-void
.end method

.method public static final synthetic access$onPaymentMethodsClicked(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;)Lkotlin/Unit;
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->onPaymentMethodsClicked()Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onPendingStatusBarClicked(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->onPendingStatusBarClicked()V

    return-void
.end method

.method private final initDefaultPaymentOption(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 1

    .line 75
    sget v0, Lcom/ibotta/views/R$id;->porvPaymentOption:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getDefaultPaymentViewState()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    return-void
.end method

.method private final initInputAmount(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 2

    .line 62
    sget v0, Lcom/ibotta/views/R$id;->tvInput:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvInput"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getInputAmountText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    sget v0, Lcom/ibotta/views/R$id;->tvInput:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getInputAmountTextColorResId()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final initMessage(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 2

    .line 67
    sget v0, Lcom/ibotta/views/R$id;->tvMessage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final initNumberPad(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 1

    .line 71
    sget v0, Lcom/ibotta/views/R$id;->pnpvNumberPad:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getNumberPadViewState()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->updateViewState(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;)V

    return-void
.end method

.method private final initPayButton(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 2

    .line 79
    sget v0, Lcom/ibotta/views/R$id;->bPay:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getPayButtonTextResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 80
    sget v0, Lcom/ibotta/views/R$id;->bPay:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bPay"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getPayButtonEnabled()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method private final initPendingStatusBar(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 2

    .line 58
    sget v0, Lcom/ibotta/views/R$id;->tvPendingStatusBar:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvPendingStatusBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getShowPending()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private final onContinueClicked()V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;->onPayClick()V

    :cond_0
    return-void
.end method

.method private final onPaymentMethodsClicked()Lkotlin/Unit;
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewState:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->getDefaultPaymentViewState()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 90
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;->showPaymentMethodSelector()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    .line 89
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewState:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;->isGooglePaySupported()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;->showPaymentMethodSelector()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;->addNewCard()V

    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final onPendingStatusBarClicked()V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;->onPendingStatusBarClicked()V

    :cond_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    sget v0, Lcom/ibotta/views/R$id;->tvPendingStatusBar:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$bindViewEvents$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 51
    :goto_0
    sget v0, Lcom/ibotta/views/R$id;->pnpvNumberPad:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;)V

    .line 52
    sget v0, Lcom/ibotta/views/R$id;->porvPaymentOption:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;

    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$bindViewEvents$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 53
    :goto_1
    sget v0, Lcom/ibotta/views/R$id;->bPay:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$bindViewEvents$3;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$bindViewEvents$3;-><init>(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 54
    :goto_2
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewEvents:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewEvents;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->updateViewState(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->initPendingStatusBar(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->initInputAmount(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->initMessage(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->initNumberPad(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->initDefaultPaymentOption(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->initPayButton(Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;)V

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView;->viewState:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    return-void
.end method
