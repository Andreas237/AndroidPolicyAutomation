.class public final Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;
.super Landroid/support/constraint/ConstraintLayout;
.source "PaymentOptionSelectorRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;",
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
        "initSelected",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    sget-object p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->viewState:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->viewState:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    return-object p0
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->viewState:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    return-void
.end method

.method private final initIcon(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 3

    .line 41
    sget v0, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getIconResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    if-ne p1, v0, :cond_0

    .line 43
    sget p1, Lcom/ibotta/views/R$id;->ivCardIcon:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$dimen;->size_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, 0x0

    .line 43
    invoke-virtual {p1, v0, v2, v1, v2}, Landroid/widget/ImageView;->setPadding(IIII)V

    :cond_0
    return-void
.end method

.method private final initSelected(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 1

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lcom/ibotta/views/R$id;->ivDefault:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivDefault"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->ivDefault:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivDefault"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private final initText(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 5

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getDefault()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 53
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v3, "tvCardNumber"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/ibotta/views/R$string;->pwi_last_four_card_default:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    if-ne v0, v3, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->isExpired()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v3, "tvCardNumber"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/ibotta/views/R$string;->pwi_last_four_card_expired:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    sget p1, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$color;->black_38_perc:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 58
    :cond_1
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getNameResId()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getNameResId()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;

    .line 37
    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of p1, p0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

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

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->initIcon(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->initText(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->initSelected(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;->viewState:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    return-void
.end method
