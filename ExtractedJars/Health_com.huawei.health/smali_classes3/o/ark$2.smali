.class final Lo/ark$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ark;->b(JLo/ark;I)Lo/brd;
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
.field final synthetic c:Lo/ark;

.field final synthetic d:I

.field final synthetic e:J


# direct methods
.method constructor <init>(JLo/ark;I)V
    .locals 0

    .line 317
    iput-wide p1, p0, Lo/ark$2;->e:J

    iput-object p3, p0, Lo/ark$2;->c:Lo/ark;

    iput p4, p0, Lo/ark$2;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 317
    invoke-virtual {p0, p1}, Lo/ark$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 321
    new-instance v4, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;-><init>()V

    .line 322
    iget-wide v0, p0, Lo/ark$2;->e:J

    iput-wide v0, v4, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->account_id_:J

    .line 323
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 324
    iget-object v0, p0, Lo/ark$2;->c:Lo/ark;

    iget-wide v1, p0, Lo/ark$2;->e:J

    iget v3, p0, Lo/ark$2;->d:I

    invoke-static {v0, v5, v1, v2, v3}, Lo/ark;->e(Lo/ark;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JI)V

    .line 325
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
