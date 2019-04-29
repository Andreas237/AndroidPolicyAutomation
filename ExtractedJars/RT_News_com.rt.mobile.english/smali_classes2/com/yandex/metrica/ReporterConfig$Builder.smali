.class public Lcom/yandex/metrica/ReporterConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/ReporterConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# static fields
.field private static final a:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 42
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nl;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/nl;-><init>()V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/ReporterConfig$Builder;->a:Lcom/yandex/metrica/impl/ob/nk;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    sget-object v0, Lcom/yandex/metrica/ReporterConfig$Builder;->a:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 51
    iput-object p1, p0, Lcom/yandex/metrica/ReporterConfig$Builder;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/ReporterConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/yandex/metrica/ReporterConfig$Builder;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/yandex/metrica/ReporterConfig$Builder;)Ljava/lang/Integer;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/yandex/metrica/ReporterConfig$Builder;->c:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/yandex/metrica/ReporterConfig;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 83
    new-instance v0, Lcom/yandex/metrica/ReporterConfig;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/ReporterConfig;-><init>(Lcom/yandex/metrica/ReporterConfig$Builder;)V

    return-object v0
.end method

.method public withSessionTimeout(I)Lcom/yandex/metrica/ReporterConfig$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 77
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/ReporterConfig$Builder;->c:Ljava/lang/Integer;

    return-object p0
.end method
