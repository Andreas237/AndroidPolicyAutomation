.class public Lcom/huawei/health/StartHealthActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/StartHealthActivity$c;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Z

.field private k:Lcom/huawei/health/StartHealthActivity$c;

.field private l:Ljava/lang/Runnable;

.field private m:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/StartHealthActivity;->d:I

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    .line 50
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/StartHealthActivity;->f:I

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->g:Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/StartHealthActivity;->i:Z

    .line 277
    new-instance v0, Lcom/huawei/health/StartHealthActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/StartHealthActivity$5;-><init>(Lcom/huawei/health/StartHealthActivity;)V

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->b:Ljava/util/Map;

    .line 299
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->o:Ljava/lang/String;

    .line 367
    new-instance v0, Lcom/huawei/health/StartHealthActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/StartHealthActivity$4;-><init>(Lcom/huawei/health/StartHealthActivity;)V

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->l:Ljava/lang/Runnable;

    return-void
.end method

.method private a()V
    .locals 5

    .line 184
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPairDeviceActivity deviceType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/StartHealthActivity;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 186
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 187
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->f:I

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 188
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPairDeviceActivity is r1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const-string v0, "style"

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 190
    const-string v0, "isFromWearR1"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 191
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 193
    :cond_0
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPairDeviceActivity is not r1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const-string v0, "device_type"

    iget v1, p0, Lcom/huawei/health/StartHealthActivity;->f:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 195
    const-string v0, "dname"

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->g:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    const-string v0, "isPorc"

    iget-boolean v1, p0, Lcom/huawei/health/StartHealthActivity;->i:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 197
    const-string v0, "isFromWear"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 198
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 200
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 201
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 290
    const/4 v0, 0x1

    return v0

    .line 292
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/StartHealthActivity;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 153
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 154
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 155
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->c()V

    goto :goto_0

    .line 156
    :cond_0
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 157
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->e()V

    goto :goto_0

    .line 158
    :cond_1
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 159
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->a()V

    goto :goto_0

    .line 162
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->k()V

    .line 164
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 165
    return-void
.end method

.method private c()V
    .locals 7

    .line 204
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSportActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v4, "1"

    .line 206
    sget-object v0, Lo/dae;->bB:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 207
    invoke-direct {p0, v5, v4}, Lcom/huawei/health/StartHealthActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    new-instance v6, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/MainActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 209
    const/high16 v0, 0x4000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 211
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 212
    const-string v0, "isToSportTab"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 213
    const-string v0, "mLaunchSource"

    const/4 v1, 0x3

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 214
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "negative button to params"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 216
    invoke-virtual {p0, v6}, Lcom/huawei/health/StartHealthActivity;->startActivity(Landroid/content/Intent;)V

    .line 218
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 5

    .line 243
    const-string v0, "com.huawei.sim.esim.view.WirelessManagerAcitivity"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.huawei.sim.esim.view.EsimActivationActivity"

    .line 244
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivityByClassName already in esim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    return-void

    .line 250
    :cond_1
    const-string v0, "com.huawei.nfc.carrera.ui.cardlist.AddBankOrBusCardActivity"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 251
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 252
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivityByClassName already in wallet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    return-void

    .line 255
    :cond_2
    const-string p1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    .line 258
    :cond_3
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 260
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    goto :goto_0

    .line 261
    :catch_0
    move-exception v4

    .line 262
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity catch e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    :goto_0
    return-void
.end method

.method private d()V
    .locals 6

    .line 121
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->a:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 122
    :cond_0
    const/4 v4, -0x1

    .line 123
    const/4 v5, 0x0

    .line 125
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 126
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->b()I

    move-result v4

    .line 129
    :cond_1
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->getAdapter()Lo/eab;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 130
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->o()I

    move-result v5

    .line 133
    :cond_2
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", fitState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    const/4 v0, 0x1

    if-eq v5, v0, :cond_3

    const/4 v0, 0x2

    if-eq v5, v0, :cond_3

    const/4 v0, 0x2

    if-ne v4, v0, :cond_4

    .line 139
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 140
    return-void

    .line 142
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->b()V

    .line 143
    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 144
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activityID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/StartHealthActivity;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->h()V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->h:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/StartHealthActivity;->c(Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 149
    :cond_6
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 267
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 268
    const-string v3, "1"

    .line 269
    const-string v0, "click"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 271
    const-string v0, "type"

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v4

    .line 274
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v4, v0, p1, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 275
    return-void
.end method

.method private e()V
    .locals 8

    .line 168
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitnessExerciseActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const-string v4, "2"

    .line 170
    sget-object v0, Lo/dae;->bB:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 171
    invoke-direct {p0, v5, v4}, Lcom/huawei/health/StartHealthActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v6

    .line 173
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 174
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    .line 175
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/MainActivity;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 176
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 177
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 178
    goto :goto_0

    .line 179
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 181
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 324
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 325
    const/16 v0, 0x8

    if-ne v0, p1, :cond_0

    .line 326
    return-void

    .line 329
    :cond_0
    const v0, 0x7f12144b

    invoke-virtual {p0, v0}, Lcom/huawei/health/StartHealthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewStub;

    .line 330
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 331
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStartPageVisibility ViewStub is loaded fail."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    return-void

    .line 335
    :cond_1
    invoke-virtual {v4}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->p:Landroid/widget/LinearLayout;

    .line 336
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init start page ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 340
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 6

    .line 303
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v4

    .line 304
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginit_isLogined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    invoke-static {}, Lo/ale;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_1

    .line 306
    :cond_0
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StartHealth to MainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 308
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/MainActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 309
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 310
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 311
    goto :goto_0

    .line 312
    :cond_1
    const v0, 0x7f0702f8

    invoke-virtual {p0, v0}, Lcom/huawei/health/StartHealthActivity;->setContentView(I)V

    .line 313
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/StartHealthActivity;->e(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->o:Ljava/lang/String;

    .line 316
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showStartUpPageAndSkip activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/StartHealthActivity;->o:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->k:Lcom/huawei/health/StartHealthActivity$c;

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/huawei/health/StartHealthActivity$c;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->k:Lcom/huawei/health/StartHealthActivity$c;

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->l:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/StartHealthActivity$c;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 321
    :goto_0
    return-void
.end method

.method private f()Z
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->a()Z

    move-result v0

    return v0
.end method

.method private h()V
    .locals 3

    .line 361
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v1

    .line 362
    invoke-static {}, Lo/cvx;->b()Lo/cvx;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/ecy;->setAdapter(Lo/eab;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v2

    .line 364
    invoke-static {}, Lo/cvu;->d()Lo/cvu;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/PluginPay;->setAdapter(Lo/eab;)V

    .line 365
    return-void
.end method

.method private i()Z
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->isShowPay()Z

    move-result v0

    return v0
.end method

.method private k()V
    .locals 7

    .line 221
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSmartMsgSkipActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 223
    sget-object v0, Lo/dae;->bJ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 224
    invoke-direct {p0, v5, v4}, Lcom/huawei/health/StartHealthActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 226
    const-string v0, "id"

    iget v1, p0, Lcom/huawei/health/StartHealthActivity;->d:I

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 227
    const-string v0, "msgContent"

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->a:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    const-string v0, "msgType"

    iget v1, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 229
    const-string v0, "from"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 230
    const-class v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;

    invoke-virtual {v6, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 231
    invoke-virtual {p0, v6}, Lcom/huawei/health/StartHealthActivity;->startActivity(Landroid/content/Intent;)V

    .line 232
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 58
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 60
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 62
    return-void

    .line 64
    :cond_0
    iput-object p0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    .line 65
    new-instance v0, Lcom/huawei/health/StartHealthActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/health/StartHealthActivity$c;-><init>(Lcom/huawei/health/StartHealthActivity$5;)V

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->k:Lcom/huawei/health/StartHealthActivity$c;

    .line 67
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->m:Ljava/lang/String;

    .line 69
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->m:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/StartHealthActivity;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get actionName not null=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/StartHealthActivity;->m:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->b:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->m:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/ale;->b(Ljava/lang/String;)V

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->h()V

    .line 76
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->m:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/StartHealthActivity;->e(Ljava/lang/String;)V

    .line 77
    return-void

    .line 81
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "health_smartmsg_id"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/StartHealthActivity;->d:I

    .line 82
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "health_smartmsg_type"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    .line 83
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "health_smartmsg_content"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->a:Ljava/lang/String;

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "produceType"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/StartHealthActivity;->f:I

    .line 85
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "produceName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->g:Ljava/lang/String;

    .line 86
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isPorc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/StartHealthActivity;->i:Z

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "health_activity_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/StartHealthActivity;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 89
    :catch_0
    move-exception v4

    .line 90
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StartHealthActivity encounteredClassNotFoundException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v4

    .line 94
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginit_isLogined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-static {}, Lo/ale;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_3

    .line 96
    :cond_2
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StartHealth to MainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 99
    const-string v0, "health_smartmsg_id"

    iget v1, p0, Lcom/huawei/health/StartHealthActivity;->d:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 100
    const-string v0, "health_smartmsg_type"

    iget v1, p0, Lcom/huawei/health/StartHealthActivity;->e:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 101
    const-string v0, "health_smartmsg_content"

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    const-string v0, "device_type"

    iget v1, p0, Lcom/huawei/health/StartHealthActivity;->f:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 103
    const-string v0, "dname"

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->g:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    const-string v0, "isPorc"

    iget-boolean v1, p0, Lcom/huawei/health/StartHealthActivity;->i:Z

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 105
    const-string v0, "isFromWear"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 106
    const-string v0, "health_activity_id"

    iget-object v1, p0, Lcom/huawei/health/StartHealthActivity;->h:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/MainActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 109
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 110
    invoke-virtual {p0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/StartHealthActivity;->d()V

    .line 114
    :goto_1
    return-void
.end method
