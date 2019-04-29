.class public final Lcom/yandex/metrica/impl/ob/jg$a$b;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jg$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 44
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jg$a$b;->d()Lcom/yandex/metrica/impl/ob/jg$a$b;

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 20
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jg$a$b;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a$b;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 57
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 58
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->b:Z

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 60
    :cond_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 61
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->c:Z

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IZ)V

    .line 63
    :cond_1
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jg$a$b;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    .line 90
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 100
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->c:Z

    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->b:Z

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method protected c()I
    .locals 2

    .line 68
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 69
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 71
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 73
    :cond_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->c:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    .line 75
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jg$a$b;
    .locals 1

    const/4 v0, 0x0

    .line 48
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->b:Z

    .line 49
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->c:Z

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->a:I

    return-object p0
.end method
