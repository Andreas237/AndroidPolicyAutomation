.class Lo/eah$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eak;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eah;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic d:Lo/eah;


# direct methods
.method constructor <init>(Lo/eah;J)V
    .locals 0

    .line 448
    iput-object p1, p0, Lo/eah$2;->d:Lo/eah;

    iput-wide p2, p0, Lo/eah$2;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 451
    invoke-static {}, Lo/eah;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pullMessageResult: =====>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "result=====>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 453
    iget-object v0, p0, Lo/eah$2;->d:Lo/eah;

    invoke-virtual {v0, p2}, Lo/eah;->c(Ljava/util/List;)Z

    move-result v4

    .line 454
    invoke-static {}, Lo/eah;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pullMessageResult: =====> insertBatch(list) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    iget-wide v0, p0, Lo/eah$2;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    .line 456
    iget-object v0, p0, Lo/eah$2;->d:Lo/eah;

    invoke-virtual {v0, p3}, Lo/eah;->d(Ljava/util/List;)V

    .line 458
    :cond_0
    return-void

    .line 460
    :cond_1
    iget-object v0, p0, Lo/eah$2;->d:Lo/eah;

    new-instance v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v1, v2, v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-static {v0, p1, v1}, Lo/eah;->b(Lo/eah;ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V

    .line 461
    return-void
.end method
