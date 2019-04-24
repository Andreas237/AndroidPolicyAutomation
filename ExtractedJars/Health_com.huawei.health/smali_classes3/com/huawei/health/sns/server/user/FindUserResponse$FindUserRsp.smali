.class public Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/FindUserResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FindUserRsp"
.end annotation


# instance fields
.field private findUserInfo_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 26
    new-instance v0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->findUserInfo_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    return-void
.end method


# virtual methods
.method public getFindUserInfo_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->findUserInfo_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    return-object v0
.end method
