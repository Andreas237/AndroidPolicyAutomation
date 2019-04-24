.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eug;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;>;"
        }
    .end annotation
.end field

.field private e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V
    .locals 1

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->b:Ljava/lang/ref/WeakReference;

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    .line 130
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;)Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    return-object v0
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 164
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login onFailure errcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; errmsg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfac

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 168
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 8

    .line 134
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login onSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    move-object v4, p1

    :try_start_0
    check-cast v4, Lo/eui;

    .line 137
    if-eqz v4, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    if-eqz v0, :cond_2

    .line 138
    invoke-virtual {v4}, Lo/eui;->d()Ljava/lang/String;

    move-result-object v5

    .line 139
    invoke-virtual {v4}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v6

    .line 140
    invoke-virtual {v4}, Lo/eui;->a()I

    move-result v7

    .line 141
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openId=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, "; accessToken=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v6, v1, v2

    const-string v2, "; loginType = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    const/4 v0, 0x1

    if-ne v7, v0, :cond_1

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;

    invoke-direct {v1, p0, v4}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a$5;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;Lo/eui;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lo/eui;)V

    goto :goto_0

    .line 154
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$a;->e:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lo/eui;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    :cond_2
    :goto_0
    goto :goto_1

    .line 157
    :catch_0
    move-exception v4

    .line 158
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :goto_1
    return-void
.end method
