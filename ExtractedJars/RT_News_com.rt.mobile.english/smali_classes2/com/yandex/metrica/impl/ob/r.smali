.class public Lcom/yandex/metrica/impl/ob/r;
.super Lcom/yandex/metrica/impl/ob/j;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final b:Lcom/yandex/metrica/impl/ob/ks;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/j;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/r;->a:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/r;->b:Lcom/yandex/metrica/impl/ob/ks;

    return-void
.end method
