.class public Lo/bem;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bem$a;,
        Lo/bem$e;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 38
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bem$a;

    .line 88
    sget v0, Lcom/huawei/android/sns/R$id;->sns_text_context:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bem$a;->b:Landroid/widget/TextView;

    .line 89
    return-void
.end method

.method private b(Landroid/widget/TextView;)V
    .locals 10

    .line 119
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 120
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 121
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 122
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    iget-object v0, p0, Lo/bem;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 123
    invoke-static {}, Lo/bom;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_button_text_nomal:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/huawei/android/sns/R$color;->sns_ya_lan:I

    .line 122
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v5, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 124
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    iget-object v0, p0, Lo/bem;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_button_text_pressed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v6, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 126
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_reconnect_dialog_button:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 127
    invoke-virtual {v2, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 128
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int v9, v8, v0

    .line 129
    const/16 v0, 0x21

    invoke-virtual {v3, v5, v8, v9, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 130
    const/16 v0, 0x21

    invoke-virtual {v4, v6, v8, v9, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 131
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    new-instance v0, Lo/bem$2;

    invoke-direct {v0, p0}, Lo/bem$2;-><init>(Lo/bem;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    new-instance v0, Lo/bem$e;

    invoke-direct {v0, p1, v3, v4}, Lo/bem$e;-><init>(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;Landroid/text/SpannableStringBuilder;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 148
    return-void
.end method

.method private b(Lo/bem$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 99
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 101
    iget-object v0, p1, Lo/bem$a;->b:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p1, Lo/bem$a;->b:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lo/bem;->b(Landroid/widget/TextView;)V

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 106
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_content_type_unknow_text:I

    .line 107
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 108
    iget-object v0, p1, Lo/bem$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
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

    instance-of v0, v0, Lo/bem$a;

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bem$a;

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Lo/bem;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_add_friend_message_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 68
    new-instance v3, Lo/bem$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bem$a;-><init>(Lo/bem$2;)V

    .line 70
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 72
    invoke-direct {p0, p1}, Lo/bem;->a(Landroid/view/View;)V

    .line 76
    :goto_0
    invoke-direct {p0, v3, p2}, Lo/bem;->b(Lo/bem$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 77
    return-object p1
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 49
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_0
    invoke-direct {p0, p2, p1, p3}, Lo/bem;->e(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
