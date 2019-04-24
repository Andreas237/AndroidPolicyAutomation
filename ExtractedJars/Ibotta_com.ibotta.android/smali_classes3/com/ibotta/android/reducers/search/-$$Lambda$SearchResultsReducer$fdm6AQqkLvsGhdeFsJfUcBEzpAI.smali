.class public final synthetic Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/reducers/search/SearchResultsReducer;

.field private final synthetic f$1:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final synthetic f$2:Lcom/ibotta/api/model/search/SearchResults;

.field private final synthetic f$3:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private final synthetic f$4:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$0:Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    iput-object p2, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$1:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p3, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$2:Lcom/ibotta/api/model/search/SearchResults;

    iput-object p4, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$3:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    iput-object p5, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$4:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

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
    .locals 6

    iget-object v0, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$0:Lcom/ibotta/android/reducers/search/SearchResultsReducer;

    iget-object v1, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$1:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$2:Lcom/ibotta/api/model/search/SearchResults;

    iget-object v3, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$3:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    iget-object v4, p0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;->f$4:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-object v5, p1

    check-cast v5, Lcom/ibotta/api/model/base/Module;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->lambda$getSearchContentStream$0(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/base/Module;)Ljava9/util/stream/Stream;

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
