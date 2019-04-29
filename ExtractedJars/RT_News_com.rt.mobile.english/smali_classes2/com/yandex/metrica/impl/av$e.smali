.class Lcom/yandex/metrica/impl/av$e;
.super Lcom/yandex/metrica/impl/av$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/av;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private s:Lcom/yandex/metrica/impl/ob/mn;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 715
    new-instance v0, Lcom/yandex/metrica/impl/ob/mn;

    invoke-static {}, Lcom/yandex/metrica/impl/t;->a()Lcom/yandex/metrica/impl/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/t;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/mn;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/av$e;-><init>(Lcom/yandex/metrica/impl/ob/mn;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/mn;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/mn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 718
    invoke-direct {p0}, Lcom/yandex/metrica/impl/av$c;-><init>()V

    .line 719
    iput-object p1, p0, Lcom/yandex/metrica/impl/av$e;->s:Lcom/yandex/metrica/impl/ob/mn;

    return-void
.end method


# virtual methods
.method protected b()[B
    .locals 3

    .line 724
    invoke-super {p0}, Lcom/yandex/metrica/impl/av$c;->b()[B

    move-result-object v0

    .line 725
    iget-object v1, p0, Lcom/yandex/metrica/impl/av$e;->s:Lcom/yandex/metrica/impl/ob/mn;

    iget-object v2, p0, Lcom/yandex/metrica/impl/av$e;->q:Lcom/yandex/metrica/impl/ob/mo;

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/mn;->a(Lcom/yandex/metrica/impl/ob/mo;)Lcom/yandex/metrica/impl/ob/mm;

    move-result-object v1

    .line 726
    invoke-interface {v1, v0}, Lcom/yandex/metrica/impl/ob/mm;->a([B)[B

    move-result-object v0

    return-object v0
.end method
