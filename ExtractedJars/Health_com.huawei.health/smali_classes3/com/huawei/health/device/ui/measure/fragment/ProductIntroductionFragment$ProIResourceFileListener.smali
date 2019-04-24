.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ProIResourceFileListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 921
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;)V
    .locals 0

    .line 921
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 5

    .line 925
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProductIntroductionFragment resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 928
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment sendMessage REFRESH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 929
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2600(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 930
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 931
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 932
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 933
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 935
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2802(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Z)Z

    .line 936
    goto :goto_0

    :cond_0
    const-string v0, "group"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 937
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 938
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 939
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 940
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 945
    :cond_1
    :goto_0
    const/16 v0, 0x12c

    if-ne p1, v0, :cond_2

    .line 946
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProductIntroductionFragment get sizei success  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 948
    const/4 v0, 0x5

    iput v0, v4, Landroid/os/Message;->what:I

    .line 949
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 950
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 953
    :cond_2
    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    .line 954
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment sendMessage FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 955
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 956
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 957
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 958
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 960
    :cond_3
    return-void
.end method
