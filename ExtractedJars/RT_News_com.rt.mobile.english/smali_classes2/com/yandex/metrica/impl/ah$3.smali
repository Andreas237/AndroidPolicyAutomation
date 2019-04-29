.class Lcom/yandex/metrica/impl/ah$3;
.super Lcom/yandex/metrica/impl/ah$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ah;->a(Landroid/content/Intent;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/yandex/metrica/impl/ah;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;II)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/yandex/metrica/impl/ah$3;->d:Lcom/yandex/metrica/impl/ah;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ah$3;->a:Landroid/content/Intent;

    iput p3, p0, Lcom/yandex/metrica/impl/ah$3;->b:I

    iput p4, p0, Lcom/yandex/metrica/impl/ah$3;->c:I

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ah$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 72
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah$3;->d:Lcom/yandex/metrica/impl/ah;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ah;->a(Lcom/yandex/metrica/impl/ah;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ah$3;->a:Landroid/content/Intent;

    iget v2, p0, Lcom/yandex/metrica/impl/ah$3;->b:I

    iget v3, p0, Lcom/yandex/metrica/impl/ah$3;->c:I

    invoke-interface {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ag;->a(Landroid/content/Intent;II)V

    return-void
.end method
