.class public Lo/afd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/afd;


# instance fields
.field private b:Lo/acp;

.field private c:Lo/afb;

.field private d:Lo/acd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/afd;->e:Lo/afd;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afd;->d:Lo/acd;

    .line 58
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry construtor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    new-instance v0, Lo/afb;

    invoke-direct {v0}, Lo/afb;-><init>()V

    iput-object v0, p0, Lo/afd;->c:Lo/afb;

    .line 60
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iput-object v0, p0, Lo/afd;->d:Lo/acd;

    .line 61
    return-void
.end method

.method public static e()Lo/afd;
    .locals 1

    .line 35
    sget-object v0, Lo/afd;->e:Lo/afd;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lo/afd;

    invoke-direct {v0}, Lo/afd;-><init>()V

    sput-object v0, Lo/afd;->e:Lo/afd;

    .line 38
    :cond_0
    sget-object v0, Lo/afd;->e:Lo/afd;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/afx;
    .locals 4

    .line 64
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry getMeasureKit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acq;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .line 131
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0}, Lo/acd;->k()V

    .line 132
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z
    .locals 4

    .line 237
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry startMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1, p2, p3}, Lo/afb;->b(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Lo/abx;)Z
    .locals 5

    .line 217
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry startBackgroundMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 219
    const-string v0, "isBackgroundMeasure"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 220
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1, p2, v4}, Lo/afb;->c(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 225
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry startMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1, p2, p3}, Lo/afb;->c(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Lo/acp;)Z
    .locals 4

    .line 211
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry startMeasureDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/afb;->d(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Lo/acp;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 4

    .line 186
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry deleteWearDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0}, Lo/acd;->d()I

    move-result v0

    return v0
.end method

.method public b(Lo/acl$a;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl$a;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry getBondedProductsForDeviceOnly"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->c(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lo/acl;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z
    .locals 4

    .line 164
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry bindDeviceUniversal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/acd;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z
    .locals 5

    .line 140
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry bindDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    instance-of v0, p3, Lo/aco;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p3}, Lo/acd;->e(Ljava/lang/String;Lo/acl;)Z

    move-result v0

    return v0

    .line 143
    :cond_0
    instance-of v0, p3, Lo/aja;

    if-eqz v0, :cond_1

    .line 144
    move-object v4, p3

    check-cast v4, Lo/aja;

    .line 145
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2, v4, p4}, Lo/acd;->a(Ljava/lang/String;Ljava/lang/String;Lo/aja;Lo/aby;)Z

    move-result v0

    return v0

    .line 146
    :cond_1
    instance-of v0, p3, Lo/acp;

    if-eqz v0, :cond_2

    .line 147
    move-object v4, p3

    check-cast v4, Lo/acp;

    .line 148
    iput-object v4, p0, Lo/afd;->b:Lo/acp;

    .line 149
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2, v4, p4}, Lo/acd;->e(Ljava/lang/String;Ljava/lang/String;Lo/acp;Lo/aby;)Z

    move-result v0

    return v0

    .line 151
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 1

    .line 135
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0}, Lo/acd;->h()V

    .line 136
    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 3

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p1}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v2

    .line 51
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 52
    const/4 v1, 0x1

    .line 54
    :cond_0
    return v1
.end method

.method public c(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Z)Z
    .locals 4

    .line 231
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry startMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/afb;->e(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Z)Z

    move-result v0

    return v0
.end method

.method public c(Lo/acf;Lo/ace;Lo/aby;)Z
    .locals 4

    .line 111
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry scanDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    if-nez p1, :cond_0

    if-nez p3, :cond_0

    .line 113
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_0
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2, p3}, Lo/acd;->b(Lo/acf;Lo/ace;Lo/aby;)Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;
    .locals 1

    .line 92
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/acl$a;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)Ljava/lang/String;
    .locals 6

    .line 243
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry startMeasureWithDeviceType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/afb;->d(Lo/acl$a;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0}, Lo/acd;->e()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 278
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry sendLocalBroadCast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2}, Lo/acd;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z
    .locals 4

    .line 119
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry scanDeviceUniersal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    if-nez p2, :cond_0

    .line 121
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_0
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2}, Lo/acd;->c(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    move-result v0

    return v0
.end method

.method public e(Lo/acl$a;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl$a;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 97
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry getBondedProducts"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->b(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lo/acl;
    .locals 5

    .line 69
    invoke-static {p1}, Lo/ajq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 70
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    invoke-virtual {p0, v4}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    return-object v0

    .line 73
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry getBondedWiFiDeviceByDeviceID productID is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Ljava/lang/String;I)V
    .locals 4

    .line 255
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry stopMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1, p2}, Lo/afb;->b(Ljava/lang/String;I)V

    .line 257
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 283
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry sendLocalBroadCast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2}, Lo/acd;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z
    .locals 5

    .line 155
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry bindWiFiUpdateDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    instance-of v0, p3, Lo/aja;

    if-eqz v0, :cond_0

    .line 157
    move-object v4, p3

    check-cast v4, Lo/aja;

    .line 158
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1, p2, v4, p4}, Lo/acd;->e(Ljava/lang/String;Ljava/lang/String;Lo/aja;Lo/aby;)Z

    move-result v0

    return v0

    .line 160
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 4

    .line 199
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry cancelBinding"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    iget-object v1, p0, Lo/afd;->b:Lo/acp;

    invoke-virtual {v0, v1}, Lo/acd;->d(Lo/acp;)Z

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;)Z
    .locals 1

    .line 175
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/String;)Z
    .locals 1

    .line 127
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->f(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public h()I
    .locals 4

    .line 192
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry deleteWearDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0}, Lo/acd;->a()I

    move-result v0

    return v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 4

    .line 249
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry stopMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1}, Lo/afb;->a(Ljava/lang/String;)V

    .line 251
    return-void
.end method

.method public i(Ljava/lang/String;)Z
    .locals 4

    .line 170
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry unbindDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public k(Ljava/lang/String;)Z
    .locals 4

    .line 180
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry unbindDeviceUniversal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/afd;->d:Lo/acd;

    invoke-virtual {v0, p1}, Lo/acd;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public l(Ljava/lang/String;)V
    .locals 4

    .line 261
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry stopMeasure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1}, Lo/afb;->d(Ljava/lang/String;)V

    .line 263
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 4

    .line 288
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDeviceEntry cleanupMeasureUniversal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    iget-object v0, p0, Lo/afd;->c:Lo/afb;

    invoke-virtual {v0, p1}, Lo/afb;->e(Ljava/lang/String;)V

    .line 290
    return-void
.end method
