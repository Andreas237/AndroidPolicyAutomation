.class Lo/fct$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fct;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic e:Lo/fct;


# direct methods
.method constructor <init>(Lo/fct;I)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/fct$4;->e:Lo/fct;

    iput p2, p0, Lo/fct$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 110
    iget v0, p0, Lo/fct$4;->a:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/fct$4;->a:I

    iget-object v1, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v1}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_1

    .line 111
    :cond_0
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick  position Out of bounds exception... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void

    .line 114
    :cond_1
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click type == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v3}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lo/fct$4;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/fda;

    invoke-virtual {v3}, Lo/fda;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; isPressureCalibrate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v3}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lo/fct$4;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/fda;

    invoke-virtual {v3}, Lo/fda;->k()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/fct$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/fct$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->k()Z

    move-result v0

    if-nez v0, :cond_2

    .line 117
    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->c(Lo/fct;)V

    goto/16 :goto_0

    .line 118
    :cond_2
    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/fct$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xd

    if-ne v1, v0, :cond_3

    .line 119
    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->d(Lo/fct;)V

    goto/16 :goto_0

    .line 121
    :cond_3
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->e(Lo/fct;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 122
    const-string v0, "weight_details_type_key"

    iget-object v1, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v1}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/fct$4;->a:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fda;

    invoke-virtual {v1}, Lo/fda;->e()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 123
    const-string v0, "weight_details_data_key"

    iget-object v1, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v1}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/fct$4;->a:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fda;

    invoke-virtual {v1}, Lo/fda;->a()D

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 124
    const-string v0, "weight_details_time"

    iget-object v1, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v1}, Lo/fct;->a(Lo/fct;)Lo/acn;

    move-result-object v1

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 125
    const-string v0, "weight_details_weight_bean_key"

    iget-object v1, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v1}, Lo/fct;->b(Lo/fct;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/fct$4;->a:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fda;

    invoke-virtual {v1}, Lo/fda;->h()Lo/acn;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 127
    const-string v0, "weight_details_type_key"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 128
    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->e(Lo/fct;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lo/fct;->e(Landroid/content/Context;I)V

    .line 129
    iget-object v0, p0, Lo/fct$4;->e:Lo/fct;

    invoke-static {v0}, Lo/fct;->e(Lo/fct;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 131
    :goto_0
    return-void
.end method
