.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 640
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$15;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 644
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$15;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$15;->d:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 646
    return-void
.end method
