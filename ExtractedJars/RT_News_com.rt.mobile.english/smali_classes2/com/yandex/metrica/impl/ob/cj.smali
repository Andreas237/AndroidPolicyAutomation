.class public abstract Lcom/yandex/metrica/impl/ob/cj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<BaseHandler:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/cs;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/cs;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/cj;->a:Lcom/yandex/metrica/impl/ob/cs;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/cs;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/cj;->a:Lcom/yandex/metrica/impl/ob/cs;

    return-object v0
.end method

.method public abstract a(Lcom/yandex/metrica/impl/q$a;Ljava/util/List;)V
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/q$a;",
            "Ljava/util/List<",
            "TBaseHandler;>;)V"
        }
    .end annotation
.end method
