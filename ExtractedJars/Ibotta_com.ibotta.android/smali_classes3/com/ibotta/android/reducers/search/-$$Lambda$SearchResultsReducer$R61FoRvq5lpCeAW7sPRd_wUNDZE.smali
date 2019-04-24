.class public final synthetic Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/reducers/search/SearchResultsReducer;

.field private final synthetic f$1:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

.field private final synthetic f$2:Lcom/ibotta/api/model/search/SearchResults;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;->f$0:Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    iput-object p2, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;->f$1:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    iput-object p3, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;->f$2:Lcom/ibotta/api/model/search/SearchResults;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;->f$0:Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    iget-object v1, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;->f$1:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    iget-object v2, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;->f$2:Lcom/ibotta/api/model/search/SearchResults;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->lambda$getCards$5(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;Ljava/util/List;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method
