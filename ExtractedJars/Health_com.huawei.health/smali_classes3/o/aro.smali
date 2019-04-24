.class public Lo/aro;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(JJI)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 100
    const/4 v1, 0x0

    .line 102
    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 105
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    goto :goto_0

    .line 107
    :cond_0
    const/4 v0, 0x2

    if-ne p4, v0, :cond_2

    .line 110
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p0, p1}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v2

    .line 111
    if-eqz v2, :cond_1

    .line 113
    new-instance v1, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 114
    invoke-virtual {v2, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->updateToUser(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 119
    :cond_1
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    .line 122
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static d()V
    .locals 3

    .line 129
    const/16 v0, 0x9

    const/16 v1, 0x7e7

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 131
    return-void
.end method

.method public static d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 8

    .line 43
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x7

    if-eq v1, v0, :cond_0

    .line 45
    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentSpannableString()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v2

    .line 51
    new-instance v3, Lo/axs;

    invoke-direct {v3, v2}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v3}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 54
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/axq;

    .line 57
    if-eqz v5, :cond_1

    .line 59
    invoke-virtual {v5}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v6

    .line 60
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v7

    .line 63
    invoke-virtual {p0, v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentSpannableString(Ljava/lang/CharSequence;)V

    .line 68
    :cond_1
    return-void
.end method

.method public static e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 75
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 77
    return-void

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentSpannableString()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    .line 81
    const/4 v3, 0x0

    .line 83
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/bgh$c;->a:Lo/bgh$c;

    invoke-virtual {v0, v1, v2}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/text/SpannableStringBuilder;

    .line 85
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    invoke-static {v3, v0}, Lo/apc;->e(Landroid/text/SpannableStringBuilder;I)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 86
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentSpannableString(Ljava/lang/CharSequence;)V

    .line 88
    :cond_1
    return-void
.end method
