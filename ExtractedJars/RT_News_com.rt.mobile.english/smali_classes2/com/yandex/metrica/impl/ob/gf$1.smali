.class synthetic Lcom/yandex/metrica/impl/ob/gf$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/gf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 38
    invoke-static {}, Lcom/yandex/metrica/impl/ob/ge$a;->values()[Lcom/yandex/metrica/impl/ob/ge$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/yandex/metrica/impl/ob/gf$1;->a:[I

    :try_start_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/gf$1;->a:[I

    sget-object v1, Lcom/yandex/metrica/impl/ob/ge$a;->a:Lcom/yandex/metrica/impl/ob/ge$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ge$a;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/yandex/metrica/impl/ob/gf$1;->a:[I

    sget-object v1, Lcom/yandex/metrica/impl/ob/ge$a;->b:Lcom/yandex/metrica/impl/ob/ge$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ge$a;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
