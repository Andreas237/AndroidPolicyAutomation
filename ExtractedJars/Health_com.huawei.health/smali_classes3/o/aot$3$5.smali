.class Lo/aot$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aot$3;->a()V
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
.field final synthetic c:Lo/aot$3;


# direct methods
.method constructor <init>(Lo/aot$3;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lo/aot$3$5;->c:Lo/aot$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 263
    invoke-virtual {p0, p1}, Lo/aot$3$5;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 267
    new-instance v4, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;-><init>()V

    .line 268
    iget-object v0, p0, Lo/aot$3$5;->c:Lo/aot$3;

    iget-wide v0, v0, Lo/aot$3;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->userID_:Ljava/lang/Long;

    .line 269
    iget-object v0, p0, Lo/aot$3$5;->c:Lo/aot$3;

    iget-wide v0, v0, Lo/aot$3;->e:J

    iput-wide v0, v4, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->publicUID_:J

    .line 270
    iget-object v0, p0, Lo/aot$3$5;->c:Lo/aot$3;

    iget-boolean v0, v0, Lo/aot$3;->d:Z

    iput-boolean v0, v4, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->isManual_:Z

    .line 271
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 272
    iget-object v0, p0, Lo/aot$3$5;->c:Lo/aot$3;

    iget-object v0, v0, Lo/aot$3;->b:Lo/aot;

    iget-object v1, p0, Lo/aot$3$5;->c:Lo/aot$3;

    iget v1, v1, Lo/aot$3;->c:I

    iget-object v2, p0, Lo/aot$3$5;->c:Lo/aot$3;

    iget-wide v2, v2, Lo/aot$3;->e:J

    invoke-static {v0, v1, v2, v3, v5}, Lo/aot;->c(Lo/aot;IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 273
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
