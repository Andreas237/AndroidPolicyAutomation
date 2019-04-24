.class final Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;
.super Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.source "AutoValue_ReceiptCaptureDetails.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private orientation:Ljava/lang/Integer;

.field private previewHeight:Ljava/lang/Integer;

.field private previewWidth:Ljava/lang/Integer;

.field private receiptPercDistFromBottom:Ljava/lang/Double;

.field private receiptPercDistFromLeft:Ljava/lang/Double;

.field private receiptPercDistFromRight:Ljava/lang/Double;

.field private receiptPercDistFromTop:Ljava/lang/Double;

.field private receiptSizeHeightPerc:Ljava/lang/Double;

.field private receiptSizeWidthPerc:Ljava/lang/Double;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)V
    .locals 2

    .line 160
    invoke-direct {p0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;-><init>()V

    .line 161
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getPreviewWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewWidth:Ljava/lang/Integer;

    .line 162
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getPreviewHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewHeight:Ljava/lang/Integer;

    .line 163
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getOrientation()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->orientation:Ljava/lang/Integer;

    .line 164
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromLeft()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft:Ljava/lang/Double;

    .line 165
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromRight()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromRight:Ljava/lang/Double;

    .line 166
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromTop()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromTop:Ljava/lang/Double;

    .line 167
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptPercDistFromBottom()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom:Ljava/lang/Double;

    .line 168
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeWidthPerc()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeWidthPerc:Ljava/lang/Double;

    .line 169
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->getReceiptSizeHeightPerc()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeHeightPerc:Ljava/lang/Double;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$1;)V
    .locals 0

    .line 148
    invoke-direct {p0, p1}, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;-><init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, ""

    .line 219
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewWidth:Ljava/lang/Integer;

    if-nez v2, :cond_0

    .line 220
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " previewWidth"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 222
    :cond_0
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewHeight:Ljava/lang/Integer;

    if-nez v2, :cond_1

    .line 223
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " previewHeight"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 225
    :cond_1
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->orientation:Ljava/lang/Integer;

    if-nez v2, :cond_2

    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " orientation"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 228
    :cond_2
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft:Ljava/lang/Double;

    if-nez v2, :cond_3

    .line 229
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " receiptPercDistFromLeft"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 231
    :cond_3
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromRight:Ljava/lang/Double;

    if-nez v2, :cond_4

    .line 232
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " receiptPercDistFromRight"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 234
    :cond_4
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromTop:Ljava/lang/Double;

    if-nez v2, :cond_5

    .line 235
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " receiptPercDistFromTop"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 237
    :cond_5
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom:Ljava/lang/Double;

    if-nez v2, :cond_6

    .line 238
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " receiptPercDistFromBottom"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 240
    :cond_6
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeWidthPerc:Ljava/lang/Double;

    if-nez v2, :cond_7

    .line 241
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " receiptSizeWidthPerc"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 243
    :cond_7
    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeHeightPerc:Ljava/lang/Double;

    if-nez v2, :cond_8

    .line 244
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " receiptSizeHeightPerc"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 246
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 249
    new-instance v1, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;

    move-object v3, v1

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewWidth:Ljava/lang/Integer;

    .line 250
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewHeight:Ljava/lang/Integer;

    .line 251
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->orientation:Ljava/lang/Integer;

    .line 252
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft:Ljava/lang/Double;

    .line 253
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromRight:Ljava/lang/Double;

    .line 254
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromTop:Ljava/lang/Double;

    .line 255
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom:Ljava/lang/Double;

    .line 256
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeWidthPerc:Ljava/lang/Double;

    .line 257
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v15

    iget-object v2, v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeHeightPerc:Ljava/lang/Double;

    .line 258
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v17

    const/16 v19, 0x0

    invoke-direct/range {v3 .. v19}, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails;-><init>(IIIDDDDDDLcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$1;)V

    return-object v1

    .line 247
    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public orientation(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 183
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->orientation:Ljava/lang/Integer;

    return-object p0
.end method

.method public previewHeight(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 178
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewHeight:Ljava/lang/Integer;

    return-object p0
.end method

.method public previewWidth(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 173
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->previewWidth:Ljava/lang/Integer;

    return-object p0
.end method

.method public receiptPercDistFromBottom(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 203
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom:Ljava/lang/Double;

    return-object p0
.end method

.method public receiptPercDistFromLeft(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 188
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft:Ljava/lang/Double;

    return-object p0
.end method

.method public receiptPercDistFromRight(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 193
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromRight:Ljava/lang/Double;

    return-object p0
.end method

.method public receiptPercDistFromTop(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 198
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptPercDistFromTop:Ljava/lang/Double;

    return-object p0
.end method

.method public receiptSizeHeightPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 213
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeHeightPerc:Ljava/lang/Double;

    return-object p0
.end method

.method public receiptSizeWidthPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 0

    .line 208
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;->receiptSizeWidthPerc:Ljava/lang/Double;

    return-object p0
.end method
