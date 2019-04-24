.class public interface abstract Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;
.super Ljava/lang/Object;
.source "ScanStateUpdateCallback.java"


# virtual methods
.method public abstract onError(Lcom/scandit/recognition/ContextStatusException;)V
.end method

.method public abstract onFrameCompleted(Lcom/scandit/barcodepicker/ScanSession;)V
.end method

.method public abstract onNoCameraAccess()V
.end method

.method public abstract onOrientationChange()V
.end method

.method public abstract onScanStateChanged(I)V
.end method
