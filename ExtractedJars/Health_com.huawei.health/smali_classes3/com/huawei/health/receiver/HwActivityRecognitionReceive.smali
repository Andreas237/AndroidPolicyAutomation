.class public Lcom/huawei/health/receiver/HwActivityRecognitionReceive;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const-string v0, "Track_HwActivityRecognitionReceive"

    sput-object v0, Lcom/huawei/health/receiver/HwActivityRecognitionReceive;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 38
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 40
    :cond_0
    return-void

    .line 46
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 47
    const-string v0, "track_msg"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 52
    goto :goto_0

    .line 48
    :catch_0
    move-exception v6

    .line 49
    sget-object v0, Lcom/huawei/health/receiver/HwActivityRecognitionReceive;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 53
    :goto_0
    sget-object v0, Lcom/huawei/health/receiver/HwActivityRecognitionReceive;->d:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " ,msg == "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const-string v0, "com.huawei.health.track.broadcast"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 55
    return-void

    .line 57
    :cond_2
    if-nez v5, :cond_3

    .line 58
    return-void

    .line 60
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    .line 62
    :goto_1
    const-string v0, "com.huawei.health.track.running"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 63
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 64
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 65
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const/16 v1, 0x102

    invoke-virtual {v0, v1, v6}, Lo/cbl;->e(IZ)V

    goto/16 :goto_2

    .line 67
    :cond_5
    const-string v0, "com.huawei.health.track.fastwalking"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 69
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 70
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 71
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const/16 v1, 0x101

    invoke-virtual {v0, v1, v6}, Lo/cbl;->e(IZ)V

    goto/16 :goto_2

    .line 72
    :cond_6
    const-string v0, "com.huawei.health.track.bicycle"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 74
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 75
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 76
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const/16 v1, 0x103

    invoke-virtual {v0, v1, v6}, Lo/cbl;->e(IZ)V

    goto :goto_2

    .line 77
    :cond_7
    const-string v0, "com.huawei.health.AUTO_TRACK_END"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 79
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->k()V

    goto :goto_2

    .line 80
    :cond_8
    const-string v0, "com.huawei.health.track.exit_running"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 82
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->c(Landroid/content/Context;)V

    goto :goto_2

    .line 83
    :cond_9
    const-string v0, "com.huawei.track.restart"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 85
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v7

    .line 86
    invoke-virtual {v7}, Lo/cbl;->a()Z

    move-result v0

    if-nez v0, :cond_a

    .line 87
    new-instance v8, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/MainActivity;

    invoke-direct {v8, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 88
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 89
    const-string v0, "mLaunchSource"

    const/4 v1, 0x4

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 90
    invoke-virtual {p1, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 94
    :cond_a
    :goto_2
    return-void
.end method
