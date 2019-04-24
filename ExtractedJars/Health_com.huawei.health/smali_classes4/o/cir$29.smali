.class Lo/cir$29;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lo/cir$29;->c:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 280
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGPSSettingDialog():\u70b9\u51fb\u8bbe\u7f6e\u6309\u94ae"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/cir$29;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dhm;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lo/cir$29;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v4, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->e(Landroid/content/Intent;I)V

    .line 286
    goto :goto_0

    .line 287
    :cond_0
    iget-object v0, p0, Lo/cir$29;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Z)V

    .line 288
    iget-object v0, p0, Lo/cir$29;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->a(Lo/cir;)Lo/cig;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cir$29;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cir;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 289
    iget-object v0, p0, Lo/cir$29;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->a(Lo/cir;)Lo/cig;

    move-result-object v0

    invoke-virtual {v0}, Lo/cig;->e()V

    .line 292
    :cond_1
    :goto_0
    return-void
.end method
