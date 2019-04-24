.class final Lcom/microblink/internal/intelligence/ProductIntelServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/intelligence/ProductIntelService;


# static fields
.field private static final TAG:Ljava/lang/String; = "ProductIntelServiceImpl"


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/intelligence/ProductIntelServiceImpl;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final parse(Ljava/lang/String;)Lcom/microblink/internal/intelligence/ProductIntelKey;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "\\|"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object v1, p1, v0

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const/4 v3, 0x1

    aget-object p1, p1, v3

    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    new-instance v2, Lcom/microblink/internal/intelligence/ProductIntelKey;

    invoke-direct {v2, v1, p1}, Lcom/microblink/internal/intelligence/ProductIntelKey;-><init>(Ljava/lang/String;Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    const-string v1, "ProductIntelServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final products(Ljava/util/List;I)Ljava/util/List;
    .locals 8
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

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Lcom/microblink/ReceiptSdk;->productIntelligenceKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/OcrProduct;

    if-eqz v3, :cond_0

    new-instance v4, Lcom/microblink/internal/services/product/ProductLookupItem;

    iget-object v5, v3, Lcom/microblink/internal/OcrProduct;->description:Ljava/lang/String;

    iget-object v6, v3, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    iget v7, v3, Lcom/microblink/internal/OcrProduct;->price:F

    iget v3, v3, Lcom/microblink/internal/OcrProduct;->line:I

    invoke-direct {v4, v5, v6, v7, v3}, Lcom/microblink/internal/services/product/ProductLookupItem;-><init>(Ljava/lang/String;Ljava/lang/String;FI)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Lcom/microblink/internal/services/product/ProductLookupRepository;

    iget-object v3, p0, Lcom/microblink/internal/intelligence/ProductIntelServiceImpl;->context:Landroid/content/Context;

    new-instance v4, Lcom/microblink/internal/services/product/ProductServiceImpl;

    invoke-direct {v4}, Lcom/microblink/internal/services/product/ProductServiceImpl;-><init>()V

    invoke-direct {v2, v3, v4}, Lcom/microblink/internal/services/product/ProductLookupRepository;-><init>(Landroid/content/Context;Lcom/microblink/internal/services/product/ProductService;)V

    new-instance v3, Lcom/microblink/internal/ProductIntelligenceMapper;

    invoke-direct {v3, p1, v1}, Lcom/microblink/internal/ProductIntelligenceMapper;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->productIntelligenceKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v1, p2, v3, v4}, Lcom/microblink/internal/services/product/ProductLookupRepository;->execute(Ljava/util/List;ILcom/microblink/internal/ProductIntelligenceMapper;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/ProductSummary;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/microblink/internal/ProductSummary;->product()Lcom/microblink/Product;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p2, Lcom/microblink/internal/ProductMapper;

    invoke-direct {p2}, Lcom/microblink/internal/ProductMapper;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/OcrProduct;

    if-eqz v1, :cond_4

    invoke-virtual {p2, v1}, Lcom/microblink/internal/ProductMapper;->transform(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Product;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p1, Lcom/microblink/LineNumberComparator;

    invoke-direct {p1}, Lcom/microblink/LineNumberComparator;-><init>()V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_6
    return-object v0
.end method
