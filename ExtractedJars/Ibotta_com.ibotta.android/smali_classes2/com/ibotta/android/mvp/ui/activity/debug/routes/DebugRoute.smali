.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;
.super Ljava/lang/Object;
.source "DebugRoute.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;
    }
.end annotation


# instance fields
.field private final bonuses:Z

.field private final category:Z

.field private final format:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final offer:Z

.field private final retailer:Z

.field private final retailerCategory:Z


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$000(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->name:Ljava/lang/String;

    .line 18
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->format:Ljava/lang/String;

    .line 19
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->retailerCategory:Z

    .line 20
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$300(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->retailer:Z

    .line 21
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$400(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->offer:Z

    .line 22
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->category:Z

    .line 23
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->access$500(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->bonuses:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;)V

    return-void
.end method


# virtual methods
.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->format:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->name:Ljava/lang/String;

    return-object v0
.end method

.method public isBonuses()Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->bonuses:Z

    return v0
.end method

.method public isCategory()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->category:Z

    return v0
.end method

.method public isOffer()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->offer:Z

    return v0
.end method

.method public isRetailer()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->retailer:Z

    return v0
.end method

.method public isRetailerCategory()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->retailerCategory:Z

    return v0
.end method
