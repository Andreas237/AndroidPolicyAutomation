.class public Lo/ber;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/widget/ProgressBar;)V
    .locals 1

    .line 244
    if-eqz p1, :cond_0

    .line 246
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 248
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/ber;Landroid/widget/ProgressBar;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/ber;->a(Landroid/widget/ProgressBar;)V

    return-void
.end method

.method static synthetic a(Lo/ber;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ber;->d(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V

    return-void
.end method

.method private static d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 127
    new-instance v0, Lo/ber$3;

    invoke-direct {v0, p0}, Lo/ber$3;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private d(Landroid/widget/ProgressBar;)V
    .locals 1

    .line 231
    if-eqz p1, :cond_0

    .line 233
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 235
    :cond_0
    return-void
.end method

.method private d(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 7

    .line 204
    sget v6, Lcom/huawei/android/sns/R$string;->sns_resend_message:I

    .line 205
    move-object v0, p4

    const-string v1, ""

    invoke-virtual {p4, v6}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    new-instance v5, Lo/ber$1;

    invoke-direct {v5, p0, p1, p2, p3}, Lo/ber$1;-><init>(Lo/ber;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 222
    return-void
.end method

.method public static e(JJ)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 76
    new-instance v0, Lo/ber$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/ber$4;-><init>(JJ)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 258
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->g(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 259
    return-void
.end method

.method public b(Lo/beu;)V
    .locals 2

    .line 45
    iget-object v0, p1, Lo/beu;->q:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 47
    iget-object v0, p1, Lo/beu;->t:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lo/beu;->q:Landroid/widget/LinearLayout;

    .line 48
    iget-object v0, p1, Lo/beu;->q:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->chat_time_text:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lo/beu;->s:Landroid/widget/TextView;

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p1, Lo/beu;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 54
    :goto_0
    return-void
.end method

.method public c(JJ)V
    .locals 2

    .line 64
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p3, p4}, Lo/ber;->e(JJ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 65
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/user/User;Landroid/widget/ImageView;)V
    .locals 6

    .line 269
    if-eqz p1, :cond_0

    .line 271
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    move-object v2, p2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 272
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 271
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 276
    :cond_0
    invoke-static {}, Lo/bbq;->d()I

    move-result v0

    invoke-static {p2, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 278
    :goto_0
    return-void
.end method

.method public c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 7

    .line 161
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 163
    iget-object v0, p1, Lo/beu;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    iget-object v0, p1, Lo/beu;->l:Landroid/widget/ProgressBar;

    invoke-direct {p0, v0}, Lo/ber;->a(Landroid/widget/ProgressBar;)V

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 168
    iget-object v0, p1, Lo/beu;->p:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 169
    iget-object v0, p1, Lo/beu;->l:Landroid/widget/ProgressBar;

    invoke-direct {p0, v0}, Lo/ber;->d(Landroid/widget/ProgressBar;)V

    goto :goto_0

    .line 171
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 173
    iget-object v0, p1, Lo/beu;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 174
    iget-object v0, p1, Lo/beu;->l:Landroid/widget/ProgressBar;

    invoke-direct {p0, v0}, Lo/ber;->d(Landroid/widget/ProgressBar;)V

    .line 175
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 177
    iget-object v0, p1, Lo/beu;->p:Landroid/widget/ImageView;

    new-instance v1, Lo/ber$5;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lo/ber$5;-><init>(Lo/ber;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 195
    :cond_2
    iget-object v0, p1, Lo/beu;->p:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 196
    iget-object v0, p1, Lo/beu;->l:Landroid/widget/ProgressBar;

    invoke-direct {p0, v0}, Lo/ber;->d(Landroid/widget/ProgressBar;)V

    .line 198
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 112
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 114
    move-object v2, p1

    .line 116
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {v2}, Lo/ber;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 121
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 123
    :cond_1
    :goto_0
    return-void
.end method
