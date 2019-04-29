.class Lcom/yandex/metrica/impl/ob/gk$3;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gk$3;->a:Ljava/lang/String;

    iput p2, p0, Lcom/yandex/metrica/impl/ob/gk$3;->b:I

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 245
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/gk$3;->a:Ljava/lang/String;

    new-instance p2, Lcom/yandex/metrica/impl/ob/gk$3$1;

    invoke-direct {p2, p0}, Lcom/yandex/metrica/impl/ob/gk$3$1;-><init>(Lcom/yandex/metrica/impl/ob/gk$3;)V

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gk$3;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
