.class public Lo/cxf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/cxf;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Lo/cxf;
    .locals 2

    .line 26
    sget-object v0, Lo/cxf;->d:Lo/cxf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 27
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lo/cxf;

    invoke-direct {v0}, Lo/cxf;-><init>()V

    sput-object v0, Lo/cxf;->d:Lo/cxf;

    .line 30
    :cond_0
    sget-object v0, Lo/cxf;->d:Lo/cxf;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;I)I"
        }
    .end annotation

    .line 72
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 73
    const-string v0, "release"

    const-string v1, "release"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    .line 74
    const-string v0, "BIAnalyticsUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setEvent() level ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " BuildConfig.BUILD_TYPE = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "release"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const/4 v0, -0x1

    return v0

    .line 77
    :cond_0
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setEvent()"

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {p1, p2, p3}, Lo/cxe;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    move-result v0

    return v0

    .line 81
    :cond_1
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setEvent() AnalyticsStatus is false"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v0, -0x1

    return v0

    .line 85
    :cond_2
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setEvent() BuildConfig.SUPPORT_ANALYTICS = true"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const/4 v0, -0x1

    return v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    .line 105
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    invoke-static {p1}, Lo/cxe;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 109
    :cond_0
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "onResume() AnalyticsStatus is false"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 39
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setUserInfo()"

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-static {p1}, Lo/cxe;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 43
    :cond_0
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setUserInfo() AnalyticsStatus is false"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :goto_0
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 2

    .line 95
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-static {p1}, Lo/cxe;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 99
    :cond_0
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "onReport() AnalyticsStatus is false"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 2

    .line 115
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    invoke-static {p1}, Lo/cxe;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 119
    :cond_0
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "onPause() AnalyticsStatus is false"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lo/cxd;)V
    .locals 2

    .line 54
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setDeviceInfo()"

    invoke-static {v0, v1}, Lo/cxg;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-static {p1}, Lo/cxe;->c(Lo/cxd;)V

    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "BIAnalyticsUtil"

    const-string v1, "setDeviceInfo() AnalyticsStatus is false"

    invoke-static {v0, v1}, Lo/cxg;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :goto_0
    return-void
.end method
