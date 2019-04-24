.class public Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/microblink/internal/services/google/NearbySearchResults;",
        ">;"
    }
.end annotation


# instance fields
.field private final request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;->request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    return-void
.end method


# virtual methods
.method public call()Lcom/microblink/internal/services/google/NearbySearchResults;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;-><init>()V

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;->request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/google/NearbySearchResults;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;->call()Lcom/microblink/internal/services/google/NearbySearchResults;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GoogleNearbySearchCallable{request="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleNearbySearchCallable;->request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
