.class public final Lorg/parceler/NonParcelRepository$StringParcelable;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lorg/parceler/ParcelWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StringParcelable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/parceler/NonParcelRepository$StringParcelable$StringParcelableCreator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lorg/parceler/ParcelWrapper<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lorg/parceler/NonParcelRepository$StringParcelable$StringParcelableCreator;


# instance fields
.field private contents:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1173
    new-instance v0, Lorg/parceler/NonParcelRepository$StringParcelable$StringParcelableCreator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/parceler/NonParcelRepository$StringParcelable$StringParcelableCreator;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    sput-object v0, Lorg/parceler/NonParcelRepository$StringParcelable;->CREATOR:Lorg/parceler/NonParcelRepository$StringParcelable$StringParcelableCreator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 1176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1177
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/parceler/NonParcelRepository$StringParcelable;->contents:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 1168
    invoke-direct {p0, p1}, Lorg/parceler/NonParcelRepository$StringParcelable;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1181
    iput-object p1, p0, Lorg/parceler/NonParcelRepository$StringParcelable;->contents:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lorg/parceler/NonParcelRepository$1;)V
    .locals 0

    .line 1168
    invoke-direct {p0, p1}, Lorg/parceler/NonParcelRepository$StringParcelable;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic getParcel()Ljava/lang/Object;
    .locals 1

    .line 1168
    invoke-virtual {p0}, Lorg/parceler/NonParcelRepository$StringParcelable;->getParcel()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getParcel()Ljava/lang/String;
    .locals 1

    .line 1196
    iget-object v0, p0, Lorg/parceler/NonParcelRepository$StringParcelable;->contents:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1186
    iget-object p2, p0, Lorg/parceler/NonParcelRepository$StringParcelable;->contents:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
