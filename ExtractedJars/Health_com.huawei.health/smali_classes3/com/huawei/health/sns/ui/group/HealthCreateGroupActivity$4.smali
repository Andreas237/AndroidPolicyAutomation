.class Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 278
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " createGroup err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "objData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v4, -0x1

    .line 280
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 281
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 283
    :cond_0
    if-nez p1, :cond_2

    .line 284
    instance-of v0, p2, Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 285
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    move-object v1, p2

    check-cast v1, Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Lcom/huawei/health/sns/model/group/Group;)Lcom/huawei/health/sns/model/group/Group;

    .line 286
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Ljava/lang/Long;)Ljava/lang/Long;

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    goto :goto_0

    .line 294
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    goto :goto_0

    .line 296
    :cond_2
    const/16 v0, 0x406

    if-ne v4, v0, :cond_3

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x71

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 298
    :cond_3
    const/16 v0, 0x405

    if-ne v4, v0, :cond_4

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x72

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 301
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x70

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 303
    :goto_0
    return-void
.end method
