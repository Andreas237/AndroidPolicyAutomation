.class Lo/cal$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/cal;


# direct methods
.method private constructor <init>(Lo/cal;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lo/cal$b;->d:Lo/cal;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cal;Lo/cal$5;)V
    .locals 0

    .line 84
    invoke-direct {p0, p1}, Lo/cal$b;-><init>(Lo/cal;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 88
    if-eqz p2, :cond_1

    .line 89
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 90
    if-nez v1, :cond_0

    .line 91
    return-void

    .line 94
    :cond_0
    const-string v0, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lo/cal$b;->d:Lo/cal;

    invoke-virtual {v0}, Lo/cal;->f()Lo/can;

    move-result-object v0

    invoke-interface {v0}, Lo/can;->c()V

    .line 98
    :cond_1
    return-void
.end method
