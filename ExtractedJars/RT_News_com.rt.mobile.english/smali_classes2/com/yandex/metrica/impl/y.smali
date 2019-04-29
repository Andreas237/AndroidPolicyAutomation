.class Lcom/yandex/metrica/impl/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lcom/yandex/metrica/impl/b;

.field private final c:Lcom/yandex/metrica/impl/z;


# direct methods
.method constructor <init>(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/yandex/metrica/impl/y;->a:Landroid/os/Handler;

    .line 28
    iput-object p2, p0, Lcom/yandex/metrica/impl/y;->b:Lcom/yandex/metrica/impl/b;

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/z;

    invoke-direct {v0, p1, p2}, Lcom/yandex/metrica/impl/z;-><init>(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/y;->c:Lcom/yandex/metrica/impl/z;

    return-void
.end method

.method private static a(Lcom/yandex/metrica/impl/b;)Ljava/lang/String;
    .locals 0

    .line 57
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/b;->d()Lcom/yandex/metrica/impl/bc;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/CounterConfiguration;->f()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static a(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;Ljava/lang/Runnable;)V
    .locals 7

    .line 44
    invoke-static {p0, p1, p2}, Lcom/yandex/metrica/impl/y;->b(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;Ljava/lang/Runnable;)V

    .line 45
    invoke-static {p1}, Lcom/yandex/metrica/impl/y;->a(Lcom/yandex/metrica/impl/b;)Ljava/lang/String;

    move-result-object v0

    .line 1049
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 1062
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/b;->d()Lcom/yandex/metrica/impl/bc;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/CounterConfiguration;->d()Ljava/lang/Integer;

    move-result-object p1

    const/16 v3, 0xa

    .line 1061
    invoke-static {p1, v3}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result p1

    mul-int/lit16 p1, p1, 0x1f4

    int-to-long v3, p1

    add-long v5, v1, v3

    .line 45
    invoke-virtual {p0, p2, v0, v5, v6}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method private static b(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;Ljava/lang/Runnable;)V
    .locals 0

    .line 53
    invoke-static {p1}, Lcom/yandex/metrica/impl/y;->a(Lcom/yandex/metrica/impl/b;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/yandex/metrica/impl/y;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/yandex/metrica/impl/y;->b:Lcom/yandex/metrica/impl/b;

    iget-object v2, p0, Lcom/yandex/metrica/impl/y;->c:Lcom/yandex/metrica/impl/z;

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/y;->b(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;Ljava/lang/Runnable;)V

    return-void
.end method

.method b()V
    .locals 3

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/y;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/yandex/metrica/impl/y;->b:Lcom/yandex/metrica/impl/b;

    iget-object v2, p0, Lcom/yandex/metrica/impl/y;->c:Lcom/yandex/metrica/impl/z;

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/y;->a(Landroid/os/Handler;Lcom/yandex/metrica/impl/b;Ljava/lang/Runnable;)V

    return-void
.end method
