.class public Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Lo/bjb;


# static fields
.field private static final p:Ljava/lang/String;


# instance fields
.field protected a:Lo/bje;

.field private l:J

.field private m:Ljava/lang/String;

.field private o:Lo/bgf;

.field private r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->a:Lo/bje;

    return-void
.end method

.method public static b()Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;
    .locals 1

    .line 87
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;-><init>()V

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 136
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->m:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 141
    :cond_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 148
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 149
    if-eqz v2, :cond_3

    .line 151
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 152
    if-nez v3, :cond_0

    .line 154
    return-void

    .line 156
    :cond_0
    const-string v0, "userId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    const-string v0, "userId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->l:J

    .line 160
    :cond_1
    const-string v0, "queryContent"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 162
    const-string v0, "queryContent"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->r:Ljava/lang/String;

    .line 164
    :cond_2
    const-string v0, "queryTitle"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 166
    const-string v0, "queryTitle"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->m:Ljava/lang/String;

    .line 169
    :cond_3
    return-void
.end method

.method private k()V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->a:Lo/bje;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->a:Lo/bje;

    invoke-virtual {v0}, Lo/bje;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->a:Lo/bje;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bje;->cancel(Z)Z

    .line 183
    :cond_0
    new-instance v0, Lo/bje;

    invoke-direct {v0, p0}, Lo/bje;-><init>(Lo/bjb;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->a:Lo/bje;

    .line 184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->a:Lo/bje;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lo/bje;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 185
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)V
    .locals 2

    .line 250
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    invoke-virtual {v0, p1}, Lo/bgf;->c(Ljava/lang/Object;)V

    .line 255
    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 93
    new-instance v0, Lo/bgf;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->l:J

    invoke-direct {v0, v1, v2, v3}, Lo/bgf;-><init>(Landroid/content/Context;J)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    .line 94
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bgf;->b(Lo/bfn;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->c:Lo/bfq;

    .line 96
    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->o:Lo/bgf;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bgf;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 244
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lo/bfl;)V
    .locals 7

    .line 190
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v3

    .line 191
    instance-of v0, v3, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-nez v0, :cond_0

    .line 193
    sget-object v0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->p:Ljava/lang/String;

    const-string v1, "FriendSearchBean onClick , but data is not instanceof FriendSearchBean"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return-void

    .line 199
    :cond_0
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 200
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 201
    const-string v0, "is_from_msg_search"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 203
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 205
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 206
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 208
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 212
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 214
    :goto_0
    const-string v0, "userId"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 215
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    const-string v0, "message_id"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 219
    :cond_2
    invoke-virtual {v6, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 220
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 221
    goto :goto_1

    .line 222
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 225
    new-instance v6, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 226
    const-string v0, "groupId"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 227
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v0

    if-eqz v0, :cond_4

    .line 229
    const-string v0, "message_id"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsg_id()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 231
    :cond_4
    invoke-virtual {v6, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 232
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 235
    :cond_5
    :goto_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 260
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 261
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->k()V

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->g:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 263
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 101
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreate(Landroid/os/Bundle;)V

    .line 102
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->i()V

    .line 103
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 109
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->b:Landroid/view/View;

    .line 111
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->h()V

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->k()V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->h:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 117
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_search_no_result_layout:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->b:Landroid/view/View;

    check-cast v1, Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 119
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->g:Landroid/widget/LinearLayout;

    .line 120
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->f:Landroid/widget/ImageView;

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->g:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->f:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->d:Lo/bfm;

    new-instance v1, Lo/bmi;

    invoke-direct {v1}, Lo/bmi;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/MessageSearchFragment;->b:Landroid/view/View;

    return-object v0
.end method
