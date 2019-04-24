.class public Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FollowPublicUserRsp"
.end annotation


# instance fields
.field public publicUID_:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getPublicUID_()J
    .locals 2

    .line 33
    iget-wide v0, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;->publicUID_:J

    return-wide v0
.end method

.method public setPublicUID_(J)V
    .locals 0

    .line 37
    iput-wide p1, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;->publicUID_:J

    .line 38
    return-void
.end method
