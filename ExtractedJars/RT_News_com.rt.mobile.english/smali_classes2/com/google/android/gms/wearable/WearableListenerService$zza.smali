.class final Lcom/google/android/gms/wearable/WearableListenerService$zza;
.super Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/WearableListenerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "zza"
.end annotation


# instance fields
.field private final synthetic zzak:Lcom/google/android/gms/wearable/WearableListenerService;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-direct {p0}, Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService;Lcom/google/android/gms/wearable/zzk;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/WearableListenerService$zza;-><init>(Lcom/google/android/gms/wearable/WearableListenerService;)V

    return-void
.end method


# virtual methods
.method public final onChannelClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/WearableListenerService;->onChannelClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V

    return-void
.end method

.method public final onChannelOpened(Lcom/google/android/gms/wearable/ChannelClient$Channel;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wearable/WearableListenerService;->onChannelOpened(Lcom/google/android/gms/wearable/ChannelClient$Channel;)V

    return-void
.end method

.method public final onInputClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/WearableListenerService;->onInputClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V

    return-void
.end method

.method public final onOutputClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V
    .locals 1
    .param p1    # Lcom/google/android/gms/wearable/ChannelClient$Channel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzak:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/WearableListenerService;->onOutputClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V

    return-void
.end method
