.class public Lcom/yandex/metrica/impl/ob/hh$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/hh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/gp;)Lcom/yandex/metrica/impl/ob/gt;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 52
    new-instance v0, Lcom/yandex/metrica/impl/ob/gt;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/gt;-><init>(Lcom/yandex/metrica/impl/ob/gp;)V

    return-object v0
.end method
