.class Lcom/yandex/metrica/impl/ob/gy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/gy;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/gy;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/gy;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gy$1;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 118
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gy$1;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/gy;->a(Lcom/yandex/metrica/impl/ob/gy;)Lcom/yandex/metrica/impl/ob/hg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hg;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    return-void
.end method
