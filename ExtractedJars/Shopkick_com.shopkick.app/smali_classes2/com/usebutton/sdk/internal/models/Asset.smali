.class public Lcom/usebutton/sdk/internal/models/Asset;
.super Ljava/lang/Object;
.source "Asset.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mData:[B

.field private final mFillMode:Ljava/lang/String;

.field private final mScale:D

.field private final mUrl:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/usebutton/sdk/internal/models/Asset$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Asset$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Asset;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;DLjava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mUrl:Landroid/net/Uri;

    .line 49
    iput-wide p2, p0, Lcom/usebutton/sdk/internal/models/Asset;->mScale:D

    .line 50
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/Asset;->mFillMode:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mScale:D

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mFillMode:Ljava/lang/String;

    .line 43
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ParcelableUtils;->getNextByteArray(Landroid/os/Parcel;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    .line 44
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mUrl:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>([BD)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    .line 35
    iput-wide p2, p0, Lcom/usebutton/sdk/internal/models/Asset;->mScale:D

    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mFillMode:Ljava/lang/String;

    .line 37
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mUrl:Landroid/net/Uri;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/ImageDTO;)Lcom/usebutton/sdk/internal/models/Asset;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Asset;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->mUrl:Landroid/net/Uri;

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->mScale:D

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/ImageDTO;->mFillMode:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/usebutton/sdk/internal/models/Asset;-><init>(Landroid/net/Uri;DLjava/lang/String;)V

    return-object v0
.end method

.method public static fromDTOs(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ImageDTO;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 63
    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/Asset;->fromDTO(Lcom/usebutton/sdk/internal/api/models/ImageDTO;)Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getData()[B
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    return-object v0
.end method

.method public getFillMode()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mFillMode:Ljava/lang/String;

    return-object v0
.end method

.method public getScale()D
    .locals 2

    .line 73
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mScale:D

    return-wide v0
.end method

.method public getUrl()Landroid/net/Uri;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mUrl:Landroid/net/Uri;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public setData([B)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Asset{mData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    .line 95
    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->imageSizeString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mScale:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mFillMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mFillMode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Asset;->mUrl:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mScale:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mFillMode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mData:[B

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/ParcelableUtils;->writeByteArray(Landroid/os/Parcel;[B)V

    .line 85
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Asset;->mUrl:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
