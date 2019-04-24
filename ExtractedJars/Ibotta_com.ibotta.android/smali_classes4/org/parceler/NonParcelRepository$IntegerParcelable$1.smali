.class final Lorg/parceler/NonParcelRepository$IntegerParcelable$1;
.super Lorg/parceler/converter/NullableParcelConverter;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$IntegerParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/converter/NullableParcelConverter<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 752
    invoke-direct {p0}, Lorg/parceler/converter/NullableParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Integer;
    .locals 0

    .line 756
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 752
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$IntegerParcelable$1;->nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public nullSafeToParcel(Ljava/lang/Integer;Landroid/os/Parcel;)V
    .locals 0

    .line 761
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public bridge synthetic nullSafeToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 752
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/NonParcelRepository$IntegerParcelable$1;->nullSafeToParcel(Ljava/lang/Integer;Landroid/os/Parcel;)V

    return-void
.end method
