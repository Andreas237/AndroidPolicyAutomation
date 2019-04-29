.class public Lcom/yandex/metrica/Revenue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/Revenue$Receipt;,
        Lcom/yandex/metrica/Revenue$Builder;
    }
.end annotation


# instance fields
.field public final currency:Ljava/util/Currency;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final payload:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final price:D

.field public final productID:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final quantity:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final receipt:Lcom/yandex/metrica/Revenue$Receipt;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/Revenue$Builder;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/Revenue$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iget-wide v0, p1, Lcom/yandex/metrica/Revenue$Builder;->a:D

    iput-wide v0, p0, Lcom/yandex/metrica/Revenue;->price:D

    .line 89
    iget-object v0, p1, Lcom/yandex/metrica/Revenue$Builder;->b:Ljava/util/Currency;

    iput-object v0, p0, Lcom/yandex/metrica/Revenue;->currency:Ljava/util/Currency;

    .line 90
    iget-object v0, p1, Lcom/yandex/metrica/Revenue$Builder;->c:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/yandex/metrica/Revenue;->quantity:Ljava/lang/Integer;

    .line 91
    iget-object v0, p1, Lcom/yandex/metrica/Revenue$Builder;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/Revenue;->productID:Ljava/lang/String;

    .line 92
    iget-object v0, p1, Lcom/yandex/metrica/Revenue$Builder;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/Revenue;->payload:Ljava/lang/String;

    .line 93
    iget-object p1, p1, Lcom/yandex/metrica/Revenue$Builder;->f:Lcom/yandex/metrica/Revenue$Receipt;

    iput-object p1, p0, Lcom/yandex/metrica/Revenue;->receipt:Lcom/yandex/metrica/Revenue$Receipt;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/Revenue$Builder;B)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/yandex/metrica/Revenue;-><init>(Lcom/yandex/metrica/Revenue$Builder;)V

    return-void
.end method

.method public static newBuilder(DLjava/util/Currency;)Lcom/yandex/metrica/Revenue$Builder;
    .locals 1
    .param p2    # Ljava/util/Currency;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 109
    new-instance v0, Lcom/yandex/metrica/Revenue$Builder;

    invoke-direct {v0, p0, p1, p2}, Lcom/yandex/metrica/Revenue$Builder;-><init>(DLjava/util/Currency;)V

    return-object v0
.end method
