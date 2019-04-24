.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 568
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$9;->c:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 571
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$9;->c:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 576
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$9;->c:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->f(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 578
    :goto_0
    return-void
.end method
