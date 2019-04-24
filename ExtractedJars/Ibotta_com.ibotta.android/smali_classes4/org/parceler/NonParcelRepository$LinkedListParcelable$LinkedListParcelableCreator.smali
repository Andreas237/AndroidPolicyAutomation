.class final Lorg/parceler/NonParcelRepository$LinkedListParcelable$LinkedListParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$LinkedListParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LinkedListParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$LinkedListParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 343
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 343
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$LinkedListParcelable$LinkedListParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 343
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$LinkedListParcelable$LinkedListParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$LinkedListParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$LinkedListParcelable;
    .locals 1

    .line 347
    new-instance v0, Lorg/parceler/NonParcelRepository$LinkedListParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$LinkedListParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 343
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$LinkedListParcelable$LinkedListParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$LinkedListParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$LinkedListParcelable;
    .locals 0

    .line 352
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$LinkedListParcelable;

    return-object p1
.end method
