.class public Lo/asy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(JLjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 73
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 74
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v2, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 76
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 77
    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 78
    const/16 v0, 0xd

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 80
    invoke-virtual {v2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 81
    return-object v2
.end method

.method private b(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 92
    const-string v2, ""

    .line 93
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 96
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 98
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/User;

    .line 99
    invoke-direct {p0, v7}, Lo/asy;->d(Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;

    move-result-object v8

    .line 100
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    invoke-virtual {v3, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 103
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_name_split_char:I

    invoke-virtual {v5, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 106
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 107
    const/16 v0, 0x28

    if-ne v4, v0, :cond_1

    .line 109
    goto :goto_1

    .line 96
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 112
    :cond_2
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 114
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 116
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x28

    if-le v0, v1, :cond_4

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 120
    :cond_4
    return-object v2
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;
    .locals 5

    .line 131
    const/4 v3, 0x0

    .line 132
    if-nez p1, :cond_0

    .line 134
    return-object v3

    .line 137
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 138
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 141
    if-eqz v4, :cond_1

    .line 143
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 146
    :cond_1
    return-object v3
.end method


# virtual methods
.method e(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 36
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 39
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v4

    .line 40
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_me_frist_name_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 41
    invoke-direct {p0, p2}, Lo/asy;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v6

    .line 42
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_member_msg:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 43
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v8

    .line 44
    if-eqz v7, :cond_0

    .line 47
    new-instance v0, Lo/asy;

    invoke-direct {v0}, Lo/asy;-><init>()V

    invoke-direct {v0, v8, v9, v7}, Lo/asy;->b(JLjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v10

    .line 49
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 51
    const/4 v0, 0x2

    const v1, 0x310dc

    const-wide/16 v2, 0x190

    invoke-static {v0, v1, v10, v2, v3}, Lo/apf;->b(IILjava/lang/Object;J)V

    .line 55
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x13

    if-le v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 58
    sget v0, Lcom/huawei/android/sns/R$string;->sns_member_num_over:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 59
    new-instance v0, Lo/asy;

    invoke-direct {v0}, Lo/asy;-><init>()V

    invoke-direct {v0, v8, v9, v10}, Lo/asy;->b(JLjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v11

    .line 61
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    .line 62
    new-instance v0, Lo/atv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1, v11}, Lo/atv;->d(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 65
    :cond_1
    return-void
.end method
