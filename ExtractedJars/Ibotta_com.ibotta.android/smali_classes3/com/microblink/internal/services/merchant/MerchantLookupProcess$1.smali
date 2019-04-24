.class Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/merchant/MerchantDetection;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

.field final synthetic val$index:I

.field final synthetic val$listener:Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;

.field final synthetic val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

.field final synthetic val$resultMap:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;ILjava/util/Map;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->this$0:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    iput p2, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$index:I

    iput-object p3, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$resultMap:Ljava/util/Map;

    iput-object p4, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$listener:Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;

    iput-object p5, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/merchant/MerchantDetection;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/merchant/MerchantDetection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    iget v0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$index:I

    add-int/lit8 v0, v0, 0x1

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$resultMap:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->this$0:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    invoke-static {v1}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->access$000(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;)Lcom/microblink/internal/merchant/MerchantResultValidator;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/microblink/internal/merchant/MerchantResultValidator;->valid(Lcom/microblink/internal/merchant/MerchantResult;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->this$0:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    invoke-static {v1}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->access$100(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->this$0:Lcom/microblink/internal/services/merchant/MerchantLookupProcess;

    iget-object v1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    iget-object v2, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$listener:Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;

    iget-object v3, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$resultMap:Ljava/util/Map;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->access$200(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;ILcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Ljava/util/Map;)V

    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$listener:Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;

    iget-object v1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    iget-object v2, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->val$resultMap:Ljava/util/Map;

    invoke-interface {v0, v1, p1, v2}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;->onComplete(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/merchant/MerchantResult;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "MerchantLookupProcess"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/merchant/MerchantDetection;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;->onComplete(Lcom/microblink/internal/merchant/MerchantDetection;)V

    return-void
.end method
