.class public Lcom/yandex/metrica/impl/ob/ck;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/bj;

.field private final b:Lcom/yandex/metrica/impl/ob/bk;

.field private final c:Lcom/yandex/metrica/impl/ob/bi;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/x;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/bj;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/bj;-><init>(Lcom/yandex/metrica/impl/ob/x;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ck;->a:Lcom/yandex/metrica/impl/ob/bj;

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/bk;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/bk;-><init>(Lcom/yandex/metrica/impl/ob/x;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ck;->b:Lcom/yandex/metrica/impl/ob/bk;

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/bi;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/bi;-><init>(Lcom/yandex/metrica/impl/ob/x;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ck;->c:Lcom/yandex/metrica/impl/ob/bi;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/bj;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ck;->a:Lcom/yandex/metrica/impl/ob/bj;

    return-object v0
.end method

.method public b()Lcom/yandex/metrica/impl/ob/bi;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ck;->c:Lcom/yandex/metrica/impl/ob/bi;

    return-object v0
.end method

.method public c()Lcom/yandex/metrica/impl/ob/bk;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ck;->b:Lcom/yandex/metrica/impl/ob/bk;

    return-object v0
.end method
