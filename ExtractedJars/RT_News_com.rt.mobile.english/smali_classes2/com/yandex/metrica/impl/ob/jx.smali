.class public Lcom/yandex/metrica/impl/ob/jx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/util/Random;

.field private d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1f

    if-lez p1, :cond_0

    if-gt p1, v0, :cond_0

    .line 26
    iput p1, p0, Lcom/yandex/metrica/impl/ob/jx;->a:I

    goto :goto_0

    .line 28
    :cond_0
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jx;->a:I

    .line 30
    :goto_0
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jx;->c:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 34
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jx;->b:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/jx;->a:I

    if-ge v0, v1, :cond_0

    .line 35
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jx;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jx;->b:I

    .line 36
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jx;->b:I

    shl-int v0, v1, v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jx;->d:I

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jx;->c:Ljava/util/Random;

    iget v1, p0, Lcom/yandex/metrica/impl/ob/jx;->d:I

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0
.end method
