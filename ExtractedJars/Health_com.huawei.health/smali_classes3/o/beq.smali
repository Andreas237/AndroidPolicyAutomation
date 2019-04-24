.class public Lo/beq;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/beq$e;
    }
.end annotation


# instance fields
.field private e:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 43
    iput-object p1, p0, Lo/beq;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 44
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

    instance-of v0, v0, Lo/beq$e;

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/beq$e;

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p0, Lo/beq;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_text_right_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 130
    new-instance v3, Lo/beq$e;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/beq$e;-><init>(Lo/beq$1;)V

    .line 132
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 134
    invoke-static {v3, p1}, Lo/beq$e;->c(Lo/beq$e;Landroid/view/View;)V

    .line 136
    iget-object v0, v3, Lo/beq$e;->d:Landroid/widget/TextView;

    invoke-static {}, Lo/aoz$d;->b()Lo/aoz$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 138
    :goto_0
    iget-object v0, v3, Lo/beq$e;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_chat_right_selector_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 139
    iget-object v0, v3, Lo/beq$e;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/beq;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_white_100:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 140
    invoke-virtual {p0, v3, p2}, Lo/beq;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 141
    invoke-direct {p0, p1, v3, p2}, Lo/beq;->c(Landroid/view/View;Lo/beq$e;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 142
    return-object p1
.end method

.method private c(Landroid/view/View;Lo/beq$e;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 5

    .line 155
    invoke-virtual {p0, p3, p2}, Lo/beq;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 157
    invoke-virtual {p0, p3, p2}, Lo/beq;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 158
    invoke-virtual {p0, p3, p1, p2}, Lo/beq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 159
    iget-object v0, p2, Lo/beq$e;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p3, v0, p2}, Lo/beq;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 160
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 162
    const/4 v3, 0x0

    .line 163
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentSpannableString()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_0

    .line 165
    const/4 v4, 0x0

    .line 167
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/bgh$c;->a:Lo/bgh$c;

    invoke-virtual {v0, v1, v2}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 169
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    invoke-static {v4, v0}, Lo/apc;->e(Landroid/text/SpannableStringBuilder;I)Landroid/text/SpannableStringBuilder;

    move-result-object v4

    .line 170
    move-object v3, v4

    .line 171
    invoke-virtual {p3, v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentSpannableString(Ljava/lang/CharSequence;)V

    .line 172
    goto :goto_0

    .line 175
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentSpannableString()Ljava/lang/CharSequence;

    move-result-object v3

    .line 177
    :goto_0
    iget-object v0, p2, Lo/beq$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p2, Lo/beq$e;->d:Landroid/widget/TextView;

    new-instance v1, Lo/beq$1;

    invoke-direct {v1, p0, p3, p2}, Lo/beq$1;-><init>(Lo/beq;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beq$e;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 201
    :cond_1
    return-void
.end method

.method private d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/beq$e;

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/beq$e;

    goto :goto_0

    .line 89
    :cond_0
    iget-object v0, p0, Lo/beq;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_text_left_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 90
    new-instance v3, Lo/beq$e;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/beq$e;-><init>(Lo/beq$1;)V

    .line 92
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 94
    invoke-static {v3, p1}, Lo/beq$e;->a(Lo/beq$e;Landroid/view/View;)V

    .line 96
    iget-object v0, v3, Lo/beq$e;->d:Landroid/widget/TextView;

    invoke-static {}, Lo/aoz$d;->b()Lo/aoz$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 98
    :goto_0
    iget-object v0, p0, Lo/beq;->e:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, v3, Lo/beq$e;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_assist_text_layout_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_1

    .line 104
    :cond_1
    iget-object v0, v3, Lo/beq$e;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_chat_left_selector_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 106
    :goto_1
    invoke-virtual {p0, p2}, Lo/beq;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 107
    invoke-direct {p0, p1, v3, p2}, Lo/beq;->c(Landroid/view/View;Lo/beq$e;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 108
    return-object p1
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 55
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 57
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 62
    invoke-direct {p0, p2, p1, p3}, Lo/beq;->d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 64
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 66
    invoke-direct {p0, p2, p1, p3}, Lo/beq;->c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 68
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
