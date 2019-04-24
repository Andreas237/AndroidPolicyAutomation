.class Lo/etw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etw;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/etw;


# direct methods
.method constructor <init>(Lo/etw;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/etw$4;->d:Lo/etw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 102
    iget-object v0, p0, Lo/etw$4;->d:Lo/etw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/etw;->d(Lo/etw;Z)Z

    .line 103
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 104
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 105
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 106
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 107
    iget-object v0, p0, Lo/etw$4;->d:Lo/etw;

    invoke-virtual {v0, v3}, Lo/etw;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 110
    :cond_0
    return-void
.end method
