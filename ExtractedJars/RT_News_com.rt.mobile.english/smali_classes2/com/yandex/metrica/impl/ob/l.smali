.class public Lcom/yandex/metrica/impl/ob/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/j;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/k;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/i;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/l$a;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/l$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/l$a;->a:Lcom/yandex/metrica/impl/ob/k;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/l;->a:Lcom/yandex/metrica/impl/ob/k;

    .line 21
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/l$a;->b:Lcom/yandex/metrica/impl/ob/i;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/l;->b:Lcom/yandex/metrica/impl/ob/i;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/l$a;B)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/l;-><init>(Lcom/yandex/metrica/impl/ob/l$a;)V

    return-void
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;
    .locals 1
    .param p0    # Lcom/yandex/metrica/impl/ob/k;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/yandex/metrica/impl/ob/j;",
            ">(",
            "Lcom/yandex/metrica/impl/ob/k<",
            "TT;>;)",
            "Lcom/yandex/metrica/impl/ob/l$a<",
            "TT;>;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/yandex/metrica/impl/ob/l$a;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/l$a;-><init>(Lcom/yandex/metrica/impl/ob/k;)V

    return-object v0
.end method


# virtual methods
.method final a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/j;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/l;->a:Lcom/yandex/metrica/impl/ob/k;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/k;->a(Lcom/yandex/metrica/impl/ob/j;)V

    return-void
.end method

.method final b(Lcom/yandex/metrica/impl/ob/j;)Z
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/j;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/l;->b:Lcom/yandex/metrica/impl/ob/i;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/l;->b:Lcom/yandex/metrica/impl/ob/i;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/i;->a(Lcom/yandex/metrica/impl/ob/j;)Z

    move-result p1

    return p1
.end method
