.class public interface abstract Lcom/yandex/metrica/MetricaService$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/MetricaService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    .line 38
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "com.yandex.metrica.ACTION_C_BG_L"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/MetricaService$a;->a:Ljava/util/List;

    return-void
.end method
