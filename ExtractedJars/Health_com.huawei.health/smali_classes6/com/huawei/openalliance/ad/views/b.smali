.class public Lcom/huawei/openalliance/ad/views/b;
.super Landroid/widget/ImageView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/b$a;
    }
.end annotation


# instance fields
.field a:Lcom/huawei/openalliance/ad/views/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/b$a;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/views/b$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/b;->a:Lcom/huawei/openalliance/ad/views/b$a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b;->a:Lcom/huawei/openalliance/ad/views/b$a;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/b;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b;->a:Lcom/huawei/openalliance/ad/views/b$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b;->a:Lcom/huawei/openalliance/ad/views/b$a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/b$a;->a()V

    :cond_0
    return-void
.end method

.method public setProgress(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b;->a:Lcom/huawei/openalliance/ad/views/b$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/b;->a:Lcom/huawei/openalliance/ad/views/b$a;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/b$a;->a(I)V

    :cond_0
    return-void
.end method
