.class Lcom/yandex/metrica/impl/av$b;
.super Lcom/yandex/metrica/impl/av$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/av;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 756
    invoke-direct {p0}, Lcom/yandex/metrica/impl/av$c;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()[B
    .locals 2

    .line 760
    iget-object v0, p0, Lcom/yandex/metrica/impl/av$b;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    return-object v0
.end method
