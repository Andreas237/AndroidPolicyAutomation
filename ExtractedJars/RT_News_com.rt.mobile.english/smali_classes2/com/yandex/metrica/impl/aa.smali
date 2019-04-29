.class public final Lcom/yandex/metrica/impl/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/yandex/metrica/impl/aa;

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/aa;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {p1}, Lcom/yandex/metrica/impl/as;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/aa;->c:Ljava/lang/String;

    .line 40
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/p;

    new-instance v1, Lcom/yandex/metrica/impl/aa$1;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/aa$1;-><init>(Lcom/yandex/metrica/impl/aa;)V

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    .line 46
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v1

    .line 40
    invoke-virtual {p1, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/aa;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    sget-object v0, Lcom/yandex/metrica/impl/aa;->a:Lcom/yandex/metrica/impl/aa;

    if-nez v0, :cond_1

    .line 26
    sget-object v0, Lcom/yandex/metrica/impl/aa;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 27
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/aa;->a:Lcom/yandex/metrica/impl/aa;

    if-nez v1, :cond_0

    .line 28
    new-instance v1, Lcom/yandex/metrica/impl/aa;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/aa;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/aa;->a:Lcom/yandex/metrica/impl/aa;

    .line 30
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 32
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/aa;->a:Lcom/yandex/metrica/impl/aa;

    return-object p0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/aa;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/yandex/metrica/impl/aa;->c:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/yandex/metrica/impl/aa;->c:Ljava/lang/String;

    return-object v0
.end method
