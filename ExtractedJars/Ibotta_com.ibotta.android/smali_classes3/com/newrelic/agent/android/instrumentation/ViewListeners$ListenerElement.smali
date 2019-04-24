.class public Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;
.super Ljava/lang/Object;
.source "ViewListeners.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/ViewListeners;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ListenerElement"
.end annotation


# instance fields
.field public methodExecuted:Ljava/lang/String;

.field public targetObject:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;->targetObject:Ljava/lang/String;

    .line 197
    iput-object p2, p0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;->methodExecuted:Ljava/lang/String;

    return-void
.end method
