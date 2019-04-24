.class Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/carddisplay/CardLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 311
    const-string v0, "CardLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLongClickRunnable isHorSlide="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isAllCollapse="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 312
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 314
    :cond_0
    return-void

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/base/R$id;->card_virtual:I

    if-ne v0, v1, :cond_2

    .line 319
    return-void

    .line 322
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    .line 323
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->e(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)I

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v4, :cond_6

    .line 325
    :cond_4
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b(Lcom/huawei/wallet/ui/carddisplay/CardLayout;Z)Z

    .line 326
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/os/Vibrator;

    move-result-object v0

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 327
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 330
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v2, v2, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->d:I

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v3, v3, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->a:I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;Landroid/graphics/Bitmap;II)V

    .line 331
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->b:I

    invoke-static {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->c(Lcom/huawei/wallet/ui/carddisplay/CardLayout;I)I

    .line 332
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 334
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setCanRebound(Z)V

    .line 336
    :cond_5
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$1;->e:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 339
    :cond_6
    return-void
.end method
