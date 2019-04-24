.class public Lcom/microblink/ProductLookupImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/ProductLookup;


# instance fields
.field private final mapper:Lcom/microblink/internal/ProductMapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/internal/ProductMapper;

    invoke-direct {v0}, Lcom/microblink/internal/ProductMapper;-><init>()V

    iput-object v0, p0, Lcom/microblink/ProductLookupImpl;->mapper:Lcom/microblink/internal/ProductMapper;

    return-void
.end method


# virtual methods
.method public products(Ljava/util/List;ILcom/microblink/OnNullableCompleteListener;)V
    .locals 3
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

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/OcrProduct;

    new-instance v1, Lcom/microblink/internal/ProductSummary;

    invoke-direct {v1}, Lcom/microblink/internal/ProductSummary;-><init>()V

    iget-object v2, p0, Lcom/microblink/ProductLookupImpl;->mapper:Lcom/microblink/internal/ProductMapper;

    invoke-virtual {v2, v0}, Lcom/microblink/internal/ProductMapper;->transform(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Product;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/microblink/internal/ProductSummary;->product(Lcom/microblink/Product;)Lcom/microblink/internal/ProductSummary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/microblink/internal/ProductSummary;->ocrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/internal/ProductSummary;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p3, p2}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
