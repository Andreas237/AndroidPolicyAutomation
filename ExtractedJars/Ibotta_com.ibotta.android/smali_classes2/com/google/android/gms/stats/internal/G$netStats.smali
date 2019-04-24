.class public final Lcom/google/android/gms/stats/internal/G$netStats;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/stats/internal/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "netStats"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/stats/internal/G$netStats$patterns;
    }
.end annotation


# static fields
.field public static final dataSourcePollIntervalMillis:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final enabled:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final recordIntervalSecs:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "gms:stats:netstats:enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Z)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats;->enabled:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:record_interval_secs"

    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/Long;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats;->recordIntervalSecs:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:data_source_poll_millis"

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/Long;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats;->dataSourcePollIntervalMillis:Lcom/google/android/gms/common/config/GservicesValue;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
