.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V
    .locals 0

    .line 690
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$3;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 693
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 694
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cgy;->d(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 696
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lo/chb;->c(Z)V

    .line 698
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$3;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbu;->d(Z)V

    .line 700
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$3;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 701
    return-void
.end method
