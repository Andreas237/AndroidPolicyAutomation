.class Lo/fgb$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fgb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fgb$2;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lo/fgb$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 6

    .line 60
    const-string v0, "TimeEat_HealthOpenSDKUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthOpenSDKCallback : onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-static {}, Lo/fgb;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/fgb;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 62
    invoke-static {}, Lo/fgb;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cmo;

    .line 63
    invoke-interface {v5, p1}, Lo/cmo;->a(Ljava/lang/Object;)V

    .line 64
    goto :goto_0

    .line 66
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 51
    const-string v0, "TimeEat_HealthOpenSDKUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthOpenSDKCallback initSDK success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 56
    const-string v0, "TimeEat_HealthOpenSDKUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthOpenSDKCallback : initSDK Failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    return-void
.end method
