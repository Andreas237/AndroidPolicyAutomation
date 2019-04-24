.class Lcom/launchdarkly/android/Event;
.super Ljava/lang/Object;
.source "Event.java"


# instance fields
.field kind:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/launchdarkly/android/Event;->kind:Ljava/lang/String;

    return-void
.end method
