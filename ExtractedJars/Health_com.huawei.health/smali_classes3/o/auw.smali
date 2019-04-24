.class public final Lo/auw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Landroid/graphics/Bitmap;

.field private static d:F


# instance fields
.field private final a:Lo/aye;

.field private final c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lo/auw;->b:Landroid/graphics/Bitmap;

    .line 55
    const/high16 v0, -0x40800000    # -1.0f

    sput v0, Lo/auw;->d:F

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lo/aye;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lo/auw;->c:Landroid/content/Context;

    .line 74
    iput-object p2, p0, Lo/auw;->a:Lo/aye;

    .line 75
    return-void
.end method

.method private a(Z)Landroid/app/Notification$Builder;
    .locals 6

    .line 180
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/auw;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 181
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_1
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v3

    .line 187
    invoke-direct {p0, v3}, Lo/auw;->b(Landroid/app/Notification$Builder;)V

    .line 189
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->d()Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 190
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->c()Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 192
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 193
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    goto :goto_0

    .line 194
    :cond_2
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 195
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 198
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 199
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 201
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 204
    invoke-direct {p0, v3}, Lo/auw;->d(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 206
    invoke-direct {p0, v3}, Lo/auw;->a(Landroid/app/Notification$Builder;)V

    .line 208
    if-nez p1, :cond_5

    .line 210
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 213
    :cond_5
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->h()Landroid/content/Intent;

    move-result-object v4

    .line 215
    if-eqz v4, :cond_7

    .line 216
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 217
    iget-object v0, p0, Lo/auw;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->i()I

    move-result v1

    const/high16 v2, 0x10000000

    invoke-static {v0, v1, v4, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 219
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 220
    goto :goto_1

    .line 221
    :cond_6
    iget-object v0, p0, Lo/auw;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->i()I

    move-result v1

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v4, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 223
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 226
    :cond_7
    :goto_1
    return-object v3
.end method

.method private static a(F)V
    .locals 0

    .line 58
    sput p0, Lo/auw;->d:F

    .line 59
    return-void
.end method

.method private a(Landroid/app/Notification$Builder;)V
    .locals 2

    .line 235
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 239
    :cond_0
    return-void
.end method

.method private static a(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 46
    sput-object p0, Lo/auw;->b:Landroid/graphics/Bitmap;

    .line 47
    return-void
.end method

.method private b(Landroid/app/Notification$Builder;)V
    .locals 1

    .line 247
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 249
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 250
    :cond_0
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 253
    :cond_1
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 254
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 256
    :cond_2
    return-void
.end method

.method private d(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;
    .locals 2

    .line 266
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    iget-object v0, p0, Lo/auw;->c:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lo/auw;->e(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 268
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 271
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->ic_health_notification:I

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 273
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->f()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 275
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 276
    :cond_1
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->f()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 279
    :cond_2
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->m()I

    move-result v0

    if-eqz v0, :cond_3

    .line 280
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->m()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 282
    :cond_3
    return-object p1
.end method

.method public static d(Landroid/content/Context;Lo/aye;)Lo/auw;
    .locals 1

    .line 85
    new-instance v0, Lo/auw;

    invoke-direct {v0, p0, p1}, Lo/auw;-><init>(Landroid/content/Context;Lo/aye;)V

    return-object v0
.end method

.method private e(Landroid/app/Notification;Landroid/graphics/Bitmap;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 165
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setSmallIcon"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/graphics/drawable/Icon;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 166
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 167
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v5, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    goto :goto_0

    .line 168
    :catch_0
    move-exception v5

    .line 169
    const-string v0, "BaseNotification"

    const-string v1, "setSmallIcon error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    :goto_0
    return-void
.end method


# virtual methods
.method public a(JZII)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 118
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/auw;->a(Z)Landroid/app/Notification$Builder;

    move-result-object v7

    .line 119
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 121
    :try_start_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 123
    const-string v0, "android.extraAppName"

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 124
    invoke-virtual {v7, v8}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 127
    :cond_0
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    .line 128
    invoke-virtual {v7}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    .line 127
    invoke-virtual/range {v0 .. v6}, Lo/awk;->b(Landroid/app/Notification;JZII)Landroid/app/Notification;

    move-result-object v8

    .line 130
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 131
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->p()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v0}, Lo/aye;->p()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v8, v0}, Lo/auw;->e(Landroid/app/Notification;Landroid/graphics/Bitmap;)V

    .line 136
    :cond_1
    invoke-static {}, Lo/bom;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 138
    const-string v0, "huawei.notification.backgroundIndex"

    const/16 v1, 0x8

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 139
    iput-object v9, v8, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 147
    :cond_2
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->i()I

    move-result v1

    invoke-virtual {v0, v1, v8}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 149
    invoke-static {}, Lo/aob;->b()V
    :try_end_0
    .catch Landroid/util/AndroidRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    goto :goto_0

    .line 150
    :catch_0
    move-exception v8

    .line 151
    const-string v0, "BaseNotification"

    const-string v1, "showBroadcastNotify() meet AndroidRuntimeException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :cond_3
    :goto_0
    return-void
.end method

.method public declared-synchronized d()F
    .locals 5

    monitor-enter p0

    .line 298
    :try_start_0
    sget v0, Lo/auw;->d:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 299
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 300
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_notify_icon_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    .line 302
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x1050005

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    .line 303
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_0

    cmpg-float v0, v4, v3

    if-gez v0, :cond_0

    .line 304
    move v3, v4

    .line 308
    :cond_0
    goto :goto_0

    .line 306
    :catch_0
    move-exception v4

    .line 307
    const-string v0, "BaseNotification"

    const-string v1, "get notification_large_icon_width failed!!!!!!NotFoundException"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    :goto_0
    invoke-static {v3}, Lo/auw;->a(F)V

    .line 311
    :cond_1
    sget v0, Lo/auw;->d:F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized e(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 9

    monitor-enter p0

    .line 321
    :try_start_0
    sget-object v0, Lo/auw;->b:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    .line 322
    invoke-virtual {p0}, Lo/auw;->d()F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    .line 326
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_notification:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 328
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 330
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    div-float v7, v4, v0

    .line 332
    invoke-virtual {v6, v7, v7}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 333
    float-to-int v0, v4

    float-to-int v1, v4

    .line 334
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 333
    :goto_0
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lo/auw;->a(Landroid/graphics/Bitmap;)V

    .line 335
    new-instance v8, Landroid/graphics/Canvas;

    sget-object v0, Lo/auw;->b:Landroid/graphics/Bitmap;

    invoke-direct {v8, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 336
    invoke-virtual {v8, v6}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 337
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 338
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 343
    goto :goto_1

    .line 339
    :catch_0
    move-exception v5

    .line 340
    const-string v0, "BaseNotification"

    const-string v1, "getDefaultIcon OutOfMemoryError icon can not get"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    goto :goto_1

    .line 341
    :catch_1
    move-exception v5

    .line 342
    const-string v0, "BaseNotification"

    const-string v1, "getDefaultIcon IllegalArgumentException icon can not get"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    :cond_1
    :goto_1
    sget-object v0, Lo/auw;->b:Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 93
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/auw;->a(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 94
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 96
    :try_start_0
    invoke-virtual {v2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    .line 97
    invoke-static {}, Lo/bom;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 99
    const-string v0, "huawei.notification.backgroundIndex"

    const/16 v1, 0x8

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 100
    iput-object v4, v3, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 103
    :cond_0
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dbc;->b(I)V

    .line 104
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    iget-object v1, p0, Lo/auw;->a:Lo/aye;

    invoke-virtual {v1}, Lo/aye;->i()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 105
    invoke-static {}, Lo/aob;->b()V
    :try_end_0
    .catch Landroid/util/AndroidRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    goto :goto_0

    .line 107
    :catch_0
    move-exception v3

    .line 108
    const-string v0, "BaseNotification"

    const-string v1, "showBroadcastNotify() meet AndroidRuntimeException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :cond_1
    :goto_0
    return-void
.end method
