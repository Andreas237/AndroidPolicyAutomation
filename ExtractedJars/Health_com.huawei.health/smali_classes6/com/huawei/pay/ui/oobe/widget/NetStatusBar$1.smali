.class Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataActivity(I)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$000(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0, p1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$002(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;I)I

    .line 73
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$1;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$000(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->refreshSimViews(I)V

    .line 75
    :cond_0
    return-void
.end method
