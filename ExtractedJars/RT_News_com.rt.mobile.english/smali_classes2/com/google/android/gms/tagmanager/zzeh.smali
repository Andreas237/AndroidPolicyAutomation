.class Lcom/google/android/gms/tagmanager/zzeh;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/zzeh$zza;
    }
.end annotation


# static fields
.field private static zzbae:Lcom/google/android/gms/tagmanager/zzeh;


# instance fields
.field private volatile zzavt:Ljava/lang/String;

.field private volatile zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

.field private volatile zzbag:Ljava/lang/String;

.field private volatile zzbah:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbai:Lcom/google/android/gms/tagmanager/zzeh$zza;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbag:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzavt:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbah:Ljava/lang/String;

    return-void
.end method

.method private static zzdh(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "&"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    const-string v0, "="

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aget-object p0, p0, v0

    return-object p0
.end method

.method static zzof()Lcom/google/android/gms/tagmanager/zzeh;
    .locals 2

    const-class v0, Lcom/google/android/gms/tagmanager/zzeh;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/tagmanager/zzeh;->zzbae:Lcom/google/android/gms/tagmanager/zzeh;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/tagmanager/zzeh;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/zzeh;-><init>()V

    sput-object v1, Lcom/google/android/gms/tagmanager/zzeh;->zzbae:Lcom/google/android/gms/tagmanager/zzeh;

    :cond_0
    sget-object v1, Lcom/google/android/gms/tagmanager/zzeh;->zzbae:Lcom/google/android/gms/tagmanager/zzeh;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method final getContainerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzavt:Ljava/lang/String;

    return-object v0
.end method

.method final declared-synchronized zzb(Landroid/net/Uri;)Z
    .locals 5

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$"

    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    const-string v0, "Container preview url: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    const-string v0, ".*?&gtm_debug=x$"

    invoke-virtual {v1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbak:Lcom/google/android/gms/tagmanager/zzeh$zza;

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbaj:Lcom/google/android/gms/tagmanager/zzeh$zza;

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    const-string v0, "&gtm_debug=x"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbah:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

    sget-object v0, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbaj:Lcom/google/android/gms/tagmanager/zzeh$zza;

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

    sget-object v0, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbak:Lcom/google/android/gms/tagmanager/zzeh$zza;

    if-ne p1, v0, :cond_4

    :cond_2
    const-string p1, "/r?"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbah:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_3
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbag:Ljava/lang/String;

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbah:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzeh;->zzdh(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzavt:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v3

    :cond_5
    :try_start_2
    const-string v2, "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"

    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzeh;->zzdh(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzavt:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "Exit preview mode for container: "

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzavt:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_4
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbai:Lcom/google/android/gms/tagmanager/zzeh$zza;

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbag:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v3

    :cond_7
    monitor-exit p0

    return v0

    :cond_8
    :try_start_3
    const-string p1, "Invalid preview uri: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_9
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_5
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :catch_0
    monitor-exit p0

    return v0
.end method

.method final zzog()Lcom/google/android/gms/tagmanager/zzeh$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbaf:Lcom/google/android/gms/tagmanager/zzeh$zza;

    return-object v0
.end method

.method final zzoh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzeh;->zzbag:Ljava/lang/String;

    return-object v0
.end method
