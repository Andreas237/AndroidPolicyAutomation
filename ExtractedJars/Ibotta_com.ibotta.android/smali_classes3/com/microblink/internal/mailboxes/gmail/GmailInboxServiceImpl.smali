.class final Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;


# static fields
.field private static final LAST_TIME_CHECKED:Ljava/lang/String; = "LAST_TIME_CHECKED"

.field private static final SHARED_PREFERENCES:Ljava/lang/String; = "com.microblink.INBOX_GMAIL"

.field private static final TAG:Ljava/lang/String; = "GmailInboxServiceImpl"


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method private sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "com.microblink.INBOX_GMAIL"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final lastCheckedTime()J
    .locals 5

    const-wide/16 v0, -0x1

    :try_start_0
    iget-object v2, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->context:Landroid/content/Context;

    invoke-direct {p0, v2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;->sharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "LAST_TIME_CHECKED"

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v2

    const-string v3, "GmailInboxServiceImpl"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-wide v0
.end method

.method public final lastCheckedTime(J)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$1;-><init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;J)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final removeLastCheckedTime()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$2;

    invoke-direct {v0, p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl$2;-><init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
