.class public final Lcom/ibotta/android/search/SuggestedSearchItemsReducer;
.super Ljava/lang/Object;
.source "SuggestedSearchItemsReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSuggestedSearchItemsReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestedSearchItemsReducer.kt\ncom/ibotta/android/search/SuggestedSearchItemsReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1311#2:143\n1342#2,4:144\n1301#2:148\n1370#2,3:149\n*E\n*S KotlinDebug\n*F\n+ 1 SuggestedSearchItemsReducer.kt\ncom/ibotta/android/search/SuggestedSearchItemsReducer\n*L\n66#1:143\n66#1,4:144\n141#1:148\n141#1,3:149\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ4\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\n \u0014*\u0004\u0018\u00010 0 2\u0006\u0010\"\u001a\u00020 H\u0002J<\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010$\u001a\u00020 H\u0002J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020 H\u0002J(\u0010(\u001a\n \u0014*\u0004\u0018\u00010 0 2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00100\u001a\u00020-2\u0006\u0010)\u001a\u00020 H\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00102\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0002J\u0016\u00103\u001a\u0008\u0012\u0004\u0012\u0002040\u00102\u0006\u0010,\u001a\u00020-H\u0002J\"\u00105\u001a\u0008\u0012\u0004\u0012\u00020/0\u0010*\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "suggestedSearchItemCtaButtonReducer",
        "Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;",
        "ibottaListViewStyleReducer",
        "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "retailerHorizListReducer",
        "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
        "variantFactory",
        "Lcom/ibotta/android/features/factory/VariantFactory;",
        "(Landroid/content/res/Resources;Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)V",
        "barcodeScanRow",
        "",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "recentlyViewedOffersTitle",
        "",
        "kotlin.jvm.PlatformType",
        "create",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "mode",
        "Lcom/ibotta/android/search/SuggestedSearchMode;",
        "isSearchingForRetailers",
        "",
        "suggestedSearches",
        "Lcom/ibotta/api/model/search/SuggestedSearches;",
        "recentlyViewedRetailers",
        "Lcom/ibotta/api/model/RetailerModel;",
        "initialPayload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "createRecentRetailersTrackingPayload",
        "inputPayload",
        "getPrependedViewStates",
        "payload",
        "getRecentSearchesTitleRow",
        "Lcom/ibotta/android/views/list/NoRowViewState;",
        "getRecentlyViewedRetailers",
        "getTrackingPayload",
        "contentTrackingPayload",
        "index",
        "",
        "suggestedSearchItem",
        "Lcom/ibotta/api/model/search/SuggestedSearchItem;",
        "getViewState",
        "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;",
        "searchItem",
        "isEntireRowSelectable",
        "isRecentIconShown",
        "mapHighlightsToSpans",
        "Lcom/ibotta/android/views/search/suggested/TextSpan;",
        "toViewStates",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final barcodeScanRow:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

.field private final recentlyViewedOffersTitle:Ljava/lang/String;

.field private final retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

.field private final suggestedSearchItemCtaButtonReducer:Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field private final variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)V
    .locals 9
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/title/TitleBarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/horiz/RetailerHorizListReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/features/factory/VariantFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suggestedSearchItemCtaButtonReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaListViewStyleReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleBarReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerHorizListReducer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variantFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->suggestedSearchItemCtaButtonReducer:Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

    iput-object p3, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    iput-object p4, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    iput-object p5, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    iput-object p6, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;

    const/4 p2, 0x2

    .line 43
    new-array p2, p2, [Lcom/ibotta/android/views/list/ContentViewState;

    .line 44
    sget-object p3, Lcom/ibotta/android/views/list/NoRowViewState;->DECORATION_VIEW:Lcom/ibotta/android/views/list/NoRowViewState;

    check-cast p3, Lcom/ibotta/android/views/list/ContentViewState;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    .line 45
    new-instance p3, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    .line 46
    sget p4, Lcom/ibotta/android/reducers/R$string;->search_by_barcode:I

    invoke-virtual {p1, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string p4, "resources.getString(R.string.search_by_barcode)"

    invoke-static {v1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object p4, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->suggestedSearchItemCtaButtonReducer:Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

    sget-object p5, Lcom/ibotta/android/search/Barcode;->INSTANCE:Lcom/ibotta/android/search/Barcode;

    check-cast p5, Lcom/ibotta/android/search/ButtonType;

    invoke-virtual {p4, p5}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;->create(Lcom/ibotta/android/search/ButtonType;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x38

    const/4 v8, 0x0

    move-object v0, p3

    .line 45
    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;ZLjava/util/List;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p3, Lcom/ibotta/android/views/list/ContentViewState;

    const/4 p4, 0x1

    aput-object p3, p2, p4

    .line 43
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->barcodeScanRow:Ljava/util/List;

    .line 50
    sget p2, Lcom/ibotta/android/reducers/R$string;->recently_viewed_retailers:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->recentlyViewedOffersTitle:Ljava/lang/String;

    return-void
.end method

.method private final createRecentRetailersTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 89
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->recentlyViewedOffersTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private final getPrependedViewStates(Lcom/ibotta/android/search/SuggestedSearchMode;ZLcom/ibotta/api/model/search/SuggestedSearches;Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/search/SuggestedSearchMode;",
            "Z",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 98
    sget-object v0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/search/SuggestedSearchMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 102
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p3}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 103
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 104
    sget-object p1, Lcom/ibotta/android/views/list/NoRowViewState;->DECORATION_VIEW:Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 99
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->barcodeScanRow:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    .line 100
    invoke-direct {p0, p4, p2, p5}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->getRecentlyViewedRetailers(Ljava/util/List;ZLcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 99
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 101
    invoke-direct {p0, p3}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->getRecentSearchesTitleRow(Lcom/ibotta/api/model/search/SuggestedSearches;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 100
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getRecentSearchesTitleRow(Lcom/ibotta/api/model/search/SuggestedSearches;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/NoRowViewState;",
            ">;"
        }
    .end annotation

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 71
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 72
    sget-object p1, Lcom/ibotta/android/views/list/NoRowViewState;->SUGGESTION_TITLE_ROW:Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getRecentlyViewedRetailers(Ljava/util/List;ZLcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;Z",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 79
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-ne p2, v2, :cond_2

    .line 80
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_2
    if-nez p2, :cond_3

    const/4 p2, 0x2

    .line 81
    new-array p2, p2, [Lcom/ibotta/android/views/list/ContentViewState;

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    iget-object v3, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->recentlyViewedOffersTitle:Ljava/lang/String;

    invoke-static {v3}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v3

    sget v4, Lcom/ibotta/android/reducers/R$dimen;->size_18:I

    invoke-virtual {v0, v3, v4}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/ContentViewState;

    aput-object v0, p2, v1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 85
    invoke-direct {p0, p3}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->createRecentRetailersTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p3

    const-string v1, "createRecentRetailersTrackingPayload(inputPayload)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-virtual {v0, p1, p3}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->createIlvs(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/ContentViewState;

    aput-object p1, p2, v2

    .line 81
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILcom/ibotta/api/model/search/SuggestedSearchItem;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 133
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->SUGGESTED_SEARCH_TERM:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->contentType(Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 134
    invoke-virtual {p3}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchTerm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->term(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 135
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 136
    invoke-virtual {p3}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchType()Lcom/ibotta/api/model/search/SearchType;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/api/model/search/SearchType;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->searchType(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private final getViewState(Lcom/ibotta/android/search/SuggestedSearchMode;Lcom/ibotta/api/model/search/SuggestedSearchItem;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;
    .locals 8

    .line 111
    new-instance v7, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    .line 112
    invoke-virtual {p2}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchTerm()Ljava/lang/String;

    move-result-object v1

    const-string v0, "searchItem.searchTerm"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    invoke-direct {p0, p2}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->isRecentIconShown(Lcom/ibotta/api/model/search/SuggestedSearchItem;)Z

    move-result v5

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->suggestedSearchItemCtaButtonReducer:Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

    new-instance v2, Lcom/ibotta/android/search/SearchTerm;

    invoke-direct {v2, p1}, Lcom/ibotta/android/search/SearchTerm;-><init>(Lcom/ibotta/android/search/SuggestedSearchMode;)V

    check-cast v2, Lcom/ibotta/android/search/ButtonType;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;->create(Lcom/ibotta/android/search/ButtonType;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v2

    .line 115
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->isEntireRowSelectable(Lcom/ibotta/android/search/SuggestedSearchMode;)Z

    move-result v3

    .line 116
    invoke-direct {p0, p2}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->mapHighlightsToSpans(Lcom/ibotta/api/model/search/SuggestedSearchItem;)Ljava/util/List;

    move-result-object v4

    .line 117
    move-object v6, p3

    check-cast v6, Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-object v0, v7

    .line 111
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;ZLjava/util/List;ZLcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-object v7
.end method

.method private final isEntireRowSelectable(Lcom/ibotta/android/search/SuggestedSearchMode;)Z
    .locals 1

    .line 124
    sget-object v0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/ibotta/android/search/SuggestedSearchMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 126
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const/4 p1, 0x1

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x0

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final isRecentIconShown(Lcom/ibotta/api/model/search/SuggestedSearchItem;)Z
    .locals 3

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;

    const-string v1, "typeahead_recent_icon"

    .line 121
    const-class v2, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;

    .line 119
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object v0

    .line 122
    check-cast v0, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;

    invoke-interface {v0, p1}, Lcom/ibotta/android/features/variant/search/typeahead/TypeAheadRecentSearchIconVariant;->isRecentIconShown(Lcom/ibotta/api/model/search/SuggestedSearchItem;)Z

    move-result p1

    return p1
.end method

.method private final mapHighlightsToSpans(Lcom/ibotta/api/model/search/SuggestedSearchItem;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;"
        }
    .end annotation

    .line 140
    new-instance v0, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchTerm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/ibotta/android/views/search/suggested/TextSpan;-><init>(II)V

    .line 141
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getHighlights()Ljava/util/List;

    move-result-object p1

    const-string v1, "suggestedSearchItem.highlights"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    .line 148
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 149
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 150
    check-cast v2, Lcom/ibotta/api/model/search/Highlight;

    .line 141
    new-instance v3, Lcom/ibotta/android/views/search/suggested/TextSpan;

    const-string v4, "it"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/ibotta/api/model/search/Highlight;->getOffset()I

    move-result v4

    invoke-virtual {v2}, Lcom/ibotta/api/model/search/Highlight;->getOffset()I

    move-result v5

    invoke-virtual {v2}, Lcom/ibotta/api/model/search/Highlight;->getLength()I

    move-result v2

    add-int/2addr v5, v2

    invoke-direct {v3, v4, v5}, Lcom/ibotta/android/views/search/suggested/TextSpan;-><init>(II)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 151
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 139
    invoke-static {v0, v1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->unspannedSpans(Lcom/ibotta/android/views/search/suggested/TextSpan;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final toViewStates(Lcom/ibotta/api/model/search/SuggestedSearches;Lcom/ibotta/android/search/SuggestedSearchMode;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 5
    .param p1    # Lcom/ibotta/api/model/search/SuggestedSearches;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            "Lcom/ibotta/android/search/SuggestedSearchMode;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;",
            ">;"
        }
    .end annotation

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object p1

    const-string v0, "suggestedSearchItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 145
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    .line 146
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v2, Lcom/ibotta/api/model/search/SuggestedSearchItem;

    const-string v4, "suggestedSearchItem"

    .line 67
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, v1, v2}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->getTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;ILcom/ibotta/api/model/search/SuggestedSearchItem;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object v1

    const-string v4, "getTrackingPayload(initi\u2026dex, suggestedSearchItem)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, v2, v1}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->getViewState(Lcom/ibotta/android/search/SuggestedSearchMode;Lcom/ibotta/api/model/search/SuggestedSearchItem;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    .line 147
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final create(Lcom/ibotta/android/search/SuggestedSearchMode;ZLcom/ibotta/api/model/search/SuggestedSearches;Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 16
    .param p1    # Lcom/ibotta/android/search/SuggestedSearchMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/api/model/search/SuggestedSearches;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/search/SuggestedSearchMode;",
            "Z",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Lcom/ibotta/android/views/list/IbottaListViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    const-string v4, "mode"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "suggestedSearches"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "recentlyViewedRetailers"

    move-object/from16 v5, p4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "initialPayload"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v4, v0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v15, Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 59
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->getPrependedViewStates(Lcom/ibotta/android/search/SuggestedSearchMode;ZLcom/ibotta/api/model/search/SuggestedSearches;Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    .line 61
    invoke-direct {v0, v2, v1, v3}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;->toViewStates(Lcom/ibotta/api/model/search/SuggestedSearches;Lcom/ibotta/android/search/SuggestedSearchMode;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    .line 62
    invoke-virtual/range {p3 .. p3}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSearchQuery()Ljava/lang/String;

    move-result-object v6

    const-string v1, "suggestedSearches.searchQuery"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x7c

    const/4 v14, 0x0

    move-object v5, v15

    .line 58
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    sget-object v1, Lcom/ibotta/android/ilv/ListType;->SUGGESTED_SEARCH_TERMS:Lcom/ibotta/android/ilv/ListType;

    .line 58
    invoke-virtual {v4, v15, v1}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->copyWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v1

    return-object v1
.end method
