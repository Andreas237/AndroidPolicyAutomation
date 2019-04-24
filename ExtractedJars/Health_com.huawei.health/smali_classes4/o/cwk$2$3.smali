.class Lo/cwk$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dik;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwk$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwk$2;


# direct methods
.method constructor <init>(Lo/cwk$2;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/cwk$2$3;->a:Lo/cwk$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 4

    .line 195
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have get sensor data success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget-object v0, p0, Lo/cwk$2$3;->a:Lo/cwk$2;

    iget-object v0, v0, Lo/cwk$2;->a:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->a(Lo/cwk;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 197
    invoke-static {}, Lo/dhs;->b()Lo/dhs;

    move-result-object v0

    const-string v1, "getSensorResult"

    const-string v2, "have obtained 50 data"

    invoke-virtual {v0, v1, v2}, Lo/dhs;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lo/cwk$2$3;->a:Lo/cwk$2;

    iget-object v0, v0, Lo/cwk$2;->a:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->e(Lo/cwk;)V

    .line 200
    return-void
.end method
