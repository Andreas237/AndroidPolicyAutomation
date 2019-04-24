.class Lo/brt$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->d(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic d:Lo/brt;


# direct methods
.method constructor <init>(Lo/brt;Lo/bui;)V
    .locals 0

    .line 772
    iput-object p1, p0, Lo/brt$10;->d:Lo/brt;

    iput-object p2, p0, Lo/brt$10;->a:Lo/bui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 775
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 776
    if-eqz v4, :cond_0

    .line 777
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/brt$10;->a:Lo/bui;

    invoke-interface {v0, v1, v2}, Lo/bsp;->c(Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 779
    :cond_0
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentRunPlanRecord  have no current plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    :goto_0
    return-void
.end method
