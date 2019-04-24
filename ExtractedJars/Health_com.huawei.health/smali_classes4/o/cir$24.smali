.class Lo/cir$24;
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
.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lo/cir$24;->d:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 298
    iget-object v0, p0, Lo/cir$24;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->a(Lo/cir;)Lo/cig;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cir$24;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cir;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lo/cir$24;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Z)V

    .line 300
    iget-object v0, p0, Lo/cir$24;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n()V

    .line 302
    :cond_0
    return-void
.end method
