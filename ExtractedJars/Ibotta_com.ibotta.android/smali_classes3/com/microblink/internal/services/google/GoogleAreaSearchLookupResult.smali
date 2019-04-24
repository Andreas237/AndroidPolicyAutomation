.class public Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;
.super Ljava/lang/Object;


# instance fields
.field private results:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/google/NearbySearchResults;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public nearbySearchResults(Ljava/util/List;)Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/google/NearbySearchResults;",
            ">;)",
            "Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;->results:Ljava/util/List;

    return-object p0
.end method

.method public nearbySearchResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/google/NearbySearchResults;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;->results:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GoogleAreaSearchLookupResult{nearbySearchResults="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleAreaSearchLookupResult;->results:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
