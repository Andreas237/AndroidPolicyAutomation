.class Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WifiLengthHandler"
.end annotation


# instance fields
.field private mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;


# direct methods
.method public constructor <init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V
    .locals 0

    .line 240
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 241
    iput-object p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;->mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    .line 242
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 246
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;->mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiLengthHandler;->mNetStatusBar:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$600(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;Landroid/os/Message;)V

    .line 250
    :cond_0
    return-void
.end method
