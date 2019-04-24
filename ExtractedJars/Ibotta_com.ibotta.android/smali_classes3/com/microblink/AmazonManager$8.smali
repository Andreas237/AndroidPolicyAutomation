.class Lcom/microblink/AmazonManager$8;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/product/ProductLookupResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonManager;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/product/ProductLookupResponse;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/services/product/ProductLookupResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/product/ProductLookupResponse;->products()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/product/ProductResult;

    invoke-virtual {v0}, Lcom/microblink/internal/services/product/ProductResult;->product()Lcom/microblink/internal/services/product/LookedUpProduct;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/services/product/LookedUpProduct;->rpn()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v2}, Lcom/microblink/AmazonManager;->access$1500(Lcom/microblink/AmazonManager;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$700(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/amazon/AmazonOrder;

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/amazon/AmazonShipment;

    invoke-virtual {v1}, Lcom/microblink/internal/services/amazon/AmazonShipment;->products()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/amazon/AmazonProduct;

    invoke-virtual {v2}, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v3}, Lcom/microblink/AmazonManager;->access$1500(Lcom/microblink/AmazonManager;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v3}, Lcom/microblink/AmazonManager;->access$1600(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1700(Lcom/microblink/AmazonManager;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AmazonManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/AmazonManager$8;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1700(Lcom/microblink/AmazonManager;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/product/ProductLookupResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonManager$8;->onComplete(Lcom/microblink/internal/services/product/ProductLookupResponse;)V

    return-void
.end method
