.class Lcom/yandex/metrica/impl/av$j;
.super Lcom/yandex/metrica/impl/av$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/av;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 730
    invoke-direct {p0}, Lcom/yandex/metrica/impl/av$c;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()[B
    .locals 5

    const/4 v0, 0x0

    .line 735
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/av$j;->b:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/jn;->a([B)Lcom/yandex/metrica/impl/ob/jn;

    move-result-object v1

    .line 736
    new-instance v2, Lcom/yandex/metrica/impl/ob/jd;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jd;-><init>()V

    .line 737
    iget-object v3, v1, Lcom/yandex/metrica/impl/ob/jn;->a:Ljava/lang/String;

    if-nez v3, :cond_0

    new-array v3, v0, [B

    goto :goto_0

    :cond_0
    iget-object v3, v1, Lcom/yandex/metrica/impl/ob/jn;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    :goto_0
    iput-object v3, v2, Lcom/yandex/metrica/impl/ob/jd;->b:[B

    .line 738
    iget-wide v3, v1, Lcom/yandex/metrica/impl/ob/jn;->b:J

    iput-wide v3, v2, Lcom/yandex/metrica/impl/ob/jd;->d:J

    .line 739
    iget-wide v3, v1, Lcom/yandex/metrica/impl/ob/jn;->c:J

    iput-wide v3, v2, Lcom/yandex/metrica/impl/ob/jd;->c:J

    .line 740
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;)[B

    move-result-object v1
    :try_end_0
    .catch Lcom/yandex/metrica/impl/ob/d; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 742
    :catch_0
    new-array v0, v0, [B

    return-object v0
.end method
