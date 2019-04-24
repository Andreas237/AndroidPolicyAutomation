.class public interface abstract Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;
.super Ljava/lang/Object;
.source "BarcodePickerInterface.java"


# virtual methods
.method public abstract applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V
.end method

.method public abstract convertPointToPickerCoordinates(Landroid/graphics/Point;)Landroid/graphics/Point;
.end method

.method public abstract getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;
.end method

.method public abstract pauseScanning(Ljava/lang/Runnable;)V
.end method

.method public abstract resumeScanning(Ljava/lang/Runnable;)V
.end method

.method public abstract setAutoFocusOnTapEnabled(Z)V
.end method

.method public abstract setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V
.end method

.method public abstract setPinchToZoomEnabled(Z)V
.end method

.method public abstract setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V
.end method

.method public abstract setPropertyChangeListener(Lcom/scandit/barcodepicker/PropertyChangeListener;)V
.end method

.method public abstract setTextRecognitionListener(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V
.end method

.method public abstract startScanning(ZLjava/lang/Runnable;)V
.end method

.method public abstract stopScanning(Ljava/lang/Runnable;)V
.end method

.method public abstract switchTorchOn(Z)V
.end method
