.class Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;

.field final synthetic val$lastCheckedTime:J


# direct methods
.method constructor <init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;J)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;

    iput-wide p2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;->val$lastCheckedTime:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;

    iget-object v1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;->this$0:Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;

    invoke-static {v1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->access$000(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->access$100(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "LAST_TIME_CHECKED"

    iget-wide v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;->val$lastCheckedTime:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "GmailInboxServiceImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;->call()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
