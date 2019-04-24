.class public Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;
.super Lcom/huawei/health/sns/ui/chat/ChatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$c;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field private D:I

.field private E:I

.field private H:Landroid/os/Handler;

.field private j:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;-><init>()V

    .line 88
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->C:J

    .line 98
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->E:I

    .line 103
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->H:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->D:I

    return v0
.end method

.method private a()V
    .locals 2

    .line 202
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->D:I

    if-nez v0, :cond_0

    .line 204
    const-string v0, "ChatRecordActivity"

    const-string v1, "ChatRecordActivity getChatData,chatType is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    return-void

    .line 208
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 262
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 345
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->s:Lo/bdj;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->s:Lo/bdj;

    invoke-virtual {v0, p1}, Lo/bdj;->c(Ljava/util/ArrayList;)V

    .line 348
    const-string v0, "ChatRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mActivity.mChatLogAdapter.getCount = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Ljava/util/ArrayList;)V

    .line 351
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->H:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 174
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 175
    if-eqz v2, :cond_3

    .line 177
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 178
    if-nez v3, :cond_0

    .line 180
    return-void

    .line 182
    :cond_0
    const-string v0, "message_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    const-string v0, "message_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->A:I

    .line 186
    :cond_1
    const-string v0, "chat_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    const-string v0, "chat_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->D:I

    .line 190
    :cond_2
    const-string v0, "user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 192
    const-string v0, "user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->C:J

    .line 195
    :cond_3
    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 319
    if-nez p1, :cond_0

    .line 321
    return-void

    .line 324
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 326
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->A:I

    if-ne v0, v1, :cond_1

    .line 328
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->B:I

    .line 330
    :cond_1
    goto :goto_0

    .line 332
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->j:Landroid/widget/ListView;

    if-eqz v0, :cond_3

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->j:Landroid/widget/ListView;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->B:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 336
    :cond_3
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;I)I
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->E:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)J
    .locals 2

    .line 36
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->C:J

    return-wide v0
.end method

.method private e()V
    .locals 2

    .line 269
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->j:Landroid/widget/ListView;

    .line 270
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->t()V

    .line 271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->s:Lo/bdj;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->z:Lo/bfb;

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->z:Lo/bfb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bfb;->setVisibility(I)V

    .line 277
    :cond_0
    return-void
.end method

.method private k()V
    .locals 4

    .line 284
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->C:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 286
    return-void

    .line 289
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 310
    return-void
.end method


# virtual methods
.method public b()I
    .locals 2

    .line 381
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->D:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 383
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->E:I

    return v0

    .line 388
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public onBackPressed()V
    .locals 2

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->u:Landroid/view/Menu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->u:Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 359
    return-void

    .line 363
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->finish()V

    .line 365
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onBackPressed()V

    .line 366
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 371
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 372
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 156
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 157
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 158
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 162
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c()V

    .line 163
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->a()V

    .line 164
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->e()V

    .line 165
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->k()V

    .line 166
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->h()V

    .line 167
    return-void
.end method
