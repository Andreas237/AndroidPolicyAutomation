.class public abstract Lcom/yandex/metrica/impl/ob/is;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ii;
.implements Lcom/yandex/metrica/impl/ob/jb;


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:I

.field private final c:Lcom/yandex/metrica/impl/ob/nk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/ik;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ik;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ik;",
            ")V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Lcom/yandex/metrica/impl/ob/is;->b:I

    .line 35
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/is;->a:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/is;->c:Lcom/yandex/metrica/impl/ob/nk;

    .line 37
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/is;->d:Lcom/yandex/metrica/impl/ob/ik;

    return-void
.end method


# virtual methods
.method public final a()Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 62
    new-instance v0, Lcom/yandex/metrica/impl/ob/jg$a$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jg$a$a;-><init>()V

    .line 63
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/is;->d()I

    move-result v1

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    .line 64
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/is;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    .line 65
    new-instance v1, Lcom/yandex/metrica/impl/ob/jg$a$c;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/jg$a$c;-><init>()V

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    .line 66
    new-instance v1, Lcom/yandex/metrica/impl/ob/jg$a$b;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/jg$a$b;-><init>()V

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/is;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/yandex/metrica/impl/ob/is;->b:I

    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/ik;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/is;->d:Lcom/yandex/metrica/impl/ob/ik;

    return-object v0
.end method

.method protected f()Z
    .locals 4

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/is;->c:Lcom/yandex/metrica/impl/ob/nk;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/is;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ni;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    .line 75
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attribute "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/is;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " of type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/is;->d()I

    move-result v3

    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/iz;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is skipped because "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ni;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 75
    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method
