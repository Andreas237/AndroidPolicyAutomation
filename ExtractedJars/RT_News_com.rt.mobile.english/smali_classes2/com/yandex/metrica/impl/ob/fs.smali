.class public Lcom/yandex/metrica/impl/ob/fs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ft;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/ft<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ft;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/ft<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/mg;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ft;Lcom/yandex/metrica/impl/ob/mg;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ft;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/mg;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/ft<",
            "TT;>;",
            "Lcom/yandex/metrica/impl/ob/mg;",
            ")V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/fs;->a:Lcom/yandex/metrica/impl/ob/ft;

    .line 28
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/fs;->b:Lcom/yandex/metrica/impl/ob/mg;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)[B
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)[B"
        }
    .end annotation

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fs;->b:Lcom/yandex/metrica/impl/ob/mg;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/fs;->a:Lcom/yandex/metrica/impl/ob/ft;

    invoke-interface {v1, p1}, Lcom/yandex/metrica/impl/ob/ft;->a(Ljava/lang/Object;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/mg;->a([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    .line 39
    new-array p1, p1, [B

    return-object p1
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fs;->a:Lcom/yandex/metrica/impl/ob/ft;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ft;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b([B)Ljava/lang/Object;
    .locals 1
    .param p1    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fs;->b:Lcom/yandex/metrica/impl/ob/mg;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/mg;->b([B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/fs;->a:Lcom/yandex/metrica/impl/ob/ft;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/ft;->b([B)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 49
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
