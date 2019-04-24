.class public Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoResponse$UpdateUserSNSInfoRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdateUserSNSInfoRsp"
.end annotation


# instance fields
.field public userID_:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getUserID_()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoResponse$UpdateUserSNSInfoRsp;->userID_:J

    return-wide v0
.end method

.method public setUserID_(J)V
    .locals 0

    .line 33
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoResponse$UpdateUserSNSInfoRsp;->userID_:J

    .line 34
    return-void
.end method
