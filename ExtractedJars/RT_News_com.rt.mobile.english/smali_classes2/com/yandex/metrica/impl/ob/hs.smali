.class public Lcom/yandex/metrica/impl/ob/hs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hs;->a:Ljava/lang/String;

    .line 20
    iput-boolean p2, p0, Lcom/yandex/metrica/impl/ob/hs;->b:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/hs;->b:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hs;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 37
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/hs;

    .line 39
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/hs;->b:Z

    iget-boolean v2, p1, Lcom/yandex/metrica/impl/ob/hs;->b:Z

    if-eq v1, v2, :cond_2

    return v0

    .line 40
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hs;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/hs;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hs;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 47
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/hs;->b:Z

    add-int/2addr v0, v1

    return v0
.end method
