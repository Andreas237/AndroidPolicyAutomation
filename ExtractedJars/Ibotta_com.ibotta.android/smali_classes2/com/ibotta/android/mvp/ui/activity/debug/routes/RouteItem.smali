.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;
.super Ljava/lang/Object;
.source "RouteItem.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
        ">;"
    }
.end annotation


# instance fields
.field private final id:I

.field private final label:Ljava/lang/String;

.field private route:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->id:I

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->label:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;)V

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->route:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->label:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->compareTo(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)I

    move-result p1

    return p1
.end method

.method public getId()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->id:I

    return v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->route:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    return-object v0
.end method

.method public setRoute(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->route:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    return-void
.end method
