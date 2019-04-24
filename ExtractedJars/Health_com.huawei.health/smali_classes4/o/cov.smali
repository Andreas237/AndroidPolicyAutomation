.class public Lo/cov;
.super Lo/con;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cov$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/con;-><init>()V

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Lo/cov$2;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/cov;-><init>()V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 41
    const-string v0, "sample_point_health_stress"

    invoke-static {v0}, Lo/cov;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/cov;
    .locals 1

    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cov;->b:Landroid/content/Context;

    .line 29
    sget-object v0, Lo/cov$c;->d:Lo/cov;

    return-object v0
.end method

.method public static d(I)Landroid/content/ContentValues;
    .locals 4

    .line 60
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 61
    const-string v0, "merged"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 62
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 63
    return-object v3
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 48
    const-string v0, "HealthStressPointIndex"

    const-string v1, "sample_point_health_stress"

    invoke-static {v0, v1}, Lo/cov;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 56
    const-string v0, "sample_point_health_stress"

    return-object v0
.end method
