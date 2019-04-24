.class Lo/axf$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axf$2;->a()V
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
.field final synthetic d:Lo/axf$2;


# direct methods
.method constructor <init>(Lo/axf$2;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lo/axf$2$3;->d:Lo/axf$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 87
    invoke-virtual {p0, p1}, Lo/axf$2$3;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 91
    iget-object v0, p0, Lo/axf$2$3;->d:Lo/axf$2;

    iget-object v0, v0, Lo/axf$2;->a:Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 92
    instance-of v0, v3, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    if-eqz v0, :cond_0

    .line 94
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    .line 95
    iget-object v0, p0, Lo/axf$2$3;->d:Lo/axf$2;

    iget-object v0, v0, Lo/axf$2;->d:Lo/axf;

    iget-object v1, p0, Lo/axf$2$3;->d:Lo/axf$2;

    iget v1, v1, Lo/axf$2;->b:I

    iget-object v2, p0, Lo/axf$2$3;->d:Lo/axf$2;

    iget-object v2, v2, Lo/axf$2;->a:Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-static {v0, v1, v2, v4}, Lo/axf;->a(Lo/axf;ILcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)V

    .line 97
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
