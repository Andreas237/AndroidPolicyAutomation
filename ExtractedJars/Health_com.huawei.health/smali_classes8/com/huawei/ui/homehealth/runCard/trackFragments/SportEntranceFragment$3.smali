.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V
    .locals 0

    .line 399
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 494
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/emq;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 403
    return-void
.end method

.method public onPageSelected(I)V
    .locals 5

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/emq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 408
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const-string v1, "onPageSelected"

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Ljava/lang/String;)V

    .line 412
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/ets;->f(Landroid/content/Context;I)V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Z)V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 419
    const-string v0, "sportType"

    const/16 v1, 0x2711

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ets;->a(Landroid/content/Context;Z)V

    goto/16 :goto_2

    .line 434
    :cond_0
    if-nez p1, :cond_2

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/16 v1, 0x108

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 441
    const-string v0, "sportType"

    const/16 v1, 0x108

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    goto :goto_0

    .line 447
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/16 v1, 0x102

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 448
    const-string v0, "sportType"

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 454
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ets;->f(Landroid/content/Context;I)V

    goto/16 :goto_1

    .line 455
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/16 v1, 0x101

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 461
    const-string v0, "sportType"

    const/16 v1, 0x101

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 466
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ets;->f(Landroid/content/Context;I)V

    goto :goto_1

    .line 467
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/16 v1, 0x103

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 473
    const-string v0, "sportType"

    const/16 v1, 0x103

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ets;->f(Landroid/content/Context;I)V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 480
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Z)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v1

    invoke-static {v0, v1}, Lo/ets;->d(Landroid/content/Context;I)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/esg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->g(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/esg;->d(II)V

    .line 486
    :goto_2
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    sget-object v0, Lo/dae;->hp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 488
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$3;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 489
    return-void
.end method
