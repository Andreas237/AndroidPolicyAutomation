.class public Lo/amh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amh$e;,
        Lo/amh$c;
    }
.end annotation


# instance fields
.field private a:Lo/amh$e;

.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/alb;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Lo/amh$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amh;->d:Landroid/content/Context;

    .line 21
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/amh;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    new-instance v0, Lo/amh$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/amh$e;-><init>(Lo/amh;Lo/amh$5;)V

    iput-object v0, p0, Lo/amh;->a:Lo/amh$e;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/amh;->c:Ljava/util/ArrayList;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amh;->e:Lo/amh$c;

    .line 34
    iput-object p1, p0, Lo/amh;->d:Landroid/content/Context;

    .line 35
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 36
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 37
    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lo/amh;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/amh;->a:Lo/amh$e;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 39
    return-void
.end method

.method static synthetic b(Lo/amh;)Lo/amh$c;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/amh;->e:Lo/amh$c;

    return-object v0
.end method

.method static synthetic e(Lo/amh;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/amh;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method


# virtual methods
.method public d(Lo/ald;Z)I
    .locals 7

    .line 47
    if-nez p1, :cond_0

    .line 48
    const/4 v0, -0x3

    return v0

    .line 51
    :cond_0
    invoke-virtual {p1}, Lo/ald;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 52
    const/4 v0, -0x1

    return v0

    .line 54
    :cond_1
    iget-object v0, p0, Lo/amh;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 56
    :goto_0
    if-nez p2, :cond_5

    .line 58
    if-eqz v4, :cond_5

    .line 60
    iget-object v0, p0, Lo/amh;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/amx;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 62
    :goto_1
    if-eq v4, v5, :cond_4

    .line 63
    const-string v0, "Step_StandReportReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "screen status unknown,think screen on"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 65
    :cond_4
    const/4 v0, -0x2

    return v0

    .line 71
    :cond_5
    :goto_2
    iget-object v0, p0, Lo/amh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/alb;

    .line 72
    invoke-interface {v6, p1}, Lo/alb;->b(Lo/ald;)V

    .line 73
    goto :goto_3

    .line 75
    :cond_6
    const-string v0, "Step_StandReportReceiver"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "REPORT : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->d:I

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 75
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method public d(Lo/amh$c;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/amh;->e:Lo/amh$c;

    .line 89
    return-void
.end method

.method public e(Lo/alb;)V
    .locals 1

    .line 82
    iget-object v0, p0, Lo/amh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/amh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_0
    return-void
.end method
