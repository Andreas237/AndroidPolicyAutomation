.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;)V
    .locals 0

    .line 855
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 858
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->o(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 859
    return-void
.end method
