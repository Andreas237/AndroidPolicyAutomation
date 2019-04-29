.class abstract Lcom/yandex/metrica/impl/ob/gq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/gp;


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/gp;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/gp;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gp;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gq;->a:Lcom/yandex/metrica/impl/ob/gp;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public a(Ljava/lang/String;Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 26
    invoke-virtual {p0, p2, p3}, Lcom/yandex/metrica/impl/ob/gq;->a(Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 27
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gq;->a:Lcom/yandex/metrica/impl/ob/gp;

    if-eqz v0, :cond_0

    .line 28
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gq;->a:Lcom/yandex/metrica/impl/ob/gp;

    invoke-interface {v0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/gp;->a(Ljava/lang/String;Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V

    :cond_0
    return-void
.end method
