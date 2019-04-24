.class public Lcom/ibotta/android/windfall/WindfallCoupon;
.super Ljava/lang/Object;
.source "WindfallCoupon.java"


# instance fields
.field private couponAmount:Ljava/lang/String;

.field private couponType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCouponAmount()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallCoupon;->couponAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getCouponType()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallCoupon;->couponType:Ljava/lang/String;

    return-object v0
.end method

.method public setCouponAmount(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallCoupon;->couponAmount:Ljava/lang/String;

    return-void
.end method

.method public setCouponType(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallCoupon;->couponType:Ljava/lang/String;

    return-void
.end method
