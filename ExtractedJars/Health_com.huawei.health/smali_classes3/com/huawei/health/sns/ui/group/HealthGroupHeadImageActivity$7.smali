.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 1221
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 4

    .line 1224
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 1225
    new-instance v3, Lo/atr;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lo/atr;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 1226
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lo/atr;->e(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;)V

    .line 1227
    return-void
.end method
