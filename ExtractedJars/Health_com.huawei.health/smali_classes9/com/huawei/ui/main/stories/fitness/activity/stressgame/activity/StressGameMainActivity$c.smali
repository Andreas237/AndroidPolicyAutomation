.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/exb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 1

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    const-string v0, "StressGameMainActivity"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;->b:Ljava/lang/String;

    .line 167
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 168
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;)V
    .locals 0

    .line 159
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 5

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    .line 183
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 184
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 185
    const-string v0, "measureEnd"

    invoke-static {v4, v0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V

    goto :goto_0

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StressGameMainActivity stressGameMainActivity == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    .line 172
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 173
    const-string v0, "algResult"

    invoke-static {v4, v0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StressGameMainActivity stressGameMainActivity == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_0
    return-void
.end method

.method public d(F)V
    .locals 0

    .line 194
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 199
    return-void
.end method
