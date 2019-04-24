.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;Ljava/lang/String;)V
    .locals 0

    .line 5724
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 5727
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;->a:Ljava/lang/String;

    const/16 v3, 0x23

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5728
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57$5;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 5729
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_CONTINUE_HEART_RATE_SWITCH, continueHeartRateStatus  notifyUpdateSettingList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5730
    return-void
.end method
