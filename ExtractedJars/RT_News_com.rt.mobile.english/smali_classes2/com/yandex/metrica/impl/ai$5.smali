.class Lcom/yandex/metrica/impl/ai$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ai;->d(Lcom/yandex/metrica/impl/ob/ks;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/du;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/du;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lcom/yandex/metrica/impl/ai$5;->a:Lcom/yandex/metrica/impl/ob/du;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai$5;->a:Lcom/yandex/metrica/impl/ob/du;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/du;->a()V

    return-void
.end method
