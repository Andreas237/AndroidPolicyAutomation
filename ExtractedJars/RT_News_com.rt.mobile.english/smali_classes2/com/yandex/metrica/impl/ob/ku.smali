.class public Lcom/yandex/metrica/impl/ob/ku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/kw;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/kr;)Lcom/yandex/metrica/impl/ob/kt;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/kr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/ki;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/yandex/metrica/impl/ob/ki;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/kr;)V

    return-object v0
.end method
