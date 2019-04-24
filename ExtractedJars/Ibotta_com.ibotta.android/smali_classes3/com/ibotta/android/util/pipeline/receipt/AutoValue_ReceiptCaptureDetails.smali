.class final Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;
.super Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
.source "AutoValue_ReceiptCaptureDetails.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;
    }
.end annotation


# instance fields
.field private final orientation:I

.field private final previewHeight:I

.field private final previewWidth:I

.field private final receiptPercDistFromBottom:D

.field private final receiptPercDistFromLeft:D

.field private final receiptPercDistFromRight:D

.field private final receiptPercDistFromTop:D

.field private final receiptSizeHeightPerc:D

.field private final receiptSizeWidthPerc:D


# direct methods
.method private constructor <init>(IIIDDDDDD)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;-><init>()V

    .line 28
    iput p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewWidth:I

    .line 29
    iput p2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewHeight:I

    .line 30
    iput p3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->orientation:I

    .line 31
    iput-wide p4, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromLeft:D

    .line 32
    iput-wide p6, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromRight:D

    .line 33
    iput-wide p8, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromTop:D

    .line 34
    iput-wide p10, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromBottom:D

    .line 35
    iput-wide p12, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeWidthPerc:D

    .line 36
    iput-wide p14, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeHeightPerc:D

    return-void
.end method

.method synthetic constructor <init>(IIIDDDDDDLcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$1;)V
    .locals 0

    .line 6
    invoke-direct/range {p0 .. p15}, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;-><init>(IIIDDDDDD)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 104
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 105
    check-cast p1, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    .line 106
    iget v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewWidth:I

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getPreviewWidth()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewHeight:I

    .line 107
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getPreviewHeight()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->orientation:I

    .line 108
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getOrientation()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromLeft:D

    .line 109
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromLeft()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromRight:D

    .line 110
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromRight()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromTop:D

    .line 111
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromTop()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromBottom:D

    .line 112
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromBottom()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeWidthPerc:D

    .line 113
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeWidthPerc()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeHeightPerc:D

    .line 114
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeHeightPerc()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getOrientation()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->orientation:I

    return v0
.end method

.method public getPreviewHeight()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewHeight:I

    return v0
.end method

.method public getPreviewWidth()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewWidth:I

    return v0
.end method

.method public getReceiptPercDistFromBottom()D
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromBottom:D

    return-wide v0
.end method

.method public getReceiptPercDistFromLeft()D
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromLeft:D

    return-wide v0
.end method

.method public getReceiptPercDistFromRight()D
    .locals 2

    .line 61
    iget-wide v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromRight:D

    return-wide v0
.end method

.method public getReceiptPercDistFromTop()D
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromTop:D

    return-wide v0
.end method

.method public getReceiptSizeHeightPerc()D
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeHeightPerc:D

    return-wide v0
.end method

.method public getReceiptSizeWidthPerc()D
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeWidthPerc:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 7

    .line 123
    iget v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewWidth:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 125
    iget v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewHeight:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 127
    iget v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->orientation:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 129
    iget-wide v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromLeft:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    iget-wide v5, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromLeft:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 131
    iget-wide v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromRight:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    ushr-long/2addr v2, v4

    iget-wide v5, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromRight:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 133
    iget-wide v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromTop:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    ushr-long/2addr v2, v4

    iget-wide v5, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromTop:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 135
    iget-wide v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromBottom:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    ushr-long/2addr v2, v4

    iget-wide v5, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromBottom:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 137
    iget-wide v2, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeWidthPerc:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    ushr-long/2addr v2, v4

    iget-wide v5, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeWidthPerc:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 139
    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeHeightPerc:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    ushr-long/2addr v1, v4

    iget-wide v3, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeHeightPerc:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    xor-int/2addr v0, v2

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 2

    .line 145
    new-instance v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;-><init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiptCaptureDetails{previewWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", previewHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->previewHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", orientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->orientation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiptPercDistFromLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromLeft:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", receiptPercDistFromRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromRight:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", receiptPercDistFromTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromTop:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", receiptPercDistFromBottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptPercDistFromBottom:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", receiptSizeWidthPerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeWidthPerc:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", receiptSizeHeightPerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;->receiptSizeHeightPerc:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
