.class public Lo/aqj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aqj$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(JLo/aqj$c;)V
    .locals 13

    .line 69
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 70
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v4, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 72
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 73
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 74
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 77
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 78
    if-eqz v5, :cond_4

    .line 80
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 81
    const-string v7, ""

    .line 82
    const-string v8, ""

    .line 83
    sget-object v0, Lo/aqj$c;->b:Lo/aqj$c;

    move-object/from16 v1, p3

    if-ne v1, v0, :cond_0

    .line 85
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 86
    const-string v7, "verifyFriend"

    goto :goto_0

    .line 88
    :cond_0
    sget-object v0, Lo/aqj$c;->d:Lo/aqj$c;

    move-object/from16 v1, p3

    if-ne v1, v0, :cond_1

    .line 90
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v8

    .line 91
    const-string v7, "followAssist"

    .line 93
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hwsns://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<a href=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 95
    const-string v11, "</a>"

    .line 97
    const-string v12, ""

    .line 98
    sget-object v0, Lo/aqj$c;->d:Lo/aqj$c;

    move-object/from16 v1, p3

    if-ne v1, v0, :cond_2

    .line 102
    sget v0, Lcom/huawei/android/sns/R$string;->sns_assistant_unfollow_notification:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v8}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const/4 v2, 0x2

    aput-object v11, v1, v2

    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    .line 104
    :cond_2
    sget-object v0, Lo/aqj$c;->b:Lo/aqj$c;

    move-object/from16 v1, p3

    if-ne v1, v0, :cond_3

    .line 108
    sget v0, Lcom/huawei/android/sns/R$string;->sns_not_friend_notification:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v8}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const/4 v2, 0x2

    aput-object v11, v1, v2

    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 110
    :cond_3
    :goto_1
    invoke-virtual {v4, v12}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 113
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 115
    const/4 v0, 0x1

    const v1, 0x310dc

    invoke-static {v0, v1, v4}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 117
    :cond_4
    return-void
.end method

.method private static e(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 274
    new-instance v0, Lo/aqj$5;

    invoke-direct {v0, p0}, Lo/aqj$5;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 3

    .line 230
    invoke-virtual {p0, p1, p2}, Lo/aqj;->b(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v2

    .line 232
    const/4 v0, 0x1

    const/16 v1, 0x120

    invoke-static {v0, v1, v2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 233
    return-void
.end method

.method public b(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 6

    .line 209
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 210
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 211
    invoke-virtual {v4, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 212
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 213
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 214
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 215
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 217
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 218
    sget v0, Lcom/huawei/android/sns/R$string;->sns_offline_msg:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_reconnect_dialog_button:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 220
    return-object v4
.end method

.method public b(JILjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 8

    .line 182
    new-instance v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 183
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 184
    invoke-virtual {v3, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 185
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 186
    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 187
    const/16 v0, 0xb

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 190
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v4

    .line 191
    const-string v5, "hwsns://appInfoCheck"

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<a href=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 193
    const-string v7, "</a>"

    .line 196
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object v6, v0, v1

    const/4 v1, 0x2

    aput-object v7, v0, v1

    invoke-virtual {v4, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 197
    return-object v3
.end method

.method public b(JLjava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 127
    if-eqz p3, :cond_0

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 129
    :cond_0
    return-void

    .line 132
    :cond_1
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 133
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 134
    move-wide v0, p1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 135
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 136
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 137
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 138
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 140
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 141
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Long;

    .line 144
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v9

    .line 145
    if-eqz v9, :cond_2

    .line 147
    invoke-virtual {v9, v5}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hwsns://verifyFriend?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<a href=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 151
    const-string v13, "</a>"

    .line 152
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_name_split_char:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    :cond_2
    goto/16 :goto_0

    .line 158
    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 159
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 161
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 165
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_non_friend_chat_info:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v7}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 167
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 169
    const/4 v0, 0x2

    const v1, 0x310dc

    invoke-static {v0, v1, v4}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 170
    return-void
.end method

.method public c(J)V
    .locals 1

    .line 60
    sget-object v0, Lo/aqj$c;->b:Lo/aqj$c;

    invoke-direct {p0, p1, p2, v0}, Lo/aqj;->b(JLo/aqj$c;)V

    .line 61
    return-void
.end method

.method public c(Landroid/os/Message;Landroid/content/Context;J)V
    .locals 8

    .line 240
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 241
    const-string v5, ""

    .line 242
    const-string v6, ""

    .line 243
    if-eqz v4, :cond_0

    .line 245
    const-string v0, "bundleKeyOldNickname"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 246
    const-string v0, "bundleKeyNewNickname"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 248
    :cond_0
    if-nez v6, :cond_1

    .line 250
    const-string v6, ""

    .line 253
    :cond_1
    new-instance v7, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 254
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v7, p3, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 256
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 257
    const/16 v0, 0xa

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 258
    const/16 v0, 0xd

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 259
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 261
    sget v0, Lcom/huawei/android/sns/R$string;->sns_assisant_nickname_change:I

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

    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 263
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {v7}, Lo/aqj;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 264
    return-void
.end method

.method public e(J)V
    .locals 1

    .line 50
    sget-object v0, Lo/aqj$c;->d:Lo/aqj$c;

    invoke-direct {p0, p1, p2, v0}, Lo/aqj;->b(JLo/aqj$c;)V

    .line 51
    return-void
.end method
