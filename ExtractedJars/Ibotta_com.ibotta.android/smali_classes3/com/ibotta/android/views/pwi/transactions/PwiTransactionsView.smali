.class public final Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;
.super Landroid/support/constraint/ConstraintLayout;
.source "PwiTransactionsView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
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
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvents",
        "bindViewEvents",
        "",
        "isEmpty",
        "",
        "viewState",
        "setupAllEmptyViews",
        "setupEmptyView",
        "setupManageAllButton",
        "setupRecycler",
        "setupSpentFilter",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final isEmpty(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)Z
    .locals 0

    .line 102
    iget-object p1, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    return p1
.end method

.method private final setupAllEmptyViews(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V
    .locals 5

    .line 47
    sget v0, Lcom/ibotta/views/R$id;->tvEmpty:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvEmpty"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->getEmptyTransactionsText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    sget v0, Lcom/ibotta/views/R$id;->ptevEmptyView:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsEmptyView;

    const-string v1, "ptevEmptyView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v4, 0x8

    if-ne v1, v3, :cond_1

    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    if-nez v1, :cond_5

    .line 50
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->setupEmptyView(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)I

    move-result v1

    .line 48
    :goto_1
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsEmptyView;->setVisibility(I)V

    .line 53
    sget v0, Lcom/ibotta/views/R$id;->ptwevWalletEmptyView:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsWalletEmptyView;

    const-string v1, "ptwevWalletEmptyView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isWallet()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->isSpentFilterOff()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    if-ne v2, v3, :cond_3

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->setupEmptyView(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)I

    move-result v4

    goto :goto_2

    :cond_3
    if-nez v2, :cond_4

    .line 53
    :goto_2
    invoke-virtual {v0, v4}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsWalletEmptyView;->setVisibility(I)V

    return-void

    .line 55
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 50
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final setupEmptyView(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)I
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->isEmpty(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/16 p1, 0x8

    :goto_0
    return p1

    .line 62
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final setupManageAllButton(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V
    .locals 2

    .line 67
    sget v0, Lcom/ibotta/views/R$id;->bManageAll:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bManageAll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->getManageAllTransactionsVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    .line 70
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x4

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x8

    .line 67
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final setupRecycler(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V
    .locals 4

    .line 75
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    .line 76
    sget v1, Lcom/ibotta/views/R$color;->gray_ee:I

    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 77
    sget v1, Lcom/ibotta/views/R$dimen;->size_1:I

    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 78
    sget v1, Lcom/ibotta/views/R$dimen;->size_12:I

    sget v2, Lcom/ibotta/views/R$dimen;->size_0:I

    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 80
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 82
    sget v1, Lcom/ibotta/views/R$id;->rvTransactions:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;

    const-string v2, "rvTransactions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    check-cast v2, Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 83
    sget v1, Lcom/ibotta/views/R$id;->rvTransactions:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;

    const-string v2, "rvTransactions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;->getItemDecorationCount()I

    move-result v1

    if-nez v1, :cond_0

    sget v1, Lcom/ibotta/views/R$id;->rvTransactions:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;

    check-cast v0, Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 84
    :cond_0
    sget v0, Lcom/ibotta/views/R$id;->rvTransactions:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    .line 85
    sget v0, Lcom/ibotta/views/R$id;->rvTransactions:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;

    const-string v1, "rvTransactions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->isEmpty(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const/16 p1, 0x8

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;->setVisibility(I)V

    return-void

    .line 87
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final setupSpentFilter(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V
    .locals 2

    .line 92
    sget v0, Lcom/ibotta/views/R$id;->tvSpentFilter:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSpentFilter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 93
    sget v0, Lcom/ibotta/views/R$id;->tvSpentFilter:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSpentFilter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->getSpentFilterText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    sget v0, Lcom/ibotta/views/R$id;->tvSpentFilter:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSpentFilter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->getSpentFilterVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    .line 97
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const/4 p1, 0x4

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x8

    .line 94
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

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

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->viewEvents:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    .line 39
    sget v0, Lcom/ibotta/views/R$id;->rvTransactions:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsList;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    .line 40
    sget v0, Lcom/ibotta/views/R$id;->ptevEmptyView:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsEmptyView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsEmptyView;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    .line 41
    sget v0, Lcom/ibotta/views/R$id;->ptwevWalletEmptyView:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsWalletEmptyView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsWalletEmptyView;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    .line 42
    sget v0, Lcom/ibotta/views/R$id;->bManageAll:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView$bindViewEvents$1;

    invoke-direct {v1, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 43
    :goto_0
    sget v0, Lcom/ibotta/views/R$id;->tvSpentFilter:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView$bindViewEvents$2;

    invoke-direct {v1, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->setupAllEmptyViews(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->setupRecycler(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->setupManageAllButton(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsView;->setupSpentFilter(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    return-void
.end method
