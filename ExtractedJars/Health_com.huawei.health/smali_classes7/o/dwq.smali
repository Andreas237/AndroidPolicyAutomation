.class public Lo/dwq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-string v0, "PLGACHIEVE_AchieveActivityMedalService"

    sput-object v0, Lo/dwq;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dwr;Landroid/content/Context;)V
    .locals 9

    .line 32
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 33
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 34
    const/16 v0, 0x9

    invoke-virtual {p0, v0, v2}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 35
    new-instance v4, Lo/dwt;

    invoke-direct {v4, p1}, Lo/dwt;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-virtual {p0, v4}, Lo/dwr;->b(Lo/dui;)V

    .line 37
    if-eqz v3, :cond_3

    .line 38
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 39
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dvf;

    .line 40
    instance-of v0, v6, Lo/dvu;

    if-eqz v0, :cond_2

    .line 41
    move-object v7, v6

    check-cast v7, Lo/dvu;

    .line 42
    invoke-virtual {v7}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v7}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 46
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v7}, Lo/dvu;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    .line 49
    new-instance v0, Lo/dwq$3;

    invoke-direct {v0, p0, v8}, Lo/dwq$3;-><init>(Lo/dwr;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 38
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 59
    :cond_3
    return-void
.end method

.method private static b(Lo/dwr;Ljava/lang/String;)V
    .locals 4

    .line 63
    sget-object v0, Lo/dwq;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processActivityMedal acquireActivityId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 65
    const-string v0, "activityId"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const/16 v0, 0xa

    invoke-virtual {p0, v0, v3}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 67
    return-void
.end method

.method static synthetic c(Lo/dwr;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lo/dwq;->b(Lo/dwr;Ljava/lang/String;)V

    return-void
.end method
