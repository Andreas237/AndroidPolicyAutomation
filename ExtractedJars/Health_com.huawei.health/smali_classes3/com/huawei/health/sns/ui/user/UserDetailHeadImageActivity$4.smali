.class Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;->c:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 4

    .line 191
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;->c:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->d(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 192
    new-instance v3, Lo/atr;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;->c:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;->c:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->c(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lo/atr;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;->c:Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->b(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Lo/atr;->e(Lcom/huawei/health/sns/model/user/User;Landroid/graphics/Bitmap;)V

    .line 194
    return-void
.end method
