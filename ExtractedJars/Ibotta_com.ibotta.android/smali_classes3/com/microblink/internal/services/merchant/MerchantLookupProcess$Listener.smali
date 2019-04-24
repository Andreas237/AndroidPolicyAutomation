.class public interface abstract Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/services/merchant/MerchantLookupProcess;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onComplete(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/merchant/MerchantResult;Ljava/util/Map;)V
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;)V"
        }
    .end annotation
.end method
