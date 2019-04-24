.class public interface abstract Lcom/microblink/CameraRecognizerCallback;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerCallback;


# virtual methods
.method public abstract onConfirmPicture(Ljava/io/File;)V
    .param p1    # Ljava/io/File;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onException(Ljava/lang/Throwable;)V
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onPermissionDenied()V
.end method

.method public abstract onPreviewStarted()V
.end method

.method public abstract onPreviewStopped()V
.end method
