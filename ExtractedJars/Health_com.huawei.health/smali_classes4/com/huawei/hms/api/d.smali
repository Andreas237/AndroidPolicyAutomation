.class final Lcom/huawei/hms/api/d;
.super Lcom/huawei/hms/api/HuaweiApiAvailability;
.source "SourceFile"


# static fields
.field private static final a:Lcom/huawei/hms/api/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/huawei/hms/api/d;

    invoke-direct {v0}, Lcom/huawei/hms/api/d;-><init>()V

    sput-object v0, Lcom/huawei/hms/api/d;->a:Lcom/huawei/hms/api/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/hms/api/HuaweiApiAvailability;-><init>()V

    .line 38
    return-void
.end method

.method public static a()Lcom/huawei/hms/api/d;
    .locals 1

    .line 46
    sget-object v0, Lcom/huawei/hms/api/d;->a:Lcom/huawei/hms/api/d;

    return-object v0
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 1

    .line 159
    invoke-static {p0, p1}, Lcom/huawei/hms/activity/BridgeActivity;->getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 160
    invoke-virtual {p0, v0, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 161
    return-void
.end method


# virtual methods
.method public isHuaweiMobileNoticeAvailable(Landroid/content/Context;)I
    .locals 3

    .line 79
    const-string v0, "context must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    new-instance v1, Lcom/huawei/hms/c/g;

    invoke-direct {v1, p1}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 81
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v1, v0}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v2

    .line 82
    const v0, 0x13a54c0

    if-ge v2, v0, :cond_0

    .line 83
    const/4 v0, 0x2

    return v0

    .line 86
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I
    .locals 1

    .line 63
    const-string v0, "context must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    invoke-static {p1, p2}, Lcom/huawei/hms/api/HuaweiMobileServicesUtil;->isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public isUserResolvableError(I)Z
    .locals 1

    .line 97
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 103
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 105
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method public resolveError(Landroid/app/Activity;II)V
    .locals 4

    .line 119
    const-string v0, "activity must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    const-string v0, "HuaweiApiAvailabilityImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter resolveError, errorCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 128
    :sswitch_0
    new-instance v3, Lcom/huawei/hms/update/e/u;

    invoke-direct {v3}, Lcom/huawei/hms/update/e/u;-><init>()V

    .line 129
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hms/update/e/u;->a(Z)V

    .line 130
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v3, v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/String;)V

    .line 131
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getServicesVersionCode()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/update/e/u;->a(I)V

    .line 132
    const-string v0, "C10132067"

    invoke-virtual {v3, v0}, Lcom/huawei/hms/update/e/u;->b(Ljava/lang/String;)V

    .line 133
    const-string v0, "hms_update_title"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/update/e/u;->c(Ljava/lang/String;)V

    .line 134
    invoke-static {p1, p3, v3}, Lcom/huawei/hms/update/c/a;->a(Landroid/app/Activity;ILcom/huawei/hms/update/e/u;)V

    .line 136
    goto :goto_0

    .line 139
    :sswitch_1
    const-class v0, Lcom/huawei/hms/api/BindingFailedResolution;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p3}, Lcom/huawei/hms/api/d;->a(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 140
    .line 149
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method
