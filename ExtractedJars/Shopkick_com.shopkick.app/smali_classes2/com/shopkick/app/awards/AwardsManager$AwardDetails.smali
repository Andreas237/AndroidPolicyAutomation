.class Lcom/shopkick/app/awards/AwardsManager$AwardDetails;
.super Ljava/lang/Object;
.source "AwardsManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/awards/AwardsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AwardDetails"
.end annotation


# instance fields
.field public awards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;"
        }
    .end annotation
.end field

.field public delta:I

.field public errMsg:Ljava/lang/String;

.field public extraWalkinMsg:Ljava/lang/String;

.field public finalKicksBalance:I

.field public isOnline:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZII)V"
        }
    .end annotation

    .line 1388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1389
    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->awards:Ljava/util/List;

    .line 1390
    iput-object p2, p0, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->errMsg:Ljava/lang/String;

    .line 1391
    iput-object p3, p0, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->extraWalkinMsg:Ljava/lang/String;

    .line 1392
    iput-boolean p4, p0, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->isOnline:Z

    .line 1393
    iput p5, p0, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->delta:I

    .line 1394
    iput p6, p0, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->finalKicksBalance:I

    return-void
.end method
