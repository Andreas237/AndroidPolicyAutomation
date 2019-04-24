.class Lcom/microblink/internal/services/product/ProductLookupRepository$2;
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
.field final synthetic this$0:Lcom/microblink/internal/services/product/ProductLookupRepository;

.field final synthetic val$listener:Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;

.field final synthetic val$mapper:Lcom/microblink/internal/ProductIntelligenceMapper;

.field final synthetic val$searches:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/product/ProductLookupRepository;Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;Ljava/util/List;Lcom/microblink/internal/ProductIntelligenceMapper;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->this$0:Lcom/microblink/internal/services/product/ProductLookupRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->val$listener:Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;

    iput-object p3, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->val$searches:Ljava/util/List;

    iput-object p4, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->val$mapper:Lcom/microblink/internal/ProductIntelligenceMapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/product/ProductLookupResponse;)V
    .locals 3
    .param p1    # Lcom/microblink/internal/services/product/ProductLookupResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->val$listener:Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;

    iget-object v1, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->val$searches:Ljava/util/List;

    iget-object v2, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->val$mapper:Lcom/microblink/internal/ProductIntelligenceMapper;

    invoke-virtual {v2, p1}, Lcom/microblink/internal/ProductIntelligenceMapper;->products(Lcom/microblink/internal/services/product/ProductLookupResponse;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;->onComplete(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/product/ProductLookupResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/product/ProductLookupRepository$2;->onComplete(Lcom/microblink/internal/services/product/ProductLookupResponse;)V

    return-void
.end method
