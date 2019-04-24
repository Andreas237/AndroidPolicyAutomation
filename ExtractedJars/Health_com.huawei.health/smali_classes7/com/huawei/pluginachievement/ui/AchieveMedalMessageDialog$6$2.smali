.class Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->d(Lo/efj$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/efj$d;

.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;Lo/efj$d;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->a:Lo/efj$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 512
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->r(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 513
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    new-instance v1, Lo/efz;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/efz;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Lo/efz;)Lo/efz;

    .line 514
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->t(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->t(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->q(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/egc$b;->b:Lo/egc$b;

    sget-object v3, Lo/egc$a;->e:Lo/egc$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/efz;->setBackContent([Ljava/lang/String;Lo/egc$b;Lo/egc$a;)V

    .line 520
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lo/efz;->setTexture(Landroid/graphics/Bitmap;)V

    .line 521
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    new-instance v1, Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->x(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v3, v3, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->v(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v4, v4, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v4}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->z(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I

    move-result v4

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    const/16 v5, 0x438

    invoke-direct {v1, v4, v2, v5, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v0, v1}, Lo/efz;->setTouchRect(Landroid/graphics/Rect;)V

    .line 522
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->a:Lo/efj$d;

    invoke-virtual {v0, v1}, Lo/efz;->setObjData(Lo/efj$d;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    const v1, 0x3ca3d70a    # 0.02f

    const v2, 0x3da3d70a    # 0.08f

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorScaleX(FF)V

    .line 525
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    const v1, 0x3ca3d70a    # 0.02f

    const v2, 0x3da3d70a    # 0.08f

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorScaleY(FF)V

    .line 526
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorRotationY(FF)V

    .line 527
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->y(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorPositionX(FF)V

    .line 528
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->v(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v3, v3, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->w(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorPositionY(FF)V

    .line 529
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Lo/efz;->setAnimatorDuration(J)V

    .line 530
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->r(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 533
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->u(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Lo/efz;

    move-result-object v0

    invoke-virtual {v0}, Lo/efz;->e()V

    .line 534
    return-void
.end method
