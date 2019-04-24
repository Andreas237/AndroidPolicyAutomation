.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;)V
    .locals 0

    .line 1575
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1579
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/bht;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1608
    return-void
.end method
