.class Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V
    .locals 0

    .line 482
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 485
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;I)I

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;F)F

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;F)V

    .line 489
    const-string v0, "HealthSetEventRuleActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Custom set targetValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->e(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    return-void
.end method
