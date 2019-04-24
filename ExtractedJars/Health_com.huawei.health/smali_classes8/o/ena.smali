.class public Lo/ena;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput v0, Lo/ena;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .line 30
    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    .line 31
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 32
    const/4 v0, 0x0

    return v0

    .line 34
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 6

    .line 56
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 57
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v5

    .line 58
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const-string v0, "Track_MapChangeUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkChinaOrAbroadByMCC: 0!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "460"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    const-string v0, "Track_MapChangeUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkChinaOrAbroadByMCC: 1!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/4 v0, 0x1

    return v0

    .line 65
    :cond_1
    const-string v0, "Track_MapChangeUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkChinaOrAbroadByMCC: 2!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x2

    return v0
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 4

    .line 39
    .line 40
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "map_type_setting_key"

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 39
    invoke-static {p0, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 43
    sput p1, Lo/ena;->d:I

    .line 45
    return-void
.end method

.method public static d()Z
    .locals 2

    .line 95
    sget v0, Lo/ena;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 96
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 5

    .line 72
    new-instance v2, Lo/dcy;

    invoke-direct {v2}, Lo/dcy;-><init>()V

    .line 73
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 75
    const-string v0, "map_type_setting_key"

    invoke-static {p0, v3, v0}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 76
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 79
    const-string v0, "map_type_setting_key"

    const-string v1, "1"

    invoke-static {p0, v3, v0, v1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 80
    const/4 v0, 0x1

    sput v0, Lo/ena;->d:I

    goto :goto_0

    .line 82
    :cond_1
    const-string v0, "map_type_setting_key"

    const-string v1, "2"

    invoke-static {p0, v3, v0, v1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 83
    const/4 v0, 0x2

    sput v0, Lo/ena;->d:I

    goto :goto_0

    .line 86
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/ena;->d:I

    .line 90
    :goto_0
    return-void
.end method
