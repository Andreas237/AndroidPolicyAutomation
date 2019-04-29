.class Lcom/yandex/metrica/impl/ob/h$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;>;"
        }
    .end annotation
.end field

.field final b:Lcom/yandex/metrica/impl/ob/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;Lcom/yandex/metrica/impl/ob/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;>;",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/h$c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 33
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/h$c;->b:Lcom/yandex/metrica/impl/ob/l;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;Lcom/yandex/metrica/impl/ob/l;B)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/h$c;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h$c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/h$c;->b:Lcom/yandex/metrica/impl/ob/l;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 42
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 43
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/h$c;->a()V

    return-void
.end method
