.class public abstract Lcom/yandex/metrica/impl/ob/bq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/bl;


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ab;


# direct methods
.method protected constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/bq;->a:Lcom/yandex/metrica/impl/ob/ab;

    return-void
.end method


# virtual methods
.method protected a()Lcom/yandex/metrica/impl/ob/ab;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/bq;->a:Lcom/yandex/metrica/impl/ob/ab;

    return-object v0
.end method
