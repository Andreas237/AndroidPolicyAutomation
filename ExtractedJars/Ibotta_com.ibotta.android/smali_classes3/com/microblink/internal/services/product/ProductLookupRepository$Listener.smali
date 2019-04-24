.class public interface abstract Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/services/product/ProductLookupRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onComplete(Ljava/util/List;Ljava/util/List;)V
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/ProductSummary;",
            ">;)V"
        }
    .end annotation
.end method
