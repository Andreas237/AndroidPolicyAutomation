.class public Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetOtherUserInfoRsp"
.end annotation


# instance fields
.field private otherUserInfo_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 26
    new-instance v0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->otherUserInfo_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    return-void
.end method


# virtual methods
.method public getOtherUserInfo_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->otherUserInfo_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    return-object v0
.end method
