.class final Lorg/parceler/NonParcelRepository$DoubleParcelable$DoubleParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$DoubleParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DoubleParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$DoubleParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 856
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 856
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$DoubleParcelable$DoubleParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 856
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$DoubleParcelable$DoubleParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$DoubleParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$DoubleParcelable;
    .locals 1

    .line 860
    new-instance v0, Lorg/parceler/NonParcelRepository$DoubleParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$DoubleParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 856
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$DoubleParcelable$DoubleParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$DoubleParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$DoubleParcelable;
    .locals 0

    .line 865
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$DoubleParcelable;

    return-object p1
.end method
