.class Lcom/ibotta/android/fragment/retailer/RetailerParcel$1;
.super Ljava/lang/Object;
.source "RetailerParcel.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 373
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 371
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 0

    .line 377
    new-array p1, p1, [Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 371
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel$1;->newArray(I)[Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    return-object p1
.end method
