.class Lcom/yandex/metrica/impl/ah$8;
.super Lcom/yandex/metrica/impl/ah$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ah;->a(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lcom/yandex/metrica/impl/ah;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ah;Landroid/os/Bundle;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/yandex/metrica/impl/ah$8;->b:Lcom/yandex/metrica/impl/ah;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ah$8;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ah$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah$8;->b:Lcom/yandex/metrica/impl/ah;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ah;->a(Lcom/yandex/metrica/impl/ah;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ah$8;->a:Landroid/os/Bundle;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ag;->a(Landroid/os/Bundle;)V

    return-void
.end method
