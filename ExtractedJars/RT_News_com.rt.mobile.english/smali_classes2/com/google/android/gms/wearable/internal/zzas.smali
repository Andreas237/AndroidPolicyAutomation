.class public final Lcom/google/android/gms/wearable/internal/zzas;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;


# instance fields
.field private final zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/wearable/internal/zzas;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    iget-object p1, p1, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onChannelClosed(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zzb(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;->onChannelClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V

    return-void
.end method

.method public final onChannelOpened(Lcom/google/android/gms/wearable/Channel;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zzb(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;->onChannelOpened(Lcom/google/android/gms/wearable/ChannelClient$Channel;)V

    return-void
.end method

.method public final onInputClosed(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zzb(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;->onInputClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V

    return-void
.end method

.method public final onOutputClosed(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzas;->zzch:Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/zzao;->zzb(Lcom/google/android/gms/wearable/Channel;)Lcom/google/android/gms/wearable/internal/zzay;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/ChannelClient$ChannelCallback;->onOutputClosed(Lcom/google/android/gms/wearable/ChannelClient$Channel;II)V

    return-void
.end method
