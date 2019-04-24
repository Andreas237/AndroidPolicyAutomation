.class Lo/esv$h;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/esv;>;"
        }
    .end annotation
.end field

.field private e:Lo/esv;


# direct methods
.method public constructor <init>(Lo/esv;)V
    .locals 1

    .line 208
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 209
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/esv$h;->c:Ljava/lang/ref/WeakReference;

    .line 210
    iget-object v0, p0, Lo/esv$h;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/esv;

    iput-object v0, p0, Lo/esv$h;->e:Lo/esv;

    .line 211
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 215
    if-nez p2, :cond_0

    .line 216
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepCardData onReceive intent=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void

    .line 219
    :cond_0
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 220
    const-string v0, "refresh_type"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 221
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepsCard onReceive HiRefreshType "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " intent"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    .line 223
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive StepsCardData datafresh broadcast, refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lo/esv$h;->e:Lo/esv;

    invoke-static {v0}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/esv$h;->e:Lo/esv;

    invoke-static {v0}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    .line 227
    :cond_1
    iget-object v0, p0, Lo/esv$h;->e:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->e()V

    .line 230
    :cond_2
    if-nez v4, :cond_3

    .line 231
    iget-object v0, p0, Lo/esv$h;->e:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->e()V

    .line 234
    :cond_3
    goto :goto_0

    :cond_4
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 235
    iget-object v0, p0, Lo/esv$h;->e:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->g()V

    goto :goto_0

    .line 236
    :cond_5
    const-string v0, "com.huawei.hihealth.action_sync_total_sport_data"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 237
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepsCard onReceive ACTION_SYNC_TOTAL_SPORT_DATA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/esv$h;->e:Lo/esv;

    invoke-static {v0}, Lo/esv;->e(Lo/esv;)V

    .line 240
    :cond_6
    :goto_0
    return-void
.end method
