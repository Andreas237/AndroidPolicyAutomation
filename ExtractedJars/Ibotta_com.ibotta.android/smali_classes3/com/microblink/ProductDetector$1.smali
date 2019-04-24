.class Lcom/microblink/ProductDetector$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnNullableCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnNullableCompleteListener<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/ProductSummary;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/ProductDetector;


# direct methods
.method constructor <init>(Lcom/microblink/ProductDetector;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/ProductDetector$1;->this$0:Lcom/microblink/ProductDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/ProductDetector$1;->onComplete(Ljava/util/List;)V

    return-void
.end method

.method public onComplete(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/ProductSummary;",
            ">;)V"
        }
    .end annotation

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

    check-cast v0, Lcom/microblink/internal/ProductSummary;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/ProductSummary;->ocrProduct()Lcom/microblink/internal/OcrProduct;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/ProductDetector$1;->this$0:Lcom/microblink/ProductDetector;

    invoke-static {v1}, Lcom/microblink/ProductDetector;->access$000(Lcom/microblink/ProductDetector;)Lcom/microblink/ProductResultCoordinator;

    move-result-object v1

    invoke-virtual {v0}, Lcom/microblink/internal/ProductSummary;->ocrProduct()Lcom/microblink/internal/OcrProduct;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/microblink/ProductResultCoordinator;->storeResult(Ljava/lang/Object;Lcom/microblink/internal/ProductSummary;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/microblink/ProductDetector$1;->this$0:Lcom/microblink/ProductDetector;

    invoke-static {p1}, Lcom/microblink/ProductDetector;->access$100(Lcom/microblink/ProductDetector;)V

    return-void
.end method
