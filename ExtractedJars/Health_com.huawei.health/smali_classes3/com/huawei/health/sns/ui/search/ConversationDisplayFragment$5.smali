.class Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$5;->b:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$5;->b:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

    sget-object v3, Lo/bbz$e;->c:Landroid/net/Uri;

    new-instance v1, Lo/axv;

    invoke-direct {v1}, Lo/axv;-><init>()V

    .line 149
    invoke-virtual {v1}, Lo/axv;->d()[Ljava/lang/String;

    move-result-object v4

    const-string v7, "top_time desc,last_message_date desc"

    .line 148
    const/16 v1, 0x6a5

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->startQuery(ILjava/lang/Object;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    goto :goto_0

    .line 152
    :catch_0
    move-exception v8

    .line 154
    const-string v0, "ConversationDisplayFragment"

    const-string v1, "startAsyncQuery SQLiteException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    :goto_0
    return-void
.end method
