.class final Lorg/parceler/NonParcelRepository$SparseArrayParcelable$SparseArrayCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$SparseArrayParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SparseArrayCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$SparseArrayParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 696
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 696
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$SparseArrayParcelable$SparseArrayCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 696
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$SparseArrayParcelable$SparseArrayCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$SparseArrayParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$SparseArrayParcelable;
    .locals 1

    .line 700
    new-instance v0, Lorg/parceler/NonParcelRepository$SparseArrayParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$SparseArrayParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 696
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$SparseArrayParcelable$SparseArrayCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$SparseArrayParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$SparseArrayParcelable;
    .locals 0

    .line 705
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$SparseArrayParcelable;

    return-object p1
.end method
