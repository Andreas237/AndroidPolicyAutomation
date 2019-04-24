.class public final Lnet/hockeyapp/android/PrivateEventManager;
.super Ljava/lang/Object;
.source "PrivateEventManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/hockeyapp/android/PrivateEventManager$Event;,
        Lnet/hockeyapp/android/PrivateEventManager$HockeyEventListener;
    }
.end annotation


# static fields
.field private static sEventListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/hockeyapp/android/PrivateEventManager$HockeyEventListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lnet/hockeyapp/android/PrivateEventManager;->sEventListeners:Ljava/util/List;

    return-void
.end method

.method static postEvent(Lnet/hockeyapp/android/PrivateEventManager$Event;)V
    .locals 2

    .line 17
    sget-object v0, Lnet/hockeyapp/android/PrivateEventManager;->sEventListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/hockeyapp/android/PrivateEventManager$HockeyEventListener;

    .line 18
    invoke-interface {v1, p0}, Lnet/hockeyapp/android/PrivateEventManager$HockeyEventListener;->onHockeyEvent(Lnet/hockeyapp/android/PrivateEventManager$Event;)V

    goto :goto_0

    :cond_0
    return-void
.end method
