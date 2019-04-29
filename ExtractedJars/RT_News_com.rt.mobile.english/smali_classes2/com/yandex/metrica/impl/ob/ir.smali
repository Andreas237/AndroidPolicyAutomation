.class public Lcom/yandex/metrica/impl/ob/ir;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ij;


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/mu;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/mu;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/mu;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ir;->a:Lcom/yandex/metrica/impl/ob/mu;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ja;Lcom/yandex/metrica/impl/ob/jg$a$a;)Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/ja;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 30
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ja;->a()I

    move-result v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ir;->a:Lcom/yandex/metrica/impl/ob/mu;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mu;->a()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 31
    iget v0, p2, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    new-instance v1, Ljava/lang/String;

    iget-object v2, p2, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/ja;->a(ILjava/lang/String;)Lcom/yandex/metrica/impl/ob/jg$a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ja;->a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V

    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ja;->a()I

    move-result v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ir;->a:Lcom/yandex/metrica/impl/ob/mu;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mu;->a()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 35
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ja;->a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V

    .line 36
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ja;->b()V

    :cond_1
    :goto_0
    return-object p2
.end method
