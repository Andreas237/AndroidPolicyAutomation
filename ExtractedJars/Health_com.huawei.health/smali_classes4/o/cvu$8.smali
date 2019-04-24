.class Lo/cvu$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvu;->getLockscreenStatus()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cvu;


# direct methods
.method constructor <init>(Lo/cvu;)V
    .locals 0

    .line 769
    iput-object p1, p0, Lo/cvu$8;->b:Lo/cvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 772
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 773
    iget-object v0, p0, Lo/cvu$8;->b:Lo/cvu;

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lo/cvu;->e(Lo/cvu;I)I

    .line 774
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLockscreenStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu$8;->b:Lo/cvu;

    invoke-static {v3}, Lo/cvu;->k(Lo/cvu;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 777
    :cond_0
    iget-object v0, p0, Lo/cvu$8;->b:Lo/cvu;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/cvu;->e(Lo/cvu;I)I

    .line 779
    :goto_0
    iget-object v0, p0, Lo/cvu$8;->b:Lo/cvu;

    const-string v1, "getLockscreenStatus"

    invoke-static {}, Lo/cvu;->n()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cvu;->c(Lo/cvu;Ljava/lang/String;Ljava/lang/Object;)V

    .line 780
    return-void
.end method
