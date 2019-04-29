.class Lcom/yandex/metrica/impl/ob/ah$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/jm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ah;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ah;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ah$a;->a:Lcom/yandex/metrica/impl/ob/ah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jn;)Z
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 56
    new-instance v0, Lcom/yandex/metrica/impl/h;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/h;-><init>()V

    .line 57
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jn;->a()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/h;->a([B)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    sget-object v0, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    .line 58
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 59
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ah$a;->a:Lcom/yandex/metrica/impl/ob/ah;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ah;->a(Lcom/yandex/metrica/impl/h;)V

    const/4 p1, 0x1

    return p1
.end method
