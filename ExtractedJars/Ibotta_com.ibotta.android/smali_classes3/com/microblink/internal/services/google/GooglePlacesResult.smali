.class public Lcom/microblink/internal/services/google/GooglePlacesResult;
.super Ljava/lang/Object;


# instance fields
.field private phoneNumber:Ljava/lang/String;

.field private response:Lcom/microblink/internal/services/google/GoogleLookupResponse;

.field private responses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/google/GooglePlaceResponse;",
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
.method public phoneNumber(Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlacesResult;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->phoneNumber:Ljava/lang/String;

    return-object p0
.end method

.method public phoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public response()Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->response:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object v0
.end method

.method response(Lcom/microblink/internal/services/google/GoogleLookupResponse;)Lcom/microblink/internal/services/google/GooglePlacesResult;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->response:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p0
.end method

.method public responses(Ljava/util/List;)Lcom/microblink/internal/services/google/GooglePlacesResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/google/GooglePlaceResponse;",
            ">;)",
            "Lcom/microblink/internal/services/google/GooglePlacesResult;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->responses:Ljava/util/List;

    return-object p0
.end method

.method public responses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/google/GooglePlaceResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->responses:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GooglePlacesResult{responses="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->responses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->response:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", number=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/google/GooglePlacesResult;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
