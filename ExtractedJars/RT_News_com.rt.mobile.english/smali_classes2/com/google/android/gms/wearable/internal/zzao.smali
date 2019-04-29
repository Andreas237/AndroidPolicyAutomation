.class public final Lcom/google/android/gms/wearable/internal/zzao;
.super Lcom/google/android/gms/wearable/ChannelClient;


# instance fields
.field private final zzcg:Lcom/google/android/gms/wearable/internal/zzaj;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/common/api/GoogleApi$Settings;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/wearable/ChannelClient;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V

    new-instance p1, Lcom/google/android/gms/wearable/internal/zzaj;

    invoke-direct {p1}, Lcom/google/android/gms/wearable/internal/zzaj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzao;->zzcg:Lcom/google/android/gms/wearable/internal/zzaj;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/common/api/GoogleApi$Settings;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/wearable/ChannelClient;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApi$Settings;)V

    new-instance p1, Lcom/google/android/gms/wearable/internal/zzaj;

    invoke-direct {p1}, Lcom/google/android/gms/wearable/internal/zzaj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzao;->zzcg:Lcom/google/android/gms/wearable/internal/zzaj;

    return-void
.end method

.method static final synthetic zza(Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;)Lcom/google/android/gms/wearable/ChannelClient$Channel;
    .locals 0

    invoke-interface {p0}, Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;->getChannel()Lcom/google/android/gms/wearable/Channel;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p0

    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;
    .locals 1
    .param p0    # Lcom/google/android/gms/wearable/Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "channel must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/wearable/internal/zzay;

    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;
    .locals 1
    .param p0    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "channel must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/wearable/internal/zzay;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/internal/zzay;->close(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toVoidTask(Lcom/google/android/gms/common/api/PendingResult;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final close(Lcom/google/android/gms/wearable/ChannelClient$Channel;I)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/wearable/internal/zzay;->close(Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toVoidTask(Lcom/google/android/gms/common/api/PendingResult;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getInputStream(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/internal/zzay;->getInputStream(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/wearable/internal/zzaq;->zzbx:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toTask(Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getOutputStream(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/io/OutputStream;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/internal/zzay;->getOutputStream(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/wearable/internal/zzar;->zzbx:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toTask(Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final openChannel(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzao;->zzcg:Lcom/google/android/gms/wearable/internal/zzaj;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/wearable/internal/zzaj;->openChannel(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/wearable/internal/zzap;->zzbx:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toTask(Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final receiveFile(Lcom/google/android/gms/wearable/ChannelClient$Channel;Landroid/net/Uri;Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            "Landroid/net/Uri;",
            "Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {p1, v0, p2, p3}, Lcom/google/android/gms/wearable/internal/zzay;->receiveFile(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;Z)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toVoidTask(Lcom/google/android/gms/common/api/PendingResult;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final registerChannelCallback(Lcom/google/android/gms/wearable/ChannelClient$Channel;Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)Lcom/google/android/gms/tasks/Task;
    .locals 8
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzay;

    invoke-virtual {p1}, Lcom/google/android/gms/wearable/internal/zzay;->zzc()Ljava/lang/String;

    move-result-object p1

    const-string v0, "listener is null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->getLooper()Landroid/os/Looper;

    move-result-object v0

    const-string v1, "ChannelListener:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_0
    invoke-static {p2, v0, v1}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerHolder(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    move-result-object v6

    const/4 v0, 0x1

    new-array v3, v0, [Landroid/content/IntentFilter;

    const/4 v0, 0x0

    const-string v1, "com.google.android.gms.wearable.CHANNEL_EVENT"

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzgj;->zzc(Ljava/lang/String;)Landroid/content/IntentFilter;

    move-result-object v1

    aput-object v1, v3, v0

    new-instance v7, Lcom/google/android/gms/wearable/internal/zzas;

    invoke-direct {v7, p2}, Lcom/google/android/gms/wearable/internal/zzas;-><init>(Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)V

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->getLooper()Landroid/os/Looper;

    move-result-object p2

    const-string v0, "ChannelListener"

    invoke-static {v7, p2, v0}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerHolder(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    move-result-object v5

    new-instance p2, Lcom/google/android/gms/wearable/internal/zzat;

    move-object v0, p2

    move-object v1, v7

    move-object v2, p1

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/internal/zzat;-><init>(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;[Landroid/content/IntentFilter;Lcom/google/android/gms/common/api/internal/ListenerHolder;Lcom/google/android/gms/common/api/internal/ListenerHolder;)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzau;

    invoke-virtual {v6}, Lcom/google/android/gms/common/api/internal/ListenerHolder;->getListenerKey()Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;

    move-result-object v1

    invoke-direct {v0, v7, p1, v1}, Lcom/google/android/gms/wearable/internal/zzau;-><init>(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V

    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/wearable/internal/zzao;->doRegisterEventListener(Lcom/google/android/gms/common/api/internal/RegisterListenerMethod;Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final registerChannelCallback(Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)Lcom/google/android/gms/tasks/Task;
    .locals 8
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "listener is null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->getLooper()Landroid/os/Looper;

    move-result-object v0

    const-string v1, "ChannelListener"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerHolder(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    move-result-object v0

    const/4 v1, 0x1

    new-array v5, v1, [Landroid/content/IntentFilter;

    const-string v1, "com.google.android.gms.wearable.CHANNEL_EVENT"

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzgj;->zzc(Ljava/lang/String;)Landroid/content/IntentFilter;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v5, v2

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzas;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/zzas;-><init>(Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)V

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->getLooper()Landroid/os/Looper;

    move-result-object p1

    const-string v2, "ChannelListener"

    invoke-static {v1, p1, v2}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerHolder(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    move-result-object v7

    new-instance p1, Lcom/google/android/gms/wearable/internal/zzat;

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, v1

    move-object v6, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/wearable/internal/zzat;-><init>(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;[Landroid/content/IntentFilter;Lcom/google/android/gms/common/api/internal/ListenerHolder;Lcom/google/android/gms/common/api/internal/ListenerHolder;)V

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzau;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/ListenerHolder;->getListenerKey()Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;

    move-result-object v0

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v0}, Lcom/google/android/gms/wearable/internal/zzau;-><init>(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Ljava/lang/String;Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)V

    invoke-virtual {p0, p1, v2}, Lcom/google/android/gms/wearable/internal/zzao;->doRegisterEventListener(Lcom/google/android/gms/common/api/internal/RegisterListenerMethod;Lcom/google/android/gms/common/api/internal/UnregisterListenerMethod;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final sendFile(Lcom/google/android/gms/wearable/ChannelClient$Channel;Landroid/net/Uri;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/wearable/internal/zzay;->sendFile(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toVoidTask(Lcom/google/android/gms/common/api/PendingResult;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final sendFile(Lcom/google/android/gms/wearable/ChannelClient$Channel;Landroid/net/Uri;JJ)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            "Landroid/net/Uri;",
            "JJ)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->asGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    move-object v2, p2

    move-wide v3, p3

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/wearable/internal/zzay;->sendFile(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;JJ)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/PendingResultUtil;->toVoidTask(Lcom/google/android/gms/common/api/PendingResult;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final unregisterChannelCallback(Lcom/google/android/gms/wearable/ChannelClient$Channel;Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$Channel;",
            "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zza(Lcom/google/android/gms/wearable/ChannelClient$Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/wearable/internal/zzay;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->getLooper()Landroid/os/Looper;

    move-result-object v0

    const-string v1, "ChannelListener:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p2, v0, p1}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerHolder(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/ListenerHolder;->getListenerKey()Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzao;->doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final unregisterChannelCallback(Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/zzao;->getLooper()Landroid/os/Looper;

    move-result-object v0

    const-string v1, "ChannelListener"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/ListenerHolders;->createListenerHolder(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/ListenerHolder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/ListenerHolder;->getListenerKey()Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzao;->doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/ListenerHolder$ListenerKey;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
