.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d(Lo/efj$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/efj$d;

.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;Lo/efj$d;)V
    .locals 0

    .line 456
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->a:Lo/efj$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 459
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    new-instance v1, Lo/efz;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/efz;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Lo/efz;)Lo/efz;

    .line 461
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 462
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->i(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/egc$b;->b:Lo/egc$b;

    sget-object v3, Lo/egc$a;->e:Lo/egc$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/efz;->setBackContent([Ljava/lang/String;Lo/egc$b;Lo/egc$a;)V

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lo/efz;->setTexture(Landroid/graphics/Bitmap;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    new-instance v1, Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v3, v3, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v4, v4, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v4}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I

    move-result v4

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    const/16 v5, 0x438

    invoke-direct {v1, v4, v2, v5, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v0, v1}, Lo/efz;->setTouchRect(Landroid/graphics/Rect;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->a:Lo/efj$d;

    invoke-virtual {v0, v1}, Lo/efz;->setObjData(Lo/efj$d;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    const v1, 0x3ca3d70a    # 0.02f

    const v2, 0x3da3d70a    # 0.08f

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorScaleX(FF)V

    .line 472
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    const v1, 0x3ca3d70a    # 0.02f

    const v2, 0x3da3d70a    # 0.08f

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorScaleY(FF)V

    .line 473
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorRotationY(FF)V

    .line 474
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->l(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->m(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorPositionX(FF)V

    .line 475
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->o(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v3, v3, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->p(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorPositionY(FF)V

    .line 476
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorDuration(J)V

    .line 477
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Lo/efz;

    move-result-object v0

    invoke-virtual {v0}, Lo/efz;->e()V

    .line 481
    return-void
.end method
