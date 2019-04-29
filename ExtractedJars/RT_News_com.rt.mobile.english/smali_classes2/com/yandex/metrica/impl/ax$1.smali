.class Lcom/yandex/metrica/impl/ax$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ax;-><init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;Lcom/yandex/metrica/impl/ob/jp;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/jp;

.field final synthetic b:Lcom/yandex/metrica/impl/ax;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ax;Lcom/yandex/metrica/impl/ob/jp;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax$1;->b:Lcom/yandex/metrica/impl/ax;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ax$1;->a:Lcom/yandex/metrica/impl/ob/jp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax$1;->a:Lcom/yandex/metrica/impl/ob/jp;

    new-instance v1, Lcom/yandex/metrica/impl/ax$1$1;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ax$1$1;-><init>(Lcom/yandex/metrica/impl/ax$1;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jp;->a(Lcom/yandex/metrica/impl/ob/jo;)V

    return-void
.end method
