.class Lorg/parceler/NonParcelRepository$StringParcelableFactory;
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
    name = "StringParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 260
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$StringParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 260
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$StringParcelableFactory;->buildParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public buildParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 2

    .line 264
    new-instance v0, Lorg/parceler/NonParcelRepository$StringParcelable;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/parceler/NonParcelRepository$StringParcelable;-><init>(Ljava/lang/String;Lorg/parceler/NonParcelRepository$1;)V

    return-object v0
.end method
