.class public Lo/beg;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/beg$a;,
        Lo/beg$d;
    }
.end annotation


# instance fields
.field private e:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 53
    iput-object p1, p0, Lo/beg;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 54
    return-void
.end method

.method private a(Landroid/view/View;Lo/beg$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 248
    invoke-virtual {p0, p3, p2}, Lo/beg;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 250
    invoke-virtual {p0, p3, p2}, Lo/beg;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 253
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 256
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lo/beg;->a(Ljava/lang/String;Lo/beg$a;)V

    .line 259
    invoke-direct {p0, p2, p3}, Lo/beg;->c(Lo/beg$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 260
    invoke-virtual {p0, p3, p1, p2}, Lo/beg;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 261
    iget-object v0, p2, Lo/beg$a;->a:Landroid/view/View;

    invoke-virtual {p0, p3, v0, p2}, Lo/beg;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 263
    :cond_0
    return-void
.end method

.method private a(Lo/beg$a;)V
    .locals 2

    .line 165
    iget-object v0, p1, Lo/beg$a;->a:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_chat_right_socity_msg_selector:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 166
    return-void
.end method

.method private b(Lo/beg$a;)V
    .locals 3

    .line 151
    iget-object v0, p0, Lo/beg;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-static {v0}, Lo/bph;->e(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/beg;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_split_chat_card_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v2, v0

    .line 154
    iget-object v0, p1, Lo/beg$a;->a:Landroid/view/View;

    invoke-static {v0, v2}, Lo/bph;->c(Landroid/view/View;I)V

    .line 156
    :cond_0
    return-void
.end method

.method private c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 123
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/beg$a;

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/beg$a;

    .line 126
    invoke-direct {p0, v3}, Lo/beg;->c(Lo/beg$a;)V

    goto :goto_0

    .line 130
    :cond_0
    iget-object v0, p0, Lo/beg;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_card_right_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 131
    new-instance v3, Lo/beg$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/beg$a;-><init>(Lo/beg$2;)V

    .line 133
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 135
    invoke-direct {p0, p1}, Lo/beg;->d(Landroid/view/View;)V

    .line 137
    :goto_0
    invoke-direct {p0, v3}, Lo/beg;->b(Lo/beg$a;)V

    .line 138
    invoke-direct {p0, v3}, Lo/beg;->a(Lo/beg$a;)V

    .line 139
    invoke-virtual {p0, v3, p2}, Lo/beg;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 140
    invoke-direct {p0, p1, v3, p2}, Lo/beg;->a(Landroid/view/View;Lo/beg$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 141
    return-object p1
.end method

.method private c(Lo/beg$a;)V
    .locals 2

    .line 358
    iget-object v0, p1, Lo/beg$a;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 359
    iget-object v0, p1, Lo/beg$a;->l:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 360
    return-void
.end method

.method private c(Lo/beg$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 273
    iget-object v0, p1, Lo/beg$a;->a:Landroid/view/View;

    new-instance v1, Lo/beg$2;

    invoke-direct {v1, p0, p2, p1}, Lo/beg$2;-><init>(Lo/beg;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beg$a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 312
    return-void
.end method

.method private d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/beg$a;

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/beg$a;

    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lo/beg;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_card_left_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 99
    new-instance v3, Lo/beg$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/beg$a;-><init>(Lo/beg$2;)V

    .line 101
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 103
    invoke-direct {p0, p1}, Lo/beg;->e(Landroid/view/View;)V

    .line 105
    :goto_0
    invoke-virtual {p0, p2}, Lo/beg;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 106
    invoke-direct {p0, p1, v3, p2}, Lo/beg;->a(Landroid/view/View;Lo/beg$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 107
    return-object p1
.end method

.method private d(Landroid/view/View;)V
    .locals 2

    .line 339
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/beg$a;

    .line 340
    sget v0, Lcom/huawei/android/sns/R$id;->msg_content_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lo/beg$a;->a:Landroid/view/View;

    .line 341
    sget v0, Lcom/huawei/android/sns/R$id;->icon_card:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beg$a;->d:Landroid/widget/ImageView;

    .line 342
    sget v0, Lcom/huawei/android/sns/R$id;->card_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beg$a;->b:Landroid/widget/TextView;

    .line 343
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_repeat_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beg$a;->p:Landroid/widget/ImageView;

    .line 344
    sget v0, Lcom/huawei/android/sns/R$id;->chat_pic_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lo/beg$a;->l:Landroid/widget/ProgressBar;

    .line 345
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beg$a;->m:Landroid/widget/ImageView;

    .line 346
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/beg$a;->n:Landroid/widget/CheckBox;

    .line 347
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/beg$a;->t:Landroid/view/ViewStub;

    .line 348
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/beg$a;->u:Landroid/widget/LinearLayout;

    .line 349
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 2

    .line 321
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/beg$a;

    .line 322
    sget v0, Lcom/huawei/android/sns/R$id;->msg_content_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lo/beg$a;->a:Landroid/view/View;

    .line 323
    sget v0, Lcom/huawei/android/sns/R$id;->icon_card:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beg$a;->d:Landroid/widget/ImageView;

    .line 324
    sget v0, Lcom/huawei/android/sns/R$id;->card_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beg$a;->b:Landroid/widget/TextView;

    .line 325
    sget v0, Lcom/huawei/android/sns/R$id;->head_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/beg$a;->m:Landroid/widget/ImageView;

    .line 326
    sget v0, Lcom/huawei/android/sns/R$id;->chat_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/beg$a;->o:Landroid/widget/TextView;

    .line 327
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/beg$a;->n:Landroid/widget/CheckBox;

    .line 328
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/beg$a;->t:Landroid/view/ViewStub;

    .line 329
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/beg$a;->u:Landroid/widget/LinearLayout;

    .line 330
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lo/beg$a;)V
    .locals 3

    .line 176
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    new-instance v2, Lo/beg$d;

    invoke-direct {v2, p2}, Lo/beg$d;-><init>(Lo/beg$a;)V

    invoke-static {v0, v1, v2}, Lo/axb;->b(JLandroid/os/Handler;)V

    .line 178
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 65
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 67
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 71
    invoke-direct {p0, p2, p1, p3}, Lo/beg;->d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 75
    :cond_1
    invoke-direct {p0, p2, p1, p3}, Lo/beg;->c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
