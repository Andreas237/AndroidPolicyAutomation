.class public Lo/cjy$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cjy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo/civ;

    invoke-direct {v0}, Lo/civ;-><init>()V

    invoke-static {v0}, Lo/cjy;->e(Lo/civ;)Lo/civ;

    iput-object p1, p0, Lo/cjy$b;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/cjy$b;
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "setUDID(String udid) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/civ;->d(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Z)V
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "Builder.refresh(boolean enableCleanData) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    invoke-static {v0, p1}, Lo/ckt;->d(Lo/civ;Z)V

    return-void
.end method

.method public b(Z)Lo/cjy$b;
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "Builder.setEnableUDID(boolean isReportUDID) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/civ;->b(Z)V

    return-object p0
.end method

.method public c(ILjava/lang/String;)Lo/cjy$b;
    .locals 2

    invoke-static {}, Lo/cjy;->d()Ljava/util/HashMap;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Lo/cjy;->d(Ljava/util/HashMap;)Ljava/util/HashMap;

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "Builder.setCollectURL(int type,String collectURL) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    :cond_1
    if-nez p1, :cond_2

    invoke-static {}, Lo/cjy;->d()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "oper"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    invoke-static {}, Lo/cjy;->d()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "maint"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    invoke-static {}, Lo/cjy;->d()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/civ;->d(Ljava/util/HashMap;)V

    return-object p0
.end method

.method public c(Z)Lo/cjy$b;
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "Builder.setEnableImei(boolean isReportAndroidImei) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/civ;->e(Z)V

    return-object p0
.end method

.method public c()V
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "Builder.create() is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    iget-object v1, p0, Lo/cjy$b;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/ckt;->e(Lo/civ;Landroid/content/Context;)V

    return-void
.end method

.method public e(Z)Lo/cjy$b;
    .locals 2

    const-string v0, "HiAnalytics"

    const-string v1, "Builder.setEnableSerialNoNumber(boolean isReportSN) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjy;->a()Lo/civ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/civ;->a(Z)V

    return-object p0
.end method
