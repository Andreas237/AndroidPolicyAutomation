.class public Lo/atn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupNotify;>;"
        }
    .end annotation

    .line 309
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 310
    const/4 v3, 0x0

    .line 311
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;

    .line 313
    new-instance v3, Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/group/GroupNotify;-><init>()V

    .line 314
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getAction_()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setType(I)V

    .line 315
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getInitiatorUID_()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserId(J)V

    .line 316
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getInitiatorAccount_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserAccount(Ljava/lang/String;)V

    .line 317
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getUserNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserNickname(Ljava/lang/String;)V

    .line 318
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getUserImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserImageUrl(Ljava/lang/String;)V

    .line 319
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getUserImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 320
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getGrpID_()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupId(J)V

    .line 321
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getGrpName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupName(Ljava/lang/String;)V

    .line 322
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getGrpImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupImageUrl(Ljava/lang/String;)V

    .line 323
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getGrpImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 324
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getOperTime_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 325
    invoke-virtual {v3, v6}, Lcom/huawei/health/sns/model/group/GroupNotify;->setSendTime(Ljava/lang/String;)V

    .line 326
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    goto/16 :goto_0

    .line 328
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 329
    return-object v2
.end method

.method private static b(Lo/atn;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/atn;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 120
    new-instance v0, Lo/atn$5;

    invoke-direct {v0, p0}, Lo/atn$5;-><init>(Lo/atn;)V

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;>;)V"
        }
    .end annotation

    .line 222
    invoke-direct {p0, p1}, Lo/atn;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v6

    .line 224
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 226
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getType()I

    move-result v9

    .line 227
    const-string v0, "GroupNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "groupNotify type is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    packed-switch v9, :pswitch_data_0

    goto/16 :goto_1

    .line 232
    :pswitch_0
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/atf;->c(Lcom/huawei/health/sns/model/group/GroupNotify;)Z

    .line 233
    goto/16 :goto_1

    .line 238
    :pswitch_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/atc;->e(JZ)Z

    .line 240
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 242
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    .line 243
    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    .line 242
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 244
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    .line 245
    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    .line 244
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 251
    :pswitch_2
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    .line 252
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v3

    .line 251
    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/ath;->a(JJI)Z

    .line 253
    goto/16 :goto_1

    .line 258
    :pswitch_3
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atb;->d(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v10

    .line 261
    if-eqz v10, :cond_0

    .line 263
    const/4 v0, -0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 265
    :cond_0
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 266
    goto/16 :goto_1

    .line 270
    :pswitch_4
    new-instance v10, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 271
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 272
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 273
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 274
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 275
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 276
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getSendTime()Ljava/lang/String;

    move-result-object v11

    .line 277
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    const-string v0, "GroupNotifyTask"

    const-string v1, "inviteToJoinGrpRsp inviteTime is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    .line 282
    :cond_1
    invoke-virtual {v10, v11}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 283
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    .line 284
    goto :goto_1

    .line 288
    :pswitch_5
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v1

    .line 289
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v3

    .line 288
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->d(JJ)Z

    .line 290
    .line 295
    :cond_2
    :goto_1
    :pswitch_6
    goto/16 :goto_0

    .line 298
    :cond_3
    invoke-direct {p0, p1}, Lo/atn;->d(Ljava/util/List;)V

    .line 299
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method private c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z
    .locals 8

    .line 176
    const/4 v3, 0x0

    .line 177
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 179
    const/4 v0, 0x0

    return v0

    .line 181
    :cond_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 184
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;

    if-eqz v0, :cond_3

    .line 186
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;

    .line 187
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;->getGetGrpNotifyListRsp_()Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;

    move-result-object v5

    .line 188
    if-eqz v5, :cond_2

    .line 190
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;->getHasMore_()I

    move-result v6

    .line 192
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 194
    const/4 v3, 0x1

    .line 196
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;->getGroupNotifyList_()Ljava/util/List;

    move-result-object v7

    .line 197
    if-eqz v7, :cond_2

    .line 199
    invoke-direct {p0, v7}, Lo/atn;->c(Ljava/util/List;)V

    .line 202
    :cond_2
    goto :goto_0

    .line 205
    :cond_3
    const-string v0, "GroupNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestGroupNotify error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 210
    :cond_4
    const-string v0, "GroupNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestGroupNotify error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    :goto_0
    return v3
.end method

.method private d(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;>;)V"
        }
    .end annotation

    .line 339
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 341
    :cond_0
    return-void

    .line 343
    :cond_1
    new-instance v3, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;-><init>()V

    .line 344
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->setDelGroupNotifyList_(Ljava/util/List;)V

    .line 346
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;

    .line 348
    new-instance v6, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;-><init>()V

    .line 349
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getAction_()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->setAction_(I)V

    .line 350
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getGrpID_()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->setGrpID_(J)V

    .line 351
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;->getInitiatorUID_()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest$DelGroupNotify;->setInitiatorUID_(J)V

    .line 352
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/group/DeleteGroupNotifyListRequest;->getDelGroupNotifyList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 353
    goto :goto_0

    .line 354
    :cond_2
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 355
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 358
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-eqz v0, :cond_4

    .line 360
    const-string v0, "GroupNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestDeleteGroupNotifyList resultCode error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 365
    :cond_3
    const-string v0, "GroupNotifyTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestDeleteGroupNotifyList responseCode error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    :cond_4
    :goto_1
    return-void
.end method

.method private static e(Landroid/app/Activity;Lo/atn;)Lo/aud;
    .locals 1

    .line 96
    new-instance v0, Lo/atn$1;

    invoke-direct {v0, p1, p0}, Lo/atn$1;-><init>(Lo/atn;Landroid/app/Activity;)V

    return-object v0
.end method

.method static synthetic e(Lo/atn;)Lo/brd;
    .locals 1

    .line 45
    invoke-static {p0}, Lo/atn;->b(Lo/atn;)Lo/brd;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupNotify;>;"
        }
    .end annotation

    .line 70
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lo/atf;->c()Ljava/util/ArrayList;

    move-result-object v1

    .line 74
    return-object v1
.end method

.method public b(Landroid/app/Activity;)V
    .locals 1

    .line 84
    invoke-static {p1, p0}, Lo/atn;->e(Landroid/app/Activity;Lo/atn;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 85
    return-void
.end method

.method public d(Landroid/os/Handler;)V
    .locals 4

    .line 136
    const/4 v1, 0x1

    .line 137
    const/4 v2, 0x0

    .line 138
    :goto_0
    if-eqz v1, :cond_0

    .line 140
    new-instance v3, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;-><init>()V

    .line 141
    const/16 v0, 0x64

    iput v0, v3, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;->maxNum_:I

    .line 142
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 143
    invoke-direct {p0, v2}, Lo/atn;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z

    move-result v1

    .line 144
    goto :goto_0

    .line 145
    :cond_0
    if-nez v2, :cond_1

    .line 147
    return-void

    .line 149
    :cond_1
    iget v0, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    iget v0, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-eqz v0, :cond_3

    .line 151
    :cond_2
    if-eqz p1, :cond_3

    .line 153
    invoke-virtual {p1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 154
    const/16 v0, 0xd3

    iput v0, v3, Landroid/os/Message;->what:I

    .line 155
    iget v0, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iput v0, v3, Landroid/os/Message;->arg1:I

    .line 156
    iget v0, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    iput v0, v3, Landroid/os/Message;->arg2:I

    .line 157
    invoke-virtual {p1, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 162
    :cond_3
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->k()V

    .line 164
    invoke-static {}, Lo/aob;->a()V

    .line 166
    return-void
.end method
