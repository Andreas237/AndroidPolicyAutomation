.class Lo/atq$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atq$3;->a()V
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
.field final synthetic b:Lo/atq$3;


# direct methods
.method constructor <init>(Lo/atq$3;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/atq$3$5;->b:Lo/atq$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 72
    invoke-virtual {p0, p1}, Lo/atq$3$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 76
    new-instance v6, Lcom/huawei/health/sns/server/group/ModifyMemberNicknameRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/group/ModifyMemberNicknameRequest;-><init>()V

    .line 77
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-wide v0, v0, Lo/atq$3;->c:J

    iput-wide v0, v6, Lcom/huawei/health/sns/server/group/ModifyMemberNicknameRequest;->grpID_:J

    .line 78
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v0, v0, Lo/atq$3;->b:Ljava/lang/String;

    iput-object v0, v6, Lcom/huawei/health/sns/server/group/ModifyMemberNicknameRequest;->mbNickName_:Ljava/lang/String;

    .line 79
    invoke-static {v6}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v7

    .line 81
    iget v0, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 84
    iget v0, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 86
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-object v1, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-wide v1, v1, Lo/atq$3;->c:J

    iget-object v3, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-wide v3, v3, Lo/atq$3;->e:J

    iget-object v5, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v5, v5, Lo/atq$3;->b:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lo/ath;->c(JJLjava/lang/String;)Z

    .line 87
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v0, v0, Lo/atq$3;->a:Lo/atq;

    const/16 v1, 0xc4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/atq;->a(Lo/atq;III)V

    goto/16 :goto_1

    .line 91
    :cond_0
    iget v0, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f0

    if-eq v0, v1, :cond_1

    iget v0, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f2

    if-ne v0, v1, :cond_2

    .line 93
    :cond_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-wide v1, v1, Lo/atq$3;->c:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/atc;->e(JZ)Z

    .line 94
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v0, v0, Lo/atq$3;->a:Lo/atq;

    iget v1, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xc3

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/atq;->a(Lo/atq;III)V

    goto :goto_0

    .line 95
    :cond_2
    iget v0, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x405

    if-ne v0, v1, :cond_3

    .line 96
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v0, v0, Lo/atq$3;->a:Lo/atq;

    invoke-static {v0}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x72

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 98
    :cond_3
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v0, v0, Lo/atq$3;->a:Lo/atq;

    invoke-static {v0}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x70

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 101
    :goto_0
    const-string v0, "UpdateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateGroupNickname error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 106
    :cond_4
    iget-object v0, p0, Lo/atq$3$5;->b:Lo/atq$3;

    iget-object v0, v0, Lo/atq$3;->a:Lo/atq;

    iget v1, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v2, 0xaaa

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lo/atq;->d(Lo/atq;III)V

    .line 107
    const-string v0, "UpdateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateGroupNickname error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :goto_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
