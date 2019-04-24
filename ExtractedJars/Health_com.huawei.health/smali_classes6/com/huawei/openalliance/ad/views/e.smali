.class public Lcom/huawei/openalliance/ad/views/e;
.super Lcom/huawei/openalliance/ad/views/c;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/b;


# instance fields
.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/c;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/e;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/i;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/i;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/e;->a:Lcom/huawei/openalliance/ad/j/a/f;

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    sget v0, Lcom/huawei/openalliance/ad/R$layout;->hiad_view_image_ad:I

    invoke-static {p1, v0, p0}, Lcom/huawei/openalliance/ad/views/e;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->iv_ad_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/e;->e:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "PPSImageView"

    const-string v1, "onAdImageLoaded - set image to view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/e;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/e;->a:Lcom/huawei/openalliance/ad/j/a/f;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/e;->c:I

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/f;->a(I)V

    return-void
.end method
