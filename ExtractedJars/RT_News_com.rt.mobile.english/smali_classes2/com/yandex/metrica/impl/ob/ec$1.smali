.class Lcom/yandex/metrica/impl/ob/ec$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/dz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/ec;->a(Lcom/yandex/metrica/impl/ob/ee;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ee;

.field final synthetic b:Lcom/yandex/metrica/impl/ob/ec;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ec;Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ec$1;->b:Lcom/yandex/metrica/impl/ob/ec;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ec$1;->a:Lcom/yandex/metrica/impl/ob/ee;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec$1;->b:Lcom/yandex/metrica/impl/ob/ec;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ec;->a(Lcom/yandex/metrica/impl/ob/ec;)Lcom/yandex/metrica/impl/ob/eb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eb;->a()V

    .line 118
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec$1;->a:Lcom/yandex/metrica/impl/ob/ee;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ec;->b(Lcom/yandex/metrica/impl/ob/ee;)V

    return-void
.end method
