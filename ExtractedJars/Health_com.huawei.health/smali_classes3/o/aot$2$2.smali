.class Lo/aot$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aot$2;->a()V
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
.field final synthetic c:Lo/aot$2;


# direct methods
.method constructor <init>(Lo/aot$2;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/aot$2$2;->c:Lo/aot$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 107
    invoke-virtual {p0, p1}, Lo/aot$2$2;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 111
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/aot$2$2;->c:Lo/aot$2;

    iget-wide v1, v1, Lo/aot$2;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 112
    if-nez v3, :cond_0

    .line 114
    iget-object v0, p0, Lo/aot$2$2;->c:Lo/aot$2;

    iget-object v0, v0, Lo/aot$2;->d:Lo/aot;

    const v1, 0x14ff1

    invoke-static {v0, v1}, Lo/aot;->b(Lo/aot;I)V

    .line 115
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 117
    :cond_0
    new-instance v4, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;-><init>()V

    .line 118
    iget-object v0, p0, Lo/aot$2$2;->c:Lo/aot$2;

    iget-wide v0, v0, Lo/aot$2;->c:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;->userID_:Ljava/lang/Long;

    .line 119
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;->publicUID_:J

    .line 120
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 121
    iget-object v0, p0, Lo/aot$2$2;->c:Lo/aot$2;

    iget-object v0, v0, Lo/aot$2;->d:Lo/aot;

    invoke-static {v0, v3, v5}, Lo/aot;->a(Lo/aot;Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 122
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
