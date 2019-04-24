.class Lo/arg$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arg$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/arg$2;


# direct methods
.method constructor <init>(Lo/arg$2;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/arg$2$1;->a:Lo/arg$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 121
    invoke-virtual {p0, p1}, Lo/arg$2$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 9

    .line 126
    new-instance v6, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 127
    move-object v0, v6

    iget-object v1, p0, Lo/arg$2$1;->a:Lo/arg$2;

    iget-wide v1, v1, Lo/arg$2;->e:J

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 128
    invoke-static {v6}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v7

    .line 129
    instance-of v0, v7, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    if-eqz v0, :cond_0

    .line 131
    move-object v8, v7

    check-cast v8, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    .line 132
    iget-object v0, p0, Lo/arg$2$1;->a:Lo/arg$2;

    iget-object v0, v0, Lo/arg$2;->b:Lo/arg;

    invoke-static {v0, v6, v8}, Lo/arg;->a(Lo/arg;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V

    .line 134
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
