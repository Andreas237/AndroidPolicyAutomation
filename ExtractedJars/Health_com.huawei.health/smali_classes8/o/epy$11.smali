.class Lo/epy$11;
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
.field final synthetic a:Lo/epy;

.field final synthetic b:Landroid/support/v7/widget/RecyclerView$ViewHolder;

.field final synthetic d:Lo/epx;


# direct methods
.method constructor <init>(Lo/epy;Landroid/support/v7/widget/RecyclerView$ViewHolder;Lo/epx;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/epy$11;->a:Lo/epy;

    iput-object p2, p0, Lo/epy$11;->b:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iput-object p3, p0, Lo/epy$11;->d:Lo/epx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 202
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 203
    const-string v0, "hasData"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    const-string v0, "guideLanguage"

    iget-object v1, p0, Lo/epy$11;->b:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    check-cast v1, Lo/epy$b;

    invoke-static {v1}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    sget-object v0, Lo/dae;->eN:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 206
    iget-object v0, p0, Lo/epy$11;->a:Lo/epy;

    sget-object v1, Lo/dae;->aQ:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epy;->c(Lo/epy;Ljava/lang/String;)V

    .line 209
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 211
    iget-object v0, p0, Lo/epy$11;->a:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_main_no_device_click:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epy$11;->d:Lo/epx;

    invoke-virtual {v1}, Lo/epx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lo/epy$11;->a:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Landroid/content/Context;ZZ)V

    goto :goto_0

    .line 216
    :cond_0
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goto CommonSleepNoDataActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lo/epy$11;->a:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 221
    :cond_1
    iget-object v0, p0, Lo/epy$11;->a:Lo/epy;

    invoke-static {v0}, Lo/epy;->a(Lo/epy;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Landroid/content/Context;ZZ)V

    .line 223
    :goto_0
    return-void
.end method
