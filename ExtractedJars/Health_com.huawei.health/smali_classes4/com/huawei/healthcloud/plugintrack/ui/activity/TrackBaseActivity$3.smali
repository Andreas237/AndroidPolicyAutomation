.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$3;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->d([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$3;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 196
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 190
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    return-void
.end method
