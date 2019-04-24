.class Lo/dkp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ddf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dkp;


# direct methods
.method constructor <init>(Lo/dkp;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 349
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->f(Lo/dkp;)I

    move-result v0

    const/4 v1, 0x3

    if-gt v1, v0, :cond_0

    .line 350
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download retry finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->i(Lo/dkp;)V

    .line 352
    return-void

    .line 354
    :cond_0
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->n(Lo/dkp;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v1}, Lo/dkp;->m(Lo/dkp;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v0, v1, :cond_2

    .line 355
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->l(Lo/dkp;)I

    .line 356
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->m(Lo/dkp;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v1}, Lo/dkp;->n(Lo/dkp;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 357
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkp;->b(Lo/dkp;I)I

    .line 358
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->o(Lo/dkp;)I

    .line 359
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->f(Lo/dkp;)I

    move-result v0

    const/4 v1, 0x3

    if-gt v1, v0, :cond_1

    .line 360
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download retry finish done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->i(Lo/dkp;)V

    .line 362
    return-void

    .line 366
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    iget-object v1, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v1}, Lo/dkp;->m(Lo/dkp;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v2}, Lo/dkp;->n(Lo/dkp;)I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v2}, Lo/dkp;->p(Lo/dkp;)Lo/ddf;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dkp;->b(Lo/dkp;Ljava/lang/String;Lo/ddf;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 369
    goto :goto_0

    .line 367
    :catch_0
    move-exception v4

    .line 368
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    goto :goto_0

    .line 372
    :cond_2
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->i(Lo/dkp;)V

    .line 374
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 341
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileCallback download success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/dkp;->c(Lo/dkp;I)I

    .line 343
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkp;->c(Lo/dkp;Z)Z

    .line 344
    iget-object v0, p0, Lo/dkp$4;->b:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->g(Lo/dkp;)V

    .line 345
    return-void
.end method
