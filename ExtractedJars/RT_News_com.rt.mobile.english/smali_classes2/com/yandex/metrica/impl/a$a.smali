.class public final Lcom/yandex/metrica/impl/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    .line 40
    iput-wide p2, p0, Lcom/yandex/metrica/impl/a$a;->b:J

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 48
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/a$a;

    .line 50
    iget-wide v2, p0, Lcom/yandex/metrica/impl/a$a;->b:J

    iget-wide v4, p1, Lcom/yandex/metrica/impl/a$a;->b:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    return v1

    .line 51
    :cond_2
    iget-object v2, p0, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    if-nez p1, :cond_5

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1

    :cond_6
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 7

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 58
    iget-wide v1, p0, Lcom/yandex/metrica/impl/a$a;->b:J

    iget-wide v3, p0, Lcom/yandex/metrica/impl/a$a;->b:J

    const/16 v5, 0x20

    ushr-long/2addr v3, v5

    xor-long v5, v1, v3

    long-to-int v1, v5

    add-int/2addr v0, v1

    return v0
.end method
