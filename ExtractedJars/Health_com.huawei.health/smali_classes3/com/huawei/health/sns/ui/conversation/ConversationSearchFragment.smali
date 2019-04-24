.class public Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;
.super Lcom/huawei/health/sns/ui/search/SearchFragment;
.source "SourceFile"


# static fields
.field private static final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/search/SNSSearchBean;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 5

    .line 92
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 94
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getGroup()Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 95
    if-nez v3, :cond_0

    .line 97
    return-void

    .line 99
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v4

    .line 101
    if-nez v4, :cond_1

    .line 104
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 105
    const-string v0, "groupId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_0

    .line 107
    :cond_1
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    .line 110
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 111
    const-string v0, "groupId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_0

    .line 115
    :cond_2
    sget-object v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->p:Ljava/lang/String;

    const-string v1, "group type error"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    :goto_0
    goto :goto_1

    .line 121
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 122
    const-string v0, "groupId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {p3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 123
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    const-string v0, "message_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 128
    :cond_4
    :goto_1
    const-string v0, "refresh_searchView"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 129
    invoke-virtual {p2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 130
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 131
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/search/SNSSearchBean;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 3

    .line 143
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserType()I

    move-result v0

    if-nez v0, :cond_0

    .line 148
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 149
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {p3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 150
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_1

    .line 152
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 155
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(Landroid/app/Activity;J)V

    .line 156
    return-void

    .line 162
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 164
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 168
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 170
    :goto_0
    const-string v0, "userId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {p3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 171
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v0

    if-eqz v0, :cond_3

    .line 173
    const-string v0, "message_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 176
    :cond_3
    :goto_1
    const-string v0, "refresh_searchView"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 177
    invoke-virtual {p2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 178
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 179
    return-void
.end method

.method private b(Ljava/lang/Class;Landroid/os/Bundle;ZIZ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Landroid/os/Bundle;ZIZ)V"
        }
    .end annotation

    .line 192
    if-nez p1, :cond_0

    .line 194
    return-void

    .line 197
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 198
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 200
    if-eqz p2, :cond_1

    .line 202
    invoke-virtual {v2, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 205
    :cond_1
    if-eqz p3, :cond_2

    .line 207
    invoke-virtual {p0, v2, p4}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 213
    :cond_2
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    goto :goto_0

    .line 215
    :catch_0
    move-exception v3

    .line 217
    sget-object v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->p:Ljava/lang/String;

    const-string v1, "jumpToPage IllegalStateException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    :goto_0
    return-void
.end method


# virtual methods
.method public d(Lo/bfl;)V
    .locals 10

    .line 41
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v6

    .line 42
    instance-of v0, v6, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-nez v0, :cond_0

    .line 44
    sget-object v0, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->p:Ljava/lang/String;

    const-string v1, "FriendSearchBean onClick , but data is not instanceof FriendSearchBean"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void

    .line 47
    :cond_0
    move-object v7, v6

    check-cast v7, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 50
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsgCounts()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 52
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 53
    const-string v0, "userId"

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 54
    const-string v0, "queryContent"

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getKeyColorText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v0, "queryTitle"

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    move-object v0, p0

    const-class v1, Lcom/huawei/health/sns/ui/conversation/MessageSearchActivity;

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->b(Ljava/lang/Class;Landroid/os/Bundle;ZIZ)V

    .line 57
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 63
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    .line 64
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_3

    .line 66
    :cond_2
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 67
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 68
    invoke-direct {p0, v7, v8, v9}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->b(Lcom/huawei/health/sns/model/search/SNSSearchBean;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_4

    .line 71
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->f:Lo/bfp$c;

    if-ne v0, v1, :cond_5

    .line 74
    :cond_4
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 75
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 76
    invoke-direct {p0, v7, v8, v9}, Lcom/huawei/health/sns/ui/conversation/ConversationSearchFragment;->a(Lcom/huawei/health/sns/model/search/SNSSearchBean;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 80
    :cond_5
    :goto_0
    return-void
.end method
