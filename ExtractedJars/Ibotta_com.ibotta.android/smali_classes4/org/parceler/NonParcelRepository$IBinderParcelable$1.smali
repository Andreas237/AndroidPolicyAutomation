.class final Lorg/parceler/NonParcelRepository$IBinderParcelable$1;
.super Lorg/parceler/converter/NullableParcelConverter;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$IBinderParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/converter/NullableParcelConverter<",
        "Landroid/os/IBinder;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 952
    invoke-direct {p0}, Lorg/parceler/converter/NullableParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public nullSafeFromParcel(Landroid/os/Parcel;)Landroid/os/IBinder;
    .locals 0

    .line 956
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 952
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$IBinderParcelable$1;->nullSafeFromParcel(Landroid/os/Parcel;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public nullSafeToParcel(Landroid/os/IBinder;Landroid/os/Parcel;)V
    .locals 0

    .line 961
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    return-void
.end method

.method public bridge synthetic nullSafeToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 952
    check-cast p1, Landroid/os/IBinder;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/NonParcelRepository$IBinderParcelable$1;->nullSafeToParcel(Landroid/os/IBinder;Landroid/os/Parcel;)V

    return-void
.end method
