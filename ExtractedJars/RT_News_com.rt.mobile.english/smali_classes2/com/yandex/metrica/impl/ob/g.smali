.class public final Lcom/yandex/metrica/impl/ob/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[Ljava/lang/String;

.field public static final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 75
    new-array v1, v0, [I

    sput-object v1, Lcom/yandex/metrica/impl/ob/g;->a:[I

    .line 80
    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/yandex/metrica/impl/ob/g;->b:[Ljava/lang/String;

    .line 82
    new-array v0, v0, [B

    sput-object v0, Lcom/yandex/metrica/impl/ob/g;->c:[B

    return-void
.end method

.method static a(I)I
    .locals 0

    and-int/lit8 p0, p0, 0x7

    return p0
.end method

.method static a(II)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    or-int/2addr p0, p1

    return p0
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/a;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->b(I)Z

    move-result p0

    return p0
.end method

.method public static b(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x3

    return p0
.end method

.method public static final b(Lcom/yandex/metrica/impl/ob/a;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 114
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->s()I

    move-result v0

    .line 115
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->b(I)Z

    const/4 v1, 0x1

    .line 116
    :goto_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 117
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/a;->b(I)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/a;->e(I)V

    return v1
.end method
