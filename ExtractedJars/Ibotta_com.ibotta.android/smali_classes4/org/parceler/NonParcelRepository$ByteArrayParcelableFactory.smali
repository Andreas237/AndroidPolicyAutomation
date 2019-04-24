.class Lorg/parceler/NonParcelRepository$ByteArrayParcelableFactory;
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
    name = "ByteArrayParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "[B>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$ByteArrayParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 100
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ByteArrayParcelableFactory;->buildParcelable([B)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public buildParcelable([B)Landroid/os/Parcelable;
    .locals 1

    .line 104
    new-instance v0, Lorg/parceler/NonParcelRepository$ByteArrayParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$ByteArrayParcelable;-><init>([B)V

    return-object v0
.end method
