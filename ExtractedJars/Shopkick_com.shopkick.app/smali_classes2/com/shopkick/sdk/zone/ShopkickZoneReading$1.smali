.class final Lcom/shopkick/sdk/zone/ShopkickZoneReading$1;
.super Ljava/lang/Object;
.source "ShopkickZoneReading.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ShopkickZoneReading;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/shopkick/sdk/zone/ShopkickZoneReading;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/sdk/zone/ShopkickZoneReading;
    .locals 1

    .line 128
    new-instance v0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    invoke-direct {v0, p1}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 125
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ShopkickZoneReading$1;->createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/shopkick/sdk/zone/ShopkickZoneReading;
    .locals 0

    .line 133
    new-array p1, p1, [Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 125
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ShopkickZoneReading$1;->newArray(I)[Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    move-result-object p1

    return-object p1
.end method
