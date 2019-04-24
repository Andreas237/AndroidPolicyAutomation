.class public Lo/cav;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/ald;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/cau;Lo/cao;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/caz;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-string v0, "Step_UIHandler"

    iput-object v0, p0, Lo/cav;->c:Ljava/lang/String;

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cav;->d:Ljava/util/Map;

    .line 23
    new-instance v0, Lo/ald;

    invoke-direct {v0}, Lo/ald;-><init>()V

    iput-object v0, p0, Lo/cav;->a:Lo/ald;

    .line 26
    invoke-virtual {p1, p0}, Lo/caz;->d(Lo/cav;)V

    .line 27
    return-void
.end method


# virtual methods
.method public a(Lo/cau;)V
    .locals 2

    .line 48
    iget-object v0, p0, Lo/cav;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/cao;

    .line 49
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lo/cao;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {v1}, Lo/cao;->b()V

    .line 52
    :cond_0
    return-void
.end method

.method public b()V
    .locals 3

    .line 73
    iget-object v0, p0, Lo/cav;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cao;

    .line 74
    invoke-virtual {v2}, Lo/cao;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {v2}, Lo/cao;->d()V

    .line 77
    :cond_0
    goto :goto_0

    .line 78
    :cond_1
    return-void
.end method

.method public c()V
    .locals 7

    .line 60
    iget-object v0, p0, Lo/cav;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cao;

    .line 62
    :try_start_0
    invoke-virtual {v5}, Lo/cao;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/cav;->a:Lo/ald;

    invoke-virtual {v5, v0}, Lo/cao;->d(Lo/ald;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    :cond_0
    goto :goto_1

    .line 65
    :catch_0
    move-exception v6

    .line 66
    iget-object v0, p0, Lo/cav;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :goto_1
    goto :goto_0

    .line 69
    :cond_1
    return-void
.end method

.method public c(Lo/cau;)V
    .locals 1

    .line 36
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1, v0}, Lo/cav;->e(Lo/cau;Landroid/os/Bundle;)V

    .line 37
    return-void
.end method

.method d(Lo/cau;Lo/cao;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lo/cav;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    return-void
.end method

.method public e(Lo/ald;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cav;->a:Lo/ald;

    invoke-virtual {v0, p1}, Lo/ald;->a(Lo/ald;)V

    .line 56
    invoke-virtual {p0}, Lo/cav;->c()V

    .line 57
    return-void
.end method

.method public e(Lo/cau;Landroid/os/Bundle;)V
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 41
    iget-object v0, p0, Lo/cav;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/cao;

    .line 42
    if-eqz v1, :cond_0

    .line 43
    invoke-virtual {v1, p2}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 45
    :cond_0
    return-void
.end method
