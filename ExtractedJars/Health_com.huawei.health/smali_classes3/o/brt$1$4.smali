.class Lo/brt$1$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/brt$1;


# direct methods
.method constructor <init>(Lo/brt$1;)V
    .locals 0

    .line 712
    iput-object p1, p0, Lo/brt$1$4;->c:Lo/brt$1;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 1

    .line 731
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 733
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object p1, v0

    check-cast p1, Lcom/huawei/health/suggestion/model/Plan;

    .line 734
    invoke-static {p1}, Lo/bxn;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 735
    invoke-static {p1}, Lo/bxn;->c(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 737
    :cond_0
    iget-object v0, p0, Lo/brt$1$4;->c:Lo/brt$1;

    iget-object v0, v0, Lo/brt$1;->a:Lo/bui;

    invoke-virtual {v0, p1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 738
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 2

    .line 715
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 716
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 718
    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/model/Plan;

    .line 719
    invoke-static {v1}, Lo/bxn;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 720
    invoke-static {v1}, Lo/bxn;->c(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 722
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 723
    iget-object v0, p0, Lo/brt$1$4;->c:Lo/brt$1;

    iget-object v0, v0, Lo/brt$1;->a:Lo/bui;

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 725
    :cond_1
    iget-object v0, p0, Lo/brt$1$4;->c:Lo/brt$1;

    iget-object v0, v0, Lo/brt$1;->a:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 727
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 712
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/brt$1$4;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
