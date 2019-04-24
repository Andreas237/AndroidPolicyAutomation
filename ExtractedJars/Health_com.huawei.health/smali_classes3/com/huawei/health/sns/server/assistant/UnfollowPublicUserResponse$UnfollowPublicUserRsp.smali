.class public Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnfollowPublicUserRsp"
.end annotation


# instance fields
.field public publicUID_:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 35
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;->publicUID_:J

    return-void
.end method


# virtual methods
.method public getPublicUID_()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;->publicUID_:J

    return-wide v0
.end method

.method public setPublicUID_(J)V
    .locals 0

    .line 42
    iput-wide p1, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;->publicUID_:J

    .line 43
    return-void
.end method
