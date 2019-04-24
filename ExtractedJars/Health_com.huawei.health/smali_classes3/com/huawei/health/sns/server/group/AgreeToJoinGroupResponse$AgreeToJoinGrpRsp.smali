.class public Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AgreeToJoinGrpRsp"
.end annotation


# instance fields
.field public result_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;->result_:I

    return-void
.end method
