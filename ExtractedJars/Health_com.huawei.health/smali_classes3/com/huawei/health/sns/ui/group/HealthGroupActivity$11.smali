.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 652
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;->e:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 655
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;->e:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupHelpActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 656
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;->e:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 657
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;->e:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 658
    return-void
.end method
