.class final Lo/asx$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asx;->e(Lo/asx;IJZZ)Lo/brd;
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
.field final synthetic a:Z

.field final synthetic b:Lo/asx;

.field final synthetic c:J

.field final synthetic d:I

.field final synthetic e:Z


# direct methods
.method constructor <init>(JLo/asx;IZZ)V
    .locals 0

    .line 227
    iput-wide p1, p0, Lo/asx$4;->c:J

    iput-object p3, p0, Lo/asx$4;->b:Lo/asx;

    iput p4, p0, Lo/asx$4;->d:I

    iput-boolean p5, p0, Lo/asx$4;->a:Z

    iput-boolean p6, p0, Lo/asx$4;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 227
    invoke-virtual {p0, p1}, Lo/asx$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 12

    .line 231
    new-instance v7, Lcom/huawei/health/sns/server/group/FindGroupRequest;

    invoke-direct {v7}, Lcom/huawei/health/sns/server/group/FindGroupRequest;-><init>()V

    .line 232
    iget-wide v0, p0, Lo/asx$4;->c:J

    iput-wide v0, v7, Lcom/huawei/health/sns/server/group/FindGroupRequest;->grpID_:J

    .line 233
    invoke-static {v7}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v8

    .line 235
    iget v0, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 238
    iget v0, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    instance-of v0, v8, Lcom/huawei/health/sns/server/group/FindGroupResponse;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lo/asx$4;->b:Lo/asx;

    iget v1, p0, Lo/asx$4;->d:I

    iget-wide v2, p0, Lo/asx$4;->c:J

    iget-boolean v4, p0, Lo/asx$4;->a:Z

    iget-boolean v5, p0, Lo/asx$4;->e:Z

    move-object v6, v8

    invoke-static/range {v0 .. v6}, Lo/asx;->e(Lo/asx;IJZZLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    goto/16 :goto_0

    .line 245
    :cond_0
    iget v0, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f0

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lo/asx$4;->a:Z

    if-eqz v0, :cond_1

    .line 247
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/asx$4;->c:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v9

    .line 248
    if-nez v9, :cond_1

    .line 250
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_deteted_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 252
    new-instance v11, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v11}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 253
    iget-wide v0, p0, Lo/asx$4;->c:J

    invoke-virtual {v11, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 254
    invoke-virtual {v11, v10}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 255
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 256
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 257
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 258
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 261
    :cond_1
    iget-object v0, p0, Lo/asx$4;->b:Lo/asx;

    iget v1, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xc0

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lo/asx;->e(Lo/asx;III)V

    .line 262
    const-string v0, "FoundGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " findGroupListener error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 267
    :cond_2
    iget-object v0, p0, Lo/asx$4;->b:Lo/asx;

    iget v1, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v2, 0xaaa

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lo/asx;->e(Lo/asx;III)V

    .line 268
    const-string v0, "FoundGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " findGroupListener error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v8, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
