.class Lcom/huawei/health/sns/server/im/SNSIMCenter$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/SNSIMCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V
    .locals 0

    .line 917
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$e;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;Lcom/huawei/health/sns/server/im/SNSIMCenter$2;)V
    .locals 0

    .line 917
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter$e;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 922
    const-string v0, "SNSIMCenter"

    const-string v1, "Receive AlarmManger IM Logout Broadcast!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$e;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/SNSIMCenter;I)V

    .line 925
    return-void
.end method
