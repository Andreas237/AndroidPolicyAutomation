.class Lo/cgg$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lo/cgg;

.field private d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lo/cgg;)V
    .locals 1

    .line 24
    iput-object p1, p0, Lo/cgg$b;->b:Lo/cgg;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgg$b;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lo/cgg;Lo/cgg$2;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/cgg$b;-><init>(Lo/cgg;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 29
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cgg$b;->d:Ljava/lang/String;

    .line 30
    const-string v0, "android.intent.action.SCREEN_ON"

    iget-object v1, p0, Lo/cgg$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lo/cgg$b;->b:Lo/cgg;

    invoke-static {v0}, Lo/cgg;->e(Lo/cgg;)Lo/cgg$d;

    move-result-object v0

    invoke-interface {v0}, Lo/cgg$d;->e()V

    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "android.intent.action.SCREEN_OFF"

    iget-object v1, p0, Lo/cgg$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    iget-object v0, p0, Lo/cgg$b;->b:Lo/cgg;

    invoke-static {v0}, Lo/cgg;->e(Lo/cgg;)Lo/cgg$d;

    move-result-object v0

    invoke-interface {v0}, Lo/cgg$d;->d()V

    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "android.intent.action.USER_PRESENT"

    iget-object v1, p0, Lo/cgg$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    iget-object v0, p0, Lo/cgg$b;->b:Lo/cgg;

    invoke-static {v0}, Lo/cgg;->e(Lo/cgg;)Lo/cgg$d;

    move-result-object v0

    invoke-interface {v0}, Lo/cgg$d;->b()V

    .line 37
    :cond_2
    :goto_0
    return-void
.end method
