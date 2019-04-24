.class Lorg/parceler/NonParcelRepository$ByteParcelableFactory;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Lorg/parceler/Parcels$ParcelableFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ByteParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Ljava/lang/Byte;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 252
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$ByteParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public buildParcelable(Ljava/lang/Byte;)Landroid/os/Parcelable;
    .locals 1

    .line 256
    new-instance v0, Lorg/parceler/NonParcelRepository$ByteParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$ByteParcelable;-><init>(Ljava/lang/Byte;)V

    return-object v0
.end method

.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 252
    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ByteParcelableFactory;->buildParcelable(Ljava/lang/Byte;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method
