.class public final Lcom/ibotta/android/featured/BannerReducer;
.super Ljava/lang/Object;
.source "BannerReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBannerReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerReducer.kt\ncom/ibotta/android/featured/BannerReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1301#2:32\n1370#2,3:33\n*E\n*S KotlinDebug\n*F\n+ 1 BannerReducer.kt\ncom/ibotta/android/featured/BannerReducer\n*L\n19#1:32\n19#1,3:33\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J7\u0010\u0003\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/featured/BannerReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/views/featured/BannerViewState;",
        "featureModel",
        "Lcom/ibotta/api/model/FeatureModel;",
        "Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "featureModels",
        "",
        "eventContext",
        "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
        "retailerCategoryId",
        "",
        "retailerId",
        "(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)Lcom/ibotta/android/views/featured/PagingBannerViewState;",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final create(Lcom/ibotta/api/model/FeatureModel;)Lcom/ibotta/android/views/featured/BannerViewState;
    .locals 7

    .line 24
    new-instance v6, Lcom/ibotta/android/views/featured/BannerViewState;

    .line 25
    invoke-interface {p1}, Lcom/ibotta/api/model/FeatureModel;->getId()I

    move-result v1

    .line 26
    invoke-interface {p1}, Lcom/ibotta/api/model/FeatureModel;->getCategoryImg()Ljava/lang/String;

    move-result-object v2

    .line 27
    invoke-interface {p1}, Lcom/ibotta/api/model/FeatureModel;->getLink()Ljava/lang/String;

    move-result-object v3

    .line 28
    invoke-interface {p1}, Lcom/ibotta/api/model/FeatureModel;->getTrackingClickUrl()Ljava/lang/String;

    move-result-object v4

    .line 29
    invoke-interface {p1}, Lcom/ibotta/api/model/FeatureModel;->getTrackingImpressionUrl()Ljava/lang/String;

    move-result-object v5

    move-object v0, v6

    .line 24
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/featured/BannerViewState;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public static synthetic create$default(Lcom/ibotta/android/featured/BannerReducer;Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;ILjava/lang/Object;)Lcom/ibotta/android/views/featured/PagingBannerViewState;
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 18
    check-cast p4, Ljava/lang/Integer;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/featured/BannerReducer;->create(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;I)Lcom/ibotta/android/views/featured/PagingBannerViewState;
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
            "I)",
            "Lcom/ibotta/android/views/featured/PagingBannerViewState;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-static/range {v0 .. v6}, Lcom/ibotta/android/featured/BannerReducer;->create$default(Lcom/ibotta/android/featured/BannerReducer;Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;ILjava/lang/Object;)Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)Lcom/ibotta/android/views/featured/PagingBannerViewState;
    .locals 10
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
            "I",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/ibotta/android/views/featured/PagingBannerViewState;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "featureModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    check-cast p1, Ljava/lang/Iterable;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 34
    check-cast v1, Lcom/ibotta/api/model/FeatureModel;

    .line 19
    invoke-direct {p0, v1}, Lcom/ibotta/android/featured/BannerReducer;->create(Lcom/ibotta/api/model/FeatureModel;)Lcom/ibotta/android/views/featured/BannerViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_0
    move-object v3, v0

    check-cast v3, Ljava/util/List;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const/4 v9, 0x0

    .line 18
    new-instance p1, Lcom/ibotta/android/views/featured/PagingBannerViewState;

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/views/featured/PagingBannerViewState;-><init>(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
