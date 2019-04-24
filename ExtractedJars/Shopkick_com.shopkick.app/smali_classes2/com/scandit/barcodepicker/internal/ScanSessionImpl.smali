.class public Lcom/scandit/barcodepicker/internal/ScanSessionImpl;
.super Ljava/lang/Object;
.source "ScanSessionImpl.java"

# interfaces
.implements Lcom/scandit/barcodepicker/ScanSession;


# instance fields
.field private mLastFrameTime:F

.field private mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field private mRecognizedText:Lcom/scandit/barcodepicker/ocr/RecognizedText;

.field private final mRejectedCodes:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/scandit/recognition/Barcode;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mRejectedTrackedCodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private mRejectionEnabled:Z

.field private mSensorToScreenAngle:I

.field private mSession:Lcom/scandit/recognition/BarcodeScannerSession;

.field private mTrackingRejectionEnabled:Z

.field private mUserRequestsPause:Z

.field private mUserRequestsStop:Z


# direct methods
.method public constructor <init>(Lcom/scandit/recognition/BarcodeScannerSession;Lcom/scandit/recognition/ObjectTracker;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mLastFrameTime:F

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsStop:Z

    .line 29
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsPause:Z

    const/16 v1, 0x5a

    .line 31
    iput v1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSensorToScreenAngle:I

    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRecognizedText:Lcom/scandit/barcodepicker/ocr/RecognizedText;

    .line 33
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectionEnabled:Z

    .line 35
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mTrackingRejectionEnabled:Z

    .line 43
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    .line 44
    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

    .line 45
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedCodes:Ljava/util/HashMap;

    .line 46
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedTrackedCodes:Ljava/util/Set;

    .line 47
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->reset()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 184
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->partialClear()V

    .line 185
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSession;->clear()V

    .line 186
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedTrackedCodes:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    .line 187
    iput v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mLastFrameTime:F

    return-void
.end method

.method public didSeeNewTrack()Z
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

    invoke-virtual {v0}, Lcom/scandit/recognition/ObjectTracker;->didSeeNewTrackThenReset()Z

    move-result v0

    return v0
.end method

.method public getAllNonRejectedCodesAndClearRejectionStatus()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedCodes:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 133
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_0

    .line 134
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_1
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedCodes:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    return-object v0
.end method

.method public getAllRecognizedCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSession;->getAllRecognizedCodes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAllRejectedTrackedCodes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 154
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedTrackedCodes:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getNewlyLocalizedCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSession;->getNewlyLocalizedCodes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNewlyRecognizedCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSession;->getNewlyRecognizedCodes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNewlyRecognizedText()Lcom/scandit/barcodepicker/ocr/RecognizedText;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRecognizedText:Lcom/scandit/barcodepicker/ocr/RecognizedText;

    return-object v0
.end method

.method public getPreviewHeight()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mPreviewHeight:I

    return v0
.end method

.method public getPreviewWidth()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mPreviewWidth:I

    return v0
.end method

.method public getSensorToScreenAngle()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSensorToScreenAngle:I

    return v0
.end method

.method public getTrackedCodes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/scandit/recognition/TrackedBarcode;",
            ">;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

    invoke-virtual {v0}, Lcom/scandit/recognition/ObjectTracker;->getTrackedBarcodes()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public hasNewlyDecodedCodes()Z
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    invoke-virtual {v0}, Lcom/scandit/recognition/BarcodeScannerSession;->getNewlyRecognizedCodes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public hasUserRequestedPause()Z
    .locals 1

    .line 168
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsPause:Z

    return v0
.end method

.method public hasUserRequestedStop()Z
    .locals 1

    .line 164
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsStop:Z

    return v0
.end method

.method public isTrackingEnabled()Z
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

    invoke-virtual {v0}, Lcom/scandit/recognition/ObjectTracker;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public partialClear()V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

    invoke-virtual {v0}, Lcom/scandit/recognition/ObjectTracker;->clear()V

    return-void
.end method

.method public pauseScanning()V
    .locals 1

    const/4 v0, 0x1

    .line 160
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsPause:Z

    return-void
.end method

.method public rejectCode(Lcom/scandit/recognition/Barcode;)V
    .locals 2

    .line 124
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectionEnabled:Z

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedCodes:Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 125
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Rejecting codes is only allowed in the didScan callback"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public rejectTrackedCode(Lcom/scandit/recognition/TrackedBarcode;)V
    .locals 3

    .line 147
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mTrackingRejectionEnabled:Z

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedTrackedCodes:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedBarcode;->getId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    .line 148
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Rejecting tracked codes is only allowed in the didProcess callback"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public rememberRecognizedCodesForRejection()V
    .locals 4

    .line 211
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getNewlyRecognizedCodes()Ljava/util/List;

    move-result-object v0

    .line 212
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/recognition/Barcode;

    .line 213
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectedCodes:Ljava/util/HashMap;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public reset()V
    .locals 0

    .line 51
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->resetUserRequests()V

    .line 52
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->clear()V

    return-void
.end method

.method public resetUserRequests()V
    .locals 1

    const/4 v0, 0x0

    .line 172
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsPause:Z

    .line 173
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsStop:Z

    return-void
.end method

.method public setLastFrameTime(F)V
    .locals 0

    .line 199
    iput p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mLastFrameTime:F

    return-void
.end method

.method public setNewlyRecognizedText(Lcom/scandit/barcodepicker/ocr/RecognizedText;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRecognizedText:Lcom/scandit/barcodepicker/ocr/RecognizedText;

    return-void
.end method

.method public setPreviewSize(II)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mPreviewWidth:I

    .line 69
    iput p2, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mPreviewHeight:I

    return-void
.end method

.method protected setRejectionEnabled(Z)V
    .locals 0

    .line 119
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mRejectionEnabled:Z

    return-void
.end method

.method public setSensorToScreenAngle(I)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mSensorToScreenAngle:I

    return-void
.end method

.method public setTrackingEnabled(Z)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mObjectTracker:Lcom/scandit/recognition/ObjectTracker;

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/ObjectTracker;->setEnabled(Z)V

    return-void
.end method

.method protected setTrackingRejectionEnabled(Z)V
    .locals 0

    .line 142
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mTrackingRejectionEnabled:Z

    return-void
.end method

.method public stopScanning()V
    .locals 1

    const/4 v0, 0x1

    .line 115
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->mUserRequestsStop:Z

    return-void
.end method
