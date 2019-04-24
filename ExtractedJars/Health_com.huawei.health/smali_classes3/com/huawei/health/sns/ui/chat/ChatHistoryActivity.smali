.class public Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;
.super Lcom/huawei/health/sns/ui/chat/ChatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$a;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Landroid/widget/TextView;

.field private C:Lo/arm;

.field private D:Landroid/widget/ListView;

.field private F:Landroid/view/View$OnClickListener;

.field private G:Landroid/view/View$OnClickListener;

.field private I:Landroid/os/Handler;

.field private j:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;-><init>()V

    .line 113
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->j:J

    .line 128
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$a;-><init>(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->I:Landroid/os/Handler;

    .line 438
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->F:Landroid/view/View$OnClickListener;

    .line 449
    new-instance v0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->G:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private A()V
    .locals 0

    .line 470
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->E()V

    .line 471
    return-void
.end method

.method private E()V
    .locals 3

    .line 478
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 480
    const-string v0, "bundle_data"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->s:Lo/bdj;

    invoke-virtual {v1}, Lo/bdj;->c()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 481
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->setResult(ILandroid/content/Intent;)V

    .line 482
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->finish()V

    .line 483
    return-void
.end method

.method private a()V
    .locals 2

    .line 315
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->D:Landroid/widget/ListView;

    .line 316
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->t()V

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->D:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->s:Lo/bdj;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->z:Lo/bfb;

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->z:Lo/bfb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bfb;->setVisibility(I)V

    .line 323
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->g()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->I:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 242
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 243
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 245
    return-void

    .line 247
    :cond_0
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Landroid/app/ActionBar;)V

    goto :goto_0

    .line 253
    :cond_1
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->e(Landroid/app/ActionBar;)V

    .line 256
    :goto_0
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 423
    if-nez p1, :cond_0

    .line 425
    return-void

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->D:Landroid/widget/ListView;

    if-eqz v0, :cond_1

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->D:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 433
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)J
    .locals 2

    .line 44
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->j:J

    return-wide v0
.end method

.method private c()V
    .locals 2

    .line 330
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->A:I

    if-nez v0, :cond_0

    .line 332
    const-string v0, "ChatHistoryActivity"

    const-string v1, "ChatHistoryActivity getChatData,complainType is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    return-void

    .line 336
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 382
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)I
    .locals 1

    .line 44
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->A:I

    return v0
.end method

.method private d(Landroid/app/ActionBar;)V
    .locals 3

    .line 289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->F:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lo/bmm;->a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->G:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 291
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Ljava/util/ArrayList;)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 408
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->s:Lo/bdj;

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->s:Lo/bdj;

    invoke-virtual {v0, p1}, Lo/bdj;->c(Ljava/util/ArrayList;)V

    .line 411
    const-string v0, "ChatHistoryActivity"

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

    .line 412
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->b(Ljava/util/ArrayList;)V

    .line 414
    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    .line 215
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 216
    if-eqz v2, :cond_2

    .line 218
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 219
    if-nez v3, :cond_0

    .line 221
    return-void

    .line 223
    :cond_0
    const-string v0, "user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    const-string v0, "user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->j:J

    .line 227
    :cond_1
    const-string v0, "complain_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 229
    const-string v0, "complain_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->A:I

    .line 234
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->o:Z

    .line 235
    return-void
.end method

.method private e(Landroid/app/ActionBar;)V
    .locals 6

    .line 265
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 266
    invoke-virtual {p1}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 267
    return-void

    .line 269
    :cond_0
    invoke-virtual {p1}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_actionbar_no_emui:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 271
    invoke-virtual {p1, v3}, Landroid/app/ActionBar;->setCustomView(Landroid/view/View;)V

    .line 273
    sget v0, Lcom/huawei/android/sns/R$id;->btn_cancel:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 274
    sget v0, Lcom/huawei/android/sns/R$id;->btn_ok:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 275
    sget v0, Lcom/huawei/android/sns/R$id;->sns_title:I

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->B:Landroid/widget/TextView;

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->B:Landroid/widget/TextView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->B:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->F:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->G:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->A()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 1

    .line 298
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->B:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    :cond_1
    :goto_0
    return-void
.end method

.method private g()V
    .locals 0

    .line 462
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->finish()V

    .line 463
    return-void
.end method

.method private k()V
    .locals 4

    .line 389
    new-instance v0, Lo/arm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/arm;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->C:Lo/arm;

    .line 391
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->A:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->C:Lo/arm;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->j:J

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1, v2}, Lo/arm;->c(IJ)V

    goto :goto_0

    .line 397
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->C:Lo/arm;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->j:J

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lo/arm;->d(IJ)V

    .line 399
    :goto_0
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    .line 489
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->setResult(ILandroid/content/Intent;)V

    .line 490
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->finish()V

    .line 491
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onBackPressed()V

    .line 492
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 504
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 505
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 201
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 202
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->e()V

    .line 203
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->b()V

    .line 204
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->a()V

    .line 205
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->c()V

    .line 206
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->k()V

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->h()V

    .line 208
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .line 498
    const/4 v0, 0x1

    return v0
.end method
