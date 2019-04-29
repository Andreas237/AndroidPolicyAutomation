.class public Lcom/yandex/metrica/impl/ob/lt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/lt;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lt;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/os/HandlerThread;
    .locals 1

    .line 64
    new-instance v0, Lcom/yandex/metrica/impl/ob/lt;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/lt;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lt;->a()Landroid/os/HandlerThread;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 60
    new-instance v0, Lcom/yandex/metrica/impl/ob/lt;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/lt;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/lt;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static b()I
    .locals 1

    .line 77
    sget-object v0, Lcom/yandex/metrica/impl/ob/lt;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;)Landroid/os/HandlerThread;
    .locals 4

    .line 68
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "YMM-TH [%s]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 69
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/lt;->a(Ljava/lang/String;)Landroid/os/HandlerThread;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2077
    sget-object p0, Lcom/yandex/metrica/impl/ob/lt;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p0

    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/HandlerThread;
    .locals 2

    .line 56
    new-instance v0, Landroid/os/HandlerThread;

    .line 2052
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lt;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/lt;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/Thread;

    .line 1052
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lt;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/lt;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 48
    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method
