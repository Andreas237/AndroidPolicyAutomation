.class Lo/aox$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aox$2;->a()V
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
.field final synthetic c:Lo/aox$2;


# direct methods
.method constructor <init>(Lo/aox$2;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/aox$2$1;->c:Lo/aox$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 121
    invoke-virtual {p0, p1}, Lo/aox$2$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 125
    new-instance v2, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantRequest;-><init>()V

    .line 126
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 127
    iget-object v0, p0, Lo/aox$2$1;->c:Lo/aox$2;

    iget-object v0, v0, Lo/aox$2;->a:Lo/aox;

    iget-object v1, p0, Lo/aox$2$1;->c:Lo/aox$2;

    iget-object v1, v1, Lo/aox$2;->e:Lo/bca;

    invoke-static {v0, v3, v1}, Lo/aox;->c(Lo/aox;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lo/bca;)V

    .line 128
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
