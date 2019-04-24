.class Lcom/microblink/internal/services/ip/LocationLookupRepository$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/ip/LocationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/ip/LocationLookupRepository;

.field final synthetic val$listener:Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/ip/LocationLookupRepository;Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/ip/LocationLookupRepository$1;->this$0:Lcom/microblink/internal/services/ip/LocationLookupRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/ip/LocationLookupRepository$1;->val$listener:Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/ip/LocationResult;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/services/ip/LocationResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/ip/LocationLookupRepository$1;->val$listener:Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;->onLocationChange(Lcom/microblink/internal/services/ip/LocationResult;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/ip/LocationResult;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/ip/LocationLookupRepository$1;->onComplete(Lcom/microblink/internal/services/ip/LocationResult;)V

    return-void
.end method
