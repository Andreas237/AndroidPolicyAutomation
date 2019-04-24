.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 510
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 513
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v2

    const-class v3, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 514
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$10;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 515
    return-void
.end method
