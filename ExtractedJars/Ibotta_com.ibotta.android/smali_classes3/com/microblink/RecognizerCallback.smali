.class public interface abstract Lcom/microblink/RecognizerCallback;
.super Ljava/lang/Object;


# virtual methods
.method public abstract onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Media;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onRecognizerException(Ljava/lang/Throwable;)V
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
