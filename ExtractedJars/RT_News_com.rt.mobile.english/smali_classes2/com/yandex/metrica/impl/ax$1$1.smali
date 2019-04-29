.class Lcom/yandex/metrica/impl/ax$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/jo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ax$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ax$1;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ax$1;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax$1$1;->a:Lcom/yandex/metrica/impl/ax$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax$1$1;->a:Lcom/yandex/metrica/impl/ax$1;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ax$1;->b:Lcom/yandex/metrica/impl/ax;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ax;->b(Lcom/yandex/metrica/impl/ax;)Lcom/yandex/metrica/impl/ob/fg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fg;->g()Lcom/yandex/metrica/impl/ob/fg;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jn;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 78
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax$1$1;->a:Lcom/yandex/metrica/impl/ax$1;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ax$1;->b:Lcom/yandex/metrica/impl/ax;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ax;->a(Lcom/yandex/metrica/impl/ax;)Lcom/yandex/metrica/impl/bf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/ob/jn;)V

    .line 79
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax$1$1;->a:Lcom/yandex/metrica/impl/ax$1;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ax$1;->b:Lcom/yandex/metrica/impl/ax;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jn;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ax;->a(Lcom/yandex/metrica/impl/ax;Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ax$1$1;->a()V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 85
    iget-object p1, p0, Lcom/yandex/metrica/impl/ax$1$1;->a:Lcom/yandex/metrica/impl/ax$1;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ax$1;->b:Lcom/yandex/metrica/impl/ax;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ax;->a(Lcom/yandex/metrica/impl/ax;)Lcom/yandex/metrica/impl/bf;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/ob/jn;)V

    .line 86
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ax$1$1;->a()V

    return-void
.end method
