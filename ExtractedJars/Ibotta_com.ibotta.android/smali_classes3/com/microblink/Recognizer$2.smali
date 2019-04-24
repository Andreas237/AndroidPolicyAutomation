.class Lcom/microblink/Recognizer$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/Recognizer;

.field final synthetic val$callback:Lcom/microblink/RecognizerCallback;


# direct methods
.method constructor <init>(Lcom/microblink/Recognizer;Lcom/microblink/RecognizerCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Recognizer$2;->this$0:Lcom/microblink/Recognizer;

    iput-object p2, p0, Lcom/microblink/Recognizer$2;->val$callback:Lcom/microblink/RecognizerCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 2
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Media;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/Recognizer$2;->this$0:Lcom/microblink/Recognizer;

    invoke-static {v0}, Lcom/microblink/Recognizer;->access$000(Lcom/microblink/Recognizer;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/microblink/Recognizer$2$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/microblink/Recognizer$2$1;-><init>(Lcom/microblink/Recognizer$2;Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onRecognizerException(Ljava/lang/Throwable;)V
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/Recognizer$2;->this$0:Lcom/microblink/Recognizer;

    invoke-static {v0}, Lcom/microblink/Recognizer;->access$000(Lcom/microblink/Recognizer;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/microblink/Recognizer$2$2;

    invoke-direct {v1, p0, p1}, Lcom/microblink/Recognizer$2$2;-><init>(Lcom/microblink/Recognizer$2;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    .locals 2
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/Recognizer$2;->this$0:Lcom/microblink/Recognizer;

    invoke-static {v0}, Lcom/microblink/Recognizer;->access$000(Lcom/microblink/Recognizer;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/microblink/Recognizer$2$3;

    invoke-direct {v1, p0, p1}, Lcom/microblink/Recognizer$2$3;-><init>(Lcom/microblink/Recognizer$2;Lcom/microblink/RecognizerResult;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
