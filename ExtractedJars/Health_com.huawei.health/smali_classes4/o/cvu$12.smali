.class Lo/cvu$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvu;->openChannel(Ljava/lang/String;I)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cvu;


# direct methods
.method constructor <init>(Lo/cvu;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lo/cvu$12;->a:Lo/cvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 387
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 388
    move-object v4, p2

    check-cast v4, Lcom/huawei/datatype/PayOpenChannelInfo;

    .line 389
    iget-object v0, p0, Lo/cvu$12;->a:Lo/cvu;

    invoke-static {v0}, Lo/cvu;->b(Lo/cvu;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "apdu"

    invoke-virtual {v4}, Lcom/huawei/datatype/PayOpenChannelInfo;->getApdu()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    iget-object v0, p0, Lo/cvu$12;->a:Lo/cvu;

    invoke-static {v0}, Lo/cvu;->b(Lo/cvu;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "channelID"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/huawei/datatype/PayOpenChannelInfo;->getChannelID()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    goto :goto_0

    .line 392
    :cond_0
    iget-object v0, p0, Lo/cvu$12;->a:Lo/cvu;

    invoke-static {v0}, Lo/cvu;->b(Lo/cvu;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 394
    :goto_0
    iget-object v0, p0, Lo/cvu$12;->a:Lo/cvu;

    const-string v1, "openChannel"

    invoke-static {}, Lo/cvu;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cvu;->c(Lo/cvu;Ljava/lang/String;Ljava/lang/Object;)V

    .line 395
    return-void
.end method
