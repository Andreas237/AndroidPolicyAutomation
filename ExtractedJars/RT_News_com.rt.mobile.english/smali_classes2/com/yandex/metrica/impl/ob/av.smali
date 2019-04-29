.class public Lcom/yandex/metrica/impl/ob/av;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ap;
.implements Lcom/yandex/metrica/impl/ob/ar;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/ap;",
        "Lcom/yandex/metrica/impl/ob/ar<",
        "Lcom/yandex/metrica/impl/ob/x;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ae;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 22
    invoke-virtual {p0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/av;->b(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/x;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/as;Lcom/yandex/metrica/impl/ob/am;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ao;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/as;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/am;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/aq;

    new-instance v1, Lcom/yandex/metrica/impl/ob/aj;

    .line 33
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/am;->c()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v1, p3}, Lcom/yandex/metrica/impl/ob/aj;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p2, v1, p4, p0}, Lcom/yandex/metrica/impl/ob/as;->a(Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/ar;)Lcom/yandex/metrica/impl/ob/ae;

    move-result-object p2

    check-cast p2, Lcom/yandex/metrica/impl/ob/x;

    invoke-direct {v0, p1, p2, p4}, Lcom/yandex/metrica/impl/ob/aq;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/x;Lcom/yandex/metrica/impl/ob/t;)V

    return-object v0
.end method

.method public b(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/x;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 43
    new-instance v6, Lcom/yandex/metrica/impl/ob/x;

    .line 45
    invoke-static {}, Lcom/yandex/metrica/impl/ob/kk;->a()Lcom/yandex/metrica/impl/ob/kk;

    move-result-object v2

    .line 48
    invoke-static {}, Lcom/yandex/metrica/impl/t;->a()Lcom/yandex/metrica/impl/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/t;->c()Lcom/yandex/metrica/impl/ob/jm;

    move-result-object v5

    move-object v0, v6

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/x;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/jm;)V

    return-object v6
.end method
