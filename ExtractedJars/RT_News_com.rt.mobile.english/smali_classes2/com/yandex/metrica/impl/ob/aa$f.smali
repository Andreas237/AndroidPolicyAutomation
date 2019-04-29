.class abstract Lcom/yandex/metrica/impl/ob/aa$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "f"
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ab;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 422
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 423
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/aa$f;->a:Lcom/yandex/metrica/impl/ob/ab;

    return-void
.end method


# virtual methods
.method protected abstract a()Z
.end method

.method protected abstract b()V
.end method

.method e()Lcom/yandex/metrica/impl/ob/ab;
    .locals 1

    .line 427
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$f;->a:Lcom/yandex/metrica/impl/ob/ab;

    return-object v0
.end method

.method f()V
    .locals 1

    .line 431
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aa$f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 432
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aa$f;->b()V

    :cond_0
    return-void
.end method
