.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 1000
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1003
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lo/egy;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1004
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$3;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->o(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->cancel()V

    .line 1006
    :cond_0
    return-void
.end method
