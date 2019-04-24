.class public final Lcom/scandit/recognition/TrackedBarcode;
.super Lcom/scandit/recognition/Barcode;
.source "TrackedBarcode.java"


# instance fields
.field private mDeltaTime:F

.field private final mId:J

.field private mOverrideBarcode:Lcom/scandit/recognition/Barcode;

.field private mPredictedLocation:Lcom/scandit/recognition/Quadrilateral;

.field private shouldAnimateFromPreviousToNextState:Z


# direct methods
.method constructor <init>(Lcom/scandit/recognition/TrackedObject;)V
    .locals 2

    .line 22
    invoke-direct {p0, p1}, Lcom/scandit/recognition/Barcode;-><init>(Lcom/scandit/recognition/TrackedObject;)V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mPredictedLocation:Lcom/scandit/recognition/Quadrilateral;

    const/4 v1, 0x0

    .line 16
    iput v1, p0, Lcom/scandit/recognition/TrackedBarcode;->mDeltaTime:F

    .line 17
    iput-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/scandit/recognition/TrackedBarcode;->shouldAnimateFromPreviousToNextState:Z

    .line 24
    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedObject;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mId:J

    return-void
.end method

.method constructor <init>(Lcom/scandit/recognition/TrackedObject;Lcom/scandit/recognition/Barcode;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/scandit/recognition/TrackedBarcode;-><init>(Lcom/scandit/recognition/TrackedObject;)V

    .line 35
    iput-object p2, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    return-void
.end method


# virtual methods
.method public getCompositeFlag()I
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->getCompositeFlag()I

    move-result v0

    return v0

    .line 111
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getCompositeFlag()I

    move-result v0

    return v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->getData()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 156
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getData()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeltaTimeForPrediction()J
    .locals 2

    .line 72
    iget v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mDeltaTime:F

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float v0, v0, v1

    float-to-long v0, v0

    return-wide v0
.end method

.method public getFrameId()I
    .locals 1

    .line 171
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getFrameId()I

    move-result v0

    return v0
.end method

.method public getId()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mId:J

    return-wide v0
.end method

.method public getLocation()Lcom/scandit/recognition/Quadrilateral;
    .locals 1

    .line 176
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object v0

    return-object v0
.end method

.method public getPredictedLocation()Lcom/scandit/recognition/Quadrilateral;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mPredictedLocation:Lcom/scandit/recognition/Quadrilateral;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/scandit/recognition/TrackedBarcode;->getLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getRawData()[B
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 145
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->getRawData()[B

    move-result-object v0

    return-object v0

    .line 147
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getRawData()[B

    move-result-object v0

    return-object v0
.end method

.method public getSymbolCount()I
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->getSymbolCount()I

    move-result v0

    return v0

    .line 165
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getSymbolCount()I

    move-result v0

    return v0
.end method

.method public getSymbology()I
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->getSymbology()I

    move-result v0

    return v0

    .line 84
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getSymbology()I

    move-result v0

    return v0
.end method

.method public getSymbologyName()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->getSymbologyName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 93
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->getSymbologyName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isGs1DataCarrier()Z
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->isGs1DataCarrier()Z

    move-result v0

    return v0

    .line 102
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->isGs1DataCarrier()Z

    move-result v0

    return v0
.end method

.method public isRecognized()Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/scandit/recognition/TrackedBarcode;->mOverrideBarcode:Lcom/scandit/recognition/Barcode;

    if-eqz v0, :cond_0

    .line 118
    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v0

    return v0

    .line 120
    :cond_0
    invoke-super {p0}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v0

    return v0
.end method

.method setDeltaTime(F)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/scandit/recognition/TrackedBarcode;->mDeltaTime:F

    return-void
.end method

.method setPredictedLocation(Lcom/scandit/recognition/Quadrilateral;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/scandit/recognition/TrackedBarcode;->mPredictedLocation:Lcom/scandit/recognition/Quadrilateral;

    return-void
.end method

.method setShouldAnimateFromPreviousToNextState(Z)V
    .locals 0

    .line 125
    iput-boolean p1, p0, Lcom/scandit/recognition/TrackedBarcode;->shouldAnimateFromPreviousToNextState:Z

    return-void
.end method

.method public shouldAnimateFromPreviousToNextState()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lcom/scandit/recognition/TrackedBarcode;->shouldAnimateFromPreviousToNextState:Z

    return v0
.end method
