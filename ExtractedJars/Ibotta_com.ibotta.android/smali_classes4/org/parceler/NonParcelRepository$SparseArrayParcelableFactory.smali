.class Lorg/parceler/NonParcelRepository$SparseArrayParcelableFactory;
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
    name = "SparseArrayParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Landroid/util/SparseArray;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 212
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$SparseArrayParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public buildParcelable(Landroid/util/SparseArray;)Landroid/os/Parcelable;
    .locals 1

    .line 216
    new-instance v0, Lorg/parceler/NonParcelRepository$SparseArrayParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$SparseArrayParcelable;-><init>(Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 212
    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$SparseArrayParcelableFactory;->buildParcelable(Landroid/util/SparseArray;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method
