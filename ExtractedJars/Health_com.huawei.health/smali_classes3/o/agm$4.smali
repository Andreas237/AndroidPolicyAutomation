.class Lo/agm$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/agm;


# direct methods
.method constructor <init>(Lo/agm;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lo/agm$4;->a:Lo/agm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 338
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 333
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 0

    .line 364
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 343
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 4

    .line 347
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStatusChanged "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    const/4 v0, 0x3

    if-ne v0, p2, :cond_0

    .line 349
    iget-object v0, p0, Lo/agm$4;->a:Lo/agm;

    invoke-static {v0}, Lo/agm;->g(Lo/agm;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 350
    iget-object v0, p0, Lo/agm$4;->a:Lo/agm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/agm;->b(Lo/agm;Z)Z

    goto :goto_0

    .line 351
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 352
    iget-object v0, p0, Lo/agm$4;->a:Lo/agm;

    invoke-static {v0}, Lo/agm;->g(Lo/agm;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 353
    iget-object v0, p0, Lo/agm$4;->a:Lo/agm;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/agm;->b(Lo/agm;Z)Z

    goto :goto_0

    .line 354
    :cond_1
    const/4 v0, -0x3

    if-ne v0, p2, :cond_2

    .line 355
    iget-object v0, p0, Lo/agm$4;->a:Lo/agm;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/agm;->c(Lo/agm;ZZ)Z

    .line 356
    iget-object v0, p0, Lo/agm$4;->a:Lo/agm;

    invoke-static {v0}, Lo/agm;->g(Lo/agm;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 357
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Clear the user data is complete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    :cond_2
    :goto_0
    return-void
.end method
