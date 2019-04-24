.class public Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$c;
    }
.end annotation


# instance fields
.field private D:Landroid/view/View$OnClickListener;

.field private f:I

.field private g:J

.field private h:Ljava/lang/String;

.field private k:J

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/ListView;

.field private n:Ljava/lang/String;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/ProgressBar;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Lo/arx;

.field private v:Ljava/lang/String;

.field private w:Landroid/widget/AdapterView$OnItemClickListener;

.field private x:Ljava/lang/String;

.field private y:Landroid/os/Handler;

.field private z:Lo/bfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->u:Lo/arx;

    .line 166
    new-instance v0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$c;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->y:Landroid/os/Handler;

    .line 444
    new-instance v0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->w:Landroid/widget/AdapterView$OnItemClickListener;

    .line 483
    new-instance v0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$3;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->D:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private static a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;J)Ljava/lang/Runnable;
    .locals 1

    .line 313
    new-instance v0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;-><init>(JLcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 240
    sget v0, Lcom/huawei/android/sns/R$id;->complain_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->p:Landroid/widget/RelativeLayout;

    .line 241
    sget v0, Lcom/huawei/android/sns/R$id;->complain_cause_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->o:Landroid/widget/TextView;

    .line 242
    sget v0, Lcom/huawei/android/sns/R$id;->complain_category_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->m:Landroid/widget/ListView;

    .line 243
    sget v0, Lcom/huawei/android/sns/R$id;->complain_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->l:Landroid/widget/TextView;

    .line 244
    sget v0, Lcom/huawei/android/sns/R$id;->no_net_textview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->s:Landroid/widget/TextView;

    .line 245
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c:Landroid/widget/LinearLayout;

    .line 246
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 248
    sget v0, Lcom/huawei/android/sns/R$id;->progressBar_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->q:Landroid/widget/RelativeLayout;

    .line 249
    sget v0, Lcom/huawei/android/sns/R$id;->progressBar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->r:Landroid/widget/ProgressBar;

    .line 250
    sget v0, Lcom/huawei/android/sns/R$id;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->t:Landroid/widget/TextView;

    .line 252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->m:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->w:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->D:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    new-instance v0, Lo/bfo;

    invoke-direct {v0, p0}, Lo/bfo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->z:Lo/bfo;

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->m:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->z:Lo/bfo;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 257
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->p()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;Ljava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->e(Ljava/util/ArrayList;)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 347
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 348
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 352
    :cond_0
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .line 264
    if-eqz p1, :cond_5

    .line 266
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 267
    if-nez v2, :cond_0

    .line 269
    return-void

    .line 271
    :cond_0
    const-string v0, "complain_category_type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    const-string v0, "complain_category_type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->f:I

    .line 275
    :cond_1
    const-string v0, "complain_url_title"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 277
    const-string v0, "complain_url_title"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->v:Ljava/lang/String;

    .line 279
    :cond_2
    const-string v0, "complain_url"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 281
    const-string v0, "complain_url"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->x:Ljava/lang/String;

    .line 283
    :cond_3
    const-string v0, "complain_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 285
    const-string v0, "complain_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->g:J

    .line 287
    :cond_4
    const-string v0, "complain_info"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 289
    const-string v0, "complain_info"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->h:Ljava/lang/String;

    .line 293
    :cond_5
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->g()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->p:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 300
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->k:J

    .line 301
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->k:J

    invoke-static {p0, v1, v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;J)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 302
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Lo/bfo;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->z:Lo/bfo;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->n:Ljava/lang/String;

    .line 340
    return-void
.end method

.method private e(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;>;)V"
        }
    .end annotation

    .line 421
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 425
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->z:Lo/bfo;

    invoke-virtual {v0, p1}, Lo/bfo;->a(Ljava/util/ArrayList;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->z:Lo/bfo;

    invoke-virtual {v0}, Lo/bfo;->notifyDataSetChanged()V

    goto :goto_0

    .line 430
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->g()V

    .line 432
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->f:I

    return v0
.end method

.method private g()V
    .locals 3

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 442
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->x:Ljava/lang/String;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 359
    const-string v2, ""

    .line 360
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->f:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 363
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain_url_cause:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 364
    goto :goto_0

    .line 367
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain_user_cause:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 368
    goto :goto_0

    .line 370
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain_group_cause:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 371
    goto :goto_0

    .line 373
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain_family_cause:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 374
    .line 380
    :goto_0
    invoke-static {}, Lo/bmo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->o:Landroid/widget/TextView;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 386
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 390
    :goto_1
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->f:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    .line 392
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->e()Lo/arx;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/arx;->c(I)V

    goto :goto_2

    .line 396
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->e()Lo/arx;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->f:I

    invoke-virtual {v0, v1}, Lo/arx;->c(I)V

    .line 398
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)J
    .locals 2

    .line 49
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->g:J

    return-wide v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 502
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->r:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 506
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 508
    :cond_0
    return-void
.end method

.method private l()V
    .locals 8

    .line 542
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v5

    .line 543
    invoke-static {p0}, Lo/bmo;->b(Landroid/content/Context;)I

    move-result v6

    .line 544
    int-to-double v0, v5

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v7, v0

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->q:Landroid/widget/RelativeLayout;

    sub-int v1, v7, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 546
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)J
    .locals 2

    .line 49
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->k:J

    return-wide v0
.end method

.method private p()V
    .locals 2

    .line 515
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->r:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 521
    :cond_0
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 413
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->d:Landroid/view/View;

    .line 414
    return-void
.end method

.method public e()Lo/arx;
    .locals 2

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->u:Lo/arx;

    if-nez v0, :cond_0

    .line 532
    new-instance v0, Lo/arx;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->y:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/arx;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->u:Lo/arx;

    .line 534
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->u:Lo/arx;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 403
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 404
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/16 v0, 0x103

    if-ne p1, v0, :cond_0

    .line 406
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->finish()V

    .line 408
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 551
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 552
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->l()V

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 554
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 225
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 226
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_complain_category:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->setContentView(I)V

    .line 227
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->b(Landroid/content/Intent;)V

    .line 228
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->b()V

    .line 229
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a()V

    .line 230
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->k()V

    .line 231
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c()V

    .line 232
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->h()V

    .line 233
    return-void
.end method
