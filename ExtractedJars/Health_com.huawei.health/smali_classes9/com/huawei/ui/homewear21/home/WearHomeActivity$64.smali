.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aK()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 6033
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 6036
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 6037
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6038
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/etq;->c(Z)V

    .line 6041
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 6042
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 6043
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egy;)Lo/egy;

    .line 6045
    :cond_1
    return-void
.end method
