.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(I)V
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

    .line 968
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$6;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 971
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$6;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Lo/egy;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 972
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$6;->b:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->cancel()V

    .line 974
    :cond_0
    return-void
.end method
