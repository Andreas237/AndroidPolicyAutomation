.class Lo/aew$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aby;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aew;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/aew;


# direct methods
.method constructor <init>(Lo/aew;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/aew$5;->e:Lo/aew;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lo/acl;)V
    .locals 2

    .line 62
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->a(Lo/aew;)Lo/acl;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->a(Lo/aew;)Lo/acl;

    move-result-object v0

    invoke-virtual {v0}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 63
    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v1}, Lo/aew;->a(Lo/aew;)Lo/acl;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->c(Lo/aew;)Lo/aby;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 66
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->c(Lo/aew;)Lo/aby;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/aby;->onDeviceFound(Lo/acl;)V

    .line 67
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-virtual {v0}, Lo/aew;->a()V

    .line 71
    :cond_0
    return-void
.end method

.method public onScanFailed(I)V
    .locals 4

    .line 75
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onScanFailed code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->b(Lo/aew;)V

    .line 77
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->c(Lo/aew;)Lo/aby;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 78
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->c(Lo/aew;)Lo/aby;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/aby;->onScanFailed(I)V

    .line 80
    :cond_0
    return-void
.end method

.method public onStateChanged(I)V
    .locals 4

    .line 84
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStateChanged code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->c(Lo/aew;)Lo/aby;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/aew$5;->e:Lo/aew;

    invoke-static {v0}, Lo/aew;->c(Lo/aew;)Lo/aby;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/aby;->onStateChanged(I)V

    .line 88
    :cond_0
    return-void
.end method
