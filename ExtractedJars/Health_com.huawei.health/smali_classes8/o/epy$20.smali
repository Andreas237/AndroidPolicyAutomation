.class Lo/epy$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epy;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/epy;


# direct methods
.method constructor <init>(Lo/epy;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lo/epy$20;->e:Lo/epy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 400
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go to WEIGHT_CARD record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    iget-object v0, p0, Lo/epy$20;->e:Lo/epy;

    sget-object v1, Lo/dae;->aW:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epy;->c(Lo/epy;Ljava/lang/String;)V

    .line 402
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/epy$20;->e:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 403
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 404
    iget-object v0, p0, Lo/epy$20;->e:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 405
    return-void
.end method
