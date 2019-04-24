.class public Lcom/microblink/internal/services/google/GooglePlacesRequest;
.super Ljava/lang/Object;


# instance fields
.field private apiKey:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private placesId:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
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
.method public apiKey(Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlacesRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->apiKey:Ljava/lang/String;

    return-object p0
.end method

.method public apiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public phoneNumber(Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlacesRequest;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->phoneNumber:Ljava/lang/String;

    return-object p0
.end method

.method public phoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public placesId(Ljava/util/List;)Lcom/microblink/internal/services/google/GooglePlacesRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/internal/services/google/GooglePlacesRequest;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->placesId:Ljava/util/List;

    return-object p0
.end method

.method placesId()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->placesId:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GooglePlacesRequest{apiKey=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->apiKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", placesId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->placesId:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", number=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/google/GooglePlacesRequest;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
