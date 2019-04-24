.class public Lcom/huawei/logupload/UploadReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static b:I

.field private static c:Landroid/content/Context;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const/16 v0, -0x64

    sput v0, Lcom/huawei/logupload/UploadReceiver;->b:I

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/logupload/UploadReceiver;->c:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 34
    const-string v0, "UploadReceiver"

    iput-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public static a()Landroid/content/Context;
    .locals 1

    .line 46
    sget-object v0, Lcom/huawei/logupload/UploadReceiver;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static a(I)V
    .locals 0

    .line 56
    sput p0, Lcom/huawei/logupload/UploadReceiver;->b:I

    .line 57
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .line 50
    sput-object p0, Lcom/huawei/logupload/UploadReceiver;->c:Landroid/content/Context;

    .line 51
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 63
    invoke-static {p1}, Lcom/huawei/logupload/UploadReceiver;->a(Landroid/content/Context;)V

    .line 65
    if-nez p2, :cond_0

    .line 66
    return-void

    .line 67
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 68
    return-void

    .line 70
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 84
    invoke-static {p1}, Lcom/huawei/logupload/c/i;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v3

    .line 85
    invoke-static {v3}, Lcom/huawei/logupload/c/i;->a(Landroid/net/NetworkInfo;)I

    move-result v4

    .line 86
    invoke-static {v4}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 87
    invoke-static {p1}, Lcom/huawei/logupload/c/i;->f(Landroid/content/Context;)I

    move-result v5

    .line 88
    invoke-static {v5}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 89
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

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

    .line 90
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

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

    .line 92
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "preNetStaus is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Lcom/huawei/logupload/UploadReceiver;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    sget v1, Lcom/huawei/logupload/UploadReceiver;->b:I

    if-ne v0, v1, :cond_2

    .line 94
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    const-string v1, "\u7f51\u7edc\u72b6\u6001\u548c\u4e4b\u524d\u7684\u7f51\u7edc\u72b6\u6001\u76f8\u540c\uff0c\u56e0\u6b64\u4e0d\u5904\u7406"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    return-void

    .line 98
    :cond_2
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 105
    invoke-static {}, Lcom/huawei/logupload/c/c;->g()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    if-nez v0, :cond_5

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    const-string v1, "Start to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 116
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 118
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 119
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 121
    const/16 v0, -0x64

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 128
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "myPid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    .line 131
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 132
    .line 133
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 136
    const-string v0, "exception"

    const-string v1, "1"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    const-string v0, "exception"

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    invoke-virtual {p1, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 139
    goto :goto_0

    .line 142
    :cond_4
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 146
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 152
    :goto_0
    return-void

    .line 156
    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_7

    .line 157
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 158
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 159
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 157
    invoke-static {v0, v1, v2}, Lcom/huawei/logupload/c/i;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 159
    if-nez v0, :cond_7

    .line 160
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    const-string v1, "No permission!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 162
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 163
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 164
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 165
    const/16 v0, -0x64

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/logupload/UploadReceiver;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "myPid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    .line 168
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 169
    .line 170
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    const-string v0, "exception"

    const-string v1, "1"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 173
    const-string v0, "exception"

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    invoke-virtual {p1, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 175
    goto :goto_1

    .line 178
    :cond_6
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 182
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 184
    :goto_1
    return-void

    .line 189
    :cond_7
    invoke-static {}, Lcom/huawei/logupload/c/c;->b()I

    move-result v0

    if-eqz v0, :cond_8

    .line 190
    return-void

    .line 199
    :cond_8
    invoke-static {p1}, Lcom/huawei/logupload/c/i;->g(Landroid/content/Context;)V

    .line 344
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/logupload/j;

    invoke-direct {v1, p0}, Lcom/huawei/logupload/j;-><init>(Lcom/huawei/logupload/UploadReceiver;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 598
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 622
    :cond_9
    return-void
.end method
