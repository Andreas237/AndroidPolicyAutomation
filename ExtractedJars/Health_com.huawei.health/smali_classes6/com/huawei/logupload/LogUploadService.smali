.class public Lcom/huawei/logupload/LogUploadService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"

.field private static final b:Ljava/lang/String; = "com.huawei.lcagent.RESUME_UPLOAD"

.field private static final c:Ljava/lang/String; = "com.huawei.lcagent.UPLOAD_REQUEST"

.field private static final e:I = 0x100000

.field private static f:I = 0x0


# instance fields
.field private d:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const/4 v0, 0x0

    sput v0, Lcom/huawei/logupload/LogUploadService;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 1

    .line 51
    sget v0, Lcom/huawei/logupload/LogUploadService;->f:I

    return v0
.end method

.method public static a(I)V
    .locals 0

    .line 55
    sput p0, Lcom/huawei/logupload/LogUploadService;->f:I

    .line 56
    return-void
.end method

.method public static a(Lcom/huawei/logupload/LogUpload;)V
    .locals 13

    .line 674
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 675
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 674
    invoke-static {v0}, Lcom/huawei/logupload/c/i;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v3

    .line 676
    invoke-static {v3}, Lcom/huawei/logupload/c/i;->a(Landroid/net/NetworkInfo;)I

    move-result v4

    .line 677
    invoke-static {v4}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 678
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 679
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 678
    invoke-static {v0}, Lcom/huawei/logupload/c/i;->f(Landroid/content/Context;)I

    move-result v5

    .line 680
    invoke-static {v5}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 681
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "prepareForUpload networkType"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 682
    const-string v2, "netType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/logupload/c/c;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 681
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 684
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    if-nez v0, :cond_0

    .line 685
    new-instance v6, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 686
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 687
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 688
    const-string v0, "packagename"

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    invoke-virtual {v7, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 690
    invoke-virtual {v6, v7}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 692
    goto/16 :goto_0

    .line 694
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v6

    .line 696
    and-int/lit8 v7, v6, 0x1

    .line 697
    and-int/lit8 v8, v6, 0x2

    .line 698
    and-int/lit8 v9, v6, 0x4

    .line 699
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "flagWifi "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag3g"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag2g"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 701
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 703
    const/4 v0, 0x1

    if-ne v7, v0, :cond_2

    .line 706
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 707
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 709
    invoke-static {}, Lcom/huawei/logupload/c/i;->d()V

    .line 712
    :cond_1
    const-string v0, "LogUpload Service"

    const-string v1, "Begin to start the thread..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 714
    invoke-static {}, Lcom/huawei/logupload/b/a;->a()Lcom/huawei/logupload/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/logupload/f;

    .line 715
    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/logupload/f;-><init>(Lcom/huawei/logupload/LogUpload;I)V

    .line 714
    invoke-virtual {v0, v1}, Lcom/huawei/logupload/b/a;->a(Ljava/lang/Runnable;)V

    .line 716
    goto/16 :goto_0

    .line 717
    :cond_2
    new-instance v10, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v10, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 718
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v11

    .line 719
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 720
    const-string v0, "packagename"

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    invoke-virtual {v11, v12}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 722
    invoke-virtual {v10, v11}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 725
    goto :goto_0

    .line 726
    :cond_3
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 728
    const/4 v0, 0x2

    if-eq v8, v0, :cond_4

    .line 729
    const/4 v0, 0x4

    if-ne v9, v0, :cond_5

    .line 731
    :cond_4
    const-string v0, "LogUpload Service"

    const-string v1, "Begin to start the thread..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 732
    invoke-static {}, Lcom/huawei/logupload/b/a;->a()Lcom/huawei/logupload/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/logupload/f;

    .line 733
    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/logupload/f;-><init>(Lcom/huawei/logupload/LogUpload;I)V

    .line 732
    invoke-virtual {v0, v1}, Lcom/huawei/logupload/b/a;->a(Ljava/lang/Runnable;)V

    .line 734
    goto :goto_0

    .line 735
    :cond_5
    new-instance v10, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v10, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 736
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v11

    .line 737
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 738
    const-string v0, "packagename"

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    invoke-virtual {v11, v12}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 740
    invoke-virtual {v10, v11}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 745
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 752
    iput-object p1, p0, Lcom/huawei/logupload/LogUploadService;->d:Landroid/os/Handler;

    .line 753
    return-void
.end method

.method public b()Landroid/os/Handler;
    .locals 1

    .line 748
    iget-object v0, p0, Lcom/huawei/logupload/LogUploadService;->d:Landroid/os/Handler;

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 66
    const-string v0, "LogUpload Service"

    const-string v1, "onBind()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .line 72
    const-string v0, "LogUpload Service"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 75
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUploadService;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/b;->a(Landroid/app/Application;)V

    .line 76
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 80
    const-string v0, "LogUpload Service"

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 82
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 14

    .line 86
    const-string v0, "LogUpload Service"

    const-string v1, "onStartCommand()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    .line 90
    :cond_0
    const/4 v0, 0x2

    return v0

    .line 93
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 94
    const-string v0, "com.huawei.lcagent.RESUME_UPLOAD"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 95
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 96
    if-nez v5, :cond_2

    .line 97
    const/4 v0, 0x2

    return v0

    .line 99
    :cond_2
    const-string v0, "reason"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 102
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v7

    .line 108
    invoke-static {}, Lcom/huawei/logupload/c/c;->b()I

    move-result v0

    if-eqz v0, :cond_3

    .line 109
    const/4 v0, 0x2

    return v0

    .line 112
    :cond_3
    if-nez v6, :cond_4

    .line 114
    const/4 v6, 0x1

    .line 115
    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    if-ne v6, v0, :cond_5

    .line 117
    const/4 v6, 0x2

    .line 120
    :cond_5
    :goto_0
    invoke-static {v6}, Lcom/huawei/logupload/LogUploadService;->a(I)V

    .line 134
    invoke-static {v7}, Lcom/huawei/logupload/c/i;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v8

    .line 135
    invoke-static {v8}, Lcom/huawei/logupload/c/i;->a(Landroid/net/NetworkInfo;)I

    move-result v9

    .line 136
    invoke-static {v9}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 137
    invoke-static {v7}, Lcom/huawei/logupload/c/i;->f(Landroid/content/Context;)I

    move-result v10

    .line 138
    invoke-static {v10}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 139
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "netType"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    invoke-static {}, Lcom/huawei/logupload/c/c;->g()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    if-nez v0, :cond_7

    .line 148
    :cond_6
    const-string v0, "LogUpload Service"

    const-string v1, "Start to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 157
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 162
    new-instance v11, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v11, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 163
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v12

    .line 164
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 165
    const-string v0, "packagename"

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-virtual {v12, v13}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 167
    invoke-virtual {v11, v12}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 169
    const/4 v0, 0x2

    return v0

    .line 173
    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_8

    .line 174
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 175
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 176
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 174
    invoke-static {v0, v1, v2}, Lcom/huawei/logupload/c/i;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 176
    if-nez v0, :cond_8

    .line 177
    const-string v0, "LogUpload Service"

    const-string v1, "ACTION_RESUME_UPLOAD_INTENT No permission!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 179
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 180
    new-instance v11, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v11, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 181
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v12

    .line 182
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 183
    const-string v0, "packagename"

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-virtual {v12, v13}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 185
    invoke-virtual {v11, v12}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 187
    const/4 v0, 0x2

    return v0

    .line 192
    :cond_8
    invoke-static {v7}, Lcom/huawei/logupload/c/i;->g(Landroid/content/Context;)V

    .line 303
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/logupload/d;

    invoke-direct {v1, p0, v7}, Lcom/huawei/logupload/d;-><init>(Lcom/huawei/logupload/LogUploadService;Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 440
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 442
    goto/16 :goto_2

    .line 443
    :cond_9
    const-string v0, "com.huawei.lcagent.UPLOAD_REQUEST"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 444
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 445
    if-nez v5, :cond_a

    .line 446
    const/4 v0, 0x2

    return v0

    .line 448
    :cond_a
    new-instance v6, Lcom/huawei/logupload/LogUpload;

    invoke-direct {v6}, Lcom/huawei/logupload/LogUpload;-><init>()V

    .line 449
    const-string v0, "autoupload"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 450
    invoke-static {v7}, Lcom/huawei/logupload/c/c;->d(I)V

    .line 451
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "autouploadtype"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 452
    const-string v0, "alert_visible"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->a(Z)V

    .line 453
    const-string v0, "filepath"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->g(Ljava/lang/String;)V

    .line 454
    const-string v0, "id"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/logupload/LogUpload;->b(J)V

    .line 455
    const-string v0, "size"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/logupload/LogUpload;->c(J)V

    .line 456
    const-string v0, "encrypt"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->b(Z)V

    .line 457
    const-string v0, "privacy"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->c(Z)V

    .line 458
    const-string v0, "flags"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->a(I)V

    .line 459
    const-string v0, "channelId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->e(I)V

    .line 460
    const-string v0, "feedBackPackageName"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->q(Ljava/lang/String;)V

    .line 461
    const-string v0, "feedBackClassName"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->r(Ljava/lang/String;)V

    .line 462
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/logupload/LogUpload;->d(J)V

    .line 464
    const-string v0, "encryptKey"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 465
    const-string v0, "encryptKey"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->j(Ljava/lang/String;)V

    .line 476
    :cond_b
    const-string v0, "productName"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 477
    const-string v0, "productName"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->a(Ljava/lang/String;)V

    .line 479
    :cond_c
    const-string v0, "romVersion"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 480
    const-string v0, "romVersion"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->b(Ljava/lang/String;)V

    .line 483
    :cond_d
    const-string v0, "zipTime"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 484
    const-string v0, "zipTime"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->e(Ljava/lang/String;)V

    .line 487
    :cond_e
    const-string v0, "logDetailedInfo"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 488
    const-string v0, "logDetailedInfo"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x3a98

    if-gt v0, v1, :cond_f

    .line 489
    const-string v0, "logDetailedInfo"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->f(Ljava/lang/String;)V

    .line 494
    :cond_f
    const-string v0, "usertype"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_10

    .line 495
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 496
    goto :goto_1

    :cond_10
    const-string v0, "usertype"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_11

    .line 497
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 498
    goto :goto_1

    :cond_11
    const-string v0, "usertype"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_12

    .line 499
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 500
    goto :goto_1

    :cond_12
    const-string v0, "usertype"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_13

    .line 501
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 502
    goto :goto_1

    .line 503
    :cond_13
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/logupload/LogUpload;->f(I)V

    .line 505
    :goto_1
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "logUploadInfo.getUserType():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 507
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "alert_visible="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "alert_visible"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 508
    const-string v2, "; filepath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "filepath"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 509
    const-string v2, "; transactionId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 510
    const-string v2, "; size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "size"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 511
    const-string v2, "; encrypt="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "encrypt"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 512
    const-string v2, "; privacy="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "privacy"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 513
    const-string v2, "; flags="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flags"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 514
    const-string v2, "; channelId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "channelId"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 515
    const-string v2, "; feedBackPackageName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "feedBackPackageName"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 516
    const-string v2, "; feedBackClassName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "feedBackClassName"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 517
    const-string v2, "; usertype="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "usertype"

    const/4 v3, 0x1

    invoke-virtual {v5, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 518
    const-string v2, "; productName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "productName"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 519
    const-string v2, "; romVersion="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "romVersion"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 520
    const-string v2, "; zipTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "zipTime"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 521
    const-string v2, "; logDetailedInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "logDetailedInfo"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 507
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 525
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 526
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v8

    .line 525
    .line 528
    invoke-static {p0}, Lcom/huawei/logupload/c/i;->g(Landroid/content/Context;)V

    .line 537
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/logupload/e;

    invoke-direct {v1, p0, v8, v6}, Lcom/huawei/logupload/e;-><init>(Lcom/huawei/logupload/LogUploadService;Landroid/content/Context;Lcom/huawei/logupload/LogUpload;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 602
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 615
    :cond_14
    :goto_2
    const/4 v0, 0x2

    return v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 2

    .line 664
    const-string v0, "LogUpload Service"

    const-string v1, "onUnbind()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 665
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
