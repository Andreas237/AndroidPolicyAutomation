.class Lcom/stripe/android/EphemeralKeyManager;
.super Ljava/lang/Object;
.source "EphemeralKeyManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;,
        Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;
    }
.end annotation


# instance fields
.field private mEphemeralKey:Lcom/stripe/android/EphemeralKey;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mEphemeralKeyProvider:Lcom/stripe/android/EphemeralKeyProvider;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mListener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mOverrideCalendar:Ljava/util/Calendar;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mTimeBufferInSeconds:J


# direct methods
.method constructor <init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;JLjava/util/Calendar;)V
    .locals 0
    .param p1    # Lcom/stripe/android/EphemeralKeyProvider;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/Calendar;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKeyProvider:Lcom/stripe/android/EphemeralKeyProvider;

    .line 27
    iput-object p2, p0, Lcom/stripe/android/EphemeralKeyManager;->mListener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    .line 28
    iput-wide p3, p0, Lcom/stripe/android/EphemeralKeyManager;->mTimeBufferInSeconds:J

    .line 29
    iput-object p5, p0, Lcom/stripe/android/EphemeralKeyManager;->mOverrideCalendar:Ljava/util/Calendar;

    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1, p1}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/EphemeralKeyManager;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/EphemeralKeyManager;->updateKey(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$100(Lcom/stripe/android/EphemeralKeyManager;ILjava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/EphemeralKeyManager;->updateKeyError(ILjava/lang/String;)V

    return-void
.end method

.method static shouldRefreshKey(Lcom/stripe/android/EphemeralKey;JLjava/util/Calendar;)Z
    .locals 4
    .param p0    # Lcom/stripe/android/EphemeralKey;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Calendar;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-nez p3, :cond_1

    .line 74
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p3

    .line 75
    :cond_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    add-long/2addr v1, p1

    .line 77
    invoke-virtual {p0}, Lcom/stripe/android/EphemeralKey;->getExpires()J

    move-result-wide p0

    cmp-long p2, p0, v1

    if-gez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private updateKey(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 56
    invoke-static {p1}, Lcom/stripe/android/EphemeralKey;->fromString(Ljava/lang/String;)Lcom/stripe/android/EphemeralKey;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    .line 57
    iget-object p1, p0, Lcom/stripe/android/EphemeralKeyManager;->mListener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    invoke-interface {p1, v0, p2, p3}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyUpdate(Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private updateKeyError(ILjava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    .line 62
    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->mListener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyError(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method retrieveEphemeralKey(Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    iget-wide v1, p0, Lcom/stripe/android/EphemeralKeyManager;->mTimeBufferInSeconds:J

    iget-object v3, p0, Lcom/stripe/android/EphemeralKeyManager;->mOverrideCalendar:Ljava/util/Calendar;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/EphemeralKeyManager;->shouldRefreshKey(Lcom/stripe/android/EphemeralKey;JLjava/util/Calendar;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKeyProvider:Lcom/stripe/android/EphemeralKeyProvider;

    const-string v1, "2017-06-05"

    new-instance v2, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;

    invoke-direct {v2, p0, p1, p2}, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;-><init>(Lcom/stripe/android/EphemeralKeyManager;Ljava/lang/String;Ljava/util/Map;)V

    invoke-interface {v0, v1, v2}, Lcom/stripe/android/EphemeralKeyProvider;->createEphemeralKey(Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V

    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->mListener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    iget-object v1, p0, Lcom/stripe/android/EphemeralKeyManager;->mEphemeralKey:Lcom/stripe/android/EphemeralKey;

    invoke-interface {v0, v1, p1, p2}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyUpdate(Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/util/Map;)V

    :goto_0
    return-void
.end method
