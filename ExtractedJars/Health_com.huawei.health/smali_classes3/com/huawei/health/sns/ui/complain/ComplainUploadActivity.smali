.class public Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;,
        Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;,
        Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$e;,
        Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$a;
    }
.end annotation


# static fields
.field private static final g:Ljava/lang/String;


# instance fields
.field private f:J

.field private h:I

.field private k:I

.field private l:Landroid/widget/RelativeLayout;

.field private m:Ljava/lang/String;

.field private n:J

.field private o:Landroid/widget/TextView;

.field private p:Ljava/lang/String;

.field private q:I

.field private r:Landroid/widget/TextView;

.field private s:I

.field private t:Lo/bfr;

.field private u:Landroid/widget/GridView;

.field private v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field

.field private x:Lo/bio;

.field private y:Landroid/os/Handler;

.field private z:Lo/egd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 199
    new-instance v0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$a;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->y:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 1

    .line 318
    new-instance v0, Lo/bfr;

    invoke-direct {v0, p0}, Lo/bfr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    .line 319
    return-void
.end method

.method private a(I)V
    .locals 3

    .line 763
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 764
    const-class v0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 765
    const-string v0, "totalList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v1}, Lo/bfr;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 766
    const-string v0, "position"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 767
    const/16 v0, 0x102

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 768
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->r()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    return-object p1
.end method

.method private b()V
    .locals 3

    .line 323
    sget v0, Lcom/huawei/android/sns/R$id;->grid_pic_envidence:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u:Landroid/widget/GridView;

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u:Landroid/widget/GridView;

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$c;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 326
    sget v0, Lcom/huawei/android/sns/R$id;->msg_selecter_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->l:Landroid/widget/RelativeLayout;

    .line 327
    sget v0, Lcom/huawei/android/sns/R$id;->complain_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->o:Landroid/widget/TextView;

    .line 328
    sget v0, Lcom/huawei/android/sns/R$id;->complain_pic_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->r:Landroid/widget/TextView;

    .line 329
    sget v0, Lcom/huawei/android/sns/R$id;->upload_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->z:Lo/egd;

    .line 330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->z:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 332
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->h()V

    .line 333
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 2

    .line 549
    const-string v0, "selectedList"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 550
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 552
    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->b(Ljava/util/ArrayList;)V

    .line 554
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->m()V

    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 644
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0}, Lo/bfr;->d()Ljava/util/ArrayList;

    move-result-object v3

    .line 645
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 647
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v4, :cond_1

    .line 649
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfr$c;

    invoke-virtual {v0}, Lo/bfr$c;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 651
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfr$c;

    invoke-virtual {v0}, Lo/bfr$c;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    .line 652
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 647
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 656
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 658
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x9

    if-lt v0, v1, :cond_2

    .line 661
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 662
    goto :goto_2

    .line 664
    :cond_2
    new-instance v0, Lo/bfr$c;

    sget-object v1, Lo/bfr$c$c;->a:Lo/bfr$c$c;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/bfr$c;-><init>(Lo/bfr$c$c;I)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    goto :goto_1

    .line 666
    :cond_3
    :goto_2
    new-instance v0, Lo/bfr$c;

    sget-object v1, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bfr$c;-><init>(Lo/bfr$c$c;I)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0, v3}, Lo/bfr;->a(Ljava/util/ArrayList;)V

    .line 668
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u()V

    .line 669
    return-void
.end method

.method private c()V
    .locals 2

    .line 309
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 310
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 314
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;II)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->e(II)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d(ILo/bfr$c;)V
    .locals 2

    .line 778
    invoke-virtual {p2}, Lo/bfr$c;->d()Lo/bfr$c$c;

    move-result-object v0

    sget-object v1, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    if-ne v0, v1, :cond_0

    .line 780
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->w()V

    goto :goto_0

    .line 782
    :cond_0
    invoke-virtual {p2}, Lo/bfr$c;->d()Lo/bfr$c$c;

    move-result-object v0

    sget-object v1, Lo/bfr$c$c;->a:Lo/bfr$c$c;

    if-ne v0, v1, :cond_1

    .line 784
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->a(I)V

    .line 786
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 3

    .line 427
    const-string v0, "bundle_data"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    .line 428
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->s()V

    .line 429
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 430
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->e(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;ILo/bfr$c;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(ILo/bfr$c;)V

    return-void
.end method

.method private e()V
    .locals 4

    .line 269
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 270
    if-eqz v2, :cond_6

    .line 272
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 273
    if-nez v3, :cond_0

    .line 275
    return-void

    .line 277
    :cond_0
    const-string v0, "user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    const-string v0, "user_id"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->f:J

    .line 281
    :cond_1
    const-string v0, "user_name"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    const-string v0, "user_name"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->p:Ljava/lang/String;

    .line 285
    :cond_2
    const-string v0, "chat_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 287
    const-string v0, "chat_type"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->h:I

    .line 289
    :cond_3
    const-string v0, "chat_category"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 291
    const-string v0, "chat_category"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->k:I

    .line 293
    :cond_4
    const-string v0, "complain_target"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 295
    const-string v0, "complain_target"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->n:J

    .line 297
    :cond_5
    const-string v0, "complain_target_info"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 299
    const-string v0, "complain_target_info"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->m:Ljava/lang/String;

    .line 302
    :cond_6
    return-void
.end method

.method private e(I)V
    .locals 1

    .line 510
    const/4 v0, -0x3

    if-ne p1, v0, :cond_0

    .line 512
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->l()V

    .line 513
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->n()V

    .line 515
    :cond_0
    return-void
.end method

.method private e(II)V
    .locals 2

    .line 536
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->y:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 537
    iput p1, v1, Landroid/os/Message;->what:I

    .line 538
    iput p2, v1, Landroid/os/Message;->arg1:I

    .line 539
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->y:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 540
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 7

    .line 561
    const-string v0, "totalList"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 562
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 564
    :cond_0
    return-void

    .line 566
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0}, Lo/bfr;->d()Ljava/util/ArrayList;

    move-result-object v3

    .line 567
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 569
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v6, :cond_3

    .line 571
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/bfr$c;

    invoke-virtual {v1}, Lo/bfr$c;->c()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 573
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 569
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 576
    :cond_3
    goto :goto_0

    .line 577
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0, v3}, Lo/bfr;->a(Ljava/util/ArrayList;)V

    .line 578
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u()V

    .line 579
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->o()V

    return-void
.end method

.method private g()V
    .locals 5

    .line 390
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 391
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 392
    const-string v0, "user_id"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->n:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 393
    const-string v0, "complain_type"

    iget v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->h:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 394
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 395
    const/4 v0, 0x1

    invoke-virtual {p0, v3, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 396
    return-void
.end method

.method private h()V
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->z:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 344
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Lo/bfr;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 372
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$e;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 373
    return-void
.end method

.method private l()V
    .locals 2

    .line 522
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    invoke-virtual {v0}, Lo/apl;->c()V

    .line 523
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 525
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 527
    :cond_0
    return-void
.end method

.method private m()V
    .locals 6

    .line 604
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_over_msg_toast:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 605
    const/4 v0, 0x0

    invoke-static {p0, v5, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 606
    return-void
.end method

.method private n()V
    .locals 2

    .line 613
    sget v0, Lcom/huawei/android/sns/R$string;->sns_not_enough_space:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 614
    return-void
.end method

.method private o()V
    .locals 6

    .line 594
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_over_pic_toast:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 595
    const/16 v3, 0x9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 594
    const/16 v3, 0x9

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 596
    const/4 v0, 0x0

    invoke-static {p0, v5, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 597
    return-void
.end method

.method private p()V
    .locals 0

    .line 587
    return-void
.end method

.method private q()V
    .locals 5

    .line 716
    new-instance v4, Lo/ars;

    invoke-direct {v4}, Lo/ars;-><init>()V

    .line 718
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->f:J

    iget-object v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->p:Ljava/lang/String;

    invoke-virtual {v4, v0, v1, v2}, Lo/ars;->c(JLjava/lang/String;)V

    .line 720
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->n:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->m:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lo/ars;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->h:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 726
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->k:I

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Lo/ars;->b(II)V

    goto :goto_0

    .line 730
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->h:I

    iget v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->k:I

    invoke-virtual {v4, v0, v1}, Lo/ars;->b(II)V

    .line 733
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q:I

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t()I

    move-result v1

    iget v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->s:I

    iget-object v3, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v3}, Lo/bfr;->b()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v4, v0, v1, v2, v3}, Lo/ars;->a(IIILjava/util/ArrayList;)V

    .line 734
    new-instance v0, Lo/arz;

    new-instance v1, Lo/bfv;

    new-instance v2, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    invoke-direct {v1, p0, v2}, Lo/bfv;-><init>(Landroid/app/Activity;Lo/bft;)V

    invoke-direct {v0, p0, v1, v4}, Lo/arz;-><init>(Landroid/content/Context;Lo/bqu;Lo/ars;)V

    .line 744
    invoke-virtual {v0}, Lo/arz;->e()V

    .line 745
    return-void
.end method

.method private r()V
    .locals 2

    .line 633
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->x:Lo/bio;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 635
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->x:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 637
    :cond_0
    return-void
.end method

.method private s()V
    .locals 4

    .line 621
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->x:Lo/bio;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 623
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->x:Lo/bio;

    .line 625
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->x:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 626
    return-void
.end method

.method private t()I
    .locals 5

    .line 696
    const/4 v2, 0x0

    .line 697
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 699
    return v2

    .line 701
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 703
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 705
    add-int/lit8 v2, v2, 0x1

    .line 707
    :cond_1
    goto :goto_0

    .line 708
    :cond_2
    return v2
.end method

.method private u()V
    .locals 8

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 678
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q:I

    .line 680
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0}, Lo/bfr;->notifyDataSetChanged()V

    .line 682
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->t:Lo/bfr;

    invoke-virtual {v0}, Lo/bfr;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->s:I

    .line 684
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->z:Lo/egd;

    iget v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q:I

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 685
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_complain_upload_msg_num:I

    iget v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 686
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 687
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_complain_upload_pic_num:I

    iget v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->s:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->s:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 688
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 689
    return-void
.end method

.method private w()V
    .locals 3

    .line 752
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 753
    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 754
    const-string v0, "isSingle"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 755
    const/16 v0, 0x101

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 756
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 338
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d:Landroid/view/View;

    .line 339
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 401
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 402
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 404
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Landroid/content/Intent;)V

    goto :goto_0

    .line 406
    :cond_0
    const/16 v0, 0x101

    if-ne p1, v0, :cond_1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 408
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->b(Landroid/content/Intent;)V

    goto :goto_0

    .line 410
    :cond_1
    const/16 v0, 0x102

    if-ne p1, v0, :cond_2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 412
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->e(Landroid/content/Intent;)V

    goto :goto_0

    .line 414
    :cond_2
    const/16 v0, 0x102

    if-ne p1, v0, :cond_3

    if-nez p2, :cond_3

    .line 416
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->p()V

    .line 418
    :cond_3
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 349
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 350
    sget v0, Lcom/huawei/android/sns/R$id;->msg_selecter_container:I

    if-ne v1, v0, :cond_0

    .line 352
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->g()V

    goto :goto_0

    .line 354
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->upload_btn:I

    if-ne v1, v0, :cond_1

    .line 356
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->q()V

    .line 358
    :cond_1
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 807
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 808
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->h()V

    .line 809
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 255
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 256
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_complain_upload_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->setContentView(I)V

    .line 257
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->e()V

    .line 258
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c()V

    .line 259
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->a()V

    .line 260
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->b()V

    .line 261
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->u()V

    .line 262
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 363
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->k()V

    .line 364
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 365
    return-void
.end method
