.class public Lcom/yandex/metrica/PreloadInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/PreloadInfo$Builder;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/PreloadInfo$Builder;)V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {p1}, Lcom/yandex/metrica/PreloadInfo$Builder;->a(Lcom/yandex/metrica/PreloadInfo$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/PreloadInfo;->a:Ljava/lang/String;

    .line 69
    invoke-static {p1}, Lcom/yandex/metrica/PreloadInfo$Builder;->b(Lcom/yandex/metrica/PreloadInfo$Builder;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/PreloadInfo;->b:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/PreloadInfo$Builder;B)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/yandex/metrica/PreloadInfo;-><init>(Lcom/yandex/metrica/PreloadInfo$Builder;)V

    return-void
.end method

.method public static newBuilder(Ljava/lang/String;)Lcom/yandex/metrica/PreloadInfo$Builder;
    .locals 2

    .line 82
    new-instance v0, Lcom/yandex/metrica/PreloadInfo$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/PreloadInfo$Builder;-><init>(Ljava/lang/String;B)V

    return-object v0
.end method


# virtual methods
.method public getAdditionalParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/yandex/metrica/PreloadInfo;->b:Ljava/util/Map;

    return-object v0
.end method

.method public getTrackingId()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/yandex/metrica/PreloadInfo;->a:Ljava/lang/String;

    return-object v0
.end method
