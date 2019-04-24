.class public Lo/adb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/adb$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([B)Lo/afz;
    .locals 7

    .line 25
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseDataParser parseData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    if-nez p1, :cond_0

    .line 28
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GlucoseDataParser data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 32
    :cond_0
    new-instance v4, Lo/adb$b;

    invoke-direct {v4}, Lo/adb$b;-><init>()V

    .line 33
    invoke-virtual {v4, p1}, Lo/adb$b;->e([B)[Ljava/lang/Object;

    move-result-object v5

    .line 35
    if-eqz v5, :cond_1

    .line 37
    new-instance v6, Lo/afy;

    invoke-direct {v6}, Lo/afy;-><init>()V

    .line 38
    const/4 v0, 0x0

    aget-object v0, v5, v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v6, v0}, Lo/afy;->b(F)V

    .line 39
    const/4 v0, 0x1

    aget-object v0, v5, v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/afy;->e(J)V

    .line 40
    const/4 v0, 0x1

    aget-object v0, v5, v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/afy;->d(J)V

    .line 41
    const/4 v0, 0x2

    aget-object v0, v5, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/afy;->c(I)V

    .line 42
    return-object v6

    .line 45
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
