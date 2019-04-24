.class public Lo/bga;
.super Landroid/widget/CursorAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bga$e;,
        Lo/bga$d;
    }
.end annotation


# instance fields
.field private b:Lo/bga$d;

.field private final c:Landroid/view/LayoutInflater;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;Z)V
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    .line 52
    const/4 v0, -0x1

    iput v0, p0, Lo/bga;->e:I

    .line 64
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bga;->c:Landroid/view/LayoutInflater;

    .line 65
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_chat_silence_for_emuifive:I

    iput v0, p0, Lo/bga;->e:I

    .line 66
    return-void
.end method

.method private final a(Landroid/view/View;Lo/bga$e;)Lo/bga$e;
    .locals 2

    .line 312
    invoke-static {p2, p1}, Lo/bga$e;->e(Lo/bga$e;Landroid/view/View;)Landroid/view/View;

    .line 313
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_images:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p2, v0}, Lo/bga$e;->e(Lo/bga$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 314
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lo/bga$e;->c(Lo/bga$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 315
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_log:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lo/bga$e;->e(Lo/bga$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 316
    sget v0, Lcom/huawei/android/sns/R$id;->sending_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p2, v0}, Lo/bga$e;->a(Lo/bga$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 317
    sget v0, Lcom/huawei/android/sns/R$id;->failed_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p2, v0}, Lo/bga$e;->d(Lo/bga$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 318
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lo/bga$e;->a(Lo/bga$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 319
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_unreadnum:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnj;

    invoke-static {p2, v0}, Lo/bga$e;->c(Lo/bga$e;Lo/bnj;)Lo/bnj;

    .line 320
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_unreadnum_unremind:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lo/bga$e;->b(Lo/bga$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 321
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_is_remind:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p2, v0}, Lo/bga$e;->c(Lo/bga$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 322
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_is_top:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p2, v0}, Lo/bga$e;->b(Lo/bga$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 323
    invoke-static {p2}, Lo/bga$e;->k(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    iget v1, p0, Lo/bga;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 324
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 325
    return-object p2
.end method

.method private a(Lo/bga$e;Lo/axv;)V
    .locals 4

    .line 117
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 118
    :cond_0
    return-void

    .line 120
    :cond_1
    new-instance v2, Lo/bfy;

    invoke-direct {v2}, Lo/bfy;-><init>()V

    .line 122
    invoke-direct {p0, p1}, Lo/bga;->e(Lo/bga$e;)V

    .line 124
    invoke-virtual {p2}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 126
    invoke-virtual {v2, p1, p2}, Lo/bfy;->e(Lo/bga$e;Lo/axv;)V

    goto :goto_0

    .line 128
    :cond_2
    invoke-virtual {p2}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 130
    .line 131
    invoke-static {p2}, Lo/bfy;->b(Lo/axv;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 133
    invoke-virtual {p2}, Lo/axv;->u()I

    move-result v0

    if-lez v0, :cond_3

    .line 135
    invoke-virtual {v2, p1, p2, v3}, Lo/bfy;->e(Lo/bga$e;Lo/axv;Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 139
    :cond_3
    invoke-virtual {p2}, Lo/axv;->t()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 141
    invoke-virtual {v2, p1, p2}, Lo/bfy;->b(Lo/bga$e;Lo/axv;)V

    goto :goto_0

    .line 144
    :cond_4
    invoke-virtual {p2}, Lo/axv;->p()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 145
    invoke-virtual {p2}, Lo/axv;->m()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    .line 147
    invoke-virtual {v2, p1, p2, v3}, Lo/bfy;->a(Lo/bga$e;Lo/axv;Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 152
    :cond_5
    invoke-virtual {v2, p1, p2, v3}, Lo/bfy;->c(Lo/bga$e;Lo/axv;Ljava/lang/CharSequence;)V

    .line 156
    :cond_6
    :goto_0
    return-void
.end method

.method private b(Lo/bga$e;Lo/axv;)V
    .locals 3

    .line 197
    invoke-static {p1}, Lo/bga$e;->c(Lo/bga$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    invoke-virtual {p2}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    const-string v0, "ConversationAdapter"

    const-string v1, "conversation name is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-virtual {p2}, Lo/axv;->b()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/apr;->a(JZ)V

    .line 204
    :cond_0
    return-void
.end method

.method private c(Lo/bga$e;Lo/axv;)V
    .locals 2

    .line 215
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 216
    :cond_0
    return-void

    .line 220
    :cond_1
    invoke-virtual {p2}, Lo/axv;->p()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 222
    invoke-static {p1}, Lo/bga$e;->b(Lo/bga$e;)Lo/bnj;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnj;->setVisibility(I)V

    .line 223
    invoke-static {p1}, Lo/bga$e;->k(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 225
    invoke-virtual {p2}, Lo/axv;->m()I

    move-result v0

    if-nez v0, :cond_2

    .line 227
    invoke-static {p1}, Lo/bga$e;->g(Lo/bga$e;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 232
    :cond_2
    invoke-static {p1}, Lo/bga$e;->g(Lo/bga$e;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 238
    :cond_3
    invoke-static {p1}, Lo/bga$e;->k(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 239
    invoke-static {p1}, Lo/bga$e;->g(Lo/bga$e;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 241
    invoke-virtual {p2}, Lo/axv;->m()I

    move-result v0

    if-nez v0, :cond_4

    .line 243
    invoke-static {p1}, Lo/bga$e;->b(Lo/bga$e;)Lo/bnj;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnj;->setVisibility(I)V

    goto :goto_0

    .line 248
    :cond_4
    invoke-static {p1}, Lo/bga$e;->b(Lo/bga$e;)Lo/bnj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnj;->setVisibility(I)V

    .line 249
    invoke-static {p1}, Lo/bga$e;->b(Lo/bga$e;)Lo/bnj;

    move-result-object v0

    .line 250
    invoke-virtual {p2}, Lo/axv;->m()I

    move-result v1

    .line 249
    invoke-static {v1}, Lo/bfy;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bnj;->setText(Ljava/lang/String;)V

    .line 253
    :goto_0
    return-void
.end method

.method private d(Lo/bga$e;Lo/axv;)V
    .locals 2

    .line 161
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 162
    :cond_0
    return-void

    .line 165
    :cond_1
    invoke-virtual {p2}, Lo/axv;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    invoke-virtual {p2}, Lo/axv;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 167
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    invoke-static {p1}, Lo/bga$e;->a(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 173
    :cond_2
    invoke-static {p1}, Lo/bga$e;->d(Lo/bga$e;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_black_5_percent:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 178
    :cond_3
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 180
    invoke-static {p1}, Lo/bga$e;->a(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 184
    :cond_4
    invoke-static {p1}, Lo/bga$e;->d(Lo/bga$e;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_list_item_normal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 187
    :goto_0
    return-void
.end method

.method private final d(Lo/bga$e;Lo/axv;Landroid/content/Context;)V
    .locals 6

    .line 277
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 278
    :cond_0
    return-void

    .line 281
    :cond_1
    invoke-virtual {p2}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 283
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 284
    invoke-static {p1}, Lo/bga$e;->f(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2}, Lo/axv;->b()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    goto :goto_0

    .line 286
    :cond_2
    invoke-static {p1}, Lo/bga$e;->f(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_group_chat_default:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 291
    :cond_3
    invoke-virtual {p2}, Lo/axv;->b()J

    move-result-wide v0

    invoke-static {p1}, Lo/bga$e;->f(Lo/bga$e;)Landroid/widget/ImageView;

    move-result-object v2

    .line 292
    invoke-virtual {p2}, Lo/axv;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lo/axv;->e()Ljava/lang/String;

    move-result-object v4

    .line 293
    invoke-virtual {p2}, Lo/axv;->g()Ljava/lang/String;

    move-result-object v5

    .line 291
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    :goto_0
    return-void
.end method

.method private e(Lo/bga$e;)V
    .locals 2

    .line 258
    invoke-virtual {p1}, Lo/bga$e;->c()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {p1}, Lo/bga$e;->c()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 262
    :cond_0
    invoke-virtual {p1}, Lo/bga$e;->e()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 264
    invoke-virtual {p1}, Lo/bga$e;->e()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 266
    :cond_1
    return-void
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 5

    .line 71
    const/4 v3, 0x0

    .line 72
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 74
    new-instance v3, Lo/bga$e;

    invoke-direct {v3}, Lo/bga$e;-><init>()V

    .line 75
    invoke-direct {p0, p1, v3}, Lo/bga;->a(Landroid/view/View;Lo/bga$e;)Lo/bga$e;

    goto :goto_0

    .line 79
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bga$e;

    .line 82
    :goto_0
    if-nez v3, :cond_1

    .line 83
    return-void

    .line 85
    :cond_1
    invoke-static {p3}, Lo/axv;->b(Landroid/database/Cursor;)Lo/axv;

    move-result-object v4

    .line 87
    const-string v0, "ConversationAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "conversationItem:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/axv;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-virtual {p1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 91
    invoke-direct {p0, v3, v4}, Lo/bga;->b(Lo/bga$e;Lo/axv;)V

    .line 94
    invoke-virtual {v4}, Lo/axv;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 96
    invoke-static {v3}, Lo/bga$e;->e(Lo/bga$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v4}, Lo/axv;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bog;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    :cond_2
    invoke-direct {p0, v3, v4}, Lo/bga;->a(Lo/bga$e;Lo/axv;)V

    .line 101
    invoke-direct {p0, v3, v4, p2}, Lo/bga;->d(Lo/bga$e;Lo/axv;Landroid/content/Context;)V

    .line 103
    invoke-direct {p0, v3, v4}, Lo/bga;->c(Lo/bga$e;Lo/axv;)V

    .line 105
    invoke-direct {p0, v3, v4}, Lo/bga;->d(Lo/bga$e;Lo/axv;)V

    .line 107
    return-void
.end method

.method public e(Lo/bga$d;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lo/bga;->b:Lo/bga$d;

    .line 410
    return-void
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 300
    iget-object v0, p0, Lo/bga;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_conversation_item_for_single:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected onContentChanged()V
    .locals 1

    .line 415
    iget-object v0, p0, Lo/bga;->b:Lo/bga$d;

    if-eqz v0, :cond_0

    .line 417
    iget-object v0, p0, Lo/bga;->b:Lo/bga$d;

    invoke-interface {v0, p0}, Lo/bga$d;->e(Lo/bga;)V

    .line 419
    :cond_0
    return-void
.end method
