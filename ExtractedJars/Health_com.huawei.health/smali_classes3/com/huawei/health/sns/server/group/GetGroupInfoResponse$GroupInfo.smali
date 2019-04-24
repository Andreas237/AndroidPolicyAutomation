.class public Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GroupInfo"
.end annotation


# instance fields
.field private createTime_:Ljava/lang/String;

.field private grpID_:J

.field private grpManagerUID_:J

.field private grpMbVersion_:Ljava/lang/String;

.field private grpName_:Ljava/lang/String;

.field private grpTags_:Ljava/lang/String;

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private qrCode_:Ljava/lang/String;

.field private qrExpireTime_:Ljava/lang/String;

.field private siteID_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime_()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->createTime_:Ljava/lang/String;

    .line 147
    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 92
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->grpID_:J

    .line 93
    return-wide v0
.end method

.method public getGrpManagerUID_()J
    .locals 2

    .line 134
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->grpManagerUID_:J

    .line 135
    return-wide v0
.end method

.method public getGrpMbVersion_()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->grpMbVersion_:Ljava/lang/String;

    .line 141
    return-object v0
.end method

.method public getGrpName_()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->grpName_:Ljava/lang/String;

    .line 117
    return-object v0
.end method

.method public getGrpTags_()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->grpTags_:Ljava/lang/String;

    .line 99
    return-object v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->imageURLDownload_:Ljava/lang/String;

    .line 111
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->imageURL_:Ljava/lang/String;

    .line 105
    return-object v0
.end method

.method public getQrCode_()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->qrCode_:Ljava/lang/String;

    .line 123
    return-object v0
.end method

.method public getQrExpireTime_()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->qrExpireTime_:Ljava/lang/String;

    .line 129
    return-object v0
.end method

.method public getSiteID_()I
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;->siteID_:I

    .line 153
    return v0
.end method
