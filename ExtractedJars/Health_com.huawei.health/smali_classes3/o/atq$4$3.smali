.class Lo/atq$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atq$4;->a()V
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
.field final synthetic d:Lo/atq$4;


# direct methods
.method constructor <init>(Lo/atq$4;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/atq$4$3;->d:Lo/atq$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 141
    invoke-virtual {p0, p1}, Lo/atq$4$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 145
    new-instance v4, Lcom/huawei/health/sns/server/group/UpdateGroupNameRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/group/UpdateGroupNameRequest;-><init>()V

    .line 146
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-wide v0, v0, Lo/atq$4;->c:J

    iput-wide v0, v4, Lcom/huawei/health/sns/server/group/UpdateGroupNameRequest;->grpID_:J

    .line 147
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->b:Ljava/lang/String;

    iput-object v0, v4, Lcom/huawei/health/sns/server/group/UpdateGroupNameRequest;->grpName_:Ljava/lang/String;

    .line 148
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 150
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 153
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    iget-object v1, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-wide v1, v1, Lo/atq$4;->c:J

    iget-object v3, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v3, v3, Lo/atq$4;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lo/atq;->b(Lo/atq;JLjava/lang/String;)V

    .line 156
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    invoke-static {v0}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 158
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    invoke-static {v0}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v1, v1, Lo/atq$4;->e:Lo/atq;

    invoke-static {v1}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget v2, v2, Lo/atq$4;->d:I

    iget-object v3, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v3, v3, Lo/atq$4;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_1

    .line 163
    :cond_0
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f0

    if-eq v0, v1, :cond_1

    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f2

    if-ne v0, v1, :cond_2

    .line 165
    :cond_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-wide v1, v1, Lo/atq$4;->c:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/atc;->e(JZ)Z

    .line 166
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    iget v1, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xc2

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/atq;->a(Lo/atq;III)V

    goto :goto_0

    .line 167
    :cond_2
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x405

    if-ne v0, v1, :cond_3

    .line 168
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    invoke-static {v0}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x72

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 170
    :cond_3
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    invoke-static {v0}, Lo/atq;->e(Lo/atq;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x70

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 172
    :goto_0
    const-string v0, "UpdateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateGroupNickname error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 177
    :cond_4
    iget-object v0, p0, Lo/atq$4$3;->d:Lo/atq$4;

    iget-object v0, v0, Lo/atq$4;->e:Lo/atq;

    iget v1, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v2, 0xaaa

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lo/atq;->d(Lo/atq;III)V

    .line 178
    const-string v0, "UpdateGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateGroupNickname error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    :cond_5
    :goto_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
