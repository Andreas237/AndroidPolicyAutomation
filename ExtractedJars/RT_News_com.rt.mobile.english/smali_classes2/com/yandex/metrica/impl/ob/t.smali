.class public Lcom/yandex/metrica/impl/ob/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/u;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/CounterConfiguration;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/u;->a(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/t;->a:Lcom/yandex/metrica/impl/ob/u;

    .line 24
    invoke-static {p1}, Lcom/yandex/metrica/CounterConfiguration;->c(Landroid/os/Bundle;)Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/t;->b:Lcom/yandex/metrica/CounterConfiguration;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/u;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/t;->a:Lcom/yandex/metrica/impl/ob/u;

    return-object v0
.end method

.method public b()Lcom/yandex/metrica/CounterConfiguration;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/t;->b:Lcom/yandex/metrica/CounterConfiguration;

    return-object v0
.end method
