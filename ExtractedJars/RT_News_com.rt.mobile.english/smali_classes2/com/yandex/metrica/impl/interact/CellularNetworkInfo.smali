.class public Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 37
    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;->a:Ljava/lang/String;

    .line 40
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lh;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/lh;

    move-result-object p1

    new-instance v0, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo$1;-><init>(Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;)V

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lh;->a(Lcom/yandex/metrica/impl/ob/lk;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;->a:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public getCelluralInfo()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;->a:Ljava/lang/String;

    return-object v0
.end method
