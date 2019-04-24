.class Lo/cwk$e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/cwk;


# direct methods
.method private constructor <init>(Lo/cwk;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lo/cwk$e;->b:Lo/cwk;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cwk;Lo/cwk$2;)V
    .locals 0

    .line 242
    invoke-direct {p0, p1}, Lo/cwk$e;-><init>(Lo/cwk;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 245
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get sensor data fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-static {}, Lo/cwj;->b()V

    .line 247
    invoke-static {}, Lo/dhs;->b()Lo/dhs;

    move-result-object v0

    const-string v1, "getSensorTimeOut"

    const-string v2, "No sensor data is obtained in 800 milliseconds"

    invoke-virtual {v0, v1, v2}, Lo/dhs;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lo/cwk$e;->b:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->e(Lo/cwk;)V

    .line 250
    return-void
.end method
