.class final Lo/axc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axc;->b(Lo/axc;JIIZ)Lo/brd;
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
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:J

.field final synthetic e:Lo/axc;


# direct methods
.method constructor <init>(JILo/axc;IZ)V
    .locals 0

    .line 191
    iput-wide p1, p0, Lo/axc$1;->d:J

    iput p3, p0, Lo/axc$1;->b:I

    iput-object p4, p0, Lo/axc$1;->e:Lo/axc;

    iput p5, p0, Lo/axc$1;->a:I

    iput-boolean p6, p0, Lo/axc$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 191
    invoke-virtual {p0, p1}, Lo/axc$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 195
    new-instance v6, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;-><init>()V

    .line 196
    iget-wide v0, p0, Lo/axc$1;->d:J

    iput-wide v0, v6, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->frdUID_:J

    .line 197
    iget v0, p0, Lo/axc$1;->b:I

    iput v0, v6, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->stickFlag_:I

    .line 198
    invoke-static {v6}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v7

    .line 199
    iget-object v0, p0, Lo/axc$1;->e:Lo/axc;

    iget-wide v1, p0, Lo/axc$1;->d:J

    iget v3, p0, Lo/axc$1;->a:I

    move-object v4, v7

    iget-boolean v5, p0, Lo/axc$1;->c:Z

    invoke-static/range {v0 .. v5}, Lo/axc;->d(Lo/axc;JILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 200
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
