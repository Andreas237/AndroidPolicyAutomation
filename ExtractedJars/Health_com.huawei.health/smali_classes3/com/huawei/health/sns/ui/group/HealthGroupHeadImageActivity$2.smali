.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$2;
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
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$2;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 734
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$2;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$2;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/String;)V

    .line 735
    return-void
.end method
