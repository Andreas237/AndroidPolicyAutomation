.class Lo/ale$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ale;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/ale;


# direct methods
.method private constructor <init>(Lo/ale;)V
    .locals 0

    .line 2668
    iput-object p1, p0, Lo/ale$c;->c:Lo/ale;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/ale;Lo/ale$1;)V
    .locals 0

    .line 2668
    invoke-direct {p0, p1}, Lo/ale$c;-><init>(Lo/ale;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 2675
    if-eqz p2, :cond_1

    const-string v0, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2676
    const-string v0, "reason"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2677
    const-string v0, "homekey"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "recentapps"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2678
    :cond_0
    iget-object v0, p0, Lo/ale$c;->c:Lo/ale;

    invoke-static {v0}, Lo/ale;->j(Lo/ale;)Landroid/view/Window;

    move-result-object v5

    .line 2679
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 2680
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWindowAnimations(0)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2681
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 2685
    :cond_1
    return-void
.end method
