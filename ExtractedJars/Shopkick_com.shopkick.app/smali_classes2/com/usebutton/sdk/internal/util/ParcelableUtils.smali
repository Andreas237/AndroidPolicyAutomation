.class public Lcom/usebutton/sdk/internal/util/ParcelableUtils;
.super Ljava/lang/Object;
.source "ParcelableUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getNextByteArray(Landroid/os/Parcel;)[B
    .locals 1

    .line 7
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-gez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 11
    :cond_0
    new-array v0, v0, [B

    .line 12
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->readByteArray([B)V

    return-object v0
.end method

.method public static writeByteArray(Landroid/os/Parcel;[B)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    .line 18
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    .line 21
    :cond_0
    array-length v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
