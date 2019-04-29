.class public final Lcom/google/android/gms/stats/internal/G$netStats$patterns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/stats/internal/G$netStats;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "patterns"
.end annotation


# static fields
.field public static final BUCKET:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final HISTORY:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final IDENT:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final IDENTS:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TAG_RADIX:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final TS_TO_MILLIS:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_BACKGROUND:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_BOTH:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_DEBUG_VPN_IN_PATTERN:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_DEBUG_VPN_OUT_PATTERN:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_FOREGROUND:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final UID_STATS_START:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final UID_TAG_STATS_START:Lcom/google/android/gms/common/config/GservicesValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/config/GservicesValue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "gms:stats:netstats:pattern:idents"

    const-string v1, " *ident=\\[(?<idents>.*)\\](?: uid=(?<uid>-?[0-9]+))?(?: set=(?<set>\\w+))?(?: tag=0x(?<tag>[0-9a-f]+))?.*"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->IDENTS:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:ident"

    sget-object v1, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->IDENT_PATTERN:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->IDENT:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:history"

    const-string v1, ".*bucketDuration=(?<duration>[0-9]+).*"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->HISTORY:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:bucket"

    sget-object v1, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->BUCKET_PATTERN:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->BUCKET:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:uid_start"

    const-string v1, "UID stats:|Detailed UID stats:"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->UID_STATS_START:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:uid_tag_start"

    const-string v1, "UID tag stats:"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->UID_TAG_STATS_START:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:type_both"

    const-string v1, "ALL"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_BOTH:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:type_background"

    const-string v1, "DEFAULT"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_BACKGROUND:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:type_foreground"

    const-string v1, "FOREGROUND"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_FOREGROUND:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:type_debug_vpn_in_pattern"

    const-string v1, "DBG_VPN_IN"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_DEBUG_VPN_IN_PATTERN:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:type_debug_vpn_out_pattern"

    const-string v1, "DBG_VPN_OUT"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_DEBUG_VPN_OUT_PATTERN:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:tag_radix"

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TAG_RADIX:Lcom/google/android/gms/common/config/GservicesValue;

    const-string v0, "gms:stats:netstats:pattern:ts_to_millis"

    sget v1, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->TS_TO_MILLIS:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/config/GservicesValue;->value(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/android/gms/common/config/GservicesValue;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TS_TO_MILLIS:Lcom/google/android/gms/common/config/GservicesValue;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
