.class Lo/arg$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arg$4;->a()V
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
.field final synthetic a:Lo/arg$4;


# direct methods
.method constructor <init>(Lo/arg$4;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lo/arg$4$2;->a:Lo/arg$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 231
    invoke-virtual {p0, p1}, Lo/arg$4$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 235
    new-instance v2, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;-><init>()V

    .line 236
    iget-object v0, p0, Lo/arg$4$2;->a:Lo/arg$4;

    iget-object v0, v0, Lo/arg$4;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iput-wide v0, v2, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->account_id_:J

    .line 237
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 238
    iget-object v0, p0, Lo/arg$4$2;->a:Lo/arg$4;

    iget-object v0, v0, Lo/arg$4;->c:Lo/arg;

    iget-object v1, p0, Lo/arg$4$2;->a:Lo/arg$4;

    iget-object v1, v1, Lo/arg$4;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v3, v1}, Lo/arg;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/user/User;)V

    .line 239
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
