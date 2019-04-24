.class public Lcom/microblink/Coupon;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/Coupon;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private amount:Lcom/microblink/FloatType;

.field private couponType:Lcom/microblink/CouponType;

.field private description:Lcom/microblink/StringType;

.field private sku:Lcom/microblink/StringType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/Coupon$1;

    invoke-direct {v0}, Lcom/microblink/Coupon$1;-><init>()V

    sput-object v0, Lcom/microblink/Coupon;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/microblink/CouponType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/CouponType;

    iput-object v0, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    const-class v0, Lcom/microblink/FloatType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/FloatType;

    iput-object v0, p0, Lcom/microblink/Coupon;->amount:Lcom/microblink/FloatType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/microblink/StringType;

    iput-object p1, p0, Lcom/microblink/Coupon;->description:Lcom/microblink/StringType;

    return-void
.end method

.method public constructor <init>(Lcom/microblink/CouponType;Lcom/microblink/FloatType;Lcom/microblink/StringType;Lcom/microblink/StringType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/microblink/Coupon;->amount:Lcom/microblink/FloatType;

    iput-object p1, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    iput-object p3, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    iput-object p4, p0, Lcom/microblink/Coupon;->description:Lcom/microblink/StringType;

    return-void
.end method


# virtual methods
.method public amount()Lcom/microblink/FloatType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Coupon;->amount:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public description()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Coupon;->description:Lcom/microblink/StringType;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/microblink/Coupon;

    iget-object v2, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    iget-object v3, p1, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    if-eqz v2, :cond_3

    iget-object p1, p1, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    invoke-virtual {v2, p1}, Lcom/microblink/StringType;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    iget-object p1, p1, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    if-nez p1, :cond_4

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/CouponType;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/microblink/StringType;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public sku()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Coupon{couponType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Coupon;->amount:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sku="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Coupon;->description:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public type()Lcom/microblink/CouponType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    return-object v0
.end method

.method public typeToString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/CouponType;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/Coupon;->couponType:Lcom/microblink/CouponType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/Coupon;->amount:Lcom/microblink/FloatType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/Coupon;->sku:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/Coupon;->description:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
