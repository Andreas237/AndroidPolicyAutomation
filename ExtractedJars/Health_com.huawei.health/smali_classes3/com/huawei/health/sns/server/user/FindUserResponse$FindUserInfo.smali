.class public Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/FindUserResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FindUserInfo"
.end annotation


# instance fields
.field private gender_:I

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private needVerify_:I

.field private nickName_:Ljava/lang/String;

.field private phoneDigest_:Ljava/lang/String;

.field private region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

.field private setFlags_:Ljava/lang/String;

.field private signature_:Ljava/lang/String;

.field private siteID_:I

.field private stickTime_:Ljava/lang/String;

.field private userID_:J

.field private userType_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;)I
    .locals 1

    .line 44
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->needVerify_:I

    return v0
.end method


# virtual methods
.method public covertToUser()Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 126
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 127
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->userID_:J

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 128
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->needVerify_:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->imageURL_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->imageURLDownload_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->nickName_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 132
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->gender_:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getNationalCode_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNationalCode(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getProvince_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->getCity_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->signature_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->phoneDigest_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 141
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->siteID_:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->setFlags_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->stickTime_:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setStickTime(Ljava/lang/String;)V

    .line 144
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->userType_:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setUserType(I)V

    .line 145
    return-object v2
.end method

.method public getUserID_()J
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->userID_:J

    return-wide v0
.end method

.method public getUserType_()I
    .locals 1

    .line 113
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->userType_:I

    return v0
.end method
