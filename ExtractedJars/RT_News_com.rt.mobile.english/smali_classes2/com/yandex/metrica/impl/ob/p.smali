.class public Lcom/yandex/metrica/impl/ob/p;
.super Lcom/yandex/metrica/impl/ob/j;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/j;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/p;->a:Ljava/lang/String;

    return-void
.end method
