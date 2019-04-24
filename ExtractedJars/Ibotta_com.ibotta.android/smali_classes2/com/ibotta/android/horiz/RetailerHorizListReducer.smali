.class public final Lcom/ibotta/android/horiz/RetailerHorizListReducer;
.super Ljava/lang/Object;
.source "RetailerHorizListReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRetailerHorizListReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailerHorizListReducer.kt\ncom/ibotta/android/horiz/RetailerHorizListReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1311#2:33\n1342#2,4:34\n1301#2:38\n1370#2,3:39\n*E\n*S KotlinDebug\n*F\n+ 1 RetailerHorizListReducer.kt\ncom/ibotta/android/horiz/RetailerHorizListReducer\n*L\n24#1:33\n24#1,4:34\n30#1:38\n30#1,3:39\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u001c\u0010\u000c\u001a\u00020\r2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fJ$\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
        "",
        "retailerSSCardReducer",
        "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
        "ibottaListViewStyleReducer",
        "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V",
        "create",
        "Lcom/ibotta/android/horiz/RetailerSSCardListViewState;",
        "retailerModels",
        "",
        "Lcom/ibotta/api/model/RetailerModel;",
        "createIlvs",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "contentTrackingPayload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "getRetailerSSCards",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
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
.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

.field private final retailerSSCardReducer:Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "retailerSSCardReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaListViewStyleReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->retailerSSCardReducer:Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    iput-object p2, p0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    return-void
.end method

.method private final getRetailerSSCards(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
            ">;"
        }
    .end annotation

    .line 24
    check-cast p1, Ljava/lang/Iterable;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 35
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

    .line 36
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    .line 24
    iget-object v4, p0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->retailerSSCardReducer:Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    .line 26
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object v1

    const-string v5, "contentTrackingPayload.t\u2026.listIndex(index).build()"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v4, v2, v1}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    .line 37
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/util/List;)Lcom/ibotta/android/horiz/RetailerSSCardListViewState;
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/android/horiz/RetailerSSCardListViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailerModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    check-cast p1, Ljava/lang/Iterable;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 39
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 40
    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 30
    iget-object v2, p0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->retailerSSCardReducer:Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    sget-object v3, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string v4, "NO_TRACKING"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 29
    new-instance p1, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    invoke-direct {p1, v0}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public final createIlvs(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    const-string v0, "retailerModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTrackingPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 20
    new-instance v11, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->getRetailerSSCards(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7d

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/list/IbottaListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    sget-object p1, Lcom/ibotta/android/ilv/ListType;->RETAILER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    .line 19
    invoke-virtual {v0, v11, p1}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->copyWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method
