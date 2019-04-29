.class Lcom/yandex/metrica/impl/ob/gy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/gy;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/gy;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/gy;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gy$3;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 273
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gy$3;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/gy;->a(Lcom/yandex/metrica/impl/ob/gy;)Lcom/yandex/metrica/impl/ob/hg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gy$3;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/gy;->c(Lcom/yandex/metrica/impl/ob/gy;)Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gy$3;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/gy;->d(Lcom/yandex/metrica/impl/ob/gy;)Lcom/yandex/metrica/impl/ob/gs;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/hg;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    :cond_0
    return-void
.end method
