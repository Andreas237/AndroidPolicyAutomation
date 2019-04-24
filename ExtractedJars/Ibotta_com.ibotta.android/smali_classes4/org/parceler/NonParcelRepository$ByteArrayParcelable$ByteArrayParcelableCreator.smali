.class final Lorg/parceler/NonParcelRepository$ByteArrayParcelable$ByteArrayParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$ByteArrayParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ByteArrayParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$ByteArrayParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1016
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 1016
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable$ByteArrayParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1016
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable$ByteArrayParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$ByteArrayParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$ByteArrayParcelable;
    .locals 1

    .line 1020
    new-instance v0, Lorg/parceler/NonParcelRepository$ByteArrayParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1016
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable$ByteArrayParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$ByteArrayParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$ByteArrayParcelable;
    .locals 0

    .line 1025
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$ByteArrayParcelable;

    return-object p1
.end method
