.class final Lorg/parceler/NonParcelRepository$IBinderParcelable$IBinderParcelableCreator;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$IBinderParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "IBinderParcelableCreator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/parceler/NonParcelRepository$IBinderParcelable;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 976
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 976
    invoke-direct {p0}, Lorg/parceler/NonParcelRepository$IBinderParcelable$IBinderParcelableCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 976
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$IBinderParcelable$IBinderParcelableCreator;->createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$IBinderParcelable;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/parceler/NonParcelRepository$IBinderParcelable;
    .locals 1

    .line 980
    new-instance v0, Lorg/parceler/NonParcelRepository$IBinderParcelable;

    invoke-direct {v0, p1}, Lorg/parceler/NonParcelRepository$IBinderParcelable;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 976
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$IBinderParcelable$IBinderParcelableCreator;->newArray(I)[Lorg/parceler/NonParcelRepository$IBinderParcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/parceler/NonParcelRepository$IBinderParcelable;
    .locals 0

    .line 985
    new-array p1, p1, [Lorg/parceler/NonParcelRepository$IBinderParcelable;

    return-object p1
.end method
