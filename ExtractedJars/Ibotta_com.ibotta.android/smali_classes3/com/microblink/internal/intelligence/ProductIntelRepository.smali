.class public final Lcom/microblink/internal/intelligence/ProductIntelRepository;
.super Ljava/lang/Object;


# instance fields
.field private service:Lcom/microblink/internal/intelligence/ProductIntelService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/internal/intelligence/ProductIntelServiceImpl;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/internal/intelligence/ProductIntelServiceImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/internal/intelligence/ProductIntelRepository;->service:Lcom/microblink/internal/intelligence/ProductIntelService;

    return-void
.end method


# virtual methods
.method public final parse(Ljava/lang/String;)Lcom/microblink/internal/intelligence/ProductIntelKey;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/intelligence/ProductIntelRepository;->service:Lcom/microblink/internal/intelligence/ProductIntelService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/intelligence/ProductIntelService;->parse(Ljava/lang/String;)Lcom/microblink/internal/intelligence/ProductIntelKey;

    move-result-object p1

    return-object p1
.end method

.method public final products(Ljava/util/List;I)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/intelligence/ProductIntelRepository;->service:Lcom/microblink/internal/intelligence/ProductIntelService;

    invoke-interface {v0, p1, p2}, Lcom/microblink/internal/intelligence/ProductIntelService;->products(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
