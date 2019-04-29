.class Lcom/yandex/metrica/impl/bf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/bg$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;Ljava/util/Map;)Ljava/util/concurrent/Future;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/yandex/metrica/impl/bc;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/yandex/metrica/impl/bc;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/yandex/metrica/impl/bf$1;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/yandex/metrica/impl/bf$1;->b:Lcom/yandex/metrica/impl/bc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf$1;->a:Ljava/util/Map;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/bf$1;->b:Lcom/yandex/metrica/impl/bc;

    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/bf;->b(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    return-object p1
.end method
