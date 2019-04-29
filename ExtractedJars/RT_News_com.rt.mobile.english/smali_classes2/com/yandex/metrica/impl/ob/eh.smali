.class public Lcom/yandex/metrica/impl/ob/eh;
.super Lcom/yandex/metrica/impl/ob/ef;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ek;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ec;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ec;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ec;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 31
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ek;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/ek;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/eh;-><init>(Lcom/yandex/metrica/impl/ob/ek;Lcom/yandex/metrica/impl/ob/ec;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ek;Lcom/yandex/metrica/impl/ob/ec;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ek;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ec;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ef;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/eh;->a:Lcom/yandex/metrica/impl/ob/ek;

    .line 38
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/eh;->b:Lcom/yandex/metrica/impl/ob/ec;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ee;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 45
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/eh;->a:Lcom/yandex/metrica/impl/ob/ek;

    new-instance v0, Lcom/yandex/metrica/impl/ob/ej;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ej;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/ob/ek;->a(Lcom/yandex/metrica/impl/ob/ej;)V

    .line 46
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/eh;->b:Lcom/yandex/metrica/impl/ob/ec;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ec;->a()V

    :cond_0
    return-void
.end method
