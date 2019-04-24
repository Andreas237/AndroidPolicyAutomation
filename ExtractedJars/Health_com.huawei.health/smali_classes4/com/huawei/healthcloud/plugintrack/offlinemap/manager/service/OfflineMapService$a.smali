.class public final enum Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

.field private static final synthetic b:[Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

.field public static final enum c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

.field public static final enum d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

.field public static final enum e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 188
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const-string v1, "OFFLINE_ACTIVITY_DESTROY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const-string v1, "OFFLINE_ACTIVITY_EXIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const-string v1, "MAIN_ACTIVITY_CREATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const-string v1, "INVALID"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    .line 186
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->b:[Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 186
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;
    .locals 1

    .line 186
    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;
    .locals 1

    .line 186
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->b:[Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    invoke-virtual {v0}, [Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    return-object v0
.end method
