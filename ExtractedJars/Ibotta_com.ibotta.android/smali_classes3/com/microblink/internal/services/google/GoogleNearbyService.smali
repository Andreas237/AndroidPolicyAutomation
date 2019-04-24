.class public interface abstract Lcom/microblink/internal/services/google/GoogleNearbyService;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# virtual methods
.method public abstract enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/NearbySearchResults;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/google/NearbySearchResults;
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
