.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;Z)V
    .locals 0

    .line 625
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    iput-boolean p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V
    .locals 5

    .line 628
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "joinGroupActivity:\u53c2\u52a0\u6d3b\u52a8\u6210\u529f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 630
    const/16 v0, 0x3ea

    iput v0, v4, Landroid/os/Message;->what:I

    .line 631
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 632
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 634
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    .line 635
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->b:Z

    if-nez v0, :cond_0

    .line 636
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    .line 638
    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 642
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "joinGroupActivity:\u53c2\u52a0\u6d3b\u52a8\u5931\u8d25"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\n "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "result = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    const/16 v0, 0x7531

    if-ne p1, v0, :cond_0

    .line 644
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 645
    const/16 v0, 0x3ea

    iput v0, v4, Landroid/os/Message;->what:I

    .line 646
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 647
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 649
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->b:Z

    if-nez v0, :cond_1

    .line 650
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->a:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->f(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;)V

    .line 652
    :cond_1
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 625
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity$2;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V

    return-void
.end method
