.class final Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable$LinkedHashSetParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LinkedHashSetParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 616
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 616
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable$LinkedHashSetParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 616
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable$LinkedHashSetParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;
    .locals 1

    .line 620
    new-instance v0, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 616
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable$LinkedHashSetParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;
    .locals 0

    .line 625
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;

    return-object p1
.end method
