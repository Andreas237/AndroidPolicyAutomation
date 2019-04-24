.class public final Lcom/huawei/logupload/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"

.field private static b:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation
.end field

.field private static final c:Ljava/lang/String; = "1"

.field private static final d:Lcom/huawei/logupload/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    .line 63
    new-instance v0, Lcom/huawei/logupload/a/c;

    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    .line 63
    invoke-direct {v0, v1}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    .line 64
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(ILcom/huawei/logupload/LogUpload;)V
    .locals 13

    .line 810
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dealwithResultForresuming"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 811
    move-object v4, p1

    .line 813
    const/4 v5, -0x1

    .line 815
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 816
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 817
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 820
    const/16 v0, 0xc8

    if-eq p0, v0, :cond_2

    const/16 v0, 0x190

    if-eq p0, v0, :cond_2

    .line 821
    const/16 v0, 0x193

    if-eq p0, v0, :cond_2

    const/16 v0, 0x1fb

    if-eq p0, v0, :cond_2

    .line 824
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 825
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 824
    invoke-static {v0}, Lcom/huawei/logupload/c/i;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v7

    .line 826
    invoke-static {v7}, Lcom/huawei/logupload/c/i;->a(Landroid/net/NetworkInfo;)I

    move-result v8

    .line 827
    invoke-static {v8}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 830
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v9, v0, 0x1

    .line 831
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v10, v0, 0x2

    .line 832
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v11, v0, 0x4

    .line 833
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 834
    const-string v2, "flagWifi "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag3g "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 835
    const-string v2, "flag2g "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 833
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 836
    const/4 v0, 0x1

    if-ne v8, v0, :cond_0

    .line 837
    const/4 v0, 0x1

    if-eq v9, v0, :cond_2

    .line 838
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 839
    return-void

    .line 842
    :cond_0
    if-eqz v8, :cond_1

    .line 843
    const/4 v0, 0x2

    if-eq v10, v0, :cond_2

    .line 844
    const/4 v0, 0x4

    if-eq v11, v0, :cond_2

    .line 845
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 846
    return-void

    .line 851
    :cond_2
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_3

    .line 856
    :sswitch_0
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u53d1\u9001\u6210\u529f"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 857
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v7

    .line 858
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[0,"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 859
    invoke-virtual {v4, v9}, Lcom/huawei/logupload/LogUpload;->o(Ljava/lang/String;)V

    .line 860
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 861
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 862
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 873
    :cond_3
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 875
    goto/16 :goto_3

    .line 880
    :sswitch_1
    const-string v0, "LogUpload Service"

    const-string v1, "\u5904\u7406\u65ad\u70b9\u7eed\u4f20 \u8fd4\u56de\u503c\u4e3a201"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 882
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 883
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 884
    invoke-static {v4}, Lcom/huawei/logupload/k;->d(Lcom/huawei/logupload/LogUpload;)I

    move-result p0

    .line 885
    invoke-static {p0, v4}, Lcom/huawei/logupload/k;->a(ILcom/huawei/logupload/LogUpload;)V

    .line 886
    goto/16 :goto_3

    .line 888
    :cond_4
    const-string v10, ""

    .line 889
    sget-object v11, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v11

    .line 892
    :try_start_0
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v10

    .line 889
    monitor-exit v11

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v11

    throw v0

    .line 896
    :goto_0
    sget-object v11, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v11

    .line 899
    :try_start_1
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/a/a;->b(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v12

    .line 901
    if-nez v12, :cond_5

    .line 903
    monitor-exit v11

    goto/16 :goto_3

    .line 896
    :cond_5
    monitor-exit v11

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v11

    throw v0

    .line 907
    :goto_1
    const-string v0, "1"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 908
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ID \u4e3a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u6ca1\u6709\u6682\u505c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 909
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    .line 910
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 911
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 922
    :cond_6
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5904\u7406\u65ad\u70b9\u7eed\u4f20 \u8fd4\u56de\u503c\u4e3a201 range:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 923
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 924
    sget-object v11, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v11

    .line 927
    :try_start_2
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 924
    monitor-exit v11

    goto :goto_2

    :catchall_2
    move-exception v0

    monitor-exit v11

    throw v0

    .line 929
    :goto_2
    invoke-static {v4}, Lcom/huawei/logupload/k;->d(Lcom/huawei/logupload/LogUpload;)I

    move-result p0

    .line 930
    invoke-static {p0, v4}, Lcom/huawei/logupload/k;->a(ILcom/huawei/logupload/LogUpload;)V

    .line 932
    goto/16 :goto_3

    .line 933
    :cond_7
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ID \u4e3a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u5df2\u6682\u505c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 934
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 935
    const-string v0, "1"

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 938
    goto/16 :goto_3

    .line 941
    :sswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_8

    .line 942
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 943
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 944
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 945
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v2

    .line 946
    invoke-virtual {v2}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 942
    invoke-static {v0, v1, v2}, Lcom/huawei/logupload/c/i;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 946
    if-nez v0, :cond_8

    .line 947
    const-string v0, "LogUpload Service"

    const-string v1, "No permission!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 948
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 949
    goto/16 :goto_3

    .line 952
    :cond_8
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->I()I

    move-result v11

    .line 953
    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v4, v11}, Lcom/huawei/logupload/LogUpload;->g(I)V

    .line 954
    const/4 v0, 0x3

    if-gt v11, v0, :cond_9

    .line 955
    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 956
    invoke-static {v4}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 957
    goto/16 :goto_3

    .line 962
    :cond_9
    const-string v0, "LogUpload Service"

    const-string v1, "dealwithResultForresuming \u91cd\u8bd5\u7684\u6b21\u6570\u8d85\u8fc73\u6b21"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 965
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 967
    goto/16 :goto_3

    .line 977
    :sswitch_3
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u8fd4\u56de\u503c\u4e3aresult =="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 979
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 980
    goto/16 :goto_3

    .line 986
    :sswitch_4
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u9274\u6743\u5931\u8d25\uff0c\u9700\u8981\u91cd\u65b0\u83b7\u53d6\u9274\u6743"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 987
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->d(Z)V

    .line 989
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v5

    .line 990
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Lcom/huawei/logupload/LogUpload;->h(I)V

    .line 991
    const/16 v0, 0xf

    if-gt v5, v0, :cond_a

    .line 992
    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 993
    invoke-static {v4}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 996
    goto/16 :goto_3

    .line 998
    :cond_a
    const-string v0, "LogUpload Service"

    const-string v1, "dealwithResultForresuming 401"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 999
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1002
    goto/16 :goto_3

    .line 1006
    :sswitch_5
    const-string v0, "LogUpload Service"

    const-string v1, "\u670d\u52a1\u5668\u8d85\u65f6\uff0c\u91cd\u8fde"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1007
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v5

    .line 1008
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Lcom/huawei/logupload/LogUpload;->h(I)V

    .line 1010
    const/16 v0, 0xf

    if-gt v5, v0, :cond_b

    .line 1013
    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 1014
    invoke-static {v4}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 1015
    goto/16 :goto_3

    .line 1017
    :cond_b
    const-string v0, "LogUpload Service"

    const-string v1, "dealwithResultForresuming 408"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1018
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1021
    goto :goto_3

    .line 1029
    :sswitch_6
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u670d\u52a1\u5668\u9519\u8bef\uff0c5\u5206\u949f\u91cd\u8bd5"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1031
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v5

    .line 1032
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Lcom/huawei/logupload/LogUpload;->h(I)V

    .line 1033
    const/16 v0, 0xf

    if-gt v5, v0, :cond_c

    .line 1034
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->e(Z)V

    .line 1035
    new-instance v12, Ljava/util/Timer;

    invoke-direct {v12}, Ljava/util/Timer;-><init>()V

    .line 1036
    new-instance v0, Lcom/huawei/logupload/m;

    invoke-direct {v0, v12, v4}, Lcom/huawei/logupload/m;-><init>(Ljava/util/Timer;Lcom/huawei/logupload/LogUpload;)V

    .line 1036
    .line 1047
    const-wide/32 v1, 0x493e0

    invoke-virtual {v12, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 1048
    goto :goto_3

    .line 1049
    :cond_c
    const-string v0, "LogUpload Service"

    const-string v1, "dealwithResultForresuming 500,502"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1050
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1053
    .line 1058
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3 -> :sswitch_2
        0xc8 -> :sswitch_0
        0xc9 -> :sswitch_1
        0x190 -> :sswitch_3
        0x191 -> :sswitch_4
        0x193 -> :sswitch_3
        0x198 -> :sswitch_5
        0x1f4 -> :sswitch_6
        0x1f6 -> :sswitch_6
        0x1fb -> :sswitch_3
    .end sparse-switch
.end method

.method public static a(Lcom/huawei/logupload/LogUpload;)V
    .locals 18

    .line 67
    move-object/from16 v4, p0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 74
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->d(I)V

    .line 75
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->e(Z)V

    .line 77
    const-string v0, "LogUpload Service"

    const-string v1, "logUploadRequest start =================-!!-"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    new-instance v8, Ljava/net/URL;

    const-string v0, "https://logservice.vmall.com:443/osg/logServerAction!addLogServer.htm"

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-static {}, Lcom/huawei/logupload/c/i;->c()V

    .line 107
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljavax/net/ssl/HttpsURLConnection;

    .line 108
    const-string v0, "POST"

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 110
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 111
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 115
    const-string v0, "Connection"

    const-string v1, "close"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v0, "Content-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data;boundary=---------------------------40612316912668"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const v0, 0x1d4c0

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 122
    const v0, 0x1d4c0

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 124
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 128
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 131
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    const-string v0, "deviceType"

    .line 133
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->a()Ljava/lang/String;

    move-result-object v1

    .line 132
    .line 134
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 135
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u8bbe\u5907\u578b\u53f7"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    goto :goto_0

    .line 138
    :cond_0
    const-string v0, "deviceType"

    .line 139
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 138
    .line 140
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 141
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u8bbe\u5907\u578b\u53f7"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    :goto_0
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    const-string v0, "sysVersion"

    .line 146
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->b()Ljava/lang/String;

    move-result-object v1

    .line 145
    .line 147
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 148
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u7cfb\u7edf\u7248\u672c\u53f7"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    goto :goto_1

    .line 151
    :cond_1
    const-string v0, "sysVersion"

    .line 152
    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 151
    .line 153
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 154
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u7cfb\u7edf\u7248\u672c\u53f7"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    :goto_1
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 184
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 183
    invoke-static {v0}, Lcom/huawei/logupload/c/i;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 186
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    const-string v10, "000000000000000"

    .line 190
    :cond_2
    const-string v0, "deviceID"

    .line 190
    .line 191
    .line 192
    invoke-static {v0, v10, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 194
    const-string v0, "channelId"

    .line 195
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 194
    .line 196
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 197
    const-string v0, "LogUpload Service"

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    const-string v0, "os"

    .line 200
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 199
    .line 201
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 202
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u64cd\u4f5c\u7248\u672c"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 206
    if-eqz v11, :cond_3

    const-string v0, ""

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 207
    const-string v0, "LogUpload Service"

    const-string v1, "imsi\u4e3a\u7a7a"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    :cond_3
    if-eqz v11, :cond_4

    const-string v0, ""

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_4

    .line 210
    const-string v0, "imsi"

    .line 211
    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v11, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 210
    .line 212
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 216
    :cond_4
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->l()Z

    move-result v0

    if-nez v0, :cond_5

    .line 217
    const-string v0, "encryptType"

    .line 218
    const-string v1, "0"

    .line 217
    .line 219
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 220
    goto :goto_2

    .line 222
    :cond_5
    const-string v0, "encryptType"

    .line 223
    const-string v1, "1"

    .line 222
    .line 224
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 227
    :goto_2
    const-string v0, "sensitiveContain"

    .line 228
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->r()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    .line 227
    .line 229
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 231
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v12

    .line 232
    if-eqz v12, :cond_6

    const-string v0, ""

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 233
    const-string v0, "fileName"

    .line 234
    const-string v1, "/"

    invoke-virtual {v12, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v12, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 233
    .line 235
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 236
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "fileName"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "/"

    invoke-virtual {v12, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v12, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    :cond_6
    const-string v0, "size"

    .line 241
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    .line 240
    .line 242
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 248
    const-string v0, "version"

    .line 249
    const-string v1, "4"

    .line 248
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 250
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getUserType():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 253
    const-string v0, "logType"

    .line 254
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 253
    .line 255
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 256
    goto :goto_3

    .line 257
    :cond_7
    const-string v0, "logType"

    .line 258
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 257
    .line 259
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 263
    :goto_3
    const-string v0, "zipTime"

    .line 264
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->e()Ljava/lang/String;

    move-result-object v1

    .line 263
    .line 265
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 266
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getZipTime():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    const-string v0, "logDetailInfo"

    .line 270
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->f()Ljava/lang/String;

    move-result-object v1

    .line 269
    .line 271
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 272
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getLogDetailInfo():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_a

    .line 276
    :cond_8
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->x()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 277
    const-string v0, "refresh"

    .line 278
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    .line 277
    .line 279
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 280
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->d(Z)V

    .line 282
    :cond_9
    const-string v0, "LogUpload Service"

    const-string v1, "\u5e26\u6709refresh"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 286
    :cond_a
    invoke-static {}, Lcom/huawei/logupload/c/i;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 287
    invoke-static {}, Lcom/huawei/logupload/c/i;->h()Ljava/lang/String;

    move-result-object v13

    .line 288
    const-string v0, "sign"

    invoke-static {v0, v13, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 293
    :cond_b
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 295
    const-string v0, "encryptKey"

    .line 296
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/logupload/c/a/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 295
    invoke-static {v0, v1, v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I

    .line 299
    :cond_c
    const-string v0, "LogUpload Service"

    const-string v1, "UploadFile.addEndField(dos)"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    invoke-static {v5}, Lcom/huawei/logupload/i;->a(Ljava/lang/Object;)I

    .line 302
    const-string v0, "LogUpload Service"

    const-string v1, "dos.flush()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    :try_start_1
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 308
    goto :goto_4

    :catch_0
    move-exception v13

    .line 309
    const-string v0, "LogUpload Service"

    const-string v1, "dos close is failed "

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    :goto_4
    const-string v0, "LogUpload Service"

    const-string v1, "urlConnection.getInputStream()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 314
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    move-object v13, v0

    .line 315
    const/16 v0, 0x400

    new-array v14, v0, [B

    .line 316
    const/4 v15, 0x0

    .line 319
    :goto_5
    invoke-virtual {v6, v14}, Ljava/io/InputStream;->read([B)I

    move-result v15

    .line 320
    const/4 v0, -0x1

    if-ne v0, v15, :cond_d

    .line 323
    const-string v0, "LogUpload Service"

    const-string v1, "\u8bfb\u53d6\u5b8c\u6bd5"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    goto :goto_6

    .line 328
    :cond_d
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    const/4 v2, 0x0

    invoke-direct {v0, v14, v2, v15, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 317
    goto :goto_5

    .line 332
    :goto_6
    invoke-virtual {v13}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 334
    goto/16 :goto_8

    .line 335
    :catch_1
    move-exception v8

    .line 337
    const-string v0, "LogUpload Service"

    const-string v1, "logUploadRequest RuntimeException"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 342
    invoke-virtual {v8}, Ljava/lang/RuntimeException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 361
    const-string v0, "LogUpload Service"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 363
    if-eqz v5, :cond_10

    .line 364
    :try_start_4
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 366
    goto/16 :goto_9

    :catch_2
    move-exception v17

    .line 367
    const-string v0, "LogUpload Service"

    const-string v1, "dos close is failed "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    .line 345
    :catch_3
    move-exception v8

    .line 347
    const-string v0, "LogUpload Service"

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "logUploadRequest \u65e5\u5fd7\u5206\u53d1\u670d\u52a1\u5668\u8bf7\u6c42\u8d85\u65f6"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lorg/apache/http/conn/ConnectTimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->A()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_e

    .line 350
    invoke-static {v4}, Lcom/huawei/logupload/k;->c(Lcom/huawei/logupload/LogUpload;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 361
    :cond_e
    const-string v0, "LogUpload Service"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 363
    if-eqz v5, :cond_10

    .line 364
    :try_start_6
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 366
    goto/16 :goto_9

    :catch_4
    move-exception v17

    .line 367
    const-string v0, "LogUpload Service"

    const-string v1, "dos close is failed "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    .line 353
    :catch_5
    move-exception v8

    .line 356
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 357
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "logUploadRequest Exception"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 361
    const-string v0, "LogUpload Service"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 363
    if-eqz v5, :cond_10

    .line 364
    :try_start_8
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 366
    goto :goto_9

    :catch_6
    move-exception v17

    .line 367
    const-string v0, "LogUpload Service"

    const-string v1, "dos close is failed "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    .line 360
    :catchall_0
    move-exception v16

    .line 361
    const-string v0, "LogUpload Service"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 363
    if-eqz v5, :cond_f

    .line 364
    :try_start_9
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 366
    goto :goto_7

    :catch_7
    move-exception v17

    .line 367
    const-string v0, "LogUpload Service"

    const-string v1, "dos close is failed "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    :cond_f
    :goto_7
    throw v16

    .line 361
    :goto_8
    const-string v0, "LogUpload Service"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 363
    if-eqz v5, :cond_10

    .line 364
    :try_start_a
    invoke-virtual {v5}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 366
    goto :goto_9

    :catch_8
    move-exception v17

    .line 367
    const-string v0, "LogUpload Service"

    const-string v1, "dos close is failed "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 372
    :cond_10
    :goto_9
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 374
    if-eqz v7, :cond_11

    .line 376
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 380
    :cond_11
    new-instance v8, Lcom/huawei/logupload/o;

    invoke-direct {v8}, Lcom/huawei/logupload/o;-><init>()V

    .line 382
    invoke-virtual {v8, v7}, Lcom/huawei/logupload/o;->a(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {v8}, Lcom/huawei/logupload/o;->a()I

    move-result v0

    if-nez v0, :cond_20

    .line 384
    const-string v0, "LogUpload Service"

    const-string v1, "\u65e5\u5fd7\u5206\u53d1\u670d\u52a1\u5668\u7ed3\u679c\u89e3\u6790\u6b63\u786e"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 387
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_12

    .line 388
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 389
    const-string v0, "AppLogApi"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u65e5\u5fd7\u5206setAutoCheckTime"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 390
    invoke-static {}, Lcom/huawei/logupload/a/b;->a()Lcom/huawei/logupload/a/b;

    move-result-object v0

    invoke-virtual {v0, v9, v10}, Lcom/huawei/logupload/a/b;->a(J)V

    .line 391
    goto :goto_a

    .line 392
    :cond_12
    const-string v0, "AppLogApi"

    const-string v1, "setAutoCheckTime CommonConstants.getAutoUploadType()!=1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 394
    :goto_a
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->b()Ljava/lang/String;

    move-result-object v9

    .line 395
    if-eqz v9, :cond_16

    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 396
    const-string v0, "uploadperiod"

    invoke-virtual {v9, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 397
    const-string v10, ""

    .line 398
    const-string v0, "\\|"

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 399
    array-length v12, v11

    .line 400
    const/4 v13, 0x0

    goto :goto_b

    .line 401
    :cond_13
    aget-object v14, v11, v13

    .line 402
    const-string v0, "uploadperiod"

    invoke-virtual {v14, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 403
    const-string v0, "="

    invoke-virtual {v14, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v15

    .line 404
    array-length v0, v15

    const/4 v1, 0x1

    if-le v0, v1, :cond_14

    .line 405
    array-length v0, v15

    add-int/lit8 v0, v0, -0x1

    aget-object v10, v15, v0

    .line 400
    :cond_14
    add-int/lit8 v13, v13, 0x1

    :goto_b
    if-lt v13, v12, :cond_13

    .line 410
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 411
    const-string v0, "AppLogApi"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "period"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Integer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    invoke-static {}, Lcom/huawei/logupload/a/b;->a()Lcom/huawei/logupload/a/b;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/a/b;->a(I)V

    .line 415
    :cond_15
    const-string v0, "autoUploadInternalSwitch=false"

    invoke-virtual {v9, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 416
    invoke-virtual {v4, v9}, Lcom/huawei/logupload/LogUpload;->h(Ljava/lang/String;)V

    .line 417
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "policy\u5b58\u5728\uff0c\u5c06policy\u4fe1\u606f\u53d1\u9001\u7ed9\u670d\u52a1\u5668 ="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 419
    return-void

    .line 433
    :cond_16
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->c()Ljava/lang/String;

    move-result-object v10

    .line 434
    if-eqz v10, :cond_17

    const-string v0, ""

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 435
    invoke-virtual {v4, v10}, Lcom/huawei/logupload/LogUpload;->i(Ljava/lang/String;)V

    .line 447
    :cond_17
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 450
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->d()Ljava/lang/String;

    move-result-object v11

    .line 457
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_19

    .line 458
    invoke-static {v11}, Lcom/huawei/logupload/c/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 459
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 460
    invoke-virtual {v4, v12}, Lcom/huawei/logupload/LogUpload;->j(Ljava/lang/String;)V

    .line 461
    goto :goto_c

    .line 462
    :cond_18
    invoke-virtual {v4, v11}, Lcom/huawei/logupload/LogUpload;->j(Ljava/lang/String;)V

    .line 464
    goto :goto_c

    .line 465
    :cond_19
    invoke-virtual {v4, v11}, Lcom/huawei/logupload/LogUpload;->j(Ljava/lang/String;)V

    .line 469
    :goto_c
    if-eqz v11, :cond_1b

    const-string v0, ""

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    .line 470
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1b

    .line 471
    const-string v0, "LogUpload Service"

    const-string v1, "\u5bf9\u6587\u4ef6\u8fdb\u884c\u52a0\u5bc6\u5904\u7406"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 473
    new-instance v12, Ljava/io/File;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 474
    invoke-static {v12, v11}, Lcom/huawei/logupload/c/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v13

    .line 476
    if-eqz v13, :cond_1b

    .line 477
    invoke-virtual {v13}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->p(Ljava/lang/String;)V

    .line 480
    goto :goto_d

    .line 481
    :cond_1a
    const-string v0, "LogUpload Service"

    const-string v1, "--\u6587\u4ef6\u4e0d\u52a0\u5bc6-->>"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    new-instance v11, Ljava/io/File;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 484
    invoke-virtual {v11}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->p(Ljava/lang/String;)V

    .line 487
    :cond_1b
    :goto_d
    sget-object v11, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v11

    .line 488
    :try_start_b
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 487
    monitor-exit v11

    goto :goto_e

    :catchall_1
    move-exception v0

    monitor-exit v11

    throw v0

    .line 491
    :goto_e
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->e()Ljava/lang/String;

    move-result-object v11

    .line 492
    if-eqz v11, :cond_1c

    .line 493
    invoke-virtual {v4, v11}, Lcom/huawei/logupload/LogUpload;->k(Ljava/lang/String;)V

    .line 496
    :cond_1c
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->g()Ljava/lang/String;

    move-result-object v12

    .line 497
    if-eqz v12, :cond_1d

    .line 498
    invoke-virtual {v4, v12}, Lcom/huawei/logupload/LogUpload;->m(Ljava/lang/String;)V

    .line 501
    :cond_1d
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->f()Ljava/lang/String;

    move-result-object v13

    .line 502
    if-eqz v13, :cond_1e

    .line 503
    invoke-virtual {v4, v13}, Lcom/huawei/logupload/LogUpload;->l(Ljava/lang/String;)V

    .line 506
    :cond_1e
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->h()Ljava/lang/String;

    move-result-object v14

    .line 507
    if-eqz v14, :cond_1f

    .line 508
    invoke-virtual {v4, v14}, Lcom/huawei/logupload/LogUpload;->n(Ljava/lang/String;)V

    .line 511
    :cond_1f
    sget-object v15, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v15

    .line 514
    :try_start_c
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 511
    monitor-exit v15

    goto :goto_f

    :catchall_2
    move-exception v0

    monitor-exit v15

    throw v0

    .line 518
    :goto_f
    invoke-static {v4}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 519
    goto/16 :goto_13

    .line 520
    :cond_20
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_25

    .line 523
    const-string v0, "LogUpload Service"

    const-string v1, "\u65e5\u5fd7\u5206\u53d1\u670d\u52a1\u5668\u9274\u6743\u5931\u8d25"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 524
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 534
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->D()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 535
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_21

    .line 536
    const-string v0, "LogUpload Service"

    const-string v1, "*****Beta Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 537
    goto :goto_10

    :cond_21
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    .line 538
    const-string v0, "LogUpload Service"

    const-string v1, "*****Fans Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 539
    goto :goto_10

    :cond_22
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_23

    .line 540
    const-string v0, "LogUpload Service"

    const-string v1, "*****Dev Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 541
    goto :goto_10

    :cond_23
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_24

    .line 542
    const-string v0, "LogUpload Service"

    const-string v1, "*****FEEDBACK Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 544
    :cond_24
    :goto_10
    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_2c

    .line 545
    new-instance v9, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 546
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v10

    .line 547
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 548
    const-string v0, "packagename"

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    invoke-virtual {v10, v11}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 550
    invoke-virtual {v9, v10}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 555
    goto/16 :goto_13

    .line 556
    :cond_25
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_26

    .line 560
    const-string v0, "LogUpload Service"

    const-string v1, "\u8fd4\u56de\u503c\u7ed3\u679c\u4e3a2"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 562
    new-instance v9, Ljava/util/Timer;

    invoke-direct {v9}, Ljava/util/Timer;-><init>()V

    .line 563
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->e(Z)V

    .line 564
    new-instance v0, Lcom/huawei/logupload/l;

    invoke-direct {v0, v9, v4}, Lcom/huawei/logupload/l;-><init>(Ljava/util/Timer;Lcom/huawei/logupload/LogUpload;)V

    .line 564
    .line 571
    const-wide/32 v1, 0x493e0

    invoke-virtual {v9, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 572
    goto/16 :goto_13

    :cond_26
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->a()I

    move-result v0

    const/16 v1, 0x3ea

    if-ne v1, v0, :cond_28

    .line 574
    const-string v0, "LogUpload Service"

    const-string v1, "\u8fd4\u56de\u503c\u7ed3\u679c\u4e3a1002"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 580
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 581
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 582
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 584
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v10

    .line 585
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[0,"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 586
    invoke-virtual {v4, v12}, Lcom/huawei/logupload/LogUpload;->o(Ljava/lang/String;)V

    .line 587
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_27

    .line 588
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v9, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 589
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 590
    goto :goto_11

    .line 594
    :cond_27
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object v13, v0

    .line 595
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 597
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 598
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 600
    :goto_11
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 601
    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_2c

    .line 602
    new-instance v0, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    move-object v13, v0

    .line 603
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v14

    .line 604
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    move-object v15, v0

    .line 605
    const-string v0, "packagename"

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    invoke-virtual {v14, v15}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 607
    invoke-virtual {v13, v14}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 610
    goto/16 :goto_13

    :cond_28
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->a()I

    move-result v0

    const v1, 0x49bb4

    if-ne v1, v0, :cond_2a

    .line 611
    const-string v0, "LogUpload Service"

    const-string v1, "Model is not supported upload"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 612
    invoke-virtual {v8}, Lcom/huawei/logupload/o;->b()Ljava/lang/String;

    move-result-object v9

    .line 613
    if-eqz v9, :cond_29

    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    .line 614
    invoke-virtual {v4, v9}, Lcom/huawei/logupload/LogUpload;->h(Ljava/lang/String;)V

    .line 616
    :cond_29
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 617
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->D()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 618
    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_2c

    .line 619
    new-instance v10, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v10, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 620
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v11

    .line 621
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 622
    const-string v0, "packagename"

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 623
    invoke-virtual {v11, v12}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 624
    invoke-virtual {v10, v11}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 629
    goto/16 :goto_13

    .line 636
    :cond_2a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 637
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2b

    .line 639
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 640
    .line 641
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 642
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 643
    const-string v0, "exception"

    const-string v1, "2"

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 644
    const-string v0, "exception"

    const-string v1, "2"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 645
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v9, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 646
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 648
    goto :goto_12

    .line 652
    :cond_2b
    new-instance v9, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 653
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 655
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 656
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 658
    :goto_12
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->D()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 659
    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_2c

    .line 660
    new-instance v9, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 661
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v10

    .line 662
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 663
    const-string v0, "packagename"

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    invoke-virtual {v10, v11}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 665
    invoke-virtual {v9, v10}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 672
    :cond_2c
    :goto_13
    return-void
.end method

.method static a(Lcom/huawei/logupload/LogUpload;Z)V
    .locals 8

    .line 1458
    move-object v4, p0

    .line 1459
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "deleteTaskAndReport"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mLogUploadInfo.getTaskId()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1461
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 1462
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 1463
    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 1461
    .line 1466
    invoke-static {v4}, Lcom/huawei/logupload/c/i;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 1470
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v6

    .line 1471
    const-string v0, "com.huawei.lcagent"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1472
    const-string v0, "com.huawei.hidp"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1473
    const-string v0, "com.huawei.imonitor"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1474
    :cond_0
    invoke-static {v5, v4, p1}, Lcom/huawei/logupload/c/i;->a(Landroid/content/Context;Lcom/huawei/logupload/LogUpload;Z)V

    .line 1475
    goto :goto_0

    .line 1477
    :cond_1
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 1478
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 1480
    invoke-virtual {v7, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1481
    const-string v0, "com.example.logupload.progressSmall"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1482
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1483
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v7, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1484
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 1485
    goto :goto_0

    .line 1488
    :cond_2
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1489
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1491
    const-string v0, "isuploadsuccess"

    invoke-virtual {v7, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1492
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1498
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1499
    sget-object v7, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v7

    .line 1501
    :try_start_0
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    invoke-static {v0, v4}, Lcom/huawei/logupload/a/a;->b(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1499
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v7

    throw v0

    .line 1503
    :goto_1
    sget-object v7, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v7

    .line 1505
    :try_start_1
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    invoke-static {v0}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1503
    monitor-exit v7

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-exit v7

    throw v0

    .line 1508
    :goto_2
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lstUploadInfo.size()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1510
    return-void
.end method

.method public static a()Z
    .locals 8

    .line 1524
    sget-object v5, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v5

    .line 1526
    :try_start_0
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    invoke-static {v0}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1524
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    .line 1529
    :goto_0
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lstUploadInfo.size()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1531
    sget-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1532
    const/4 v5, 0x0

    goto :goto_1

    .line 1533
    :cond_0
    sget-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v6

    .line 1534
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "taskId"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1535
    const-string v2, "CommonConstants.getTaskList().get(taskId+\"\"):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1536
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1534
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1541
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1542
    const/4 v0, 0x1

    return v0

    .line 1532
    :cond_1
    add-int/lit8 v5, v5, 0x1

    :goto_1
    sget-object v0, Lcom/huawei/logupload/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v5, v0, :cond_0

    .line 1550
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static b(ILcom/huawei/logupload/LogUpload;)V
    .locals 18

    .line 1066
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dealwithResult"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1067
    move-object/from16 v4, p1

    .line 1068
    const/4 v5, -0x1

    .line 1072
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 1073
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 1072
    invoke-static {v0}, Lcom/huawei/logupload/c/i;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v6

    .line 1074
    invoke-static {v6}, Lcom/huawei/logupload/c/i;->a(Landroid/net/NetworkInfo;)I

    move-result v7

    .line 1075
    invoke-static {v7}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 1078
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v8, v0, 0x1

    .line 1079
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v9, v0, 0x2

    .line 1080
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v10, v0, 0x4

    .line 1081
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1082
    const-string v2, "flagWifi "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag3g "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1083
    const-string v2, "flag2g "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1081
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1084
    const/4 v11, 0x0

    .line 1085
    new-instance v12, Landroid/content/Intent;

    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    .line 1086
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1087
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1088
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 1090
    :sswitch_0
    const/4 v11, 0x1

    .line 1095
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u53d1\u9001\u6210\u529f"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1097
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v13

    .line 1098
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[0,"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 1099
    invoke-virtual {v4, v15}, Lcom/huawei/logupload/LogUpload;->o(Ljava/lang/String;)V

    .line 1100
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 1101
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v12, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1102
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 1113
    :cond_0
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 1115
    goto/16 :goto_1

    .line 1118
    :sswitch_1
    const/4 v11, 0x1

    .line 1121
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v0

    const-wide/32 v2, 0xfa000

    cmp-long v0, v0, v2

    if-gez v0, :cond_12

    .line 1122
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 1124
    goto/16 :goto_1

    .line 1128
    :sswitch_2
    const/4 v0, 0x1

    if-ne v7, v0, :cond_1

    .line 1129
    const/4 v0, 0x1

    if-eq v8, v0, :cond_3

    .line 1130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1131
    goto/16 :goto_1

    .line 1134
    :cond_1
    if-eqz v7, :cond_2

    .line 1135
    const/4 v0, 0x2

    if-eq v9, v0, :cond_3

    .line 1136
    const/4 v0, 0x4

    if-eq v10, v0, :cond_3

    .line 1137
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1138
    goto/16 :goto_1

    .line 1141
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_4

    .line 1142
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 1143
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1144
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1145
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v2

    .line 1146
    invoke-virtual {v2}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 1142
    invoke-static {v0, v1, v2}, Lcom/huawei/logupload/c/i;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 1146
    if-nez v0, :cond_4

    .line 1147
    const-string v0, "LogUpload Service"

    const-string v1, "No permission!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1149
    goto/16 :goto_1

    .line 1152
    :cond_4
    const/4 v11, 0x1

    .line 1153
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->I()I

    move-result v16

    .line 1154
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "timeReconect:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1155
    add-int/lit8 v16, v16, 0x1

    move/from16 v0, v16

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->g(I)V

    .line 1156
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "timeReconect "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mLogUploadInfo.getTimeReconnect() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1157
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->I()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1156
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1158
    move/from16 v0, v16

    const/4 v1, 0x3

    if-gt v0, v1, :cond_5

    .line 1159
    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 1160
    invoke-static {v4}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 1161
    goto/16 :goto_1

    .line 1167
    :cond_5
    const-string v0, "LogUpload Service"

    const-string v1, "dealwithResult \u91cd\u8bd5\u7684\u6b21\u6570\u8d85\u8fc73\u6b21"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1172
    goto/16 :goto_1

    .line 1177
    :sswitch_3
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1178
    const/4 v0, 0x1

    if-ne v7, v0, :cond_6

    .line 1179
    const/4 v0, 0x1

    if-eq v8, v0, :cond_8

    .line 1180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1181
    goto/16 :goto_1

    .line 1184
    :cond_6
    if-eqz v7, :cond_7

    .line 1185
    const/4 v0, 0x2

    if-eq v9, v0, :cond_8

    .line 1186
    const/4 v0, 0x4

    if-eq v10, v0, :cond_8

    .line 1187
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1188
    goto/16 :goto_1

    .line 1199
    :cond_8
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v5

    .line 1200
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Lcom/huawei/logupload/LogUpload;->h(I)V

    .line 1201
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u9274\u6743\u5931\u8d25\uff0c\u9700\u8981\u91cd\u65b0\u83b7\u53d6\u9274\u6743"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1202
    const/16 v0, 0xf

    if-gt v5, v0, :cond_9

    .line 1203
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->d(Z)V

    .line 1204
    const/4 v11, 0x1

    .line 1205
    invoke-static {v4}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 1206
    goto/16 :goto_1

    .line 1208
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1211
    goto/16 :goto_1

    .line 1214
    :sswitch_4
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1216
    const/4 v0, 0x1

    if-ne v7, v0, :cond_a

    .line 1217
    const/4 v0, 0x1

    if-eq v8, v0, :cond_c

    .line 1218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1219
    goto/16 :goto_1

    .line 1222
    :cond_a
    if-eqz v7, :cond_b

    .line 1223
    const/4 v0, 0x2

    if-eq v9, v0, :cond_c

    .line 1224
    const/4 v0, 0x4

    if-eq v10, v0, :cond_c

    .line 1225
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1226
    goto/16 :goto_1

    .line 1229
    :cond_c
    const/4 v11, 0x1

    .line 1231
    const-string v0, "LogUpload Service"

    const-string v1, "\u670d\u52a1\u5668\u8d85\u65f6\uff0c\u91cd\u8fde"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1234
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v5

    .line 1235
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Lcom/huawei/logupload/LogUpload;->h(I)V

    .line 1236
    const/16 v0, 0xf

    if-gt v5, v0, :cond_d

    .line 1238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/String;I)V

    .line 1240
    invoke-static {v4}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 1241
    goto/16 :goto_1

    .line 1243
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1246
    goto/16 :goto_1

    .line 1251
    :sswitch_5
    const/4 v0, 0x1

    if-ne v7, v0, :cond_e

    .line 1252
    const/4 v0, 0x1

    if-eq v8, v0, :cond_10

    .line 1253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1254
    goto/16 :goto_1

    .line 1257
    :cond_e
    if-eqz v7, :cond_f

    .line 1258
    const/4 v0, 0x2

    if-eq v9, v0, :cond_10

    .line 1259
    const/4 v0, 0x4

    if-eq v10, v0, :cond_10

    .line 1260
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1261
    goto/16 :goto_1

    .line 1264
    :cond_10
    const/4 v11, 0x1

    .line 1269
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u670d\u52a1\u5668\u9519\u8bef\uff0c5\u5206\u949f\u91cd\u8bd5"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1271
    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v5

    .line 1272
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Lcom/huawei/logupload/LogUpload;->h(I)V

    .line 1273
    const/16 v0, 0xf

    if-gt v5, v0, :cond_11

    .line 1274
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/logupload/LogUpload;->e(Z)V

    .line 1275
    new-instance v17, Ljava/util/Timer;

    invoke-direct/range {v17 .. v17}, Ljava/util/Timer;-><init>()V

    .line 1276
    new-instance v0, Lcom/huawei/logupload/n;

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v4}, Lcom/huawei/logupload/n;-><init>(Ljava/util/Timer;Lcom/huawei/logupload/LogUpload;)V

    .line 1276
    .line 1287
    move-object/from16 v1, v17

    const-wide/32 v2, 0x493e0

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 1288
    goto :goto_1

    .line 1290
    :cond_11
    const-string v0, "LogUpload Service"

    const-string v1, "dealwithResultForresuming 500,502"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1291
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1294
    goto :goto_1

    .line 1298
    :sswitch_6
    const/4 v11, 0x1

    .line 1303
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u8fd4\u56de\u503c\u4e3aresult =="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1304
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 1305
    goto :goto_1

    .line 1309
    :goto_0
    if-nez v11, :cond_12

    .line 1310
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1314
    :cond_12
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3 -> :sswitch_2
        -0x1 -> :sswitch_1
        0xc8 -> :sswitch_0
        0x190 -> :sswitch_6
        0x191 -> :sswitch_3
        0x193 -> :sswitch_3
        0x198 -> :sswitch_4
        0x1f4 -> :sswitch_5
        0x1f6 -> :sswitch_5
        0x1fb -> :sswitch_6
    .end sparse-switch
.end method

.method public static b(Lcom/huawei/logupload/LogUpload;)V
    .locals 12

    .line 686
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getTimeReconnect()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->I()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 687
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getTimeReconnect()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->J()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 689
    const/4 v4, -0x1

    .line 691
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/LogUpload;->d(I)V

    .line 692
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/LogUpload;->e(Z)V

    .line 694
    const-string v0, "LogUpload Service"

    const-string v1, "prepareUpload"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 695
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v0

    const-wide/32 v2, 0xfa000

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 696
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 698
    const-string v0, "LogUpload Service"

    const-string v1, "prepareUpload \u5c0f\u6587\u4ef6\u4e0a\u4f20"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 699
    sget-object v5, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v5

    .line 702
    :try_start_0
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 699
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0

    .line 705
    :goto_0
    invoke-static {p0}, Lcom/huawei/logupload/k;->d(Lcom/huawei/logupload/LogUpload;)I

    move-result v4

    .line 706
    invoke-static {v4, p0}, Lcom/huawei/logupload/k;->b(ILcom/huawei/logupload/LogUpload;)V

    .line 707
    goto :goto_2

    .line 714
    :cond_0
    const-string v0, "LogUpload Service"

    const-string v1, "prepareUpload \u5927\u6587\u4ef6\u4e0a\u4f20"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 717
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u6b64\u65f6type\u503c\u4e3a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 718
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 720
    const-string v0, "LogUpload Service"

    const-string v1, "mLogUploadInfo.setType(2)"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    sget-object v5, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v5

    .line 724
    :try_start_1
    sget-object v0, Lcom/huawei/logupload/k;->d:Lcom/huawei/logupload/a/c;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 721
    monitor-exit v5

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    .line 726
    :goto_1
    invoke-static {p0}, Lcom/huawei/logupload/k;->d(Lcom/huawei/logupload/LogUpload;)I

    move-result v4

    .line 727
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "result = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 729
    invoke-static {v4, p0}, Lcom/huawei/logupload/k;->a(ILcom/huawei/logupload/LogUpload;)V

    .line 732
    :goto_2
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v5

    .line 733
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v6

    .line 734
    const/4 v8, 0x0

    .line 736
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 738
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 739
    const/4 v0, 0x1

    aget-object v0, v9, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 740
    const/4 v0, 0x1

    aget-object v0, v9, v0

    .line 741
    const/4 v1, 0x1

    aget-object v1, v9, v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 740
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 743
    :cond_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 744
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 745
    const/4 v8, 0x1

    .line 746
    goto :goto_3

    .line 747
    :cond_2
    const/4 v8, 0x0

    .line 749
    goto :goto_3

    .line 750
    :cond_3
    const/4 v8, 0x0

    .line 753
    goto :goto_3

    .line 754
    :cond_4
    const/4 v8, 0x0

    .line 757
    :goto_3
    const-string v0, "1"

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    if-nez v8, :cond_6

    .line 758
    const-string v0, "LogUpload Service"

    const-string v1, "\u4efb\u52a1\u4e0a\u4f20\u5931\u8d25"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 759
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    .line 760
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 761
    .line 762
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 763
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 764
    const-string v0, "exception"

    const-string v1, "2"

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 765
    const-string v0, "exception"

    const-string v1, "2"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 766
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v9, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 767
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 768
    goto :goto_4

    .line 771
    :cond_5
    new-instance v9, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 772
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 774
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 775
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 779
    :cond_6
    :goto_4
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->G()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 780
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 781
    const-string v0, "LogUpload Service"

    const-string v1, "*****Beta Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 782
    goto :goto_5

    :cond_7
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    .line 783
    const-string v0, "LogUpload Service"

    const-string v1, "*****Fans Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 784
    goto :goto_5

    :cond_8
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_9

    .line 785
    const-string v0, "LogUpload Service"

    const-string v1, "*****Dev Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 786
    goto :goto_5

    :cond_9
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_a

    .line 787
    const-string v0, "LogUpload Service"

    const-string v1, "*****FEEDBACK Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 789
    :cond_a
    :goto_5
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/logupload/LogUpload;->f(Z)V

    .line 790
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->D()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_b

    .line 791
    new-instance v9, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 792
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v10

    .line 793
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 794
    const-string v0, "packagename"

    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    invoke-virtual {v10, v11}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 796
    invoke-virtual {v9, v10}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 800
    :cond_b
    return-void
.end method

.method private static c(Lcom/huawei/logupload/LogUpload;)V
    .locals 3

    .line 675
    const-string v0, "LogUpload Service"

    const-string v1, "https \u8bf7\u6c42\u8d85\u65f6\u5904\u7406"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 676
    move-object v2, p0

    .line 677
    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->A()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/logupload/LogUpload;->d(I)V

    .line 678
    invoke-static {v2}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 679
    return-void
.end method

.method private static d(Lcom/huawei/logupload/LogUpload;)I
    .locals 8

    .line 1321
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1322
    move-object v3, p0

    .line 1323
    const/4 v4, 0x0

    .line 1324
    new-instance v5, Lcom/huawei/logupload/p;

    invoke-direct {v5}, Lcom/huawei/logupload/p;-><init>()V

    .line 1325
    const/4 v6, -0x1

    .line 1326
    if-eqz v3, :cond_3

    .line 1327
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1328
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1329
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1330
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Uploader mLogUploadInfo.getFilepath()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1331
    new-instance v4, Ljava/io/File;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1332
    goto :goto_0

    .line 1333
    :cond_0
    return v6

    .line 1337
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1338
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Uploader mLogUploadInfo.getEncryptFile()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1339
    new-instance v4, Ljava/io/File;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1340
    goto :goto_0

    .line 1341
    :cond_2
    return v6

    .line 1345
    :cond_3
    return v6

    .line 1348
    :goto_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1349
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader \u9700\u8981\u53d1\u9001\u7684\u6587\u4ef6\u4e0d\u5b58\u5728\uff0c\u9000\u51fa"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1350
    const/4 v0, 0x0

    invoke-static {v3, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 1351
    const/4 v0, -0x2

    return v0

    .line 1354
    :cond_4
    const-string v0, "LogUpload Service"

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1357
    :try_start_0
    invoke-virtual {v5, v4, v3}, Lcom/huawei/logupload/p;->a(Ljava/io/File;Lcom/huawei/logupload/LogUpload;)I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    move-result v0

    move v6, v0

    .line 1358
    goto/16 :goto_1

    :catch_0
    move-exception v7

    .line 1359
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader SocketTimeoutException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1360
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_5

    .line 1361
    const/4 v0, -0x3

    return v0

    .line 1363
    :cond_5
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->A()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_6

    .line 1364
    invoke-static {v3}, Lcom/huawei/logupload/k;->e(Lcom/huawei/logupload/LogUpload;)V

    .line 1365
    goto/16 :goto_1

    .line 1367
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1371
    :catch_1
    move-exception v7

    .line 1373
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    .line 1374
    const/4 v0, -0x3

    return v0

    .line 1376
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1378
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader HttpHostConnectException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 1380
    :catch_2
    move-exception v7

    .line 1381
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader ConnectTimeoutException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1382
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_8

    .line 1383
    const/4 v0, -0x3

    return v0

    .line 1385
    :cond_8
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->A()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_9

    .line 1386
    invoke-static {v3}, Lcom/huawei/logupload/k;->e(Lcom/huawei/logupload/LogUpload;)V

    .line 1387
    goto/16 :goto_1

    .line 1389
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1419
    :catch_3
    move-exception v7

    .line 1421
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_a

    .line 1422
    const/4 v0, -0x3

    return v0

    .line 1424
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1426
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 1427
    :catch_4
    move-exception v7

    .line 1429
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_b

    .line 1430
    const/4 v0, -0x3

    return v0

    .line 1432
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1434
    const-string v0, "LogUpload Service"

    const-string v1, "ClientProtocolException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 1435
    :catch_5
    move-exception v7

    .line 1436
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader IOException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1438
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_c

    .line 1439
    const/4 v0, -0x3

    return v0

    .line 1441
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 1444
    :catch_6
    move-exception v7

    .line 1446
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_d

    .line 1447
    const/4 v0, -0x3

    return v0

    .line 1449
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 1451
    const-string v0, "LogUpload Service"

    const-string v1, "Uploader Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1453
    :goto_1
    return v6
.end method

.method private static e(Lcom/huawei/logupload/LogUpload;)V
    .locals 4

    .line 1513
    move-object v3, p0

    .line 1514
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The times of timeount is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->A()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1515
    invoke-virtual {v3}, Lcom/huawei/logupload/LogUpload;->A()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/logupload/LogUpload;->d(I)V

    .line 1516
    invoke-static {v3}, Lcom/huawei/logupload/k;->d(Lcom/huawei/logupload/LogUpload;)I

    .line 1517
    return-void
.end method
