.class public final Lcom/yandex/metrica/impl/ob/kg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static volatile b:Lcom/yandex/metrica/impl/ob/kg;


# instance fields
.field private c:Lcom/yandex/metrica/impl/ob/ke;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/kg;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/ke;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ke;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kg;->c:Lcom/yandex/metrica/impl/ob/ke;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/kg;
    .locals 2

    .line 19
    sget-object v0, Lcom/yandex/metrica/impl/ob/kg;->b:Lcom/yandex/metrica/impl/ob/kg;

    if-nez v0, :cond_1

    .line 20
    sget-object v0, Lcom/yandex/metrica/impl/ob/kg;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 21
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/kg;->b:Lcom/yandex/metrica/impl/ob/kg;

    if-nez v1, :cond_0

    .line 22
    new-instance v1, Lcom/yandex/metrica/impl/ob/kg;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/kg;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/ob/kg;->b:Lcom/yandex/metrica/impl/ob/kg;

    .line 24
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 26
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/ob/kg;->b:Lcom/yandex/metrica/impl/ob/kg;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kg;->c:Lcom/yandex/metrica/impl/ob/ke;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ke;->b()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kg;->c:Lcom/yandex/metrica/impl/ob/ke;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ke;->a()V

    return-void
.end method
