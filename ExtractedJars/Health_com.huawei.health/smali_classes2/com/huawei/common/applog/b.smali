.class Lcom/huawei/common/applog/b;
.super Lcom/huawei/logupload/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/common/applog/AppLogPackLogService;


# direct methods
.method constructor <init>(Lcom/huawei/common/applog/AppLogPackLogService;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-direct {p0}, Lcom/huawei/logupload/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 27

    .line 68
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-virtual {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    iget-object v1, v1, Lcom/huawei/common/applog/AppLogPackLogService;->b:Lcom/huawei/logupload/g$a;

    .line 69
    invoke-static {}, Lcom/huawei/logupload/g$a;->getCallingUid()I

    move-result v1

    .line 68
    invoke-static {v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    const-string v0, "AppLogApi/AppLogPackLogService"

    const-string v1, "auth fail"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-virtual {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->stopSelf()V

    .line 72
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    const-string v1, "100001"

    const-string v2, "auth fail"

    const-string v3, ""

    const-string v4, ""

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 74
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-virtual {v1}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "feedbacklogs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 76
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 77
    sget-object v7, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 78
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 79
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v9, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 82
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    .line 83
    invoke-virtual {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 84
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v11, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    .line 85
    invoke-static {v11}, Lcom/huawei/phoneserviceuni/common/e/a/b/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "app-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    .line 87
    invoke-virtual {v1}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 88
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    .line 89
    invoke-virtual {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    .line 90
    invoke-virtual {v1}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 88
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    .line 92
    const-string v0, "_"

    const-string v1, "-"

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 93
    const-string v0, "_"

    const-string v1, "-"

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 94
    const-string v0, "_"

    const-string v1, "-"

    invoke-virtual {v13, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v13

    .line 95
    const/4 v0, 0x0

    if-eq v0, v14, :cond_1

    .line 96
    const-string v0, "_"

    const-string v1, "-"

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v14

    .line 99
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/temp_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Huawei/phoneservice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 115
    const/16 v0, 0xb

    new-array v0, v0, [B

    move-object/from16 v19, v0

    .line 116
    invoke-static/range {v19 .. v19}, Lcom/huawei/feedback/g;->a([B)V

    .line 117
    move-object/from16 v0, v19

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v20

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AESV2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 120
    const/16 v22, 0x0

    .line 123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    const-string v1, "android.permission.WRITE_MEDIA_STORAGE"

    .line 124
    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/AppLogPackLogService;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_6

    .line 126
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 127
    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/AppLogPackLogService;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_5

    .line 128
    new-instance v23, Landroid/content/Intent;

    invoke-direct/range {v23 .. v23}, Landroid/content/Intent;-><init>()V

    .line 129
    move-object/from16 v0, v23

    const v1, 0x8000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 130
    move-object/from16 v0, v23

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-virtual {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/common/applog/SdCardPermissionActvity;

    move-object/from16 v2, v23

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 133
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    iget-object v1, v1, Lcom/huawei/common/applog/AppLogPackLogService;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/bean/d;->a(Ljava/lang/Object;)V

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/AppLogPackLogService;->startActivity(Landroid/content/Intent;)V

    .line 136
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    iget-object v1, v0, Lcom/huawei/common/applog/AppLogPackLogService;->a:Ljava/lang/Object;

    move-object/from16 v24, v1

    monitor-enter v24

    .line 137
    :goto_0
    :try_start_0
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->c()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 139
    const-string v0, "AppLogApi/AppLogPackLogService"

    const-string v1, "AppLogPackLogService wait...."

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    iget-object v0, v0, Lcom/huawei/common/applog/AppLogPackLogService;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    goto :goto_0

    .line 142
    :catch_0
    move-exception v25

    .line 143
    const-string v0, "AppLogApi/AppLogPackLogService"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppLogPackLogService  InterruptedException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 145
    invoke-virtual/range {v25 .. v25}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    goto :goto_0

    .line 148
    :cond_3
    monitor-exit v24

    goto :goto_1

    :catchall_0
    move-exception v26

    monitor-exit v24

    throw v26

    .line 149
    :goto_1
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    move-object/from16 v1, v18

    move-object/from16 v2, v17

    move-object/from16 v3, v21

    invoke-static {v0, v1, v2, v5, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->b(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v22

    goto :goto_2

    .line 153
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Lcom/huawei/common/applog/AppLogPackLogService;)V

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    const-string v1, "100002"

    const-string v2, "no sdcard permission"

    const-string v3, ""

    const-string v4, ""

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 159
    :goto_2
    goto :goto_3

    .line 160
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    move-object/from16 v1, v18

    move-object/from16 v2, v17

    move-object/from16 v3, v21

    invoke-static {v0, v1, v2, v5, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->b(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v22

    goto :goto_3

    .line 164
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    move-object/from16 v1, v18

    move-object/from16 v2, v17

    move-object/from16 v3, v21

    invoke-static {v0, v1, v2, v5, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->b(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v22

    .line 167
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/common/applog/b;->a:Lcom/huawei/common/applog/AppLogPackLogService;

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Lcom/huawei/common/applog/AppLogPackLogService;)V

    .line 168
    return-object v22
.end method
