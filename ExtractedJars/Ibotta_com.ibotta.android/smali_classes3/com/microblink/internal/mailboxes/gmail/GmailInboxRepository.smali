.class public final Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;
.super Lcom/microblink/internal/AndroidRepository;


# static fields
.field private static final ANDROID_HTTP_CLIENT:Ljava/lang/String; = "com.google.api.client.extensions.android.http.AndroidHttp"

.field private static final API_CLIENT_GSON:Ljava/lang/String; = "com.google.api.client.json.gson.GsonFactory"

.field private static final GMAIL_CLASS_NAME:Ljava/lang/String; = "com.google.api.services.gmail.Gmail"

.field private static final PLAY_SERVICES_AUTH:Ljava/lang/String; = "com.google.android.gms.auth.api.signin.GoogleSignIn"

.field static final PROVIDER:Ljava/lang/String; = "gmail"

.field private static final TAG:Ljava/lang/String; = "GmailInboxRepository"

.field private static final TASKS_CLASS_NAME:Ljava/lang/String; = "com.google.android.gms.tasks.Tasks"


# instance fields
.field private service:Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/microblink/internal/AndroidRepository;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;

    invoke-direct {v0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxServiceImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->service:Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;

    return-void
.end method

.method public static checkSymbols()V
    .locals 2

    const-string v0, "com.google.android.gms.tasks.Tasks"

    invoke-static {v0}, Lcom/microblink/internal/Validate;->isInClassPath(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "com.google.api.services.gmail.Gmail"

    invoke-static {v0}, Lcom/microblink/internal/Validate;->isInClassPath(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "com.google.android.gms.auth.api.signin.GoogleSignIn"

    invoke-static {v0}, Lcom/microblink/internal/Validate;->isInClassPath(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "com.google.api.client.extensions.android.http.AndroidHttp"

    invoke-static {v0}, Lcom/microblink/internal/Validate;->isInClassPath(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "com.google.api.client.json.gson.GsonFactory"

    invoke-static {v0}, Lcom/microblink/internal/Validate;->isInClassPath(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/microblink/SymbolsNotFoundException;

    const-string v1, "com.google.api.client.json.gson.GsonFactory was not found in the class path. Please add com.google.http-client:google-http-client-gson"

    invoke-direct {v0, v1}, Lcom/microblink/SymbolsNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/microblink/SymbolsNotFoundException;

    const-string v1, "com.google.api.client.extensions.android.http.AndroidHttp was not found in the class path. Please add com.google.api-client:google-api-client-android"

    invoke-direct {v0, v1}, Lcom/microblink/SymbolsNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/microblink/SymbolsNotFoundException;

    const-string v1, "com.google.android.gms.auth.api.signin.GoogleSignIn was not found in the class path. Please add com.google.android.gms:play-services-auth"

    invoke-direct {v0, v1}, Lcom/microblink/SymbolsNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lcom/microblink/SymbolsNotFoundException;

    const-string v1, "com.google.api.services.gmail.Gmail was not found in the class path. Please add com.google.apis:google-api-services-gmail"

    invoke-direct {v0, v1}, Lcom/microblink/SymbolsNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lcom/microblink/SymbolsNotFoundException;

    const-string v1, "com.google.android.gms.tasks.Tasks was not found in the class path. Please add com.google.android.gms:play-services-tasks"

    invoke-direct {v0, v1}, Lcom/microblink/SymbolsNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final applyToken()V
    .locals 0

    return-void
.end method

.method public final lastCheckedTime(J)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->service:Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;

    invoke-interface {v0, p1, p2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;->lastCheckedTime(J)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository$1;

    invoke-direct {p2, p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository$1;-><init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final limit(I)Ljava/util/Date;
    .locals 9

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->service:Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;

    invoke-interface {v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;->lastCheckedTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    int-to-long v4, p1

    const-wide/32 v6, 0x5265c00

    mul-long v4, v4, v6

    cmp-long p1, v2, v4

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-wide/16 v2, -0x1

    cmp-long v8, v0, v2

    if-eqz v8, :cond_1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/Date;

    sub-long/2addr v0, v6

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v4

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1
.end method

.method public final merchants()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lcom/microblink/internal/ExecutorSupplier;->getInstance()Lcom/microblink/internal/ExecutorSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/ExecutorSupplier;->network()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/microblink/internal/mailboxes/InboxMerchantsReadCallable;

    invoke-virtual {p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->context()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/microblink/internal/mailboxes/InboxMerchantsReadCallable;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final messages(Lcom/google/api/services/gmail/Gmail;Ljava/util/List;Ljava/util/Date;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/api/services/gmail/Gmail;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/api/services/gmail/Gmail;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;",
            "Ljava/util/Date;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessages;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/microblink/internal/ExecutorSupplier;->getInstance()Lcom/microblink/internal/ExecutorSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/ExecutorSupplier;->network()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;

    invoke-direct {v1, p1, p2, p3}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessagesCallable;-><init>(Lcom/google/api/services/gmail/Gmail;Ljava/util/List;Ljava/util/Date;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final readInbox(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/microblink/ScanOptions;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;",
            "Lcom/microblink/ScanOptions;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/mailboxes/gmail/GmailInboxMessage;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/microblink/ScanResults;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lcom/microblink/internal/ExecutorSupplier;->getInstance()Lcom/microblink/internal/ExecutorSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/ExecutorSupplier;->network()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;

    invoke-direct {v1, p2, p3}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScrapeCallable;-><init>(Lcom/microblink/ScanOptions;Ljava/util/List;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance p3, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;

    invoke-direct {p3, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    invoke-virtual {p2, p3}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

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

    iget-object v0, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->service:Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;

    invoke-interface {v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxService;->removeLastCheckedTime()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
