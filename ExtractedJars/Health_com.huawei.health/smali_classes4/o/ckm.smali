.class public Lo/ckm;
.super Ljava/lang/Object;

# interfaces
.implements Lo/ckx;


# instance fields
.field private a:Landroid/content/Context;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "oper"

    iput-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ckm;->a:Landroid/content/Context;

    iput-object p3, p0, Lo/ckm;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/ckm;->c:Ljava/lang/String;

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "maint"

    iput-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    goto :goto_1

    :sswitch_1
    const-string v0, "preins"

    iput-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    goto :goto_1

    :goto_0
    const-string v0, "oper"

    iput-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    :goto_1
    iput-wide p5, p0, Lo/ckm;->b:J

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "oper"

    iput-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ckm;->a:Landroid/content/Context;

    iput-object p2, p0, Lo/ckm;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/ckm;->c:Ljava/lang/String;

    const-string v0, "oper"

    iput-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    iput-wide p4, p0, Lo/ckm;->b:J

    return-void
.end method

.method private b()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v0, p0, Lo/ckm;->a:Landroid/content/Context;

    const-string v1, "stat_v2"

    const/high16 v2, 0x500000

    invoke-static {v0, v1, v2}, Lo/cjs;->b(Landroid/content/Context;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HiAnalytics"

    const-string v1, "stat sp file reach max limited size, discard new event"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v0

    invoke-interface {v0}, Lo/cky;->c()V

    return-void

    :cond_0
    iget-object v0, p0, Lo/ckm;->a:Landroid/content/Context;

    const-string v1, "stat_v2"

    invoke-static {v0, v1}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    const-string v0, "EventRecordTask"

    const-string v1, "event sp is null"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v4, Lo/ckd;

    invoke-direct {v4}, Lo/ckd;-><init>()V

    iget-object v0, p0, Lo/ckm;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/ckd;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lo/ckm;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/ckm;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/cka;->e(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ckd;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lo/ckm;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/ckd;->e(Ljava/lang/String;)V

    iget-wide v0, p0, Lo/ckm;->b:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ckd;->d(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lo/ckd;->c(Landroid/content/SharedPreferences;)V

    iget-object v0, p0, Lo/ckm;->a:Landroid/content/Context;

    const-string v1, "stat_v2"

    const/16 v2, 0x2800

    invoke-static {v0, v1, v2}, Lo/cjs;->b(Landroid/content/Context;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "HiAnalytics"

    const-string v1, "state file size limit for report ! "

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v0

    invoke-interface {v0}, Lo/cky;->c()V

    :cond_2
    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    invoke-direct {p0}, Lo/ckm;->b()V

    return-void
.end method
