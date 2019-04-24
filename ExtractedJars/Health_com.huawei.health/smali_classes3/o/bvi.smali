.class public Lo/bvi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bws$b;
.implements Lo/bwy$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bvi$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private e:Z

.field private f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field

.field private h:I

.field private i:Landroid/os/Handler;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)V
    .locals 3

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/bvi;->d:I

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvi;->a:Z

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvi;->c:Z

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvi;->e:Z

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvi;->b:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvi;->k:Ljava/lang/String;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/bvi;->h:I

    .line 45
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/bvi;->i:Landroid/os/Handler;

    .line 49
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bvi;->g:Ljava/lang/ref/WeakReference;

    .line 50
    iput-object p2, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    .line 51
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->b(Lo/bws$b;)V

    .line 52
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->b(Lo/bwy$b;)V

    .line 53
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    new-instance v1, Lo/bvi$a;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/bvi$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e(Lo/bwu$b;)V

    .line 54
    return-void
.end method

.method private declared-synchronized b(Ljava/util/List;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Ljava/lang/String;)V"
        }
    .end annotation

    monitor-enter p0

    .line 149
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataRun query= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, ",mCurrText="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bvi;->b:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lo/bvi;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 152
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 153
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataRun null == activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    monitor-exit p0

    return-void

    .line 157
    :cond_0
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    :cond_1
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataRun activity.isFinishing() || activity.isDestroyed()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    monitor-exit p0

    return-void

    .line 162
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    .line 163
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvi;->e:Z

    .line 166
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvi;->c:Z

    .line 168
    iget-boolean v0, p0, Lo/bvi;->a:Z

    if-eqz v0, :cond_5

    .line 169
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNullText = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    monitor-exit p0

    return-void

    .line 173
    :cond_5
    iget-object v0, p0, Lo/bvi;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 174
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->a(Ljava/util/List;)V

    .line 177
    :cond_6
    iget-object v0, p0, Lo/bvi;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 178
    iget-object v5, p0, Lo/bvi;->k:Ljava/lang/String;

    .line 179
    iget v6, p0, Lo/bvi;->h:I

    .line 180
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvi;->k:Ljava/lang/String;

    .line 181
    const/4 v0, 0x0

    iput v0, p0, Lo/bvi;->h:I

    .line 182
    iget-object v0, p0, Lo/bvi;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 183
    invoke-direct {p0, v5, v6}, Lo/bvi;->c(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    :cond_7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic b(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/bvi;->b(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private declared-synchronized c(Ljava/lang/String;I)V
    .locals 5

    monitor-enter p0

    .line 83
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvi;->a:Z

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvi;->b:Ljava/lang/String;

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvi;->k:Ljava/lang/String;

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lo/bvi;->h:I

    .line 88
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postSearch TextUtils.isEmpty(query)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    monitor-exit p0

    return-void

    .line 91
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvi;->a:Z

    .line 93
    iget-boolean v0, p0, Lo/bvi;->c:Z

    if-eqz v0, :cond_1

    .line 94
    iput-object p1, p0, Lo/bvi;->k:Ljava/lang/String;

    .line 95
    iput p2, p0, Lo/bvi;->h:I

    .line 96
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(isLoad = true)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    monitor-exit p0

    return-void

    .line 100
    :cond_1
    iget-object v0, p0, Lo/bvi;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 101
    iget-boolean v0, p0, Lo/bvi;->e:Z

    if-eqz v0, :cond_2

    .line 102
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLoadNoData = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e()V

    .line 104
    monitor-exit p0

    return-void

    .line 107
    :cond_2
    if-eqz p2, :cond_3

    .line 108
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type != QUERY_TEXT_LOAD_MORE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    monitor-exit p0

    return-void

    .line 112
    :cond_3
    iget v0, p0, Lo/bvi;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bvi;->d:I

    .line 113
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->g()V

    goto :goto_0

    .line 115
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvi;->e:Z

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/bvi;->d:I

    .line 117
    iput-object p1, p0, Lo/bvi;->b:Ljava/lang/String;

    .line 118
    iget-object v0, p0, Lo/bvi;->f:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->c()V

    .line 121
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvi;->c:Z

    .line 122
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postSearch query = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget v0, p0, Lo/bvi;->d:I

    mul-int/lit8 v4, v0, 0xa

    .line 124
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lo/bvi$5;

    invoke-direct {v1, p0, p1, v4}, Lo/bvi$5;-><init>(Lo/bvi;Ljava/lang/String;I)V

    const/16 v2, 0xa

    invoke-interface {v0, v4, v2, p1, v1}, Lo/bsp;->d(IILjava/lang/String;Lo/bui;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized d()V
    .locals 3

    monitor-enter p0

    .line 64
    :try_start_0
    iget-object v0, p0, Lo/bvi;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/bvi;->c(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized d(Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Ljava/lang/String;)V"
        }
    .end annotation

    monitor-enter p0

    .line 140
    :try_start_0
    iget-object v0, p0, Lo/bvi;->i:Landroid/os/Handler;

    new-instance v1, Lo/bvi$2;

    invoke-direct {v1, p0, p1, p2}, Lo/bvi$2;-><init>(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic d(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/bvi;->d(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 4

    .line 69
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onQueryTextSubmit query= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/bvi;->c(Ljava/lang/String;I)V

    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 4

    .line 59
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadMore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-direct {p0}, Lo/bvi;->d()V

    .line 61
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 4

    .line 76
    const-string v0, "FitSearchAllHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onQueryTextChange newText= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lo/bvi;->c(Ljava/lang/String;I)V

    .line 78
    const/4 v0, 0x0

    return v0
.end method
