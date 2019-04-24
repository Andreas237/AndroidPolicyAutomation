.class final Lorg/parceler/NonParcelRepository$ByteParcelable$1;
.super Lorg/parceler/converter/NullableParcelConverter;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$ByteParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/converter/NullableParcelConverter<",
        "Ljava/lang/Byte;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 912
    invoke-direct {p0}, Lorg/parceler/converter/NullableParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Byte;
    .locals 0

    .line 916
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 912
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ByteParcelable$1;->nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public nullSafeToParcel(Ljava/lang/Byte;Landroid/os/Parcel;)V
    .locals 0

    .line 921
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method

.method public bridge synthetic nullSafeToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 912
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/NonParcelRepository$ByteParcelable$1;->nullSafeToParcel(Ljava/lang/Byte;Landroid/os/Parcel;)V

    return-void
.end method
