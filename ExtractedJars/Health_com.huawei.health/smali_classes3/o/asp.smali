.class public Lo/asp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asp;->b:Landroid/os/Handler;

    .line 52
    iput-object p1, p0, Lo/asp;->b:Landroid/os/Handler;

    .line 53
    return-void
.end method

.method private a(III)V
    .locals 2

    .line 125
    iget-object v0, p0, Lo/asp;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/asp;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/asp;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 129
    :cond_0
    return-void
.end method

.method private a(JLcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;)V
    .locals 4

    .line 180
    iget v2, p3, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;->result_:I

    .line 182
    if-nez v2, :cond_1

    .line 185
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1, p2}, Lo/atb;->d(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 186
    if-nez v3, :cond_0

    .line 188
    new-instance v3, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v3, p1, p2}, Lcom/huawei/health/sns/model/group/Group;-><init>(J)V

    .line 191
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 192
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 194
    :cond_1
    const/16 v0, 0x12f1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v2, v1}, Lo/asp;->a(III)V

    .line 195
    return-void
.end method

.method static synthetic a(Lo/asp;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;J)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lo/asp;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;J)V

    return-void
.end method

.method static synthetic b(Lo/asp;J)Lo/brd;
    .locals 1

    .line 22
    invoke-static {p0, p1, p2}, Lo/asp;->d(Lo/asp;J)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;J)V
    .locals 5

    .line 139
    if-nez p1, :cond_0

    .line 141
    return-void

    .line 144
    :cond_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 147
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;

    if-eqz v0, :cond_2

    .line 149
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;

    .line 150
    iget-object v4, v3, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;->AgreeToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;

    .line 151
    if-eqz v4, :cond_1

    .line 153
    invoke-direct {p0, p2, p3, v4}, Lo/asp;->a(JLcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;)V

    .line 155
    :cond_1
    goto :goto_0

    .line 158
    :cond_2
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x12f2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/asp;->a(III)V

    .line 159
    const-string v0, "AgreeJoinGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseInviteGroup error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 164
    :cond_3
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0x12f2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/asp;->a(III)V

    .line 165
    const-string v0, "AgreeJoinGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseInviteGroup error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    :goto_0
    return-void
.end method

.method private static c(Lo/asp;J)Lo/aud;
    .locals 1

    .line 75
    new-instance v0, Lo/asp$4;

    invoke-direct {v0, p0, p1, p2}, Lo/asp$4;-><init>(Lo/asp;J)V

    return-object v0
.end method

.method static synthetic c(Lo/asp;III)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lo/asp;->a(III)V

    return-void
.end method

.method private static d(Lo/asp;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/asp;J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 101
    new-instance v0, Lo/asp$3;

    invoke-direct {v0, p1, p2, p0}, Lo/asp$3;-><init>(JLo/asp;)V

    return-object v0
.end method


# virtual methods
.method public b(J)V
    .locals 1

    .line 62
    invoke-static {p0, p1, p2}, Lo/asp;->c(Lo/asp;J)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 63
    return-void
.end method
