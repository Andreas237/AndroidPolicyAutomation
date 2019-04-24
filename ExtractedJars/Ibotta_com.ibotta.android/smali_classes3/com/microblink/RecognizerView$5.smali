.class Lcom/microblink/RecognizerView$5;
.super Lcom/microblink/SimpleRecognizerCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/RecognizerView;


# direct methods
.method constructor <init>(Lcom/microblink/RecognizerView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/RecognizerView$5;->this$0:Lcom/microblink/RecognizerView;

    invoke-direct {p0}, Lcom/microblink/SimpleRecognizerCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    .locals 3
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/microblink/SimpleRecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V

    instance-of v0, p1, Lcom/microblink/PreliminaryResult;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/microblink/PreliminaryResult;

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/RecognizerView$5;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v1}, Lcom/microblink/RecognizerView;->access$000(Lcom/microblink/RecognizerView;)Lcom/microblink/RecognizerDispatcher;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/RecognizerView$5;->this$0:Lcom/microblink/RecognizerView;

    invoke-static {v1}, Lcom/microblink/RecognizerView;->access$000(Lcom/microblink/RecognizerView;)Lcom/microblink/RecognizerDispatcher;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/RecognizerDispatcher;->processingFrame()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/microblink/RecognizerView$5;->this$0:Lcom/microblink/RecognizerView;

    invoke-virtual {p1, v1}, Lcom/microblink/PreliminaryResult;->processing(Z)Lcom/microblink/PreliminaryResult;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/microblink/RecognizerView;->onRecognizerResult(Lcom/microblink/RecognizerResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "RecognizerView"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
