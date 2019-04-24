.class Lo/aww$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aww$1;->a()V
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
.field final synthetic e:Lo/aww$1;


# direct methods
.method constructor <init>(Lo/aww$1;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/aww$1$1;->e:Lo/aww$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 81
    invoke-virtual {p0, p1}, Lo/aww$1$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 85
    new-instance v3, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;-><init>()V

    .line 86
    iget-object v0, p0, Lo/aww$1$1;->e:Lo/aww$1;

    iget-object v0, v0, Lo/aww$1;->d:Ljava/lang/String;

    iput-object v0, v3, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;->privacySetFlags_:Ljava/lang/String;

    .line 87
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 89
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_1

    .line 92
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Lo/aww$1$1;->e:Lo/aww$1;

    iget-object v0, v0, Lo/aww$1;->a:Lo/aww;

    iget-object v1, p0, Lo/aww$1$1;->e:Lo/aww$1;

    iget-object v1, v1, Lo/aww$1;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/aww;->b(Lo/aww;Ljava/lang/String;)V

    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lo/aww$1$1;->e:Lo/aww$1;

    iget-object v0, v0, Lo/aww$1;->a:Lo/aww;

    invoke-static {v0}, Lo/aww;->c(Lo/aww;)V

    .line 99
    const-string v0, "UpdateUserSNSInfoTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updatePrivacyFlags error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lo/aww$1$1;->e:Lo/aww$1;

    iget-object v0, v0, Lo/aww$1;->a:Lo/aww;

    iget v1, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-static {v0, v1}, Lo/aww;->b(Lo/aww;I)V

    .line 105
    const-string v0, "UpdateUserSNSInfoTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updatePrivacyFlags error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
