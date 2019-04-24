.class public interface abstract Lcom/microblink/internal/services/google/GoogleStoreService;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/lookup/StoreLookUpService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/services/lookup/StoreLookUpService<",
        "Lcom/microblink/internal/services/google/GoogleLookupResponse;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract enqueueQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/internal/services/google/GoogleQueryRequest;
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
            "Lcom/microblink/internal/services/google/GoogleQueryRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/GoogleLookupResponse;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract enqueueStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;Lcom/microblink/OnCompleteListener;)V
    .param p1    # Lcom/microblink/internal/merchant/AddressSearchRequest;
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
            "Lcom/microblink/internal/merchant/AddressSearchRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/GoogleLookupResponse;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract executeLookupStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .param p1    # Lcom/microblink/internal/merchant/AddressSearchRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract executeQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .param p1    # Lcom/microblink/internal/services/google/GoogleQueryRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
