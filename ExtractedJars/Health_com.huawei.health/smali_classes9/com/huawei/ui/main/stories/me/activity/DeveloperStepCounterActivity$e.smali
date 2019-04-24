.class Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;)V
    .locals 0

    .line 370
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 373
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 374
    :cond_0
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ReadStaticDealCallback onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    return-void

    .line 377
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 378
    const-string v0, "walk_step"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 379
    const-string v0, "run_step"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 380
    const-string v0, "climb_step"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const-string v1, "step_sum"

    invoke-virtual {v4, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->k(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I

    .line 382
    const-string v0, "calorie_sum"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 383
    const-string v0, "altitude_sum"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 385
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataFromDB onResult: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->x(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;ILjava/lang/Object;)V

    .line 387
    return-void
.end method
