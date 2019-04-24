.class Lo/cvu$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvu;->getBTCInfoResponse()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cvu;


# direct methods
.method constructor <init>(Lo/cvu;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lo/cvu$15;->c:Lo/cvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 485
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 486
    iget-object v0, p0, Lo/cvu$15;->c:Lo/cvu;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/cvu;->d(Lo/cvu;Ljava/lang/String;)Ljava/lang/String;

    .line 487
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "btcInfoResponse = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu$15;->c:Lo/cvu;

    invoke-static {v3}, Lo/cvu;->h(Lo/cvu;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 489
    :cond_0
    iget-object v0, p0, Lo/cvu$15;->c:Lo/cvu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cvu;->d(Lo/cvu;Ljava/lang/String;)Ljava/lang/String;

    .line 491
    :goto_0
    iget-object v0, p0, Lo/cvu$15;->c:Lo/cvu;

    const-string v1, "getBTCInfoResponse"

    invoke-static {}, Lo/cvu;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cvu;->c(Lo/cvu;Ljava/lang/String;Ljava/lang/Object;)V

    .line 492
    return-void
.end method
