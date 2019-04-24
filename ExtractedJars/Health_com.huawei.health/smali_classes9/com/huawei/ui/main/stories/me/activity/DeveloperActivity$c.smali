.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;)V
    .locals 0

    .line 174
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 198
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 177
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SimpleDataCallback : onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 180
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SimpleDataCallback initSDK success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Z)Z

    .line 183
    :cond_0
    const/4 v4, 0x0

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->c(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->i()Z

    move-result v4

    .line 186
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData  showState "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/emu;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/emu;->setChecked(Z)V

    .line 189
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Z)Z

    .line 194
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SimpleDataCallback : initSDK Failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    return-void
.end method
