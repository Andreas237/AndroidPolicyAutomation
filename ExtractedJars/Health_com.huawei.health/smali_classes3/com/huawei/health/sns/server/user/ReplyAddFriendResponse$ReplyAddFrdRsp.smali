.class public Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReplyAddFrdRsp"
.end annotation


# instance fields
.field public result_:I

.field public sendTime_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->result_:I

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->sendTime_:Ljava/lang/String;

    return-void
.end method
