.class Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;
.super Ljava/lang/Object;
.source "RedeemedRewardsDatasource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PendingUsedStatusUpdate"
.end annotation


# instance fields
.field private entityKey:Ljava/lang/String;

.field private used:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;)Ljava/lang/String;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->entityKey:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->entityKey:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;)Z
    .locals 0

    .line 45
    iget-boolean p0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->used:Z

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;Z)Z
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$PendingUsedStatusUpdate;->used:Z

    return p1
.end method
