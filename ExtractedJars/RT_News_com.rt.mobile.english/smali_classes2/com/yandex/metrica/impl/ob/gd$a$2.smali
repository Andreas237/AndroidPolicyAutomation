.class Lcom/yandex/metrica/impl/ob/gd$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/gd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/gd$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/gd<",
        "Lcom/yandex/metrica/impl/ob/jk$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/fo;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/yandex/metrica/impl/ob/fo<",
            "Lcom/yandex/metrica/impl/ob/jk$a;",
            ">;"
        }
    .end annotation

    .line 57
    new-instance v0, Lcom/yandex/metrica/impl/ob/fp;

    const-string v1, "provided_request_state"

    .line 60
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->b()Lcom/yandex/metrica/impl/ob/ep;

    move-result-object p1

    new-instance v2, Lcom/yandex/metrica/impl/ob/gc;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/gc;-><init>()V

    .line 61
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gc;->b()Lcom/yandex/metrica/impl/ob/fn;

    move-result-object v2

    new-instance v3, Lcom/yandex/metrica/impl/ob/fy;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/fy;-><init>()V

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/yandex/metrica/impl/ob/fp;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ep;Lcom/yandex/metrica/impl/ob/fn;Lcom/yandex/metrica/impl/ob/fv;)V

    return-object v0
.end method
