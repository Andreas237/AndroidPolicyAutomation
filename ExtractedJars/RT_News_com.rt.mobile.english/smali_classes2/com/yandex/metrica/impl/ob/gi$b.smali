.class Lcom/yandex/metrica/impl/ob/gi$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/gi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Lcom/yandex/metrica/impl/ob/gi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 60
    new-instance v0, Lcom/yandex/metrica/impl/ob/gi;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/gi;-><init>(B)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/gi$b;->a:Lcom/yandex/metrica/impl/ob/gi;

    return-void
.end method

.method static synthetic a()Lcom/yandex/metrica/impl/ob/gi;
    .locals 1

    .line 59
    sget-object v0, Lcom/yandex/metrica/impl/ob/gi$b;->a:Lcom/yandex/metrica/impl/ob/gi;

    return-object v0
.end method
