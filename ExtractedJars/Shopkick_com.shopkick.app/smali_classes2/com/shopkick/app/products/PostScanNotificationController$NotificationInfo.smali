.class Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;
.super Ljava/lang/Object;
.source "PostScanNotificationController.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/PostScanNotificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NotificationInfo"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private chainId:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private productFamilyIds:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private scheduledTimeStampMs:J


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    const-wide/high16 v0, -0x8000000000000000L

    .line 61
    iput-wide v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->scheduledTimeStampMs:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/products/PostScanNotificationController$1;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Z
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->contains(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)J
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->scheduledTimeStampMs:J

    return-wide v0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->getProductFamilyIdList()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;J)J
    .locals 0

    .line 54
    iput-wide p1, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->scheduledTimeStampMs:J

    return-wide p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->chainId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->chainId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/util/HashSet;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Ljava/lang/String;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->chainName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->chainName:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->addProductFamilyId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$700(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->removeProductFamilyId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)Z
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->isEmpty()Z

    move-result p0

    return p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;)I
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->size()I

    move-result p0

    return p0
.end method

.method private addProductFamilyId(Ljava/lang/String;)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private contains(Ljava/lang/String;)Z
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private getProductFamilyIdList()Ljava/lang/String;
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    const-string v1, ","

    invoke-static {v0, v1}, Lcom/appboy/support/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isEmpty()Z
    .locals 1

    .line 84
    invoke-direct {p0}, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private removeProductFamilyId(Ljava/lang/String;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private size()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    return v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->productFamilyIds:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/products/PostScanNotificationController$NotificationInfo;->scheduledTimeStampMs:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
