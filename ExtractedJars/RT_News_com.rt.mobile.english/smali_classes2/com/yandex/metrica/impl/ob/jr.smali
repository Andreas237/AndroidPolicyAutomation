.class public abstract Lcom/yandex/metrica/impl/ob/jr;
.super Lcom/yandex/metrica/impl/ob/js;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/jt;",
        "A:",
        "Lcom/yandex/metrica/impl/ob/jq$a;",
        "L:Lcom/yandex/metrica/impl/ob/jq$b<",
        "TT;TA;>;>",
        "Lcom/yandex/metrica/impl/ob/js<",
        "TT;TA;T",
        "L;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/t;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/jq$b;Lcom/yandex/metrica/impl/ob/js$a;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/js$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            "Lcom/yandex/metrica/impl/ob/js$a<",
            "TA;>;",
            "Lcom/yandex/metrica/impl/ob/ks;",
            "Lcom/yandex/metrica/impl/ob/t;",
            ")V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/yandex/metrica/impl/ob/js;-><init>(Lcom/yandex/metrica/impl/ob/jq$d;Lcom/yandex/metrica/impl/ob/js$a;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V

    .line 30
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/jr;->a:Lcom/yandex/metrica/impl/ob/t;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/t;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jr;->a:Lcom/yandex/metrica/impl/ob/t;

    return-object v0
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/t;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 34
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jr;->a:Lcom/yandex/metrica/impl/ob/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 33
    monitor-exit p0

    throw p1
.end method
