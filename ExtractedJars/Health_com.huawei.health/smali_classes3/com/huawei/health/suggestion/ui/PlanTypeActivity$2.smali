.class Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;->a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 149
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;->a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->b(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;->a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->c(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;->a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->a(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;->a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->e(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;->a:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->d(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    .line 156
    return-void
.end method
