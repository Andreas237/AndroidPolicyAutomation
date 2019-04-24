.class Lo/ezi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezi$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezi;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ezi;


# direct methods
.method constructor <init>(Lo/ezi;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lo/ezi$2;->d:Lo/ezi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 3

    .line 362
    iget-object v0, p0, Lo/ezi$2;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->b(Lo/ezi;)Lo/ezi$g;

    move-result-object v0

    invoke-virtual {v0}, Lo/ezi$g;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 363
    iget-object v0, p0, Lo/ezi$2;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->b(Lo/ezi;)Lo/ezi$g;

    move-result-object v0

    invoke-virtual {v0}, Lo/ezi$g;->a()V

    .line 367
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/ezi$2;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->b(Lo/ezi;)Lo/ezi$g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/ezi$g;->a(I)V
    :try_end_0
    .catch Lo/ezi$f; {:try_start_0 .. :try_end_0} :catch_0

    .line 370
    goto :goto_0

    .line 368
    :catch_0
    move-exception v1

    .line 369
    iget-object v0, p0, Lo/ezi$2;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->b(Lo/ezi;)Lo/ezi$g;

    move-result-object v0

    invoke-virtual {v0}, Lo/ezi$g;->a()V

    .line 372
    :goto_0
    iget-object v0, p0, Lo/ezi$2;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->e(Lo/ezi;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ezi$i;

    .line 373
    invoke-interface {v2, p1, p2}, Lo/ezi$i;->a(Landroid/view/View;I)V

    .line 374
    goto :goto_1

    .line 375
    :cond_1
    return-void
.end method
