.class public Lcom/yandex/metrica/impl/ob/ml;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/yandex/metrica/impl/h;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final b:Lcom/yandex/metrica/impl/ob/mo;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/mo;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/mo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ml;->a:Lcom/yandex/metrica/impl/h;

    .line 25
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ml;->b:Lcom/yandex/metrica/impl/ob/mo;

    return-void
.end method
