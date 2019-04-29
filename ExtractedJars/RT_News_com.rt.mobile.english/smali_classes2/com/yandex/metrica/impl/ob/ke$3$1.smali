.class Lcom/yandex/metrica/impl/ob/ke$3$1;
.super Lcom/yandex/metrica/impl/ob/ke$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ke$3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ke$3;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ke$3;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$3$1;->a:Lcom/yandex/metrica/impl/ob/ke$3;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ke$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;Ljava/net/Socket;)Lcom/yandex/metrica/impl/ob/ke$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/net/Socket;",
            ")",
            "Lcom/yandex/metrica/impl/ob/ke$b;"
        }
    .end annotation

    .line 223
    new-instance v0, Lcom/yandex/metrica/impl/ob/ke$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke$3$1;->a:Lcom/yandex/metrica/impl/ob/ke$3;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ke$3;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-direct {v0, v1, p1, p2}, Lcom/yandex/metrica/impl/ob/ke$a;-><init>(Lcom/yandex/metrica/impl/ob/ke;Landroid/net/Uri;Ljava/net/Socket;)V

    return-object v0
.end method
