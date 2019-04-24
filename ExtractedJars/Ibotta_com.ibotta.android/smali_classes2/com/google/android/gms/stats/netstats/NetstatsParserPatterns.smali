.class public Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;
    }
.end annotation


# static fields
.field public static final BUCKET_PATTERN:Ljava/lang/String;

.field public static final HISTORY_PATTERN:Ljava/lang/String; = ".*bucketDuration=(?<duration>[0-9]+).*"

.field public static final IDENTS_PATTERN:Ljava/lang/String; = " *ident=\\[(?<idents>.*)\\](?: uid=(?<uid>-?[0-9]+))?(?: set=(?<set>\\w+))?(?: tag=0x(?<tag>[0-9a-f]+))?.*"

.field public static final IDENT_PATTERN:Ljava/lang/String;

.field public static final NEW_BUCKET_PATTERN:Ljava/lang/String; = " *st=(?<start>[0-9]+)(?: rb=(?<rxBytes>[0-9]+))?(?: rp=(?<rxPackets>[0-9]+))?(?: tb=(?<txBytes>[0-9]+))?(?: tp=(?<txPackets>[0-9]+))?(?: op=(?<operations>[0-9]+))?.*"

.field public static final NEW_IDENT_PATTERN:Ljava/lang/String; = "[\\[{](?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^\\]}]*[\\]}]"

.field public static final NEW_TS_TO_MILLIS:I = 0x3e8

.field public static final OLD_BUCKET_PATTERN:Ljava/lang/String; = " *bucketStart=(?<start>[0-9]+)(?: activeTime=(?<active>[0-9]+))?(?: rxBytes=(?<rxBytes>[0-9]+))?(?: rxPackets=(?<rxPackets>[0-9]+))?(?: txBytes=(?<txBytes>[0-9]+))?(?: txPackets=(?<txPackets>[0-9]+))?(?: operations=(?<operations>[0-9]+))?.*"

.field public static final OLD_IDENT_PATTERN:Ljava/lang/String; = "\\[(?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^]]*\\]"

.field public static final OLD_TS_TO_MILLIS:I = 0x1

.field public static final TS_TO_MILLIS:I

.field public static final TYPE_BACKGROUND_PATTERN:Ljava/lang/String; = "DEFAULT"

.field public static final TYPE_BOTH_PATTERN:Ljava/lang/String; = "ALL"

.field public static final TYPE_DEBUG_VPN_IN_PATTERN:Ljava/lang/String; = "DBG_VPN_IN"

.field public static final TYPE_DEBUG_VPN_OUT_PATTERN:Ljava/lang/String; = "DBG_VPN_OUT"

.field public static final TYPE_FOREGROUND_PATTERN:Ljava/lang/String; = "FOREGROUND"

.field public static final UID_STATS_START_PATTERN:Ljava/lang/String; = "UID stats:|Detailed UID stats:"

.field public static final UID_TAG_STATS_START_PATTERN:Ljava/lang/String; = "UID tag stats:"

.field private static final zzafe:Ljava/util/regex/Pattern;


# instance fields
.field private zzaen:Ljava/util/regex/Pattern;

.field private zzaeo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private zzaep:Ljava/util/regex/Pattern;

.field private zzaeq:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private zzaer:Ljava/util/regex/Pattern;

.field private zzaes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private zzaet:Ljava/util/regex/Pattern;

.field private zzaeu:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private zzaev:Ljava/util/regex/Pattern;

.field private zzaew:Ljava/util/regex/Pattern;

.field private zzaex:Ljava/util/regex/Pattern;

.field private zzaey:Ljava/util/regex/Pattern;

.field private zzaez:Ljava/util/regex/Pattern;

.field private zzafa:Ljava/util/regex/Pattern;

.field private zzafb:Ljava/util/regex/Pattern;

.field private zzafc:I

.field private zzafd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastLollipopMR1()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "[\\[{](?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^\\]}]*[\\]}]"

    goto :goto_0

    :cond_0
    const-string v0, "\\[(?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^]]*\\]"

    :goto_0
    sput-object v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->IDENT_PATTERN:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastLollipopMR1()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, " *st=(?<start>[0-9]+)(?: rb=(?<rxBytes>[0-9]+))?(?: rp=(?<rxPackets>[0-9]+))?(?: tb=(?<txBytes>[0-9]+))?(?: tp=(?<txPackets>[0-9]+))?(?: op=(?<operations>[0-9]+))?.*"

    goto :goto_1

    :cond_1
    const-string v0, " *bucketStart=(?<start>[0-9]+)(?: activeTime=(?<active>[0-9]+))?(?: rxBytes=(?<rxBytes>[0-9]+))?(?: rxPackets=(?<rxPackets>[0-9]+))?(?: txBytes=(?<txBytes>[0-9]+))?(?: txPackets=(?<txPackets>[0-9]+))?(?: operations=(?<operations>[0-9]+))?.*"

    :goto_1
    sput-object v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->BUCKET_PATTERN:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastLollipopMR1()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x3e8

    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    :goto_2
    sput v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->TS_TO_MILLIS:I

    const-string v0, "\\?<([a-zA-Z0-9]+)>"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafe:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->IDENTS:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzp(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaen:Ljava/util/regex/Pattern;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaeo:Ljava/util/Map;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->IDENT:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzp(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaep:Ljava/util/regex/Pattern;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaeq:Ljava/util/Map;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->HISTORY:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzp(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaer:Ljava/util/regex/Pattern;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaes:Ljava/util/Map;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->BUCKET:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzp(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaet:Ljava/util/regex/Pattern;

    invoke-static {v0}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaeu:Ljava/util/Map;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->UID_STATS_START:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaev:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->UID_TAG_STATS_START:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaew:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_BOTH:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaex:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_BACKGROUND:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaey:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_FOREGROUND:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaez:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_DEBUG_VPN_IN_PATTERN:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafa:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TYPE_DEBUG_VPN_OUT_PATTERN:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafb:Ljava/util/regex/Pattern;

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TAG_RADIX:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafc:I

    sget-object v0, Lcom/google/android/gms/stats/internal/G$netStats$patterns;->TS_TO_MILLIS:Lcom/google/android/gms/common/config/GservicesValue;

    invoke-virtual {v0}, Lcom/google/android/gms/common/config/GservicesValue;->getBinderSafe()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafd:I

    return-void
.end method

.method private static zzo(Ljava/lang/String;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafe:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const/4 v1, 0x1

    const/4 v2, 0x1

    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v2, v1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static zzp(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafe:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bucket(Ljava/lang/String;)Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;
    .locals 2

    new-instance v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaet:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaeu:Ljava/util/Map;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;-><init>(Ljava/util/regex/Matcher;Ljava/util/Map;)V

    return-object v0
.end method

.method public history(Ljava/lang/String;)Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;
    .locals 2

    new-instance v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaer:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaes:Ljava/util/Map;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;-><init>(Ljava/util/regex/Matcher;Ljava/util/Map;)V

    return-object v0
.end method

.method public ident(Ljava/lang/String;)Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;
    .locals 2

    new-instance v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaep:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaeq:Ljava/util/Map;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;-><init>(Ljava/util/regex/Matcher;Ljava/util/Map;)V

    return-object v0
.end method

.method public idents(Ljava/lang/String;)Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;
    .locals 2

    new-instance v0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaen:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaeo:Ljava/util/Map;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns$NetstatsMatcher;-><init>(Ljava/util/regex/Matcher;Ljava/util/Map;)V

    return-object v0
.end method

.method public isTypeBackground(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaey:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isTypeBoth(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaex:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isTypeDebugVpn(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafa:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafb:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public isTypeForeground(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaez:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isUidStart(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaev:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isUidTagStart(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzaew:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public tagRadix()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafc:I

    return v0
.end method

.method public toMillis(J)J
    .locals 2

    iget v0, p0, Lcom/google/android/gms/stats/netstats/NetstatsParserPatterns;->zzafd:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    return-wide p1
.end method
