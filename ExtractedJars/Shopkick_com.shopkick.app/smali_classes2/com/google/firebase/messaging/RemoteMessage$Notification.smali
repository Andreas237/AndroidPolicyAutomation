.class public Lcom/google/firebase/messaging/RemoteMessage$Notification;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/RemoteMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Notification"
.end annotation


# instance fields
.field private final tag:Ljava/lang/String;

.field private final zzdv:Ljava/lang/String;

.field private final zzdw:Ljava/lang/String;

.field private final zzdx:[Ljava/lang/String;

.field private final zzdy:Ljava/lang/String;

.field private final zzdz:Ljava/lang/String;

.field private final zzea:[Ljava/lang/String;

.field private final zzeb:Ljava/lang/String;

.field private final zzec:Ljava/lang/String;

.field private final zzed:Ljava/lang/String;

.field private final zzee:Ljava/lang/String;

.field private final zzef:Landroid/net/Uri;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "gcm.n.title"

    .line 2
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdv:Ljava/lang/String;

    const-string v0, "gcm.n.title"

    .line 4
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zzb(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdw:Ljava/lang/String;

    const-string v0, "gcm.n.title"

    .line 5
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zze(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdx:[Ljava/lang/String;

    const-string v0, "gcm.n.body"

    .line 6
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdy:Ljava/lang/String;

    const-string v0, "gcm.n.body"

    .line 8
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zzb(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdz:Ljava/lang/String;

    const-string v0, "gcm.n.body"

    .line 9
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zze(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzea:[Ljava/lang/String;

    const-string v0, "gcm.n.icon"

    .line 10
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzeb:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/google/firebase/messaging/zza;->zzi(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzec:Ljava/lang/String;

    const-string v0, "gcm.n.tag"

    .line 12
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->tag:Ljava/lang/String;

    const-string v0, "gcm.n.color"

    .line 13
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzed:Ljava/lang/String;

    const-string v0, "gcm.n.click_action"

    .line 14
    invoke-static {p1, v0}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzee:Ljava/lang/String;

    .line 15
    invoke-static {p1}, Lcom/google/firebase/messaging/zza;->zzg(Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzef:Landroid/net/Uri;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Lcom/google/firebase/messaging/zzb;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method private static zze(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 17
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/zza;->zzc(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 20
    :cond_0
    array-length p1, p0

    new-array p1, p1, [Ljava/lang/String;

    const/4 v0, 0x0

    .line 21
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 22
    aget-object v1, p0, v0

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdy:Ljava/lang/String;

    return-object v0
.end method

.method public getBodyLocalizationArgs()[Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzea:[Ljava/lang/String;

    return-object v0
.end method

.method public getBodyLocalizationKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdz:Ljava/lang/String;

    return-object v0
.end method

.method public getClickAction()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzee:Ljava/lang/String;

    return-object v0
.end method

.method public getColor()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzed:Ljava/lang/String;

    return-object v0
.end method

.method public getIcon()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzeb:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzef:Landroid/net/Uri;

    return-object v0
.end method

.method public getSound()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzec:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdv:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleLocalizationArgs()[Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdx:[Ljava/lang/String;

    return-object v0
.end method

.method public getTitleLocalizationKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/google/firebase/messaging/RemoteMessage$Notification;->zzdw:Ljava/lang/String;

    return-object v0
.end method
