.class Lo/ame$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ame;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ame;)V
    .locals 1

    .line 139
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 141
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ame$c;->d:Ljava/lang/ref/WeakReference;

    .line 142
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 147
    if-eqz p2, :cond_2

    .line 149
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 151
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget-object v0, p0, Lo/ame$c;->d:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 154
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepPowerKitProxy not ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-void

    .line 158
    :cond_0
    iget-object v0, p0, Lo/ame$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ame;

    .line 160
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/ame;->d(Z)V

    .line 165
    :cond_1
    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/ame;->d(Z)V

    .line 167
    const/4 v0, -0x1

    invoke-static {v5, v0}, Lo/ame;->e(Lo/ame;I)I

    .line 171
    :cond_2
    return-void
.end method
