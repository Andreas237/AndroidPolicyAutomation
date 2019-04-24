.class public Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;
.super Ljava/lang/Object;
.source "VerifyBarcodeParamsParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private giveUpCount:I

.field private offerId:I

.field private productGroupId:Ljava/lang/Integer;

.field private title:Ljava/lang/String;

.field private verifyBarcodeMode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getGiveUpCount()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->giveUpCount:I

    return v0
.end method

.method public getOfferId()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->offerId:I

    return v0
.end method

.method public getProductGroupId()Ljava/lang/Integer;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->productGroupId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getVerifyBarcodeMode()Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->verifyBarcodeMode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    return-object v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->fromString(Ljava/lang/String;)Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->verifyBarcodeMode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->offerId:I

    .line 91
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->productGroupId:Ljava/lang/Integer;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->title:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->giveUpCount:I

    return-void
.end method

.method public setGiveUpCount(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->giveUpCount:I

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->offerId:I

    return-void
.end method

.method public setProductGroupId(Ljava/lang/Integer;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->productGroupId:Ljava/lang/Integer;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->title:Ljava/lang/String;

    return-void
.end method

.method public setVerifyBarcodeMode(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->verifyBarcodeMode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 81
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->verifyBarcodeMode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget p2, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->offerId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->productGroupId:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 84
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    iget p2, p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->giveUpCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
