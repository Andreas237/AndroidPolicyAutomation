.class Lcom/yandex/metrica/impl/az$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 595
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/yandex/metrica/impl/ob/ab;)Lcom/yandex/metrica/impl/az;
    .locals 1

    .line 597
    new-instance v0, Lcom/yandex/metrica/impl/az;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/az;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-object v0
.end method
