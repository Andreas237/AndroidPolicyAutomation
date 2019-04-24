.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 116
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 117
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 118
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v5

    .line 119
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v6

    .line 120
    int-to-float v0, v5

    int-to-float v1, v3

    div-float v7, v0, v1

    .line 121
    int-to-float v0, v6

    int-to-float v1, v4

    div-float v8, v0, v1

    .line 122
    cmpl-float v0, v7, v8

    if-lez v0, :cond_0

    .line 123
    int-to-float v0, v4

    mul-float/2addr v0, v7

    int-to-float v1, v6

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v9, v0, v1

    .line 124
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, v7, v7}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 125
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v9

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 126
    goto :goto_0

    .line 127
    :cond_0
    int-to-float v0, v3

    mul-float/2addr v0, v8

    int-to-float v1, v5

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v9, v0, v1

    .line 128
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, v8, v8}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 129
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v9

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 131
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;->b:Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 133
    return-void
.end method
