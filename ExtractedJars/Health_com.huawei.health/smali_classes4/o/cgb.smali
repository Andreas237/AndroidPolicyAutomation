.class public Lo/cgb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abd;


# instance fields
.field private a:I

.field b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

.field c:Lo/cgc$d;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:F

.field private i:I

.field private k:I

.field private l:D

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/open/TrackService;)V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgb;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgb;->c:Lo/cgc$d;

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->d:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->e:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->a:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->k:I

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->i:I

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->h:F

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->g:I

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->f:I

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->p:I

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->m:I

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->n:I

    .line 59
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cgb;->l:D

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->o:I

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->q:I

    .line 64
    iput-object p1, p0, Lo/cgb;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    .line 66
    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 5

    .line 167
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 169
    :cond_0
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 172
    :cond_1
    const/4 v3, 0x0

    .line 174
    :goto_0
    const/4 v4, 0x0

    .line 175
    if-eqz v3, :cond_2

    array-length v0, v3

    if-eqz v0, :cond_2

    .line 176
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0xe10

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget-object v1, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int v4, v0, v1

    .line 179
    :cond_2
    return v4
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 238
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lo/cgb;->i:I

    goto :goto_0

    .line 241
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->i:I

    .line 243
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 221
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    invoke-direct {p0, p1}, Lo/cgb;->a(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->a:I

    goto :goto_0

    .line 224
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->a:I

    .line 226
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 213
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 214
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lo/cgb;->e:I

    goto :goto_0

    .line 216
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->e:I

    .line 218
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 1

    .line 229
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->k:I

    goto :goto_0

    .line 232
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->k:I

    .line 234
    :goto_0
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 2

    .line 266
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cgb;->l:D

    goto :goto_0

    .line 269
    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cgb;->l:D

    .line 271
    :goto_0
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 2

    .line 247
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "--"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 248
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x45610000    # 3600.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/cgb;->h:F

    goto :goto_0

    .line 250
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->h:F

    .line 252
    :goto_0
    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 1

    .line 256
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "--"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->m:I

    goto :goto_0

    .line 260
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->m:I

    .line 262
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 136
    iget-object v0, p0, Lo/cgb;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v2

    .line 137
    invoke-virtual {v2}, Lo/cbu;->J()I

    move-result v0

    iput v0, p0, Lo/cgb;->d:I

    .line 138
    invoke-virtual {v2}, Lo/cbu;->am()Landroid/os/Bundle;

    move-result-object v3

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->e:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->a:I

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->k:I

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->i:I

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->h:F

    .line 144
    const-string v0, "targetType"

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cgb;->q:I

    .line 145
    iget v0, p0, Lo/cgb;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 147
    :pswitch_0
    const-string v0, "targetValue"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->f:I

    .line 148
    goto :goto_0

    .line 150
    :pswitch_1
    const-string v0, "targetValue"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Lo/cgb;->g:I

    .line 151
    goto :goto_0

    .line 153
    :pswitch_2
    const-string v0, "targetValue"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->p:I

    .line 154
    .line 158
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgb;->m:I

    .line 159
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cgb;->l:D

    .line 160
    const-string v0, "sportState"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->n:I

    .line 161
    const-string v0, "sportType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->o:I

    .line 162
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lo/cgb;->c:Lo/cgc$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 71
    iget-object v0, p0, Lo/cgb;->c:Lo/cgc$d;

    invoke-virtual {p0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cgc$d;->a(Landroid/os/Bundle;)V

    goto :goto_0

    .line 73
    :cond_0
    const-string v0, "Track_LogicalTrackData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLocalReportProxy is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    :goto_0
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 126
    move-object v0, p0

    check-cast v0, Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Landroid/os/Bundle;
    .locals 4

    .line 78
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 80
    iget v0, p0, Lo/cgb;->o:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    .line 81
    const/4 v0, -0x1

    iput v0, p0, Lo/cgb;->d:I

    .line 83
    :cond_0
    const-string v0, "gps"

    iget v1, p0, Lo/cgb;->d:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 84
    const-string v0, "distance"

    iget v1, p0, Lo/cgb;->e:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 85
    const-string v0, "duration"

    iget v1, p0, Lo/cgb;->a:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 86
    const-string v0, "heartRate"

    iget v1, p0, Lo/cgb;->k:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 87
    const-string v0, "calorie"

    iget v1, p0, Lo/cgb;->i:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 88
    const-string v0, "speed"

    iget v1, p0, Lo/cgb;->h:F

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 89
    const-string v0, "targetType"

    iget v1, p0, Lo/cgb;->q:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 91
    iget v0, p0, Lo/cgb;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 93
    :pswitch_0
    goto :goto_0

    .line 95
    :pswitch_1
    const-string v0, "timeTarget"

    iget v1, p0, Lo/cgb;->f:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 96
    goto :goto_0

    .line 98
    :pswitch_2
    const-string v0, "distanceTarget"

    iget v1, p0, Lo/cgb;->g:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 99
    goto :goto_0

    .line 101
    :pswitch_3
    const-string v0, "calorieTarget"

    iget v1, p0, Lo/cgb;->p:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 102
    nop

    .line 104
    .line 109
    :goto_0
    :pswitch_4
    const-string v0, "pace"

    iget v1, p0, Lo/cgb;->m:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 110
    const-string v0, "altitude"

    iget-wide v1, p0, Lo/cgb;->l:D

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 111
    const-string v0, "sportState"

    iget v1, p0, Lo/cgb;->n:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 112
    const-string v0, "sportType"

    iget v1, p0, Lo/cgb;->o:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 114
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    const-string v0, "disUnit"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 117
    :cond_1
    const-string v0, "disUnit"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_1
    return-object v3

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public b(I)V
    .locals 0

    .line 276
    iput p1, p0, Lo/cgb;->d:I

    .line 277
    return-void
.end method

.method public b(Lo/cgc$d;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/cgb;->c:Lo/cgc$d;

    .line 132
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 8

    .line 187
    if-nez p1, :cond_0

    .line 188
    return-void

    .line 190
    :cond_0
    const-string v0, "duration"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 191
    const-string v0, "distance"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 192
    const-string v0, "speed"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 193
    const-string v0, "heartRate"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 194
    const-string v0, "pace"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 195
    const-string v0, "calorie"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 196
    const-string v7, "0"

    .line 198
    invoke-direct {p0, v2}, Lo/cgb;->d(Ljava/lang/String;)V

    .line 199
    invoke-direct {p0, v1}, Lo/cgb;->c(Ljava/lang/String;)V

    .line 200
    invoke-direct {p0, v4}, Lo/cgb;->e(Ljava/lang/String;)V

    .line 201
    invoke-direct {p0, v6}, Lo/cgb;->b(Ljava/lang/String;)V

    .line 202
    invoke-direct {p0, v3}, Lo/cgb;->i(Ljava/lang/String;)V

    .line 203
    invoke-direct {p0, v5}, Lo/cgb;->k(Ljava/lang/String;)V

    .line 204
    invoke-direct {p0, v7}, Lo/cgb;->h(Ljava/lang/String;)V

    .line 206
    const-string v0, "sportType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/cgb;->o:I

    .line 209
    return-void
.end method

.method public d(I)V
    .locals 5

    .line 282
    iput p1, p0, Lo/cgb;->n:I

    .line 285
    :try_start_0
    invoke-virtual {p0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cgb;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    goto :goto_0

    .line 286
    :catch_0
    move-exception v4

    .line 287
    const-string v0, "Track_LogicalTrackData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PorcessFused()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :goto_0
    return-void
.end method

.method public e()I
    .locals 1

    .line 292
    iget v0, p0, Lo/cgb;->n:I

    return v0
.end method
