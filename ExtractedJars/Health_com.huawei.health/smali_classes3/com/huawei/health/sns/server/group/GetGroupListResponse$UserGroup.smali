.class public Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UserGroup"
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

.field private setFlags_:Ljava/lang/String;

.field private siteID_:I

.field private state_:I

.field private stickTime_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime_()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->createTime_:Ljava/lang/String;

    .line 177
    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 116
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->grpID_:J

    .line 117
    return-wide v0
.end method

.method public getGrpManagerUID_()J
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->grpManagerUID_:J

    .line 159
    return-wide v0
.end method

.method public getGrpMbVersion_()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->grpMbVersion_:Ljava/lang/String;

    .line 147
    return-object v0
.end method

.method public getGrpName_()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->grpName_:Ljava/lang/String;

    .line 141
    return-object v0
.end method

.method public getGrpTags_()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->grpTags_:Ljava/lang/String;

    .line 123
    return-object v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->imageURLDownload_:Ljava/lang/String;

    .line 135
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->imageURL_:Ljava/lang/String;

    .line 129
    return-object v0
.end method

.method public getSetFlags_()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->setFlags_:Ljava/lang/String;

    .line 153
    return-object v0
.end method

.method public getSiteID_()I
    .locals 1

    .line 182
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->siteID_:I

    .line 183
    return v0
.end method

.method public getState_()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->state_:I

    .line 165
    return v0
.end method

.method public getStickTime_()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;->stickTime_:Ljava/lang/String;

    .line 171
    return-object v0
.end method
