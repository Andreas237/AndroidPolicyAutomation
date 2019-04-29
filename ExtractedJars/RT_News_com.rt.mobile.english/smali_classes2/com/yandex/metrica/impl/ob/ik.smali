.class public abstract Lcom/yandex/metrica/impl/ob/ik;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ij;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ij;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ij;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ik;->a:Lcom/yandex/metrica/impl/ob/ij;

    return-void
.end method

.method static a(Lcom/yandex/metrica/impl/ob/jg$a$a;)Z
    .locals 0
    .param p0    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_1

    .line 35
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    iget-boolean p0, p0, Lcom/yandex/metrica/impl/ob/jg$a$b;->c:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method a()Lcom/yandex/metrica/impl/ob/ij;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ik;->a:Lcom/yandex/metrica/impl/ob/ij;

    return-object v0
.end method

.method public abstract a(Lcom/yandex/metrica/impl/ob/ja;Lcom/yandex/metrica/impl/ob/jg$a$a;Lcom/yandex/metrica/impl/ob/ii;)Lcom/yandex/metrica/impl/ob/jg$a$a;
    .param p1    # Lcom/yandex/metrica/impl/ob/ja;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ii;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
