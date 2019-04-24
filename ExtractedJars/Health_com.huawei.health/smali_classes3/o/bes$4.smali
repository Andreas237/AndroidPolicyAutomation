.class final Lo/bes$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bes;->k(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lo/bes$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 525
    invoke-virtual {p0, p1}, Lo/bes$4;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 11

    .line 530
    new-instance v3, Lo/axs;

    iget-object v0, p0, Lo/bes$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 531
    invoke-virtual {v3}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 532
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 534
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 536
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/axq;

    .line 539
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    iget-object v1, p0, Lo/bes$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 540
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "image"

    .line 539
    invoke-virtual {v0, v1, v2}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 541
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bbj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 542
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/bpk;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 544
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 545
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 549
    :try_start_0
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v10

    .line 550
    if-nez v10, :cond_2

    .line 552
    const-string v0, "ChatViewLongClickHelper"

    const-string v1, "assistant mediaCacheFile delete fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    :cond_2
    const-string v0, "ChatViewLongClickHelper"

    const-string v1, "assistant mediaCacheFile deleted"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 559
    goto :goto_1

    .line 556
    :catch_0
    move-exception v10

    .line 558
    const-string v0, "ChatViewLongClickHelper"

    const-string v1, "assistant mediaCacheFile delete fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    :cond_3
    :goto_1
    goto/16 :goto_0

    .line 563
    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
