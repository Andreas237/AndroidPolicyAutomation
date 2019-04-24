.class Lo/bwz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwz;->b(Lo/bwz$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bwz;

.field final synthetic e:Lo/bxw;


# direct methods
.method constructor <init>(Lo/bwz;Lo/bxw;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/bwz$1;->b:Lo/bwz;

    iput-object p2, p0, Lo/bwz$1;->e:Lo/bxw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 195
    iget-object v0, p0, Lo/bwz$1;->b:Lo/bwz;

    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v1

    invoke-interface {v1}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bwz;->e(Lo/bwz;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 196
    iget-object v0, p0, Lo/bwz$1;->b:Lo/bwz;

    invoke-static {v0}, Lo/bwz;->c(Lo/bwz;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bwz$1;->b:Lo/bwz;

    invoke-static {v0}, Lo/bwz;->c(Lo/bwz;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v1, v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/bwz$1;->b:Lo/bwz;

    invoke-static {v0}, Lo/bwz;->e(Lo/bwz;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 198
    return-void

    .line 200
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 201
    const-string v0, "runType"

    iget-object v1, p0, Lo/bwz$1;->e:Lo/bxw;

    invoke-virtual {v1}, Lo/bxw;->c()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 202
    iget-object v0, p0, Lo/bwz$1;->b:Lo/bwz;

    invoke-static {v0}, Lo/bwz;->d(Lo/bwz;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 203
    return-void
.end method
