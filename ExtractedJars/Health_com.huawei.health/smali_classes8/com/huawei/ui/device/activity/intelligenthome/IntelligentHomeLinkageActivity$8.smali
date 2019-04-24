.class Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dgg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V
    .locals 0

    .line 855
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;->d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iput p2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)V
    .locals 2

    .line 858
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 859
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 860
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;->a:I

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 861
    const/4 v0, 0x5

    iput v0, v1, Landroid/os/Message;->what:I

    .line 862
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;->d:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 863
    return-void
.end method
