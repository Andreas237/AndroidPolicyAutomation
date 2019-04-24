.class Lo/fij$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fij;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fij;

.field final synthetic d:Lo/fil;


# direct methods
.method constructor <init>(Lo/fij;Lo/fil;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/fij$2;->a:Lo/fij;

    iput-object p2, p0, Lo/fij$2;->d:Lo/fil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 83
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 84
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    const-string v0, "from"

    const-string v1, "4"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v0, "activityId"

    iget-object v1, p0, Lo/fij$2;->d:Lo/fil;

    invoke-virtual {v1}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fij$2;->a:Lo/fij;

    invoke-static {v1}, Lo/fij;->c(Lo/fij;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->Q:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 89
    iget-object v0, p0, Lo/fij$2;->a:Lo/fij;

    invoke-static {v0}, Lo/fij;->c(Lo/fij;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/fij$2$1;

    invoke-direct {v2, p0}, Lo/fij$2$1;-><init>(Lo/fij$2;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 108
    return-void
.end method
