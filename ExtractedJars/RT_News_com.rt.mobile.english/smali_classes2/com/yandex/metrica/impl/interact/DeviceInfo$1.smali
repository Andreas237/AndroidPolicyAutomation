.class Lcom/yandex/metrica/impl/interact/DeviceInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/interact/DeviceInfo;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/k<",
        "Lcom/yandex/metrica/impl/ob/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/interact/DeviceInfo;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/interact/DeviceInfo;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo$1;->a:Lcom/yandex/metrica/impl/interact/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 76
    check-cast p1, Lcom/yandex/metrica/impl/ob/p;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/interact/DeviceInfo$1;->a(Lcom/yandex/metrica/impl/ob/p;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/p;)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo$1;->a:Lcom/yandex/metrica/impl/interact/DeviceInfo;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/p;->a:Ljava/lang/String;

    iput-object p1, v0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->locale:Ljava/lang/String;

    return-void
.end method
