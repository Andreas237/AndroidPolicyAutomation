.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 734
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$1;->a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;)V
    .locals 5

    .line 738
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGroupActivity:\u83b7\u53d6\u6d3b\u52a8\u8be6\u60c5\u6570\u636e\u6210\u529f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 740
    const/16 v0, 0x3e9

    iput v0, v4, Landroid/os/Message;->what:I

    .line 741
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 742
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$1;->a:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 743
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 747
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupActivity:\u83b7\u53d6\u6d3b\u52a8\u8be6\u60c5\u6570\u636e\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 748
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 734
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$1;->b(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;)V

    return-void
.end method
