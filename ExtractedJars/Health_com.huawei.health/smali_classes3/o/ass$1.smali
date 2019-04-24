.class Lo/ass$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ass;->d(IJ)Lo/brd;
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
.field final synthetic a:Lo/ass;

.field final synthetic b:I

.field final synthetic c:J


# direct methods
.method constructor <init>(Lo/ass;JI)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/ass$1;->a:Lo/ass;

    iput-wide p2, p0, Lo/ass$1;->c:J

    iput p4, p0, Lo/ass$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 98
    invoke-virtual {p0, p1}, Lo/ass$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 102
    new-instance v4, Lcom/huawei/health/sns/server/group/ApplyJoinGrpRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/group/ApplyJoinGrpRequest;-><init>()V

    .line 103
    iget-wide v0, p0, Lo/ass$1;->c:J

    iput-wide v0, v4, Lcom/huawei/health/sns/server/group/ApplyJoinGrpRequest;->grpID_:J

    .line 104
    const/4 v0, 0x0

    iput v0, v4, Lcom/huawei/health/sns/server/group/ApplyJoinGrpRequest;->addType_:I

    .line 105
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 107
    iget-object v0, p0, Lo/ass$1;->a:Lo/ass;

    iget v1, p0, Lo/ass$1;->b:I

    iget-wide v2, p0, Lo/ass$1;->c:J

    invoke-static {v0, v1, v2, v3, v5}, Lo/ass;->a(Lo/ass;IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 108
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
