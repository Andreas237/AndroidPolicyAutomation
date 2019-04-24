.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/graphics/Bitmap;

.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 743
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;->c:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 746
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;->c:Landroid/graphics/Bitmap;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Landroid/graphics/Bitmap;Z)V

    .line 749
    :cond_0
    return-void
.end method
