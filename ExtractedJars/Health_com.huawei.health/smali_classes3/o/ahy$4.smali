.class Lo/ahy$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahy;->b(Lcom/huawei/hihealth/HiHealthData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ahy;

.field final synthetic c:Lcom/huawei/hihealth/HiHealthData;


# direct methods
.method constructor <init>(Lo/ahy;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lo/ahy$4;->a:Lo/ahy;

    iput-object p2, p0, Lo/ahy$4;->c:Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 239
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setMainUserHeartRate type is "

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

    .line 240
    if-nez p1, :cond_0

    .line 241
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler setMainUserHeartRate insertHiHealthData success "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 243
    :cond_0
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMainUserHeartRate insertHiHealthData not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMainUserHeartRate fail start time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahy$4;->c:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 246
    :goto_0
    return-void
.end method
