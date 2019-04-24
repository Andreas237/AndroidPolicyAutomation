.class Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/request/target/SimpleTarget<Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition<-Landroid/graphics/drawable/Drawable;>;)V"
        }
    .end annotation

    .line 200
    if-eqz p1, :cond_0

    .line 201
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 202
    if-eqz v3, :cond_0

    .line 203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/bhp;->c(Landroid/content/Context;)Lo/bhp;

    move-result-object v4

    .line 204
    const/4 v0, 0x4

    const/16 v1, 0xa

    invoke-virtual {v4, v3, v0, v1}, Lo/bhp;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 208
    invoke-virtual {v4}, Lo/bhp;->c()V

    .line 211
    :cond_0
    return-void
.end method

.method public onLoadFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 215
    invoke-super {p0, p1}, Lcom/bumptech/glide/request/target/SimpleTarget;->onLoadFailed(Landroid/graphics/drawable/Drawable;)V

    .line 216
    const-string v0, "Group_HealthEventDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7fa4\u5934\u50cf\u4e0b\u8f7d\u5931\u8d25\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void
.end method

.method public synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 1

    .line 197
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$1;->e(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
