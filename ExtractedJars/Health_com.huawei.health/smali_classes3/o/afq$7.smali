.class Lo/afq$7;
.super Lo/afq$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->c(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/afq;

.field final synthetic b:Lo/afr;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/afq;ILo/afr;Z)V
    .locals 0

    .line 416
    iput-object p1, p0, Lo/afq$7;->a:Lo/afq;

    iput-object p3, p0, Lo/afq$7;->b:Lo/afr;

    iput-boolean p4, p0, Lo/afq$7;->e:Z

    invoke-direct {p0, p1, p2}, Lo/afq$c;-><init>(Lo/afq;I)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 419
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FileManager toDownloadFileList the file is not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/agx;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v1}, Lo/afr;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 423
    iget-boolean v0, p0, Lo/afq$7;->e:Z

    if-eqz v0, :cond_2

    .line 424
    iget-object v0, p0, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v0}, Lo/afr;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/afq;->a(Ljava/lang/String;)D

    move-result-wide v5

    .line 425
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "File size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-gtz v0, :cond_0

    .line 428
    return-void

    .line 431
    :cond_0
    iget-object v0, p0, Lo/afq$7;->a:Lo/afq;

    invoke-static {v0}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 432
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback size "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    iget-object v0, p0, Lo/afq$7;->a:Lo/afq;

    invoke-static {v0}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x12c

    invoke-interface {v0, v2, v1}, Lo/aff;->onResult(ILjava/lang/String;)V

    .line 435
    :cond_1
    return-void

    .line 438
    :cond_2
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    iget-object v1, p0, Lo/afq$7;->a:Lo/afq;

    invoke-static {v1}, Lo/afq;->e(Lo/afq;)Lo/aey;

    move-result-object v1

    iget-object v2, p0, Lo/afq$7;->b:Lo/afr;

    invoke-virtual {v2}, Lo/afr;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/afq$7$2;

    invoke-direct {v3, p0}, Lo/afq$7$2;-><init>(Lo/afq$7;)V

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/afn;->e(Lo/aey;Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 500
    return-void
.end method
