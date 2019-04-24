.class public Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdateGroupImgRsp"
.end annotation


# instance fields
.field private grpID_:J

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 29
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->grpID_:J

    return-void
.end method


# virtual methods
.method public getGrpID_()J
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->grpID_:J

    .line 44
    return-wide v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->imageURLDownload_:Ljava/lang/String;

    .line 56
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->imageURL_:Ljava/lang/String;

    .line 50
    return-object v0
.end method
