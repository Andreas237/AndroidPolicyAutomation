.class public Lcom/tencent/open/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()I
    .locals 3

    .line 105
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v0

    const-string v1, "Common_HttpRetryCount"

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 106
    if-nez v2, :cond_0

    .line 107
    const/4 v2, 0x2

    .line 109
    :cond_0
    return v2
.end method

.method public static a(Ljava/lang/String;)I
    .locals 3

    .line 96
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v0

    const-string v1, "Common_BusinessReportFrequency"

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 98
    if-nez v2, :cond_0

    .line 99
    const/16 v2, 0x64

    .line 101
    :cond_0
    return v2
.end method
