.class final Lorg/parceler/NonParcelRepository$ByteArrayParcelable$1;
.super Lorg/parceler/converter/NullableParcelConverter;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$ByteArrayParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/converter/NullableParcelConverter<",
        "[B>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 992
    invoke-direct {p0}, Lorg/parceler/converter/NullableParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 992
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable$1;->nullSafeFromParcel(Landroid/os/Parcel;)[B

    move-result-object p1

    return-object p1
.end method

.method public nullSafeFromParcel(Landroid/os/Parcel;)[B
    .locals 0

    .line 996
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic nullSafeToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 992
    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable$1;->nullSafeToParcel([BLandroid/os/Parcel;)V

    return-void
.end method

.method public nullSafeToParcel([BLandroid/os/Parcel;)V
    .locals 0

    .line 1001
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
