.class Lcom/yandex/metrica/impl/g$2;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/g;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 107
    invoke-static {}, Lcom/yandex/metrica/impl/as$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Superuser.apk"

    .line 108
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/g$2;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/as$b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "su.so"

    .line 111
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/g$2;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
