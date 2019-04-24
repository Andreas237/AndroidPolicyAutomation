.class public interface abstract Lcom/scandit/barcodepicker/ScanSession;
.super Ljava/lang/Object;
.source "ScanSession.java"


# virtual methods
.method public abstract clear()V
.end method

.method public abstract getAllRecognizedCodes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNewlyLocalizedCodes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNewlyRecognizedCodes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTrackedCodes()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/recognition/TrackedBarcode;",
            ">;"
        }
    .end annotation
.end method

.method public abstract pauseScanning()V
.end method

.method public abstract rejectCode(Lcom/scandit/recognition/Barcode;)V
.end method

.method public abstract rejectTrackedCode(Lcom/scandit/recognition/TrackedBarcode;)V
.end method

.method public abstract stopScanning()V
.end method
