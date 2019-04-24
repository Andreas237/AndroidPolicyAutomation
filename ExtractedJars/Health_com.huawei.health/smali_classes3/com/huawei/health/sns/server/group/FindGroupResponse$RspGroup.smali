.class public Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/FindGroupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RspGroup"
.end annotation


# instance fields
.field private createTime_:Ljava/lang/String;

.field private grpID_:J

.field private grpManagerUID_:J

.field private grpName_:Ljava/lang/String;

.field private grpTags_:Ljava/lang/String;

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private mbNum_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime_()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->createTime_:Ljava/lang/String;

    .line 124
    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 99
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->grpID_:J

    .line 100
    return-wide v0
.end method

.method public getGrpManagerUID_()J
    .locals 2

    .line 117
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->grpManagerUID_:J

    .line 118
    return-wide v0
.end method

.method public getGrpName_()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->grpName_:Ljava/lang/String;

    .line 112
    return-object v0
.end method

.method public getGrpTags_()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->grpTags_:Ljava/lang/String;

    .line 106
    return-object v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->imageURLDownload_:Ljava/lang/String;

    .line 94
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->imageURL_:Ljava/lang/String;

    .line 88
    return-object v0
.end method

.method public getMbNum_()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;->mbNum_:I

    .line 130
    return v0
.end method
