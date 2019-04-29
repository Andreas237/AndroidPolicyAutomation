.class final enum Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
.super Ljava/lang/Enum;
.source "CommonUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/CommonUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "Architecture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field private static final matcher:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 154
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "X86_32"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 155
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "X86_64"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 156
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARM_UNKNOWN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 157
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "PPC"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 158
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "PPC64"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 159
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARMV6"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 160
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARMV7"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 161
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "UNKNOWN"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 162
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARMV7S"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 163
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "ARM64"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const/16 v0, 0xa

    .line 153
    new-array v0, v0, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v2

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v3

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v4

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v5

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v6

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v7

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v8

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v9

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v10

    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v1, v0, v11

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->$VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 165
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v6}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    .line 168
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "armeabi-v7a"

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "armeabi"

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "x86"

    sget-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 153
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static getValue()Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 3

    .line 178
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 180
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 181
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object v0

    .line 186
    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 187
    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    if-nez v0, :cond_1

    .line 189
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 1

    .line 153
    const-class v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object p0
.end method

.method public static values()[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 1

    .line 153
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->$VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-virtual {v0}, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object v0
.end method
