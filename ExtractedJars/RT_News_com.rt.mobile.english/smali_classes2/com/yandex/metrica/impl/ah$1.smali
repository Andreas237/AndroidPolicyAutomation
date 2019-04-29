.class Lcom/yandex/metrica/impl/ah$1;
.super Lcom/yandex/metrica/impl/ah$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ah;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ah;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ah;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/yandex/metrica/impl/ah$1;->a:Lcom/yandex/metrica/impl/ah;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ah$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah$1;->a:Lcom/yandex/metrica/impl/ah;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ah;->a(Lcom/yandex/metrica/impl/ah;)Lcom/yandex/metrica/impl/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ag;->a()V

    return-void
.end method
