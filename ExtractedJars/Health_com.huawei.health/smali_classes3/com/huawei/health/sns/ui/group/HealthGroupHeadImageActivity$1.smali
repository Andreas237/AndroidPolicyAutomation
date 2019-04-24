.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 771
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 774
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 775
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Landroid/graphics/Bitmap;Z)V

    .line 777
    :cond_0
    return-void
.end method
