.class Lcom/yandex/metrica/impl/k$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/kz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/k;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/k;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/yandex/metrica/impl/k$1;->a:Lcom/yandex/metrica/impl/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Lcom/yandex/metrica/impl/ob/ky;)V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/yandex/metrica/impl/k$1;->a:Lcom/yandex/metrica/impl/k;

    invoke-static {v0}, Lcom/yandex/metrica/impl/k;->a(Lcom/yandex/metrica/impl/k;)Landroid/content/ContentValues;

    move-result-object v0

    const-string v1, "cell_info"

    .line 169
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lp;->a([Lcom/yandex/metrica/impl/ob/ky;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    .line 167
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
