.class Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field static final a:Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 70
    new-instance v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;-><init>(B)V

    sput-object v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$c;->a:Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    return-void
.end method
