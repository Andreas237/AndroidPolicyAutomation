.class public final Lcom/microblink/internal/CountryCsvManager;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "MerchantCsvManager"

.field private static volatile instance:Lcom/microblink/internal/CountryCsvManager;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final lock:Ljava/lang/Object;


# instance fields
.field private context:Landroid/content/Context;

.field private data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/microblink/internal/CountryCsvManager;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/CountryCsvManager;->data:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/CountryCsvManager;->context:Landroid/content/Context;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/microblink/internal/CountryCsvManager;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/internal/CountryCsvManager;->instance:Lcom/microblink/internal/CountryCsvManager;

    if-nez v0, :cond_1

    sget-object v1, Lcom/microblink/internal/CountryCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/microblink/internal/CountryCsvManager;->instance:Lcom/microblink/internal/CountryCsvManager;

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/CountryCsvManager;

    invoke-direct {v0, p0}, Lcom/microblink/internal/CountryCsvManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/microblink/internal/CountryCsvManager;->instance:Lcom/microblink/internal/CountryCsvManager;

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
.method public final contains(Lcom/microblink/internal/country/Country;)Z
    .locals 2
    .param p1    # Lcom/microblink/internal/country/Country;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/internal/CountryCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/CountryCsvManager;->data:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final csv(Lcom/microblink/internal/country/Country;)Ljava/util/ArrayList;
    .locals 2
    .param p1    # Lcom/microblink/internal/country/Country;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/country/Country;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/internal/CountryCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/internal/CountryCsvManager;->data:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/CountryCsvManager;->data:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final parse(Lcom/microblink/internal/country/Country;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/country/Country;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/internal/CountryCsvManager;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/microblink/internal/CountryCsvManager$1;->$SwitchMap$com$microblink$internal$country$Country:[I

    invoke-virtual {p1}, Lcom/microblink/internal/country/Country;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    new-instance v1, Lcom/microblink/internal/CSVParser;

    iget-object v2, p0, Lcom/microblink/internal/CountryCsvManager;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/microblink/internal/CSVParser;-><init>(Landroid/content/Context;)V

    const-string v2, "microblink/merchant_names_pl.csv"

    :goto_0
    invoke-virtual {v1, v2}, Lcom/microblink/internal/CSVParser;->parseFromFile(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_1

    :pswitch_1
    new-instance v1, Lcom/microblink/internal/CSVParser;

    iget-object v2, p0, Lcom/microblink/internal/CountryCsvManager;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/microblink/internal/CSVParser;-><init>(Landroid/content/Context;)V

    const-string v2, "microblink/singapore_mall_retailers.csv"

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/microblink/internal/CountryCsvManager;->data:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/microblink/internal/country/Country;->isoCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "MerchantCsvManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
