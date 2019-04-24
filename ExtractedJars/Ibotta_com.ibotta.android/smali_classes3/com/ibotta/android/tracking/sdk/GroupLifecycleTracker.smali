.class public Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "GroupLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final lifecycleTrackers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "GroupLifecycleTracker.java"

    const-class v1, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "trackAppStart"

    const-string v3, "com.ibotta.android.tracking.sdk.GroupLifecycleTracker"

    const-string v4, "android.support.v4.app.FragmentActivity"

    const-string v5, "activity"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x28

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method


# virtual methods
.method public init()V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 27
    invoke-interface {v1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->init()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 68
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 71
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 34
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackAppPause(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 55
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppPause(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackAppResume(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 48
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppResume(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackAppStart(Landroid/support/v4/app/FragmentActivity;)V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PAGE_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 40
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 41
    invoke-interface {v2, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppStart(Landroid/support/v4/app/FragmentActivity;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method public trackAppStop(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 62
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppStop(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 77
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 80
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 94
    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 101
    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackRegistration()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/GroupLifecycleTracker;->lifecycleTrackers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 87
    invoke-interface {v1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackRegistration()V

    goto :goto_0

    :cond_0
    return-void
.end method
