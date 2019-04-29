.class public Lcom/yandex/metrica/Revenue$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/Revenue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# static fields
.field private static final g:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/util/Currency;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:D

.field b:Ljava/util/Currency;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field c:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field d:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field f:Lcom/yandex/metrica/Revenue$Receipt;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 117
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nf;

    const-string v2, "revenue currency"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/nf;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/Revenue$Builder;->g:Lcom/yandex/metrica/impl/ob/nk;

    return-void
.end method

.method constructor <init>(DLjava/util/Currency;)V
    .locals 1
    .param p3    # Ljava/util/Currency;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    sget-object v0, Lcom/yandex/metrica/Revenue$Builder;->g:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p3}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 135
    iput-wide p1, p0, Lcom/yandex/metrica/Revenue$Builder;->a:D

    .line 136
    iput-object p3, p0, Lcom/yandex/metrica/Revenue$Builder;->b:Ljava/util/Currency;

    return-void
.end method


# virtual methods
.method public build()Lcom/yandex/metrica/Revenue;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 210
    new-instance v0, Lcom/yandex/metrica/Revenue;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/Revenue;-><init>(Lcom/yandex/metrica/Revenue$Builder;B)V

    return-object v0
.end method

.method public withPayload(Ljava/lang/String;)Lcom/yandex/metrica/Revenue$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 182
    iput-object p1, p0, Lcom/yandex/metrica/Revenue$Builder;->e:Ljava/lang/String;

    return-object p0
.end method

.method public withProductID(Ljava/lang/String;)Lcom/yandex/metrica/Revenue$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 167
    iput-object p1, p0, Lcom/yandex/metrica/Revenue$Builder;->d:Ljava/lang/String;

    return-object p0
.end method

.method public withQuantity(Ljava/lang/Integer;)Lcom/yandex/metrica/Revenue$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 151
    iput-object p1, p0, Lcom/yandex/metrica/Revenue$Builder;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public withReceipt(Lcom/yandex/metrica/Revenue$Receipt;)Lcom/yandex/metrica/Revenue$Builder;
    .locals 0
    .param p1    # Lcom/yandex/metrica/Revenue$Receipt;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 199
    iput-object p1, p0, Lcom/yandex/metrica/Revenue$Builder;->f:Lcom/yandex/metrica/Revenue$Receipt;

    return-object p0
.end method
