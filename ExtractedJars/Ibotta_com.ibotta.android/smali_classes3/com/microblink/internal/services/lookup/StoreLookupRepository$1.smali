.class Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

.field final synthetic val$listener:Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;

.field final synthetic val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/lookup/StoreLookupRepository;Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;->this$0:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;->val$listener:Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;

    iput-object p3, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;->val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;->val$listener:Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;

    iget-object v1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;->val$request:Lcom/microblink/internal/services/lookup/StoreLookupRequest;

    iget-object v2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;->this$0:Lcom/microblink/internal/services/lookup/StoreLookupRepository;

    invoke-static {v2}, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->access$000(Lcom/microblink/internal/services/lookup/StoreLookupRepository;)Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;->onComplete(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/merchant/MerchantDetection;)V

    return-void
.end method
