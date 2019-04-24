.class public interface abstract Lcom/microblink/CameraCaptureListener;
.super Ljava/lang/Object;


# virtual methods
.method public abstract onCaptured(Lcom/microblink/BitmapResult;)V
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onException(Ljava/lang/Exception;)V
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
