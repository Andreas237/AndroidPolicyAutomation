.class public final Lcom/microblink/GmailInboxManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;
    }
.end annotation


# static fields
.field private static READ_ONLY:Ljava/lang/String; = "https://www.googleapis.com/auth/gmail.readonly"

.field private static final READ_ONLY_SCOPE:Lcom/google/android/gms/common/api/Scope;

.field private static final RECOVERABLE_REQUEST_CODE:I = 0x232f

.field private static final SIGN_IN_REQUEST_CODE:I = 0x232e

.field private static final TAG:Ljava/lang/String; = "GmailInboxManager"

.field private static volatile instance:Lcom/microblink/GmailInboxManager;


# instance fields
.field private callback:Lcom/microblink/GmailInboxCallback;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private clientId:Ljava/lang/String;

.field private dayCutoff:I

.field private merchants:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/InboxMerchant;",
            ">;"
        }
    .end annotation
.end field

.field private final repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private signInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    sget-object v1, Lcom/microblink/GmailInboxManager;->READ_ONLY:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/microblink/GmailInboxManager;->READ_ONLY_SCOPE:Lcom/google/android/gms/common/api/Scope;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xe

    iput v0, p0, Lcom/microblink/GmailInboxManager;->dayCutoff:I

    sget-object v0, Lcom/microblink/internal/services/mailboxes/InboxService;->INBOX_MERCHANTS:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/GmailInboxManager;->merchants:Ljava/util/List;

    invoke-static {}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->checkSymbols()V

    new-instance v0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    invoke-direct {v0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Lcom/microblink/internal/ExecutorSupplier;->getInstance()Lcom/microblink/internal/ExecutorSupplier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/ExecutorSupplier;->network()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    invoke-virtual {v1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->merchants()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;

    invoke-direct {v2, p0}, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/microblink/internal/mailboxes/InboxMerchantsRemoteCallable;

    invoke-direct {v2}, Lcom/microblink/internal/mailboxes/InboxMerchantsRemoteCallable;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/microblink/internal/mailboxes/InboxMerchantStoreCallable;

    invoke-direct {v2, p1}, Lcom/microblink/internal/mailboxes/InboxMerchantStoreCallable;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;

    invoke-direct {v0, p0}, Lcom/microblink/GmailInboxManager$MerchantsOnSuccessListener;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lcom/microblink/GmailInboxManager$1;

    invoke-direct {v0, p0}, Lcom/microblink/GmailInboxManager$1;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/GmailInboxManager;)Lcom/microblink/GmailInboxCallback;
    .locals 0

    iget-object p0, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/GmailInboxManager;)Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;
    .locals 0

    iget-object p0, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/GmailInboxManager;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 0

    iget-object p0, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object p0
.end method

.method static synthetic access$202(Lcom/microblink/GmailInboxManager;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 0

    iput-object p1, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object p1
.end method

.method static synthetic access$300(Lcom/microblink/GmailInboxManager;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/GmailInboxManager;->merchants:Ljava/util/List;

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/microblink/GmailInboxManager;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/GmailInboxManager;->instance:Lcom/microblink/GmailInboxManager;

    if-nez v0, :cond_1

    const-class v0, Lcom/microblink/GmailInboxManager;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/microblink/GmailInboxManager;->instance:Lcom/microblink/GmailInboxManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/microblink/GmailInboxManager;

    invoke-direct {v1, p0}, Lcom/microblink/GmailInboxManager;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/microblink/GmailInboxManager;->instance:Lcom/microblink/GmailInboxManager;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/microblink/GmailInboxManager;->instance:Lcom/microblink/GmailInboxManager;

    return-object p0
.end method

.method private signedIn()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getAccount()Landroid/accounts/Account;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final callback(Lcom/microblink/GmailInboxCallback;)V
    .locals 0
    .param p1    # Lcom/microblink/GmailInboxCallback;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    return-void
.end method

.method public final clientId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/GmailInboxManager;->clientId:Ljava/lang/String;

    return-object v0
.end method

.method public final clientId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/GmailInboxManager;->clientId:Ljava/lang/String;

    return-void
.end method

.method public final dayCutoff(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    if-lez p1, :cond_0

    iput p1, p0, Lcom/microblink/GmailInboxManager;->dayCutoff:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Days should be greater than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final email()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, -0x1

    if-eq p2, p1, :cond_1

    iget-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/microblink/GmailInboxException;

    const-string p3, "Account unable to be recovered!"

    invoke-direct {p2, p3}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/GmailInboxManager;->signOut()V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lcom/microblink/GmailInboxCallback;->onSignedIn()V

    return-void

    :pswitch_1
    const/4 p1, 0x0

    :try_start_0
    invoke-static {p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getSignedInAccountFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    const-class p3, Lcom/google/android/gms/common/api/ApiException;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lcom/microblink/GmailInboxManager;->signOut()V

    const-string p2, "GmailInboxManager"

    const-string p3, "Google Sign In Account is null! (Sign In Request Code)"

    new-array v0, p1, [Ljava/lang/Object;

    invoke-static {p2, p3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    new-instance p3, Lcom/microblink/GmailInboxException;

    const-string v0, "Google Sign In Account is null! (Sign In Request Code)"

    invoke-direct {p3, v0}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_2
    return-void

    :cond_3
    iput-object p2, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    invoke-interface {p2}, Lcom/microblink/GmailInboxCallback;->onSignedIn()V

    :cond_4
    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    invoke-virtual {p2}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->applyToken()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const-string p3, "GmailInboxManager"

    invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p3, v0, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/microblink/GmailInboxManager;->signOut()V

    iget-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p1, :cond_5

    new-instance p3, Lcom/microblink/GmailInboxException;

    invoke-direct {p3, p2}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, p3}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_5
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x232e
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final readInbox(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lcom/microblink/ScanOptions;->newBuilder()Lcom/microblink/ScanOptions$Builder;

    move-result-object v0

    sget-object v1, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    invoke-virtual {v0, v1}, Lcom/microblink/ScanOptions$Builder;->retailer(Lcom/microblink/Retailer;)Lcom/microblink/ScanOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/ScanOptions$Builder;->build()Lcom/microblink/ScanOptions;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/microblink/GmailInboxManager;->readInbox(Landroid/app/Activity;Lcom/microblink/ScanOptions;)V

    return-void
.end method

.method public final readInbox(Landroid/app/Activity;Lcom/microblink/ScanOptions;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/ScanOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/microblink/GmailInboxManager;->signedIn()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/microblink/GmailInboxException;

    const-string v0, "Please sign in before accessing receipts!"

    invoke-direct {p2, v0}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_0
    return-void

    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v1, Lcom/microblink/GmailInboxManager;->READ_ONLY:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/google/api/client/googleapis/extensions/android/gms/auth/GoogleAccountCredential;->usingOAuth2(Landroid/content/Context;Ljava/util/Collection;)Lcom/google/api/client/googleapis/extensions/android/gms/auth/GoogleAccountCredential;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getAccount()Landroid/accounts/Account;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/api/client/googleapis/extensions/android/gms/auth/GoogleAccountCredential;->setSelectedAccount(Landroid/accounts/Account;)Lcom/google/api/client/googleapis/extensions/android/gms/auth/GoogleAccountCredential;

    new-instance v1, Lcom/google/api/services/gmail/Gmail$Builder;

    invoke-static {}, Lcom/google/api/client/extensions/android/http/AndroidHttp;->newCompatibleTransport()Lcom/google/api/client/http/HttpTransport;

    move-result-object v2

    invoke-static {}, Lcom/google/api/client/json/gson/GsonFactory;->getDefaultInstance()Lcom/google/api/client/json/gson/GsonFactory;

    move-result-object v3

    invoke-direct {v1, v2, v3, p1}, Lcom/google/api/services/gmail/Gmail$Builder;-><init>(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;Lcom/google/api/client/http/HttpRequestInitializer;)V

    const-string p1, "Google-TasksAndroidSample/1.0"

    invoke-virtual {v1, p1}, Lcom/google/api/services/gmail/Gmail$Builder;->setApplicationName(Ljava/lang/String;)Lcom/google/api/services/gmail/Gmail$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/api/services/gmail/Gmail$Builder;->build()Lcom/google/api/services/gmail/Gmail;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    iget-object v2, p0, Lcom/microblink/GmailInboxManager;->merchants:Ljava/util/List;

    iget-object v3, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    iget v4, p0, Lcom/microblink/GmailInboxManager;->dayCutoff:I

    invoke-virtual {v3, v4}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->limit(I)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->messages(Lcom/google/api/services/gmail/Gmail;Ljava/util/List;Ljava/util/Date;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v1, Lcom/microblink/GmailInboxManager$3;

    invoke-direct {v1, p0, v0, p2}, Lcom/microblink/GmailInboxManager$3;-><init>(Lcom/microblink/GmailInboxManager;Ljava/lang/ref/WeakReference;Lcom/microblink/ScanOptions;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lcom/microblink/GmailInboxManager$2;

    invoke-direct {p2, p0}, Lcom/microblink/GmailInboxManager$2;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p2, :cond_2

    new-instance v0, Lcom/microblink/GmailInboxException;

    invoke-direct {v0, p1}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p2, v0}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_2
    return-void
.end method

.method public final signIn(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/microblink/GmailInboxManager;->signIn(Landroid/app/Activity;Z)V

    return-void
.end method

.method public final signIn(Landroid/app/Activity;Z)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p2

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    sget-object v3, Lcom/microblink/GmailInboxManager;->READ_ONLY_SCOPE:Lcom/google/android/gms/common/api/Scope;

    aput-object v3, v2, v1

    invoke-static {p2, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->hasPermissions(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getAccount()Landroid/accounts/Account;

    move-result-object v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iget-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    invoke-interface {p1}, Lcom/microblink/GmailInboxCallback;->onSignedIn()V

    :cond_0
    return-void

    :cond_1
    iput-object v0, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    new-instance p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->DEFAULT_SIGN_IN:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {p2, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    sget-object v2, Lcom/microblink/GmailInboxManager;->READ_ONLY_SCOPE:Lcom/google/android/gms/common/api/Scope;

    new-array v3, v1, [Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestScopes(Lcom/google/android/gms/common/api/Scope;[Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestEmail()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    iget-object v2, p0, Lcom/microblink/GmailInboxManager;->clientId:Ljava/lang/String;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestServerAuthCode(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->build()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getClient(Landroid/app/Activity;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object p2

    iput-object p2, p0, Lcom/microblink/GmailInboxManager;->signInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->signInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->getSignInIntent()Landroid/content/Intent;

    move-result-object p2

    const/16 v2, 0x232e

    invoke-virtual {p1, p2, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "GmailInboxManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/microblink/GmailInboxManager;->signInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    iget-object p2, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz p2, :cond_2

    new-instance v0, Lcom/microblink/GmailInboxException;

    invoke-direct {v0, p1}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p2, v0}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_2
    return-void
.end method

.method public final signOut()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/GmailInboxManager;->repository:Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;

    invoke-virtual {v0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxRepository;->removeLastCheckedTime()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/microblink/GmailInboxManager$4;

    invoke-direct {v1, p0}, Lcom/microblink/GmailInboxManager$4;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Lcom/microblink/GmailInboxManager;->signedIn()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/microblink/GmailInboxManager;->signInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->signOut()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v2, Lcom/microblink/GmailInboxManager$6;

    invoke-direct {v2, p0}, Lcom/microblink/GmailInboxManager$6;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v2, Lcom/microblink/GmailInboxManager$5;

    invoke-direct {v2, p0}, Lcom/microblink/GmailInboxManager$5;-><init>(Lcom/microblink/GmailInboxManager;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, "GmailInboxManager"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/microblink/GmailInboxManager;->signedInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    iput-object v1, p0, Lcom/microblink/GmailInboxManager;->signInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    iget-object v1, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz v1, :cond_1

    new-instance v2, Lcom/microblink/GmailInboxException;

    invoke-direct {v2, v0}, Lcom/microblink/GmailInboxException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, Lcom/microblink/GmailInboxCallback;->onException(Lcom/microblink/GmailInboxException;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    const-string v0, "GmailInboxManager"

    const-string v2, "Please sign in before calling sign out!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/GmailInboxManager;->callback:Lcom/microblink/GmailInboxCallback;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/microblink/GmailInboxCallback;->onSignedOut()V

    :cond_3
    return-void
.end method
