.class final Lcom/microblink/CouponType$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/microblink/CouponType;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/microblink/CouponType;
    .locals 1

    invoke-static {}, Lcom/microblink/CouponType;->values()[Lcom/microblink/CouponType;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/CouponType$1;->createFromParcel(Landroid/os/Parcel;)Lcom/microblink/CouponType;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/microblink/CouponType;
    .locals 0

    new-array p1, p1, [Lcom/microblink/CouponType;

    return-object p1
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/CouponType$1;->newArray(I)[Lcom/microblink/CouponType;

    move-result-object p1

    return-object p1
.end method
