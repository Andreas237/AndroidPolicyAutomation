.class public abstract Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.super Ljava/lang/Object;
.source "ReceiptCaptureDetails.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
.end method

.method public abstract orientation(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract previewHeight(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract previewWidth(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract receiptPercDistFromBottom(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract receiptPercDistFromLeft(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract receiptPercDistFromRight(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract receiptPercDistFromTop(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract receiptSizeHeightPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method

.method public abstract receiptSizeWidthPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;
.end method
