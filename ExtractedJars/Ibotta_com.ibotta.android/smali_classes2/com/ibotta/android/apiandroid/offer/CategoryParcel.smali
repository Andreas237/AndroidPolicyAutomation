.class public Lcom/ibotta/android/apiandroid/offer/CategoryParcel;
.super Ljava/lang/Object;
.source "CategoryParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private id:I

.field private name:Ljava/lang/String;

.field private sortData:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/offer/CategoryParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static convert([Landroid/os/Parcelable;)[Lcom/ibotta/android/apiandroid/offer/CategoryParcel;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 80
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    .line 81
    aget-object v3, p0, v1

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 86
    :cond_2
    new-array v1, v2, [Lcom/ibotta/android/apiandroid/offer/CategoryParcel;

    const/4 v2, 0x0

    .line 88
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 89
    aget-object v3, p0, v0

    instance-of v3, v3, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    .line 90
    aget-object v4, p0, v0

    check-cast v4, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;

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

.method public getId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSortData()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->sortData:Ljava/lang/String;

    return-object v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->id:I

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->name:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->sortData:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 26
    iput p1, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->name:Ljava/lang/String;

    return-void
.end method

.method public setSortData(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->sortData:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 63
    iget p2, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/offer/CategoryParcel;->sortData:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
