.class final Lcom/shopkick/sdk/zone/ZoneParcelable$1;
.super Ljava/lang/Object;
.source "ZoneParcelable.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ZoneParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/shopkick/sdk/zone/ZoneParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/sdk/zone/ZoneParcelable;
    .locals 2

    .line 207
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneParcelable;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/shopkick/sdk/zone/ZoneParcelable;-><init>(Landroid/os/Parcel;Lcom/shopkick/sdk/zone/ZoneParcelable$1;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 204
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$1;->createFromParcel(Landroid/os/Parcel;)Lcom/shopkick/sdk/zone/ZoneParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/shopkick/sdk/zone/ZoneParcelable;
    .locals 0

    .line 212
    new-array p1, p1, [Lcom/shopkick/sdk/zone/ZoneParcelable;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 204
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable$1;->newArray(I)[Lcom/shopkick/sdk/zone/ZoneParcelable;

    move-result-object p1

    return-object p1
.end method
