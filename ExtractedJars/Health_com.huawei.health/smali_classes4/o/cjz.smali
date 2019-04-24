.class public abstract Lo/cjz;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.onResume(Context context) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lo/cku;->b(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.onEvent(Context context, String eventId, String value) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lo/cku;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b()V
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.onReport() is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cku;->c()V

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.onReport(Context context) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lo/cku;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.onPause(Context context) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lo/cku;->e(Landroid/content/Context;)V

    return-void
.end method

.method public static d(ILjava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.onEvent(int type, String eventId, Map<String, String> mapValue) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lo/cku;->c(ILjava/lang/String;Ljava/util/LinkedHashMap;)V

    return-void
.end method

.method public static e()Z
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalytics.getInitFlag is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/ckt;->a()Z

    move-result v0

    return v0
.end method
