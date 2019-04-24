.class public final Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;
.super Landroid/support/constraint/ConstraintLayout;
.source "WalletPaymentOptionRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;",
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
        "initIcon",
        "initOnClickListeners",
        "initText",
        "updateViewState",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;

.field private viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    sget-object p1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 24
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 25
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;)Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    return-object p0
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    return-void
.end method

.method private final initIcon(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 3

    .line 56
    sget v0, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getIconResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    if-ne p1, v0, :cond_0

    .line 58
    sget p1, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$dimen;->size_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, 0x0

    .line 58
    invoke-virtual {p1, v0, v2, v1, v2}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 64
    sget p1, Lcom/ibotta/views/R$id;->ivEllipsis:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivEllipsis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private final initOnClickListeners(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 49
    :pswitch_0
    sget v0, Lcom/ibotta/views/R$id;->ivEllipsis:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$2;-><init>(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 50
    :goto_0
    sget p1, Lcom/ibotta/views/R$id;->ivEllipsis:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivEllipsis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    goto :goto_2

    .line 45
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$initOnClickListeners$1;-><init>(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of p1, p0, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const/4 p1, 0x0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final initText(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 7

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 81
    :pswitch_0
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v4, "tvCardNumber"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 82
    sget v5, Lcom/ibotta/views/R$string;->pwi_wallet_card_row_name:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getCardType()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v3

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 81
    invoke-virtual {v4, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getDefault()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvCardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 84
    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->tvExpirationDate:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvExpirationDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 74
    :pswitch_1
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v4, "tvCardNumber"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 75
    sget v5, Lcom/ibotta/views/R$string;->pwi_wallet_card_row_name:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getCardType()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v3

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v2

    .line 74
    invoke-virtual {v4, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getDefault()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 77
    :cond_1
    sget v0, Lcom/ibotta/views/R$id;->tvExpirationDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvExpirationDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v4, Lcom/ibotta/views/R$string;->pwi_wallet_row_card_expiration:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getExpDate()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    sget p1, Lcom/ibotta/views/R$id;->tvExpirationDate:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvExpirationDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 71
    :pswitch_2
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getNameResId()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->bindViewEvents(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->viewEvents:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->initOnClickListeners(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->updateViewState(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->viewState:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->initIcon(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;->initText(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    return-void
.end method
