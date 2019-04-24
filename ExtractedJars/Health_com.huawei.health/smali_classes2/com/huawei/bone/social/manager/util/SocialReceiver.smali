.class public Lcom/huawei/bone/social/manager/util/SocialReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/bone/social/manager/util/SocialReceiver$e;,
        Lcom/huawei/bone/social/manager/util/SocialReceiver$a;
    }
.end annotation


# static fields
.field private static b:Z

.field private static d:Ljava/lang/String;


# instance fields
.field private a:Z

.field private c:Lo/vs;

.field private e:Landroid/content/Context;

.field private f:Lo/wo;

.field private g:Landroid/os/Handler;

.field private i:Lo/eeh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    .line 42
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->b:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->a:Z

    .line 176
    new-instance v0, Lcom/huawei/bone/social/manager/util/SocialReceiver$a;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$a;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->i:Lo/eeh;

    .line 256
    new-instance v0, Lcom/huawei/bone/social/manager/util/SocialReceiver$e;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$e;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->f:Lo/wo;

    .line 358
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->g:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 5

    .line 143
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BackgroundWorkService GET_PENDING_MOUNT_COUNT !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    const-string v1, "pending_moment_count"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/xt;->e(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v4

    .line 145
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_PENDING_MOUNT_COUNT num:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    if-lez v4, :cond_0

    .line 147
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d(J)V

    .line 149
    :cond_0
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c()V

    .line 150
    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->i()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/manager/util/SocialReceiver;J)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c(J)V

    return-void
.end method

.method private b()V
    .locals 0

    .line 153
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->k()V

    .line 154
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->a()V

    .line 155
    return-void
.end method

.method static synthetic b(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/bone/social/manager/util/SocialReceiver;J)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e(J)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/bone/social/manager/util/SocialReceiver;)Lo/wo;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->f:Lo/wo;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 158
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getPendingCount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;-><init>()V

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    .line 161
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->i:Lo/eeh;

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    .line 162
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    iget-object v1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    invoke-virtual {v0, v4, v1}, Lo/vs;->a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Landroid/content/Context;)I

    .line 163
    return-void
.end method

.method private c(J)V
    .locals 4

    .line 333
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setBroadcastToShowFriendRedDot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->g:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/bone/social/manager/util/SocialReceiver$5;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$5;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 343
    return-void
.end method

.method private c(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 85
    const/4 v4, 0x0

    .line 87
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 90
    goto :goto_0

    .line 88
    :catch_0
    move-exception v5

    .line 89
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialReceiver processWorkAction() getExtras exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 92
    return-void

    .line 94
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    return-void

    .line 97
    :cond_1
    iput-object p1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    .line 98
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 99
    invoke-static {}, Lo/vs;->a()Lo/vs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    .line 100
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    iget-object v1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/vs;->c(Landroid/content/Context;)V

    .line 102
    :cond_2
    const-string v0, "bundle_task"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 104
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 105
    return-void

    .line 107
    :cond_3
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SocialReceiver---->work:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 111
    :pswitch_0
    invoke-static {p1}, Lo/xp;->e(Landroid/content/Context;)V

    .line 112
    goto :goto_1

    .line 114
    :pswitch_1
    invoke-static {p1}, Lo/xp;->c(Landroid/content/Context;)V

    .line 115
    goto :goto_1

    .line 117
    :pswitch_2
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter MSG_FRIENDLIST_CHANGED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e()V

    .line 119
    goto :goto_1

    .line 121
    :pswitch_3
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialReceiver START_RANKING !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->b()V

    .line 123
    goto :goto_1

    .line 125
    :pswitch_4
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialReceiver GET_PENDING_MOUNT_COUNT !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    goto :goto_1

    .line 129
    :pswitch_5
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/xo;->b(Landroid/content/Context;)V

    .line 130
    .line 134
    :goto_1
    :pswitch_6
    return-void

    :pswitch_data_0
    .packed-switch 0x6f
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_6
        :pswitch_4
        :pswitch_2
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic c(Lcom/huawei/bone/social/manager/util/SocialReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/bone/social/manager/util/SocialReceiver;)Landroid/content/Context;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 35
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    return-object v0
.end method

.method private d(J)V
    .locals 4

    .line 307
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setBroadcastToShowSportRedDot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->g:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/bone/social/manager/util/SocialReceiver$3;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$3;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 317
    return-void
.end method

.method private e()V
    .locals 4

    .line 137
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter MSG_FRIENDLIST_CHANGED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->k()V

    .line 139
    return-void
.end method

.method private e(J)V
    .locals 4

    .line 346
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setBroadcastToDismissFriendRedDot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->g:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/bone/social/manager/util/SocialReceiver$7;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$7;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 356
    return-void
.end method

.method static synthetic e(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->h()V

    return-void
.end method

.method private f()V
    .locals 5

    .line 300
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setBroadcastToShowRedDot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 302
    const-string v0, "main_social_red_dot_show"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 303
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 304
    return-void
.end method

.method private h()V
    .locals 5

    .line 293
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setBroadcastToUpdateRank"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 295
    const-string v0, "main_social_update_ranking"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 297
    return-void
.end method

.method private i()V
    .locals 4

    .line 369
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter clearData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->k()V

    .line 371
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->i()V

    .line 372
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->p()I

    .line 373
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v0

    invoke-virtual {v0}, Lo/xo;->c()V

    .line 374
    invoke-static {}, Lo/vs;->a()Lo/vs;

    move-result-object v0

    invoke-virtual {v0}, Lo/vs;->c()V

    .line 376
    return-void
.end method

.method private k()V
    .locals 5

    .line 166
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getFriendList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 168
    invoke-static {}, Lo/vs;->a()Lo/vs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    .line 170
    :cond_0
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;-><init>()V

    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    .line 172
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->i:Lo/eeh;

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    .line 173
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c:Lo/vs;

    iget-object v1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->e:Landroid/content/Context;

    invoke-virtual {v0, v4, v1}, Lo/vs;->d(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Landroid/content/Context;)I

    .line 174
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;)Lcom/huawei/up/model/UserInfomation;
    .locals 5

    .line 245
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======getUserInfo begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 250
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 251
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 253
    :cond_0
    return-object v4
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 46
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->a:Z

    if-eqz v0, :cond_1

    .line 47
    :cond_0
    return-void

    .line 49
    :cond_1
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 50
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 53
    :cond_2
    const/4 v4, 0x0

    .line 55
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 58
    goto :goto_0

    .line 56
    :catch_0
    move-exception v5

    .line 57
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialReceiver---->onReceive: getAction() exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_0
    sget-object v0, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SocialReceiver---->onReceive:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const-string v0, "com.huawei.bone.social.login_expire"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 61
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/bone/social/manager/util/SocialReceiver$1;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 67
    :cond_3
    const-string v0, "com.huawei.plugin.account.login"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 68
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/huawei/bone/social/manager/util/SocialReceiver$2;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$2;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 74
    :cond_4
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 75
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/huawei/bone/social/manager/util/SocialReceiver$4;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/manager/util/SocialReceiver$4;-><init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 82
    :cond_5
    :goto_1
    return-void
.end method
