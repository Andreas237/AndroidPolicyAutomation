.class Lcom/yandex/metrica/impl/be$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/be;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/be;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/be;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/yandex/metrica/impl/be$1;->a:Lcom/yandex/metrica/impl/be;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/yandex/metrica/impl/be$1;->a:Lcom/yandex/metrica/impl/be;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/be;->e()V

    return-void
.end method
