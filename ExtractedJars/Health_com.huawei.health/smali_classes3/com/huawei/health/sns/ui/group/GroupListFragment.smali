.class public Lcom/huawei/health/sns/ui/group/GroupListFragment;
.super Lcom/huawei/health/sns/ui/common/FunctionFragment;
.source "SourceFile"

# interfaces
.implements Lo/bni$d;
.implements Lo/avk$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/GroupListFragment$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private l:Lo/bgp;

.field private m:Lo/bgn;

.field private o:Lo/bgo;

.field private p:Lo/bkj;

.field private q:Lo/atd;

.field private r:Lo/bgu;

.field private s:Lo/asz;

.field private t:Lo/bio;

.field private u:Lo/bgl;

.field private v:Z

.field private w:Z

.field private x:Landroid/os/Handler;

.field private y:Landroid/view/View;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;-><init>()V

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->q:Lo/atd;

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->s:Lo/asz;

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    .line 130
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupListFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment$d;-><init>(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->z:I

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->w:Z

    .line 150
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->y:Landroid/view/View;

    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/GroupListData;I)V
    .locals 3

    .line 253
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 254
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 257
    if-nez p1, :cond_0

    .line 259
    return-void

    .line 261
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupListData;->getFunctionBaseCardBeanList()Ljava/util/ArrayList;

    move-result-object v2

    .line 262
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 265
    const/16 v0, 0x31

    if-ne p2, v0, :cond_1

    .line 267
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v()V

    goto :goto_0

    .line 271
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->z()V

    .line 272
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->h()V

    .line 274
    :goto_0
    return-void

    .line 276
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupListData;->getNotifyCount()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->z:I

    .line 277
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m()V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    if-eqz v0, :cond_3

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    invoke-virtual {v0, v2}, Lo/bgl;->e(Ljava/util/ArrayList;)V

    .line 283
    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->s()V

    return-void
.end method

.method private static b()Ljava/lang/Runnable;
    .locals 1

    .line 340
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupListFragment$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment$5;-><init>()V

    return-object v0
.end method

.method private b(Z)V
    .locals 3

    .line 618
    const/16 v2, 0x32

    .line 619
    if-eqz p1, :cond_0

    .line 621
    const/16 v2, 0x31

    .line 623
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    if-eqz v0, :cond_1

    .line 625
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->o()Lo/atd;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v2, v1}, Lo/atd;->b(II)V

    goto :goto_0

    .line 629
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->o()Lo/atd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lo/atd;->e(II)V

    .line 631
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Z
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->q()Z

    move-result v0

    return v0
.end method

.method private c(Landroid/view/LayoutInflater;)V
    .locals 3

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 548
    sget v2, Lcom/huawei/android/sns/R$layout;->sns_group_no_family:I

    .line 549
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    if-eqz v0, :cond_0

    .line 551
    sget v2, Lcom/huawei/android/sns/R$layout;->sns_group_no_result:I

    .line 553
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b:Landroid/view/View;

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {p1, v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->a:Landroid/widget/LinearLayout;

    .line 554
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->a:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->g:Landroid/widget/LinearLayout;

    .line 555
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 558
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->l()V

    return-void
.end method

.method private d(III)V
    .locals 2

    .line 392
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    .line 394
    if-nez p3, :cond_0

    .line 396
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->h()V

    goto :goto_0

    .line 400
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m()V

    goto :goto_0

    .line 405
    :cond_1
    if-nez p3, :cond_2

    .line 407
    const/16 v0, 0x3f8

    if-eq p2, v0, :cond_4

    .line 409
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->p()V

    goto :goto_0

    .line 414
    :cond_2
    const/16 v0, 0x3f8

    if-eq p2, v0, :cond_3

    .line 416
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 418
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m()V

    .line 422
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->z()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupListFragment;Z)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b(Z)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupListFragment;III)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d(III)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupListFragment;Lcom/huawei/health/sns/model/group/GroupListData;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->a(Lcom/huawei/health/sns/model/group/GroupListData;I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    return v0
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Lo/asz;
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u()Lo/asz;

    move-result-object v0

    return-object v0
.end method

.method private f()V
    .locals 3

    .line 453
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    if-nez v0, :cond_0

    .line 455
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_null_bottom_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->y:Landroid/view/View;

    .line 457
    :cond_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 356
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 357
    if-eqz v2, :cond_2

    .line 359
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 360
    if-eqz v3, :cond_0

    .line 362
    const-string v0, "bundleKeyIsGrpChat"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    .line 366
    :cond_0
    if-eqz v3, :cond_2

    .line 368
    const-string v0, "sns_sdk_grpList_type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 369
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 372
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    goto :goto_0

    .line 374
    :cond_1
    const/4 v0, 0x2

    if-ne v4, v0, :cond_2

    .line 377
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    .line 381
    :cond_2
    :goto_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 433
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    if-eqz v0, :cond_1

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 437
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 441
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    if-eqz v0, :cond_3

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/bgu;->b(Z)V

    .line 445
    :cond_3
    return-void
.end method

.method private i()V
    .locals 4

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->y:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 466
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 468
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->y:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    goto :goto_0

    .line 473
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    if-eqz v0, :cond_1

    .line 475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->y:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    .line 478
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Landroid/os/Handler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    return-object v0
.end method

.method private l()V
    .locals 1

    .line 607
    iget v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->z:I

    if-lez v0, :cond_0

    .line 609
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b(Z)V

    .line 611
    :cond_0
    return-void
.end method

.method private m()V
    .locals 2

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    if-eqz v0, :cond_1

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 493
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 497
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    if-eqz v0, :cond_3

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/bgu;->b(Z)V

    .line 501
    :cond_3
    return-void
.end method

.method private n()V
    .locals 4

    .line 639
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupListFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment$2;-><init>(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 647
    return-void
.end method

.method private o()Lo/atd;
    .locals 2

    .line 656
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->q:Lo/atd;

    if-nez v0, :cond_0

    .line 658
    new-instance v0, Lo/atd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->q:Lo/atd;

    .line 660
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->q:Lo/atd;

    return-object v0
.end method

.method private p()V
    .locals 3

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 510
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 512
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    if-eqz v0, :cond_2

    .line 515
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_network_error_retry:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bni;->setTip(Ljava/lang/String;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bni;->setShowNetWorkButton(Z)V

    goto :goto_0

    .line 523
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bni;->setTip(Ljava/lang/String;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bni;->setShowNetWorkButton(Z)V

    .line 526
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    invoke-virtual {v0, p0}, Lo/bni;->setCallBack(Lo/bni$d;)V

    .line 528
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    if-eqz v0, :cond_3

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 532
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    if-eqz v0, :cond_4

    .line 534
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bgu;->b(Z)V

    .line 536
    :cond_4
    return-void
.end method

.method private q()Z
    .locals 1

    .line 758
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->w:Z

    return v0
.end method

.method private r()V
    .locals 4

    .line 699
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->l:Lo/bgp;

    .line 700
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m:Lo/bgn;

    .line 701
    new-instance v0, Lo/bgo;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgo;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->o:Lo/bgo;

    .line 702
    new-instance v0, Lo/bkj;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bkj;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->p:Lo/bkj;

    .line 703
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->l:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 704
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 706
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$i;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->o:Lo/bgo;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 708
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->p:Lo/bkj;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 710
    return-void
.end method

.method private s()V
    .locals 1

    .line 748
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->w:Z

    .line 749
    return-void
.end method

.method private t()V
    .locals 2

    .line 717
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->l:Lo/bgp;

    if-eqz v0, :cond_0

    .line 719
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->l:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 721
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->p:Lo/bkj;

    if-eqz v0, :cond_1

    .line 723
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->p:Lo/bkj;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 725
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m:Lo/bgn;

    if-eqz v0, :cond_2

    .line 727
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->m:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 729
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->o:Lo/bgo;

    if-eqz v0, :cond_3

    .line 731
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->o:Lo/bgo;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 733
    :cond_3
    return-void
.end method

.method private u()Lo/asz;
    .locals 2

    .line 670
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->s:Lo/asz;

    if-nez v0, :cond_0

    .line 672
    new-instance v0, Lo/asz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asz;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->s:Lo/asz;

    .line 674
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->s:Lo/asz;

    return-object v0
.end method

.method private v()V
    .locals 5

    .line 777
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    if-nez v0, :cond_0

    .line 779
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 780
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 782
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v4, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    .line 786
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->w:Z

    if-nez v0, :cond_1

    .line 788
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    if-eqz v0, :cond_1

    .line 790
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 793
    :cond_1
    return-void
.end method

.method private z()V
    .locals 1

    .line 766
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    if-eqz v0, :cond_0

    .line 768
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 770
    :cond_0
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 571
    new-instance v0, Lo/bgl;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bgl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->c:Lo/bfq;

    .line 573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bgl;->b(Lo/bfn;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u:Lo/bgl;

    invoke-virtual {v0}, Lo/bgl;->d()V

    .line 575
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b(Z)V

    .line 576
    return-void
.end method

.method public d()V
    .locals 1

    .line 597
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    .line 598
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b(Z)V

    .line 599
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->n()V

    .line 600
    return-void
.end method

.method public d(Lo/bfl;)V
    .locals 2

    .line 680
    new-instance v0, Lo/bgm;

    invoke-direct {v0}, Lo/bgm;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lo/bgm;->c(Lo/bfl;Landroid/app/Activity;)V

    .line 681
    return-void
.end method

.method public e(Lo/auu$b;Landroid/os/Bundle;)V
    .locals 3

    .line 295
    sget-object v0, Lo/auu$b;->c:Lo/auu$b;

    if-ne p1, v0, :cond_0

    .line 298
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->u()Lo/asz;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->x:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2}, Lo/asz;->b(ZLandroid/os/Handler;)V

    .line 300
    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 798
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i:Lo/bni;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bni;->setVisibility(I)V

    .line 799
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->w:Z

    .line 800
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v()V

    .line 801
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->n()V

    .line 802
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 581
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onAttach(Landroid/app/Activity;)V

    .line 584
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/health/sns/ui/group/GroupListActivity;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r:Lo/bgu;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 589
    goto :goto_0

    .line 586
    :catch_0
    move-exception v2

    .line 588
    const-string v0, "GroupListFragment"

    const-string v1, "GroupListFrame onAttach ClassCastException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 590
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 563
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 564
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 565
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i()V

    .line 566
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 288
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreate(Landroid/os/Bundle;)V

    .line 289
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->g()V

    .line 290
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 305
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 306
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->c(Landroid/view/LayoutInflater;)V

    .line 307
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->r()V

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d:Lo/bfm;

    if-eqz v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d:Lo/bfm;

    new-instance v1, Lo/bhy;

    invoke-direct {v1}, Lo/bhy;-><init>()V

    invoke-virtual {v0, v1}, Lo/bfm;->a(Lo/bfn;)V

    .line 312
    :cond_0
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->e:Lo/avk$b;

    invoke-virtual {v0, v1, p0}, Lo/avk;->c(Lo/avk$b;Lo/avk$d;)V

    .line 314
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->n()V

    .line 316
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    if-nez v0, :cond_1

    .line 319
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 321
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->f()V

    .line 322
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->i()V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 2

    .line 738
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onDestroyView()V

    .line 739
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->t()V

    .line 740
    invoke-static {}, Lo/avk;->e()Lo/avk;

    move-result-object v0

    sget-object v1, Lo/avk$b;->e:Lo/avk$b;

    invoke-virtual {v0, v1}, Lo/avk;->c(Lo/avk$b;)V

    .line 741
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 686
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onPause()V

    .line 688
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    if-nez v0, :cond_0

    .line 690
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {v0}, Lo/aut;->b()V

    .line 692
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 329
    invoke-super {p0}, Lcom/huawei/health/sns/ui/common/FunctionFragment;->onResume()V

    .line 331
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment;->v:Z

    if-nez v0, :cond_0

    .line 333
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-static {}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 334
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/aut;->a(Lo/auu$b;)V

    .line 336
    :cond_0
    return-void
.end method
