.class public Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;


# direct methods
.method public constructor <init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V
    .locals 0

    .line 570
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 9

    .line 623
    const/4 v5, 0x0

    .line 624
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getDeviceCapability"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 638
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability null != deviceCapabilityListForHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 640
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability has two devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 642
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture()Z

    move-result v0

    if-nez v0, :cond_0

    .line 643
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability has extra device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0, v7}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 646
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v2

    const-class v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v2, v7, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 649
    goto :goto_1

    .line 647
    :catch_0
    move-exception v8

    .line 648
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    goto :goto_1

    .line 652
    :cond_0
    goto :goto_0

    :cond_1
    :goto_1
    goto :goto_2

    .line 654
    :cond_2
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability has one devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 657
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-class v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v2, v3, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 660
    goto :goto_2

    .line 658
    :catch_1
    move-exception v6

    .line 659
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 668
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability null != mDeviceCapability"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    :try_start_2
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v1, v2, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_2
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_2 .. :try_end_2} :catch_2

    .line 674
    goto :goto_3

    .line 671
    :catch_2
    move-exception v6

    .line 672
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wearDeviceCapability JsonSyntaxException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 677
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->u(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 678
    new-instance v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    .line 679
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 680
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink()Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    const/4 v0, 0x1

    goto :goto_5

    :cond_8
    const/4 v0, 0x0

    :goto_5
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 681
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 682
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo()Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    const/4 v0, 0x1

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    :goto_7
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportStressInfo(Z)V

    .line 683
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink()Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_d
    const/4 v0, 0x1

    goto :goto_8

    :cond_e
    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 684
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode()Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_f
    const/4 v0, 0x1

    goto :goto_9

    :cond_10
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAutoDetectMode(Z)V

    .line 685
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture()Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_11
    const/4 v0, 0x1

    goto :goto_a

    :cond_12
    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportRunPosture(Z)V

    .line 686
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->s(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear()Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    const/4 v0, 0x1

    goto :goto_b

    :cond_14
    const/4 v0, 0x0

    :goto_b
    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportFootWear(Z)V

    .line 688
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mOldhealthDeviceCapability json string:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    new-instance v5, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 694
    goto :goto_c

    .line 690
    :catch_3
    move-exception v7

    .line 692
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wearDeviceCapability JsonSyntaxException  :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v5

    .line 695
    :goto_c
    goto :goto_d

    .line 696
    :cond_15
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->u(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_16

    .line 697
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->u(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v5

    goto :goto_d

    .line 699
    :cond_16
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v5

    .line 702
    :goto_d
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CallbackService getDeviceCapability:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    return-object v5
.end method

.method public b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation

    .line 577
    const/4 v2, 0x0

    .line 578
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 579
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 581
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 583
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 585
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 586
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 587
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 590
    :cond_2
    :goto_0
    return-object v2
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 751
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter removeFunctionCallback()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 752
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 753
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter removeFunctionCallback() contains "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 756
    :cond_0
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter removeFunctionCallback() not contains "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 759
    :goto_0
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation

    .line 613
    const/4 v2, 0x0

    .line 614
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 615
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 616
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 618
    :cond_0
    return-object v2
.end method

.method public d()Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
    .locals 4

    .line 572
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CallbackService.this is"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    return-object v0
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 743
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 744
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation

    .line 599
    const/4 v2, 0x0

    .line 600
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 601
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 602
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 604
    :cond_0
    return-object v2
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .line 736
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->r(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation

    .line 747
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public k()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 5

    .line 712
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 714
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    iget-object v1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->t(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v1, v2, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 718
    goto :goto_0

    .line 715
    :catch_0
    move-exception v4

    .line 716
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wearDeviceCapability JsonSyntaxException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 720
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$c;->a:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->q(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method
