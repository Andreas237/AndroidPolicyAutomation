.class interface abstract Lcom/microblink/RecognizeDataCallback;
.super Ljava/lang/Object;


# virtual methods
.method public abstract onBlurScoreChange(I)V
.end method

.method public abstract onProcessStateChanged(I)V
.end method

.method public abstract onRecognizerException(Lcom/microblink/RecognizerException;)V
    .param p1    # Lcom/microblink/RecognizerException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onRecognizerResult(Lcom/microblink/RecognizerResult;)V
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
