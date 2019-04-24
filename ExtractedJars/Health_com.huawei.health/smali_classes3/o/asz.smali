.class public Lo/asz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/os/Handler;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asz;->b:Landroid/os/Handler;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asz;->d:Ljava/lang/String;

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lo/asz;->a:I

    .line 96
    iput-object p1, p0, Lo/asz;->b:Landroid/os/Handler;

    .line 97
    return-void
.end method

.method static synthetic a(Lo/asz;IIZ)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lo/asz;->e(IIZ)V

    return-void
.end method

.method private a()[I
    .locals 3

    .line 215
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 216
    const v0, 0x14ffd

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 217
    const v0, 0x14ffd

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 218
    return-object v2
.end method

.method private a(ZLo/bra;)[I
    .locals 14

    .line 229
    const/4 v4, 0x0

    .line 230
    const/4 v5, 0x1

    .line 232
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 233
    new-instance v8, Lo/atk;

    invoke-direct {v8}, Lo/atk;-><init>()V

    .line 235
    invoke-virtual {v8}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v9

    .line 238
    const/4 v10, 0x0

    .line 239
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/atc;->e(IZ)Ljava/util/ArrayList;

    move-result-object v10

    .line 243
    :cond_0
    const-string v0, "Group_GroupListRequestTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synRequestGroupList oldVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const-string v2, "  newVersion = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/asz;->d:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const/4 v11, 0x0

    .line 247
    :cond_1
    new-instance v12, Lcom/huawei/health/sns/server/group/GetGroupListRequest;

    invoke-direct {v12}, Lcom/huawei/health/sns/server/group/GetGroupListRequest;-><init>()V

    .line 248
    iget-object v0, p0, Lo/asz;->d:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x64

    invoke-virtual {v12, v9, v0, v1, v2}, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->setData(Ljava/lang/String;Ljava/lang/String;II)V

    .line 249
    invoke-static {v12}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v13

    .line 250
    invoke-direct {p0, v13, v7, v5}, Lo/asz;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/ArrayList;Z)[I

    move-result-object v6

    .line 251
    const/4 v0, 0x0

    aget v0, v6, v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    aget v0, v6, v0

    if-nez v0, :cond_2

    const/4 v11, 0x1

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    .line 252
    :goto_0
    const/4 v5, 0x0

    .line 253
    iget v0, p0, Lo/asz;->a:I

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v0, v1, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 254
    :goto_1
    invoke-interface/range {p2 .. p2}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 256
    invoke-direct {p0}, Lo/asz;->a()[I

    move-result-object v6

    .line 257
    return-object v6

    .line 259
    :cond_4
    if-eqz v4, :cond_5

    if-nez v11, :cond_1

    .line 260
    :cond_5
    const-string v0, "Group_GroupListRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synRequestGroupList newGroupList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    if-nez v11, :cond_6

    .line 263
    return-object v6

    .line 266
    :cond_6
    if-eqz p1, :cond_7

    .line 268
    move-object/from16 v0, p2

    invoke-direct {p0, v7, v0}, Lo/asz;->e(Ljava/util/ArrayList;Lo/bra;)Z

    move-result v12

    .line 269
    if-eqz v12, :cond_7

    .line 271
    invoke-direct {p0}, Lo/asz;->a()[I

    move-result-object v13

    .line 272
    return-object v13

    .line 276
    :cond_7
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v10, v7}, Lo/atc;->d(Ljava/util/List;Ljava/util/List;)Z

    move-result v12

    .line 279
    if-eqz v12, :cond_8

    .line 281
    const-string v0, "Group_GroupListRequestTask"

    const-string v1, "Save GroupList"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    iget-object v0, p0, Lo/asz;->d:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/atk;->c(Ljava/lang/String;)V

    .line 286
    invoke-virtual {v8}, Lo/atk;->d()V

    .line 290
    :cond_8
    invoke-direct {p0}, Lo/asz;->b()V

    .line 292
    return-object v6
.end method

.method private b()V
    .locals 1

    .line 479
    const/4 v0, 0x0

    iput v0, p0, Lo/asz;->a:I

    .line 480
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asz;->d:Ljava/lang/String;

    .line 481
    return-void
.end method

.method private d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/ArrayList;Z)[I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;Z)[I"
        }
    .end annotation

    .line 361
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 363
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 365
    const v0, 0x14ffc

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 366
    const v0, 0x14ffc

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 367
    return-object v3

    .line 370
    :cond_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 373
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/GetGroupListResponse;

    if-eqz v0, :cond_3

    .line 375
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/server/group/GetGroupListResponse;

    .line 376
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/GetGroupListResponse;->getGetUserGrpListRsp_()Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;

    move-result-object v5

    .line 377
    if-eqz v5, :cond_2

    .line 379
    if-eqz p3, :cond_1

    .line 381
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->getTotalNum_()I

    move-result v0

    iput v0, p0, Lo/asz;->a:I

    .line 382
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->getNewVersion_()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/asz;->d:Ljava/lang/String;

    .line 385
    :cond_1
    iget v0, p0, Lo/asz;->a:I

    if-lez v0, :cond_2

    .line 387
    invoke-direct {p0, v5, p2}, Lo/asz;->e(Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;Ljava/util/ArrayList;)V

    .line 390
    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 391
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 392
    goto :goto_0

    .line 395
    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 396
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 397
    const-string v0, "Group_GroupListRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processGroupListResponse error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 402
    :cond_4
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 403
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 404
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/asz;->e(III)V

    .line 405
    const-string v0, "Group_GroupListRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processGroupListResponse error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    :goto_0
    return-object v3
.end method

.method private e(Landroid/content/Context;)Lo/aud;
    .locals 1

    .line 122
    new-instance v0, Lo/asz$2;

    invoke-direct {v0, p0, p1}, Lo/asz$2;-><init>(Lo/asz;Landroid/content/Context;)V

    .line 156
    return-object v0
.end method

.method private e(III)V
    .locals 2

    .line 108
    iget-object v0, p0, Lo/asz;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lo/asz;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/asz;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 112
    :cond_0
    return-void
.end method

.method private e(IIZ)V
    .locals 6

    .line 329
    const/4 v1, 0x0

    .line 330
    const/4 v2, 0x0

    .line 332
    const/4 v3, 0x0

    .line 333
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0}, Lo/atf;->e()I

    move-result v2

    .line 335
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/atc;->a(I)I

    move-result v1

    .line 337
    iget-object v0, p0, Lo/asz;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lo/asz;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 340
    const/16 v0, 0xd1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 341
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 342
    const-string v0, "bundleKeyGroupCount"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 343
    const-string v0, "bundleKeyGroupNotifyCount"

    invoke-virtual {v5, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 344
    const-string v0, "bundleKeyResultCode"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 345
    const-string v0, "bundleKeyResponseCode"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 346
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 347
    iget-object v0, p0, Lo/asz;->b:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 349
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;)V"
        }
    .end annotation

    .line 418
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->getUserGroupList_()Ljava/util/List;

    move-result-object v1

    .line 419
    if-eqz v1, :cond_0

    .line 421
    new-instance v2, Lo/ayf;

    invoke-direct {v2}, Lo/ayf;-><init>()V

    .line 422
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;

    .line 424
    invoke-virtual {v2, v4}, Lo/ayf;->b(Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v5

    .line 425
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    goto :goto_0

    .line 428
    :cond_0
    return-void
.end method

.method private e(Ljava/util/ArrayList;Lo/bra;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;Lo/bra;)Z"
        }
    .end annotation

    .line 302
    const/4 v2, 0x0

    .line 303
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/Group;

    .line 305
    invoke-interface {p2}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    const/4 v2, 0x1

    .line 308
    const-string v0, "Group_GroupListRequestTask"

    const-string v1, "group member request canceled"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    goto :goto_1

    .line 312
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getSaveToContractMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 314
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, v4}, Lo/atg;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 316
    :cond_1
    goto :goto_0

    .line 317
    :cond_2
    :goto_1
    return v2
.end method

.method static synthetic e(Lo/asz;ZLo/bra;)[I
    .locals 1

    .line 38
    invoke-direct {p0, p1, p2}, Lo/asz;->a(ZLo/bra;)[I

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 184
    new-instance v0, Lo/asz$4;

    invoke-direct {v0, p0}, Lo/asz$4;-><init>(Lo/asz;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 206
    return-void
.end method

.method public b(ZLandroid/os/Handler;)V
    .locals 1

    .line 438
    new-instance v0, Lo/asz$3;

    invoke-direct {v0, p0, p1, p2}, Lo/asz$3;-><init>(Lo/asz;ZLandroid/os/Handler;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 472
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 166
    invoke-direct {p0, p1}, Lo/asz;->e(Landroid/content/Context;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 167
    return-void
.end method

.method public d(Lo/bra;)V
    .locals 1

    .line 174
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lo/asz;->a(ZLo/bra;)[I

    .line 175
    return-void
.end method
