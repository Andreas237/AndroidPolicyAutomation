.class Lo/eof$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eof;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eof;

.field final synthetic c:I

.field final synthetic e:Lo/eaa;


# direct methods
.method constructor <init>(Lo/eof;ILo/eaa;)V
    .locals 0

    .line 377
    iput-object p1, p0, Lo/eof$4;->b:Lo/eof;

    iput p2, p0, Lo/eof$4;->c:I

    iput-object p3, p0, Lo/eof$4;->e:Lo/eaa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 380
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 381
    const/4 v4, 0x0

    .line 384
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 387
    goto :goto_0

    .line 385
    :catch_0
    move-exception v5

    .line 386
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassCastException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 389
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has message donot makeMessage, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    iget v0, p0, Lo/eof$4;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 391
    iget-object v0, p0, Lo/eof$4;->b:Lo/eof;

    invoke-static {v0}, Lo/eof;->b(Lo/eof;)V

    .line 393
    :cond_0
    return-void

    .line 396
    :cond_1
    iget-object v0, p0, Lo/eof$4;->e:Lo/eaa;

    const-string v1, "device"

    const-string v2, "device_scale_ota"

    new-instance v3, Lo/eof$4$1;

    invoke-direct {v3, p0}, Lo/eof$4$1;-><init>(Lo/eof$4;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/eaa;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 434
    :cond_2
    return-void
.end method
