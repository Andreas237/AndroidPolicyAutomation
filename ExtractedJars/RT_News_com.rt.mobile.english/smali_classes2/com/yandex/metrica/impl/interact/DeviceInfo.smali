.class public final Lcom/yandex/metrica/impl/interact/DeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static volatile b:Lcom/yandex/metrica/impl/interact/DeviceInfo;


# instance fields
.field public final appPlatform:Ljava/lang/String;

.field public final deviceRootStatus:Ljava/lang/String;

.field public final deviceRootStatusMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final deviceType:Ljava/lang/String;

.field public locale:Ljava/lang/String;

.field public final manufacturer:Ljava/lang/String;

.field public final model:Ljava/lang/String;

.field public final osVersion:Ljava/lang/String;

.field public final platform:Ljava/lang/String;

.field public final platformDeviceId:Ljava/lang/String;

.field public final scaleFactor:F

.field public final screenDpi:I

.field public final screenHeight:I

.field public final screenWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/g;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/g;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->platform:Ljava/lang/String;

    .line 58
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->appPlatform:Ljava/lang/String;

    .line 59
    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->platformDeviceId:Ljava/lang/String;

    .line 60
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->manufacturer:Ljava/lang/String;

    .line 61
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->model:Ljava/lang/String;

    .line 62
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->osVersion:Ljava/lang/String;

    .line 64
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->a:I

    iput v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->screenWidth:I

    .line 65
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->b:I

    iput v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->screenHeight:I

    .line 66
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->c:I

    iput v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->screenDpi:I

    .line 67
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->d:F

    iput v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->scaleFactor:F

    .line 69
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->deviceType:Ljava/lang/String;

    .line 70
    iget-object v0, p2, Lcom/yandex/metrica/impl/g;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->deviceRootStatus:Ljava/lang/String;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    iget-object p2, p2, Lcom/yandex/metrica/impl/g;->i:Ljava/util/List;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->deviceRootStatusMarkers:Ljava/util/List;

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {p1}, Lcom/yandex/metrica/impl/as;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->locale:Ljava/lang/String;

    .line 75
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class p2, Lcom/yandex/metrica/impl/ob/p;

    new-instance v0, Lcom/yandex/metrica/impl/interact/DeviceInfo$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/interact/DeviceInfo$1;-><init>(Lcom/yandex/metrica/impl/interact/DeviceInfo;)V

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v0

    .line 75
    invoke-virtual {p1, p0, p2, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/yandex/metrica/impl/interact/DeviceInfo;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 46
    sget-object v0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->b:Lcom/yandex/metrica/impl/interact/DeviceInfo;

    if-nez v0, :cond_1

    .line 47
    sget-object v0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 48
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/interact/DeviceInfo;->b:Lcom/yandex/metrica/impl/interact/DeviceInfo;

    if-nez v1, :cond_0

    .line 49
    new-instance v1, Lcom/yandex/metrica/impl/interact/DeviceInfo;

    invoke-static {p0}, Lcom/yandex/metrica/impl/g;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/g;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/yandex/metrica/impl/interact/DeviceInfo;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/g;)V

    sput-object v1, Lcom/yandex/metrica/impl/interact/DeviceInfo;->b:Lcom/yandex/metrica/impl/interact/DeviceInfo;

    .line 51
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 53
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/interact/DeviceInfo;->b:Lcom/yandex/metrica/impl/interact/DeviceInfo;

    return-object p0
.end method
