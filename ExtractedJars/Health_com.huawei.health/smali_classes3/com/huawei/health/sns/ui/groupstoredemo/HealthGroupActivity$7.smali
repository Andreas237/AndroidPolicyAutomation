.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ely;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 1396
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lo/elz;IIII)V
    .locals 2

    .line 1399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Z)Z

    .line 1401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->f(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1402
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/view/View;)V

    goto :goto_0

    .line 1403
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->g(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 1404
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/view/View;)V

    .line 1407
    :cond_1
    :goto_0
    return-void
.end method
