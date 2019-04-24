.class public Lo/eum;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euc;


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Lo/eug;

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const-class v0, Lo/eum;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/eum;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/eum;->c:Ljava/lang/ref/WeakReference;

    .line 34
    sget-object v0, Lo/eum;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SinaweiboAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)V
    .locals 8

    .line 115
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 118
    :sswitch_0
    const/4 v0, -0x1

    if-ne v0, p2, :cond_1

    .line 119
    const-string v0, "sinaweibo_userid"

    :try_start_0
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 120
    const-string v0, "sinaweibo_token"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 121
    const-string v0, "sinaweibo_username"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 123
    sget-object v0, Lo/eum;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult() strUserId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", strAccessToken=**, strUserName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    new-instance v7, Lo/eui;

    invoke-direct {v7}, Lo/eui;-><init>()V

    .line 127
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Lo/eui;->c(I)V

    .line 128
    invoke-virtual {v7, v4}, Lo/eui;->e(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v7, v5}, Lo/eui;->a(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v7, v6}, Lo/eui;->c(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lo/eum;->a:Lo/eug;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 132
    iget-object v0, p0, Lo/eum;->a:Lo/eug;

    invoke-interface {v0, v7}, Lo/eug;->b(Ljava/lang/Object;)V

    .line 133
    :cond_0
    goto :goto_0

    .line 134
    :cond_1
    iget-object v0, p0, Lo/eum;->a:Lo/eug;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 135
    iget-object v0, p0, Lo/eum;->a:Lo/eug;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lo/eug;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :cond_2
    :goto_0
    goto :goto_1

    .line 138
    :catch_0
    move-exception v4

    .line 139
    sget-object v0, Lo/eum;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    .line 146
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lo/eug;)V
    .locals 6

    .line 59
    iput-object p1, p0, Lo/eum;->a:Lo/eug;

    .line 60
    iget-object v0, p0, Lo/eum;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 61
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 62
    sget-object v0, Lo/eum;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SinaweiboAccount Activity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void

    .line 65
    :cond_0
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    invoke-direct {v5, v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 66
    const/16 v0, 0xa

    invoke-virtual {v4, v5, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 102
    return-void
.end method
