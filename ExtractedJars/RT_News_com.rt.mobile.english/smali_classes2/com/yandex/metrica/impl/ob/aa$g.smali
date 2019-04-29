.class abstract Lcom/yandex/metrica/impl/ob/aa$g;
.super Lcom/yandex/metrica/impl/ob/aa$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "g"
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/hx;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V
    .locals 0

    .line 409
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/aa$f;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 410
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/aa$g;->a:Lcom/yandex/metrica/impl/ob/hx;

    return-void
.end method


# virtual methods
.method public c()Lcom/yandex/metrica/impl/ob/hx;
    .locals 1

    .line 414
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$g;->a:Lcom/yandex/metrica/impl/ob/hx;

    return-object v0
.end method
