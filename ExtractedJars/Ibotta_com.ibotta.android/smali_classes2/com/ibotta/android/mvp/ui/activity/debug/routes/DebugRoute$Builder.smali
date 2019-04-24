.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
.super Ljava/lang/Object;
.source "DebugRoute.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private bonuses:Z

.field private category:Z

.field private final format:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private offer:Z

.field private retailer:Z

.field private retailerCategory:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->name:Ljava/lang/String;

    .line 65
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->format:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Ljava/lang/String;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Ljava/lang/String;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->format:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z
    .locals 0

    .line 54
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->category:Z

    return p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z
    .locals 0

    .line 54
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->retailer:Z

    return p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z
    .locals 0

    .line 54
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->offer:Z

    return p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z
    .locals 0

    .line 54
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->bonuses:Z

    return p0
.end method


# virtual methods
.method public asBonuses()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->bonuses:Z

    return-object p0
.end method

.method public asCategory()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->category:Z

    return-object p0
.end method

.method public asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 79
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->offer:Z

    return-object p0
.end method

.method public asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->retailer:Z

    return-object p0
.end method

.method public asRetailerCategory()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->retailerCategory:Z

    return-object p0
.end method

.method public build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;
    .locals 2

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$1;)V

    return-object v0
.end method
