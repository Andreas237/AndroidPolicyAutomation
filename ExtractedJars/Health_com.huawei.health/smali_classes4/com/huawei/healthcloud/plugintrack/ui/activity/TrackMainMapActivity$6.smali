.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cbp;

.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Lo/cbp;)V
    .locals 0

    .line 1200
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;->a:Lo/cbp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1203
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;->a:Lo/cbp;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cbp;->b(Z)V

    .line 1204
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbu;->d(Z)V

    .line 1205
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$6;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 1206
    return-void
.end method
