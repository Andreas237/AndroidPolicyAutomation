.class Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 225
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 226
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 227
    const-string v0, "&&"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    const-string v0, "&&"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 229
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE split = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    array-length v0, v5

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x0

    aget-object v1, v5, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    const/4 v0, 0x1

    aget-object v6, v5, v0

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x2

    aget-object v1, v5, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    const/4 v0, 0x3

    aget-object v7, v5, v0

    .line 235
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkDevidIsPermanent devId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " expiresIn "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " proId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " enable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->m(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a$5;->e:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;->a:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Lo/enz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    :cond_0
    return-void
.end method
