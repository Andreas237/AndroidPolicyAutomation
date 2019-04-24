.class public Lo/axy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)Lcom/huawei/health/sns/model/chat/GrpInviteMessage;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)Lcom/huawei/health/sns/model/chat/GrpInviteMessage;"
        }
    .end annotation

    .line 112
    new-instance v2, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;-><init>()V

    .line 113
    invoke-virtual {v2, p1, p2}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setOperatorId(J)V

    .line 114
    invoke-virtual {v2, p3}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setOperatorName(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setGroupId(J)V

    .line 116
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setGroupName(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/group/Group;->getMemCount()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setGrpMemCount(I)V

    .line 118
    invoke-virtual {v2, p5}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->setMemberList(Ljava/util/ArrayList;)V

    .line 119
    return-object v2
.end method

.method private d(JZLcom/huawei/health/sns/model/chat/GrpInviteMessage;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 5

    .line 132
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 133
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 134
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v4, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 137
    if-eqz p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 138
    if-eqz p3, :cond_1

    move-wide v0, v2

    goto :goto_1

    :cond_1
    move-wide v0, p1

    :goto_1
    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 139
    if-eqz p3, :cond_2

    move-wide v0, p1

    goto :goto_2

    :cond_2
    move-wide v0, v2

    :goto_2
    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 141
    const/16 v0, 0xe

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 142
    invoke-virtual {p4}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getJson()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 144
    return-object v4
.end method


# virtual methods
.method public a(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 36
    move-object v6, p3

    .line 37
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 38
    if-eqz v7, :cond_0

    .line 40
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 42
    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, v6

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lo/axy;->b(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    move-result-object v8

    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v8}, Lo/axy;->d(JZLcom/huawei/health/sns/model/chat/GrpInviteMessage;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v9

    .line 45
    invoke-static {}, Lo/apu;->b()Lo/apu;

    move-result-object v0

    invoke-virtual {v0, v7, v9}, Lo/apu;->b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 46
    return-void
.end method

.method public d(JLjava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 56
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 57
    if-nez v1, :cond_0

    .line 59
    return-void

    .line 61
    :cond_0
    invoke-virtual {p0, v1, p3}, Lo/axy;->e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V

    .line 62
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 72
    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 74
    :cond_0
    return-void

    .line 77
    :cond_1
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/Group;->setMemCount(I)V

    .line 79
    invoke-static {v6}, Lo/boz;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v7

    .line 81
    const-wide/16 v8, 0x0

    .line 82
    const/4 v10, 0x0

    .line 83
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->g()Lcom/huawei/health/sns/model/user/User;

    move-result-object v11

    .line 84
    if-eqz v11, :cond_2

    .line 86
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v8

    .line 87
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v10

    .line 90
    :cond_2
    move-object/from16 v0, p0

    move-wide v1, v8

    move-object v3, v10

    move-object/from16 v4, p1

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/axy;->b(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    move-result-object v12

    .line 93
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/health/sns/model/user/User;

    .line 95
    invoke-virtual {v14}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3, v12}, Lo/axy;->d(JZLcom/huawei/health/sns/model/chat/GrpInviteMessage;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v15

    .line 96
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v15}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 97
    goto :goto_0

    .line 98
    :cond_3
    return-void
.end method
