.class public interface abstract Lcom/microblink/ProductLookup;
.super Ljava/lang/Object;


# virtual methods
.method public abstract products(Ljava/util/List;ILcom/microblink/OnNullableCompleteListener;)V
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;I",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/ProductSummary;",
            ">;>;)V"
        }
    .end annotation
.end method
