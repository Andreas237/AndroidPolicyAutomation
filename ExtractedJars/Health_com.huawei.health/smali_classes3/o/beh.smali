.class public Lo/beh;
.super Lo/beo;
.source "SourceFile"

# interfaces
.implements Lo/bge;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/beh$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 37
    return-void
.end method

.method private b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/beh$a;

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/beh$a;

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lo/beh;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_add_friend_message_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 68
    new-instance v3, Lo/beh$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/beh$a;-><init>(Lo/beh$4;)V

    .line 70
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 72
    invoke-direct {p0, p1}, Lo/beh;->c(Landroid/view/View;)V

    .line 75
    :goto_0
    invoke-virtual {p0, p2, v3}, Lo/beh;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 76
    invoke-direct {p0, v3, p2}, Lo/beh;->b(Lo/beh$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 77
    return-object p1
.end method

.method private b(Lo/beh$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 94
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v2

    .line 95
    const/4 v0, 0x4

    if-eq v2, v0, :cond_0

    const/16 v0, 0xb

    if-ne v2, v0, :cond_1

    .line 97
    :cond_0
    iget-object v0, p1, Lo/beh$a;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    iget-object v0, p1, Lo/beh$a;->c:Landroid/widget/TextView;

    invoke-static {v0, p0}, Lo/bnr;->d(Landroid/widget/TextView;Lo/bge;)V

    goto :goto_0

    .line 100
    :cond_1
    const/4 v0, 0x5

    if-ne v2, v0, :cond_2

    .line 102
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_content_type_unknow_text:I

    .line 103
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 104
    iget-object v0, p1, Lo/beh$a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    goto :goto_0

    .line 106
    :cond_2
    const/16 v0, 0xd

    if-ne v2, v0, :cond_3

    .line 108
    iget-object v0, p1, Lo/beh$a;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    :cond_3
    :goto_0
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 2

    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/beh$a;

    .line 88
    sget v0, Lcom/huawei/android/sns/R$id;->sns_text_context:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beh$a;->c:Landroid/widget/TextView;

    .line 89
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/beh$a;->t:Landroid/view/ViewStub;

    .line 90
    return-void
.end method

.method private d(Ljava/lang/String;)J
    .locals 7

    .line 191
    const-wide/16 v2, 0x0

    .line 192
    const-string v0, "="

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 193
    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 195
    const/4 v0, 0x1

    aget-object v5, v4, v0

    .line 198
    if-eqz v5, :cond_0

    .line 200
    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 206
    :cond_0
    goto :goto_0

    .line 203
    :catch_0
    move-exception v6

    .line 205
    const-string v0, "ChatAddFriendView"

    const-string v1, "getUserIdByQuery get NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    :cond_1
    :goto_0
    return-wide v2
.end method


# virtual methods
.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 0

    .line 239
    invoke-super {p0, p1, p2, p3}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 240
    return-void
.end method

.method public b(Landroid/view/View;Ljava/lang/String;)V
    .locals 7

    .line 123
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lo/beh;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    if-nez v0, :cond_1

    .line 125
    :cond_0
    return-void

    .line 130
    :cond_1
    :try_start_0
    new-instance v2, Ljava/net/URI;

    invoke-direct {v2, p2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 132
    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v3

    .line 135
    const-string v0, "verifyFriend"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 137
    invoke-virtual {v2}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v4

    .line 138
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    return-void

    .line 142
    :cond_2
    :try_start_1
    invoke-direct {p0, v4}, Lo/beh;->d(Ljava/lang/String;)J

    move-result-wide v5

    .line 144
    iget-object v0, p0, Lo/beh;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v5, v6}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->e(J)V

    .line 145
    goto :goto_0

    .line 148
    :cond_3
    const-string v0, "followAssist"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 150
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 151
    invoke-virtual {v2}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v4

    .line 152
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-eqz v0, :cond_4

    .line 154
    return-void

    .line 156
    :cond_4
    :try_start_2
    invoke-direct {p0, v4}, Lo/beh;->d(Ljava/lang/String;)J

    move-result-wide v5

    .line 158
    iget-object v0, p0, Lo/beh;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const/4 v1, 0x0

    invoke-static {v0, v5, v6, v1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Landroid/app/Activity;JZ)V

    .line 159
    goto :goto_0

    .line 163
    :cond_5
    const-string v0, "receiveSysMessage"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 166
    iget-object v0, p0, Lo/beh;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    check-cast v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k()V

    goto :goto_0

    .line 168
    :cond_6
    const-string v0, "appInfoCheck"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 171
    iget-object v0, p0, Lo/beh;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_7

    .line 173
    iget-object v0, p0, Lo/beh;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    check-cast v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b()V
    :try_end_2
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_0

    .line 180
    :cond_7
    :goto_0
    goto :goto_1

    .line 177
    :catch_0
    move-exception v2

    .line 179
    const-string v0, "ChatAddFriendView"

    const-string v1, "get exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    :goto_1
    return-void
.end method

.method protected b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 227
    invoke-super {p0, p1, p2}, Lo/beo;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 228
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 49
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_0
    invoke-direct {p0, p2, p1, p3}, Lo/beh;->b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 257
    invoke-super {p0, p1}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 258
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V
    .locals 0

    .line 251
    invoke-super {p0, p1, p2}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V

    .line 252
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 0

    .line 245
    invoke-super {p0, p1, p2, p3}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 246
    return-void
.end method

.method protected c(Lo/axq;)V
    .locals 0

    .line 263
    invoke-super {p0, p1}, Lo/beo;->c(Lo/axq;)V

    .line 264
    return-void
.end method

.method protected c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 221
    invoke-super {p0, p1, p2}, Lo/beo;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 222
    return-void
.end method

.method protected e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 215
    invoke-super {p0, p1, p2}, Lo/beo;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 216
    return-void
.end method
