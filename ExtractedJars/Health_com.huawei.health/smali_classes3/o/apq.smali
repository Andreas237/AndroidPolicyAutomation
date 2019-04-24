.class public Lo/apq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JJZ)Ljava/lang/String;
    .locals 6

    .line 128
    const-string v3, ""

    .line 129
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v4

    .line 130
    if-nez v4, :cond_0

    .line 132
    const-string v0, "GroupChatNameHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMsgSenderName.groupMember is null.isNeedRequestServer = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    if-eqz p4, :cond_1

    .line 135
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p0, p1}, Lo/atg;->e(J)V

    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 142
    :cond_1
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 144
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 145
    if-eqz v5, :cond_2

    .line 147
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 148
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 150
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v3

    .line 154
    :cond_2
    return-object v3
.end method

.method public static a(ZLjava/lang/String;JJ)Ljava/lang/String;
    .locals 3

    .line 105
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 106
    const/4 v0, 0x0

    invoke-static {p2, p3, p4, p5, v0}, Lo/apq;->a(JJZ)Ljava/lang/String;

    move-result-object v2

    .line 107
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    move-object v2, p1

    .line 111
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    .line 113
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 116
    :cond_0
    return-object v2
.end method

.method public static e(JLjava/util/List;JZ)Ljava/lang/String;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;JZ)Ljava/lang/String;"
        }
    .end annotation

    .line 37
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v8

    .line 40
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_name_split_char:I

    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 41
    const/4 v10, 0x0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 43
    move-object/from16 v0, p2

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;

    .line 44
    const/4 v12, 0x0

    .line 45
    if-eqz p5, :cond_1

    .line 47
    invoke-virtual {v11}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    .line 49
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_me_frist_name_msg:I

    .line 50
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    goto/16 :goto_2

    .line 54
    :cond_0
    invoke-virtual {v11}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getNickName()Ljava/lang/String;

    move-result-object v1

    move-wide v2, p0

    invoke-virtual {v11}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v4

    const/4 v0, 0x1

    invoke-static/range {v0 .. v5}, Lo/apq;->a(ZLjava/lang/String;JJ)Ljava/lang/String;

    move-result-object v12

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 56
    add-int/lit8 v7, v7, 0x1

    .line 57
    const/16 v0, 0x28

    if-ne v7, v0, :cond_3

    .line 59
    goto :goto_3

    .line 64
    :cond_1
    invoke-virtual {v11}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, p3

    if-eqz v0, :cond_2

    .line 66
    invoke-virtual {v11}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getNickName()Ljava/lang/String;

    move-result-object v1

    move-wide v2, p0

    invoke-virtual {v11}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->getUserId()J

    move-result-wide v4

    const/4 v0, 0x1

    invoke-static/range {v0 .. v5}, Lo/apq;->a(ZLjava/lang/String;JJ)Ljava/lang/String;

    move-result-object v12

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 68
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 72
    :cond_2
    add-int/lit8 v7, v7, -0x1

    .line 74
    :goto_1
    const/16 v0, 0x28

    if-ne v7, v0, :cond_3

    .line 76
    goto :goto_3

    .line 41
    :cond_3
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 80
    :cond_4
    :goto_3
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 82
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v10

    .line 83
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 84
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 86
    :cond_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x28

    if-le v0, v1, :cond_6

    .line 88
    const-string v0, "..."

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 90
    :cond_6
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
