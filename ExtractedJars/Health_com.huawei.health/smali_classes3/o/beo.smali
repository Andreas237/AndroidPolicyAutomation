.class public Lo/beo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field protected b:Landroid/view/LayoutInflater;

.field public c:Lo/bfa;

.field protected d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

.field private e:I

.field private i:Lo/ber;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 57
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/beo;->b:Landroid/view/LayoutInflater;

    .line 58
    iput-object p2, p0, Lo/beo;->c:Lo/bfa;

    .line 60
    new-instance v0, Lo/ber;

    invoke-direct {v0}, Lo/ber;-><init>()V

    iput-object v0, p0, Lo/beo;->i:Lo/ber;

    .line 63
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/beo;->e:I

    .line 64
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/beo;->a:I

    .line 65
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 360
    if-nez p1, :cond_0

    .line 362
    return-void

    .line 365
    :cond_0
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 367
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    iget-object v3, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->w()Z

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Landroid/app/Activity;JZ)V

    goto :goto_0

    .line 371
    :cond_1
    new-instance v0, Lo/bep;

    invoke-direct {v0}, Lo/bep;-><init>()V

    iget-object v1, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v1, p1}, Lo/bep;->d(Landroid/app/Activity;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 373
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 1

    .line 496
    if-eqz p2, :cond_0

    .line 498
    iget-object v0, p0, Lo/beo;->c:Lo/bfa;

    invoke-interface {v0, p1}, Lo/bfa;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 502
    :cond_0
    iget-object v0, p0, Lo/beo;->c:Lo/bfa;

    invoke-interface {v0, p1}, Lo/bfa;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 504
    :goto_0
    return-void
.end method

.method private a(I)Z
    .locals 1

    .line 172
    invoke-static {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isTipMessage(I)Z

    move-result v0

    return v0
.end method

.method private b(JJ)V
    .locals 1

    .line 350
    iget-object v0, p0, Lo/beo;->i:Lo/ber;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/ber;->c(JJ)V

    .line 351
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;Landroid/widget/ImageView;)V
    .locals 1

    .line 339
    iget-object v0, p0, Lo/beo;->i:Lo/ber;

    invoke-virtual {v0, p1, p2}, Lo/ber;->c(Lcom/huawei/health/sns/model/user/User;Landroid/widget/ImageView;)V

    .line 340
    return-void
.end method

.method static synthetic c(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lo/beo;->h(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 4

    .line 124
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 126
    :cond_0
    return-void

    .line 129
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSpecFlag()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/beo;->a(I)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getLastMsgType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/beo;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 132
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 133
    instance-of v0, v2, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_2

    .line 135
    move-object v3, v2

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 136
    iget v0, p0, Lo/beo;->e:I

    div-int/lit8 v0, v0, 0x2

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 137
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    instance-of v0, v2, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_3

    .line 141
    move-object v3, v2

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 142
    iget v0, p0, Lo/beo;->e:I

    div-int/lit8 v0, v0, 0x2

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 143
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    :cond_3
    :goto_0
    goto :goto_1

    .line 146
    :cond_4
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_6

    .line 148
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 149
    instance-of v0, v2, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v0, :cond_5

    .line 151
    move-object v3, v2

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 152
    iget v0, p0, Lo/beo;->e:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/beo;->a:I

    add-int/2addr v0, v1

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 153
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    goto :goto_1

    .line 155
    :cond_5
    instance-of v0, v2, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v0, :cond_6

    .line 157
    move-object v3, v2

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 158
    iget v0, p0, Lo/beo;->e:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/beo;->a:I

    add-int/2addr v0, v1

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 159
    iget-object v0, p2, Lo/beu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    :cond_6
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/beo;JJ)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3, p4}, Lo/beo;->b(JJ)V

    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Ljava/lang/String;)V
    .locals 2

    .line 290
    iget-object v0, p2, Lo/beu;->o:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 293
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 297
    iget-object v0, p2, Lo/beu;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    iget-object v0, p2, Lo/beu;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 302
    :cond_0
    iget-object v0, p2, Lo/beu;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 305
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    return-void
.end method

.method private h(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 3

    .line 315
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 317
    invoke-direct {p0, p1}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_2

    .line 321
    :cond_0
    iget-object v1, p2, Lo/beu;->n:Landroid/widget/CheckBox;

    .line 322
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 324
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    .line 325
    if-nez v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 326
    if-nez v2, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, p1, v0}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 329
    :cond_3
    :goto_2
    return-void
.end method

.method private k(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 2

    .line 218
    iget-object v0, p2, Lo/beu;->m:Landroid/widget/ImageView;

    new-instance v1, Lo/beo$3;

    invoke-direct {v1, p0, p1, p2}, Lo/beo$3;-><init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    iget-object v0, p2, Lo/beu;->m:Landroid/widget/ImageView;

    new-instance v1, Lo/beo$4;

    invoke-direct {v1, p0, p1}, Lo/beo$4;-><init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 243
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 1

    .line 460
    new-instance v0, Lo/beo$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/beo$2;-><init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 474
    return-void
.end method

.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 2

    .line 254
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p2, Lo/beu;->n:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto :goto_0

    .line 260
    :cond_0
    iget-object v0, p2, Lo/beu;->n:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 261
    iget-object v0, p2, Lo/beu;->n:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/beo;->c:Lo/bfa;

    invoke-interface {v1, p1}, Lo/bfa;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 265
    :goto_0
    iget-object v0, p2, Lo/beu;->n:Landroid/widget/CheckBox;

    new-instance v1, Lo/beo$1;

    invoke-direct {v1, p0, p1, p2}, Lo/beo$1;-><init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 279
    return-void
.end method

.method protected b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 5

    .line 183
    invoke-virtual {p0, p1, p2}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 185
    const/4 v2, 0x0

    .line 186
    const/4 v3, 0x0

    .line 188
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->p()Lo/arn;

    move-result-object v4

    .line 189
    if-eqz v4, :cond_0

    .line 191
    invoke-virtual {v4, p1}, Lo/arn;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 192
    if-eqz v3, :cond_0

    .line 194
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 198
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 200
    invoke-direct {p0, p1, p2, v2}, Lo/beo;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Ljava/lang/String;)V

    .line 203
    :cond_1
    iget-object v0, p2, Lo/beu;->m:Landroid/widget/ImageView;

    invoke-direct {p0, v3, v0}, Lo/beo;->b(Lcom/huawei/health/sns/model/user/User;Landroid/widget/ImageView;)V

    .line 205
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 206
    invoke-direct {p0, p1, p2}, Lo/beo;->k(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 208
    :cond_2
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 513
    iget-object v0, p0, Lo/beo;->i:Lo/ber;

    invoke-virtual {v0, p1}, Lo/ber;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 514
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V
    .locals 2

    .line 485
    new-instance v0, Lo/bes;

    invoke-direct {v0}, Lo/bes;-><init>()V

    iget-object v1, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v1, p1, p2}, Lo/bes;->e(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V

    .line 486
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 1

    .line 406
    new-instance v0, Lo/beo$5;

    invoke-direct {v0, p0, p3, p1}, Lo/beo$5;-><init>(Lo/beo;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 429
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 3

    .line 440
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_2

    .line 442
    iget-object v1, p2, Lo/beu;->n:Landroid/widget/CheckBox;

    .line 443
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 445
    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    .line 446
    if-nez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 447
    if-nez v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, p1, v0}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 450
    :cond_2
    return-void
.end method

.method protected c(Lo/axq;)V
    .locals 2

    .line 524
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_0

    .line 526
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    check-cast v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {p1}, Lo/axq;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Ljava/lang/String;)V

    .line 528
    :cond_0
    return-void
.end method

.method protected c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 383
    iget-object v0, p0, Lo/beo;->c:Lo/bfa;

    invoke-interface {v0}, Lo/bfa;->b()Z

    move-result v2

    .line 384
    iget-object v0, p0, Lo/beo;->i:Lo/ber;

    iget-object v1, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, p1, p2, v2, v1}, Lo/ber;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V

    .line 385
    return-void
.end method

.method protected e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 6

    .line 77
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSpecFlag()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    const/16 v1, -0x16dc

    if-eq v0, v1, :cond_2

    .line 79
    iget-object v0, p0, Lo/beo;->i:Lo/ber;

    invoke-virtual {v0, p2}, Lo/ber;->b(Lo/beu;)V

    .line 80
    iget-object v0, p2, Lo/beu;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bog;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    .line 82
    iget-object v0, p2, Lo/beu;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    iget-object v0, p2, Lo/beu;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 85
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/beo;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    iget v0, p0, Lo/beo;->e:I

    iget v1, p0, Lo/beo;->a:I

    neg-int v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v0, v3, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 93
    :cond_0
    iget v0, p0, Lo/beo;->e:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v1, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 96
    :goto_0
    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/beo;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 98
    iget v0, p0, Lo/beo;->e:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/beo;->a:I

    add-int/2addr v0, v1

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 100
    :cond_1
    iget-object v0, p2, Lo/beu;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    goto :goto_1

    .line 105
    :cond_2
    iget-object v0, p2, Lo/beu;->q:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 107
    iget-object v0, p2, Lo/beu;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 108
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 109
    iget-object v0, p2, Lo/beu;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 113
    :cond_3
    :goto_1
    invoke-direct {p0, p1, p2}, Lo/beo;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 114
    return-void
.end method
