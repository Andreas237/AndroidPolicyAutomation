.class public Lcom/yandex/metrica/impl/ob/hq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ho;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 17
    new-instance v0, Lcom/yandex/metrica/impl/ob/hp;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/hp;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
