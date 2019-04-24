.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V
    .locals 0

    .line 750
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 753
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

    .line 754
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

    .line 755
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 756
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$7;->c:Ljava/lang/String;

    invoke-static {v0, p2, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    :cond_0
    return-void
.end method
