.class Lcom/microblink/OcrResultsRunner$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/receipt/SummaryMediaResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/OcrResultsRunner;


# direct methods
.method constructor <init>(Lcom/microblink/OcrResultsRunner;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/OcrResultsRunner$2;->this$0:Lcom/microblink/OcrResultsRunner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/receipt/SummaryMediaResponse;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/services/receipt/SummaryMediaResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "OcrResultsRunner"

    const-string v0, "success summary media response"

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

    check-cast p1, Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/OcrResultsRunner$2;->onComplete(Lcom/microblink/internal/services/receipt/SummaryMediaResponse;)V

    return-void
.end method
