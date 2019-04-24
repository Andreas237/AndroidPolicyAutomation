.class public Lcom/huawei/health/ui/widget/HealthSportWidget;
.super Landroid/appwidget/AppWidgetProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/ui/widget/HealthSportWidget$a;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

.field private static d:Landroid/os/Bundle;

.field private static e:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 65
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 67
    new-instance v0, Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;-><init>(Lcom/huawei/health/ui/widget/HealthSportWidget$4;)V

    sput-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    .line 69
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sput-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->d:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/ui/widget/HealthSportWidget;->b:Z

    .line 83
    return-void
.end method

.method private static b(Landroid/content/Context;F)I
    .locals 3

    .line 303
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 304
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    .line 198
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendForceUpdateBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    if-eqz p0, :cond_0

    .line 201
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.WIDGET_FORCE_UPDATE"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 205
    :cond_0
    return-void
.end method

.method private static b(Landroid/content/Context;Z)V
    .locals 3

    .line 153
    const-class v1, Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    monitor-enter v1

    .line 154
    :try_start_0
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 156
    :goto_0
    invoke-static {p0, v0, p1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->e(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;Z)V

    .line 157
    return-void
.end method

.method private static c(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;)Landroid/widget/RemoteViews;
    .locals 4

    .line 272
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    .line 274
    iget v0, v3, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 275
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    new-instance v2, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$layout;->hw_healthcloud_widget4x1:I

    invoke-direct {v2, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    .line 278
    :cond_0
    new-instance v2, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$layout;->hw_healthcloud_widget4x1_adapter:I

    invoke-direct {v2, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    .line 281
    :cond_1
    new-instance v2, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$layout;->hw_healthcloud_widget4x1:I

    invoke-direct {v2, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 285
    :goto_0
    sget v0, Lcom/huawei/plugindaemon/R$id;->split:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->a(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 287
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_steps:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 288
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_steps_unit:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 289
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_stepGoal_prefix:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 290
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_stepGoal:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 291
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_kcal_prefix:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 292
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_kcal:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 293
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_kcal_unit:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 295
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_steps:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {p0, v2, v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->e(Landroid/content/Context;Landroid/widget/RemoteViews;II)V

    .line 296
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_stepGoal:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->c(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {p0, v2, v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->c(Landroid/content/Context;Landroid/widget/RemoteViews;II)V

    .line 297
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_kcal:I

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {p0, v2, v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->d(Landroid/content/Context;Landroid/widget/RemoteViews;II)V

    .line 299
    return-object v2
.end method

.method public static c(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 18

    .line 166
    const-class v9, Lcom/huawei/health/ui/widget/HealthSportWidget;

    monitor-enter v9

    .line 167
    if-eqz p1, :cond_2

    if-eqz p0, :cond_2

    .line 169
    :try_start_0
    sput-object p1, Lcom/huawei/health/ui/widget/HealthSportWidget;->d:Landroid/os/Bundle;

    .line 171
    invoke-static/range {p0 .. p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v10

    .line 172
    new-instance v0, Landroid/content/ComponentName;

    const-class v1, Lcom/huawei/health/ui/widget/HealthSportWidget;

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v10, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v11

    .line 175
    if-eqz v11, :cond_0

    array-length v0, v11

    if-nez v0, :cond_1

    .line 176
    :cond_0
    new-instance v12, Landroid/content/Intent;

    const-string v0, "com.huawei.health.WIDGET_DISABLE"

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 177
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    move-object/from16 v1, p0

    invoke-virtual {v1, v12, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 180
    goto :goto_0

    .line 182
    :cond_1
    const-string v0, "step"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    .line 183
    const-string v0, "distance"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    .line 184
    const-string v0, "carior"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v14, v0, v1

    .line 186
    const-string v0, "target"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 187
    const-string v0, "KEY_BG_COLOR_TYPE"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 189
    move-object/from16 v0, p0

    move-object v1, v10

    move-object v2, v11

    move v3, v12

    move v4, v13

    move v5, v14

    move v6, v15

    move/from16 v7, v16

    const/4 v8, 0x1

    invoke-static/range {v0 .. v8}, Lcom/huawei/health/ui/widget/HealthSportWidget;->d(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[IIIFIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    :cond_2
    :goto_0
    monitor-exit v9

    goto :goto_1

    :catchall_0
    move-exception v17

    monitor-exit v9

    throw v17

    .line 193
    :goto_1
    return-void
.end method

.method private static c(Landroid/content/Context;Landroid/widget/RemoteViews;II)V
    .locals 1

    .line 390
    invoke-static {p0, p3}, Lo/cbh;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 391
    return-void
.end method

.method private static d(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[IIIFIII)V
    .locals 11

    .line 210
    const-string v0, "Step_HealthSportWidget"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onUpdate : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " dis "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ca "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " goal "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    move-object v0, p0

    move v1, p3

    move v2, p4

    move/from16 v3, p5

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    .line 213
    invoke-static/range {v0 .. v6}, Lcom/huawei/health/ui/widget/HealthSportWidget;->e(Landroid/content/Context;IIFIII)Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    move-result-object v7

    .line 215
    invoke-static {p0, v7}, Lcom/huawei/health/ui/widget/HealthSportWidget;->e(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;)V

    .line 217
    invoke-static {p0, v7}, Lcom/huawei/health/ui/widget/HealthSportWidget;->c(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;)Landroid/widget/RemoteViews;

    move-result-object v8

    .line 219
    invoke-static {p0}, Lcom/huawei/health/ui/widget/HealthSportWidget;->e(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v9

    .line 220
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v9, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v10

    .line 221
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget_4x1_LinearLayout:I

    invoke-virtual {v8, v0, v10}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 223
    invoke-virtual {p1, p2, v8}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 224
    return-void
.end method

.method private static d(Landroid/content/Context;Landroid/widget/RemoteViews;II)V
    .locals 1

    .line 394
    invoke-static {p0, p3}, Lo/cbh;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 395
    return-void
.end method

.method private static d(II)Z
    .locals 2

    .line 227
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 228
    const/4 v0, 0x1

    return v0

    .line 230
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static e(Landroid/content/Context;)Landroid/content/Intent;
    .locals 7

    .line 363
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 365
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 368
    const-string v0, "com.huawei.health"

    :try_start_0
    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 370
    if-nez v6, :cond_0

    .line 371
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLaunchIntentForPackage return null,set no action!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    return-object v4

    .line 375
    :cond_0
    :try_start_1
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 376
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 377
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 382
    goto :goto_0

    .line 380
    :catch_0
    move-exception v6

    .line 381
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthAPPIntent()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/UnsupportedOperationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    :goto_0
    return-object v4
.end method

.method private static e(Landroid/content/Context;IIFIII)Lcom/huawei/health/ui/widget/HealthSportWidget$a;
    .locals 7

    .line 318
    new-instance v4, Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;-><init>(Lcom/huawei/health/ui/widget/HealthSportWidget$4;)V

    .line 322
    const/4 v0, 0x1

    if-ne p5, v0, :cond_0

    .line 323
    const/high16 v5, -0x1000000

    .line 325
    sget v0, Lcom/huawei/plugindaemon/R$drawable;->hw_widget_split_black:I

    invoke-static {v4, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    goto :goto_0

    .line 326
    :cond_0
    const/4 v0, 0x2

    if-ne p5, v0, :cond_1

    .line 327
    const/4 v5, -0x1

    .line 328
    sget v0, Lcom/huawei/plugindaemon/R$drawable;->hw_widget_split_white:I

    invoke-static {v4, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    goto :goto_0

    .line 331
    :cond_1
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this devices not support widget bg recognized"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const/4 v5, -0x1

    .line 333
    sget v0, Lcom/huawei/plugindaemon/R$drawable;->hw_widget_split_white:I

    invoke-static {v4, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->d(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 335
    :goto_0
    invoke-static {v4, v5}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->c(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 337
    const/4 v0, -0x1

    if-eq v0, p1, :cond_2

    .line 338
    invoke-static {v4, p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 341
    :cond_2
    const/4 v0, -0x1

    if-eq v0, p4, :cond_5

    .line 343
    int-to-double v0, p1

    int-to-double v2, p4

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v6, v0

    .line 344
    const/16 v0, 0x64

    if-ne v6, v0, :cond_3

    if-ge p1, p4, :cond_3

    .line 345
    const/16 v6, 0x63

    goto :goto_1

    .line 346
    :cond_3
    const/16 v0, 0x64

    if-le v6, v0, :cond_4

    .line 347
    const/16 v6, 0x64

    .line 349
    :cond_4
    :goto_1
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "completedGoal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",stepGoal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    invoke-static {v4, v6}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->a(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 353
    :cond_5
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, v0, p3

    if-eqz v0, :cond_6

    .line 354
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float p3, v0

    .line 355
    float-to-int v0, p3

    invoke-static {v4, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 358
    :cond_6
    return-object v4
.end method

.method private static e(Landroid/content/Context;Landroid/widget/RemoteViews;II)V
    .locals 1

    .line 387
    invoke-static {p0, p3}, Lo/cbh;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 388
    return-void
.end method

.method private static e(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;)V
    .locals 1

    .line 160
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget;->e(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;Z)V

    .line 161
    return-void
.end method

.method private static e(Landroid/content/Context;Lcom/huawei/health/ui/widget/HealthSportWidget$a;Z)V
    .locals 7

    .line 235
    const/4 v4, 0x0

    .line 236
    const-class v5, Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    monitor-enter v5

    .line 237
    :try_start_0
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    invoke-static {v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v0

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->d(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    .line 238
    invoke-static {v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->c(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v0

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->c(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->d(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    .line 239
    invoke-static {v0}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v0

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->d(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 241
    :cond_0
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 242
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->c(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->a(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 243
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->a:Lcom/huawei/health/ui/widget/HealthSportWidget$a;

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;I)I

    .line 244
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "widgetData numbs changed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    const/4 v4, 0x1

    .line 247
    :cond_1
    if-eqz p2, :cond_2

    .line 248
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkout language changed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    :cond_2
    or-int/2addr v4, p2

    .line 251
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 252
    :goto_0
    if-nez v4, :cond_3

    .line 253
    return-void

    .line 256
    :cond_3
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindaemon/R$layout;->hw_healthcloud_widget4x1:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 257
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_steps:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->e(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {p0, v1}, Lo/cbh;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_stepGoal:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->c(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {p0, v1}, Lo/cbh;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    sget v0, Lcom/huawei/plugindaemon/R$id;->widget4x1_kcal:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget$a;->b(Lcom/huawei/health/ui/widget/HealthSportWidget$a;)I

    move-result v1

    invoke-static {p0, v1}, Lo/cbh;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-virtual {v5, v0, v1}, Landroid/view/View;->measure(II)V

    .line 261
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x43a00000    # 320.0f

    invoke-static {p0, v1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->b(Landroid/content/Context;F)I

    move-result v1

    if-gt v0, v1, :cond_4

    .line 262
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_1

    .line 264
    :cond_4
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 266
    :goto_1
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/huawei/health/ui/widget/HealthSportWidget;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    return-void
.end method


# virtual methods
.method public onDisabled(Landroid/content/Context;)V
    .locals 5

    .line 126
    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onDisabled(Landroid/content/Context;)V

    .line 127
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDisabled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    if-eqz p1, :cond_0

    .line 130
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.WIDGET_DISABLE"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p1, v4, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 134
    :cond_0
    return-void
.end method

.method public onEnabled(Landroid/content/Context;)V
    .locals 6

    .line 110
    if-eqz p1, :cond_0

    .line 111
    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onEnabled(Landroid/content/Context;)V

    .line 112
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onEnabled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.WIDGET_ENABLE"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p1, v4, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 118
    :cond_0
    const-class v4, Lcom/huawei/health/ui/widget/HealthSportWidget;

    monitor-enter v4

    .line 119
    :try_start_0
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->d:Landroid/os/Bundle;

    invoke-static {p1, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget;->c(Landroid/content/Context;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 122
    :goto_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 138
    if-eqz p2, :cond_0

    .line 139
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 140
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 141
    if-eqz v4, :cond_0

    .line 142
    const-string v0, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_LOCALE_CHANGED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget;->b(Landroid/content/Context;Z)V

    .line 145
    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->b(Landroid/content/Context;)V

    .line 149
    :cond_0
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 7

    .line 87
    invoke-super {p0, p1, p2, p3}, Landroid/appwidget/AppWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 88
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthSportWidget : onUpdate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-boolean v0, p0, Lcom/huawei/health/ui/widget/HealthSportWidget;->b:Z

    if-nez v0, :cond_0

    .line 90
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate()  start DaemonService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v4, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    :try_start_0
    invoke-virtual {p1, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 96
    :catch_0
    move-exception v5

    .line 97
    const-string v0, "Step_HealthSportWidget"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthSportWidget onUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/ui/widget/HealthSportWidget;->b:Z

    .line 101
    :cond_0
    invoke-static {p1}, Lcom/huawei/health/ui/widget/HealthSportWidget;->b(Landroid/content/Context;)V

    .line 103
    const-class v4, Lcom/huawei/health/ui/widget/HealthSportWidget;

    monitor-enter v4

    .line 104
    :try_start_1
    sget-object v0, Lcom/huawei/health/ui/widget/HealthSportWidget;->d:Landroid/os/Bundle;

    invoke-static {p1, v0}, Lcom/huawei/health/ui/widget/HealthSportWidget;->c(Landroid/content/Context;Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 106
    :goto_1
    return-void
.end method
