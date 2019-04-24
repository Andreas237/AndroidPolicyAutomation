.class Lcom/microblink/ProductIntelligenceLookup$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;


# instance fields
.field final synthetic this$0:Lcom/microblink/ProductIntelligenceLookup;

.field final synthetic val$listener:Lcom/microblink/OnNullableCompleteListener;

.field final synthetic val$products:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/microblink/ProductIntelligenceLookup;Ljava/util/List;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/ProductIntelligenceLookup$1;->this$0:Lcom/microblink/ProductIntelligenceLookup;

    iput-object p2, p0, Lcom/microblink/ProductIntelligenceLookup$1;->val$products:Ljava/util/List;

    iput-object p3, p0, Lcom/microblink/ProductIntelligenceLookup$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/util/List;Ljava/util/List;)V
    .locals 3
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

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/microblink/ProductIntelligenceLookup$1;->val$products:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/OcrProduct;

    new-instance v1, Lcom/microblink/internal/ProductSummary;

    invoke-direct {v1}, Lcom/microblink/internal/ProductSummary;-><init>()V

    iget-object v2, p0, Lcom/microblink/ProductIntelligenceLookup$1;->this$0:Lcom/microblink/ProductIntelligenceLookup;

    invoke-static {v2}, Lcom/microblink/ProductIntelligenceLookup;->access$000(Lcom/microblink/ProductIntelligenceLookup;)Lcom/microblink/internal/ProductMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/microblink/internal/ProductMapper;->transform(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Product;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/microblink/internal/ProductSummary;->product(Lcom/microblink/Product;)Lcom/microblink/internal/ProductSummary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/microblink/internal/ProductSummary;->ocrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/internal/ProductSummary;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, p0, Lcom/microblink/ProductIntelligenceLookup$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-interface {p2, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
