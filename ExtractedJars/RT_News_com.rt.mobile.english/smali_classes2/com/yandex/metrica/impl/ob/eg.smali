.class public Lcom/yandex/metrica/impl/ob/eg;
.super Lcom/yandex/metrica/impl/ob/ef;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ec;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ec;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ec;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ef;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/eg;->a:Lcom/yandex/metrica/impl/ob/ec;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ee;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 33
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/eg;->a:Lcom/yandex/metrica/impl/ob/ec;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ec;->a(Lcom/yandex/metrica/impl/ob/ee;)V

    return-void
.end method
