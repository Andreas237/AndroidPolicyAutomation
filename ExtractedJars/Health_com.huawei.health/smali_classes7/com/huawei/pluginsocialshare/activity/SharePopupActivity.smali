.class public Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/sina/weibo/sdk/share/WbShareCallback;


# static fields
.field private static b:Ljava/lang/String;


# instance fields
.field private B:Landroid/widget/TextView;

.field private a:Lo/ebk;

.field private c:Lo/dav;

.field private d:J

.field private e:Z

.field private f:Landroid/content/Context;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Landroid/widget/RelativeLayout;

.field private v:Landroid/widget/LinearLayout;

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/widget/LinearLayout;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    const-string v0, "SharePopupActivity"

    sput-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 69
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->d:J

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e:Z

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->i:I

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->g:Z

    .line 96
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->k:Ljava/lang/String;

    .line 97
    const-string v0, "2"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->h:Ljava/lang/String;

    .line 98
    const-string v0, "3"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->m:Ljava/lang/String;

    .line 99
    const-string v0, "4"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->l:Ljava/lang/String;

    .line 100
    const-string v0, "5"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->o:Ljava/lang/String;

    .line 101
    const-string v0, "6"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->n:Ljava/lang/String;

    .line 102
    const-string v0, "7"

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->p:Ljava/lang/String;

    return-void
.end method

.method private a(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;
    .locals 1

    .line 348
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_img:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 64
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->t:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private b(I)V
    .locals 5

    .line 524
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 525
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SHARE_POP_UP_ACTIVITY_SHARE_TYPE"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 526
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 5

    .line 368
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() if (isClickFast())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    return-void

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    if-nez v0, :cond_1

    .line 373
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShareContent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    return-void

    .line 378
    :cond_1
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    .line 381
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 384
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_save_to_local_layout:I

    if-ne v0, v4, :cond_2

    .line 386
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_local_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 390
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v3, v2}, Lo/ebk;->a(Landroid/content/Context;ILo/dav;)V

    .line 393
    return-void

    .line 398
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 399
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_connect_error:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 400
    return-void

    .line 402
    :cond_3
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_wechat_friends_layout:I

    if-ne v0, v4, :cond_4

    .line 404
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_friends_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/ebk;->a(Landroid/content/Context;ILo/dav;)V

    goto/16 :goto_0

    .line 408
    :cond_4
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_wechat_chat_layout:I

    if-ne v0, v4, :cond_5

    .line 410
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_chat_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Lo/ebk;->a(Landroid/content/Context;ILo/dav;)V

    goto/16 :goto_0

    .line 414
    :cond_5
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_weibo_layout:I

    if-ne v0, v4, :cond_6

    .line 416
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_weibo_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3, v2}, Lo/ebk;->a(Landroid/content/Context;ILo/dav;)V

    goto :goto_0

    .line 420
    :cond_6
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_more_layout:I

    if-ne v0, v4, :cond_8

    .line 422
    iget-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e:Z

    if-eqz v0, :cond_7

    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 423
    :cond_7
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v3, v2}, Lo/ebk;->a(Landroid/content/Context;ILo/dav;)V

    goto :goto_0

    .line 427
    :cond_8
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->background_layout:I

    if-ne v0, v4, :cond_9

    .line 429
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click background_layout, destroy!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->finish()V

    goto :goto_0

    .line 432
    :cond_9
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click outside activity! id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    :cond_a
    :goto_0
    return-void
.end method

.method private b()Z
    .locals 6

    .line 442
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 444
    const/4 v0, 0x1

    return v0

    .line 446
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 447
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 451
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 452
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 454
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 455
    :goto_0
    if-nez v5, :cond_3

    .line 456
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->q(Landroid/content/Context;)V

    .line 457
    const/4 v0, 0x0

    return v0

    .line 460
    :cond_3
    new-instance v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$1;-><init>(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)V

    invoke-static {p0, v4, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 472
    const/4 v0, 0x0

    return v0

    .line 475
    :cond_4
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkStoragePermissions hasPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    const/4 v0, 0x1

    return v0

    .line 479
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method private c(Landroid/widget/LinearLayout;)Landroid/widget/TextView;
    .locals 1

    .line 338
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_tv:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 180
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e()V

    .line 181
    return-void

    .line 185
    :cond_1
    sget v0, Lcom/huawei/pluginsocialshare/R$anim;->fly_down_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    .line 186
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 187
    const/4 v3, 0x0

    .line 188
    iget-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e:Z

    if-eqz v0, :cond_2

    .line 189
    sget v0, Lcom/huawei/pluginsocialshare/R$anim;->preview_fade_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    goto :goto_0

    .line 191
    :cond_2
    sget v0, Lcom/huawei/pluginsocialshare/R$anim;->mask_fade_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 193
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 194
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 195
    new-instance v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$2;-><init>(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)V

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 210
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->r:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private f()Z
    .locals 6

    .line 487
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 489
    iget-wide v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->d:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 490
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">_< >_< click too much"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    iput-wide v4, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->d:J

    .line 492
    const/4 v0, 0x1

    return v0

    .line 494
    :cond_0
    iput-wide v4, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->d:J

    .line 495
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public d()V
    .locals 12

    .line 229
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_wechat_friends_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->s:Landroid/widget/LinearLayout;

    .line 230
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_wechat_chat_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->q:Landroid/widget/LinearLayout;

    .line 231
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_weibo_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->y:Landroid/widget/LinearLayout;

    .line 232
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_more_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->v:Landroid/widget/LinearLayout;

    .line 233
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_save_to_local_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->z:Landroid/widget/LinearLayout;

    .line 235
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_watermark_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->x:Landroid/widget/LinearLayout;

    .line 236
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_watermark_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->w:Landroid/widget/ImageView;

    .line 237
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_watermark_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->B:Landroid/widget/TextView;

    .line 239
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->r:Landroid/widget/RelativeLayout;

    .line 240
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->dst_selector:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->t:Landroid/widget/RelativeLayout;

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_show_app_logo:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->B:Landroid/widget/TextView;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_app_name_health:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 245
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->s:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->share_wechat_friends_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 246
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->share_wechat_chat_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 247
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->y:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->share_weibo_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 248
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->v:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->share_more_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 249
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->z:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->share_save_local:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 252
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->s:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_wechat_friends:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_wechat_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 254
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->y:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_weibo:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 255
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->v:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_user_profile_more:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->z:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_show_save_local:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 260
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 261
    const v0, 0x106000d

    invoke-virtual {v4, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 266
    sget v0, Lcom/huawei/pluginsocialshare/R$anim;->fly_up_in:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    .line 269
    new-instance v6, Landroid/view/animation/LayoutAnimationController;

    invoke-direct {v6, v5}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->h()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    .line 276
    invoke-virtual {v0}, Lo/dav;->h()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    .line 277
    invoke-virtual {v0}, Lo/dav;->h()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 278
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e:Z

    .line 280
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->share_title_main_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/emr;

    .line 281
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/emr;->setVisibility(I)V

    .line 284
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->img_preview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout;

    .line 285
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 286
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->preview_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    .line 287
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    invoke-static {v0}, Lo/ece;->c(Lo/dav;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 289
    const/16 v0, 0x1770

    invoke-static {v10, v0}, Lo/ece;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 290
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 291
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v10}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory;->create(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;

    move-result-object v11

    .line 292
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 294
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    invoke-virtual {v11, v0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->setCornerRadius(F)V

    .line 295
    invoke-virtual {v9, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 297
    :cond_1
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convert Bitmap to RoundedBitmapDrawable fail, use Bitmap directly"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 303
    :cond_2
    :goto_0
    sget v0, Lcom/huawei/pluginsocialshare/R$anim;->fade_in:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->overridePendingTransition(II)V

    .line 304
    goto :goto_1

    .line 305
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->e:Z

    .line 307
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->z:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 309
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->background_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->u:Landroid/widget/RelativeLayout;

    .line 310
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->u:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->u:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    sget v0, Lcom/huawei/pluginsocialshare/R$anim;->mask_fade_in:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->overridePendingTransition(II)V

    .line 317
    :goto_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 318
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 319
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 320
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 323
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 327
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    return-void
.end method

.method public e()V
    .locals 4

    .line 217
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    invoke-virtual {v0}, Lo/ebk;->b()V

    .line 220
    :cond_0
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "super.finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->finish()V

    .line 222
    return-void
.end method

.method public finish()V
    .locals 4

    .line 161
    iget-boolean v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->g:Z

    if-eqz v0, :cond_0

    .line 163
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish when is already finishing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return-void

    .line 166
    :cond_0
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c()V

    .line 170
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 353
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->h()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_0

    .line 354
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 355
    invoke-direct {p0, p1}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b(Landroid/view/View;)V

    goto :goto_0

    .line 358
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b(Landroid/view/View;)V

    .line 360
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 134
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 135
    iput-object p0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    .line 137
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v4

    .line 138
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->finish()V

    .line 140
    return-void

    .line 142
    :cond_0
    sget v0, Lcom/huawei/pluginsocialshare/R$layout;->activity_share_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->setContentView(I)V

    .line 145
    invoke-static {}, Lo/ebk;->c()Lo/dav;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    .line 146
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->c:Lo/dav;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 147
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShareContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->finish()V

    .line 149
    return-void

    .line 153
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b(I)V

    .line 156
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->d()V

    .line 157
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 514
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 516
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a:Lo/ebk;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->f:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lo/ebk;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 518
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 500
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 502
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 503
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 504
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 506
    :cond_0
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->finish()V

    .line 510
    :cond_1
    :goto_0
    return-void
.end method

.method public onWbShareCancel()V
    .locals 0

    .line 551
    return-void
.end method

.method public onWbShareFail()V
    .locals 0

    .line 547
    return-void
.end method

.method public onWbShareSuccess()V
    .locals 6

    .line 531
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebk;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ebo;

    .line 533
    if-eqz v4, :cond_1

    .line 534
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse() if (pluginSocialShareAdapter != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    invoke-interface {v4}, Lo/ebo;->getIBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v5

    .line 536
    if-eqz v5, :cond_0

    .line 537
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 539
    :cond_0
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse() if (cb != null) ELSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    :cond_1
    :goto_0
    return-void
.end method
