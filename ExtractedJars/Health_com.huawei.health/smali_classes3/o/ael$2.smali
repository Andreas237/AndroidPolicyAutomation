.class Lo/ael$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ael;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ael;


# direct methods
.method constructor <init>(Lo/ael;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/ael$2;->d:Lo/ael;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 144
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 7

    .line 123
    if-eqz p2, :cond_1

    .line 124
    const/4 v4, 0x0

    .line 126
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 129
    goto :goto_0

    .line 127
    :catch_0
    move-exception v5

    .line 128
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_prepare--ClassCastException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 131
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiUserInfo;

    .line 132
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getRelateType()I

    move-result v0

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/ael$2;->d:Lo/ael;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/ael;->d(Lo/ael;F)F

    .line 134
    iget-object v0, p0, Lo/ael$2;->d:Lo/ael;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    invoke-static {v0, v1}, Lo/ael;->e(Lo/ael;I)I

    .line 135
    iget-object v0, p0, Lo/ael$2;->d:Lo/ael;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getAge()I

    move-result v1

    invoke-static {v0, v1}, Lo/ael;->b(Lo/ael;I)I

    .line 136
    goto :goto_2

    .line 138
    :cond_0
    goto :goto_1

    .line 141
    :cond_1
    :goto_2
    return-void
.end method
