.class public Lo/cgg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgg$d;,
        Lo/cgg$b;
    }
.end annotation


# instance fields
.field private a:Lo/cgg$b;

.field private b:Lo/cgg$d;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lo/cgg;->d:Landroid/content/Context;

    .line 18
    new-instance v0, Lo/cgg$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cgg$b;-><init>(Lo/cgg;Lo/cgg$2;)V

    iput-object v0, p0, Lo/cgg;->a:Lo/cgg$b;

    .line 19
    return-void
.end method

.method private d()V
    .locals 3

    .line 61
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 62
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 63
    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 64
    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lo/cgg;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cgg;->a:Lo/cgg$b;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 66
    return-void
.end method

.method static synthetic e(Lo/cgg;)Lo/cgg$d;
    .locals 1

    .line 11
    iget-object v0, p0, Lo/cgg;->b:Lo/cgg$d;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 54
    iget-object v0, p0, Lo/cgg;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cgg;->a:Lo/cgg$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 55
    return-void
.end method

.method public c(Lo/cgg$d;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lo/cgg;->b:Lo/cgg$d;

    .line 47
    invoke-direct {p0}, Lo/cgg;->d()V

    .line 48
    return-void
.end method
