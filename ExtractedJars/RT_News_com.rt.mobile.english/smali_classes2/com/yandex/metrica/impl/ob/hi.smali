.class Lcom/yandex/metrica/impl/ob/hi;
.super Lcom/yandex/metrica/impl/ob/jq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/hi$b;,
        Lcom/yandex/metrica/impl/ob/hi$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jq;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hi;->a:Lcom/yandex/metrica/impl/ob/gs;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/gs;B)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;-><init>(Lcom/yandex/metrica/impl/ob/gs;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/g;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/g;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/hi;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/yandex/metrica/impl/ob/hi;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hi;->e(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/gs;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hi;->a:Lcom/yandex/metrica/impl/ob/gs;

    return-object v0
.end method

.method b()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hi;->d()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    return-object v0
.end method
