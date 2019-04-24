.class Lo/dmk$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmk;->e(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Lo/dmd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dmk;

.field final synthetic b:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

.field final synthetic c:Lo/dmd;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dmk;ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Lo/dmd;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/dmk$2;->a:Lo/dmk;

    iput p2, p0, Lo/dmk$2;->e:I

    iput-object p3, p0, Lo/dmk$2;->b:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    iput-object p4, p0, Lo/dmk$2;->d:Ljava/util/Map;

    iput-object p5, p0, Lo/dmk$2;->c:Lo/dmd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 126
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 7

    .line 107
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET KEY SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dmk$2;->a:Lo/dmk;

    iget v2, p0, Lo/dmk$2;->e:I

    invoke-virtual {v1, v2}, Lo/dmk;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 109
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pullData,url ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lo/dmk$2;->a:Lo/dmk;

    iget-object v1, p0, Lo/dmk$2;->b:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    iget-object v2, p0, Lo/dmk$2;->d:Ljava/util/Map;

    iget v3, p0, Lo/dmk$2;->e:I

    invoke-static {v0, v1, v2, v3}, Lo/dmk;->d(Lo/dmk;Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;I)Ljava/util/HashMap;

    move-result-object v5

    .line 112
    iget-object v0, p0, Lo/dmk$2;->a:Lo/dmk;

    iget v1, p0, Lo/dmk$2;->e:I

    invoke-static {v0, v1}, Lo/dmk;->e(Lo/dmk;I)Ljava/util/HashMap;

    move-result-object v6

    .line 113
    iget-object v0, p0, Lo/dmk$2;->a:Lo/dmk;

    invoke-static {v0}, Lo/dmk;->d(Lo/dmk;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/dmk$2$3;

    invoke-direct {v1, p0}, Lo/dmk$2$3;-><init>(Lo/dmk$2;)V

    invoke-static {v0, v4, v5, v6, v1}, Lo/dmc;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 122
    :cond_0
    return-void
.end method
