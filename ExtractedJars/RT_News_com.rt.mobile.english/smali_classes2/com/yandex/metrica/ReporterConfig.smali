.class public Lcom/yandex/metrica/ReporterConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/ReporterConfig$Builder;
    }
.end annotation


# instance fields
.field public final apiKey:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final sessionTimeout:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/ReporterConfig$Builder;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/ReporterConfig$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {p1}, Lcom/yandex/metrica/ReporterConfig$Builder;->a(Lcom/yandex/metrica/ReporterConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/ReporterConfig;->apiKey:Ljava/lang/String;

    .line 27
    invoke-static {p1}, Lcom/yandex/metrica/ReporterConfig$Builder;->b(Lcom/yandex/metrica/ReporterConfig$Builder;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/ReporterConfig;->sessionTimeout:Ljava/lang/Integer;

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/ReporterConfig;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/ReporterConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iget-object v0, p1, Lcom/yandex/metrica/ReporterConfig;->apiKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/ReporterConfig;->apiKey:Ljava/lang/String;

    .line 32
    iget-object p1, p1, Lcom/yandex/metrica/ReporterConfig;->sessionTimeout:Ljava/lang/Integer;

    iput-object p1, p0, Lcom/yandex/metrica/ReporterConfig;->sessionTimeout:Ljava/lang/Integer;

    return-void
.end method

.method public static newConfigBuilder(Ljava/lang/String;)Lcom/yandex/metrica/ReporterConfig$Builder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 37
    new-instance v0, Lcom/yandex/metrica/ReporterConfig$Builder;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/ReporterConfig$Builder;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
