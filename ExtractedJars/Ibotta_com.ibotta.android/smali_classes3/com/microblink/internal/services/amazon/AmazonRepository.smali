.class public final Lcom/microblink/internal/services/amazon/AmazonRepository;
.super Lcom/microblink/internal/AndroidRepository;


# static fields
.field private static final AMAZON_SCRAPE_JS_ASSETS_PATH:Ljava/lang/String; = "microblink/amazon-scrape.js"

.field private static final AMAZON_SCRAPE_JS_FILE_NAME:Ljava/lang/String; = "amazon-scrape.js"

.field private static final TAG:Ljava/lang/String; = "AmazonRepository"


# instance fields
.field private final preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final service:Lcom/microblink/internal/services/amazon/AmazonService;
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

    new-instance v0, Lcom/microblink/internal/services/amazon/AmazonServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/amazon/AmazonServiceImpl;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->service:Lcom/microblink/internal/services/amazon/AmazonService;

    new-instance v0, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;

    invoke-direct {v0, p1}, Lcom/microblink/internal/services/amazon/AmazonPreferencesImpl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/services/amazon/AmazonRepository;)Lcom/microblink/internal/services/amazon/AmazonPreferences;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    return-object p0
.end method


# virtual methods
.method public final applyCredentials(Lcom/microblink/AmazonCredentials;)Z
    .locals 1
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->applyCredentials(Lcom/microblink/AmazonCredentials;)Z

    move-result p1

    return p1
.end method

.method public final applyStoredOrders(Lcom/microblink/AmazonCredentials;Ljava/util/Map;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/AmazonCredentials;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    new-instance v1, Lcom/microblink/internal/services/amazon/AmazonRepository$3;

    invoke-direct {v1, p0, p3}, Lcom/microblink/internal/services/amazon/AmazonRepository$3;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->applyStoredOrders(Lcom/microblink/AmazonCredentials;Ljava/util/Map;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final clearCredentials()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    invoke-interface {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->clearCredentials()Z

    move-result v0

    return v0
.end method

.method public final clearOrders()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    invoke-interface {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->clearStoredOrders()Z

    move-result v0

    return v0
.end method

.method public final credentials()Lcom/microblink/AmazonCredentials;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    invoke-interface {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->credentials()Lcom/microblink/AmazonCredentials;

    move-result-object v0

    return-object v0
.end method

.method public final hasCredentials()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    invoke-interface {v0}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->hasCredentials()Z

    move-result v0

    return v0
.end method

.method public final html(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->service:Lcom/microblink/internal/services/amazon/AmazonService;

    new-instance v1, Lcom/microblink/internal/services/amazon/AmazonRepository$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/amazon/AmazonRepository$1;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/amazon/AmazonService;->html(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final javaScriptFromDisk(Lcom/microblink/OnCompleteListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/microblink/internal/services/io/AssetManagerRepository;

    invoke-virtual {p0}, Lcom/microblink/internal/services/amazon/AmazonRepository;->context()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/io/AssetManagerRepository;-><init>(Landroid/content/Context;)V

    const-string v1, "amazon-scrape.js"

    new-instance v2, Lcom/microblink/internal/services/amazon/AmazonRepository$2;

    invoke-direct {v2, p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$2;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-virtual {v0, v1, v2}, Lcom/microblink/internal/services/io/AssetManagerRepository;->enqueueReadFileFromInput(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final javaScriptFromRemote(Lcom/microblink/OnCompleteListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->service:Lcom/microblink/internal/services/amazon/AmazonService;

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    invoke-interface {v1}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->modTime()I

    move-result v1

    new-instance v2, Lcom/microblink/internal/services/amazon/AmazonRepository$5;

    invoke-direct {v2, p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$5;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, v1, v2}, Lcom/microblink/internal/services/amazon/AmazonService;->js(ILcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final storedOrders(Lcom/microblink/AmazonCredentials;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Lcom/microblink/AmazonCredentials;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/AmazonCredentials;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository;->preferences:Lcom/microblink/internal/services/amazon/AmazonPreferences;

    new-instance v1, Lcom/microblink/internal/services/amazon/AmazonRepository$4;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/amazon/AmazonRepository$4;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->storedOrders(Lcom/microblink/AmazonCredentials;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method
