.class public Lo/ass;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ass;->b:Landroid/os/Handler;

    .line 52
    invoke-direct {p0, p1}, Lo/ass;->e(Landroid/os/Handler;)V

    .line 53
    return-void
.end method

.method static synthetic a(Lo/ass;IJ)Lo/brd;
    .locals 1

    .line 27
    invoke-direct {p0, p1, p2, p3}, Lo/ass;->d(IJ)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/ass;III)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Lo/ass;->c(III)V

    return-void
.end method

.method static synthetic a(Lo/ass;IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ass;->d(IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private c(IJ)Lo/aud;
    .locals 1

    .line 75
    new-instance v0, Lo/ass$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/ass$2;-><init>(Lo/ass;IJ)V

    .line 92
    return-object v0
.end method

.method private c(III)V
    .locals 2

    .line 175
    iget-object v0, p0, Lo/ass;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/ass;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/ass;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 179
    :cond_0
    return-void
.end method

.method private d(IJ)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 97
    new-instance v0, Lo/ass$1;

    invoke-direct {v0, p0, p2, p3, p1}, Lo/ass$1;-><init>(Lo/ass;JI)V

    return-object v0
.end method

.method private d(IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 6

    .line 122
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 125
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_3

    .line 127
    const/4 v3, 0x0

    .line 128
    instance-of v0, p4, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;

    if-eqz v0, :cond_0

    .line 130
    move-object v3, p4

    check-cast v3, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;

    .line 133
    :cond_0
    if-eqz v3, :cond_2

    .line 135
    iget-object v4, v3, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;->ApplyForJoinGrpRsp_:Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;

    .line 136
    if-eqz v4, :cond_2

    .line 138
    iget v5, v4, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;->result_:I

    .line 143
    if-nez v5, :cond_1

    .line 145
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lo/ass;->b:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p2, p3}, Lo/atb;->c(J)Lcom/huawei/health/sns/model/group/Group;

    .line 146
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/ass;->c(III)V

    goto :goto_0

    .line 150
    :cond_1
    const/16 v0, 0xc5

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v5}, Lo/ass;->c(III)V

    .line 154
    :cond_2
    :goto_0
    goto :goto_1

    .line 157
    :cond_3
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0xc5

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/ass;->c(III)V

    .line 158
    const-string v0, "ApplyJoinGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestGroupInfo error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 163
    :cond_4
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/ass;->c(III)V

    .line 164
    const-string v0, "ApplyJoinGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestGroupInfo error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    :goto_1
    return-void
.end method

.method private e(Landroid/os/Handler;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/ass;->b:Landroid/os/Handler;

    .line 43
    return-void
.end method


# virtual methods
.method public e(IJ)V
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lo/ass;->c(IJ)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 64
    return-void
.end method
