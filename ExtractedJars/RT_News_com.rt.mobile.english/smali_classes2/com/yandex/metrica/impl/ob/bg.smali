.class public abstract Lcom/yandex/metrica/impl/ob/bg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/x;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/x;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/x;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/bg;->a:Lcom/yandex/metrica/impl/ob/x;

    return-void
.end method


# virtual methods
.method protected a()Lcom/yandex/metrica/impl/ob/x;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/bg;->a:Lcom/yandex/metrica/impl/ob/x;

    return-object v0
.end method

.method public abstract a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/aq;)Z
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/aq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
