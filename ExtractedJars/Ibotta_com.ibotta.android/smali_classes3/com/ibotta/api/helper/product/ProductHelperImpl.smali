.class public Lcom/ibotta/api/helper/product/ProductHelperImpl;
.super Ljava/lang/Object;
.source "ProductHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/product/ProductHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$findProductById$0(Ljava/lang/String;Lcom/ibotta/api/model/ProductModel;)Z
    .locals 0

    .line 20
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getIdString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public findProductById(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/api/model/ProductModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ProductModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/api/model/ProductModel;"
        }
    .end annotation

    .line 17
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/helper/product/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;->INSTANCE:Lcom/ibotta/api/helper/product/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;

    .line 18
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;->INSTANCE:Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;

    .line 19
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElseGet(Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava9/util/stream/Stream;

    new-instance v0, Lcom/ibotta/api/helper/product/-$$Lambda$ProductHelperImpl$v_3AFg9qGBoRRZL9Ekpw_r-Rd90;

    invoke-direct {v0, p2}, Lcom/ibotta/api/helper/product/-$$Lambda$ProductHelperImpl$v_3AFg9qGBoRRZL9Ekpw_r-Rd90;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/ProductModel;

    return-object p1
.end method
