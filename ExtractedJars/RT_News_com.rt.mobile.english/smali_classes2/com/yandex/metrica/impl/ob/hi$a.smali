.class public Lcom/yandex/metrica/impl/ob/hi$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/hi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/yandex/metrica/impl/ob/ks;

.field public final b:Lcom/yandex/metrica/impl/ob/gs;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hi$a;->a:Lcom/yandex/metrica/impl/ob/ks;

    .line 43
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hi$a;->b:Lcom/yandex/metrica/impl/ob/gs;

    return-void
.end method
