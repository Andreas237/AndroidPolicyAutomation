.class Lcom/yandex/metrica/impl/ob/lx$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/lx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static a:Lcom/yandex/metrica/impl/ob/lx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/lx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lx;-><init>(B)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/lx$a;->a:Lcom/yandex/metrica/impl/ob/lx;

    return-void
.end method
