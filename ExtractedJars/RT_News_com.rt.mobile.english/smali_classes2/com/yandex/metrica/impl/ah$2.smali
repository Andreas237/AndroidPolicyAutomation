.class Lcom/yandex/metrica/impl/ah$2;
.super Lcom/yandex/metrica/impl/ah$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ah;->a(Landroid/content/Intent;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:I

.field final synthetic c:Lcom/yandex/metrica/impl/ah;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;I)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/yandex/metrica/impl/ah$2;->c:Lcom/yandex/metrica/impl/ah;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ah$2;->a:Landroid/content/Intent;

    iput p3, p0, Lcom/yandex/metrica/impl/ah$2;->b:I

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ah$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah$2;->c:Lcom/yandex/metrica/impl/ah;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ah;->a(Lcom/yandex/metrica/impl/ah;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ah$2;->a:Landroid/content/Intent;

    iget v2, p0, Lcom/yandex/metrica/impl/ah$2;->b:I

    invoke-interface {v0, v1, v2}, Lcom/yandex/metrica/impl/ag;->a(Landroid/content/Intent;I)V

    return-void
.end method
