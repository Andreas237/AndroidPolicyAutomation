.class public Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;,
        Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;,
        Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$c;
    }
.end annotation


# instance fields
.field protected f:Landroid/os/Handler;

.field protected h:Landroid/support/v4/view/ViewPager;

.field protected k:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

.field private q:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 3

    .line 162
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 163
    if-eqz v1, :cond_1

    .line 165
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 166
    if-nez v2, :cond_0

    .line 168
    return-void

    .line 170
    :cond_0
    const-string v0, "picMessageItem"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    const-string v0, "picMessageItem"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->q:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 176
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->k()V

    .line 178
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->h()V

    .line 179
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->k:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->k:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 198
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->k:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->notifyDataSetChanged()V

    .line 200
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Ljava/util/ArrayList;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->e(Ljava/util/ArrayList;I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;ZZLandroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->c(ZZLandroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/kv;Landroid/view/View;)Z
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/kv;Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->g()V

    return-void
.end method

.method private c(ZZLandroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 420
    if-eqz p1, :cond_1

    .line 422
    sget v0, Lcom/huawei/android/sns/R$id;->txt_failed_info:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    .line 423
    if-eqz p2, :cond_0

    .line 425
    sget v0, Lcom/huawei/android/sns/R$string;->sns_image_expired:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 429
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_load_image_failed:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 431
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 432
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 440
    goto :goto_1

    .line 443
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 444
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-void
.end method

.method private e(Ljava/util/ArrayList;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;I)V"
        }
    .end annotation

    .line 221
    const-string v0, "PhotoViewPagerActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateLocalData size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Ljava/util/ArrayList;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$1;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->k:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

    .line 224
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->h:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->k:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 227
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/kv;Landroid/view/View;)Z
    .locals 8

    .line 350
    const/4 v3, 0x0

    .line 351
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getOriginalDownStatus()I

    move-result v4

    .line 352
    const/4 v0, 0x2

    if-eq v4, v0, :cond_0

    const/4 v0, 0x3

    if-eq v4, v0, :cond_0

    const/4 v0, 0x6

    if-ne v4, v0, :cond_1

    .line 355
    :cond_0
    const/4 v3, 0x1

    .line 358
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v5

    .line 359
    const-string v0, "PhotoViewPagerActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dStatus is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 362
    const-string v0, "http"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 365
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v6

    .line 367
    const/4 v7, 0x0

    .line 368
    invoke-static {v6}, Lo/bot;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    const/4 v3, 0x0

    .line 372
    const/4 v7, 0x1

    .line 373
    invoke-static {p2, v6}, Lo/aqx;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 375
    :cond_2
    if-nez v4, :cond_4

    .line 378
    if-nez v7, :cond_3

    .line 380
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 382
    :cond_3
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aus;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 384
    :cond_4
    goto :goto_0

    .line 387
    :cond_5
    invoke-static {v5}, Lo/bot;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 389
    const/4 v3, 0x0

    .line 390
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 391
    invoke-static {p2, v5}, Lo/aqx;->d(Landroid/widget/ImageView;Ljava/lang/String;)V

    goto :goto_0

    .line 395
    :cond_6
    const/4 v3, 0x1

    goto :goto_0

    .line 401
    :cond_7
    const/4 v3, 0x1

    .line 403
    :goto_0
    if-eqz v3, :cond_8

    .line 405
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 407
    :cond_8
    return v3
.end method

.method private g()V
    .locals 4

    .line 475
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->f:Landroid/os/Handler;

    const-wide/32 v2, -0x186ac

    invoke-virtual {v0, v2, v3, v1}, Lo/aus;->d(JLandroid/os/Handler;)V

    .line 476
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->finish()V

    .line 478
    sget v0, Lcom/huawei/android/sns/R$anim;->sns_view_photo_scale_fadeout:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->overridePendingTransition(II)V

    .line 479
    return-void
.end method

.method private h()V
    .locals 4

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->q:Lcom/huawei/health/sns/model/chat/MessageItem;

    if-eqz v0, :cond_0

    .line 206
    invoke-static {}, Lo/aqe;->b()Lo/aqe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->q:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->f:Landroid/os/Handler;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/aqe;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)V

    .line 208
    :cond_0
    return-void
.end method

.method private k()V
    .locals 1

    .line 215
    sget v0, Lcom/huawei/android/sns/R$id;->pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->h:Landroid/support/v4/view/ViewPager;

    .line 217
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 463
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->g()V

    .line 464
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onBackPressed()V

    .line 465
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 133
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onCreate(Landroid/os/Bundle;)V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->requestWindowFeature(I)Z

    .line 137
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 139
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 142
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    const/high16 v2, 0x8000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 147
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_photoview_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->setContentView(I)V

    .line 149
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->f:Landroid/os/Handler;

    .line 151
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->f:Landroid/os/Handler;

    const-wide/32 v2, -0x186ac

    invoke-virtual {v0, v2, v3, v1}, Lo/aus;->b(JLandroid/os/Handler;)V

    .line 153
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->a()V

    .line 155
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 184
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onDestroy()V

    .line 185
    return-void
.end method
