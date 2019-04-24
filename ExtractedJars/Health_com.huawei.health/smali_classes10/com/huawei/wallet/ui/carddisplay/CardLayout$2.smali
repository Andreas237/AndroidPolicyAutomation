.class Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;
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
.field final synthetic b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 352
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->f:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    if-nez v0, :cond_1

    .line 354
    :cond_0
    return-void

    .line 357
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getHeight()I

    move-result v3

    .line 359
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k:I

    sub-int v4, v0, v1

    .line 361
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->i:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->p:I

    add-int v5, v0, v1

    .line 363
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getScrollY()I

    move-result v6

    .line 367
    add-int v7, v6, v3

    .line 369
    if-lt v5, v7, :cond_2

    const/4 v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    .line 373
    :goto_0
    if-eqz v8, :cond_3

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    if-ne v0, v1, :cond_3

    .line 377
    const/16 v9, 0x14

    .line 378
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    add-int/lit8 v1, v1, -0x14

    iput v1, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    goto :goto_1

    .line 381
    :cond_3
    if-ge v4, v6, :cond_4

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v0, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->m:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->a:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    if-ne v0, v1, :cond_4

    .line 383
    const/16 v9, -0x14

    .line 384
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget v1, v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    add-int/lit8 v1, v1, 0x14

    iput v1, v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->o:I

    goto :goto_1

    .line 390
    :cond_4
    const/4 v9, 0x0

    .line 391
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->k(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->h(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 400
    :goto_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->requestDisallowInterceptTouchEvent(Z)V

    .line 402
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$2;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->g(Lcom/huawei/wallet/ui/carddisplay/CardLayout;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v9}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->scrollBy(II)V

    .line 404
    return-void
.end method
