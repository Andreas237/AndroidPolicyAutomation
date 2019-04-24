.class Lo/car$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/car;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lo/car;


# direct methods
.method private constructor <init>(Lo/car;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lo/car$c;->e:Lo/car;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/car;Lo/car$2;)V
    .locals 0

    .line 221
    invoke-direct {p0, p1}, Lo/car$c;-><init>(Lo/car;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 225
    if-eqz p2, :cond_1

    .line 226
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 227
    if-nez v1, :cond_0

    .line 228
    return-void

    .line 230
    :cond_0
    const-string v0, "steps_notify_delete"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lo/car$c;->e:Lo/car;

    invoke-virtual {v0}, Lo/car;->i()Lo/caq;

    move-result-object v0

    invoke-interface {v0}, Lo/caq;->b()V

    .line 234
    :cond_1
    return-void
.end method
