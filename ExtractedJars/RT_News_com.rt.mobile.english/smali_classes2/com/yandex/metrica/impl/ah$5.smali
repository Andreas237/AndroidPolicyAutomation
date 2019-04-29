.class Lcom/yandex/metrica/impl/ah$5;
.super Lcom/yandex/metrica/impl/ah$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ah;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/yandex/metrica/impl/ah;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/yandex/metrica/impl/ah$5;->b:Lcom/yandex/metrica/impl/ah;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ah$5;->a:Landroid/content/Intent;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ah$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah$5;->b:Lcom/yandex/metrica/impl/ah;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ah;->a(Lcom/yandex/metrica/impl/ah;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ah$5;->a:Landroid/content/Intent;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ag;->b(Landroid/content/Intent;)V

    return-void
.end method
