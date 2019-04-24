.class public interface abstract Lcom/microblink/internal/view/presenter/RecognizerPresenter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/view/Presenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/microblink/internal/view/CameraScanView;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/view/Presenter<",
        "TT;>;"
    }
.end annotation


# virtual methods
.method public abstract onCancelScanPressed()V
.end method

.method public abstract onFinishedScanPressed()V
.end method

.method public abstract onRecognizerException()V
.end method

.method public abstract onTorchAvailable(Z)V
.end method

.method public abstract onTorchButtonPressed()V
.end method
