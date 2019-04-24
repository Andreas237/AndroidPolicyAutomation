.class public final Lcom/ibotta/android/views/categories/RetailerCategoriesView;
.super Landroid/widget/LinearLayout;
.source "RetailerCategoriesView.kt"

# interfaces
.implements Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRetailerCategoriesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailerCategoriesView.kt\ncom/ibotta/android/views/categories/RetailerCategoriesView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1311#2:94\n1342#2,4:95\n*E\n*S KotlinDebug\n*F\n+ 1 RetailerCategoriesView.kt\ncom/ibotta/android/views/categories/RetailerCategoriesView\n*L\n62#1:94\n62#1,4:95\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\nJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/ibotta/android/views/categories/RetailerCategoriesView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvents",
        "viewState",
        "addCategory",
        "",
        "categoryViewState",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
        "addDivider",
        "bindViewEvents",
        "createCategory",
        "index",
        "totalCategories",
        "initLayout",
        "onRetailerCategoryClicked",
        "contentId",
        "Lcom/ibotta/android/apiandroid/content/ContentId;",
        "setTopMargin",
        "topMargin",
        "updateCategories",
        "updateTitleBar",
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

.field private viewEvents:Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;

.field private viewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;


# direct methods
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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance p1, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    const/4 p2, 0x0

    const/4 p3, 0x3

    invoke-direct {p1, p2, p2, p3, p2}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->viewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->initLayout()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 17
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 18
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final addCategory(Lcom/ibotta/android/views/categories/RetailerCategoryViewState;)V
    .locals 7

    .line 86
    new-instance v6, Lcom/ibotta/android/views/categories/RetailerCategoryView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/categories/RetailerCategoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    invoke-virtual {v6, p1}, Lcom/ibotta/android/views/categories/RetailerCategoryView;->updateViewState(Lcom/ibotta/android/views/categories/RetailerCategoryViewState;)V

    .line 88
    move-object p1, p0

    check-cast p1, Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;

    invoke-virtual {v6, p1}, Lcom/ibotta/android/views/categories/RetailerCategoryView;->bindViewEvents(Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;)V

    .line 90
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p1, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 91
    sget v0, Lcom/ibotta/views/R$id;->llRows:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    check-cast v6, Landroid/view/View;

    check-cast p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v6, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final addDivider()V
    .locals 4

    .line 75
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    .line 75
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_12:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 79
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/ibotta/views/R$color;->gray_dd:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 82
    sget v2, Lcom/ibotta/views/R$id;->llRows:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final createCategory(IILcom/ibotta/android/views/categories/RetailerCategoryViewState;)V
    .locals 0

    if-nez p1, :cond_0

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->addDivider()V

    .line 69
    :cond_0
    invoke-direct {p0, p3}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->addCategory(Lcom/ibotta/android/views/categories/RetailerCategoryViewState;)V

    add-int/lit8 p2, p2, -0x1

    if-eq p1, p2, :cond_1

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->addDivider()V

    :cond_1
    return-void
.end method

.method private final initLayout()V
    .locals 4

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$layout;->view_retailer_categories:I

    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->setOrientation(I)V

    .line 32
    sget v0, Lcom/ibotta/views/R$id;->llRows:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    return-void
.end method

.method private final updateCategories(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V
    .locals 6

    .line 60
    sget v0, Lcom/ibotta/views/R$id;->llRows:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->getCategories()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 96
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    .line 97
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Lcom/ibotta/android/views/categories/RetailerCategoryViewState;

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->getCategories()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {p0, v2, v5, v3}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->createCategory(IILcom/ibotta/android/views/categories/RetailerCategoryViewState;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    .line 98
    :cond_1
    check-cast v1, Ljava/util/List;

    return-void
.end method

.method private final updateTitleBar(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V
    .locals 1

    .line 56
    sget v0, Lcom/ibotta/views/R$id;->tbvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->viewEvents:Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->bindViewEvents(Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;)V

    return-void
.end method

.method public onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/apiandroid/content/ContentId;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->viewEvents:Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;->onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method public final setTopMargin(I)V
    .locals 2

    .line 52
    sget v0, Lcom/ibotta/views/R$id;->tbvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v1, "tbvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    return-void

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public updateViewState(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->viewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 38
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->updateTitleBar(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->updateCategories(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->viewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->updateViewState(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V

    return-void
.end method
