.class public Lo/apk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Lo/apj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lo/apj;

    invoke-direct {v0}, Lo/apj;-><init>()V

    iput-object v0, p0, Lo/apk;->e:Lo/apj;

    .line 37
    return-void
.end method

.method private b(Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;)Ljava/lang/String;
    .locals 23

    .line 250
    const/4 v7, 0x0

    .line 251
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getType()Ljava/lang/String;

    move-result-object v8

    .line 252
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getOp()Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    move-result-object v9

    .line 254
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupId()J

    move-result-wide v10

    .line 255
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupName()Ljava/lang/String;

    move-result-object v12

    .line 257
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v10, v11}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v13

    .line 258
    if-nez v13, :cond_1

    .line 261
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->d:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    if-ne v9, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v10, v11, v0}, Lo/apr;->a(JZ)V

    .line 264
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getOperatorId()J

    move-result-wide v14

    .line 265
    const/16 v16, 0x0

    .line 266
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v17

    .line 267
    cmp-long v0, v17, v14

    if-nez v0, :cond_2

    .line 270
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_me_frist_name_msg:I

    .line 271
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v16

    goto :goto_1

    .line 276
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getOperatorName()Ljava/lang/String;

    move-result-object v1

    move-wide v2, v10

    move-wide v4, v14

    const/4 v0, 0x1

    invoke-static/range {v0 .. v5}, Lo/apq;->a(ZLjava/lang/String;JJ)Ljava/lang/String;

    move-result-object v16

    .line 280
    :goto_1
    const-string v0, "GroupChatChangeHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "organizeGroupInfoNotificationContent , op is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->d:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    if-ne v0, v9, :cond_4

    .line 285
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide v1, v10

    if-nez v13, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    move-wide v4, v14

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Lo/apj;->e(JZJLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 288
    :cond_4
    const-string v0, "0"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 290
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->c:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    if-ne v0, v9, :cond_5

    .line 292
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 295
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_update_group_name_msg:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 296
    invoke-static/range {v16 .. v16}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v12}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 297
    if-eqz v13, :cond_8

    .line 299
    invoke-virtual {v13, v12}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 300
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/atc;->a(Lcom/huawei/health/sns/model/group/Group;)Z

    goto :goto_3

    .line 304
    :cond_5
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;->b:Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage$c;

    if-ne v0, v9, :cond_8

    .line 306
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getManagerId()J

    move-result-wide v19

    .line 307
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v21

    .line 309
    cmp-long v0, v19, v17

    if-nez v0, :cond_6

    .line 312
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_transfer_content:I

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    .line 317
    .line 318
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getManagerName()Ljava/lang/String;

    move-result-object v1

    move-wide v2, v10

    move-wide/from16 v4, v19

    .line 317
    const/4 v0, 0x0

    invoke-static/range {v0 .. v5}, Lo/apq;->a(ZLjava/lang/String;JJ)Ljava/lang/String;

    move-result-object v22

    .line 319
    invoke-static/range {v22 .. v22}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 321
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 323
    :cond_7
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_transfer_chat_note:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 327
    :cond_8
    :goto_3
    const-string v0, "1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 329
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    invoke-virtual {v0, v7, v13, v1, v2}, Lo/apj;->d(Ljava/lang/String;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 331
    :cond_9
    return-object v7
.end method

.method private d(JJJ)V
    .locals 3

    .line 235
    cmp-long v0, p1, p3

    if-nez v0, :cond_0

    .line 238
    iget-object v0, p0, Lo/apk;->e:Lo/apj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p5, p6, v1, v2}, Lo/apj;->b(JII)V

    .line 240
    :cond_0
    return-void
.end method

.method private d(ZJ)V
    .locals 4

    .line 209
    if-eqz p1, :cond_1

    .line 211
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 212
    if-eqz v3, :cond_0

    .line 215
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p3, v1}, Lo/atc;->e(JZ)Z

    .line 217
    iget-object v0, p0, Lo/apk;->e:Lo/apj;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p2, p3, v1, v2}, Lo/apj;->b(JII)V

    goto :goto_0

    .line 221
    :cond_0
    iget-object v0, p0, Lo/apk;->e:Lo/apj;

    invoke-virtual {v0, p2, p3}, Lo/apj;->d(J)V

    .line 224
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)Ljava/lang/String;
    .locals 28

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOp()I

    move-result v14

    .line 101
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getType()Ljava/lang/String;

    move-result-object v15

    .line 102
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v16

    .line 103
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOperatorId()J

    move-result-wide v18

    .line 105
    const-string v20, ""

    .line 106
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v21

    .line 107
    cmp-long v0, v21, v18

    if-nez v0, :cond_0

    .line 110
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_me_frist_name_msg:I

    .line 111
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v20

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOperatorName()Ljava/lang/String;

    move-result-object v1

    move-wide/from16 v2, v16

    move-wide/from16 v4, v18

    const/4 v0, 0x1

    invoke-static/range {v0 .. v5}, Lo/apq;->a(ZLjava/lang/String;JJ)Ljava/lang/String;

    move-result-object v20

    .line 119
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getMemInfoList()Ljava/util/List;

    move-result-object v23

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-object/from16 v1, v23

    move-wide/from16 v2, v21

    invoke-virtual {v0, v1, v2, v3}, Lo/apj;->a(Ljava/util/List;J)Z

    move-result v24

    .line 122
    const/16 v25, -0x1

    .line 123
    const-string v26, ""

    .line 124
    const-string v0, "GroupChatChangeHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "organizeGroupMemberNotificationContent , op is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    packed-switch v14, :pswitch_data_0

    goto/16 :goto_3

    .line 130
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-object v1, v15

    move-wide/from16 v2, v16

    move-wide/from16 v4, v18

    move-object/from16 v6, v20

    move-wide/from16 v7, v21

    move-object/from16 v9, v23

    move/from16 v10, v24

    move-object/from16 v11, v26

    .line 131
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v12

    .line 130
    invoke-virtual/range {v0 .. v13}, Lo/apj;->b(Ljava/lang/String;JJLjava/lang/String;JLjava/util/List;ZLjava/lang/String;J)Ljava/lang/String;

    move-result-object v26

    .line 132
    goto/16 :goto_3

    .line 136
    :pswitch_1
    move-object/from16 v0, p0

    move/from16 v1, v24

    move-wide/from16 v2, v16

    invoke-direct {v0, v1, v2, v3}, Lo/apk;->d(ZJ)V

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide/from16 v1, v16

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v3}, Lo/apj;->b(JLjava/util/List;)V

    .line 138
    move-wide/from16 v0, v16

    move-object/from16 v2, v23

    move-wide/from16 v3, v21

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/apq;->e(JLjava/util/List;JZ)Ljava/lang/String;

    move-result-object v27

    .line 140
    const-string v0, "0"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v25, Lcom/huawei/android/sns/R$string;->sns_delete_member_msg:I

    goto :goto_1

    :cond_1
    sget v25, Lcom/huawei/android/sns/R$string;->sns_delete_member_family_msg:I

    .line 142
    :goto_1
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v27 .. v27}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    move/from16 v2, v25

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 143
    goto/16 :goto_3

    .line 147
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide/from16 v1, v16

    move-object/from16 v3, v20

    move-wide/from16 v4, v21

    move-object/from16 v6, v23

    move/from16 v7, v24

    .line 148
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v8

    .line 147
    invoke-virtual/range {v0 .. v9}, Lo/apj;->e(JLjava/lang/String;JLjava/util/List;ZJ)Ljava/lang/String;

    move-result-object v26

    .line 149
    goto/16 :goto_3

    .line 153
    :pswitch_3
    sget v25, Lcom/huawei/android/sns/R$string;->sns_join_family_msg:I

    .line 154
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move/from16 v2, v25

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 156
    move-object/from16 v0, p0

    move-wide/from16 v1, v21

    move-wide/from16 v3, v18

    move-wide/from16 v5, v16

    invoke-direct/range {v0 .. v6}, Lo/apk;->d(JJJ)V

    .line 157
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide/from16 v1, v16

    move-object/from16 v3, v23

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lo/apj;->b(JLjava/util/List;J)V

    .line 158
    goto/16 :goto_3

    .line 162
    :pswitch_4
    sget v25, Lcom/huawei/android/sns/R$string;->sns_self_join_msg:I

    .line 163
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move/from16 v2, v25

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 165
    move-object/from16 v0, p0

    move-wide/from16 v1, v21

    move-wide/from16 v3, v18

    move-wide/from16 v5, v16

    invoke-direct/range {v0 .. v6}, Lo/apk;->d(JJJ)V

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide/from16 v1, v16

    move-object/from16 v3, v23

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lo/apj;->b(JLjava/util/List;J)V

    .line 167
    goto/16 :goto_3

    .line 171
    :pswitch_5
    cmp-long v0, v21, v18

    if-eqz v0, :cond_3

    .line 174
    const-string v0, "0"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v25, Lcom/huawei/android/sns/R$string;->sns_self_quit_msg:I

    goto :goto_2

    :cond_2
    sget v25, Lcom/huawei/android/sns/R$string;->sns_self_quit_family_msg:I

    .line 176
    :goto_2
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move/from16 v2, v25

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 178
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide/from16 v1, v16

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v3}, Lo/apj;->b(JLjava/util/List;)V

    .line 179
    goto :goto_3

    .line 183
    :pswitch_6
    new-instance v0, Lo/asx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/asx;-><init>(Landroid/os/Handler;)V

    move-wide/from16 v1, v16

    move-wide/from16 v3, v18

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOperatorName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(JJLjava/lang/String;)V

    .line 184
    goto :goto_3

    .line 189
    :pswitch_7
    sget v25, Lcom/huawei/android/sns/R$string;->sns_join_group_chat_msg:I

    .line 190
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move/from16 v2, v25

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 191
    move-object/from16 v0, p0

    move-wide/from16 v1, v21

    move-wide/from16 v3, v18

    move-wide/from16 v5, v16

    invoke-direct/range {v0 .. v6}, Lo/apk;->d(JJJ)V

    .line 192
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/apk;->e:Lo/apj;

    move-wide/from16 v1, v16

    move-object/from16 v3, v23

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lo/apj;->b(JLjava/util/List;J)V

    .line 193
    .line 198
    :goto_3
    :pswitch_8
    return-object v26

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_8
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public c(Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;)V
    .locals 6

    .line 342
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 343
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getPacketID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 344
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 345
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 346
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 347
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 348
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getSendTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->getSendTime()J

    move-result-wide v0

    goto :goto_0

    .line 349
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 348
    :goto_0
    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 351
    invoke-direct {p0, p1}, Lo/apk;->b(Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;)Ljava/lang/String;

    move-result-object v5

    .line 352
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    invoke-virtual {v4, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 356
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 358
    const/4 v0, 0x2

    const v1, 0x310dc

    invoke-static {v0, v1, v4}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 360
    :cond_1
    return-void
.end method

.method public e(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 48
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOp()I

    move-result v7

    .line 51
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v8

    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOperatorId()J

    move-result-wide v0

    cmp-long v0, v8, v0

    if-nez v0, :cond_0

    .line 55
    return-object v6

    .line 62
    :cond_0
    const/4 v0, 0x3

    if-eq v0, v7, :cond_1

    const/4 v0, 0x5

    if-eq v0, v7, :cond_1

    const/16 v0, 0x8

    if-ne v0, v7, :cond_4

    .line 66
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getMemInfoList()Ljava/util/List;

    move-result-object v10

    .line 67
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 68
    if-eqz v10, :cond_4

    .line 70
    const-string v12, ""

    .line 71
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_no_friend_tip:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 72
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;

    .line 76
    const-string v0, "true"

    invoke-virtual {v15}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getNoFriend()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v15}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v0

    cmp-long v0, v8, v0

    if-eqz v0, :cond_2

    .line 78
    invoke-interface {v11, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_2
    goto :goto_0

    .line 81
    :cond_3
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v0

    move-object v2, v11

    move-wide v3, v8

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/apq;->e(JLjava/util/List;JZ)Ljava/lang/String;

    move-result-object v12

    .line 84
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    invoke-static {v13, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 85
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    :cond_4
    return-object v6
.end method
