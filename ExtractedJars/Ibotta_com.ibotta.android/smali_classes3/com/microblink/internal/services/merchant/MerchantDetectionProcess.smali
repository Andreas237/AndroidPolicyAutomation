.class public interface abstract Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;
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
            "Lcom/microblink/internal/merchant/MerchantDetection;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
