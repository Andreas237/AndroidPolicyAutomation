.class public Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;
.super Ljava/lang/Object;
.source "ReceiptProcessingParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private filename:Ljava/lang/String;

.field private orientation:I

.field private previewHeight:I

.field private previewWidth:I

.field private receiptPercDistFromBottom:D

.field private receiptPercDistFromLeft:D

.field private receiptPercDistFromRight:D

.field private receiptPercDistFromTop:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 92
    new-instance v0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams$1;

    invoke-direct {v0}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getFilename()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public getOrientation()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->orientation:I

    return v0
.end method

.method public getPreviewHeight()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewHeight:I

    return v0
.end method

.method public getPreviewWidth()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewWidth:I

    return v0
.end method

.method public getReceiptPercDistFromBottom()D
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromBottom:D

    return-wide v0
.end method

.method public getReceiptPercDistFromLeft()D
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromLeft:D

    return-wide v0
.end method

.method public getReceiptPercDistFromRight()D
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromRight:D

    return-wide v0
.end method

.method public getReceiptPercDistFromTop()D
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromTop:D

    return-wide v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 2

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->filename:Ljava/lang/String;

    .line 121
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewWidth:I

    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewHeight:I

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->orientation:I

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromLeft:D

    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromRight:D

    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromTop:D

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromBottom:D

    return-void
.end method

.method public setFilename(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->filename:Ljava/lang/String;

    return-void
.end method

.method public setOrientation(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->orientation:I

    return-void
.end method

.method public setPreviewHeight(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewHeight:I

    return-void
.end method

.method public setPreviewWidth(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewWidth:I

    return-void
.end method

.method public setReceiptPercDistFromBottom(D)V
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromBottom:D

    return-void
.end method

.method public setReceiptPercDistFromLeft(D)V
    .locals 0

    .line 64
    iput-wide p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromLeft:D

    return-void
.end method

.method public setReceiptPercDistFromRight(D)V
    .locals 0

    .line 72
    iput-wide p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromRight:D

    return-void
.end method

.method public setReceiptPercDistFromTop(D)V
    .locals 0

    .line 80
    iput-wide p1, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromTop:D

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 109
    iget-object p2, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->filename:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    iget p2, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewWidth:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 111
    iget p2, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->previewHeight:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    iget p2, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->orientation:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 113
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromLeft:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 114
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromRight:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 115
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromTop:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 116
    iget-wide v0, p0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->receiptPercDistFromBottom:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    return-void
.end method
