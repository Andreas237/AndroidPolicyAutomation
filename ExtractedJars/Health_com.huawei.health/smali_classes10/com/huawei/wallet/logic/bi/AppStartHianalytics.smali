.class public Lcom/huawei/wallet/logic/bi/AppStartHianalytics;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Z

.field private static e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 2

    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->e:J

    .line 87
    const-string v0, "onPause,   begin timing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 88
    return-void
.end method

.method static synthetic a(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-static {p0}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->c(Landroid/content/Context;)V

    return-void
.end method

.method private static c()Ljava/lang/String;
    .locals 1

    .line 209
    const-string v0, ""

    return-object v0
.end method

.method private static c(Landroid/content/Context;)V
    .locals 10

    .line 153
    if-nez p0, :cond_0

    .line 155
    const-string v0, "onReport,context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 156
    return-void

    .line 159
    :cond_0
    invoke-static {p0}, Lcom/huawei/wallet/logic/bi/HiAnalyticsManager;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    return-void

    .line 165
    :cond_1
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-static {v0}, Lcom/huawei/wallet/utils/TimeUtil;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 167
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 169
    sget-object v4, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 171
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 173
    invoke-static {p0}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 176
    invoke-static {p0}, Lcom/huawei/wallet/utils/PackageUtil;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 178
    invoke-static {}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->c()Ljava/lang/String;

    move-result-object v8

    .line 180
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    const-string v0, "|"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    const-string v0, "|"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    const-string v0, "|"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    const-string v0, "|"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    const-string v0, "|"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    const-string v0, "|"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    const-string v0, "wallet app start report bi success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 196
    const-string v0, "WALLET_BASIC"

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/wallet/logic/bi/HiAnalyticsManager;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-static {p0}, Lcom/huawei/wallet/logic/bi/HiAnalyticsManager;->b(Landroid/content/Context;)V

    .line 198
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 6

    .line 97
    sget-boolean v0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->c:Z

    if-eqz v0, :cond_0

    .line 99
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->c:Z

    .line 102
    const-string v0, "onResume,  first onReport"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 103
    invoke-static {p0}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->e(Landroid/content/Context;)V

    goto :goto_0

    .line 107
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 108
    sget-wide v0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->e:J

    sub-long v4, v2, v0

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResume,   end timing. continueMillis is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 110
    const-wide/32 v0, 0x2bf20

    cmp-long v0, v4, v0

    if-ltz v0, :cond_1

    .line 113
    invoke-static {p0}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->e(Landroid/content/Context;)V

    .line 120
    :cond_1
    :goto_0
    return-void
.end method

.method private static e(Landroid/content/Context;)V
    .locals 4

    .line 130
    move-object v2, p0

    .line 131
    new-instance v3, Ljava/lang/Thread;

    new-instance v0, Lcom/huawei/wallet/logic/bi/AppStartHianalytics$1;

    invoke-direct {v0, v2}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics$1;-><init>(Landroid/content/Context;)V

    const-string v1, "AppStartReportThread"

    invoke-direct {v3, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 139
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 140
    return-void
.end method
