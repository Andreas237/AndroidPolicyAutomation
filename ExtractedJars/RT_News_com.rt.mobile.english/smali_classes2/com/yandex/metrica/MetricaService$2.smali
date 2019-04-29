.class Lcom/yandex/metrica/MetricaService$2;
.super Lcom/yandex/metrica/IMetricaService$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/MetricaService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/MetricaService;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/MetricaService;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/yandex/metrica/MetricaService$2;->a:Lcom/yandex/metrica/MetricaService;

    invoke-direct {p0}, Lcom/yandex/metrica/IMetricaService$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public reportData(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService$2;->a:Lcom/yandex/metrica/MetricaService;

    invoke-static {v0}, Lcom/yandex/metrica/MetricaService;->a(Lcom/yandex/metrica/MetricaService;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ag;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/yandex/metrica/MetricaService$2;->a:Lcom/yandex/metrica/MetricaService;

    invoke-static {v0}, Lcom/yandex/metrica/MetricaService;->a(Lcom/yandex/metrica/MetricaService;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/yandex/metrica/impl/ag;->a(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
