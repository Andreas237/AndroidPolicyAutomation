.class Lcom/yandex/metrica/impl/al$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/al;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/al;

.field private final b:Lcom/yandex/metrica/impl/an;


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/al;Lcom/yandex/metrica/impl/an;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/yandex/metrica/impl/al$a;->a:Lcom/yandex/metrica/impl/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p2, p0, Lcom/yandex/metrica/impl/al$a;->b:Lcom/yandex/metrica/impl/an;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/al;Lcom/yandex/metrica/impl/an;B)V
    .locals 0

    .line 206
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/al$a;-><init>(Lcom/yandex/metrica/impl/al;Lcom/yandex/metrica/impl/an;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 217
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/al$a;->a:Lcom/yandex/metrica/impl/al;

    iget-object v1, p0, Lcom/yandex/metrica/impl/al$a;->b:Lcom/yandex/metrica/impl/an;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/al;->c(Lcom/yandex/metrica/impl/an;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 219
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
