.class public interface abstract Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/view/presenter/RecognizerPresenter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/view/presenter/CameraScanContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Presenter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/view/presenter/RecognizerPresenter<",
        "Lcom/microblink/internal/view/presenter/CameraScanContract$View;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract isFinishingScan()Z
.end method

.method public abstract onCaptureFrameButtonClicked()V
.end method

.method public abstract onPhotoCaptured()V
.end method

.method public abstract onPhotoConfirmed()V
.end method
