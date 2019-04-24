.class public Lcom/ibotta/android/util/ParcelableSparseBooleanArray;
.super Landroid/util/SparseBooleanArray;
.source "ParcelableSparseBooleanArray.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/util/ParcelableSparseBooleanArray;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Lcom/ibotta/android/util/ParcelableSparseBooleanArray$1;

    invoke-direct {v0}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/util/SparseBooleanArray;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 17
    invoke-direct {p0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->createBooleanArray()[Z

    move-result-object p1

    const/4 v1, 0x0

    .line 21
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 22
    aget v2, v0, v1

    aget-boolean v3, p1, v1

    invoke-virtual {p0, v2, v3}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->append(IZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->size()I

    move-result p2

    new-array p2, p2, [I

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->size()I

    move-result v0

    new-array v0, v0, [Z

    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 32
    invoke-virtual {p0, v1}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->keyAt(I)I

    move-result v2

    aput v2, p2, v1

    .line 33
    invoke-virtual {p0, v1}, Lcom/ibotta/android/util/ParcelableSparseBooleanArray;->valueAt(I)Z

    move-result v2

    aput-boolean v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 37
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    return-void
.end method
