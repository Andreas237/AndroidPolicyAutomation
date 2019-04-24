.class public interface abstract Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/services/lookup/StoreLookupRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onComplete(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/merchant/MerchantDetection;)V
    .param p2    # Lcom/microblink/internal/merchant/MerchantDetection;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
