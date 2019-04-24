.class public Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/contact/MatchContactsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ContactInfo"
.end annotation


# instance fields
.field private contactName:Ljava/lang/String;

.field private contactSortPinYin:Ljava/lang/String;

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private needVerify_:I

.field private nickName_:Ljava/lang/String;

.field private phoneDigest_:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private rawContactId:Ljava/lang/String;

.field private userID_:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public buildToUserNotify(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 2

    .line 127
    iget-wide v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->userID_:J

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->setUserId(J)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->imageURL_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setImageUrl(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->imageURLDownload_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setUrlDownload(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->nickName_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNickName(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->phoneDigest_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setPhoneDigest(Ljava/lang/String;)V

    .line 132
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNotifiedSide(I)V

    .line 133
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 134
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setSendTime(Ljava/lang/String;)V

    .line 136
    return-void
.end method

.method public getContactName()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->contactName:Ljava/lang/String;

    .line 104
    return-object v0
.end method

.method public getContactSortPinYin()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->contactSortPinYin:Ljava/lang/String;

    .line 122
    return-object v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->imageURLDownload_:Ljava/lang/String;

    .line 86
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->imageURL_:Ljava/lang/String;

    .line 80
    return-object v0
.end method

.method public getNeedVerify_()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->needVerify_:I

    .line 98
    return v0
.end method

.method public getNickName_()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->nickName_:Ljava/lang/String;

    .line 92
    return-object v0
.end method

.method public getPhoneDigest_()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->phoneDigest_:Ljava/lang/String;

    .line 68
    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->phoneNumber:Ljava/lang/String;

    .line 110
    return-object v0
.end method

.method public getRawContactId()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->rawContactId:Ljava/lang/String;

    .line 116
    return-object v0
.end method

.method public getUserID_()J
    .locals 2

    .line 73
    iget-wide v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->userID_:J

    .line 74
    return-wide v0
.end method
