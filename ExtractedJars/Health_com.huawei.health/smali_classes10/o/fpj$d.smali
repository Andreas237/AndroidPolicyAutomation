.class abstract Lo/fpj$d;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fpj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lo/fpj;


# direct methods
.method protected constructor <init>(Lo/fpj;Ljava/lang/String;)V
    .locals 1

    .line 255
    iput-object p1, p0, Lo/fpj$d;->d:Lo/fpj;

    .line 256
    sget-object v0, Lo/fpj;->c:Ljava/lang/ThreadGroup;

    invoke-direct {p0, v0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    .line 257
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fpj$d;->setDaemon(Z)V

    .line 258
    return-void
.end method


# virtual methods
.method protected abstract d()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public run()V
    .locals 4

    .line 261
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "Starting network stage thread [{}]"

    invoke-virtual {p0}, Lo/fpj$d;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 264
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lo/fpj$d;->d()V

    .line 265
    iget-object v0, p0, Lo/fpj$d;->d:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->e(Lo/fpj;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "Network stage thread [{}] was stopped successfully"

    invoke-virtual {p0}, Lo/fpj$d;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    goto :goto_2

    .line 276
    :cond_0
    goto :goto_0

    .line 269
    :catch_0
    move-exception v3

    .line 270
    iget-object v0, p0, Lo/fpj$d;->d:Lo/fpj;

    invoke-static {v0}, Lo/fpj;->e(Lo/fpj;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "Exception in network stage thread [{}]:"

    invoke-virtual {p0}, Lo/fpj$d;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 273
    :cond_1
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "Network stage thread [{}] was stopped successfully at:"

    invoke-virtual {p0}, Lo/fpj$d;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    goto :goto_2

    .line 276
    :goto_1
    goto :goto_0

    .line 278
    :goto_2
    return-void
.end method
