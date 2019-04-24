.class public interface abstract Lcom/microblink/internal/services/product/ProductService;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# virtual methods
.method public abstract enqueue(ILjava/util/List;Lcom/microblink/OnCompleteListener;)V
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/product/ProductLookupResponse;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract execute(ILjava/util/List;)Lcom/microblink/internal/services/product/ProductLookupResponse;
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;)",
            "Lcom/microblink/internal/services/product/ProductLookupResponse;"
        }
    .end annotation
.end method
