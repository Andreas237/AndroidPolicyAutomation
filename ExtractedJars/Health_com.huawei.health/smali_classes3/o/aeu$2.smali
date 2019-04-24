.class Lo/aeu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aeu;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aeu;


# direct methods
.method constructor <init>(Lo/aeu;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 280
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/aeu;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startMeasure onDataChangeds"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 282
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    .line 284
    :cond_0
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 4

    .line 272
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/aeu;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startMeasure onDataChanged"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 274
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 276
    :cond_0
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 4

    .line 312
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/aeu;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startMeasure onFailed DeviceName"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 314
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/abx;->onFailed(Lo/acl;I)V

    .line 316
    :cond_0
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 4

    .line 288
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/aeu;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startMeasure onProgressChanged"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 290
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/abx;->onProgressChanged(Lo/acl;Lo/afz;)V

    .line 292
    :cond_0
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 6

    .line 296
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/aeu;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startMeasure onStatusChanged status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 298
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->k(Lo/aeu;)Lo/abx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 300
    :cond_0
    move-object v4, p1

    .line 301
    move v5, p2

    .line 302
    iget-object v0, p0, Lo/aeu$2;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->h(Lo/aeu;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/aeu$2$1;

    invoke-direct {v1, p0, v4, v5}, Lo/aeu$2$1;-><init>(Lo/aeu$2;Lo/acl;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 308
    return-void
.end method
