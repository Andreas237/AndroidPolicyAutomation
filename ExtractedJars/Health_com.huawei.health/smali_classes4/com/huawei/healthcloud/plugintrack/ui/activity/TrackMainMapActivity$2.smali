.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 309
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/cbu;->c:Z

    .line 311
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbu;->a(Z)Lo/cew;

    move-result-object v4

    .line 313
    if-nez v4, :cond_0

    .line 314
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motionData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    invoke-static {}, Lo/cdy;->a()V

    goto :goto_0

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)I

    move-result v0

    const/16 v1, 0x108

    if-eq v0, v1, :cond_1

    .line 318
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->P()Lo/dhg;

    move-result-object v0

    invoke-virtual {v0}, Lo/dhg;->e()V

    .line 320
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cir;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cir;->b(Lo/cew;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lo/cbr;->c(Landroid/content/Context;)V

    .line 325
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cbu;->c:Z

    .line 326
    return-void
.end method
