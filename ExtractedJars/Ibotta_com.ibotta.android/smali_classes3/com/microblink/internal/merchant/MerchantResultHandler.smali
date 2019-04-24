.class public Lcom/microblink/internal/merchant/MerchantResultHandler;
.super Ljava/lang/Object;


# instance fields
.field private handlers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/microblink/internal/merchant/MerchantHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantResultHandler;->handlers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public chain(Lcom/microblink/internal/merchant/MerchantHandler;)Lcom/microblink/internal/merchant/MerchantResultHandler;
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/MerchantHandler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResultHandler;->handlers:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public determineMerchant()Lcom/microblink/internal/merchant/MerchantResult;
    .locals 2

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResultHandler;->handlers:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/merchant/MerchantHandler;

    invoke-interface {v1}, Lcom/microblink/internal/merchant/MerchantHandler;->merchantResult()Lcom/microblink/internal/merchant/MerchantResult;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
