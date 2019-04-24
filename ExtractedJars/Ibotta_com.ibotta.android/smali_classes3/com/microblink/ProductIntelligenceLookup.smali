.class public Lcom/microblink/ProductIntelligenceLookup;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/ProductLookup;


# instance fields
.field private final key:Ljava/lang/String;

.field private final mapper:Lcom/microblink/internal/ProductMapper;

.field private repository:Lcom/microblink/internal/services/product/ProductLookupRepository;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/internal/ProductMapper;

    invoke-direct {v0}, Lcom/microblink/internal/ProductMapper;-><init>()V

    iput-object v0, p0, Lcom/microblink/ProductIntelligenceLookup;->mapper:Lcom/microblink/internal/ProductMapper;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p2, p0, Lcom/microblink/ProductIntelligenceLookup;->key:Ljava/lang/String;

    new-instance p2, Lcom/microblink/internal/services/product/ProductLookupRepository;

    new-instance v0, Lcom/microblink/internal/services/product/ProductServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/product/ProductServiceImpl;-><init>()V

    invoke-direct {p2, p1, v0}, Lcom/microblink/internal/services/product/ProductLookupRepository;-><init>(Landroid/content/Context;Lcom/microblink/internal/services/product/ProductService;)V

    iput-object p2, p0, Lcom/microblink/ProductIntelligenceLookup;->repository:Lcom/microblink/internal/services/product/ProductLookupRepository;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/ProductIntelligenceLookup;)Lcom/microblink/internal/ProductMapper;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ProductIntelligenceLookup;->mapper:Lcom/microblink/internal/ProductMapper;

    return-object p0
.end method


# virtual methods
.method public products(Ljava/util/List;ILcom/microblink/OnNullableCompleteListener;)V
    .locals 7
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

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/OcrProduct;

    if-eqz v2, :cond_0

    new-instance v3, Lcom/microblink/internal/services/product/ProductLookupItem;

    iget-object v4, v2, Lcom/microblink/internal/OcrProduct;->description:Ljava/lang/String;

    iget-object v5, v2, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    iget v6, v2, Lcom/microblink/internal/OcrProduct;->price:F

    iget v2, v2, Lcom/microblink/internal/OcrProduct;->line:I

    invoke-direct {v3, v4, v5, v6, v2}, Lcom/microblink/internal/services/product/ProductLookupItem;-><init>(Ljava/lang/String;Ljava/lang/String;FI)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/microblink/ProductIntelligenceLookup;->repository:Lcom/microblink/internal/services/product/ProductLookupRepository;

    new-instance v3, Lcom/microblink/internal/ProductIntelligenceMapper;

    invoke-direct {v3, p1, v1}, Lcom/microblink/internal/ProductIntelligenceMapper;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-instance v4, Lcom/microblink/ProductIntelligenceLookup$1;

    invoke-direct {v4, p0, p1, p3}, Lcom/microblink/ProductIntelligenceLookup$1;-><init>(Lcom/microblink/ProductIntelligenceLookup;Ljava/util/List;Lcom/microblink/OnNullableCompleteListener;)V

    iget-object v5, p0, Lcom/microblink/ProductIntelligenceLookup;->key:Ljava/lang/String;

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/microblink/internal/services/product/ProductLookupRepository;->enqueue(Ljava/util/List;ILcom/microblink/internal/ProductIntelligenceMapper;Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;Ljava/lang/String;)V

    return-void
.end method
