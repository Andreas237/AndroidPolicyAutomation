.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;Ljava/lang/String;)V
    .locals 0

    .line 1763
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1766
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    const/16 v2, 0x149

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eoq;->b(Ljava/lang/String;)V

    .line 1767
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->l(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1768
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 1769
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLastSettings() notifyUpdateSettingList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1771
    :cond_0
    return-void
.end method
