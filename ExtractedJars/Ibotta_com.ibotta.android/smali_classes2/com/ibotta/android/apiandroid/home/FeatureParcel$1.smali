.class Lcom/ibotta/android/apiandroid/home/FeatureParcel$1;
.super Ljava/lang/Object;
.source "FeatureParcel.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/apiandroid/home/FeatureParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/apiandroid/home/FeatureParcel;
    .locals 1

    .line 105
    new-instance v0, Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    invoke-direct {v0, p1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 103
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/apiandroid/home/FeatureParcel;
    .locals 0

    .line 109
    new-array p1, p1, [Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 103
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/home/FeatureParcel$1;->newArray(I)[Lcom/ibotta/android/apiandroid/home/FeatureParcel;

    move-result-object p1

    return-object p1
.end method
