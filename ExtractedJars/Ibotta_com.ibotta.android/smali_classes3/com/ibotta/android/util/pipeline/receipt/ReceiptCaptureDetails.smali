.class public abstract Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
.super Ljava/lang/Object;
.source "ReceiptCaptureDetails.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 7
    invoke-static {}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->builder()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->previewWidth(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 9
    invoke-virtual {v0, v1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->previewHeight(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v1}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->orientation(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromRight(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromTop(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptSizeWidthPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptSizeHeightPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->build()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->EMPTY:Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
    .locals 1

    .line 32
    new-instance v0, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/util/pipeline/receipt/AutoValue_ReceiptCaptureDetails$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getOrientation()I
.end method

.method public abstract getPreviewHeight()I
.end method

.method public abstract getPreviewWidth()I
.end method

.method public abstract getReceiptPercDistFromBottom()D
.end method

.method public abstract getReceiptPercDistFromLeft()D
.end method

.method public abstract getReceiptPercDistFromRight()D
.end method

.method public abstract getReceiptPercDistFromTop()D
.end method

.method public abstract getReceiptSizeHeightPerc()D
.end method

.method public abstract getReceiptSizeWidthPerc()D
.end method

.method public abstract toBuilder()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method
