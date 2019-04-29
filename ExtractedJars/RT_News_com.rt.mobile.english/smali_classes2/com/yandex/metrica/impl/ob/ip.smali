.class public final Lcom/yandex/metrica/impl/ob/ip;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/nk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ij;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ij;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ij;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ip;->c:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ip;->a:Lcom/yandex/metrica/impl/ob/nk;

    .line 30
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ip;->b:Lcom/yandex/metrica/impl/ob/ij;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ip;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/yandex/metrica/impl/ob/ij;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ip;->b:Lcom/yandex/metrica/impl/ob/ij;

    return-object v0
.end method

.method public c()Lcom/yandex/metrica/impl/ob/nk;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ip;->a:Lcom/yandex/metrica/impl/ob/nk;

    return-object v0
.end method
