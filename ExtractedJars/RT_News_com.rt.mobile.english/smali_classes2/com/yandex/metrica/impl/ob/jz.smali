.class public Lcom/yandex/metrica/impl/ob/jz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ka;


# instance fields
.field protected a:I

.field private final b:I

.field private c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jz;->a:I

    .line 24
    iput p1, p0, Lcom/yandex/metrica/impl/ob/jz;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 32
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jz;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jz;->a:I

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jz;->c:Z

    return-void
.end method

.method public b()Z
    .locals 2

    .line 28
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jz;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/yandex/metrica/impl/ob/jz;->a:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/jz;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jz;->c:Z

    return-void
.end method
