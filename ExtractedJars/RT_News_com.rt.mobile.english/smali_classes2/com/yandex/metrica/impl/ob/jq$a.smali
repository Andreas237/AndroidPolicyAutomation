.class public Lcom/yandex/metrica/impl/ob/jq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 272
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    .line 273
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    .line 274
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

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

    if-eqz p1, :cond_8

    .line 280
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 282
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/jq$a;

    .line 284
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 285
    :cond_3
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 286
    :cond_5
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    if-nez p1, :cond_7

    return v0

    :cond_7
    return v1

    :cond_8
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 291
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 292
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 293
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method
