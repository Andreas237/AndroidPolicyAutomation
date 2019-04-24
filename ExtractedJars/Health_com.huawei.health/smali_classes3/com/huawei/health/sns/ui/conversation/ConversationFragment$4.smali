.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V
    .locals 0

    .line 393
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$4;->b:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 400
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$4;->b:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;

    sget-object v3, Lo/bbz$e;->c:Landroid/net/Uri;

    new-instance v1, Lo/axv;

    invoke-direct {v1}, Lo/axv;-><init>()V

    .line 401
    invoke-virtual {v1}, Lo/axv;->d()[Ljava/lang/String;

    move-result-object v4

    const-string v7, "top_time desc,last_message_date desc"

    .line 400
    const/16 v1, 0x6a5

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$ThreadListQueryHandler;->startQuery(ILjava/lang/Object;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$4;->b:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;J)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 408
    goto :goto_0

    .line 405
    :catch_0
    move-exception v8

    .line 407
    const-string v0, "ConversationFragment"

    const-string v1, "startAsyncQuery SQLiteException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    :goto_0
    return-void
.end method
