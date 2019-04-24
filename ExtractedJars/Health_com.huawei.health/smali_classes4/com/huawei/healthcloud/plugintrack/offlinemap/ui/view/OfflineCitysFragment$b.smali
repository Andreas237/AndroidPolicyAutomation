.class final enum Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

.field public static final enum b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

.field public static final enum d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

.field private static final synthetic e:[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    const-string v1, "ALL_CITY_LIST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    const-string v1, "SEARCH_CITY_LIST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    const-string v1, "NULL_DATA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    .line 50
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->e:[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;
    .locals 1

    .line 50
    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    return-object v0
.end method

.method public static values()[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;
    .locals 1

    .line 50
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->e:[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    invoke-virtual {v0}, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    return-object v0
.end method
