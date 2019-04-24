.class Lcom/microblink/internal/services/product/ProductLookupRepository$1;
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

.field final synthetic val$listener:Lcom/microblink/OnCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/product/ProductLookupRepository;Lcom/microblink/OnCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$1;->this$0:Lcom/microblink/internal/services/product/ProductLookupRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/product/ProductLookupResponse;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/services/product/ProductLookupResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductLookupRepository$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/product/ProductLookupResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/product/ProductLookupRepository$1;->onComplete(Lcom/microblink/internal/services/product/ProductLookupResponse;)V

    return-void
.end method
