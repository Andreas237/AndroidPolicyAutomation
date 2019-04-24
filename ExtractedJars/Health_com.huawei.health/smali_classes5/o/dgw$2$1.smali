.class Lo/dgw$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw$2;->d(Ljava/lang/Object;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/dgw$2;


# direct methods
.method constructor <init>(Lo/dgw$2;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lo/dgw$2$1;->e:Lo/dgw$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 126
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    invoke-virtual {p0, v0, v1}, Lo/dgw$2$1;->d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;)I
    .locals 4

    .line 128
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getTimeStamp()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getTimeStamp()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
