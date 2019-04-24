.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;)V
    .locals 0

    .line 1579
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 1582
    if-nez p1, :cond_0

    .line 1583
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 1585
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20$4;)V

    invoke-static {v0, v2, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1606
    :cond_0
    return-void
.end method
