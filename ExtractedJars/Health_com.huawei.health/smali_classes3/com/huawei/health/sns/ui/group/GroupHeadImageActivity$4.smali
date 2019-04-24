.class Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)V
    .locals 0

    .line 851
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;->d:Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 4

    .line 855
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;->d:Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->d(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 856
    new-instance v3, Lo/atr;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;->d:Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;->d:Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->e(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lo/atr;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 857
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity$4;->d:Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/GroupHeadImageActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lo/atr;->e(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;)V

    .line 858
    return-void
.end method
