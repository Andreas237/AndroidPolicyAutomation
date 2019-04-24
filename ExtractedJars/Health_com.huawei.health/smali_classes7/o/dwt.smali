.class public Lo/dwt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;

.field private static c:Ljava/lang/String;


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lo/dwr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, "PLGACHIEVE_AchieveMedalResDownloadObserver"

    sput-object v0, Lo/dwt;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lo/dwt;->d:Landroid/content/Context;

    .line 52
    invoke-direct {p0}, Lo/dwt;->a()V

    .line 53
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 180
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 181
    invoke-static {p0, v3}, Lo/dzs;->c(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v4

    .line 182
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 183
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getActivityMedalTimeStamp time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "date_str="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    return-object v6
.end method

.method private a()V
    .locals 2

    .line 156
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    .line 157
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 158
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dwt;->e:Lo/dwr;

    .line 160
    :cond_0
    return-void
.end method

.method private a(Lo/dwk;)V
    .locals 4

    .line 108
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    const-string v1, "updateActivityMedalInfo "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p1}, Lo/dwk;->c()Lo/dvl;

    move-result-object v2

    .line 110
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 111
    invoke-virtual {v2}, Lo/dvl;->c()Ljava/lang/String;

    move-result-object v3

    .line 112
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 113
    sget-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    .line 116
    :cond_1
    sget-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dwt$3;

    invoke-direct {v1, p0, v2}, Lo/dwt$3;-><init>(Lo/dwt;Lo/dvl;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 125
    :cond_2
    return-void
.end method

.method static synthetic a(Lo/dwt;Lo/dvl;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/dwt;->c(Lo/dvl;)V

    return-void
.end method

.method private c(Lo/dvl;)V
    .locals 8

    .line 133
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 134
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    const-string v1, "mAchieveDataManager is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    return-void

    .line 137
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 138
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 139
    if-eqz v4, :cond_2

    .line 140
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 141
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvf;

    .line 142
    instance-of v0, v6, Lo/dvu;

    if-eqz v0, :cond_1

    .line 143
    move-object v7, v6

    check-cast v7, Lo/dvu;

    .line 144
    invoke-virtual {p1}, Lo/dvl;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/dvu;->r()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateActivityMedal medalId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/dvl;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-virtual {p1}, Lo/dvl;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dwt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvu;->u(Ljava/lang/String;)V

    .line 147
    invoke-virtual {p1}, Lo/dvl;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dwt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvu;->r(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    invoke-virtual {v0, v7}, Lo/dwr;->d(Lo/dvf;)Z

    .line 140
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 153
    :cond_2
    return-void
.end method

.method private e()V
    .locals 2

    .line 163
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 164
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    const-string v1, "enter releaseManager"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dwt;->e:Lo/dwr;

    .line 168
    :cond_0
    sget-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 169
    sget-object v0, Lo/dwt;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 171
    :cond_1
    return-void
.end method

.method private e(Lo/dwk;)V
    .locals 7

    .line 80
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    const-string v1, "enter processActivityMedal"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lo/dwt;->d:Landroid/content/Context;

    const-string v1, "FlorenceMedal"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    const-string v1, "first cover install"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lo/dwt;->d:Landroid/content/Context;

    const-string v1, "FlorenceMedal"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->u()V

    .line 86
    invoke-direct {p0}, Lo/dwt;->e()V

    .line 87
    return-void

    .line 89
    :cond_0
    invoke-virtual {p1}, Lo/dwk;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dvf;

    .line 90
    if-eqz v5, :cond_1

    instance-of v0, v5, Lo/dvu;

    if-eqz v0, :cond_1

    .line 91
    move-object v6, v5

    check-cast v6, Lo/dvu;

    .line 92
    invoke-virtual {v6}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v6}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processActivityMedal acquireActivityId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvu;->r()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->u()V

    .line 95
    goto :goto_1

    .line 98
    :cond_1
    goto :goto_0

    .line 99
    :cond_2
    :goto_1
    invoke-direct {p0}, Lo/dwt;->e()V

    .line 100
    return-void
.end method


# virtual methods
.method public e(ILo/dwk;)V
    .locals 4

    .line 59
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-nez p2, :cond_1

    .line 60
    :cond_0
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    const-string v1, "HttpErrCode or wrapper is error"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    return-void

    .line 63
    :cond_1
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    .line 64
    sget-object v0, Lo/dwt;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveMedalResDownloadObserver|onDataChanged contentType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const/16 v0, 0x8

    if-ne v3, v0, :cond_2

    .line 66
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->i()V

    .line 67
    iget-object v0, p0, Lo/dwt;->e:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 68
    invoke-direct {p0, p2}, Lo/dwt;->e(Lo/dwk;)V

    .line 70
    :cond_2
    const/16 v0, 0xa

    if-ne v3, v0, :cond_3

    .line 71
    invoke-direct {p0, p2}, Lo/dwt;->a(Lo/dwk;)V

    .line 73
    :cond_3
    return-void
.end method
