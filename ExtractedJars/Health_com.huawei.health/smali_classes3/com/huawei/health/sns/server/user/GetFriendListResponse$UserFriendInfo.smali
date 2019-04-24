.class public Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetFriendListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UserFriendInfo"
.end annotation


# instance fields
.field private contactName:Ljava/lang/String;

.field private frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

.field private frdUID_:J

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private nickName_:Ljava/lang/String;

.field private phoneDigest_:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private relation_:I

.field private remarkName_:Ljava/lang/String;

.field private setFlags_:Ljava/lang/String;

.field private siteID_:I

.field private state_:I

.field private stickTime_:Ljava/lang/String;

.field private userType_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getContactName()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->contactName:Ljava/lang/String;

    .line 219
    return-object v0
.end method

.method public getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 152
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->frdUID_:J

    .line 153
    return-wide v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->imageURLDownload_:Ljava/lang/String;

    .line 171
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->imageURL_:Ljava/lang/String;

    .line 165
    return-object v0
.end method

.method public getNickName_()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->nickName_:Ljava/lang/String;

    .line 177
    return-object v0
.end method

.method public getPhoneDigest_()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->phoneDigest_:Ljava/lang/String;

    .line 183
    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->phoneNumber:Ljava/lang/String;

    .line 213
    return-object v0
.end method

.method public getRelation_()I
    .locals 1

    .line 194
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->relation_:I

    .line 195
    return v0
.end method

.method public getRemarkName_()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->remarkName_:Ljava/lang/String;

    .line 159
    return-object v0
.end method

.method public getSetFlags_()Ljava/lang/String;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->setFlags_:Ljava/lang/String;

    .line 225
    return-object v0
.end method

.method public getSiteID_()I
    .locals 1

    .line 200
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->siteID_:I

    .line 201
    return v0
.end method

.method public getState_()I
    .locals 1

    .line 188
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->state_:I

    .line 189
    return v0
.end method

.method public getStickTime_()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->stickTime_:Ljava/lang/String;

    .line 231
    return-object v0
.end method

.method public getUserType_()I
    .locals 1

    .line 206
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->userType_:I

    .line 207
    return v0
.end method

.method public setContactName(Ljava/lang/String;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->contactName:Ljava/lang/String;

    .line 247
    return-void
.end method

.method public setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    .line 257
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->phoneNumber:Ljava/lang/String;

    .line 242
    return-void
.end method

.method public setStickTime_(Ljava/lang/String;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->stickTime_:Ljava/lang/String;

    .line 237
    return-void
.end method
