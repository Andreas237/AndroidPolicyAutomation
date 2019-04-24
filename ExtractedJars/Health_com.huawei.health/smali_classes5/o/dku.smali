.class public Lo/dku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# static fields
.field private static final b:Ljava/lang/Object;

.field private static e:Lo/dku;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dku;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    return-void
.end method

.method public static a()Lo/dku;
    .locals 6

    .line 35
    sget-object v4, Lo/dku;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 36
    const-string v0, "HWFileServicesManagerQueue"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() instance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dku;->e:Lo/dku;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    sget-object v0, Lo/dku;->e:Lo/dku;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 38
    new-instance v0, Lo/dku;

    invoke-direct {v0}, Lo/dku;-><init>()V

    sput-object v0, Lo/dku;->e:Lo/dku;

    .line 40
    :cond_0
    sget-object v0, Lo/dku;->e:Lo/dku;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 41
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method


# virtual methods
.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 4

    .line 51
    const-string v0, "HWFileServicesManagerQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getResult() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-static {}, Lo/dky;->b()Lo/dky;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dky;->c([B)V

    .line 53
    return-void
.end method
