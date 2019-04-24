.class Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SimViewHandler"
.end annotation


# instance fields
.field private mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;


# direct methods
.method public constructor <init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V
    .locals 0

    .line 177
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 178
    iput-object p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;->mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    .line 179
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 183
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;->mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$SimViewHandler;->mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$400(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;Landroid/os/Message;)V

    .line 187
    :cond_0
    return-void
.end method
