.class public final Lcom/microblink/internal/services/product/ProductServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/product/ProductService;


# static fields
.field private static final BANNER_ID_KEY:Ljava/lang/String; = "banner_id"

.field private static EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse; = null

.field private static final RPN_KEY:Ljava/lang/String; = "products[%d][rpn]"

.field private static final RSD_KEY:Ljava/lang/String; = "products[%d][rsd]"

.field private static final TAG:Ljava/lang/String; = "ProductServiceImpl"

.field private static final UNIT_PRICE_KEY:Ljava/lang/String; = "products[%d][unit_price]"


# instance fields
.field private calls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lretrofit2/Call;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/product/ProductLookupResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/product/ProductLookupResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/product/ProductServiceImpl;->calls:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/product/ProductLookupResponse;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    return-object v0
.end method

.method private query(Ljava/util/List;I)Ljava/util/Map;
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "banner_id"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%d"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v6, 0x0

    aput-object p2, v5, v6

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/product/ProductLookupItem;

    invoke-virtual {v1}, Lcom/microblink/internal/services/product/ProductLookupItem;->description()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "products[%d][rsd]"

    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-static {v3, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, " "

    const-string v7, "+"

    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1}, Lcom/microblink/internal/services/product/ProductLookupItem;->productNumber()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/microblink/internal/services/product/ProductLookupItem;->productNumber()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "products[%d][rpn]"

    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-static {v3, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v1}, Lcom/microblink/internal/services/product/ProductLookupItem;->unitPrice()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "products[%d][unit_price]"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "%.2f"

    new-array v7, v4, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/microblink/internal/services/product/ProductLookupItem;->unitPrice()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v7, v6

    invoke-static {v3, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto/16 :goto_0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductServiceImpl;->calls:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Ljava/util/List;)V

    return-void
.end method

.method public final enqueue(ILjava/util/List;Lcom/microblink/OnCompleteListener;)V
    .locals 3
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

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "ProductServiceImpl"

    const-string p2, "product look up searches array is null or empty!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    invoke-interface {p3, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-class v1, Lcom/microblink/internal/services/product/ProductLookupApiService;

    invoke-static {v1}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/product/ProductLookupApiService;

    const-string v2, "https://licensing.blinkreceipt.com/api/products/product_intelligence_lookup"

    invoke-direct {p0, p2, p1}, Lcom/microblink/internal/services/product/ProductServiceImpl;->query(Ljava/util/List;I)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/microblink/internal/services/product/ProductLookupApiService;->execute(Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/internal/services/product/ProductServiceImpl;->calls:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lcom/microblink/internal/services/product/ProductServiceImpl$1;

    invoke-direct {p2, p0, p3}, Lcom/microblink/internal/services/product/ProductServiceImpl$1;-><init>(Lcom/microblink/internal/services/product/ProductServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "ProductServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    invoke-interface {p3, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final execute(ILjava/util/List;)Lcom/microblink/internal/services/product/ProductLookupResponse;
    .locals 2
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

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "ProductServiceImpl"

    const-string p2, "product look up searches array is null or empty!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    return-object p1

    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/microblink/internal/services/product/ProductServiceImpl;->query(Ljava/util/List;I)Ljava/util/Map;

    move-result-object p1

    const-class p2, Lcom/microblink/internal/services/product/ProductLookupApiService;

    invoke-static {p2}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/microblink/internal/services/product/ProductLookupApiService;

    const-string v1, "https://licensing.blinkreceipt.com/api/products/product_intelligence_lookup"

    invoke-interface {p2, v1, p1}, Lcom/microblink/internal/services/product/ProductLookupApiService;->execute(Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/internal/services/product/ProductServiceImpl;->calls:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/product/ProductLookupResponse;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    return-object p1

    :cond_2
    const-string p2, "ProductServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "ProductServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/product/ProductServiceImpl;->EMPTY:Lcom/microblink/internal/services/product/ProductLookupResponse;

    return-object p1
.end method
