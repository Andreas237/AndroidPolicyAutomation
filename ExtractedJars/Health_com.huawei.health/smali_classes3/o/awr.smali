.class public Lo/awr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awr;->b:Ljava/util/List;

    return-void
.end method

.method private b()V
    .locals 6

    .line 213
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 214
    iget-object v0, p0, Lo/awr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;

    .line 217
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 219
    const-string v0, "|"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 220
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/awr;->d(J)V

    .line 222
    invoke-static {}, Lo/aru;->d()Lo/aru;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/aru;->d(J)V

    goto :goto_1

    .line 225
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v0

    if-nez v0, :cond_1

    .line 226
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getRelation_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 229
    invoke-static {}, Lo/aru;->d()Lo/aru;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/aru;->d(J)V

    .line 231
    :cond_1
    :goto_1
    goto :goto_0

    .line 232
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    .line 233
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 235
    const-string v0, "GetFriendListTask"

    const-string v1, "sendCancelAccountBroadcast."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    invoke-direct {p0, v4}, Lo/awr;->e(Ljava/lang/String;)V

    .line 238
    :cond_3
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/user/GetFriendListRequest;)I
    .locals 7

    .line 344
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    const-string v0, "RequestUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return SNSHttpCode.ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    const v0, 0x14ff1

    return v0

    .line 348
    :cond_0
    const v4, 0xdac1

    .line 349
    invoke-static {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 350
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_6

    .line 353
    iget v0, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_5

    .line 355
    instance-of v0, v5, Lcom/huawei/health/sns/server/user/GetFriendListResponse;

    if-eqz v0, :cond_4

    .line 357
    move-object v6, v5

    check-cast v6, Lcom/huawei/health/sns/server/user/GetFriendListResponse;

    .line 359
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 362
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getNewVersion_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 364
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getNewVersion_()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/awr;->e:Ljava/lang/String;

    .line 367
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getUserFrdInfoList_()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 368
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getUserFrdInfoList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 370
    iget-object v0, p0, Lo/awr;->b:Ljava/util/List;

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v1

    .line 371
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getUserFrdInfoList_()Ljava/util/List;

    move-result-object v1

    .line 370
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 373
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->getFromSeq_()I

    move-result v0

    if-nez v0, :cond_3

    .line 375
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getTotalNum_()I

    move-result v0

    iput v0, p0, Lo/awr;->d:I

    goto :goto_0

    .line 381
    :cond_2
    const v4, 0x14ff5

    .line 382
    const-string v0, "GetFriendListTask"

    const-string v1, "Get friendList error! GetUserFrdInfoListRsp_ empty!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    :cond_3
    :goto_0
    goto :goto_1

    .line 387
    :cond_4
    const v4, 0x14ff5

    .line 388
    const-string v0, "GetFriendListTask"

    const-string v1, "Get friendList error! wrong response."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 393
    :cond_5
    iget v4, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    .line 394
    const-string v0, "GetFriendListTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get friendList error! resultCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 399
    :cond_6
    iget v4, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 400
    const-string v0, "GetFriendListTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v5, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    :goto_1
    return v4
.end method

.method private c()Z
    .locals 4

    .line 323
    const/4 v3, 0x0

    .line 325
    iget-object v0, p0, Lo/awr;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/awr;->d:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    .line 327
    const-string v0, "GetFriendListTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new version is Empty, totalNum: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/awr;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 329
    :cond_0
    iget v0, p0, Lo/awr;->d:I

    iget-object v1, p0, Lo/awr;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 331
    const/4 v3, 0x1

    .line 333
    :cond_1
    :goto_0
    return v3
.end method

.method private c(J)Z
    .locals 6

    .line 263
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListReqTime"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v4

    .line 264
    sub-long v0, p1, v4

    const-wide/32 v2, 0x278cf6

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 266
    const/4 v0, 0x1

    return v0

    .line 268
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(J)V
    .locals 1

    .line 309
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ast;->b(J)Z

    .line 312
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 313
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->e(J)Z

    .line 314
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 248
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 249
    const-string v0, "com.huawei.android.sns.friend.cancel.account"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 250
    const-string v0, "cancelAccountBundleKey"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 251
    invoke-static {v2}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 252
    return-void
.end method

.method private e(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)V"
        }
    .end annotation

    .line 280
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 282
    :cond_0
    return-void

    .line 284
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 285
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;

    .line 287
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    goto :goto_0

    .line 289
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/User;

    .line 291
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 293
    const-string v0, "GetFriendListTask"

    const-string v1, "findNotExistAndDelete."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->d(J)Z

    .line 295
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/awr;->d(J)V

    .line 297
    :cond_3
    goto :goto_1

    .line 298
    :cond_4
    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 41
    invoke-virtual {p0, p1}, Lo/awr;->b(Lo/bra;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Integer;
    .locals 1

    .line 95
    invoke-virtual {p0, p1}, Lo/awr;->c(Lo/bra;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c(Lo/bra;)I
    .locals 16

    monitor-enter p0

    .line 107
    const v4, 0xdac1

    .line 109
    :try_start_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v6, v0, v2

    .line 113
    move-object v8, v5

    .line 115
    move-object/from16 v0, p0

    invoke-direct {v0, v6, v7}, Lo/awr;->c(J)Z

    move-result v9

    .line 117
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v10

    .line 120
    if-eqz v9, :cond_0

    .line 122
    const-string v8, ""

    .line 126
    :cond_0
    new-instance v11, Lcom/huawei/health/sns/server/user/GetFriendListRequest;

    const/16 v0, 0x64

    invoke-direct {v11, v8, v0}, Lcom/huawei/health/sns/server/user/GetFriendListRequest;-><init>(Ljava/lang/String;I)V

    .line 127
    const-string v0, "GetFriendListTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const/4 v12, 0x0

    .line 131
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz v9, :cond_1

    .line 133
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->e()Ljava/util/ArrayList;

    move-result-object v12

    .line 137
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awr;->e:Ljava/lang/String;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/awr;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v11, v0, v1}, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->setNextReqData(Ljava/lang/String;I)V

    .line 138
    if-eqz p1, :cond_2

    invoke-interface/range {p1 .. p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    const-string v0, "GetFriendListTask"

    const-string v1, "task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    monitor-exit p0

    const v0, 0xdac2

    return v0

    .line 143
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/awr;->c(Lcom/huawei/health/sns/server/user/GetFriendListRequest;)I

    move-result v4

    .line 144
    const v0, 0xdac1

    if-eq v4, v0, :cond_3

    .line 146
    monitor-exit p0

    return v4

    .line 149
    :cond_3
    invoke-direct/range {p0 .. p0}, Lo/awr;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    if-eqz p1, :cond_4

    invoke-interface/range {p1 .. p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 153
    const-string v0, "GetFriendListTask"

    const-string v1, "task cancel."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    monitor-exit p0

    const v0, 0xdac2

    return v0

    .line 157
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/awr;->d:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/awr;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 159
    const-string v0, "GetFriendListTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get friendList error! totalNum :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/awr;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", userFriendInfo size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/awr;->b:Ljava/util/List;

    .line 160
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 159
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    monitor-exit p0

    const v0, 0x14ff9

    return v0

    .line 167
    :cond_5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    if-eqz v9, :cond_6

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awr;->b:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-direct {v1, v12, v0}, Lo/awr;->e(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 172
    :cond_6
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isMatchedContact"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v13

    .line 174
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v10, v0}, Lo/biq;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v14

    .line 176
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v15

    .line 179
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz v13, :cond_7

    if-eqz v14, :cond_7

    if-eqz v15, :cond_7

    .line 182
    new-instance v0, Lo/arv;

    invoke-direct {v0}, Lo/arv;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/awr;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/arv;->b(Ljava/util/List;)V

    .line 185
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/awr;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/axa;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 187
    const-string v0, "GetFriendListTask"

    const-string v1, "batch Insert Or Update Friend error!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    monitor-exit p0

    const v0, 0x14ff8

    return v0

    .line 192
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awr;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 194
    const-string v0, "GetFriendListTask"

    const-string v1, "Save FriendList"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/awr;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 200
    :cond_9
    invoke-direct/range {p0 .. p0}, Lo/awr;->b()V

    .line 203
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListReqTime"

    invoke-virtual {v0, v1, v6, v7}, Lo/bcb;->a(Ljava/lang/String;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    monitor-exit p0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
