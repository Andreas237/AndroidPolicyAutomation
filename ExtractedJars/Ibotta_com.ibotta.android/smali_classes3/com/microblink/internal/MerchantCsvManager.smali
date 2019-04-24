.class public final Lcom/microblink/internal/MerchantCsvManager;
.super Ljava/lang/Object;


# static fields
.field private static final MERCHANT_CSV:Ljava/lang/String; = "microblink/merchant_name_search.csv"

.field private static final TAG:Ljava/lang/String; = "MerchantCsvManager"

.field private static volatile instance:Lcom/microblink/internal/MerchantCsvManager;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private context:Landroid/content/Context;

.field private csv:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/internal/MerchantCsvManager;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Z)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/MerchantCsvManager;->context:Landroid/content/Context;

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/microblink/internal/MerchantCsvManager;->parse()V

    :cond_0
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/microblink/internal/MerchantCsvManager;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/microblink/internal/MerchantCsvManager;->getInstance(Landroid/content/Context;Z)Lcom/microblink/internal/MerchantCsvManager;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;Z)Lcom/microblink/internal/MerchantCsvManager;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/internal/MerchantCsvManager;->instance:Lcom/microblink/internal/MerchantCsvManager;

    if-nez v0, :cond_1

    sget-object v1, Lcom/microblink/internal/MerchantCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/microblink/internal/MerchantCsvManager;->instance:Lcom/microblink/internal/MerchantCsvManager;

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/MerchantCsvManager;

    invoke-direct {v0, p0, p1}, Lcom/microblink/internal/MerchantCsvManager;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/microblink/internal/MerchantCsvManager;->instance:Lcom/microblink/internal/MerchantCsvManager;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final csv()Ljava/util/ArrayList;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/internal/MerchantCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/MerchantCsvManager;->csv:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/microblink/internal/MerchantCsvManager;->csv:Ljava/util/ArrayList;

    :cond_0
    iget-object v1, p0, Lcom/microblink/internal/MerchantCsvManager;->csv:Ljava/util/ArrayList;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final parse()V
    .locals 4

    sget-object v0, Lcom/microblink/internal/MerchantCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/microblink/internal/CSVParser;

    iget-object v2, p0, Lcom/microblink/internal/MerchantCsvManager;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/microblink/internal/CSVParser;-><init>(Landroid/content/Context;)V

    const-string v2, "microblink/merchant_name_search.csv"

    invoke-virtual {v1, v2}, Lcom/microblink/internal/CSVParser;->parseFromFile(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/internal/MerchantCsvManager;->csv:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "MerchantCsvManager"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
