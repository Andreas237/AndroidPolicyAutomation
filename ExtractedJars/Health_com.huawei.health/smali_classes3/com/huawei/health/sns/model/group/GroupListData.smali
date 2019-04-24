.class public Lcom/huawei/health/sns/model/group/GroupListData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/group/GroupListData;>;"
        }
    .end annotation
.end field


# instance fields
.field private groupList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field

.field private groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 127
    new-instance v0, Lcom/huawei/health/sns/model/group/GroupListData$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/group/GroupListData$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/group/GroupListData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    .line 36
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    .line 145
    const-class v0, Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/GroupNotify;

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    const-class v1, Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 148
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/group/GroupListData$1;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/group/GroupListData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 116
    const/4 v0, 0x0

    return v0
.end method

.method public getFunctionBaseCardBeanList()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/bfh;>;"
        }
    .end annotation

    .line 87
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 97
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    goto :goto_0

    .line 100
    :cond_1
    return-object v1
.end method

.method public getGroupList()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 59
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 64
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    goto :goto_0

    .line 67
    :cond_0
    return-object v1
.end method

.method public getNotifyCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->getInviteCount()I

    move-result v0

    return v0

    .line 49
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setGroupList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;)V"
        }
    .end annotation

    .line 77
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    .line 78
    return-void
.end method

.method public setGroupNotify(Lcom/huawei/health/sns/model/group/GroupNotify;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 111
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupNotify:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupListData;->groupList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 125
    return-void
.end method
