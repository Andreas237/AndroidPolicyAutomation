.class Lorg/parceler/NonParcelRepository$FloatParcelableFactory;
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
    name = "FloatParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 244
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$FloatParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public buildParcelable(Ljava/lang/Float;)Landroid/os/Parcelable;
    .locals 1

    .line 248
    new-instance v0, Lorg/parceler/NonParcelRepository$FloatParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$FloatParcelable;-><init>(Ljava/lang/Float;)V

    return-object v0
.end method

.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 244
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$FloatParcelableFactory;->buildParcelable(Ljava/lang/Float;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method
