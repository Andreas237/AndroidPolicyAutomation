.class public Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;
.super Ljava/lang/Object;
.source "ScanTypeParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private barcodeSizes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field

.field private scanType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 114
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 115
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 120
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    const/4 v2, 0x0

    .line 123
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 124
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 125
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    aput-object v4, v1, v2

    move v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public static fromScanType(Lcom/ibotta/api/model/retailer/ScanType;)Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 100
    :cond_0
    new-instance v0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;-><init>()V

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/ScanType;->getScanType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->setScanType(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/ScanType;->getBarcodeSizes()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->setBarcodeSizes(Ljava/util/Set;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBarcodeSizes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    return-object v0
.end method

.method public getScanType()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->scanType:Ljava/lang/String;

    return-object v0
.end method

.method public getScanTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->scanType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/common/BarcodeType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    return-object v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 4

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->scanType:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object p1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 90
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget v2, p1, v1

    .line 91
    iget-object v3, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    int-to-short v2, v2

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setBarcodeSizes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Short;",
            ">;)V"
        }
    .end annotation

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    return-void
.end method

.method public setScanType(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->scanType:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 65
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->scanType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 68
    :goto_0
    new-array p2, p2, [I

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/retailer/ScanTypeParcel;->barcodeSizes:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 71
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 72
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Short;

    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    aput v2, p2, v0

    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    return-void
.end method
