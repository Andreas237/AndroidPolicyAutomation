.class Lo/fih$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fih;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fih;

.field final synthetic d:Lo/fil;


# direct methods
.method constructor <init>(Lo/fih;Lo/fil;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/fih$1;->b:Lo/fih;

    iput-object p2, p0, Lo/fih$1;->d:Lo/fil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 72
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 73
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const-string v0, "from"

    const-string v1, "4"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v0, "activityId"

    iget-object v1, p0, Lo/fih$1;->d:Lo/fil;

    invoke-virtual {v1}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fih$1;->b:Lo/fih;

    invoke-static {v1}, Lo/fih;->d(Lo/fih;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->Q:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 77
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/fih$1;->b:Lo/fih;

    invoke-static {v0}, Lo/fih;->d(Lo/fih;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 79
    const-string v0, "url"

    iget-object v1, p0, Lo/fih$1;->d:Lo/fil;

    invoke-virtual {v1}, Lo/fil;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 80
    const-string v0, "EXTRA_BI_ID"

    iget-object v1, p0, Lo/fih$1;->d:Lo/fil;

    invoke-virtual {v1}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lo/fih$1;->d:Lo/fil;

    invoke-virtual {v1}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ACT"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    iget-object v0, p0, Lo/fih$1;->b:Lo/fih;

    invoke-static {v0}, Lo/fih;->d(Lo/fih;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lo/fih$1;->b:Lo/fih;

    invoke-static {v0}, Lo/fih;->d(Lo/fih;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/fih$1$3;

    invoke-direct {v2, p0}, Lo/fih$1$3;-><init>(Lo/fih$1;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 128
    :goto_0
    return-void
.end method
