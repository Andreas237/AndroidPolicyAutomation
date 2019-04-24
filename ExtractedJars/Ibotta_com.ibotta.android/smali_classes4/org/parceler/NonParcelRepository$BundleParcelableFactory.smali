.class Lorg/parceler/NonParcelRepository$BundleParcelableFactory;
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
    name = "BundleParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$BundleParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public buildParcelable(Landroid/os/Bundle;)Landroid/os/Parcelable;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 132
    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$BundleParcelableFactory;->buildParcelable(Landroid/os/Bundle;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method
