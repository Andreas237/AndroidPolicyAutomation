.class public Lo/aot;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aot;->b:Landroid/os/Handler;

    .line 84
    iput-object p1, p0, Lo/aot;->b:Landroid/os/Handler;

    .line 85
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 204
    iget-object v0, p0, Lo/aot;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/aot;->b:Landroid/os/Handler;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x102

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 205
    return-void
.end method

.method static synthetic a(Lo/aot;Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lo/aot;->b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 240
    new-instance v1, Landroid/content/Intent;

    const-string v0, "action_follow_state_change"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 241
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 242
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 212
    iget-object v0, p0, Lo/aot;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/aot;->b:Landroid/os/Handler;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x100

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 213
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 150
    if-eqz p2, :cond_3

    .line 152
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 154
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;

    if-eqz v0, :cond_0

    .line 157
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->c(JI)Z

    .line 158
    new-instance v0, Lo/arj;

    invoke-direct {v0}, Lo/arj;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/arj;->d(JZ)V

    .line 159
    invoke-direct {p0}, Lo/aot;->c()V

    goto/16 :goto_0

    .line 164
    :cond_0
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3fb

    if-ne v0, v1, :cond_1

    .line 167
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->c(JI)Z

    .line 168
    new-instance v0, Lo/arj;

    invoke-direct {v0}, Lo/arj;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/arj;->d(JZ)V

    .line 169
    invoke-direct {p0}, Lo/aot;->c()V

    goto :goto_0

    .line 173
    :cond_1
    const-string v0, "FollowPublicUserTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unfollowPublicUser failed resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-direct {p0, v0}, Lo/aot;->a(I)V

    goto :goto_0

    .line 180
    :cond_2
    const-string v0, "FollowPublicUserTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unfollowPublicUser failed responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-direct {p0, v0}, Lo/aot;->a(I)V

    goto :goto_0

    .line 186
    :cond_3
    const-string v0, "FollowPublicUserTask"

    const-string v1, "unfollowPublicUser failed, response is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const v0, 0x14ff1

    invoke-direct {p0, v0}, Lo/aot;->a(I)V

    .line 189
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/aot;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/aot;->a(I)V

    return-void
.end method

.method private c()V
    .locals 3

    .line 231
    iget-object v0, p0, Lo/aot;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/aot;->b:Landroid/os/Handler;

    const/16 v2, 0x101

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 232
    invoke-direct {p0}, Lo/aot;->b()V

    .line 233
    return-void
.end method

.method private c(J)V
    .locals 3

    .line 360
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 361
    if-nez v2, :cond_0

    .line 363
    const-string v0, "FollowPublicUserTask"

    const-string v1, "updateAssistantFlagData user is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    return-void

    .line 367
    :cond_0
    const-string v0, "00"

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 368
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/axa;->b(Lcom/huawei/health/sns/model/user/User;)Z

    .line 369
    return-void
.end method

.method static synthetic c(Lo/aot;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/aot;->b(I)V

    return-void
.end method

.method static synthetic c(Lo/aot;IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3, p4}, Lo/aot;->d(IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private d()V
    .locals 3

    .line 196
    iget-object v0, p0, Lo/aot;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/aot;->b:Landroid/os/Handler;

    const/16 v2, 0x103

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 197
    return-void
.end method

.method private d(I)V
    .locals 2

    .line 222
    iget-object v0, p0, Lo/aot;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/aot;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 223
    invoke-direct {p0}, Lo/aot;->b()V

    .line 224
    return-void
.end method

.method private d(IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 301
    if-eqz p4, :cond_3

    .line 303
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 305
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 307
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lo/axa;->c(JI)Z

    .line 309
    invoke-direct {p0, p2, p3}, Lo/aot;->c(J)V

    .line 310
    invoke-direct {p0, p1}, Lo/aot;->d(I)V

    goto/16 :goto_0

    .line 314
    :cond_0
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3fa

    if-ne v0, v1, :cond_1

    .line 317
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lo/axa;->c(JI)Z

    .line 320
    invoke-direct {p0, p2, p3}, Lo/aot;->d(J)V

    .line 322
    invoke-direct {p0, p1}, Lo/aot;->d(I)V

    goto :goto_0

    .line 326
    :cond_1
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-direct {p0, v0}, Lo/aot;->b(I)V

    .line 327
    const-string v0, "FollowPublicUserTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "followPublicUser failed resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 333
    :cond_2
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-direct {p0, v0}, Lo/aot;->b(I)V

    .line 334
    const-string v0, "FollowPublicUserTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "followPublicUser failed responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 339
    :cond_3
    const v0, 0x14ff1

    invoke-direct {p0, v0}, Lo/aot;->b(I)V

    .line 340
    const-string v0, "FollowPublicUserTask"

    const-string v1, "followPublicUser failed, response is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    :goto_0
    return-void
.end method

.method private d(J)V
    .locals 3

    .line 349
    new-instance v1, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;-><init>()V

    .line 350
    iput-wide p1, v1, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;->frdUID_:J

    .line 351
    invoke-static {v1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 352
    new-instance v0, Lo/axc;

    invoke-direct {v0}, Lo/axc;-><init>()V

    invoke-virtual {v0, p1, p2, v2}, Lo/axc;->c(JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 353
    return-void
.end method


# virtual methods
.method public b(JJ)V
    .locals 6

    .line 96
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    invoke-direct {p0}, Lo/aot;->d()V

    .line 99
    return-void

    .line 101
    :cond_0
    new-instance v0, Lo/aot$2;

    move-object v1, p0

    move-wide v2, p3

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lo/aot$2;-><init>(Lo/aot;JJ)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 139
    return-void
.end method

.method public c(IJJZLjava/lang/String;)V
    .locals 8

    .line 252
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    invoke-direct {p0}, Lo/aot;->d()V

    .line 255
    return-void

    .line 257
    :cond_0
    new-instance v0, Lo/aot$3;

    move-object v1, p0

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    move v7, p1

    invoke-direct/range {v0 .. v7}, Lo/aot$3;-><init>(Lo/aot;JJZI)V

    invoke-static {p7, v0}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 290
    return-void
.end method
