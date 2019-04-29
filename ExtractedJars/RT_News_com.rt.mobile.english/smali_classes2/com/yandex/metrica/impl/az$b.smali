.class final Lcom/yandex/metrica/impl/az$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Lcom/yandex/metrica/impl/ob/jc$c$e;

.field final b:Lcom/yandex/metrica/impl/a$a;

.field final c:Z


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/jc$c$e;Lcom/yandex/metrica/impl/a$a;Z)V
    .locals 0

    .line 584
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 585
    iput-object p1, p0, Lcom/yandex/metrica/impl/az$b;->a:Lcom/yandex/metrica/impl/ob/jc$c$e;

    .line 586
    iput-object p2, p0, Lcom/yandex/metrica/impl/az$b;->b:Lcom/yandex/metrica/impl/a$a;

    .line 587
    iput-boolean p3, p0, Lcom/yandex/metrica/impl/az$b;->c:Z

    return-void
.end method
