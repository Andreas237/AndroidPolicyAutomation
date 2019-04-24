.class Lo/fle$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fle;


# direct methods
.method constructor <init>(Lo/fle;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/fle$4;->b:Lo/fle;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 57
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 58
    const-string v0, "com.huawei.intent.action.CLICK_STATUSBAR"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/fle$4;->b:Lo/fle;

    new-instance v1, Lo/fle$4$4;

    invoke-direct {v1, p0}, Lo/fle$4$4;-><init>(Lo/fle$4;)V

    invoke-virtual {v0, v1}, Lo/fle;->post(Ljava/lang/Runnable;)Z

    .line 72
    :cond_0
    return-void
.end method
