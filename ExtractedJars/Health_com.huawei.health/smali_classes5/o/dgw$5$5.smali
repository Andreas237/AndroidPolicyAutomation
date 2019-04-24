.class Lo/dgw$5$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw$5;->d(Ljava/lang/Object;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/hihealth/HiHealthData;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/dgw$5;


# direct methods
.method constructor <init>(Lo/dgw$5;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/dgw$5$5;->e:Lo/dgw$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 260
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p0, v0, v1}, Lo/dgw$5$5;->e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I

    move-result v0

    return v0
.end method

.method public e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I
    .locals 6

    .line 262
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    sub-long v4, v0, v2

    .line 263
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-nez v0, :cond_0

    .line 264
    const/4 v0, 0x0

    return v0

    .line 266
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    return v0
.end method
