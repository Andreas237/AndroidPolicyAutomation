.class interface abstract Lcom/microblink/CameraDataListener;
.super Ljava/lang/Object;


# virtual methods
.method public abstract onCameraFrameError(Ljava/lang/Exception;)V
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onCameraFrameResults(Lcom/microblink/BitmapResult;)V
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onDebugResults(Lcom/microblink/DebugResult;)V
.end method

.method public abstract onEdgeDetectionResult(Lcom/microblink/EdgeDetectionResult;)V
    .param p1    # Lcom/microblink/EdgeDetectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
