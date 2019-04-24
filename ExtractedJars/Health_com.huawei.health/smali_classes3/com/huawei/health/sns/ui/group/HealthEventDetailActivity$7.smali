.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Z)V
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
.field final synthetic c:Z

.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Z)V
    .locals 0

    .line 822
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    iput-boolean p2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V
    .locals 5

    .line 825
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

    .line 826
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 827
    const/16 v0, 0x3ea

    iput v0, v4, Landroid/os/Message;->what:I

    .line 828
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 829
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 831
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 832
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->c:Z

    if-nez v0, :cond_0

    .line 833
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 835
    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 839
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

    .line 840
    const/16 v0, 0x7531

    if-ne p1, v0, :cond_0

    .line 841
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 842
    const/16 v0, 0x3ea

    iput v0, v4, Landroid/os/Message;->what:I

    .line 843
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 844
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 846
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->c:Z

    if-nez v0, :cond_1

    .line 847
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->n(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V

    .line 849
    :cond_1
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 822
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$7;->b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V

    return-void
.end method
