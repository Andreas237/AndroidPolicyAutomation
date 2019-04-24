.class Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->a(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)I

    move-result v0

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_0

    .line 203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->b(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$4;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->c(Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;)V

    .line 209
    :cond_1
    :goto_0
    return-void
.end method
