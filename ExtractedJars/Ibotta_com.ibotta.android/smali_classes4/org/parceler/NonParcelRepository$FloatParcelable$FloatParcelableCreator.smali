.class final Lorg/parceler/NonParcelRepository$FloatParcelable$FloatParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$FloatParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "FloatParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$FloatParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 896
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 896
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$FloatParcelable$FloatParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 896
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$FloatParcelable$FloatParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$FloatParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$FloatParcelable;
    .locals 1

    .line 900
    new-instance v0, Lorg/parceler/NonParcelRepository$FloatParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$FloatParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 896
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$FloatParcelable$FloatParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$FloatParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$FloatParcelable;
    .locals 0

    .line 905
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$FloatParcelable;

    return-object p1
.end method
