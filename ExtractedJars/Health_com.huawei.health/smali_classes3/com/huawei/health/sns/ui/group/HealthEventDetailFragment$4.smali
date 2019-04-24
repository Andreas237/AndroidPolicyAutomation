.class Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->a(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->g(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4$4;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$4;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/bht;->b([Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 456
    return-void
.end method
