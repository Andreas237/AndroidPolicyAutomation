.class public Lo/bet;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bet$d;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 56
    iput-object p1, p0, Lo/bet;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 57
    return-void
.end method

.method static synthetic a(Lo/bet;ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/bet;->e(ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V

    return-void
.end method

.method static synthetic b(Lo/bet;ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/bet;->d(ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V

    return-void
.end method

.method private c(J)V
    .locals 3

    .line 254
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 255
    iget-object v0, p0, Lo/bet;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 256
    const-string v0, "groupId"

    invoke-virtual {v2, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 257
    iget-object v0, p0, Lo/bet;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 258
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V
    .locals 2

    .line 219
    iget-object v0, p2, Lo/bet$d;->e:Landroid/widget/LinearLayout;

    new-instance v1, Lo/bet$4;

    invoke-direct {v1, p0, p1, p2}, Lo/bet$4;-><init>(Lo/bet;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    return-void
.end method

.method private d(ZLandroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 93
    const/4 v2, 0x0

    .line 94
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 95
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bet$d;

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bet$d;

    goto :goto_1

    .line 101
    :cond_0
    if-eqz p1, :cond_1

    sget v3, Lcom/huawei/android/sns/R$layout;->sns_grp_invite_right_item:I

    goto :goto_0

    :cond_1
    sget v3, Lcom/huawei/android/sns/R$layout;->sns_grp_invite_left_item:I

    .line 102
    :goto_0
    iget-object v0, p0, Lo/bet;->b:Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, p4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 104
    new-instance v2, Lo/bet$d;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/bet$d;-><init>(Lo/bet$4;)V

    .line 106
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 108
    invoke-direct {p0, p2, p1}, Lo/bet;->e(Landroid/view/View;Z)V

    .line 110
    :goto_1
    if-eqz p1, :cond_2

    .line 112
    invoke-direct {p0, v2}, Lo/bet;->e(Lo/bet$d;)V

    .line 114
    :cond_2
    invoke-virtual {p0, p3, v2}, Lo/bet;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 115
    invoke-virtual {p0, p3, v2}, Lo/bet;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 118
    invoke-virtual {p0, p3, v2}, Lo/bet;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V

    .line 120
    if-eqz p1, :cond_3

    .line 123
    invoke-virtual {p0, v2, p3}, Lo/bet;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {p0, p3}, Lo/bet;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 130
    :goto_2
    invoke-virtual {p0, p3, p2, v2}, Lo/bet;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 131
    iget-object v0, v2, Lo/bet$d;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p3, v0, v2}, Lo/bet;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 133
    invoke-direct {p0, p3, v2}, Lo/bet;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V

    .line 135
    return-object p2
.end method

.method private d(ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V
    .locals 4

    .line 301
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bet;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-class v1, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 302
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 303
    const-string v0, "bundleKey_msg_id"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 304
    const-string v0, "bundleKey_grp_invite_msg"

    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 305
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 306
    iget-object v0, p0, Lo/bet;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 307
    return-void
.end method

.method static synthetic d(Lo/bet;J)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/bet;->c(J)V

    return-void
.end method

.method private e(ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V
    .locals 3

    .line 268
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bet$1;

    invoke-direct {v1, p0, p2, p1}, Lo/bet$1;-><init>(Lo/bet;Lcom/huawei/health/sns/model/chat/GrpInviteMessage;I)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/brb;->e(Lo/brd;Lo/brc;)Lo/bqy;

    .line 291
    return-void
.end method

.method private e(Landroid/view/View;Z)V
    .locals 2

    .line 147
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bet$d;

    .line 149
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bet$d;->m:Landroid/widget/ImageView;

    .line 150
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_repeat_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bet$d;->p:Landroid/widget/ImageView;

    .line 151
    sget v0, Lcom/huawei/android/sns/R$id;->chat_pic_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lo/bet$d;->l:Landroid/widget/ProgressBar;

    .line 152
    if-nez p2, :cond_0

    .line 155
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bet$d;->o:Landroid/widget/TextView;

    .line 157
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/bet$d;->n:Landroid/widget/CheckBox;

    .line 158
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/bet$d;->t:Landroid/view/ViewStub;

    .line 159
    sget v0, Lcom/huawei/android/sns/R$id;->invite_msg_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bet$d;->b:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/android/sns/R$id;->invite_msg_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bet$d;->c:Landroid/widget/ImageView;

    .line 161
    sget v0, Lcom/huawei/android/sns/R$id;->invite_msg_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bet$d;->d:Landroid/widget/TextView;

    .line 162
    sget v0, Lcom/huawei/android/sns/R$id;->msg_item_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bet$d;->e:Landroid/widget/LinearLayout;

    .line 163
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bet$d;->u:Landroid/widget/LinearLayout;

    .line 164
    return-void
.end method

.method private e(Lo/bet$d;)V
    .locals 2

    .line 208
    iget-object v0, p1, Lo/bet$d;->e:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_chat_right_socity_msg_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 209
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 68
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 70
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 74
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2, p1, p3}, Lo/bet;->d(ZLandroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 78
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0, p2, p1, p3}, Lo/bet;->d(ZLandroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bet$d;)V
    .locals 14

    .line 174
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v6

    .line 175
    new-instance v7, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;-><init>()V

    .line 176
    invoke-virtual {v7, v6}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->parseJson(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getMemberList()Ljava/util/ArrayList;

    move-result-object v8

    .line 178
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v9

    .line 179
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/bet$d;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_grp_invite_message_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 180
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getOperatorName()Ljava/lang/String;

    move-result-object v11

    .line 181
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lo/bet;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 185
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupName()Ljava/lang/String;

    move-result-object v12

    .line 186
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    invoke-static {v8}, Lo/ati;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v12

    .line 190
    :cond_1
    const-string v13, ""

    .line 191
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 193
    iget-object v0, p0, Lo/bet;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_alert_group_name:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 195
    :cond_2
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/bet$d;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bet;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_grp_invite_message_content:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 196
    invoke-static {v11}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v13}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 195
    invoke-virtual {v1, v2, v3}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    move-object/from16 v0, p2

    iget-object v0, v0, Lo/bet$d;->c:Landroid/widget/ImageView;

    invoke-static {v0, v9, v10, v8}, Lo/bpg;->a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V

    .line 198
    return-void
.end method
