.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 596
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;)V
    .locals 0

    .line 596
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/d/e;->e(Landroid/content/Context;)V

    .line 600
    return-void
.end method
