.class Lo/asv$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asv$4;->a()V
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
.field final synthetic b:Lo/asv$4;


# direct methods
.method constructor <init>(Lo/asv$4;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lo/asv$4$5;->b:Lo/asv$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 87
    invoke-virtual {p0, p1}, Lo/asv$4$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 91
    const/4 v4, 0x0

    .line 93
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-boolean v0, v0, Lo/asv$4;->e:Z

    if-eqz v0, :cond_0

    .line 95
    new-instance v5, Lcom/huawei/health/sns/server/group/DismissGroupRequest;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/group/DismissGroupRequest;-><init>()V

    .line 96
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v0, v0, Lo/asv$4;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v5, Lcom/huawei/health/sns/server/group/DismissGroupRequest;->grpID_:J

    .line 97
    move-object v4, v5

    .line 98
    goto :goto_0

    .line 102
    :cond_0
    new-instance v5, Lcom/huawei/health/sns/server/group/QuitGroupRequest;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/group/QuitGroupRequest;-><init>()V

    .line 103
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v0, v0, Lo/asv$4;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v5, Lcom/huawei/health/sns/server/group/QuitGroupRequest;->grpID_:J

    .line 104
    move-object v4, v5

    .line 106
    :goto_0
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 108
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 111
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_1

    .line 114
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v1, v1, Lo/asv$4;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/atc;->e(JZ)Z

    .line 115
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v0, v0, Lo/asv$4;->b:Lo/asv;

    const/16 v1, 0xb1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/asv;->a(Lo/asv;III)V

    goto/16 :goto_2

    .line 119
    :cond_1
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f0

    if-eq v0, v1, :cond_2

    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f2

    if-ne v0, v1, :cond_3

    .line 122
    :cond_2
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v1, v1, Lo/asv$4;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/atc;->e(JZ)Z

    .line 123
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v0, v0, Lo/asv$4;->b:Lo/asv;

    const/16 v1, 0xb1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/asv;->a(Lo/asv;III)V

    goto :goto_1

    .line 127
    :cond_3
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v0, v0, Lo/asv$4;->b:Lo/asv;

    iget v1, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xb2

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/asv;->a(Lo/asv;III)V

    .line 129
    :goto_1
    const-string v0, "DeleteGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteGroup error!  resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 134
    :cond_4
    iget-object v0, p0, Lo/asv$4$5;->b:Lo/asv$4;

    iget-object v0, v0, Lo/asv$4;->b:Lo/asv;

    iget v1, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v2, 0xaaa

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lo/asv;->a(Lo/asv;III)V

    .line 135
    const-string v0, "DeleteGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteGroup error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    :goto_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
