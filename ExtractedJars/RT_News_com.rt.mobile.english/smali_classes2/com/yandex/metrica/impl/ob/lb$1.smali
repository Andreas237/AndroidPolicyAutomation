.class Lcom/yandex/metrica/impl/ob/lb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/lb;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/lb;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/lb;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lb$1;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$1;->a:Lcom/yandex/metrica/impl/ob/lb;

    new-instance v1, Lcom/yandex/metrica/impl/ob/lb$a;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/lb$1;->a:Lcom/yandex/metrica/impl/ob/lb;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/lb$a;-><init>(Lcom/yandex/metrica/impl/ob/lb;B)V

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;Landroid/telephony/PhoneStateListener;)Landroid/telephony/PhoneStateListener;

    return-void
.end method
