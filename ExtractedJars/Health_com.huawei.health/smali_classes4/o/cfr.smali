.class public Lo/cfr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cfr$a;,
        Lo/cfr$e;
    }
.end annotation


# instance fields
.field private a:Lo/cfr$a;

.field private b:Landroid/os/Handler;

.field private c:Landroid/os/HandlerThread;

.field private d:Lo/cfr$e;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfr;->a:Lo/cfr$a;

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/cfr;->e:I

    return-void
.end method

.method static synthetic b(Lo/cfr;)Lo/cfr$e;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/cfr;->d:Lo/cfr$e;

    return-object v0
.end method

.method static synthetic c(Lo/cfr;)I
    .locals 1

    .line 24
    iget v0, p0, Lo/cfr;->e:I

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;)V"
        }
    .end annotation

    .line 69
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSearch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/cfr;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 72
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSearch() mHandler null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, Lo/cfr;->a:Lo/cfr$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 77
    iget-object v0, p0, Lo/cfr;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/cfr;->a:Lo/cfr$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 79
    :cond_1
    iget v0, p0, Lo/cfr;->e:I

    add-int/lit8 v4, v0, 0x1

    iput v4, p0, Lo/cfr;->e:I

    .line 80
    new-instance v0, Lo/cfr$a;

    invoke-direct {v0, p1, p0, p2, v4}, Lo/cfr$a;-><init>(Ljava/lang/String;Lo/cfr;Ljava/util/HashMap;I)V

    iput-object v0, p0, Lo/cfr;->a:Lo/cfr$a;

    .line 81
    iget-object v0, p0, Lo/cfr;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/cfr;->a:Lo/cfr$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    return-void
.end method

.method public b()V
    .locals 4

    .line 162
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "qiut()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/cfr;->c:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/cfr;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfr;->c:Landroid/os/HandlerThread;

    .line 168
    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    .line 56
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "SearchHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cfr;->c:Landroid/os/HandlerThread;

    .line 57
    iget-object v0, p0, Lo/cfr;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 58
    iget-object v0, p0, Lo/cfr;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    .line 59
    if-eqz v2, :cond_0

    .line 61
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cfr;->b:Landroid/os/Handler;

    .line 63
    :cond_0
    return-void
.end method

.method public d(Lo/cfr$e;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/cfr;->d:Lo/cfr$e;

    .line 51
    return-void
.end method
