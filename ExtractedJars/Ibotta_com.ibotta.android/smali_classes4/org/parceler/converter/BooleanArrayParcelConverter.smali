.class public Lorg/parceler/converter/BooleanArrayParcelConverter;
.super Ljava/lang/Object;
.source "BooleanArrayParcelConverter.java"

# interfaces
.implements Lorg/parceler/ParcelConverter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/ParcelConverter<",
        "[Z>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic fromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lorg/parceler/converter/BooleanArrayParcelConverter;->fromParcel(Landroid/os/Parcel;)[Z

    move-result-object p1

    return-object p1
.end method

.method public fromParcel(Landroid/os/Parcel;)[Z
    .locals 2

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 46
    :cond_0
    new-array v0, v0, [Z

    .line 47
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBooleanArray([Z)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic toParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 25
    check-cast p1, [Z

    invoke-virtual {p0, p1, p2}, Lorg/parceler/converter/BooleanArrayParcelConverter;->toParcel([ZLandroid/os/Parcel;)V

    return-void
.end method

.method public toParcel([ZLandroid/os/Parcel;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    .line 32
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 34
    :cond_0
    array-length v0, p1

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 35
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    :goto_0
    return-void
.end method
