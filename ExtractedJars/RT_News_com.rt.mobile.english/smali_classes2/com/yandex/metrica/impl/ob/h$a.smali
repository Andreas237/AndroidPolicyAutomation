.class Lcom/yandex/metrica/impl/ob/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/j;

.field private final b:Lcom/yandex/metrica/impl/ob/l;
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
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/j;",
            "Lcom/yandex/metrica/impl/ob/l<",
            "+",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/h$a;->a:Lcom/yandex/metrica/impl/ob/j;

    .line 54
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/h$a;->b:Lcom/yandex/metrica/impl/ob/l;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;B)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/h$a;-><init>(Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h$a;->b:Lcom/yandex/metrica/impl/ob/l;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/h$a;->a:Lcom/yandex/metrica/impl/ob/j;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/l;->b(Lcom/yandex/metrica/impl/ob/j;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h$a;->b:Lcom/yandex/metrica/impl/ob/l;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/h$a;->a:Lcom/yandex/metrica/impl/ob/j;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/j;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    return-void
.end method
