.class public Lcom/yandex/metrica/impl/ob/mj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/mq;


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/mi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/mi;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/mi;-><init>()V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/mj;-><init>(Lcom/yandex/metrica/impl/ob/mi;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/mi;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/mj;->a:Lcom/yandex/metrica/impl/ob/mi;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/mr;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 30
    sget-object v0, Lcom/yandex/metrica/impl/ob/mr;->b:Lcom/yandex/metrica/impl/ob/mr;

    return-object v0
.end method

.method public a([B)[B
    .locals 1
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mj;->a:Lcom/yandex/metrica/impl/ob/mi;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/mi;->a([B)[B

    move-result-object p1

    return-object p1
.end method
