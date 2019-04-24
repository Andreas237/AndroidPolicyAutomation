.class Lorg/parceler/NonParcelRepository$ListParcelableFactory;
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
    name = "ListParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Ljava/util/List;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$ListParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 76
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$ListParcelableFactory;->buildParcelable(Ljava/util/List;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public buildParcelable(Ljava/util/List;)Landroid/os/Parcelable;
    .locals 1

    .line 80
    new-instance v0, Lorg/parceler/NonParcelRepository$ListParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$ListParcelable;-><init>(Ljava/util/List;)V

    return-object v0
.end method
