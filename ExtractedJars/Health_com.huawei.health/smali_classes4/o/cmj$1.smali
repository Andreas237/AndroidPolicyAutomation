.class Lo/cmj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cmj;->b(Lo/cmj$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cmj$a;

.field final synthetic d:Lo/cmj;


# direct methods
.method constructor <init>(Lo/cmj;Lo/cmj$a;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lo/cmj$1;->d:Lo/cmj;

    iput-object p2, p0, Lo/cmj$1;->c:Lo/cmj$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 168
    iget-object v0, p0, Lo/cmj$1;->d:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->b(Lo/cmj;)Lo/abf;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cmj$1;->c:Lo/cmj$a;

    if-eqz v0, :cond_0

    .line 170
    :try_start_0
    iget-object v0, p0, Lo/cmj$1;->d:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->b(Lo/cmj;)Lo/abf;

    move-result-object v0

    iget-object v1, p0, Lo/cmj$1;->c:Lo/cmj$a;

    invoke-interface {v0, v1}, Lo/abf;->a(Lo/abd;)V

    .line 171
    iget-object v0, p0, Lo/cmj$1;->d:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->a(Lo/cmj;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/cmj$1;->c:Lo/cmj$a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    goto :goto_0

    .line 172
    :catch_0
    move-exception v3

    .line 173
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerTrackCallbackInter : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    :cond_0
    :goto_0
    return-void
.end method
