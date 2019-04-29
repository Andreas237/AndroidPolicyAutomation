.class final Lcom/yandex/metrica/impl/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/nk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/nk<",
        "Lcom/yandex/metrica/impl/ob/jg$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jg$a;)Lcom/yandex/metrica/impl/ob/ni;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 74
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    if-eqz p1, :cond_1

    .line 1269
    array-length p1, p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    const-string p1, "attributes list is empty"

    .line 75
    invoke-static {p0, p1}, Lcom/yandex/metrica/impl/ob/ni;->a(Lcom/yandex/metrica/impl/ob/nk;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object p1

    return-object p1

    .line 76
    :cond_2
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/ni;->a(Lcom/yandex/metrica/impl/ob/nk;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 71
    check-cast p1, Lcom/yandex/metrica/impl/ob/jg$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/b$1;->a(Lcom/yandex/metrica/impl/ob/jg$a;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object p1

    return-object p1
.end method
