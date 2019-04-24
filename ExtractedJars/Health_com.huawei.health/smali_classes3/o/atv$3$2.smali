.class Lo/atv$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atv$3;->a()V
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
.field final synthetic c:Lo/atv$3;


# direct methods
.method constructor <init>(Lo/atv$3;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lo/atv$3$2;->c:Lo/atv$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 277
    invoke-virtual {p0, p1}, Lo/atv$3$2;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 281
    const/4 v2, 0x0

    .line 282
    new-instance v3, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsRequest;-><init>()V

    .line 283
    iget-object v0, p0, Lo/atv$3$2;->c:Lo/atv$3;

    iget-object v0, v0, Lo/atv$3;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, v3, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsRequest;->grpID_:J

    .line 284
    move-object v2, v3

    .line 285
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 287
    iget-object v0, p0, Lo/atv$3$2;->c:Lo/atv$3;

    iget-object v0, v0, Lo/atv$3;->c:Lo/atv;

    iget-object v1, p0, Lo/atv$3$2;->c:Lo/atv$3;

    iget-object v1, v1, Lo/atv$3;->a:Ljava/lang/Long;

    invoke-static {v0, v1, v4}, Lo/atv;->e(Lo/atv;Ljava/lang/Long;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 288
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
