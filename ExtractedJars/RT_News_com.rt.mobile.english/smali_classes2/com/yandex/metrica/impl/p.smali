.class public Lcom/yandex/metrica/impl/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/my;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/my;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/p;->a:Ljava/util/Map;

    .line 29
    iput-object p1, p0, Lcom/yandex/metrica/impl/p;->b:Lcom/yandex/metrica/impl/ob/my;

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/yandex/metrica/impl/p;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/yandex/metrica/impl/p;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p2, :cond_0

    .line 34
    iget-object p2, p0, Lcom/yandex/metrica/impl/p;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/p;->b:Lcom/yandex/metrica/impl/ob/my;

    iget-object v1, p0, Lcom/yandex/metrica/impl/p;->a:Ljava/util/Map;

    invoke-virtual {v0, v1, p1, p2}, Lcom/yandex/metrica/impl/ob/my;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
