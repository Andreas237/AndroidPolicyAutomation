.class public Lo/axc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axc;->c:Landroid/os/Handler;

    .line 125
    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axc;->c:Landroid/os/Handler;

    .line 129
    iput-object p1, p0, Lo/axc;->c:Landroid/os/Handler;

    .line 130
    return-void
.end method

.method private static a(Lo/axc;IJIZ)Lo/aud;
    .locals 7

    .line 162
    new-instance v0, Lo/axc$2;

    move-object v1, p0

    move-wide v2, p2

    move v4, p1

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lo/axc$2;-><init>(Lo/axc;JIIZ)V

    return-object v0
.end method

.method private static a(Lo/axc;IJLjava/lang/String;)Lo/brd;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/axc;IJLjava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 318
    new-instance v0, Lo/axc$4;

    move-wide v1, p2

    move-object v3, p0

    move v4, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/axc$4;-><init>(JLo/axc;ILjava/lang/String;)V

    return-object v0
.end method

.method static synthetic a(Lo/axc;J)Lo/brd;
    .locals 1

    .line 39
    invoke-static {p0, p1, p2}, Lo/axc;->c(Lo/axc;J)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private a(IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/lang/String;)V
    .locals 6

    .line 351
    if-eqz p4, :cond_2

    .line 353
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_1

    .line 356
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 358
    invoke-static {p2, p3, p0}, Lo/axc;->b(JLo/axc;)V

    .line 359
    move-object v0, p0

    move v1, p1

    iget v3, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v4, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0x69

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    goto :goto_0

    .line 363
    :cond_0
    const-string v0, "UserFriendSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserFrdSetFlagsSettings exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    move-object v0, p0

    move v1, p1

    iget v4, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0x6b

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    goto :goto_0

    .line 369
    :cond_1
    const-string v0, "UserFriendSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserFrdSetFlagsSettings exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    move-object v0, p0

    move v1, p1

    iget v3, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v2, 0x6b

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    goto :goto_0

    .line 375
    :cond_2
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "updateUserFrdSetFlagsSettings response is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    move-object v0, p0

    move v1, p1

    const/16 v2, 0x6b

    const v3, 0x14ff1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    .line 378
    :goto_0
    return-void
.end method

.method private static b(Lo/axc;IJLjava/lang/String;)Lo/aud;
    .locals 6

    .line 292
    new-instance v0, Lo/axc$3;

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/axc$3;-><init>(Lo/axc;IJLjava/lang/String;)V

    return-object v0
.end method

.method private static b(Lo/axc;JIIZ)Lo/brd;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/axc;JIIZ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 190
    new-instance v0, Lo/axc$1;

    move-wide v1, p1

    move v3, p4

    move-object v4, p0

    move v5, p3

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lo/axc$1;-><init>(JILo/axc;IZ)V

    return-object v0
.end method

.method private static b(JLo/axc;)V
    .locals 2

    .line 441
    new-instance v0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;-><init>()V

    .line 442
    iput-wide p0, v0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;->frdUID_:J

    .line 443
    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v1

    .line 444
    invoke-virtual {p2, p0, p1, v1}, Lo/axc;->c(JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 445
    return-void
.end method

.method static synthetic b(Lo/axc;IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct/range {p0 .. p5}, Lo/axc;->a(IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/lang/String;)V

    return-void
.end method

.method private static c(Lo/axc;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/axc;J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 423
    new-instance v0, Lo/axc$8;

    invoke-direct {v0, p1, p2, p0}, Lo/axc$8;-><init>(JLo/axc;)V

    return-object v0
.end method

.method private c(J)V
    .locals 3

    .line 506
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 507
    if-eqz v2, :cond_1

    .line 509
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    if-nez v0, :cond_0

    .line 511
    const/4 v0, 0x6

    const v1, 0xdd02

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    goto :goto_0

    .line 514
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 516
    const/16 v0, 0x8

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    goto :goto_0

    .line 522
    :cond_1
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "processGetFrdSetFlagsReponse user is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    :cond_2
    :goto_0
    return-void
.end method

.method private c(JILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 12

    .line 213
    if-eqz p4, :cond_4

    .line 215
    move-object/from16 v0, p4

    iget v0, v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 217
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 218
    const-string v0, "isDeleteConversation"

    move/from16 v1, p5

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 219
    const-string v0, "userId"

    invoke-virtual {v6, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 221
    move-object/from16 v0, p4

    iget v0, v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    move-object/from16 v0, p4

    instance-of v0, v0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;

    if-eqz v0, :cond_2

    .line 223
    move-object/from16 v7, p4

    check-cast v7, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;

    .line 224
    iget-object v8, v7, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;->UpdateUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;

    .line 225
    const-wide/16 v9, 0x0

    .line 226
    const-string v11, ""

    .line 227
    if-eqz v8, :cond_0

    .line 228
    iget-wide v9, v8, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->frdUID_:J

    .line 229
    iget-object v11, v8, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 231
    :cond_0
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    const-string v11, "0"

    goto :goto_0

    .line 237
    :cond_1
    invoke-static {v11}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 239
    :goto_0
    move-object v0, p0

    move v1, p3

    move-object v5, v6

    const/16 v2, 0x68

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    .line 240
    const-string v0, ""

    invoke-direct {p0, v0, v11, v9, v10}, Lo/axc;->e(Ljava/lang/String;Ljava/lang/String;J)V

    .line 241
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, v9, v10, v11}, Lo/ast;->e(JLjava/lang/String;)Z

    .line 242
    goto :goto_1

    .line 245
    :cond_2
    const-string v0, "UserFriendSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserFrdStickSettings exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p4

    iget v2, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    move-object v0, p0

    move v1, p3

    move-object/from16 v2, p4

    iget v4, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    move-object v5, v6

    const/16 v2, 0x6a

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    .line 248
    :goto_1
    goto :goto_2

    .line 251
    :cond_3
    const-string v0, "UserFriendSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserFrdStickSettings exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p4

    iget v2, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    move-object v0, p0

    move v1, p3

    move-object/from16 v2, p4

    iget v3, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v2, 0x70

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    goto :goto_2

    .line 257
    :cond_4
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "updateUserFrdStickSettings exception response == null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    move-object v0, p0

    move v1, p3

    const/16 v2, 0x70

    const v3, 0x14ff1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    .line 260
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/axc;JIIZ)Lo/brd;
    .locals 1

    .line 39
    invoke-static/range {p0 .. p5}, Lo/axc;->b(Lo/axc;JIIZ)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private d(III)V
    .locals 2

    .line 564
    iget-object v0, p0, Lo/axc;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 566
    iget-object v0, p0, Lo/axc;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/axc;->c:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 568
    :cond_0
    return-void
.end method

.method private d(IIIILjava/lang/Object;)V
    .locals 1

    .line 537
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 539
    const/4 v0, 0x6

    invoke-static {v0, p2}, Lo/apf;->d(II)V

    goto :goto_0

    .line 541
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 543
    const/16 v0, 0x8

    invoke-static {v0, p2}, Lo/apf;->d(II)V

    goto :goto_0

    .line 546
    :cond_1
    if-nez p1, :cond_2

    .line 548
    const/4 v0, 0x5

    invoke-static {v0, p2, p5}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 552
    :cond_2
    :goto_0
    invoke-direct {p0, p2, p3, p4}, Lo/axc;->d(III)V

    .line 553
    return-void
.end method

.method static synthetic d(Lo/axc;JILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 0

    .line 39
    invoke-direct/range {p0 .. p5}, Lo/axc;->c(JILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    return-void
.end method

.method private static e(Lo/axc;J)Lo/aud;
    .locals 1

    .line 398
    new-instance v0, Lo/axc$5;

    invoke-direct {v0, p0, p1, p2}, Lo/axc$5;-><init>(Lo/axc;J)V

    return-object v0
.end method

.method static synthetic e(Lo/axc;IJLjava/lang/String;)Lo/brd;
    .locals 1

    .line 39
    invoke-static {p0, p1, p2, p3, p4}, Lo/axc;->a(Lo/axc;IJLjava/lang/String;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(JLo/axc;)V
    .locals 0

    .line 39
    invoke-static {p0, p1, p2}, Lo/axc;->b(JLo/axc;)V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .line 579
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    .line 580
    if-nez v1, :cond_0

    .line 582
    return-void

    .line 584
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 586
    invoke-virtual {v1, p1}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 588
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 590
    invoke-virtual {v1, p2}, Lcom/huawei/health/sns/model/user/User;->setStickTime(Ljava/lang/String;)V

    .line 592
    :cond_2
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/axa;->b(Lcom/huawei/health/sns/model/user/User;)Z

    .line 593
    return-void
.end method

.method static synthetic e(Lo/axc;IIIILjava/lang/Object;)V
    .locals 0

    .line 39
    invoke-direct/range {p0 .. p5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public c(JILjava/lang/String;)V
    .locals 6

    .line 272
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 274
    move-object v0, p0

    move v1, p3

    const/16 v2, 0x6c

    const v3, 0x14ff4

    const v4, 0x14ff4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    .line 275
    return-void

    .line 278
    :cond_0
    invoke-static {p0, p3, p1, p2, p4}, Lo/axc;->b(Lo/axc;IJLjava/lang/String;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 279
    return-void
.end method

.method public c(JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 7

    .line 455
    if-eqz p3, :cond_4

    .line 457
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 460
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p3, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;

    if-eqz v0, :cond_2

    .line 462
    move-object v3, p3

    check-cast v3, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;

    .line 463
    .line 464
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;->getGetUserFrdSettingsRsp_()Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;

    move-result-object v4

    .line 465
    if-nez v4, :cond_0

    .line 467
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "processGetFrdSetFlagsReponse getUserFrdSettingsRsp is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    return-void

    .line 470
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->getSetFlags_()Ljava/lang/String;

    move-result-object v5

    .line 471
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->getStickTime_()Ljava/lang/String;

    move-result-object v6

    .line 472
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    const-string v6, "0"

    goto :goto_0

    .line 478
    :cond_1
    invoke-static {v6}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 480
    :goto_0
    invoke-direct {p0, v5, v6, p1, p2}, Lo/axc;->e(Ljava/lang/String;Ljava/lang/String;J)V

    .line 481
    invoke-direct {p0, p1, p2}, Lo/axc;->c(J)V

    .line 482
    goto :goto_1

    .line 485
    :cond_2
    const-string v0, "UserFriendSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processGetFrdSetFlagsReponse exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 490
    :cond_3
    const-string v0, "UserFriendSettingsTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processGetFrdSetFlagsReponse exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 495
    :cond_4
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "getUserFrdSetFlagsSettings response is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    :goto_1
    return-void
.end method

.method public d(J)V
    .locals 1

    .line 387
    invoke-static {p0, p1, p2}, Lo/axc;->e(Lo/axc;J)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 388
    return-void
.end method

.method public d(Landroid/content/Context;IJIZ)V
    .locals 6

    .line 143
    invoke-static {p1}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    move-object v0, p0

    move v1, p2

    const/16 v2, 0x6c

    const v3, 0x14ff4

    const v4, 0x14ff4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/axc;->d(IIIILjava/lang/Object;)V

    .line 146
    return-void

    .line 149
    :cond_0
    move-object v0, p0

    move v1, p2

    move-wide v2, p3

    move v4, p5

    move v5, p6

    invoke-static/range {v0 .. v5}, Lo/axc;->a(Lo/axc;IJIZ)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 150
    return-void
.end method
