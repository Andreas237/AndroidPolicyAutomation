.class public Lo/bef;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bef$d;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 46
    return-void
.end method

.method private a(Lo/bef$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 10

    .line 112
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v2

    .line 113
    new-instance v3, Lo/axs;

    invoke-direct {v3, v2}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v3}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 115
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 117
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/axq;

    .line 118
    if-nez v5, :cond_0

    .line 120
    return-void

    .line 122
    :cond_0
    iget-object v0, p1, Lo/bef$d;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 123
    invoke-virtual {v5}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v6

    .line 124
    new-instance v7, Lo/bfe;

    invoke-direct {v7, v6}, Lo/bfe;-><init>(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lo/bef;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v7, v0}, Lo/bfe;->b(Landroid/content/Context;)Landroid/view/View;

    move-result-object v8

    .line 126
    if-eqz v8, :cond_1

    .line 128
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v9, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 129
    iget-object v0, p1, Lo/bef$d;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    :cond_1
    invoke-virtual {v5}, Lo/axq;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 134
    iget-object v0, p1, Lo/bef$d;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 135
    iget-object v0, p1, Lo/bef$d;->e:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 136
    invoke-virtual {v5}, Lo/axq;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 138
    iget-object v0, p1, Lo/bef$d;->c:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/axq;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 142
    :cond_2
    iget-object v0, p1, Lo/bef$d;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_assist_view_msg_detail:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 147
    :cond_3
    iget-object v0, p1, Lo/bef$d;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 148
    iget-object v0, p1, Lo/bef$d;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 152
    :goto_0
    iget-object v0, p1, Lo/bef$d;->u:Landroid/widget/LinearLayout;

    new-instance v1, Lo/bef$4;

    invoke-direct {v1, p0, p2, p1, v5}, Lo/bef$4;-><init>(Lo/bef;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bef$d;Lo/axq;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    :cond_4
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    .line 100
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bef$d;

    .line 101
    sget v0, Lcom/huawei/android/sns/R$id;->html_content_linearlayout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bef$d;->a:Landroid/widget/LinearLayout;

    .line 102
    sget v0, Lcom/huawei/android/sns/R$id;->detail_click_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bef$d;->d:Landroid/widget/LinearLayout;

    .line 103
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/bef$d;->t:Landroid/view/ViewStub;

    .line 104
    sget v0, Lcom/huawei/android/sns/R$id;->detail_diliver:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bef$d;->e:Landroid/widget/ImageView;

    .line 105
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/bef$d;->n:Landroid/widget/CheckBox;

    .line 106
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bef$d;->u:Landroid/widget/LinearLayout;

    .line 107
    sget v0, Lcom/huawei/android/sns/R$id;->view_detail_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bef$d;->c:Landroid/widget/TextView;

    .line 108
    return-void
.end method

.method private d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bef$d;

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bef$d;

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lo/bef;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_assistant_text_view_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 76
    new-instance v3, Lo/bef$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bef$d;-><init>(Lo/bef$4;)V

    .line 78
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 80
    invoke-direct {p0, p1}, Lo/bef;->b(Landroid/view/View;)V

    .line 83
    :goto_0
    invoke-virtual {p0, p2, v3}, Lo/bef;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 85
    invoke-virtual {p0, p2}, Lo/bef;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 86
    invoke-direct {p0, v3, p2}, Lo/bef;->a(Lo/bef$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 87
    invoke-virtual {p0, p2, p1, v3}, Lo/bef;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 88
    iget-object v0, v3, Lo/bef$d;->u:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p2, v0, v3}, Lo/bef;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 89
    invoke-virtual {p0, p2, v3}, Lo/bef;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 90
    return-object p1
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 57
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_0
    invoke-direct {p0, p2, p1, p3}, Lo/bef;->d(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
