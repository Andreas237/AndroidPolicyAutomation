.class public Lcom/huawei/openalliance/ad/views/h;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/a/d;
.implements Lcom/huawei/openalliance/ad/views/interfaces/f;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/j/a/g;

.field private c:I

.field private d:I

.field private e:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/h;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/h;->d:I

    iput p2, p0, Lcom/huawei/openalliance/ad/views/h;->d:I

    iput p3, p0, Lcom/huawei/openalliance/ad/views/h;->c:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/h;->f()V

    return-void
.end method

.method private f()V
    .locals 2

    new-instance v0, Lcom/huawei/openalliance/ad/j/j;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/h;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/openalliance/ad/j/j;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/f;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->b:Lcom/huawei/openalliance/ad/j/a/g;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/views/a/c;
    .locals 4

    new-instance v3, Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/h;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/huawei/openalliance/ad/views/a/c;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/views/a/c;->setPlayTimes(I)V

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/views/a/c;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v3, p1}, Lcom/huawei/openalliance/ad/views/a/c;->setFilePath(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/huawei/openalliance/ad/views/a/c;->setPlayerCallback(Lcom/huawei/openalliance/ad/views/a/d;)V

    iput-object v3, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v3, v0}, Lcom/huawei/openalliance/ad/views/h;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/h;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/views/a/c;->a()V

    :cond_0
    return-object v3
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 4

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/h;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ag;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/h;->a:Ljava/lang/String;

    const-string v1, "showImageView - activity finished, not add view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v3, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/h;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iput-object v3, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v3, v0}, Lcom/huawei/openalliance/ad/views/h;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/h;->c()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->b:Lcom/huawei/openalliance/ad/j/a/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/g;->c()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->b:Lcom/huawei/openalliance/ad/j/a/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/g;->d()V

    return-void
.end method

.method public d()Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/h;->setVisibility(I)V

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->b:Lcom/huawei/openalliance/ad/j/a/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/g;->b()Z

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    instance-of v0, v0, Lcom/huawei/openalliance/ad/views/a/c;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    check-cast v0, Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/c;->a()V

    :cond_1
    :goto_0
    return v1
.end method

.method public e()V
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/h;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    instance-of v0, v0, Lcom/huawei/openalliance/ad/views/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->e:Landroid/view/View;

    check-cast v0, Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b()V

    :cond_0
    return-void
.end method

.method public getDefaultSloganResId()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/h;->c:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/h;->d:I

    return v0
.end method

.method public setSloganShowListener(Lcom/huawei/openalliance/ad/f/a;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/h;->b:Lcom/huawei/openalliance/ad/j/a/g;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/g;->a(Lcom/huawei/openalliance/ad/f/a;)V

    return-void
.end method
