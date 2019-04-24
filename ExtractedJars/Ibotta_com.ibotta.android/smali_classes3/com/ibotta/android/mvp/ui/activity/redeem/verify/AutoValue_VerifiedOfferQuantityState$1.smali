.class Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState$1;
.super Ljava/lang/Object;
.source "AutoValue_VerifiedOfferQuantityState.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;
    .locals 2

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState$1;->createFromParcel(Landroid/os/Parcel;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;
    .locals 0

    .line 18
    new-array p1, p1, [Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState$1;->newArray(I)[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;

    move-result-object p1

    return-object p1
.end method
