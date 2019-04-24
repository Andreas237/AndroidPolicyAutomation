.class public interface abstract Lcom/microblink/internal/view/CameraScanView;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/view/View;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/microblink/internal/view/Presenter;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/view/View<",
        "TT;>;"
    }
.end annotation


# virtual methods
.method public abstract cancelScan()V
.end method

.method public abstract displayTorch(Z)V
.end method

.method public abstract finishScan()V
.end method

.method public abstract toggleTorch(ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .param p2    # Lcom/microblink/camera/hardware/SuccessCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
