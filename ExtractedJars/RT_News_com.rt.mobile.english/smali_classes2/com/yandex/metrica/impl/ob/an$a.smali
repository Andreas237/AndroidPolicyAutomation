.class final Lcom/yandex/metrica/impl/ob/an$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/an;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/am;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/am;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 107
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/am;->c()Ljava/lang/String;

    move-result-object v0

    .line 108
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/am;->d()Ljava/lang/Integer;

    move-result-object v1

    .line 109
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/am;->e()Ljava/lang/String;

    move-result-object p1

    .line 107
    invoke-direct {p0, v0, v1, p1}, Lcom/yandex/metrica/impl/ob/an$a;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/an$a;->a:Ljava/lang/String;

    .line 102
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    .line 103
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 125
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/an$a;

    .line 127
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/an$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/an$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 128
    :cond_2
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    if-eqz v2, :cond_4

    :goto_0
    return v1

    .line 129
    :cond_4
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    if-nez p1, :cond_6

    return v0

    :cond_6
    return v1

    :cond_7
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/an$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 115
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an$a;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 116
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    return v0
.end method
