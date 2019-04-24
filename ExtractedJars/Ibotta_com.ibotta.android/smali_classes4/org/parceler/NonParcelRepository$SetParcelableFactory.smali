.class Lorg/parceler/NonParcelRepository$SetParcelableFactory;
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
    name = "SetParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Ljava/util/Set;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 172
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$SetParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 172
    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$SetParcelableFactory;->buildParcelable(Ljava/util/Set;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public buildParcelable(Ljava/util/Set;)Landroid/os/Parcelable;
    .locals 1

    .line 176
    new-instance v0, Lorg/parceler/NonParcelRepository$SetParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$SetParcelable;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
