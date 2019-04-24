.class public Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private D:Z

.field private a:Lo/efy;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private c:Lo/efy;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/efy;>;"
        }
    .end annotation
.end field

.field private e:Lo/efy;

.field private f:Landroid/widget/Button;

.field private g:Lo/efy;

.field private h:Lo/efy;

.field private i:Lo/efy;

.field private k:Lo/efy;

.field private l:Lhuawei/widget/HwProgressBar;

.field private m:Landroid/widget/Button;

.field private n:Lo/emr;

.field private o:Landroid/widget/Button;

.field private p:Landroid/widget/Button;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Lo/bxi;

.field private t:Lo/efy;

.field private u:Landroid/widget/RelativeLayout;

.field private v:I

.field private w:I

.field private x:J

.field private y:Lcom/huawei/health/suggestion/model/RunPlanParams;

.field private z:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->D:Z

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .line 368
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->a:Lo/efy;

    if-ne p1, v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->a:Lo/efy;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    goto :goto_0

    .line 370
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e:Lo/efy;

    if-ne p1, v0, :cond_1

    .line 371
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e:Lo/efy;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    goto :goto_0

    .line 372
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c:Lo/efy;

    if-ne p1, v0, :cond_2

    .line 373
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c:Lo/efy;

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    goto :goto_0

    .line 374
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->h:Lo/efy;

    if-ne p1, v0, :cond_3

    .line 375
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->h:Lo/efy;

    const/4 v1, 0x3

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    goto :goto_0

    .line 376
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->k:Lo/efy;

    if-ne p1, v0, :cond_4

    .line 377
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->k:Lo/efy;

    const/4 v1, 0x4

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    goto :goto_0

    .line 378
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->g:Lo/efy;

    if-ne p1, v0, :cond_5

    .line 379
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->g:Lo/efy;

    const/4 v1, 0x5

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    goto :goto_0

    .line 380
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->i:Lo/efy;

    if-ne p1, v0, :cond_6

    .line 381
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->i:Lo/efy;

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;Lo/efy;I)V

    .line 383
    :cond_6
    :goto_0
    return-void
.end method

.method private b(J)Ljava/lang/String;
    .locals 2

    .line 321
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy.MM.dd"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 322
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 419
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 420
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/efy;

    .line 422
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/efy;->setClickable(Z)V

    .line 419
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 425
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->q:Ljava/lang/String;

    return-object v0
.end method

.method private c(Lcom/huawei/health/suggestion/model/Plan;Z)V
    .locals 5

    .line 339
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->D:Z

    .line 340
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->l:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 342
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v3

    .line 343
    if-eqz v3, :cond_0

    .line 344
    invoke-interface {v3}, Lo/brr;->e()Lo/brv;

    move-result-object v4

    .line 345
    if-eqz v4, :cond_0

    .line 346
    invoke-interface {v4}, Lo/brv;->d()V

    .line 350
    :cond_0
    if-eqz p2, :cond_1

    .line 351
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x30d4a

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 353
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 354
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x438

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(ZI)V

    .line 356
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;ILjava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(ILjava/lang/String;)V

    return-void
.end method

.method private d(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/view/View;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 408
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 410
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 411
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 415
    :cond_1
    return-object v1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Lo/efy;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->t:Lo/efy;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 116
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 3

    .line 360
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 361
    const-string v0, "plan"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 362
    const-string v0, "new_plan"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 363
    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->startActivity(Landroid/content/Intent;)V

    .line 364
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;Lcom/huawei/health/suggestion/model/Plan;Z)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c(Lcom/huawei/health/suggestion/model/Plan;Z)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->r:Ljava/lang/String;

    return-object p1
.end method

.method private e(ILjava/lang/String;)V
    .locals 2

    .line 326
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->D:Z

    .line 327
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->l:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 328
    const/16 v0, -0x194

    if-ne v0, p1, :cond_0

    .line 329
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_create_plan_no_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 330
    :cond_0
    const v0, 0x30d4a

    if-ne v0, p1, :cond_1

    .line 331
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_plan_is_exist:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 333
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_create_plan_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 336
    :goto_0
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 7

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 222
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    .line 223
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_not_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 225
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_not_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto/16 :goto_1

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 227
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    .line 228
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_not_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 229
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_not_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto/16 :goto_1

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    if-ne p1, v0, :cond_2

    .line 232
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    const-wide/32 v2, 0xa4cb800

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    .line 233
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_not_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_not_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_selected_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto/16 :goto_1

    .line 236
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->p:Landroid/widget/Button;

    if-ne p1, v0, :cond_6

    .line 237
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->D:Z

    if-eqz v0, :cond_3

    .line 238
    return-void

    .line 241
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->D:Z

    .line 242
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->l:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 243
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v4

    .line 244
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 245
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 247
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    rem-int/lit8 v0, v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 250
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    if-nez v0, :cond_5

    .line 251
    const-string v0, "Suggestion_RunRestSelectedActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlanParams is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    return-void

    .line 254
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getNowDate()Ljava/util/Calendar;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunPlanParams;->getStartDate()Ljava/util/Calendar;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->x:J

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->w:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setGoal(I)V

    .line 257
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->v:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setWeeklyTrainingDays(I)V

    .line 258
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1, v5}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setExcludedDates(Ljava/util/TreeSet;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/RunPlanParams;->acquireEventDate()Ljava/util/Calendar;

    move-result-object v2

    invoke-static {v1, v2}, Lo/buc;->e(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Calendar;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setPlanDays(I)V

    .line 264
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-static {v2}, Lo/bug;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;

    invoke-direct {v3, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Map;Lo/bui;)V

    .line 304
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/brt;->e(ILo/bui;)V

    .line 318
    :cond_6
    :goto_1
    return-void
.end method

.method private e(Landroid/view/View;Lo/efy;I)V
    .locals 5

    .line 386
    if-ltz p3, :cond_3

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p3, v0, :cond_3

    .line 387
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 388
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 389
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_selected_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/efy;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 390
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_restday_select_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/efy;->setTextColor(I)V

    goto :goto_0

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 393
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_restday_default_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/efy;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 394
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_press:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/efy;->setTextColor(I)V

    .line 396
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v2

    .line 397
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 398
    const/4 v0, 0x2

    if-lt v3, v0, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 399
    :goto_1
    if-nez v4, :cond_2

    .line 400
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->h()V

    goto :goto_2

    .line 402
    :cond_2
    invoke-direct {p0, v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b(Ljava/util/ArrayList;)V

    .line 405
    :cond_3
    :goto_2
    return-void
.end method

.method private f()V
    .locals 3

    .line 196
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 197
    const-string v0, "title"

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_edit_plan_name:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 198
    new-instance v0, Lo/bxi;

    invoke-direct {v0}, Lo/bxi;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->s:Lo/bxi;

    .line 199
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->s:Lo/bxi;

    invoke-virtual {v0, v2}, Lo/bxi;->setArguments(Landroid/os/Bundle;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->s:Lo/bxi;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;)V

    invoke-virtual {v0, v1}, Lo/bxi;->e(Lo/bxi$e;)V

    .line 207
    return-void
.end method

.method private g()V
    .locals 4

    .line 210
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->s:Lo/bxi;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bxi;->b(Ljava/lang/String;)V

    .line 211
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    .line 212
    if-eqz v2, :cond_0

    .line 213
    invoke-virtual {v2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v3

    .line 214
    if-eqz v3, :cond_0

    .line 215
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->s:Lo/bxi;

    const-string v1, "edit_plan_name"

    invoke-virtual {v3, v0, v1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 216
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 219
    :cond_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 428
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 429
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/efy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/efy;->setClickable(Z)V

    .line 428
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 431
    :cond_0
    return-void
.end method

.method private k()V
    .locals 7

    .line 119
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_sunday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->a:Lo/efy;

    .line 120
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_monday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e:Lo/efy;

    .line 121
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_tuesday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c:Lo/efy;

    .line 122
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_wednesday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->h:Lo/efy;

    .line 123
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_thursday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->k:Lo/efy;

    .line 124
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_friday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->g:Lo/efy;

    .line 125
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rest_select_saturday:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->i:Lo/efy;

    .line 126
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->a:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->h:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->k:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->g:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->i:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->a:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->c:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->h:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->k:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->g:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->i:Lo/efy;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_restday_today:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    .line 142
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_restday_tomorrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    .line 143
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_restday_after_tomorrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x5265c00

    add-long/2addr v1, v3

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xa4cb800

    add-long/2addr v1, v3

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->m:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    sget v0, Lcom/huawei/health/suggestion/R$id;->rest_selected_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->n:Lo/emr;

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->n:Lo/emr;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->w:I

    invoke-static {v1}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 154
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_btn_create:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->p:Landroid/widget/Button;

    .line 155
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_create_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->l:Lhuawei/widget/HwProgressBar;

    .line 159
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_plan_name_tv1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->t:Lo/efy;

    .line 160
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->w:I

    invoke-static {v0}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->q:Ljava/lang/String;

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->q:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->r:Ljava/lang/String;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->t:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 164
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 165
    invoke-static {v5}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_plan_name_image2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 167
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->sug_edit_plan_name:I

    invoke-static {v5, v0}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v6

    .line 168
    if-eqz v6, :cond_0

    .line 169
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_plan_name_image1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 173
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_plan_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->u:Landroid/widget/RelativeLayout;

    .line 174
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->u:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 106
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_activity_rest_selected:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->setContentView(I)V

    .line 107
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->k()V

    .line 108
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->d()V

    .line 109
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->f()V

    .line 110
    const-string v0, "FINSH_ALL_KEY_ShowPlanActivity"

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lo/bxd;->e(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V

    .line 111
    return-void
.end method

.method public b()V
    .locals 4

    .line 92
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->z:Landroid/content/Intent;

    .line 93
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->z:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->z:Landroid/content/Intent;

    const-string v1, "runType"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->w:I

    .line 95
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->z:Landroid/content/Intent;

    const-string v1, "runTimes"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->v:I

    .line 96
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->z:Landroid/content/Intent;

    const-string v1, "runParameter"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/RunPlanParams;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->y:Lcom/huawei/health/suggestion/model/RunPlanParams;

    .line 99
    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v3, v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 102
    :cond_1
    return-void
.end method

.method public e()V
    .locals 0

    .line 180
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 186
    instance-of v0, p1, Landroid/widget/Button;

    if-eqz v0, :cond_0

    .line 187
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->e(Landroid/view/View;)V

    goto :goto_0

    .line 188
    :cond_0
    instance-of v0, p1, Lo/efy;

    if-eqz v0, :cond_1

    .line 189
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->a(Landroid/view/View;)V

    goto :goto_0

    .line 190
    :cond_1
    instance-of v0, p1, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 191
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;->g()V

    .line 193
    :cond_2
    :goto_0
    return-void
.end method
