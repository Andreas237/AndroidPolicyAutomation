.class Lo/cwi$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brq;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lo/cwi$9;->a:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 7

    .line 463
    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    .line 464
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 465
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 466
    const-string v0, "BUNLDE_FITNESS_DURATION"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 467
    const-string v0, "fitness_duration"

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FitnessAdapter  onChange workoutId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "  minutes="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    :cond_0
    iget-object v0, p0, Lo/cwi$9;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->k(Lo/cwi;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/cwi$9;->a:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->k(Lo/cwi;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x514

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 472
    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 455
    iget-object v0, p0, Lo/cwi$9;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 456
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 457
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 459
    return-void
.end method
