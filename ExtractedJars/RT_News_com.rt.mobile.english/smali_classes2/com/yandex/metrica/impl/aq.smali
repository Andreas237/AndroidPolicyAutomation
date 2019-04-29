.class public abstract Lcom/yandex/metrica/impl/aq;
.super Lcom/yandex/metrica/impl/an;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/am;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/am;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/am;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 18
    invoke-direct {p0}, Lcom/yandex/metrica/impl/an;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/yandex/metrica/impl/aq;->a:Lcom/yandex/metrica/impl/am;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 4

    .line 23
    iget-object v0, p0, Lcom/yandex/metrica/impl/aq;->a:Lcom/yandex/metrica/impl/am;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/aq;->l()I

    move-result v1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/aq;->m()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/aq;->n()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/am;->a(I[BLjava/util/Map;)Z

    move-result v0

    return v0
.end method
