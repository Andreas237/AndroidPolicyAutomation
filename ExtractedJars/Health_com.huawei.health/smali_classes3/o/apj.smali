.class public Lo/apj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 102
    new-instance v1, Lo/ayc;

    invoke-direct {v1}, Lo/ayc;-><init>()V

    .line 103
    invoke-virtual {v1, p1, p2}, Lo/ayc;->e(J)V

    .line 104
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/ayc;->e(Z)V

    .line 105
    invoke-virtual {v1, p4}, Lo/ayc;->c(Ljava/lang/String;)V

    .line 106
    invoke-virtual {v1, p3}, Lo/ayc;->d(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v1, p5}, Lo/ayc;->b(Ljava/lang/String;)V

    .line 108
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v1}, Lo/ata;->b(JLo/ayc;)V

    .line 109
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;J)Z"
        }
    .end annotation

    .line 338
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;

    .line 340
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, p2

    if-nez v0, :cond_0

    .line 342
    const/4 v0, 0x1

    return v0

    .line 344
    :cond_0
    goto :goto_0

    .line 345
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public b(Ljava/lang/String;JJLjava/lang/String;JLjava/util/List;ZLjava/lang/String;J)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JJLjava/lang/String;JLjava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;ZLjava/lang/String;J)Ljava/lang/String;"
        }
    .end annotation

    .line 206
    const/4 v6, -0x1

    .line 207
    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    if-eqz p10, :cond_0

    cmp-long v0, p7, p4

    if-eqz v0, :cond_0

    .line 212
    sget v6, Lcom/huawei/android/sns/R$string;->sns_create_group_msg:I

    .line 215
    :cond_0
    const/4 v0, -0x1

    if-eq v6, v0, :cond_1

    .line 217
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p11

    .line 219
    :cond_1
    move-object v0, p0

    move-wide v1, p2

    move-object/from16 v3, p9

    move-wide/from16 v4, p12

    invoke-virtual/range {v0 .. v5}, Lo/apj;->b(JLjava/util/List;J)V

    .line 220
    return-object p11
.end method

.method public b(JII)V
    .locals 2

    .line 164
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 165
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v0

    if-ne v0, p3, :cond_0

    .line 167
    invoke-virtual {v1, p4}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 168
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 170
    :cond_0
    return-void
.end method

.method public b(JLjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;)V"
        }
    .end annotation

    .line 266
    if-nez p3, :cond_0

    .line 268
    return-void

    .line 270
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;

    .line 272
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/ath;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 274
    const-string v0, "GroupChatHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete member failed, id is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    :cond_1
    goto :goto_0

    .line 277
    :cond_2
    return-void
.end method

.method public b(JLjava/util/List;J)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;J)V"
        }
    .end annotation

    .line 288
    if-nez p3, :cond_0

    .line 290
    return-void

    .line 293
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;

    .line 295
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 296
    new-instance v8, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v8}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 297
    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 299
    if-eqz v7, :cond_1

    .line 301
    invoke-virtual {v8, p1, p2}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 302
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 303
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 304
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 305
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 306
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setOldUserImageUrl(Ljava/lang/String;)V

    .line 307
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 308
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getSiteId()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSiteId(I)V

    .line 309
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v4

    goto :goto_1

    .line 313
    :cond_1
    invoke-virtual {v8, p1, p2}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 314
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 315
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 316
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v4

    .line 319
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/apr;->d(J)V

    .line 322
    :goto_1
    if-nez v4, :cond_2

    .line 324
    const-string v0, "GroupChatHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "add local groupMember failed, id is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    :cond_2
    goto/16 :goto_0

    .line 327
    :cond_3
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 40
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 41
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->c:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getOp()Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 43
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    sget v0, Lcom/huawei/android/sns/R$string;->sns_update_family_name_msg:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 47
    if-eqz p2, :cond_5

    .line 49
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 50
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    goto/16 :goto_0

    .line 53
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 56
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_update_family_img_msg:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 57
    if-eqz p2, :cond_5

    .line 59
    move-object v0, p0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getDownloadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/apj;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    goto :goto_0

    .line 66
    :cond_2
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->b:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getOp()Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    move-result-object v1

    if-ne v0, v1, :cond_5

    .line 69
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v7

    .line 70
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getManagerId()J

    move-result-wide v0

    cmp-long v0, v7, v0

    if-nez v0, :cond_3

    .line 73
    sget v0, Lcom/huawei/android/sns/R$string;->sns_family_group_transfer_content:I

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 78
    .line 79
    :cond_3
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getManagerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupId()J

    move-result-wide v2

    .line 80
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getManagerId()J

    move-result-wide v4

    .line 78
    const/4 v0, 0x0

    invoke-static/range {v0 .. v5}, Lo/apq;->a(ZLjava/lang/String;JJ)Ljava/lang/String;

    move-result-object v9

    .line 82
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 84
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 86
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$string;->sns_family_transfer_chat_note:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v9}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 89
    :cond_5
    :goto_0
    return-object p1
.end method

.method public d(J)V
    .locals 4

    .line 180
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_deteted_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 181
    new-instance v3, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 182
    invoke-virtual {v3, p1, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 183
    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 184
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 185
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 186
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 187
    return-void
.end method

.method public e(JLjava/lang/String;JLjava/util/List;ZJ)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;JLjava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;ZJ)Ljava/lang/String;"
        }
    .end annotation

    .line 239
    if-eqz p7, :cond_0

    .line 242
    sget v6, Lcom/huawei/android/sns/R$string;->sns_create_group_msg:I

    .line 243
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 245
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/apj;->b(JII)V

    goto :goto_0

    .line 250
    :cond_0
    sget v6, Lcom/huawei/android/sns/R$string;->sns_invite_member_msg:I

    .line 251
    move-wide v0, p1

    move-object v2, p6

    move-wide v3, p4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/apq;->e(JLjava/util/List;JZ)Ljava/lang/String;

    move-result-object v8

    .line 252
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 254
    :goto_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p6

    move-wide/from16 v4, p8

    invoke-virtual/range {v0 .. v5}, Lo/apj;->b(JLjava/util/List;J)V

    .line 255
    return-object v7
.end method

.method public e(JZJLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 123
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 125
    cmp-long v0, v2, p4

    if-nez v0, :cond_0

    if-nez p3, :cond_3

    .line 127
    :cond_0
    if-eqz p3, :cond_1

    .line 130
    invoke-virtual {p0, p1, p2}, Lo/apj;->d(J)V

    goto :goto_0

    .line 135
    :cond_1
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/atc;->e(JZ)Z

    .line 137
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Lo/apj;->b(JII)V

    .line 139
    :goto_0
    const-string v0, "1"

    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 142
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_dissolution_notify:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 147
    :cond_2
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_dismiss:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 150
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method
