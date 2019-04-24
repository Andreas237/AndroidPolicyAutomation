.class public Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OtherUserInfo"
.end annotation


# instance fields
.field private frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

.field private frdState_:I

.field private gender_:I

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private needVerify_:I

.field private nickName_:Ljava/lang/String;

.field private phoneDigest_:Ljava/lang/String;

.field private region_:Lcom/huawei/health/sns/server/Region;

.field private signature_:Ljava/lang/String;

.field private siteID_:I

.field private userAccount_:Ljava/lang/String;

.field private userID_:J

.field private userType_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->gender_:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->userType_:I

    return v0
.end method


# virtual methods
.method public getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    return-object v0
.end method

.method public getFrdState()I
    .locals 1

    .line 110
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->frdState_:I

    .line 111
    return v0
.end method

.method public getGender_()I
    .locals 1

    .line 157
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->gender_:I

    .line 158
    return v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->imageURLDownload_:Ljava/lang/String;

    .line 141
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->imageURL_:Ljava/lang/String;

    .line 135
    return-object v0
.end method

.method public getNeedVerify_()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->needVerify_:I

    .line 129
    return v0
.end method

.method public getNickName_()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->nickName_:Ljava/lang/String;

    .line 147
    return-object v0
.end method

.method public getPhoneDigest_()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->phoneDigest_:Ljava/lang/String;

    .line 170
    return-object v0
.end method

.method public getRegion_()Lcom/huawei/health/sns/server/Region;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->region_:Lcom/huawei/health/sns/server/Region;

    return-object v0
.end method

.method public getSignature_()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->signature_:Ljava/lang/String;

    .line 164
    return-object v0
.end method

.method public getSiteID_()I
    .locals 1

    .line 175
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->siteID_:I

    .line 176
    return v0
.end method

.method public getUserAccount_()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->userAccount_:Ljava/lang/String;

    .line 123
    return-object v0
.end method

.method public getUserID_()J
    .locals 2

    .line 116
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->userID_:J

    .line 117
    return-wide v0
.end method

.method public getUserType_()I
    .locals 1

    .line 181
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->userType_:I

    .line 182
    return v0
.end method

.method public setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    .line 193
    return-void
.end method
