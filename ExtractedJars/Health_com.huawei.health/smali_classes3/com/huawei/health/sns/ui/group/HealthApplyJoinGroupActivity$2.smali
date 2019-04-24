.class Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$2;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->d(Ljava/lang/String;ILjava/util/ArrayList;Lcom/huawei/health/sns/model/group/Group;)V
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
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition<-Landroid/graphics/drawable/Drawable;>;)V"
        }
    .end annotation

    .line 372
    if-eqz p1, :cond_0

    .line 373
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 374
    invoke-static {v1}, Lo/boe;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 375
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 378
    :cond_0
    return-void
.end method

.method public onLoadFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 382
    invoke-super {p0, p1}, Lcom/bumptech/glide/request/target/SimpleTarget;->onLoadFailed(Landroid/graphics/drawable/Drawable;)V

    .line 383
    const-string v0, "HealthApplyJoinGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7fa4\u5934\u50cf\u4e0b\u8f7d\u5931\u8d25\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    return-void
.end method

.method public synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 1

    .line 369
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity$2;->b(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
