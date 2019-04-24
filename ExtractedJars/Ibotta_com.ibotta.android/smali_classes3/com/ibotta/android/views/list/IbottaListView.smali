.class public final Lcom/ibotta/android/views/list/IbottaListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "IbottaListView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/util/VisibilityListener;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIbottaListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbottaListView.kt\ncom/ibotta/android/views/list/IbottaListView\n*L\n1#1,168:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005B%\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\n \u001c*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0008\u0010\'\u001a\u00020\u001aH\u0002J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000bH\u0014J\u0016\u0010,\u001a\u00020-2\u000c\u0010\r\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0010\u00100\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J(\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)022\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020504H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/IbottaListView;",
        "Landroid/support/v7/widget/RecyclerView;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        "Lcom/ibotta/android/views/util/VisibilityListener;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "adapter",
        "Lcom/ibotta/android/views/list/IbottaListViewAdapter;",
        "itemDecoration",
        "Landroid/support/v7/widget/RecyclerView$ItemDecoration;",
        "scrollListener",
        "Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;",
        "scrollableViewWrapper",
        "Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;",
        "snapHelper",
        "Landroid/support/v7/widget/SnapHelper;",
        "viewEvents",
        "viewState",
        "bindViewEvents",
        "",
        "getDecorator",
        "kotlin.jvm.PlatformType",
        "getLayoutManager",
        "Landroid/support/v7/widget/RecyclerView$LayoutManager;",
        "layoutType",
        "Lcom/ibotta/android/views/list/LayoutType;",
        "initDecorator",
        "initLayoutManager",
        "initPadding",
        "padding",
        "Lcom/ibotta/android/views/list/Padding;",
        "initSnapHelper",
        "onVisibilityChanged",
        "visible",
        "",
        "onWindowVisibilityChanged",
        "visibility",
        "setAdapter",
        "",
        "Landroid/support/v7/widget/RecyclerView$Adapter;",
        "setVisibility",
        "updateViewState",
        "visibilityProvider",
        "Lkotlin/Function2;",
        "decoratedContentSet",
        "",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
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

.field private final adapter:Lcom/ibotta/android/views/list/IbottaListViewAdapter;

.field private itemDecoration:Landroid/support/v7/widget/RecyclerView$ItemDecoration;

.field private scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field private scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

.field private final snapHelper:Landroid/support/v7/widget/SnapHelper;

.field private viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

.field private viewState:Lcom/ibotta/android/views/list/IbottaListViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/list/IbottaListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/list/IbottaListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    new-instance p1, Lcom/ibotta/android/views/list/IbottaListViewAdapter;

    invoke-direct {p1}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->adapter:Lcom/ibotta/android/views/list/IbottaListViewAdapter;

    .line 29
    sget-object p1, Lcom/ibotta/android/views/list/IbottaListViewState;->EMPTY:Lcom/ibotta/android/views/list/IbottaListViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 32
    new-instance p1, Landroid/support/v7/widget/LinearSnapHelper;

    invoke-direct {p1}, Landroid/support/v7/widget/LinearSnapHelper;-><init>()V

    check-cast p1, Landroid/support/v7/widget/SnapHelper;

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->snapHelper:Landroid/support/v7/widget/SnapHelper;

    .line 38
    iget-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->adapter:Lcom/ibotta/android/views/list/IbottaListViewAdapter;

    check-cast p1, Landroid/support/v7/widget/RecyclerView$Adapter;

    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    const/4 p1, 0x1

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setNestedScrollingEnabled(Z)V

    const/4 p1, 0x0

    .line 40
    check-cast p1, Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 41
    new-instance p1, Lcom/ibotta/android/views/list/IbottaListView$1;

    invoke-direct {p1, p0}, Lcom/ibotta/android/views/list/IbottaListView$1;-><init>(Lcom/ibotta/android/views/list/IbottaListView;)V

    check-cast p1, Landroid/view/View$OnTouchListener;

    instance-of p2, p0, Landroid/view/View;

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    move-object p2, p0

    check-cast p2, Landroid/view/View;

    invoke-static {p2, p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 23
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 24
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/list/IbottaListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/list/IbottaListView;)Lcom/ibotta/android/views/list/IbottaListViewEvents;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    return-object p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/list/IbottaListView;Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    return-void
.end method

.method private final getDecorator(Lcom/ibotta/android/views/list/IbottaListViewState;)Landroid/support/v7/widget/RecyclerView$ItemDecoration;
    .locals 3

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v0

    .line 74
    sget-object v1, Lcom/ibotta/android/views/list/HorizontalLayout;->INSTANCE:Lcom/ibotta/android/views/list/HorizontalLayout;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getMarginTop()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/views/list/Decorator;->getMarginBottom()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    move-result-object v0

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getDecoratedContentSet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/views/list/IbottaListView;->visibilityProvider(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;

    invoke-direct {v2, v1}, Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;-><init>(Lkotlin/jvm/functions/Function2;)V

    move-object v1, v2

    :cond_0
    check-cast v1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->visibilityProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    .line 78
    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getShouldShowBottomDecorator()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    .line 79
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/Decorator;->getSize()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    check-cast p1, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    .line 80
    invoke-virtual {p1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    goto/16 :goto_0

    .line 81
    :cond_2
    sget-object v1, Lcom/ibotta/android/views/list/VerticalLayout;->INSTANCE:Lcom/ibotta/android/views/list/VerticalLayout;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getMarginLeft()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/views/list/Decorator;->getMarginRight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getDecoratedContentSet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/views/list/IbottaListView;->visibilityProvider(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;

    invoke-direct {v2, v1}, Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;-><init>(Lkotlin/jvm/functions/Function2;)V

    move-object v1, v2

    :cond_3
    check-cast v1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->visibilityProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    .line 85
    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/Decorator;->getShouldShowBottomDecorator()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    .line 86
    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/Decorator;->getSize()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p1

    check-cast p1, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 87
    invoke-virtual {p1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    goto :goto_0

    .line 88
    :cond_5
    instance-of v0, v0, Lcom/ibotta/android/views/list/GridLayout;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/GridLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/GridLayout;->getSpanCount()I

    move-result p1

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_12:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 88
    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/views/list/IbottaListViewDecorator;-><init>(II)V

    move-object p1, v0

    check-cast p1, Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    :goto_0
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getLayoutManager(Lcom/ibotta/android/views/list/LayoutType;)Landroid/support/v7/widget/RecyclerView$LayoutManager;
    .locals 3

    .line 132
    sget-object v0, Lcom/ibotta/android/views/list/VerticalLayout;->INSTANCE:Lcom/ibotta/android/views/list/VerticalLayout;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {p1, v0, v2, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutManager;

    goto :goto_0

    .line 133
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/list/HorizontalLayout;->INSTANCE:Lcom/ibotta/android/views/list/HorizontalLayout;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0, v1, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutManager;

    goto :goto_0

    .line 134
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/views/list/GridLayout;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast p1, Lcom/ibotta/android/views/list/GridLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/GridLayout;->getSpanCount()I

    move-result p1

    invoke-direct {v0, v1, p1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    move-object p1, v0

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutManager;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final initDecorator(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getDecorator()Lcom/ibotta/android/views/list/Decorator;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->itemDecoration:Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/list/IbottaListView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 128
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->getDecorator(Lcom/ibotta/android/views/list/IbottaListViewState;)Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->itemDecoration:Landroid/support/v7/widget/RecyclerView$ItemDecoration;

    return-void
.end method

.method private final initLayoutManager(Lcom/ibotta/android/views/list/LayoutType;)V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 110
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->getLayoutManager(Lcom/ibotta/android/views/list/LayoutType;)Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 111
    iget-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    .line 112
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    .line 114
    :cond_2
    new-instance p1, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    move-object v1, p0

    check-cast v1, Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p1, v1}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    .line 115
    new-instance p1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    check-cast v1, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    move-object v2, p0

    check-cast v2, Landroid/view/View;

    invoke-direct {p1, v1, v2}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    const-string v1, "IbottaListView"

    .line 116
    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->adapter:Lcom/ibotta/android/views/list/IbottaListViewAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->getIbottaListViewTracking()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    .line 115
    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    return-void
.end method

.method private final initPadding(Lcom/ibotta/android/views/list/Padding;)V
    .locals 4

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/Padding;->getPaddingLeft()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/Padding;->getPaddingTop()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/Padding;->getPaddingRight()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/Padding;->getPaddingBottom()I

    move-result p1

    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 63
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setPadding(IIII)V

    const/4 p1, 0x0

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setClipToPadding(Z)V

    return-void
.end method

.method private final initSnapHelper(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->snapHelper:Landroid/support/v7/widget/SnapHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getUseSnapHelper()Z

    move-result p1

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SnapHelper;->attachToRecyclerView(Landroid/support/v7/widget/RecyclerView;)V

    return-void
.end method

.method private final onVisibilityChanged()V
    .locals 4

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getVisibility()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getWindowVisibility()I

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v3}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getWindowVisibility()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/list/IbottaListView;->onVisibilityChanged(Z)V

    return-void
.end method

.method private final visibilityProvider(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
            ">;)",
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Integer;",
            "Landroid/support/v7/widget/RecyclerView;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 94
    new-instance v0, Lcom/ibotta/android/views/list/IbottaListView$visibilityProvider$1;

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView$visibilityProvider$1;-><init>(Ljava/util/Set;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->adapter:Lcom/ibotta/android/views/list/IbottaListViewAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    .line 156
    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 3

    .line 161
    invoke-virtual {p0}, Lcom/ibotta/android/views/list/IbottaListView;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 163
    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/list/IbottaListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/list/IbottaListView;->getChildViewHolder(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v2

    if-eqz v2, :cond_0

    check-cast v2, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;

    .line 164
    invoke-virtual {v2, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;->onVisibilityChanged(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 163
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type com.ibotta.android.views.list.holder.IbottaListViewHolder<*, *>"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 166
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    :cond_2
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    .line 53
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onWindowVisibilityChanged(I)V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/views/list/IbottaListView;->onVisibilityChanged()V

    return-void
.end method

.method public setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)Ljava/lang/Void;
    .locals 1
    .param p1    # Landroid/support/v7/widget/RecyclerView$Adapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/widget/RecyclerView$Adapter<",
            "*>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 45
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not permitted on instances of IbottaListView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public bridge synthetic setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)Ljava/lang/Void;

    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .line 48
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/views/list/IbottaListView;->onVisibilityChanged()V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 21
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getPadding()Lcom/ibotta/android/views/list/Padding;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/list/IbottaListView;->initPadding(Lcom/ibotta/android/views/list/Padding;)V

    .line 145
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->initSnapHelper(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 146
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getLayoutType()Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/list/IbottaListView;->initLayoutManager(Lcom/ibotta/android/views/list/LayoutType;)V

    .line 147
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->initDecorator(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView;->adapter:Lcom/ibotta/android/views/list/IbottaListViewAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 151
    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    return-void
.end method
