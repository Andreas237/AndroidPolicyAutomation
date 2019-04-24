.class Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$1;
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

    .line 190
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$1;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity$1;->d:Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthSetEventRuleActivity;->finish()V

    .line 194
    return-void
.end method
