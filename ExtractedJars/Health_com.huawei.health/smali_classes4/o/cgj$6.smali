.class Lo/cgj$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgj;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cgj;


# direct methods
.method constructor <init>(Lo/cgj;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lo/cgj$6;->d:Lo/cgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 370
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 371
    iget-object v0, p0, Lo/cgj$6;->d:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->g(Lo/cgj;)Lo/chz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    invoke-virtual {v0, p1, v1}, Lo/chz;->e(Ljava/lang/String;Lo/elc$b;)V

    goto :goto_0

    .line 372
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 373
    iget-object v0, p0, Lo/cgj$6;->d:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->g(Lo/cgj;)Lo/chz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elc$b;

    invoke-virtual {v0, p1, v1, v2}, Lo/chz;->d(Ljava/lang/String;Lo/elc$b;Lo/elc$b;)V

    goto :goto_0

    .line 374
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 375
    iget-object v0, p0, Lo/cgj$6;->d:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->g(Lo/cgj;)Lo/chz;

    move-result-object v0

    .line 376
    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/elc$b;

    .line 377
    const/4 v2, 0x1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elc$b;

    .line 378
    const/4 v3, 0x2

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/elc$b;

    .line 375
    invoke-virtual {v0, p1, v1, v2, v3}, Lo/chz;->e(Ljava/lang/String;Lo/elc$b;Lo/elc$b;Lo/elc$b;)V

    .line 380
    :cond_2
    :goto_0
    return-void
.end method
