.class public Lcom/huawei/health/suggestion/model/CourseTopic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/CourseTopic;>;"
        }
    .end annotation
.end field


# instance fields
.field private hasMore:Z

.field private pageSize:I

.field private resultCode:Ljava/lang/String;

.field private resultDesc:Ljava/lang/String;

.field private topicList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;"
        }
    .end annotation
.end field

.field private total:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 101
    new-instance v0, Lcom/huawei/health/suggestion/model/CourseTopic$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/CourseTopic$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/CourseTopic;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultCode:Ljava/lang/String;

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultDesc:Ljava/lang/String;

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->total:I

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->pageSize:I

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->hasMore:Z

    .line 83
    sget-object v0, Lcom/huawei/health/suggestion/model/Topic;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->topicList:Ljava/util/List;

    .line 84
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public getPageSize()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->pageSize:I

    return v0
.end method

.method public getResultCode()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultCode:Ljava/lang/String;

    return-object v0
.end method

.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getTopicList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->topicList:Ljava/util/List;

    return-object v0
.end method

.method public getTotal()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->total:I

    return v0
.end method

.method public isHasMore()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->hasMore:Z

    return v0
.end method

.method public saveHasMore(Z)V
    .locals 0

    .line 66
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->hasMore:Z

    .line 67
    return-void
.end method

.method public savePageSize(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->pageSize:I

    .line 59
    return-void
.end method

.method public saveResultCode(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultCode:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public saveResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultDesc:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public saveTopicList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 74
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->topicList:Ljava/util/List;

    .line 75
    return-void
.end method

.method public saveTotal(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->total:I

    .line 51
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->resultDesc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 90
    iget v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->total:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    iget v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->pageSize:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->hasMore:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 93
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/CourseTopic;->topicList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 94
    return-void
.end method
