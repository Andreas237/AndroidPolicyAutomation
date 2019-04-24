.class public final Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;
.super Landroid/support/constraint/ConstraintLayout;
.source "DefaultPaymentOptionRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0003H\u0003J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewState",
        "bindViewEvents",
        "",
        "viewEvents",
        "getNameTextAppearance",
        "initIcon",
        "initName",
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

.field private viewState:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/ibotta/views/R$layout;->view_payment_option_row:I

    move-object p3, p0

    check-cast p3, Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 26
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 27
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final getNameTextAppearance(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)I
    .locals 2
    .annotation build Landroid/support/annotation/StyleRes;
    .end annotation

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v1, :cond_1

    .line 53
    sget p1, Lcom/ibotta/views/R$style;->ModelC_Placeholder:I

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 54
    sget p1, Lcom/ibotta/views/R$style;->ModelC_Body:I

    :goto_1
    return p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final initIcon(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 4

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$dimen;->size_6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 67
    :pswitch_0
    sget v0, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getIconResId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 68
    sget p1, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivCardIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 69
    sget p1, Lcom/ibotta/views/R$id;->lavAddMicroNudge:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "lavAddMicroNudge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 70
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, v3, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 71
    sget p1, Lcom/ibotta/views/R$id;->ivEllipsis:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivEllipsis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 61
    :pswitch_1
    sget p1, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v1, "ivCardIcon"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    sget p1, Lcom/ibotta/views/R$id;->lavAddMicroNudge:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView;

    const-string v1, "lavAddMicroNudge"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 63
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, v3, v0, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 64
    sget p1, Lcom/ibotta/views/R$id;->ivEllipsis:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivEllipsis"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final initName(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 3

    .line 46
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getNameResId()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getNameResId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->getNameTextAppearance(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)I

    move-result p1

    invoke-static {v0, p1}, Landroid/support/v4/widget/TextViewCompat;->setTextAppearance(Landroid/widget/TextView;I)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/NoViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/views/components/NoViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->initName(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->initIcon(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/DefaultPaymentOptionRowView;->viewState:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    return-void
.end method
