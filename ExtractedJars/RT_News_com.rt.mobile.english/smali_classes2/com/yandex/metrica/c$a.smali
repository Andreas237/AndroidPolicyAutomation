.class public Lcom/yandex/metrica/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lcom/yandex/metrica/ReporterConfig$Builder;

.field b:Ljava/lang/Integer;

.field c:Ljava/lang/Integer;

.field d:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/c$a;->d:Ljava/util/LinkedHashMap;

    .line 73
    invoke-static {p1}, Lcom/yandex/metrica/ReporterConfig;->newConfigBuilder(Ljava/lang/String;)Lcom/yandex/metrica/ReporterConfig$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/c$a;->a:Lcom/yandex/metrica/ReporterConfig$Builder;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/yandex/metrica/c$a;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 105
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/c$a;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public a()Lcom/yandex/metrica/c;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 135
    new-instance v0, Lcom/yandex/metrica/c;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/c;-><init>(Lcom/yandex/metrica/c$a;)V

    return-object v0
.end method
