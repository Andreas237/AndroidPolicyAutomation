.class Lorg/parceler/NonParcelRepository$LinkedListParcelableFactory;
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
    name = "LinkedListParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "Ljava/util/LinkedList;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 148
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$LinkedListParcelableFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 0

    .line 148
    check-cast p1, Ljava/util/LinkedList;

    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$LinkedListParcelableFactory;->buildParcelable(Ljava/util/LinkedList;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public buildParcelable(Ljava/util/LinkedList;)Landroid/os/Parcelable;
    .locals 1

    .line 152
    new-instance v0, Lorg/parceler/NonParcelRepository$LinkedListParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$LinkedListParcelable;-><init>(Ljava/util/LinkedList;)V

    return-object v0
.end method
