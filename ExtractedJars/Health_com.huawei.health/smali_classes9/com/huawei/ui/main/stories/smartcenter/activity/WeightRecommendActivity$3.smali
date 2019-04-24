.class Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/picasso/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/ImageView;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/graphics/Bitmap;

.field final synthetic e:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->e:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->b:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->d:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 4

    .line 233
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Picasso load onError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    return-void
.end method

.method public onSuccess()V
    .locals 6

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->d:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->e:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v4, v0, v1, v2}, Lo/fis;->e(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 225
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$3;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 228
    :cond_0
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Picasso load onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    return-void
.end method
