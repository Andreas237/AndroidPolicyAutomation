.class public Lcom/huawei/health/sns/model/chat/Album;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/Album;>;"
        }
    .end annotation
.end field


# instance fields
.field private count:I

.field private firstPhotoId:I

.field private name:Ljava/lang/String;

.field private photoIdList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Lcom/huawei/health/sns/model/chat/Album$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/Album$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/chat/Album;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->name:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/Album;->count:I

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/Album;->firstPhotoId:I

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    .line 80
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 82
    return-void
.end method


# virtual methods
.method public addPhotoItem(I)V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_0
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 110
    iget v0, p0, Lcom/huawei/health/sns/model/chat/Album;->count:I

    .line 111
    return v0
.end method

.method public getFirstPhotoId()I
    .locals 1

    .line 121
    iget v0, p0, Lcom/huawei/health/sns/model/chat/Album;->firstPhotoId:I

    .line 122
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->name:Ljava/lang/String;

    .line 100
    return-object v0
.end method

.method public getPhotoIdList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/health/sns/model/chat/Album;->count:I

    .line 117
    return-void
.end method

.method public setFirstPhotoId(I)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/huawei/health/sns/model/chat/Album;->firstPhotoId:I

    .line 128
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/Album;->name:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    iget v0, p0, Lcom/huawei/health/sns/model/chat/Album;->count:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    iget v0, p0, Lcom/huawei/health/sns/model/chat/Album;->firstPhotoId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Album;->photoIdList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 56
    return-void
.end method
