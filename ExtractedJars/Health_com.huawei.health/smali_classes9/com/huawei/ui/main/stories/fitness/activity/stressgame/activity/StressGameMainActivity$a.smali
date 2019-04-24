.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eww;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 1

    .line 373
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 374
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 375
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;)V
    .locals 0

    .line 367
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 5

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    .line 380
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 381
    invoke-static {v4, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    goto :goto_0

    .line 383
    :cond_0
    const-string v0, "StressGameMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isCloseMesure stressGameMainActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 5

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    .line 401
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 402
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    return v0

    .line 404
    :cond_0
    const-string v0, "StressGameMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIsCloseMesure stressGameMainActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    const/4 v0, 0x0

    return v0
.end method

.method public d(Z)V
    .locals 5

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    .line 390
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 391
    invoke-static {v4, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    goto :goto_0

    .line 393
    :cond_0
    const-string v0, "StressGameMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setIsStopTimer stressGameMainActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 5

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    .line 413
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 414
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    return v0

    .line 416
    :cond_0
    const-string v0, "StressGameMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIsStopTimer stressGameMainActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const/4 v0, 0x0

    return v0
.end method
