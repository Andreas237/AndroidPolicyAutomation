.class public Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;
.super Ljava/lang/Object;
.source "BarcodeParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private barcodeType:Ljava/lang/String;

.field private upc:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 39
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 44
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    const/4 v2, 0x0

    .line 46
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 47
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 48
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBarcodeType()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->barcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->barcodeType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public getUpc()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->upc:Ljava/lang/String;

    return-object v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->upc:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->barcodeType:Ljava/lang/String;

    return-void
.end method

.method public setBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->barcodeType:Ljava/lang/String;

    return-void
.end method

.method public setUpc(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->upc:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 82
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->upc:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->barcodeType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
