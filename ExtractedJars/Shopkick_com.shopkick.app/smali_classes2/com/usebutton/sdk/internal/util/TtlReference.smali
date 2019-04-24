.class public Lcom/usebutton/sdk/internal/util/TtlReference;
.super Ljava/lang/Object;
.source "TtlReference.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final REALTIME_MILLIS_PROVIDER:Lcom/usebutton/sdk/internal/util/TimeProvider;


# instance fields
.field private final mObject:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final mTimeOfDeath:J

.field private final mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/usebutton/sdk/internal/util/TtlReference$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/TtlReference$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/util/TtlReference;->REALTIME_MILLIS_PROVIDER:Lcom/usebutton/sdk/internal/util/TimeProvider;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/util/TimeProvider;Ljava/lang/Object;J)V
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # J
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/util/TimeProvider;",
            "TT;J)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p2, p0, Lcom/usebutton/sdk/internal/util/TtlReference;->mObject:Ljava/lang/Object;

    .line 30
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/util/TimeProvider;->getTimeInMs()J

    move-result-wide v0

    add-long/2addr v0, p3

    iput-wide v0, p0, Lcom/usebutton/sdk/internal/util/TtlReference;->mTimeOfDeath:J

    .line 31
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/TtlReference;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/util/TtlReference;->isDead()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/TtlReference;->mObject:Ljava/lang/Object;

    return-object v0
.end method

.method public isDead()Z
    .locals 4

    .line 48
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/TtlReference;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/util/TimeProvider;->getTimeInMs()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/util/TtlReference;->mTimeOfDeath:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
