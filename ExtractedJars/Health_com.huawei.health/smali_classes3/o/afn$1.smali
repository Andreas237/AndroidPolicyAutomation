.class Lo/afn$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afn;->d(Ljava/lang/String;Lo/aff;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/afn;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/afj;

.field final synthetic d:Lo/aff;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/afn;Lo/afj;Ljava/lang/String;Lo/aff;I)V
    .locals 0

    .line 709
    iput-object p1, p0, Lo/afn$1;->a:Lo/afn;

    iput-object p2, p0, Lo/afn$1;->c:Lo/afj;

    iput-object p3, p0, Lo/afn$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lo/afn$1;->d:Lo/aff;

    iput p5, p0, Lo/afn$1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 7

    .line 712
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unZip jniLibs resultCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 713
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    iget-object v1, p0, Lo/afn$1;->c:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v3

    iget-object v4, p0, Lo/afn$1;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afn$1;->c:Lo/afj;

    invoke-virtual {v3}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    sget-object v5, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v5

    .line 717
    :try_start_0
    iget-object v0, p0, Lo/afn$1;->d:Lo/aff;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 718
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resultCallBack is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    iget-object v0, p0, Lo/afn$1;->d:Lo/aff;

    iget v1, p0, Lo/afn$1;->e:I

    iget-object v2, p0, Lo/afn$1;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lo/aff;->onResult(ILjava/lang/String;)V

    goto :goto_0

    .line 721
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resultCallBack is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 723
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 725
    :goto_1
    return-void
.end method
