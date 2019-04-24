.class public Lcom/huawei/openalliance/ad/views/d;
.super Lcom/huawei/openalliance/ad/views/c;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/a;


# instance fields
.field private e:Lcom/huawei/openalliance/ad/views/a/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/c;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/h;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/h;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->a:Lcom/huawei/openalliance/ad/j/a/f;

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/c;->a(II)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/d;->e()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ag;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PPSGifView"

    const-string v1, "onAdGifLoaded - activity finished, not add view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "PPSGifView"

    const-string v1, "onAdGifLoaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    if-nez v0, :cond_1

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/d;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;->setPlayTimes(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    new-instance v1, Lcom/huawei/openalliance/ad/views/d$1;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/d$1;-><init>(Lcom/huawei/openalliance/ad/views/d;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;->setPlayerCallback(Lcom/huawei/openalliance/ad/views/a/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/d;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d;->e:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b()V

    :cond_0
    return-void
.end method
