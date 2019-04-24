.class public Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;
.super Ljava/lang/Object;
.source "SubmitReceiptState$$Parcelable.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lorg/parceler/ParcelWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lorg/parceler/ParcelWrapper<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private submitReceiptState$$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;->submitReceiptState$$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    return-void
.end method

.method public static read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;
    .locals 3

    .line 68
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 69
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->containsKey(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 70
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->isReserved(I)Z

    move-result p0

    if-nez p0, :cond_0

    .line 73
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    return-object p0

    .line 71
    :cond_0
    new-instance p0, Lorg/parceler/ParcelerRuntimeException;

    const-string p1, "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."

    invoke-direct {p0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 76
    :cond_1
    invoke-virtual {p1}, Lorg/parceler/IdentityCollection;->reserve()I

    move-result v1

    .line 77
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;-><init>()V

    .line 78
    invoke-virtual {p1, v1, v2}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    .line 79
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->submitReceiptStatus:Ljava/lang/String;

    .line 81
    invoke-virtual {p1, v0, v2}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method public static write(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V
    .locals 1

    .line 48
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->getKey(Ljava/lang/Object;)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 50
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->put(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->submitReceiptStatus:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParcel()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;->submitReceiptState$$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    return-object v0
.end method

.method public bridge synthetic getParcel()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;->getParcel()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;->submitReceiptState$$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    new-instance v1, Lorg/parceler/IdentityCollection;

    invoke-direct {v1}, Lorg/parceler/IdentityCollection;-><init>()V

    invoke-static {v0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState$$Parcelable;->write(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V

    return-void
.end method
