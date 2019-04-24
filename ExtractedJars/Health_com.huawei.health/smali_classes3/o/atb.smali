.class public Lo/atb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    .line 121
    invoke-direct {p0, p1}, Lo/atb;->d(Landroid/os/Handler;)V

    .line 122
    return-void
.end method

.method private a(IJ)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 143
    new-instance v0, Lo/atb$1;

    invoke-direct {v0, p0, p2, p3, p1}, Lo/atb$1;-><init>(Lo/atb;JI)V

    return-object v0
.end method

.method private static a(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 176
    new-instance v0, Lo/atb$5;

    invoke-direct {v0, p0, p1}, Lo/atb$5;-><init>(J)V

    return-object v0
.end method

.method private a(III)V
    .locals 2

    .line 330
    iget-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/atb;->e:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 334
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/atb;)Landroid/os/Handler;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    return-object v0
.end method

.method private static b(Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;Z)Lcom/huawei/health/sns/model/group/Group;
    .locals 3

    .line 344
    new-instance v1, Lo/aya;

    invoke-direct {v1}, Lo/aya;-><init>()V

    .line 345
    invoke-virtual {v1, p0}, Lo/aya;->d(Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    .line 346
    if-eqz p1, :cond_0

    .line 348
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 350
    :cond_0
    return-object v2
.end method

.method static synthetic b(Lo/atb;JIZ)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, Lo/atb;->e(JIZ)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/atb;III)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lo/atb;->a(III)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;IZ)Lcom/huawei/health/sns/model/group/Group;
    .locals 9

    .line 274
    if-nez p1, :cond_0

    .line 276
    const/4 v0, 0x0

    return-object v0

    .line 278
    :cond_0
    const/4 v3, 0x0

    .line 280
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 283
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;

    if-eqz v0, :cond_2

    .line 285
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;

    .line 286
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;->getGetGroupInfoRsp_()Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;

    move-result-object v5

    .line 288
    if-eqz v5, :cond_1

    .line 290
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;->getGroupInfo_()Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;

    move-result-object v6

    .line 291
    if-eqz v6, :cond_1

    .line 293
    invoke-static {v6, p3}, Lo/atb;->b(Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;Z)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 294
    iget-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 296
    iget-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 297
    iput p2, v7, Landroid/os/Message;->what:I

    .line 298
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 299
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v8, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 300
    invoke-virtual {v7, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 301
    iget-object v0, p0, Lo/atb;->e:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 305
    :cond_1
    goto :goto_0

    .line 308
    :cond_2
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0xc1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/atb;->a(III)V

    .line 309
    const-string v0, "GroupInfoTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestGroupInfo error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 314
    :cond_3
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/atb;->a(III)V

    .line 315
    const-string v0, "GroupInfoTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestGroupInfo error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    :goto_0
    return-object v3
.end method

.method private d(IJZ)Lo/aud;
    .locals 7

    .line 238
    new-instance v0, Lo/atb$2;

    move-object v1, p0

    move-wide v2, p2

    move v4, p1

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lo/atb$2;-><init>(Lo/atb;JIZ)V

    move-object v6, v0

    .line 263
    return-object v6
.end method

.method private d(Landroid/os/Handler;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lo/atb;->e:Landroid/os/Handler;

    .line 112
    return-void
.end method

.method private e(JIZ)Lcom/huawei/health/sns/model/group/Group;
    .locals 3

    .line 384
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupInfoRequest;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupInfoRequest;-><init>()V

    .line 385
    iput-wide p1, v0, Lcom/huawei/health/sns/server/group/GetGroupInfoRequest;->grpID_:J

    .line 386
    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v1

    .line 387
    invoke-direct {p0, v1, p3, p4}, Lo/atb;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;IZ)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    .line 388
    return-object v2
.end method

.method private e(IJZ)Lo/aud;
    .locals 7

    .line 211
    new-instance v0, Lo/atb$3;

    move-object v1, p0

    move-wide v2, p2

    move v4, p1

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lo/atb$3;-><init>(Lo/atb;JIZ)V

    move-object v6, v0

    .line 225
    return-object v6
.end method


# virtual methods
.method public a(IJZ)V
    .locals 1

    .line 195
    invoke-direct {p0, p1, p2, p3, p4}, Lo/atb;->d(IJZ)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 196
    return-void
.end method

.method public b(IJZ)V
    .locals 1

    .line 206
    invoke-direct {p0, p1, p2, p3, p4}, Lo/atb;->e(IJZ)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 207
    return-void
.end method

.method public b(J)V
    .locals 2

    .line 171
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/atb;->a(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 172
    return-void
.end method

.method public c(J)Lcom/huawei/health/sns/model/group/Group;
    .locals 2

    .line 372
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lo/atb;->e(JIZ)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method public d(J)Lcom/huawei/health/sns/model/group/Group;
    .locals 2

    .line 361
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/atb;->e(JIZ)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method public e(IJ)V
    .locals 2

    .line 132
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lo/atb;->a(IJ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 133
    return-void
.end method
