.class public abstract Lcom/yandex/metrica/impl/ob/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ao;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/yandex/metrica/impl/ob/ae;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/ao;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ae;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ae;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ae;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TC;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/al;->a:Lcom/yandex/metrica/impl/ob/ae;

    .line 24
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/al;->a:Lcom/yandex/metrica/impl/ob/ae;

    invoke-interface {p1, p0}, Lcom/yandex/metrica/impl/ob/ae;->b(Lcom/yandex/metrica/impl/ob/ao;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/al;->a:Lcom/yandex/metrica/impl/ob/ae;

    invoke-interface {v0, p0}, Lcom/yandex/metrica/impl/ob/ae;->a(Lcom/yandex/metrica/impl/ob/ao;)V

    return-void
.end method

.method public b()Lcom/yandex/metrica/impl/ob/ae;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/al;->a:Lcom/yandex/metrica/impl/ob/ae;

    return-object v0
.end method
