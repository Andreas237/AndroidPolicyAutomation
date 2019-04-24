.class public interface abstract Lcom/microblink/internal/view/presenter/CameraScanContract$View;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/view/CameraScanView;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/view/presenter/CameraScanContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "View"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/view/CameraScanView<",
        "Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract captureFrame()V
.end method

.method public abstract confirmPhoto(Z)V
.end method

.method public abstract disableDoneButton()V
.end method

.method public abstract discardCapturedFrame()V
.end method

.method public abstract displayDoneButton(Z)V
.end method

.method public abstract displayHint(Z)V
.end method

.method public abstract displayTip(Z)V
.end method

.method public abstract enableDoneButton()V
.end method

.method public abstract setCancelButtonText(Ljava/lang/String;)V
.end method

.method public abstract setCapturedFrameCount(I)V
.end method

.method public abstract setDoneButtonText(Ljava/lang/String;)V
.end method

.method public abstract setEnableCaptureFrameBtn(Z)V
.end method

.method public abstract setHintMsg(Ljava/lang/String;)V
.end method

.method public abstract setTipMsg(Ljava/lang/String;)V
.end method
