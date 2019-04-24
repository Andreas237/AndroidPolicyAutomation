.class public Lcom/huawei/feedback/ui/j;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/j$a;
    }
.end annotation


# static fields
.field private static final d:I = 0x0

.field private static final e:I = 0x1


# instance fields
.field a:Landroid/view/LayoutInflater;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/feedback/bean/f;>;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lcom/huawei/feedback/ui/j;->c:Ljava/util/List;

    .line 47
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/j;->a:Landroid/view/LayoutInflater;

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/j;)Landroid/content/Context;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a(ILcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V
    .locals 5

    .line 216
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v3, "feedback_no_network_connection_prompt"

    .line 218
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 219
    return-void

    .line 221
    :cond_0
    invoke-virtual {p2, p1}, Lcom/huawei/feedback/bean/f;->f(I)V

    .line 222
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v3, "feedback_score_thankfulness"

    .line 224
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 223
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 225
    invoke-static {p2}, Lcom/huawei/feedback/logic/f;->b(Lcom/huawei/feedback/bean/f;)V

    .line 226
    invoke-static {p2}, Lcom/huawei/feedback/logic/f;->d(Lcom/huawei/feedback/bean/f;)V

    .line 227
    new-instance v4, Landroid/content/Intent;

    const-string v0, "UpdateRecordListBroadcast"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/a/a/b/a;->a(Landroid/content/Intent;)Z

    .line 229
    return-void
.end method

.method private a(Landroid/widget/ImageView;Ljava/lang/String;Lcom/huawei/feedback/bean/f;)V
    .locals 4

    .line 233
    .line 234
    invoke-virtual {p3}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 236
    if-eqz v3, :cond_0

    .line 238
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 239
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 240
    new-instance v0, Lcom/huawei/feedback/ui/m;

    invoke-direct {v0, p0, p2}, Lcom/huawei/feedback/ui/m;-><init>(Lcom/huawei/feedback/ui/j;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 251
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 253
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/j;ILcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/feedback/ui/j;->a(ILcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 82
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/feedback/bean/f;

    .line 54
    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 55
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 89
    const/4 v3, 0x0

    .line 90
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/bean/f;

    .line 92
    if-nez p2, :cond_2

    .line 93
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 94
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->a:Landroid/view/LayoutInflater;

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v2, "feedback_detail_list_item_right"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 95
    new-instance v3, Lcom/huawei/feedback/ui/j$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/feedback/ui/j$a;-><init>(Lcom/huawei/feedback/ui/k;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_End_content"

    .line 97
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 96
    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->a(Lcom/huawei/feedback/ui/j$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 98
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_End_date"

    .line 99
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 98
    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->b(Lcom/huawei/feedback/ui/j$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 100
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_End_img"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->a(Lcom/huawei/feedback/ui/j$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 102
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "smart_icon"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->b(Lcom/huawei/feedback/ui/j$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 103
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-nez v0, :cond_1

    .line 104
    invoke-static {v3}, Lcom/huawei/feedback/ui/j$a;->a(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v2, "feedback_personlow"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->a:Landroid/view/LayoutInflater;

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v2, "feedback_detail_list_item_left"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 109
    new-instance v3, Lcom/huawei/feedback/ui/j$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/feedback/ui/j$a;-><init>(Lcom/huawei/feedback/ui/k;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_Start_content"

    .line 111
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 110
    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->a(Lcom/huawei/feedback/ui/j$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 112
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_Start_date"

    .line 113
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 112
    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->b(Lcom/huawei/feedback/ui/j$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 114
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_Start_img"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v3, v0}, Lcom/huawei/feedback/ui/j$a;->a(Lcom/huawei/feedback/ui/j$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 127
    :cond_1
    :goto_0
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_1

    .line 129
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/feedback/ui/j$a;

    .line 131
    :goto_1
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->A()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 133
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 134
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_reply_score_land"

    .line 135
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 136
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_reply_score"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 138
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_reply_score"

    .line 139
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 140
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_reply_score_land"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 141
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 144
    :goto_2
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_score_usefull_img"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v2, "feedback_smarthelper_ic_good"

    .line 147
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_score_useless_img"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v2, "feedback_smarthelper_ic_bad"

    .line 149
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 170
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_replay_score_usefull"

    .line 171
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 172
    new-instance v0, Lcom/huawei/feedback/ui/k;

    invoke-direct {v0, p0, v4, v5}, Lcom/huawei/feedback/ui/k;-><init>(Lcom/huawei/feedback/ui/j;Lcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/feedback/ui/j;->b:Landroid/content/Context;

    const-string v1, "feedback_replay_score_useless"

    .line 183
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 184
    new-instance v0, Lcom/huawei/feedback/ui/l;

    invoke-direct {v0, p0, v4, v5}, Lcom/huawei/feedback/ui/l;-><init>(Lcom/huawei/feedback/ui/j;Lcom/huawei/feedback/bean/f;Landroid/widget/LinearLayout;)V

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    :cond_4
    invoke-static {v3}, Lcom/huawei/feedback/ui/j$a;->b(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    invoke-static {v3}, Lcom/huawei/feedback/ui/j$a;->c(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    invoke-static {v3}, Lcom/huawei/feedback/ui/j$a;->d(Lcom/huawei/feedback/ui/j$a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, v4}, Lcom/huawei/feedback/ui/j;->a(Landroid/widget/ImageView;Ljava/lang/String;Lcom/huawei/feedback/bean/f;)V

    .line 211
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 64
    const/4 v0, 0x2

    return v0
.end method
