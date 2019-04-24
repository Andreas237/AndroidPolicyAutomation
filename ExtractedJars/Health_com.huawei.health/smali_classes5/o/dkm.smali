.class public Lo/dkm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/dkm;

.field private static final d:Ljava/lang/Object;

.field private static final e:[Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Lo/dea;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 26
    const/4 v0, 0x0

    sput-object v0, Lo/dkm;->b:Lo/dkm;

    .line 32
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.CALL_PHONE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/dkm;->e:[Ljava/lang/String;

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dkm;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lo/dkm;->a:Landroid/content/Context;

    .line 39
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iput-object v0, p0, Lo/dkm;->c:Lo/dea;

    .line 40
    iget-object v0, p0, Lo/dkm;->c:Lo/dea;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 41
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---mDeviceMgr is null---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :cond_0
    return-void
.end method

.method private a()V
    .locals 15

    .line 77
    const-class v4, Landroid/telephony/TelephonyManager;

    .line 81
    :try_start_0
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/telephony/TelephonyManager;

    .line 83
    const-string v0, "getITelephony"

    const/4 v1, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 85
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 86
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/android/internal/telephony/ITelephony;

    .line 88
    if-nez v7, :cond_0

    .line 89
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iTelephony is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 90
    return-void

    .line 92
    :cond_0
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SDK_LEVEL:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    invoke-interface {v7}, Lcom/android/internal/telephony/ITelephony;->endCall()Z

    move-result v8

    .line 95
    if-nez v8, :cond_6

    .line 96
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_5

    .line 97
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    const-string v1, "telephony_subscription_service"

    .line 98
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/telephony/SubscriptionManager;

    .line 99
    .line 100
    invoke-virtual {v9}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v10

    .line 101
    if-eqz v10, :cond_4

    .line 102
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/telephony/SubscriptionInfo;

    .line 103
    invoke-virtual {v12}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v13

    .line 104
    invoke-interface {v7, v13}, Lcom/android/internal/telephony/ITelephony;->endCallForSubscriber(I)Z

    move-result v14

    .line 105
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "endCallForSubscriber--Result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--SubId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    if-eqz v14, :cond_1

    .line 108
    return-void

    .line 110
    :cond_1
    goto :goto_0

    .line 112
    :cond_2
    :try_start_2
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    sget-object v1, Lo/dkm;->e:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v11

    .line 113
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check call phone and read phone state permission result :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    if-nez v11, :cond_3

    .line 115
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no call reject permission ,send broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    new-instance v12, Landroid/content/Intent;

    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    .line 117
    const-string v0, "com.huawei.health.action.NO_CALL_REJECT_PERMISION"

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v12, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 120
    :cond_3
    goto :goto_1

    .line 121
    :cond_4
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endCallForSubscriber--Get Active Subscription Info List Failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_1
    goto :goto_2

    .line 124
    :cond_5
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ITelephony.endCall()--Fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 127
    :cond_6
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ITelephony.endCall()--Succeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 141
    :goto_2
    goto :goto_3

    .line 129
    :catch_0
    move-exception v5

    .line 130
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endCall RuntimeException: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    sget-object v1, Lo/dkm;->e:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v6

    .line 133
    if-nez v6, :cond_7

    .line 134
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no call reject permission ,send broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 136
    const-string v0, "com.huawei.health.action.NO_CALL_REJECT_PERMISION"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    iget-object v0, p0, Lo/dkm;->a:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v7, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 141
    :cond_7
    goto :goto_3

    .line 139
    :catch_1
    move-exception v5

    .line 140
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endCall Exception: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    :goto_3
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/dkm;
    .locals 4

    .line 47
    sget-object v2, Lo/dkm;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 48
    :try_start_0
    sget-object v0, Lo/dkm;->b:Lo/dkm;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 49
    new-instance v0, Lo/dkm;

    invoke-direct {v0, p0}, Lo/dkm;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dkm;->b:Lo/dkm;

    .line 51
    :cond_0
    sget-object v0, Lo/dkm;->b:Lo/dkm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 52
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public c([B)V
    .locals 4

    .line 60
    array-length v0, p1

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 61
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCallingOperationReport ,length < 5, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void

    .line 65
    :cond_0
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 66
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 67
    const-string v0, "HWHFCallManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operation = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x4

    aget-byte v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u2014\u2014\u2014\u2014\u2014\u2014\u62d2\u63a5"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-direct {p0}, Lo/dkm;->a()V

    .line 71
    :cond_1
    return-void
.end method
