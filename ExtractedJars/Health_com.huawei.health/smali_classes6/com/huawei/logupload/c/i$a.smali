.class public Lcom/huawei/logupload/c/i$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/logupload/c/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 871
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 872
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 875
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 878
    :pswitch_0
    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 880
    invoke-static {}, Lcom/huawei/logupload/c/i;->e()V

    .line 881
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u6536\u5230\u5b50\u7ebf\u7a0b\u6d88\u606f"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 882
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u81ea\u6740\u8fdb\u7a0b :myPid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 884
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 887
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 888
    .line 889
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 890
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 891
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "packagename"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 895
    :cond_0
    const-string v0, "exception"

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 896
    const-string v0, "exception"

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 897
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    .line 910
    :cond_1
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 911
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 912
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 913
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 915
    const/16 v0, -0x64

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 918
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    const-class v3, Lcom/huawei/logupload/LogUploadReceive;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->stopService(Landroid/content/Intent;)Z

    .line 919
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    const-class v3, Lcom/huawei/logupload/LogUploadService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->stopService(Landroid/content/Intent;)Z

    .line 928
    goto/16 :goto_0

    .line 930
    :pswitch_1
    const-string v0, "feedback_upload_Utils"

    const-string v1, "service \u542f\u52a8"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 931
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/logupload/LogUpload;

    .line 932
    if-eqz v4, :cond_3

    .line 933
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "taskId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 934
    invoke-static {v4}, Lcom/huawei/logupload/LogUploadService;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 937
    goto/16 :goto_0

    .line 940
    :pswitch_2
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u4eae\u5c4f"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 941
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/logupload/LogUpload;

    .line 942
    iget v6, p1, Landroid/os/Message;->arg1:I

    .line 944
    invoke-static {}, Lcom/huawei/logupload/b/a;->a()Lcom/huawei/logupload/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/logupload/f;

    .line 945
    invoke-direct {v1, v5, v6}, Lcom/huawei/logupload/f;-><init>(Lcom/huawei/logupload/LogUpload;I)V

    .line 944
    invoke-virtual {v0, v1}, Lcom/huawei/logupload/b/a;->a(Ljava/lang/Runnable;)V

    .line 946
    goto :goto_0

    .line 948
    :pswitch_3
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u7f51\u7edc\u53d8\u66f4"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 949
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v7

    .line 950
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lcom/huawei/logupload/LogUpload;

    .line 951
    if-eqz v8, :cond_2

    .line 952
    invoke-virtual {v8}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v1, v0, :cond_2

    .line 954
    new-instance v9, Landroid/content/Intent;

    const-class v0, Lcom/huawei/logupload/LogUploadReceive;

    invoke-direct {v9, v7, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 955
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 956
    const-string v0, "LogUpload"

    invoke-virtual {v10, v0, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 957
    invoke-virtual {v9, v10}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 958
    invoke-virtual {v7, v9}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 959
    goto :goto_0

    .line 960
    :cond_2
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u95ee\u9898\u53cd\u9988\u65e5\u5fd7\u7f51\u7edc\u53d8\u66f4\u4e0d\u91cd\u4f20\uff01"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 962
    .line 967
    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
