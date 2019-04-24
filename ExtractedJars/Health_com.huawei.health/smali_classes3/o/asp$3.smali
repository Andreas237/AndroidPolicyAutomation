.class final Lo/asp$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asp;->d(Lo/asp;J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic d:Lo/asp;


# direct methods
.method constructor <init>(JLo/asp;)V
    .locals 0

    .line 102
    iput-wide p1, p0, Lo/asp$3;->a:J

    iput-object p3, p0, Lo/asp$3;->d:Lo/asp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 102
    invoke-virtual {p0, p1}, Lo/asp$3;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 106
    const/4 v3, 0x0

    .line 107
    new-instance v4, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupRequest;-><init>()V

    .line 108
    iget-wide v0, p0, Lo/asp$3;->a:J

    iput-wide v0, v4, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupRequest;->grpID_:J

    .line 109
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 110
    iget-object v0, p0, Lo/asp$3;->d:Lo/asp;

    iget-wide v1, p0, Lo/asp$3;->a:J

    invoke-static {v0, v3, v1, v2}, Lo/asp;->a(Lo/asp;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;J)V

    .line 111
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
