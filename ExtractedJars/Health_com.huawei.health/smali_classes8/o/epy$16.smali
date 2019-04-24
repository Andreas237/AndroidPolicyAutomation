.class Lo/epy$16;
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
.field final synthetic b:Lo/epy;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lo/epy;Z)V
    .locals 0

    .line 378
    iput-object p1, p0, Lo/epy$16;->b:Lo/epy;

    iput-boolean p2, p0, Lo/epy$16;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 382
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 383
    const-string v0, "hasData"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    const-string v0, "guideLanguage"

    const-string v1, ""

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    sget-object v0, Lo/dae;->eN:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 386
    iget-object v0, p0, Lo/epy$16;->b:Lo/epy;

    sget-object v1, Lo/dae;->aQ:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epy;->c(Lo/epy;Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lo/epy$16;->b:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    iget-boolean v1, p0, Lo/epy$16;->c:Z

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Landroid/content/Context;ZZ)V

    .line 390
    return-void
.end method
