.class Lo/aqp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqp;->c(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:Lo/aqp;


# direct methods
.method constructor <init>(Lo/aqp;Ljava/util/List;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lo/aqp$4;->c:Lo/aqp;

    iput-object p2, p0, Lo/aqp$4;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 204
    iget-object v0, p0, Lo/aqp$4;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 206
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 208
    iget-object v0, p0, Lo/aqp$4;->c:Lo/aqp;

    invoke-virtual {v0, v3}, Lo/aqp;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_1

    .line 210
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 212
    iget-object v0, p0, Lo/aqp$4;->c:Lo/aqp;

    invoke-virtual {v0, v3}, Lo/aqp;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_1

    .line 214
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 216
    iget-object v0, p0, Lo/aqp$4;->c:Lo/aqp;

    invoke-static {v0, v3}, Lo/aqp;->b(Lo/aqp;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 218
    :cond_2
    :goto_1
    goto :goto_0

    .line 219
    :cond_3
    return-void
.end method
