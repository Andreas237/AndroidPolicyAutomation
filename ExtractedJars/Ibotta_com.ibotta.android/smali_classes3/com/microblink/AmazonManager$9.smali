.class Lcom/microblink/AmazonManager$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/receipt/SummaryResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonManager;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$9;->this$0:Lcom/microblink/AmazonManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/receipt/SummaryResponse;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/services/receipt/SummaryResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "AmazonManager"

    const-string v0, "success summary response"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/receipt/SummaryResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonManager$9;->onComplete(Lcom/microblink/internal/services/receipt/SummaryResponse;)V

    return-void
.end method
