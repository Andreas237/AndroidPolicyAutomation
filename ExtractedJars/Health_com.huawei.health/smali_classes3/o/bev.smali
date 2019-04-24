.class public Lo/bev;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bev$d;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 30
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 33
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 34
    const-string v0, ""

    return-object v0

    .line 36
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 37
    const-string v0, "%02d:%02d"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    div-int/lit8 v2, v4, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    rem-int/lit8 v2, v4, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bev$d;

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bev$d;

    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, p0, Lo/bev;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_voice_left_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 88
    new-instance v3, Lo/bev$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bev$d;-><init>(Lo/bev$4;)V

    .line 90
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 92
    invoke-static {v3, p1}, Lo/bev$d;->a(Lo/bev$d;Landroid/view/View;)V

    .line 96
    :goto_0
    iget-object v0, v3, Lo/bev$d;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->chatto_voice_playing_f3:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 97
    iget-object v0, v3, Lo/bev$d;->a:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lo/bev;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getDownloadStatus()I

    move-result v4

    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    .line 102
    if-eqz v6, :cond_2

    const/4 v0, 0x2

    if-eq v4, v0, :cond_1

    const/4 v0, 0x3

    if-eq v4, v0, :cond_1

    const/4 v0, 0x6

    if-ne v4, v0, :cond_2

    .line 103
    :cond_1
    const/4 v5, 0x1

    .line 106
    :cond_2
    invoke-virtual {p0, p2, v3}, Lo/bev;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 108
    invoke-virtual {p0, p2, v3}, Lo/bev;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 109
    invoke-virtual {p0, p2}, Lo/bev;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 111
    if-eqz v6, :cond_3

    .line 113
    if-nez v4, :cond_3

    .line 114
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/aus;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 118
    :cond_3
    move-object v7, v3

    .line 119
    iget-object v0, v7, Lo/bev$d;->e:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bev$4;

    invoke-direct {v1, p0, p2, v7}, Lo/bev$4;-><init>(Lo/bev;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bev$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    invoke-direct {p0, p1, v3, p2}, Lo/bev;->c(Landroid/view/View;Lo/bev$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 134
    return-object p1
.end method

.method private c(Landroid/view/View;Lo/bev$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 139
    const-string v0, "ChatVoiceView"

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-virtual {p0, p3, p2}, Lo/bev;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 143
    invoke-virtual {p0, p3, p2}, Lo/bev;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 144
    invoke-virtual {p0, p3, p1, p2}, Lo/bev;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 145
    iget-object v0, p2, Lo/bev$d;->b:Landroid/widget/ImageView;

    invoke-virtual {p0, p3, v0, p2}, Lo/bev;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 146
    move-object v2, p2

    .line 147
    iget-object v0, v2, Lo/bev$d;->e:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bev$1;

    invoke-direct {v1, p0, p3, v2}, Lo/bev$1;-><init>(Lo/bev;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bev$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    return-void
.end method

.method private d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bev$d;

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bev$d;

    goto :goto_0

    .line 62
    :cond_0
    iget-object v0, p0, Lo/bev;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_voice_right_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 63
    new-instance v3, Lo/bev$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bev$d;-><init>(Lo/bev$4;)V

    .line 65
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 67
    invoke-static {v3, p1}, Lo/bev$d;->c(Lo/bev$d;Landroid/view/View;)V

    .line 72
    :goto_0
    iget-object v0, v3, Lo/bev$d;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->chatfrom_voice_playing_f3:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 73
    iget-object v0, v3, Lo/bev$d;->a:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lo/bev;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {p0, p2}, Lo/bev;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 76
    invoke-direct {p0, p1, v3, p2}, Lo/bev;->c(Landroid/view/View;Lo/bev$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 77
    return-object p1
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 42
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 43
    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 46
    invoke-direct {p0, p2, p1, p3}, Lo/bev;->b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 48
    :cond_1
    invoke-direct {p0, p2, p1, p3}, Lo/bev;->d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
