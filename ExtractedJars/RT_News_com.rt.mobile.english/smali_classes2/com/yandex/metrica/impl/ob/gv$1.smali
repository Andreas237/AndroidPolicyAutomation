.class Lcom/yandex/metrica/impl/ob/gv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/kz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/gv;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/gx;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/gx;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gv$1;->a:Lcom/yandex/metrica/impl/ob/gx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Lcom/yandex/metrica/impl/ob/ky;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gv$1;->a:Lcom/yandex/metrica/impl/ob/gx;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lp;->a([Lcom/yandex/metrica/impl/ob/ky;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gx;->b(Lorg/json/JSONArray;)V

    return-void
.end method
