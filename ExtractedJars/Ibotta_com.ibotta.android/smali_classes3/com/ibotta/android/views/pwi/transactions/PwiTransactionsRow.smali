.class public final Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;
.super Landroid/support/constraint/ConstraintLayout;
.source "PwiTransactionsRow.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiTransactionsRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiTransactionsRow.kt\ncom/ibotta/android/views/pwi/transactions/PwiTransactionsRow\n*L\n1#1,99:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0008\u0010\u0010\u001a\u00020\u000eH\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
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
        "onFinishInflate",
        "setActionVisibility",
        "setAddedDate",
        "setEarningsAmount",
        "setGiftCardAmount",
        "setRetailerLogo",
        "setRetailerName",
        "setUpdatedVisibility",
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

.field private viewState:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 25
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 26
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
    .locals 1

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->viewState:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    if-nez p0, :cond_0

    const-string v0, "viewState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->viewState:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    return-void
.end method

.method private final setActionVisibility(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 2

    .line 92
    sget v0, Lcom/ibotta/views/R$id;->ivAction:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getActionVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 93
    sget p1, Lcom/ibotta/views/R$id;->ivAction:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    return-void
.end method

.method private final setAddedDate(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 3

    .line 75
    sget v0, Lcom/ibotta/views/R$id;->tvAdded:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getAddedDateTextColorResId()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 76
    sget v0, Lcom/ibotta/views/R$id;->tvAddedDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvAddedDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getAddedDate()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    sget v0, Lcom/ibotta/views/R$id;->tvAddedDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getAddedDateTextColorResId()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setEarningsAmount(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 3

    .line 86
    sget v0, Lcom/ibotta/views/R$id;->tvEarnings:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getYouEarnedTextColorResId()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    sget v0, Lcom/ibotta/views/R$id;->tvEarningsAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvEarningsAmount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getEarningsAmount()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    sget v0, Lcom/ibotta/views/R$id;->tvEarningsAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getEarningsAmountTextColorResId()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setGiftCardAmount(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 2

    .line 81
    sget v0, Lcom/ibotta/views/R$id;->tvGiftCardAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvGiftCardAmount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getGiftCardAmount()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    sget v0, Lcom/ibotta/views/R$id;->tvGiftCardAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getGiftCardAmountTextColorResId()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setRetailerLogo(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 5

    .line 54
    sget v0, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivRetailerLogo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerLogoVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    sget v0, Lcom/ibotta/views/R$id;->tvRetailerLogoSpent:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvRetailerLogoSpent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerLogoSpentVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    if-ne v1, v2, :cond_1

    const/4 v3, 0x0

    :cond_1
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerLogoUrl()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerLogoSize()Lcom/ibotta/android/views/images/Sizes;

    move-result-object p1

    .line 58
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v4, 0x1

    :cond_2
    if-eqz v4, :cond_3

    .line 60
    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v1, v2, v0, v3, p1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_1

    .line 63
    :cond_3
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/images/Sizes;->getPlaceholderResId()I

    move-result v2

    sget v3, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :goto_1
    return-void
.end method

.method private final setRetailerName(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 3

    .line 68
    sget v0, Lcom/ibotta/views/R$id;->tvRetailerName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvRetailerName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    sget v0, Lcom/ibotta/views/R$id;->tvRetailerName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerNameTextColorResId()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    sget v0, Lcom/ibotta/views/R$id;->tvUpdated:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerNameTextColorResId()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    sget v0, Lcom/ibotta/views/R$id;->tvRetailerName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvRetailerName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getRetailerNameTextAllCaps()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method private final setUpdatedVisibility(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 2

    .line 97
    sget v0, Lcom/ibotta/views/R$id;->tvUpdated:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvUpdated"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getUpdatedVisbility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow$bindViewEvents$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 50
    :goto_0
    sget v0, Lcom/ibotta/views/R$id;->ivAction:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow$bindViewEvents$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 33
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->onFinishInflate()V

    const/4 v0, 0x1

    .line 34
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->viewState:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setRetailerLogo(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setRetailerName(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setGiftCardAmount(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setAddedDate(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setEarningsAmount(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setActionVisibility(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->setUpdatedVisibility(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    return-void
.end method
