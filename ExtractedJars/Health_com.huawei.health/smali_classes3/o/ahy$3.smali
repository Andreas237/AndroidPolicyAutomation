.class Lo/ahy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahy;->e(Lcom/huawei/hihealth/HiHealthData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/HiHealthData;

.field final synthetic b:Lo/ahy;

.field final synthetic e:Lcom/huawei/hihealth/HiHealthData;


# direct methods
.method constructor <init>(Lo/ahy;Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/ahy$3;->b:Lo/ahy;

    iput-object p2, p0, Lo/ahy$3;->a:Lcom/huawei/hihealth/HiHealthData;

    iput-object p3, p0, Lo/ahy$3;->e:Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 159
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler type is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lo/ahy$3;->b:Lo/ahy;

    invoke-static {v0}, Lo/ahy;->c(Lo/ahy;)Lo/abz;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 161
    if-nez p1, :cond_0

    .line 162
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler insertHiHealthData success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/ahy$3;->b:Lo/ahy;

    iget-object v1, p0, Lo/ahy$3;->a:Lcom/huawei/hihealth/HiHealthData;

    invoke-static {v0, v1}, Lo/ahy;->c(Lo/ahy;Lcom/huawei/hihealth/HiHealthData;)V

    .line 166
    iget-object v0, p0, Lo/ahy$3;->b:Lo/ahy;

    iget-object v1, p0, Lo/ahy$3;->e:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0, v1}, Lo/ahy;->c(Lcom/huawei/hihealth/HiHealthData;)V

    .line 167
    iget-object v0, p0, Lo/ahy$3;->b:Lo/ahy;

    invoke-static {v0}, Lo/ahy;->c(Lo/ahy;)Lo/abz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/abz;->a(Z)V

    goto :goto_0

    .line 169
    :cond_0
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler insertHiHealthData not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lo/ahy$3;->b:Lo/ahy;

    invoke-static {v0}, Lo/ahy;->c(Lo/ahy;)Lo/abz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/abz;->a(Z)V

    .line 173
    :cond_1
    :goto_0
    return-void
.end method
