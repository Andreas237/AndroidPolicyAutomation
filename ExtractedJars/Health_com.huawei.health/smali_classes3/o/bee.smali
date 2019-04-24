.class public Lo/bee;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bee$c;,
        Lo/bee$e;,
        Lo/bee$d;
    }
.end annotation


# instance fields
.field private a:J

.field private e:J

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 78
    return-void
.end method

.method static synthetic b(Lo/bee;)J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/bee;->a:J

    return-wide v0
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    .line 134
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bee$d;

    .line 135
    sget v0, Lcom/huawei/android/sns/R$id;->img_headline:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bee$d;->c:Landroid/widget/ImageView;

    .line 136
    sget v0, Lcom/huawei/android/sns/R$id;->txt_headline:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bee$d;->d:Landroid/widget/TextView;

    .line 137
    sget v0, Lcom/huawei/android/sns/R$id;->listview_subheading:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, v1, Lo/bee$d;->b:Landroid/widget/ListView;

    .line 138
    sget v0, Lcom/huawei/android/sns/R$id;->layout_pic_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v1, Lo/bee$d;->e:Landroid/widget/RelativeLayout;

    .line 139
    sget v0, Lcom/huawei/android/sns/R$id;->time_line_viewstub:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, v1, Lo/bee$d;->t:Landroid/view/ViewStub;

    .line 140
    sget v0, Lcom/huawei/android/sns/R$id;->content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bee$d;->u:Landroid/widget/LinearLayout;

    .line 142
    sget v0, Lcom/huawei/android/sns/R$id;->single_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lo/bee$d;->a:Landroid/widget/LinearLayout;

    .line 143
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_single_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bee$d;->f:Landroid/widget/TextView;

    .line 144
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_single_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bee$d;->g:Landroid/widget/TextView;

    .line 145
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_single_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lo/bee$d;->i:Landroid/widget/ImageView;

    .line 146
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_single_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bee$d;->h:Landroid/widget/TextView;

    .line 147
    sget v0, Lcom/huawei/android/sns/R$id;->view_full_text_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lo/bee$d;->k:Landroid/widget/TextView;

    .line 149
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lo/bee$d;->n:Landroid/widget/CheckBox;

    .line 150
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/axq;Landroid/view/View;Lo/beu;)V
    .locals 6

    .line 349
    new-instance v0, Lo/bee$2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/bee$2;-><init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/axq;Landroid/view/View;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 368
    return-void
.end method

.method private c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bee$d;

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bee$d;

    goto :goto_0

    .line 111
    :cond_0
    iget-object v0, p0, Lo/bee;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_assistant_headline_view_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 112
    new-instance v3, Lo/bee$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bee$d;-><init>(Lo/bee$1;)V

    .line 114
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 116
    invoke-direct {p0, p1}, Lo/bee;->b(Landroid/view/View;)V

    .line 119
    :goto_0
    invoke-virtual {p0, p2, v3}, Lo/bee;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 121
    invoke-virtual {p0, p2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 122
    invoke-direct {p0, v3, p2}, Lo/bee;->e(Lo/bee$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 123
    invoke-virtual {p0, p2, p1, v3}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 124
    return-object p1
.end method

.method static synthetic c(Lo/bee;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/bee;->h:Ljava/lang/String;

    return-object v0
.end method

.method private c(Landroid/widget/BaseAdapter;Landroid/widget/ListView;)V
    .locals 6

    .line 378
    const/4 v2, 0x0

    .line 379
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v3

    .line 380
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 382
    const/4 v0, 0x0

    invoke-virtual {p1, v4, v0, p2}, Landroid/widget/BaseAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 383
    if-eqz v5, :cond_0

    .line 385
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/View;->measure(II)V

    .line 386
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v2, v0

    .line 380
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 389
    :cond_1
    invoke-virtual {p2}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 390
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 391
    .line 392
    invoke-virtual {p2}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v0

    mul-int/2addr v0, v3

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v3, -0x1

    :goto_1
    add-int/2addr v0, v2

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 393
    invoke-virtual {p2, v4}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 394
    return-void
.end method

.method private c(Landroid/widget/ListView;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bee$e;Lo/beu;)V
    .locals 6

    .line 317
    new-instance v0, Lo/bee$5;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p4

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lo/bee$5;-><init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/bee$e;Landroid/widget/ListView;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 337
    return-void
.end method

.method private d(Landroid/view/View;Lo/axq;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 285
    new-instance v0, Lo/bee$3;

    invoke-direct {v0, p0, p4, p3, p2}, Lo/bee$3;-><init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/axq;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 304
    return-void
.end method

.method static synthetic e(Lo/bee;)J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/bee;->e:J

    return-wide v0
.end method

.method private e(Landroid/widget/ImageView;Ljava/lang/String;J)V
    .locals 0

    .line 404
    invoke-static {p1, p2, p3, p4}, Lo/bay;->b(Landroid/widget/ImageView;Ljava/lang/String;J)V

    .line 405
    return-void
.end method

.method private e(Landroid/widget/ListView;Lo/bee$e;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 254
    new-instance v0, Lo/bee$1;

    invoke-direct {v0, p0, p4, p3, p2}, Lo/bee$1;-><init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/bee$e;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 274
    return-void
.end method

.method private e(Lo/bee$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 13

    .line 154
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v6

    .line 155
    new-instance v7, Lo/axs;

    invoke-direct {v7, v6}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v7}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v8

    .line 157
    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    :cond_0
    const-string v0, "AssistantChatHeadLineView"

    const-string v1, "allMsgs == null or allMsgs is Empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    iget-object v0, p1, Lo/bee$d;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 161
    iget-object v0, p1, Lo/bee$d;->b:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 162
    return-void

    .line 164
    :cond_1
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 165
    const/4 v10, 0x0

    .line 166
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/axq;

    .line 168
    const-string v0, "headline"

    invoke-virtual {v12}, Lo/axq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    move-object v10, v12

    goto :goto_1

    .line 172
    :cond_2
    const-string v0, "subheading"

    invoke-virtual {v12}, Lo/axq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 174
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    :cond_3
    :goto_1
    goto :goto_0

    .line 178
    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 181
    iget-object v0, p1, Lo/bee$d;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 183
    if-nez v10, :cond_5

    .line 185
    iget-object v0, p1, Lo/bee$d;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_4

    .line 189
    :cond_5
    iget-object v0, p1, Lo/bee$d;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 190
    iget-object v0, p1, Lo/bee$d;->f:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    iget-object v0, p1, Lo/bee$d;->g:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bog;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    iget-object v0, p1, Lo/bee$d;->h:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/axq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    invoke-virtual {v10}, Lo/axq;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 195
    iget-object v0, p1, Lo/bee$d;->k:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/axq;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 199
    :cond_6
    iget-object v0, p1, Lo/bee$d;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_assistant_view_full:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 202
    :goto_2
    iget-object v0, p1, Lo/bee$d;->i:Landroid/widget/ImageView;

    invoke-virtual {v10}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lo/bee;->e(Landroid/widget/ImageView;Ljava/lang/String;J)V

    .line 204
    iget-object v0, p1, Lo/bee$d;->a:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0, v10, p1, p2}, Lo/bee;->d(Landroid/view/View;Lo/axq;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 206
    iget-object v0, p1, Lo/bee$d;->a:Landroid/widget/LinearLayout;

    invoke-direct {p0, p2, v10, v0, p1}, Lo/bee;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/axq;Landroid/view/View;Lo/beu;)V

    .line 207
    invoke-virtual {p0, p2, p1}, Lo/bee;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    goto/16 :goto_4

    .line 212
    :cond_7
    iget-object v0, p1, Lo/bee$d;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 213
    iget-object v0, p1, Lo/bee$d;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 216
    if-nez v10, :cond_8

    .line 218
    iget-object v0, p1, Lo/bee$d;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_3

    .line 222
    :cond_8
    iget-object v0, p1, Lo/bee$d;->e:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 223
    iget-object v0, p1, Lo/bee$d;->d:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    iget-object v0, p1, Lo/bee$d;->c:Landroid/widget/ImageView;

    invoke-virtual {v10}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lo/bee;->e(Landroid/widget/ImageView;Ljava/lang/String;J)V

    .line 227
    iget-object v0, p1, Lo/bee$d;->e:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0, v10, p1, p2}, Lo/bee;->d(Landroid/view/View;Lo/axq;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 229
    iget-object v0, p1, Lo/bee$d;->e:Landroid/widget/RelativeLayout;

    invoke-direct {p0, p2, v10, v0, p1}, Lo/bee;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/axq;Landroid/view/View;Lo/beu;)V

    .line 232
    :goto_3
    iget-object v0, p1, Lo/bee$d;->b:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 233
    new-instance v0, Lo/bee$e;

    iget-object v1, p0, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-object v2, v9

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v3

    iget-object v5, p0, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v5, v5, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    invoke-direct/range {v0 .. v5}, Lo/bee$e;-><init>(Landroid/content/Context;Ljava/util/ArrayList;JZ)V

    move-object v11, v0

    .line 234
    iget-object v0, p1, Lo/bee$d;->b:Landroid/widget/ListView;

    invoke-virtual {v0, v11}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 236
    iget-object v0, p1, Lo/bee$d;->b:Landroid/widget/ListView;

    invoke-direct {p0, v11, v0}, Lo/bee;->c(Landroid/widget/BaseAdapter;Landroid/widget/ListView;)V

    .line 238
    iget-object v0, p1, Lo/bee$d;->b:Landroid/widget/ListView;

    invoke-direct {p0, v0, v11, p1, p2}, Lo/bee;->e(Landroid/widget/ListView;Lo/bee$e;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 240
    iget-object v0, p1, Lo/bee$d;->b:Landroid/widget/ListView;

    invoke-direct {p0, v0, p2, v11, p1}, Lo/bee;->c(Landroid/widget/ListView;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bee$e;Lo/beu;)V

    .line 241
    invoke-virtual {p0, p2, p1}, Lo/bee;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 243
    :goto_4
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 0

    .line 587
    invoke-super {p0, p1, p2, p3}, Lo/beo;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 588
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 89
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    iput-wide v0, p0, Lo/bee;->a:J

    .line 95
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo/bee;->e:J

    .line 96
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bee;->h:Ljava/lang/String;

    .line 97
    invoke-direct {p0, p2, p1, p3}, Lo/bee;->c(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V
    .locals 0

    .line 557
    invoke-super {p0, p1, p2}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;)V

    .line 558
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V
    .locals 0

    .line 569
    invoke-super {p0, p1, p2, p3}, Lo/beo;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 570
    return-void
.end method

.method protected c(Lo/axq;)V
    .locals 0

    .line 563
    invoke-super {p0, p1}, Lo/beo;->c(Lo/axq;)V

    .line 564
    return-void
.end method

.method protected c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 581
    invoke-super {p0, p1, p2}, Lo/beo;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 582
    return-void
.end method

.method protected e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 593
    invoke-super {p0, p1, p2}, Lo/beo;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 594
    return-void
.end method
