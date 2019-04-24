.class final Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;
.source "AutoValue_VerifiedOfferQuantityState.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(II)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;-><init>(II)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;->getOfferId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/AutoValue_VerifiedOfferQuantityState;->getExpectedQuantity()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
