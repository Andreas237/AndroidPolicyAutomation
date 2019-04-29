.class Lcom/yandex/metrica/impl/ax$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ax;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ax;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ax;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/yandex/metrica/impl/ax$2;->a:Lcom/yandex/metrica/impl/ax;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/yandex/metrica/impl/ax$2;->a:Lcom/yandex/metrica/impl/ax;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ax;->c(Lcom/yandex/metrica/impl/ax;)V

    return-void
.end method
