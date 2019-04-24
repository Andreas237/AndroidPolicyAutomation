.class public final Lcom/huawei/health/sns/logic/contacts/SnsFriend;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation
.end field


# instance fields
.field private final mIsDeleted:Z

.field private final mPhoneDigest:Ljava/lang/String;

.field private final mPhotoUri:Ljava/lang/String;

.field private final mSnsId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 171
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/contacts/SnsFriend$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-wide p1, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mSnsId:J

    .line 38
    iput-object p3, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhotoUri:Ljava/lang/String;

    .line 39
    iput-object p4, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhoneDigest:Ljava/lang/String;

    .line 40
    iput-boolean p5, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mIsDeleted:Z

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mSnsId:J

    .line 198
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhotoUri:Ljava/lang/String;

    .line 199
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhoneDigest:Ljava/lang/String;

    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mIsDeleted:Z

    .line 201
    return-void
.end method

.method public static from(Lcom/huawei/health/sns/model/user/User;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/User;)Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation

    .line 115
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 117
    if-eqz p0, :cond_1

    .line 119
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    .line 119
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    :cond_1
    return-object v7
.end method

.method public static from(Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;Z)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;Z)Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation

    .line 155
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 157
    if-eqz p0, :cond_0

    .line 159
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    move-object v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    :cond_0
    return-object v6
.end method

.method public static from(Lcom/huawei/health/sns/model/user/UserNotify;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/UserNotify;)Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation

    .line 134
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 136
    if-eqz p0, :cond_0

    .line 138
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    :cond_0
    return-object v6
.end method

.method public static from(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation

    .line 93
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 95
    if-eqz p0, :cond_1

    .line 97
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;

    .line 99
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {v9}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v9}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v4

    .line 100
    invoke-virtual {v9}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    .line 99
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    goto :goto_0

    .line 104
    :cond_1
    return-object v7
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 168
    const/4 v0, 0x0

    return v0
.end method

.method public getId()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mSnsId:J

    .line 49
    return-wide v0
.end method

.method public getPhoneDigest()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhoneDigest:Ljava/lang/String;

    .line 71
    return-object v0
.end method

.method public getPhotoUri()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhotoUri:Ljava/lang/String;

    .line 60
    return-object v0
.end method

.method public isDeleted()Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mIsDeleted:Z

    .line 82
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 189
    iget-wide v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mSnsId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhotoUri:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mPhoneDigest:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 192
    iget-boolean v0, p0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->mIsDeleted:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    return-void
.end method
