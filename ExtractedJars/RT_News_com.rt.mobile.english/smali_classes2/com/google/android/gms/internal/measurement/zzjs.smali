.class public Lcom/google/android/gms/internal/measurement/zzjs;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzed;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzjs$zza;
    }
.end annotation


# static fields
.field private static volatile zzaqj:Lcom/google/android/gms/internal/measurement/zzjs;


# instance fields
.field private final zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

.field private zzaqk:Lcom/google/android/gms/internal/measurement/zzgg;

.field private zzaql:Lcom/google/android/gms/internal/measurement/zzfl;

.field private zzaqm:Lcom/google/android/gms/internal/measurement/zzej;

.field private zzaqn:Lcom/google/android/gms/internal/measurement/zzfq;

.field private zzaqo:Lcom/google/android/gms/internal/measurement/zzjo;

.field private zzaqp:Lcom/google/android/gms/internal/measurement/zzeb;

.field private final zzaqq:Lcom/google/android/gms/internal/measurement/zzjy;

.field private zzaqr:Z

.field private zzaqs:J
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field private zzaqt:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private zzaqu:I

.field private zzaqv:I

.field private zzaqw:Z

.field private zzaqx:Z

.field private zzaqy:Z

.field private zzaqz:Ljava/nio/channels/FileLock;

.field private zzara:Ljava/nio/channels/FileChannel;

.field private zzarb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private zzarc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private zzard:J

.field private zzvo:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzjx;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjs;-><init>(Lcom/google/android/gms/internal/measurement/zzjx;Lcom/google/android/gms/internal/measurement/zzgm;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzjx;Lcom/google/android/gms/internal/measurement/zzgm;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzvo:Z

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lcom/google/android/gms/internal/measurement/zzjx;->zzqx:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzgm;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzard:J

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzjy;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/measurement/zzjy;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjr;->zzm()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqq:Lcom/google/android/gms/internal/measurement/zzjy;

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/measurement/zzfl;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjr;->zzm()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaql:Lcom/google/android/gms/internal/measurement/zzfl;

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzgg;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/measurement/zzgg;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjr;->zzm()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqk:Lcom/google/android/gms/internal/measurement/zzgg;

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjt;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzjt;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzjx;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzgh;->zzc(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final zza(Ljava/nio/channels/FileChannel;)I
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-wide/16 v3, 0x0

    :try_start_0
    invoke-virtual {p1, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p1, v2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    if-eq p1, v1, :cond_2

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Unexpected data length. Bytes read"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return v0

    :cond_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to read from channel"

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move p1, v0

    return p1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v1, "Bad channel to read from"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return v0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object p0

    return-object p0
.end method

.method private final zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZZJ)Lcom/google/android/gms/internal/measurement/zzdz;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    const-string v1, "Unknown"

    const-string v3, "Unknown"

    const-string v4, "Unknown"

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "PackageManager is null, can not log app install information"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return-object v6

    :cond_0
    :try_start_0
    invoke-virtual {v5, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v7, "Error retrieving installer package name. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v5, v1

    :goto_0
    if-nez v5, :cond_1

    const-string v1, "manual_install"

    :goto_1
    move-object v7, v1

    goto :goto_2

    :cond_1
    const-string v1, "com.android.vending"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    move-object v7, v5

    :goto_2
    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v1

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getApplicationLabel(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v4, v3

    :cond_3
    iget-object v3, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_4
    const/high16 v1, -0x80000000

    :goto_3
    move-object v4, v3

    const-wide/16 v16, 0x0

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    const-wide/16 v5, 0x0

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/zzeg;->zzaz(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-wide/from16 v18, p7

    goto :goto_4

    :cond_5
    move-wide/from16 v18, v5

    :goto_4
    new-instance v24, Lcom/google/android/gms/internal/measurement/zzdz;

    int-to-long v5, v1

    const-wide/16 v8, 0x30a3

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v1

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzkc;->zzd(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v10

    const/4 v12, 0x0

    const/4 v14, 0x0

    const-string v15, ""

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v1, v24

    move-object/from16 v3, p3

    move/from16 v13, p4

    move/from16 v21, p5

    move/from16 v22, p6

    invoke-direct/range {v1 .. v23}, Lcom/google/android/gms/internal/measurement/zzdz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZZ)V

    return-object v24

    :catch_1
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v3, "Error retrieving newly installed package info. appId, appName"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzjr;)V
    .locals 3

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Upload Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x1b

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Component not initialized: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzjx;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjx;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzjx;)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzej;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzej;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjr;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqm:Lcom/google/android/gms/internal/measurement/zzej;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqk:Lcom/google/android/gms/internal/measurement/zzgg;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzeg;->zza(Lcom/google/android/gms/internal/measurement/zzei;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzeb;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzeb;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjr;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqp:Lcom/google/android/gms/internal/measurement/zzeb;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzjo;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzjo;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjr;->zzm()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqo:Lcom/google/android/gms/internal/measurement/zzjo;

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzfq;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/measurement/zzfq;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqn:Lcom/google/android/gms/internal/measurement/zzfq;

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqu:I

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqv:I

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Not all upload components initialized"

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqu:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqv:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzvo:Z

    return-void
.end method

.method private final zza(ILjava/nio/channels/FileChannel;)Z
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-virtual {p2, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p2, v1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x4

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Error writing to channel. Bytes written"

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string v1, "Failed to write to channel"

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p2, "Bad channel to read from"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    return v0
.end method

.method private final zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzew;)Z
    .locals 13

    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    const-string v1, "currency"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzet;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ecommerce_purchase"

    iget-object v2, p2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    const-string v3, "value"

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzet;->zzbg(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide v5, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v3, v5

    const-wide/16 v7, 0x0

    cmpl-double v1, v3, v7

    if-nez v1, :cond_0

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    const-string v3, "value"

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzet;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-double v3, v3

    mul-double/2addr v3, v5

    :cond_0
    const-wide/high16 v5, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v1, v3, v5

    if-gtz v1, :cond_1

    const-wide/high16 v5, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v1, v3, v5

    if-ltz v1, :cond_1

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string v0, "Data lost. Currency value is too big. appId"

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v2

    :cond_2
    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    const-string v3, "value"

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzet;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v5, 0x1

    if-nez v1, :cond_6

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "[A-Z]{3}"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "_ltv_"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v9, v0

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0, p1, v9}, Lcom/google/android/gms/internal/measurement/zzej;->zzh(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkb;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    instance-of v1, v1, Ljava/lang/Long;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v8, p2, Lcom/google/android/gms/internal/measurement/zzew;->origin:Ljava/lang/String;

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v10

    add-long v6, v0, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    move-object v6, v2

    move-object v7, p1

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object v0, v2

    goto :goto_5

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v1

    sget-object v6, Lcom/google/android/gms/internal/measurement/zzey;->zzaht:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v1, p1, v6}, Lcom/google/android/gms/internal/measurement/zzeg;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzey$zza;)I

    move-result v1

    sub-int/2addr v1, v5

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/String;

    aput-object p1, v8, v2

    aput-object p1, v8, v5

    const/4 v2, 0x2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v8, v2

    invoke-virtual {v6, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Error pruning currencies. appId"

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v2, v6, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v8, p2, Lcom/google/android/gms/internal/measurement/zzew;->origin:Ljava/lang/String;

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    move-object v6, v0

    move-object v7, p1

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzkb;)Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string v1, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v3

    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    invoke-virtual {p2, v1, v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const/16 v8, 0x9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_6
    return v5
.end method

.method private final zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzku;[Lcom/google/android/gms/internal/measurement/zzkp;)[Lcom/google/android/gms/internal/measurement/zzko;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjd()Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p2}, Lcom/google/android/gms/internal/measurement/zzeb;->zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzkp;[Lcom/google/android/gms/internal/measurement/zzku;)[Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object p1

    return-object p1
.end method

.method private final zzab()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    return-void
.end method

.method private final zzb(Lcom/google/android/gms/internal/measurement/zzdy;)V
    .locals 10
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xcc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->getAppInstanceId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    sget-object v3, Lcom/google/android/gms/internal/measurement/zzey;->zzagt:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/zzey;->zzagu:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    const-string v4, "config/app/"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v3, "app_instance_id"

    invoke-virtual {v0, v3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "platform"

    const-string v3, "android"

    invoke-virtual {v0, v1, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "gmp_version"

    const-string v3, "12451"

    invoke-virtual {v0, v1, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Fetching remote configuration"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbt(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkm;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbu(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v1}, Landroid/support/v4/util/ArrayMap;-><init>()V

    const-string v2, "If-Modified-Since"

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, v1

    goto :goto_1

    :cond_2
    move-object v6, v2

    :goto_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqw:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkw()Lcom/google/android/gms/internal/measurement/zzfl;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzjv;

    invoke-direct {v7, p0}, Lcom/google/android/gms/internal/measurement/zzjv;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v8

    new-instance v9, Lcom/google/android/gms/internal/measurement/zzfp;

    const/4 v5, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzfp;-><init>(Lcom/google/android/gms/internal/measurement/zzfl;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/internal/measurement/zzfn;)V

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzgh;->zzd(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to parse config URL. Not fetching. appId"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final zzc(Lcom/google/android/gms/internal/measurement/zzdy;)Ljava/lang/Boolean;
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v4, v0, v2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz v4, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v3

    int-to-long v5, v2

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 31
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v15, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    invoke-virtual {v6, v2, v3}, Lcom/google/android/gms/internal/measurement/zzkc;->zzd(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)Z

    move-result v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    iget-boolean v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v6, :cond_1

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v6

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v6, v15, v7}, Lcom/google/android/gms/internal/measurement/zzgg;->zzn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    const/4 v14, 0x0

    const/4 v13, 0x1

    if-eqz v6, :cond_6

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Dropping blacklisted event. appId"

    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v6

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v3

    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbx(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v3

    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/measurement/zzgg;->zzby(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    move v13, v14

    :cond_3
    :goto_0
    if-nez v13, :cond_4

    const-string v3, "_err"

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const/16 v8, 0xb

    const-string v9, "_ev"

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    const/4 v11, 0x0

    move-object v7, v15

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_4
    if-eqz v13, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgu()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgt()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v5

    sub-long v7, v5, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzaho:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_5

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Fetching config for blacklisted app"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzdy;)V

    :cond_5
    return-void

    :cond_6
    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    const/4 v12, 0x2

    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/measurement/zzfh;->isLoggable(I)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v7, "Logging event"

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v8

    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/zzff;->zzb(Lcom/google/android/gms/internal/measurement/zzew;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    const-string v6, "_iap"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "ecommerce_purchase"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    :cond_8
    invoke-direct {v1, v15, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzew;)Z

    move-result v6

    if-nez v6, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :cond_9
    :try_start_1
    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcb(Ljava/lang/String;)Z

    move-result v16

    const-string v6, "_err"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzla()J

    move-result-wide v7

    const/4 v10, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v9, v15

    move/from16 v11, v16

    move/from16 v12, v18

    move/from16 v13, v17

    move-wide/from16 v20, v4

    move v4, v14

    move/from16 v14, v19

    invoke-virtual/range {v6 .. v14}, Lcom/google/android/gms/internal/measurement/zzej;->zza(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/internal/measurement/zzek;

    move-result-object v5

    iget-wide v6, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzaff:J

    sget-object v8, Lcom/google/android/gms/internal/measurement/zzey;->zzagz:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    int-to-long v8, v8

    sub-long v10, v6, v8

    const-wide/16 v13, 0x0

    cmp-long v6, v10, v13

    const-wide/16 v7, 0x3e8

    const-wide/16 v13, 0x1

    if-lez v6, :cond_b

    rem-long/2addr v10, v7

    cmp-long v2, v10, v13

    if-nez v2, :cond_a

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Data loss. Too many events logged. appId, count"

    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzaff:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :cond_b
    if-eqz v16, :cond_d

    :try_start_2
    iget-wide v9, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzafe:J

    sget-object v6, Lcom/google/android/gms/internal/measurement/zzey;->zzahb:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-long v11, v6

    sub-long v18, v9, v11

    const-wide/16 v9, 0x0

    cmp-long v6, v18, v9

    if-lez v6, :cond_d

    rem-long v18, v18, v7

    cmp-long v3, v18, v13

    if-nez v3, :cond_c

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. appId, count"

    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    iget-wide v7, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzafe:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v6, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_c
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const/16 v8, 0x10

    const-string v9, "_ev"

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    const/4 v11, 0x0

    move-object v7, v15

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :cond_d
    if-eqz v17, :cond_f

    :try_start_3
    iget-wide v6, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzafh:J

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/internal/measurement/zzey;->zzaha:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzeg;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzey$zza;)I

    move-result v8

    const v9, 0xf4240

    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    int-to-long v8, v8

    sub-long v10, v6, v8

    const-wide/16 v6, 0x0

    cmp-long v8, v10, v6

    if-lez v8, :cond_f

    cmp-long v2, v10, v13

    if-nez v2, :cond_e

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Too many error events logged. appId, count"

    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzafh:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :cond_f
    :try_start_4
    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzet;->zzij()Landroid/os/Bundle;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const-string v7, "_o"

    iget-object v8, v2, Lcom/google/android/gms/internal/measurement/zzew;->origin:Ljava/lang/String;

    invoke-virtual {v6, v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/measurement/zzkc;->zzci(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_10

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const-string v7, "_dbg"

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const-string v7, "_r"

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/measurement/zzej;->zzbc(Ljava/lang/String;)J

    move-result-wide v6

    const-wide/16 v13, 0x0

    cmp-long v8, v6, v13

    if-lez v8, :cond_11

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v9, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v15}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v8, v9, v10, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_11
    new-instance v11, Lcom/google/android/gms/internal/measurement/zzer;

    iget-object v7, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    iget-object v8, v2, Lcom/google/android/gms/internal/measurement/zzew;->origin:Ljava/lang/String;

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    iget-wide v13, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzagc:J

    const-wide/16 v17, 0x0

    move-object v6, v11

    move-object v9, v15

    move-object v2, v11

    move-wide v11, v13

    move-wide/from16 v13, v17

    move-object v4, v15

    move-object v15, v5

    invoke-direct/range {v6 .. v15}, Lcom/google/android/gms/internal/measurement/zzer;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzer;->name:Ljava/lang/String;

    invoke-virtual {v5, v4, v6}, Lcom/google/android/gms/internal/measurement/zzej;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v5

    if-nez v5, :cond_13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zzbf(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v7, 0x1f4

    cmp-long v9, v5, v7

    if-ltz v9, :cond_12

    if-eqz v16, :cond_12

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v5, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v7

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzer;->name:Ljava/lang/String;

    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x1f4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v5, v6, v2, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v4

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :cond_12
    :try_start_5
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v8, v2, Lcom/google/android/gms/internal/measurement/zzer;->name:Ljava/lang/String;

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    iget-wide v13, v2, Lcom/google/android/gms/internal/measurement/zzer;->timestamp:J

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v6, v5

    move-object v7, v4

    invoke-direct/range {v6 .. v19}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object v11, v2

    goto :goto_1

    :cond_13
    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    iget-wide v6, v5, Lcom/google/android/gms/internal/measurement/zzes;->zzafu:J

    invoke-virtual {v2, v4, v6, v7}, Lcom/google/android/gms/internal/measurement/zzer;->zza(Lcom/google/android/gms/internal/measurement/zzgm;J)Lcom/google/android/gms/internal/measurement/zzer;

    move-result-object v11

    iget-wide v6, v11, Lcom/google/android/gms/internal/measurement/zzer;->timestamp:J

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzes;->zzac(J)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v5

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzes;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-static {v11}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzti:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzti:Ljava/lang/String;

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzks;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzks;-><init>()V

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatt:Ljava/lang/Integer;

    const-string v5, "android"

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaub:Ljava/lang/String;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadt:Ljava/lang/String;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzadt:Ljava/lang/String;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzth:Ljava/lang/String;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzth:Ljava/lang/String;

    iget-wide v5, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzads:J

    const-wide/32 v7, -0x80000000

    cmp-long v9, v5, v7

    const/4 v5, 0x0

    if-nez v9, :cond_14

    move-object v6, v5

    goto :goto_2

    :cond_14
    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzads:J

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_2
    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaun:Ljava/lang/Integer;

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadu:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzauf:Ljava/lang/Long;

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzadm:Ljava/lang/String;

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadv:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-nez v10, :cond_15

    move-object v6, v5

    goto :goto_3

    :cond_15
    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadv:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_3
    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzauj:Ljava/lang/Long;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v6

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzfs;->zzbn(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v6

    if-eqz v6, :cond_16

    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_16

    iget-boolean v7, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzady:Z

    if-eqz v7, :cond_19

    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iput-object v7, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzauh:Ljava/lang/String;

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaui:Ljava/lang/Boolean;

    goto :goto_5

    :cond_16
    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzeq;->zzf(Landroid/content/Context;)Z

    move-result v6

    if-nez v6, :cond_19

    iget-boolean v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadz:Z

    if-eqz v6, :cond_19

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const-string v7, "android_id"

    invoke-static {v6, v7}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_17

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v7, "null secure ID. appId"

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v6, v7, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "null"

    goto :goto_4

    :cond_17
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_18

    iget-object v7, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v7

    const-string v10, "empty secure ID. appId"

    iget-object v12, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_18
    :goto_4
    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzauq:Ljava/lang/String;

    :cond_19
    :goto_5
    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaud:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzauc:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzeq;->zzig()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaue:Ljava/lang/Integer;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzeq;->zzih()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzafo:Ljava/lang/String;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaug:Ljava/lang/Long;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatw:Ljava/lang/Long;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadx:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaus:Ljava/lang/Long;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->isEnabled()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzeg;->zzho()Z

    move-result v6

    if-eqz v6, :cond_1a

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaut:Ljava/lang/String;

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v5

    if-nez v5, :cond_1b

    new-instance v5, Lcom/google/android/gms/internal/measurement/zzdy;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-direct {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;Ljava/lang/String;)V

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfc;->zzio()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->zzak(Ljava/lang/String;)V

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzado:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->zzan(Ljava/lang/String;)V

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->zzal(Ljava/lang/String;)V

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v6

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzfs;->zzbo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->zzam(Ljava/lang/String;)V

    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/internal/measurement/zzdy;->zzr(J)V

    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/internal/measurement/zzdy;->zzm(J)V

    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/internal/measurement/zzdy;->zzn(J)V

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzth:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->setAppVersion(Ljava/lang/String;)V

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzads:J

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzo(J)V

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadt:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->zzao(Ljava/lang/String;)V

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadu:J

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzp(J)V

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadv:J

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzq(J)V

    iget-boolean v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->setMeasurementEnabled(Z)V

    iget-wide v6, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadx:J

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzaa(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    :cond_1b
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->getAppInstanceId()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzadl:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgl()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzado:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzba(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lcom/google/android/gms/internal/measurement/zzku;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    const/4 v5, 0x0

    :goto_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1c

    new-instance v6, Lcom/google/android/gms/internal/measurement/zzku;

    invoke-direct {v6}, Lcom/google/android/gms/internal/measurement/zzku;-><init>()V

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    aput-object v6, v7, v5

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    iput-object v7, v6, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-wide v12, v7, Lcom/google/android/gms/internal/measurement/zzkb;->zzarl:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v6, Lcom/google/android/gms/internal/measurement/zzku;->zzauz:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v7

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v10, v10, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    invoke-virtual {v7, v6, v10}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzku;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_1c
    :try_start_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzks;)J

    move-result-wide v5
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    iget-object v3, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    if-eqz v3, :cond_1f

    iget-object v3, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v10, "_r"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1d

    goto :goto_7

    :cond_1e
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v3

    iget-object v7, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzti:Ljava/lang/String;

    iget-object v10, v11, Lcom/google/android/gms/internal/measurement/zzer;->name:Ljava/lang/String;

    invoke-virtual {v3, v7, v10}, Lcom/google/android/gms/internal/measurement/zzgg;->zzo(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v22

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzla()J

    move-result-wide v23

    iget-object v7, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzti:Ljava/lang/String;

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v25, v7

    invoke-virtual/range {v22 .. v30}, Lcom/google/android/gms/internal/measurement/zzej;->zza(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/internal/measurement/zzek;

    move-result-object v7

    if-eqz v3, :cond_1f

    iget-wide v12, v7, Lcom/google/android/gms/internal/measurement/zzek;->zzafi:J

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v3

    iget-object v7, v11, Lcom/google/android/gms/internal/measurement/zzer;->zzti:Ljava/lang/String;

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/measurement/zzeg;->zzaq(Ljava/lang/String;)I

    move-result v3

    int-to-long v14, v3

    cmp-long v3, v12, v14

    if-gez v3, :cond_1f

    goto :goto_7

    :cond_1f
    const/4 v4, 0x0

    :goto_7
    invoke-virtual {v2, v11, v5, v6, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzer;JZ)Z

    move-result v2

    if-eqz v2, :cond_20

    iput-wide v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    goto :goto_8

    :catch_0
    move-exception v0

    move-object v3, v0

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v5, "Data loss. Failed to insert raw event metadata. appId"

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_20
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzfh;->isLoggable(I)Z

    move-result v2

    if-eqz v2, :cond_21

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Event recorded"

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/measurement/zzff;->zza(Lcom/google/android/gms/internal/measurement/zzer;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_21
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Background event processing time, ms"

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v6, v4, v20

    const-wide/32 v4, 0x7a120

    add-long v8, v6, v4

    const-wide/32 v4, 0xf4240

    div-long/2addr v8, v4

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw v2
.end method

.method private final zzd(Ljava/lang/String;J)Z
    .locals 59
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/internal/measurement/zzjs$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzjt;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v4

    iget-wide v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzard:J

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const-wide/16 v7, -0x1

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    :try_start_1
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v15

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-eqz v12, :cond_3

    cmp-long v12, v5, v7

    if-eqz v12, :cond_0

    :try_start_2
    new-array v12, v9, [Ljava/lang/String;

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v10

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v11
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object v6, v3

    goto/16 :goto_3c

    :catch_0
    move-exception v0

    move-object v6, v3

    move-object v12, v6

    :goto_0
    move-object v3, v0

    goto/16 :goto_c

    :cond_0
    :try_start_3
    new-array v12, v11, [Ljava/lang/String;

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v12, v10
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    :goto_1
    cmp-long v13, v5, v7

    if-eqz v13, :cond_1

    :try_start_4
    const-string v13, "rowid <= ? and "
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :cond_1
    :try_start_5
    const-string v13, ""

    :goto_2
    const/16 v14, 0x94

    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v14, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v14, "select app_id, metadata_fingerprint from raw_events where "

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v3, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :try_start_6
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_9
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v12, :cond_2

    if-eqz v3, :cond_d

    :goto_3
    :try_start_7
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto/16 :goto_d

    :cond_2
    :try_start_8
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_9
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object/from16 v22, v3

    move-object v3, v12

    move-object/from16 v21, v13

    goto :goto_6

    :catch_1
    move-exception v0

    move-object v6, v3

    goto :goto_0

    :cond_3
    cmp-long v3, v5, v7

    if-eqz v3, :cond_4

    :try_start_a
    new-array v3, v9, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v12, v3, v10

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v3, v11

    goto :goto_4

    :cond_4
    new-array v3, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v12, v3, v10

    :goto_4
    cmp-long v12, v5, v7

    if-eqz v12, :cond_5

    const-string v12, " and rowid <= ?"

    goto :goto_5

    :cond_5
    const-string v12, ""

    :goto_5
    const/16 v13, 0x54

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    add-int/2addr v13, v14

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v13, "select metadata_fingerprint from raw_events where app_id = ?"

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " order by rowid limit 1;"

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15, v12, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :try_start_b
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12

    if-nez v12, :cond_6

    if-eqz v3, :cond_d

    goto :goto_3

    :cond_6
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-object/from16 v22, v3

    move-object/from16 v21, v13

    const/4 v3, 0x0

    :goto_6
    :try_start_c
    const-string v13, "raw_events_metadata"

    new-array v14, v11, [Ljava/lang/String;

    const-string v12, "metadata"

    aput-object v12, v14, v10

    const-string v16, "app_id = ? and metadata_fingerprint = ?"

    new-array v12, v9, [Ljava/lang/String;

    aput-object v3, v12, v10

    aput-object v21, v12, v11

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v19, "rowid"

    const-string v20, "2"

    move-object/from16 v23, v12

    move-object v12, v15

    move-object/from16 v24, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v23

    invoke-virtual/range {v12 .. v20}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v15
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_8
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :try_start_d
    invoke-interface {v15}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    if-nez v12, :cond_7

    :try_start_e
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Raw event metadata record is missing. appId"

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v5, v6, v12}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    if-eqz v15, :cond_d

    :try_start_f
    invoke-interface {v15}, Landroid/database/Cursor;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto/16 :goto_d

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object v6, v15

    goto/16 :goto_3c

    :catch_2
    move-exception v0

    move-object v12, v3

    move-object v6, v15

    goto/16 :goto_0

    :cond_7
    :try_start_10
    invoke-interface {v15, v10}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v12

    array-length v13, v12

    invoke-static {v12, v10, v13}, Lcom/google/android/gms/internal/measurement/zzabx;->zza([BII)Lcom/google/android/gms/internal/measurement/zzabx;

    move-result-object v12

    new-instance v13, Lcom/google/android/gms/internal/measurement/zzks;

    invoke-direct {v13}, Lcom/google/android/gms/internal/measurement/zzks;-><init>()V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :try_start_11
    invoke-virtual {v13, v12}, Lcom/google/android/gms/internal/measurement/zzacg;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :try_start_12
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    move-result v12
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    if-eqz v12, :cond_8

    :try_start_13
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v12

    const-string v14, "Get multiple raw event metadata records, expected one. appId"

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v12, v14, v9}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_2
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    :cond_8
    :try_start_14
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    invoke-interface {v2, v13}, Lcom/google/android/gms/internal/measurement/zzel;->zzb(Lcom/google/android/gms/internal/measurement/zzks;)V
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    cmp-long v9, v5, v7

    const/4 v14, 0x3

    if-eqz v9, :cond_9

    :try_start_15
    const-string v9, "app_id = ? and metadata_fingerprint = ? and rowid <= ?"

    new-array v12, v14, [Ljava/lang/String;

    aput-object v3, v12, v10

    aput-object v21, v12, v11

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v12, v6
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_2
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    move-object v5, v9

    move-object/from16 v16, v12

    goto :goto_7

    :cond_9
    :try_start_16
    const-string v5, "app_id = ? and metadata_fingerprint = ?"

    const/4 v6, 0x2

    new-array v9, v6, [Ljava/lang/String;

    aput-object v3, v9, v10

    aput-object v21, v9, v11

    move-object/from16 v16, v9

    :goto_7
    const-string v13, "raw_events"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/String;

    const-string v9, "rowid"

    aput-object v9, v6, v10

    const-string v9, "name"

    aput-object v9, v6, v11

    const-string v9, "timestamp"

    const/4 v12, 0x2

    aput-object v9, v6, v12

    const-string v9, "data"

    aput-object v9, v6, v14

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v19, "rowid"
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    const/16 v20, 0x0

    move-object/from16 v12, v24

    move v9, v14

    move-object v14, v6

    move-object v6, v15

    move-object v15, v5

    :try_start_17
    invoke-virtual/range {v12 .. v20}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_6
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    :try_start_18
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-nez v6, :cond_a

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v9, "Raw event data disappeared while in transaction. appId"

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v6, v9, v12}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_4
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    if-eqz v5, :cond_d

    :goto_8
    :try_start_19
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    goto/16 :goto_d

    :cond_a
    :goto_9
    :try_start_1a
    invoke-interface {v5, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    invoke-interface {v5, v9}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v6

    array-length v14, v6

    invoke-static {v6, v10, v14}, Lcom/google/android/gms/internal/measurement/zzabx;->zza([BII)Lcom/google/android/gms/internal/measurement/zzabx;

    move-result-object v6

    new-instance v14, Lcom/google/android/gms/internal/measurement/zzkp;

    invoke-direct {v14}, Lcom/google/android/gms/internal/measurement/zzkp;-><init>()V
    :try_end_1a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1a .. :try_end_1a} :catch_4
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    :try_start_1b
    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/measurement/zzacg;->zzb(Lcom/google/android/gms/internal/measurement/zzabx;)Lcom/google/android/gms/internal/measurement/zzacg;
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1b .. :try_end_1b} :catch_4
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    :try_start_1c
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    const/4 v6, 0x2

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-interface {v2, v12, v13, v14}, Lcom/google/android/gms/internal/measurement/zzel;->zza(JLcom/google/android/gms/internal/measurement/zzkp;)Z

    move-result v6

    if-nez v6, :cond_b

    if-eqz v5, :cond_d

    goto :goto_8

    :catch_3
    move-exception v0

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v7, "Data loss. Failed to merge raw event. appId"

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6
    :try_end_1c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1c .. :try_end_1c} :catch_4
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    if-nez v6, :cond_c

    if-eqz v5, :cond_d

    goto :goto_8

    :cond_c
    const-wide/16 v7, -0x1

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v2, v0

    move-object v6, v5

    goto/16 :goto_3c

    :catch_4
    move-exception v0

    move-object v12, v3

    move-object v6, v5

    goto/16 :goto_0

    :catch_5
    move-exception v0

    move-object v6, v15

    :try_start_1d
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v7, "Data loss. Failed to merge raw event metadata. appId"

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v7, v8, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1d .. :try_end_1d} :catch_6
    .catchall {:try_start_1d .. :try_end_1d} :catchall_6

    if-eqz v6, :cond_d

    :goto_a
    :try_start_1e
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    goto :goto_d

    :catch_6
    move-exception v0

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v6, v15

    goto/16 :goto_3b

    :catch_7
    move-exception v0

    move-object v6, v15

    :goto_b
    move-object v12, v3

    goto/16 :goto_0

    :catchall_4
    move-exception v0

    move-object v2, v0

    move-object/from16 v6, v22

    goto/16 :goto_3c

    :catch_8
    move-exception v0

    move-object v12, v3

    move-object/from16 v6, v22

    goto/16 :goto_0

    :catch_9
    move-exception v0

    move-object v6, v3

    const/4 v12, 0x0

    goto/16 :goto_0

    :catchall_5
    move-exception v0

    move-object v2, v0

    const/4 v6, 0x0

    goto/16 :goto_3c

    :catch_a
    move-exception v0

    move-object v3, v0

    const/4 v6, 0x0

    const/4 v12, 0x0

    :goto_c
    :try_start_1f
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v5, "Data loss. Error selecting raw event. appId"

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v5, v7, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_6

    if-eqz v6, :cond_d

    goto :goto_a

    :cond_d
    :goto_d
    :try_start_20
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarj:Ljava/util/List;

    if-eqz v3, :cond_f

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarj:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_e

    :cond_e
    move v3, v10

    goto :goto_f

    :cond_f
    :goto_e
    move v3, v11

    :goto_f
    if-nez v3, :cond_5e

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarj:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Lcom/google/android/gms/internal/measurement/zzkp;

    iput-object v4, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v4

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzeg;->zzau(Ljava/lang/String;)Z

    move-result v4

    move v7, v10

    move v8, v7

    move v9, v8

    const-wide/16 v12, 0x0

    :goto_10
    iget-object v14, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarj:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    if-ge v7, v14, :cond_2b

    iget-object v14, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarj:Ljava/util/List;

    invoke-interface {v14, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/zzkp;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v15

    iget-object v11, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v11, v11, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v15, v11, v5}, Lcom/google/android/gms/internal/measurement/zzgg;->zzn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Dropping blacklisted raw event. appId"

    iget-object v11, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v11, v11, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    iget-object v15, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v15

    iget-object v10, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v6, v11, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbx(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_11

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzgg;->zzby(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_11

    :cond_10
    const/4 v5, 0x0

    goto :goto_12

    :cond_11
    :goto_11
    const/4 v5, 0x1

    :goto_12
    if-nez v5, :cond_12

    const-string v5, "_err"

    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v15

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const/16 v17, 0xb

    const-string v18, "_ev"

    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    const/16 v20, 0x0

    move-object/from16 v16, v5

    move-object/from16 v19, v6

    invoke-virtual/range {v15 .. v20}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_12
    move/from16 v28, v7

    goto/16 :goto_20

    :cond_13
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v10, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v5, v6, v10}, Lcom/google/android/gms/internal/measurement/zzgg;->zzo(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_15

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/zzkc;->zzck(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_14

    goto :goto_13

    :cond_14
    move/from16 v28, v7

    goto/16 :goto_1b

    :cond_15
    :goto_13
    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    if-nez v6, :cond_16

    const/4 v6, 0x0

    new-array v10, v6, [Lcom/google/android/gms/internal/measurement/zzkq;

    iput-object v10, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    :cond_16
    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v10, v6

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_14
    if-ge v11, v10, :cond_19

    move/from16 v25, v10

    aget-object v10, v6, v11

    move-object/from16 v26, v6

    const-string v6, "_c"

    move/from16 v27, v8

    iget-object v8, v10, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    move/from16 v28, v7

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v8, v10, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    const/4 v15, 0x1

    goto :goto_15

    :cond_17
    move/from16 v28, v7

    const-string v6, "_r"

    iget-object v7, v10, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v8, v10, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    const/16 v16, 0x1

    :cond_18
    :goto_15
    add-int/lit8 v11, v11, 0x1

    move/from16 v10, v25

    move-object/from16 v6, v26

    move/from16 v8, v27

    move/from16 v7, v28

    goto :goto_14

    :cond_19
    move/from16 v28, v7

    move/from16 v27, v8

    if-nez v15, :cond_1a

    if-eqz v5, :cond_1a

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v7, "Marking event as conversion"

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v8

    iget-object v10, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    iget-object v7, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v7, v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lcom/google/android/gms/internal/measurement/zzkq;

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzkq;

    invoke-direct {v7}, Lcom/google/android/gms/internal/measurement/zzkq;-><init>()V

    const-string v8, "_c"

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    array-length v8, v6

    const/4 v10, 0x1

    sub-int/2addr v8, v10

    aput-object v7, v6, v8

    iput-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    :cond_1a
    if-nez v16, :cond_1b

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v6

    const-string v7, "Marking event as real-time"

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v8

    iget-object v10, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    iget-object v7, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v7, v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lcom/google/android/gms/internal/measurement/zzkq;

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzkq;

    invoke-direct {v7}, Lcom/google/android/gms/internal/measurement/zzkq;-><init>()V

    const-string v8, "_r"

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    array-length v8, v6

    const/4 v10, 0x1

    sub-int/2addr v8, v10

    aput-object v7, v6, v8

    iput-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    :cond_1b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v29

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzla()J

    move-result-wide v30

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x1

    move-object/from16 v32, v6

    invoke-virtual/range {v29 .. v37}, Lcom/google/android/gms/internal/measurement/zzej;->zza(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/internal/measurement/zzek;

    move-result-object v6

    iget-wide v6, v6, Lcom/google/android/gms/internal/measurement/zzek;->zzafi:J

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v8

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v10, v10, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/measurement/zzeg;->zzaq(Ljava/lang/String;)I

    move-result v8

    int-to-long v10, v8

    cmp-long v8, v6, v10

    if-lez v8, :cond_20

    const/4 v6, 0x0

    :goto_16
    iget-object v7, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v7, v7

    if-ge v6, v7, :cond_1f

    const-string v7, "_r"

    iget-object v8, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    aget-object v8, v8, v6

    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1e

    iget-object v7, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v7, v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    new-array v7, v7, [Lcom/google/android/gms/internal/measurement/zzkq;

    if-lez v6, :cond_1c

    iget-object v8, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const/4 v10, 0x0

    invoke-static {v8, v10, v7, v10, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1c
    array-length v8, v7

    if-ge v6, v8, :cond_1d

    iget-object v8, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    add-int/lit8 v10, v6, 0x1

    array-length v11, v7

    sub-int/2addr v11, v6

    invoke-static {v8, v10, v7, v6, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1d
    iput-object v7, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    goto :goto_17

    :cond_1e
    add-int/lit8 v6, v6, 0x1

    goto :goto_16

    :cond_1f
    :goto_17
    move/from16 v8, v27

    goto :goto_18

    :cond_20
    const/4 v8, 0x1

    :goto_18
    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/zzkc;->zzcb(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_26

    if-eqz v5, :cond_26

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v29

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzla()J

    move-result-wide v30

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x1

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v32, v5

    invoke-virtual/range {v29 .. v37}, Lcom/google/android/gms/internal/measurement/zzej;->zza(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/internal/measurement/zzek;

    move-result-object v5

    iget-wide v5, v5, Lcom/google/android/gms/internal/measurement/zzek;->zzafg:J

    iget-object v7, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v7

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v10, v10, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    sget-object v11, Lcom/google/android/gms/internal/measurement/zzey;->zzahc:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v7, v10, v11}, Lcom/google/android/gms/internal/measurement/zzeg;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzey$zza;)I

    move-result v7

    int-to-long v10, v7

    cmp-long v7, v5, v10

    if-lez v7, :cond_26

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Too many conversions. Not logging as conversion. appId"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v6, v5

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_19
    if-ge v7, v6, :cond_23

    aget-object v15, v5, v7

    move-object/from16 v38, v5

    const-string v5, "_c"

    move/from16 v39, v6

    iget-object v6, v15, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    move-object v11, v15

    goto :goto_1a

    :cond_21
    const-string v5, "_err"

    iget-object v6, v15, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_22

    const/4 v10, 0x1

    :cond_22
    :goto_1a
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v5, v38

    move/from16 v6, v39

    goto :goto_19

    :cond_23
    if-eqz v10, :cond_24

    if-eqz v11, :cond_24

    iget-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const/4 v6, 0x1

    new-array v7, v6, [Lcom/google/android/gms/internal/measurement/zzkq;

    const/4 v6, 0x0

    aput-object v11, v7, v6

    invoke-static {v5, v7}, Lcom/google/android/gms/common/util/ArrayUtils;->removeAll([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lcom/google/android/gms/internal/measurement/zzkq;

    iput-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    goto :goto_1b

    :cond_24
    if-eqz v11, :cond_25

    const-string v5, "_err"

    iput-object v5, v11, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    const-wide/16 v5, 0xa

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v11, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    goto :goto_1b

    :cond_25
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Did not find conversion parameter. appId"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_26
    :goto_1b
    if-eqz v4, :cond_2a

    const-string v5, "_e"

    iget-object v6, v14, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2a

    iget-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    if-eqz v5, :cond_29

    iget-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v5, v5

    if-nez v5, :cond_27

    goto :goto_1d

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v5, "_et"

    invoke-static {v14, v5}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-nez v5, :cond_28

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Engagement event does not include duration. appId"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    :goto_1c
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1e

    :cond_28
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long v10, v12, v5

    goto :goto_1f

    :cond_29
    :goto_1d
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Engagement event does not contain any parameters. appId"

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_1c

    :cond_2a
    :goto_1e
    move-wide v10, v12

    :goto_1f
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    add-int/lit8 v6, v9, 0x1

    aput-object v14, v5, v9

    move v9, v6

    move-wide v12, v10

    :goto_20
    add-int/lit8 v7, v28, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto/16 :goto_10

    :cond_2b
    move/from16 v27, v8

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarj:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v9, v5, :cond_2c

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lcom/google/android/gms/internal/measurement/zzkp;

    iput-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    :cond_2c
    if-eqz v4, :cond_32

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v4

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const-string v6, "_lte"

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzej;->zzh(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkb;

    move-result-object v4

    if-eqz v4, :cond_2e

    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    if-nez v5, :cond_2d

    goto :goto_21

    :cond_2d
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v15, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const-string v16, "auto"

    const-string v17, "_lte"

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v18

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long v8, v6, v12

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v20

    move-object v14, v5

    invoke-direct/range {v14 .. v20}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object v4, v5

    goto :goto_22

    :cond_2e
    :goto_21
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const-string v30, "auto"

    const-string v31, "_lte"

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v32

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v34

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    invoke-direct/range {v28 .. v34}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_22
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzku;

    invoke-direct {v5}, Lcom/google/android/gms/internal/measurement/zzku;-><init>()V

    const-string v6, "_lte"

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzku;->zzauz:Ljava/lang/Long;

    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Long;

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzku;->zzatq:Ljava/lang/Long;

    const/4 v6, 0x0

    :goto_23
    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    array-length v7, v7

    if-ge v6, v7, :cond_30

    const-string v7, "_lte"

    iget-object v8, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    aget-object v8, v8, v6

    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2f

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    aput-object v5, v7, v6

    const/4 v6, 0x1

    goto :goto_24

    :cond_2f
    add-int/lit8 v6, v6, 0x1

    goto :goto_23

    :cond_30
    const/4 v6, 0x0

    :goto_24
    if-nez v6, :cond_31

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    array-length v7, v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lcom/google/android/gms/internal/measurement/zzku;

    iput-object v6, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    array-length v7, v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    aput-object v5, v6, v7

    :cond_31
    const-wide/16 v5, 0x0

    cmp-long v7, v12, v5

    if-lez v7, :cond_32

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzkb;)Z

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Updated lifetime engagement user property with value. Value"

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_32
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    invoke-direct {v1, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzku;[Lcom/google/android/gms/internal/measurement/zzkp;)[Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object v4

    iput-object v4, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzaum:[Lcom/google/android/gms/internal/measurement/zzko;

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v4

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzeg;->zzat(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4d

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    array-length v5, v5

    new-array v5, v5, [Lcom/google/android/gms/internal/measurement/zzkp;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzkc;->zzll()Ljava/security/SecureRandom;

    move-result-object v6

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    array-length v8, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_25
    if-ge v9, v8, :cond_4b

    aget-object v11, v7, v9

    iget-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    const-string v13, "_ep"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_37

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v12, "_en"

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzes;

    if-nez v13, :cond_33

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v13

    iget-object v14, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v14, v14, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v13, v14, v12}, Lcom/google/android/gms/internal/measurement/zzej;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v13

    invoke-interface {v4, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_33
    iget-object v12, v13, Lcom/google/android/gms/internal/measurement/zzes;->zzafw:Ljava/lang/Long;

    if-nez v12, :cond_36

    iget-object v12, v13, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    const-wide/16 v16, 0x1

    cmp-long v12, v14, v16

    if-lez v12, :cond_34

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    iget-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const-string v14, "_sr"

    iget-object v15, v13, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    invoke-static {v12, v14, v15}, Lcom/google/android/gms/internal/measurement/zzjy;->zza([Lcom/google/android/gms/internal/measurement/zzkq;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object v12

    iput-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    :cond_34
    iget-object v12, v13, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    if-eqz v12, :cond_35

    iget-object v12, v13, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_35

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    iget-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const-string v13, "_efs"

    move-object/from16 v40, v7

    const-wide/16 v14, 0x1

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v12, v13, v7}, Lcom/google/android/gms/internal/measurement/zzjy;->zza([Lcom/google/android/gms/internal/measurement/zzkq;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object v7

    iput-object v7, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    goto :goto_26

    :cond_35
    move-object/from16 v40, v7

    :goto_26
    add-int/lit8 v7, v10, 0x1

    aput-object v11, v5, v10

    move-object/from16 v57, v2

    move-object/from16 v58, v3

    move-object/from16 v56, v6

    move v10, v7

    :goto_27
    move/from16 v41, v8

    :goto_28
    const-wide/16 v14, 0x1

    goto/16 :goto_2f

    :cond_36
    move-object/from16 v40, v7

    move-object/from16 v57, v2

    move-object/from16 v58, v3

    move-object/from16 v56, v6

    goto :goto_27

    :cond_37
    move-object/from16 v40, v7

    const-string v7, "_dbg"

    const-wide/16 v12, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_3d

    if-nez v14, :cond_38

    goto :goto_2a

    :cond_38
    iget-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    array-length v13, v12

    const/4 v15, 0x0

    :goto_29
    if-ge v15, v13, :cond_3d

    move/from16 v41, v8

    aget-object v8, v12, v15

    move-object/from16 v42, v12

    iget-object v12, v8, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3c

    instance-of v7, v14, Ljava/lang/Long;

    if-eqz v7, :cond_39

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzkq;->zzatq:Ljava/lang/Long;

    invoke-virtual {v14, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3b

    :cond_39
    instance-of v7, v14, Ljava/lang/String;

    if-eqz v7, :cond_3a

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzkq;->zzajo:Ljava/lang/String;

    invoke-virtual {v14, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3b

    :cond_3a
    instance-of v7, v14, Ljava/lang/Double;

    if-eqz v7, :cond_3e

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzkq;->zzaro:Ljava/lang/Double;

    invoke-virtual {v14, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3e

    :cond_3b
    const/4 v7, 0x1

    goto :goto_2b

    :cond_3c
    add-int/lit8 v15, v15, 0x1

    move/from16 v8, v41

    move-object/from16 v12, v42

    goto :goto_29

    :cond_3d
    :goto_2a
    move/from16 v41, v8

    :cond_3e
    const/4 v7, 0x0

    :goto_2b
    if-nez v7, :cond_3f

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v7

    iget-object v8, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v7, v8, v12}, Lcom/google/android/gms/internal/measurement/zzgg;->zzp(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    goto :goto_2c

    :cond_3f
    const/4 v7, 0x1

    :goto_2c
    if-gtz v7, :cond_41

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v12, "Sample rate must be positive. event, rate"

    iget-object v13, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v12, v13, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v7, v10, 0x1

    aput-object v11, v5, v10

    :cond_40
    :goto_2d
    move-object/from16 v57, v2

    move-object/from16 v58, v3

    move-object/from16 v56, v6

    move v10, v7

    goto/16 :goto_28

    :cond_41
    iget-object v8, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzes;

    if-nez v8, :cond_42

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v12, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v12, v12, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v13, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v8, v12, v13}, Lcom/google/android/gms/internal/measurement/zzej;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v8

    if-nez v8, :cond_42

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v12, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v13, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v13, v13, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v14, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-virtual {v8, v12, v13, v14}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v12, v2, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v12, v12, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    iget-object v13, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    const-wide/16 v45, 0x1

    const-wide/16 v47, 0x1

    iget-object v14, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v49

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    move-object/from16 v42, v8

    move-object/from16 v43, v12

    move-object/from16 v44, v13

    invoke-direct/range {v42 .. v55}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    :cond_42
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    const-string v12, "_eid"

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkp;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    if-eqz v12, :cond_43

    const/4 v13, 0x1

    goto :goto_2e

    :cond_43
    const/4 v13, 0x0

    :goto_2e
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    const/4 v14, 0x1

    if-ne v7, v14, :cond_45

    add-int/lit8 v7, v10, 0x1

    aput-object v11, v5, v10

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_40

    iget-object v10, v8, Lcom/google/android/gms/internal/measurement/zzes;->zzafw:Ljava/lang/Long;

    if-nez v10, :cond_44

    iget-object v10, v8, Lcom/google/android/gms/internal/measurement/zzes;->zzafx:Ljava/lang/Long;

    if-nez v10, :cond_44

    iget-object v10, v8, Lcom/google/android/gms/internal/measurement/zzes;->zzafy:Ljava/lang/Boolean;

    if-eqz v10, :cond_40

    :cond_44
    const/4 v10, 0x0

    invoke-virtual {v8, v10, v10, v10}, Lcom/google/android/gms/internal/measurement/zzes;->zza(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v8

    iget-object v10, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    invoke-interface {v4, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2d

    :cond_45
    invoke-virtual {v6, v7}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v14

    if-nez v14, :cond_47

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    iget-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const-string v14, "_sr"

    move-object/from16 v56, v6

    int-to-long v6, v7

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-static {v12, v14, v15}, Lcom/google/android/gms/internal/measurement/zzjy;->zza([Lcom/google/android/gms/internal/measurement/zzkq;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object v12

    iput-object v12, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    add-int/lit8 v12, v10, 0x1

    aput-object v11, v5, v10

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_46

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v8, v7, v6, v7}, Lcom/google/android/gms/internal/measurement/zzes;->zza(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v8

    :cond_46
    iget-object v6, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    iget-object v7, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Lcom/google/android/gms/internal/measurement/zzes;->zzad(J)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v7

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v57, v2

    move-object/from16 v58, v3

    move v10, v12

    goto/16 :goto_28

    :cond_47
    move-object/from16 v56, v6

    iget-wide v14, v8, Lcom/google/android/gms/internal/measurement/zzes;->zzafv:J

    iget-object v6, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    move-object/from16 v57, v2

    move-object/from16 v58, v3

    sub-long v2, v16, v14

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/32 v14, 0x5265c00

    cmp-long v6, v2, v14

    if-ltz v6, :cond_49

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    iget-object v2, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const-string v3, "_efs"

    const-wide/16 v14, 0x1

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/measurement/zzjy;->zza([Lcom/google/android/gms/internal/measurement/zzkq;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object v2

    iput-object v2, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    iget-object v2, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    const-string v3, "_sr"

    int-to-long v6, v7

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v2, v3, v12}, Lcom/google/android/gms/internal/measurement/zzjy;->zza([Lcom/google/android/gms/internal/measurement/zzkq;Ljava/lang/String;Ljava/lang/Object;)[Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object v2

    iput-object v2, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    add-int/lit8 v2, v10, 0x1

    aput-object v11, v5, v10

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_48

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/4 v6, 0x0

    invoke-virtual {v8, v6, v3, v7}, Lcom/google/android/gms/internal/measurement/zzes;->zza(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v8

    :cond_48
    iget-object v3, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    iget-object v6, v11, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/measurement/zzes;->zzad(J)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v6

    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v10, v2

    goto :goto_2f

    :cond_49
    const-wide/16 v14, 0x1

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4a

    iget-object v2, v11, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v8, v12, v3, v3}, Lcom/google/android/gms/internal/measurement/zzes;->zza(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v6

    invoke-interface {v4, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4a
    :goto_2f
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v7, v40

    move/from16 v8, v41

    move-object/from16 v6, v56

    move-object/from16 v2, v57

    move-object/from16 v3, v58

    goto/16 :goto_25

    :cond_4b
    move-object/from16 v57, v2

    move-object v2, v3

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    array-length v3, v3

    if-ge v10, v3, :cond_4c

    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/google/android/gms/internal/measurement/zzkp;

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    :cond_4c
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_30
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzes;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzes;)V

    goto :goto_30

    :cond_4d
    move-object/from16 v57, v2

    move-object v2, v3

    :cond_4e
    const-wide v3, 0x7fffffffffffffffL

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    const-wide/high16 v3, -0x8000000000000000L

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    const/4 v3, 0x0

    :goto_31
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    array-length v4, v4

    if-ge v3, v4, :cond_51

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    aget-object v4, v4, v3

    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-gez v9, :cond_4f

    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    :cond_4f
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-lez v9, :cond_50

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    iput-object v4, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    :cond_50
    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    :cond_51
    move-object/from16 v3, v57

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v5

    if-nez v5, :cond_52

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Bundling raw events w/o app info. appId"

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_35

    :cond_52
    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    array-length v6, v6

    if-lez v6, :cond_56

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgn()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_53

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_32

    :cond_53
    const/4 v8, 0x0

    :goto_32
    iput-object v8, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaua:Ljava/lang/Long;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgm()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-nez v12, :cond_54

    goto :goto_33

    :cond_54
    move-wide v6, v8

    :goto_33
    cmp-long v8, v6, v10

    if-eqz v8, :cond_55

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_34

    :cond_55
    const/4 v6, 0x0

    :goto_34
    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatz:Ljava/lang/Long;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgv()V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgs()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzauk:Ljava/lang/Integer;

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzm(J)V

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzn(J)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhd()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaek:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    :cond_56
    :goto_35
    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    array-length v5, v5

    if-lez v5, :cond_5a

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v5

    iget-object v6, v3, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbt(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkm;

    move-result-object v5

    if-eqz v5, :cond_58

    iget-object v6, v5, Lcom/google/android/gms/internal/measurement/zzkm;->zzatb:Ljava/lang/Long;

    if-nez v6, :cond_57

    goto :goto_37

    :cond_57
    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzkm;->zzatb:Ljava/lang/Long;

    :goto_36
    iput-object v5, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzaur:Ljava/lang/Long;

    goto :goto_38

    :cond_58
    :goto_37
    iget-object v5, v3, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzadm:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_59

    const-wide/16 v5, -0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    goto :goto_36

    :cond_59
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Did not find measurement config or missing version info. appId"

    iget-object v7, v3, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzarh:Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_38
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    move/from16 v10, v27

    invoke-virtual {v5, v2, v10}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzks;Z)Z

    :cond_5a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzjs$zza;->zzari:Ljava/util/List;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "rowid in ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    :goto_39
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_5c

    if-eqz v6, :cond_5b

    const-string v7, ","

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5b
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_39

    :cond_5c
    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "raw_events"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-eq v5, v6, :cond_5d

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v6, "Deleted fewer rows from raw events table than expected"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v6, v5, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_7

    :try_start_21
    const-string v5, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-virtual {v3, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_21 .. :try_end_21} :catch_b
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    goto :goto_3a

    :catch_b
    move-exception v0

    move-object v3, v0

    :try_start_22
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v5, "Failed to remove unused event metadata. appId"

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v5, v4, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    const/4 v2, 0x1

    return v2

    :cond_5e
    :try_start_23
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    const/4 v2, 0x0

    return v2

    :catchall_6
    move-exception v0

    :goto_3b
    move-object v2, v0

    :goto_3c
    if-eqz v6, :cond_5f

    :try_start_24
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_5f
    throw v2
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_7

    :catchall_7
    move-exception v0

    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw v2
.end method

.method private final zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfs;->zzbo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdy;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdy;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfc;->zzio()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzak(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzam(Ljava/lang/String;)V

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgk()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzam(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc;->zzio()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzak(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzal(Ljava/lang/String;)V

    move v1, v2

    :cond_2
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzado:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzado:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzado:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzan(Ljava/lang/String;)V

    move v1, v2

    :cond_3
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadu:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-eqz v7, :cond_4

    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadu:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgq()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_4

    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadu:J

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdy;->zzp(J)V

    move v1, v2

    :cond_4
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzth:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzth:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzth:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->setAppVersion(Ljava/lang/String;)V

    move v1, v2

    :cond_5
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzads:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_6

    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzads:J

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdy;->zzo(J)V

    move v1, v2

    :cond_6
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadt:Ljava/lang/String;

    if-eqz v3, :cond_7

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadt:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgp()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzao(Ljava/lang/String;)V

    move v1, v2

    :cond_7
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadv:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgr()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_8

    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadv:J

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdy;->zzq(J)V

    move v1, v2

    :cond_8
    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->isMeasurementEnabled()Z

    move-result v4

    if-eq v3, v4, :cond_9

    iget-boolean v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->setMeasurementEnabled(Z)V

    move v1, v2

    :cond_9
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzaek:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzaek:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhc()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzaek:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzap(Ljava/lang/String;)V

    move v1, v2

    :cond_a
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadx:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhe()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_b

    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadx:J

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdy;->zzaa(J)V

    move v1, v2

    :cond_b
    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzady:Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhf()Z

    move-result v4

    if-eq v3, v4, :cond_c

    iget-boolean v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzady:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzd(Z)V

    move v1, v2

    :cond_c
    iget-boolean v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadz:Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhg()Z

    move-result v4

    if-eq v3, v4, :cond_d

    iget-boolean p1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadz:Z

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zze(Z)V

    move v1, v2

    :cond_d
    if-eqz v1, :cond_e

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    :cond_e
    return-object v0
.end method

.method public static zzg(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzjs;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqj:Lcom/google/android/gms/internal/measurement/zzjs;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/measurement/zzjs;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqj:Lcom/google/android/gms/internal/measurement/zzjs;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzjx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzjx;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;-><init>(Lcom/google/android/gms/internal/measurement/zzjx;)V

    sput-object p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqj:Lcom/google/android/gms/internal/measurement/zzjs;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqj:Lcom/google/android/gms/internal/measurement/zzjs;

    return-object p0
.end method

.method private final zzkv()Lcom/google/android/gms/internal/measurement/zzgg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqk:Lcom/google/android/gms/internal/measurement/zzgg;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqk:Lcom/google/android/gms/internal/measurement/zzgg;

    return-object v0
.end method

.method private final zzkx()Lcom/google/android/gms/internal/measurement/zzfq;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqn:Lcom/google/android/gms/internal/measurement/zzfq;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqn:Lcom/google/android/gms/internal/measurement/zzfq;

    return-object v0
.end method

.method private final zzky()Lcom/google/android/gms/internal/measurement/zzjo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqo:Lcom/google/android/gms/internal/measurement/zzjo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqo:Lcom/google/android/gms/internal/measurement/zzjo;

    return-object v0
.end method

.method private final zzla()J
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzfs;->zzakh:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    const-wide/16 v3, 0x1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkc;->zzll()Ljava/security/SecureRandom;

    move-result-object v5

    const v6, 0x5265c00

    invoke-virtual {v5, v6}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v5

    int-to-long v5, v5

    add-long v7, v3, v5

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzfs;->zzakh:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    move-wide v3, v7

    :cond_0
    add-long v5, v0, v3

    const-wide/16 v0, 0x3e8

    div-long/2addr v5, v0

    const-wide/16 v0, 0x3c

    div-long/2addr v5, v0

    div-long/2addr v5, v0

    const-wide/16 v0, 0x18

    div-long/2addr v5, v0

    return-wide v5
.end method

.method private final zzlc()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->zzhw()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->zzhr()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private final zzld()V
    .locals 20
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlh()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-wide v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    const-wide/32 v5, 0x36ee80

    iget-wide v7, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    sub-long v9, v1, v7

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    sub-long v7, v5, v1

    cmp-long v1, v7, v3

    if-lez v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Upload has been suspended. Will update scheduling later in approximately ms"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkx()Lcom/google/android/gms/internal/measurement/zzfq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfq;->unregister()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzky()Lcom/google/android/gms/internal/measurement/zzjo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjo;->cancel()V

    return-void

    :cond_1
    iput-wide v3, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzkd()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlc()Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_5

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzahp:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzej;->zzhx()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzej;->zzhs()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_0

    :cond_4
    const/4 v7, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v7, 0x1

    :goto_1
    if-eqz v7, :cond_7

    iget-object v9, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhn()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_6

    const-string v10, ".none."

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    sget-object v9, Lcom/google/android/gms/internal/measurement/zzey;->zzahk:Lcom/google/android/gms/internal/measurement/zzey$zza;

    goto :goto_2

    :cond_6
    sget-object v9, Lcom/google/android/gms/internal/measurement/zzey;->zzahj:Lcom/google/android/gms/internal/measurement/zzey$zza;

    goto :goto_2

    :cond_7
    sget-object v9, Lcom/google/android/gms/internal/measurement/zzey;->zzahi:Lcom/google/android/gms/internal/measurement/zzey$zza;

    :goto_2
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    iget-object v11, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v11

    iget-object v11, v11, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v11

    iget-object v13, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v13

    iget-object v13, v13, Lcom/google/android/gms/internal/measurement/zzfs;->zzake:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v15

    move-wide/from16 v16, v9

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzej;->zzhu()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v10

    move-wide/from16 v18, v5

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzej;->zzhv()J

    move-result-wide v5

    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    cmp-long v8, v5, v3

    if-nez v8, :cond_9

    :cond_8
    move-wide v5, v3

    goto/16 :goto_4

    :cond_9
    sub-long v8, v5, v1

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long v8, v1, v5

    sub-long v5, v11, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long v10, v1, v5

    sub-long v5, v13, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long v12, v1, v5

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-long v5, v8, v18

    if-eqz v7, :cond_a

    cmp-long v7, v1, v3

    if-lez v7, :cond_a

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    add-long v10, v5, v16

    move-wide v5, v10

    :cond_a
    iget-object v7, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v7

    move-wide/from16 v10, v16

    invoke-virtual {v7, v1, v2, v10, v11}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(JJ)Z

    move-result v7

    if-nez v7, :cond_b

    add-long v5, v1, v10

    :cond_b
    cmp-long v1, v12, v3

    if-eqz v1, :cond_d

    cmp-long v1, v12, v8

    if-ltz v1, :cond_d

    const/4 v1, 0x0

    :goto_3
    const/16 v2, 0x14

    sget-object v7, Lcom/google/android/gms/internal/measurement/zzey;->zzahr:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_8

    const-wide/16 v9, 0x1

    shl-long/2addr v9, v1

    sget-object v2, Lcom/google/android/gms/internal/measurement/zzey;->zzahq:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    mul-long/2addr v14, v9

    add-long v9, v5, v14

    cmp-long v2, v9, v12

    if-lez v2, :cond_c

    move-wide v5, v9

    goto :goto_4

    :cond_c
    add-int/lit8 v1, v1, 0x1

    move-wide v5, v9

    goto :goto_3

    :cond_d
    :goto_4
    cmp-long v1, v5, v3

    if-nez v1, :cond_e

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkx()Lcom/google/android/gms/internal/measurement/zzfq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfq;->unregister()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzky()Lcom/google/android/gms/internal/measurement/zzjo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjo;->cancel()V

    return-void

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkw()Lcom/google/android/gms/internal/measurement/zzfl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfl;->zzex()Z

    move-result v1

    if-nez v1, :cond_f

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkx()Lcom/google/android/gms/internal/measurement/zzfq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfq;->zzeu()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzky()Lcom/google/android/gms/internal/measurement/zzjo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjo;->cancel()V

    return-void

    :cond_f
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakf:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v1

    sget-object v7, Lcom/google/android/gms/internal/measurement/zzey;->zzahg:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v9, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v9

    invoke-virtual {v9, v1, v2, v7, v8}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(JJ)Z

    move-result v9

    if-nez v9, :cond_10

    add-long v9, v1, v7

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    :cond_10
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkx()Lcom/google/android/gms/internal/measurement/zzfq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfq;->unregister()V

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    sub-long v7, v5, v1

    cmp-long v1, v7, v3

    if-gtz v1, :cond_11

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzey;->zzahl:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_11
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Upload scheduled in approximately ms"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzky()Lcom/google/android/gms/internal/measurement/zzjo;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/zzjo;->zzh(J)V

    return-void

    :cond_12
    :goto_5
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkx()Lcom/google/android/gms/internal/measurement/zzfq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfq;->unregister()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzky()Lcom/google/android/gms/internal/measurement/zzjo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjo;->cancel()V

    return-void
.end method

.method private final zzle()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqw:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqx:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqy:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Stopping uploading service(s)"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqt:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqt:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqt:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Not stopping services. fetch, network, upload"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqw:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqx:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqy:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final zzlf()Z
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    const-string v0, "google_app_measurement.db"

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, v2, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzara:Ljava/nio/channels/FileChannel;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzara:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqz:Ljava/nio/channels/FileLock;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqz:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Storage concurrent access okay"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private final zzlh()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqr:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method protected final start()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->zzht()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    return-void
.end method

.method protected final zza(ILjava/lang/Throwable;[BLjava/lang/String;)V
    .locals 9
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    :try_start_0
    new-array p3, v0, [B

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0xc8

    const/4 v4, 0x1

    if-eq p1, v3, :cond_1

    const/16 v3, 0xcc

    if-ne p1, v3, :cond_6

    :cond_1
    if-nez p2, :cond_6

    :try_start_1
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p4

    invoke-interface {p4}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfs;->zzake:Lcom/google/android/gms/internal/measurement/zzfv;

    const-wide/16 v5, 0x0

    invoke-virtual {p2, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string p4, "Successful upload. Got network response. code, size"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    array-length p3, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p4, p1, p3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p4

    new-array v1, v4, [Ljava/lang/String;

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    const-string v3, "queue"

    const-string v7, "rowid=?"

    invoke-virtual {p4, v3, v7, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p4

    if-eq p4, v4, :cond_2

    new-instance p4, Landroid/database/sqlite/SQLiteException;

    const-string v1, "Deleted fewer rows from queue than expected"

    invoke-direct {p4, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw p4
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catch_0
    move-exception p4

    :try_start_5
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p3

    const-string v1, "Failed to delete a bundle in a queue table"

    invoke-virtual {p3, v1, p4}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    throw p4
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catch_1
    move-exception p3

    :try_start_6
    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarc:Ljava/util/List;

    if-eqz p4, :cond_3

    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarc:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :cond_3
    throw p3

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarc:Ljava/util/List;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkw()Lcom/google/android/gms/internal/measurement/zzfl;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfl;->zzex()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlc()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlb()V

    goto :goto_1

    :cond_5
    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzard:J

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    :goto_1
    iput-wide v5, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    goto/16 :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw p1
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catch_2
    move-exception p1

    :try_start_8
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string p3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p2, "Disable upload, time"

    iget-wide p3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p3

    const-string v2, "Network upload failed. Will retry later. code, error"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v2, v3, p2}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzfs;->zzake:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    const/16 p2, 0x1f7

    if-eq p1, p2, :cond_8

    const/16 p2, 0x1ad

    if-ne p1, p2, :cond_7

    goto :goto_2

    :cond_7
    move v4, v0

    :cond_8
    :goto_2
    if-eqz v4, :cond_9

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakf:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_9
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/measurement/zzeg;->zzaw(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zzc(Ljava/util/List;)V

    :cond_a
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqx:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzle()V

    return-void

    :goto_4
    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqx:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzle()V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzew;Ljava/lang/String;)[B
    .locals 32
    .param p1    # Lcom/google/android/gms/internal/measurement/zzew;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            min = 0x1L
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v15, p2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfr()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    new-instance v14, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-direct {v14}, Lcom/google/android/gms/internal/measurement/zzkr;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v12

    const/4 v13, 0x0

    if-nez v12, :cond_0

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Log and bundle not available. package_name"

    invoke-virtual {v2, v3, v15}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    new-array v2, v13, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-object v2

    :cond_0
    :try_start_1
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->isMeasurementEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Log and bundle disabled. package_name"

    invoke-virtual {v2, v3, v15}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v3, "_iap"

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "ecommerce_purchase"

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    invoke-direct {v1, v15, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzew;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Failed to handle purchase event at single event bundle creation. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v3

    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/measurement/zzeg;->zzau(Ljava/lang/String;)Z

    move-result v3

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    if-eqz v3, :cond_7

    const-string v5, "_e"

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    if-eqz v5, :cond_6

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzet;->size()I

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    const-string v6, "_et"

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzet;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-nez v5, :cond_5

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "The engagement event does not include duration. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    :goto_1
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    const-string v5, "_et"

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzet;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "The engagement event does not contain any parameters. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_1

    :cond_7
    :goto_3
    new-instance v8, Lcom/google/android/gms/internal/measurement/zzks;

    invoke-direct {v8}, Lcom/google/android/gms/internal/measurement/zzks;-><init>()V

    const/4 v9, 0x1

    new-array v5, v9, [Lcom/google/android/gms/internal/measurement/zzks;

    aput-object v8, v5, v13

    iput-object v5, v14, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatt:Ljava/lang/Integer;

    const-string v5, "android"

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzaub:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgp()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzadt:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzth:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v5

    const-wide/32 v16, -0x80000000

    cmp-long v7, v5, v16

    move-object/from16 v23, v14

    const/4 v14, 0x0

    if-nez v7, :cond_8

    move-object v5, v14

    goto :goto_4

    :cond_8
    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_4
    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzaun:Ljava/lang/Integer;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgq()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzauf:Ljava/lang/Long;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzadm:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgr()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzauj:Ljava/lang/Long;

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzeg;->zzho()Z

    move-result v5

    if-eqz v5, :cond_9

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v5

    iget-object v6, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzeg;->zzas(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    iput-object v14, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzaut:Ljava/lang/String;

    :cond_9
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v5

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzfs;->zzbn(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhf()Z

    move-result v6

    if-eqz v6, :cond_a

    if-eqz v5, :cond_a

    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iput-object v6, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzauh:Ljava/lang/String;

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzaui:Ljava/lang/Boolean;

    :cond_a
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzaud:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhi;->zzch()V

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzauc:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzeq;->zzig()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzaue:Ljava/lang/Integer;

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfx()Lcom/google/android/gms/internal/measurement/zzeq;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzeq;->zzih()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzafo:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->getAppInstanceId()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzadl:Ljava/lang/String;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgl()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzado:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzej;->zzba(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    new-array v6, v6, [Lcom/google/android/gms/internal/measurement/zzku;

    iput-object v6, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    if-eqz v3, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const-string v13, "_lte"

    invoke-virtual {v6, v7, v13}, Lcom/google/android/gms/internal/measurement/zzej;->zzh(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkb;

    move-result-object v6

    if-eqz v6, :cond_c

    iget-object v7, v6, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    if-nez v7, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    cmp-long v7, v16, v10

    if-lez v7, :cond_e

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v13, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const-string v18, "auto"

    const-string v19, "_lte"

    iget-object v14, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v14

    invoke-interface {v14}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v20

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v24

    add-long v10, v16, v24

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v16, v7

    move-object/from16 v17, v13

    invoke-direct/range {v16 .. v22}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object v6, v7

    goto :goto_6

    :cond_c
    :goto_5
    new-instance v6, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    const-string v18, "auto"

    const-string v19, "_lte"

    iget-object v10, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v10

    invoke-interface {v10}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v20

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v22, v4

    invoke-direct/range {v16 .. v22}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_6

    :cond_d
    const/4 v6, 0x0

    :cond_e
    :goto_6
    const/4 v7, 0x0

    const/4 v10, 0x0

    :goto_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-ge v7, v11, :cond_10

    new-instance v11, Lcom/google/android/gms/internal/measurement/zzku;

    invoke-direct {v11}, Lcom/google/android/gms/internal/measurement/zzku;-><init>()V

    iget-object v13, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    aput-object v11, v13, v7

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v13, v13, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    iput-object v13, v11, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-wide v13, v13, Lcom/google/android/gms/internal/measurement/zzkb;->zzarl:J

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    iput-object v13, v11, Lcom/google/android/gms/internal/measurement/zzku;->zzauz:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v13

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v14, v14, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    invoke-virtual {v13, v11, v14}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzku;Ljava/lang/Object;)V

    if-eqz v3, :cond_f

    const-string v13, "_lte"

    iget-object v14, v11, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    iget-object v10, v6, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Long;

    iput-object v10, v11, Lcom/google/android/gms/internal/measurement/zzku;->zzatq:Ljava/lang/Long;

    iget-object v10, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v10

    invoke-interface {v10}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iput-object v10, v11, Lcom/google/android/gms/internal/measurement/zzku;->zzauz:Ljava/lang/Long;

    move-object v10, v11

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_10
    if-eqz v3, :cond_11

    if-nez v10, :cond_11

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzku;

    invoke-direct {v3}, Lcom/google/android/gms/internal/measurement/zzku;-><init>()V

    const-string v5, "_lte"

    iput-object v5, v3, Lcom/google/android/gms/internal/measurement/zzku;->name:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v3, Lcom/google/android/gms/internal/measurement/zzku;->zzauz:Ljava/lang/Long;

    iget-object v5, v6, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    iput-object v5, v3, Lcom/google/android/gms/internal/measurement/zzku;->zzatq:Ljava/lang/Long;

    iget-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    array-length v7, v7

    add-int/2addr v7, v9

    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lcom/google/android/gms/internal/measurement/zzku;

    iput-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v5, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    array-length v7, v7

    sub-int/2addr v7, v9

    aput-object v3, v5, v7

    :cond_11
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v10, 0x0

    cmp-long v5, v3, v10

    if-lez v5, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzkb;)Z

    :cond_12
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzet;->zzij()Landroid/os/Bundle;

    move-result-object v14

    const-string v3, "_iap"

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-wide/16 v4, 0x1

    if-eqz v3, :cond_13

    const-string v3, "_c"

    invoke-virtual {v14, v3, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v6, "Marking in-app purchase as real-time"

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    const-string v3, "_r"

    invoke-virtual {v14, v3, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_13
    const-string v3, "_o"

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzew;->origin:Ljava/lang/String;

    invoke-virtual {v14, v3, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v3

    iget-object v6, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/zzkc;->zzci(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v3

    const-string v6, "_dbg"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v3, v14, v6, v7}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v3

    const-string v6, "_r"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v14, v6, v4}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v3, v15, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v3

    if-nez v3, :cond_15

    new-instance v13, Lcom/google/android/gms/internal/measurement/zzes;

    iget-object v5, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    const-wide/16 v6, 0x1

    const-wide/16 v16, 0x0

    iget-wide v3, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzagc:J

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v24, v3

    move-object v3, v13

    move-object v4, v15

    move-object/from16 v28, v8

    move-wide/from16 v8, v16

    move-wide/from16 v26, v10

    move-wide/from16 v10, v24

    move-object/from16 v29, v12

    move-object/from16 v30, v13

    move-wide/from16 v12, v18

    move-object/from16 v17, v14

    move-object/from16 v31, v23

    const/16 v18, 0x0

    move-object/from16 v14, v20

    move-object/from16 v15, v21

    move-object/from16 v16, v22

    invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/internal/measurement/zzes;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    move-object/from16 v4, v30

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzes;)V

    move-wide/from16 v9, v26

    goto :goto_8

    :cond_15
    move-object/from16 v28, v8

    move-wide/from16 v26, v10

    move-object/from16 v29, v12

    move-object/from16 v17, v14

    move-object/from16 v31, v23

    const/16 v18, 0x0

    iget-wide v4, v3, Lcom/google/android/gms/internal/measurement/zzes;->zzafu:J

    iget-wide v6, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzagc:J

    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/measurement/zzes;->zzac(J)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzes;->zzii()Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzes;)V

    move-wide v9, v4

    :goto_8
    new-instance v12, Lcom/google/android/gms/internal/measurement/zzer;

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzew;->origin:Ljava/lang/String;

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    iget-wide v7, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzagc:J

    move-object v2, v12

    move-object/from16 v5, p2

    move-object/from16 v11, v17

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/measurement/zzer;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzkp;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzkp;-><init>()V

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzkp;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    move-object/from16 v5, v28

    iput-object v3, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    iget-wide v6, v12, Lcom/google/android/gms/internal/measurement/zzer;->timestamp:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    iget-object v3, v12, Lcom/google/android/gms/internal/measurement/zzer;->name:Ljava/lang/String;

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzkp;->name:Ljava/lang/String;

    iget-wide v6, v12, Lcom/google/android/gms/internal/measurement/zzer;->zzafq:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzkp;->zzato:Ljava/lang/Long;

    iget-object v3, v12, Lcom/google/android/gms/internal/measurement/zzer;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzet;->size()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/zzkq;

    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    iget-object v3, v12, Lcom/google/android/gms/internal/measurement/zzer;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v6, v4

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    new-instance v8, Lcom/google/android/gms/internal/measurement/zzkq;

    invoke-direct {v8}, Lcom/google/android/gms/internal/measurement/zzkq;-><init>()V

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzkp;->zzatm:[Lcom/google/android/gms/internal/measurement/zzkq;

    add-int/lit8 v10, v6, 0x1

    aput-object v8, v9, v6

    iput-object v7, v8, Lcom/google/android/gms/internal/measurement/zzkq;->name:Ljava/lang/String;

    iget-object v6, v12, Lcom/google/android/gms/internal/measurement/zzer;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzet;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v7

    invoke-virtual {v7, v8, v6}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzkq;Ljava/lang/Object;)V

    move v6, v10

    goto :goto_9

    :cond_16
    move-object/from16 v3, v29

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatv:[Lcom/google/android/gms/internal/measurement/zzku;

    iget-object v8, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatu:[Lcom/google/android/gms/internal/measurement/zzkp;

    invoke-direct {v1, v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzku;[Lcom/google/android/gms/internal/measurement/zzkp;)[Lcom/google/android/gms/internal/measurement/zzko;

    move-result-object v6

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzaum:[Lcom/google/android/gms/internal/measurement/zzko;

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    iput-object v6, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzkp;->zzatn:Ljava/lang/Long;

    iput-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgn()J

    move-result-wide v6

    cmp-long v2, v6, v26

    if-eqz v2, :cond_17

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    goto :goto_a

    :cond_17
    move-object/from16 v14, v18

    :goto_a
    iput-object v14, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzaua:Ljava/lang/Long;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgm()J

    move-result-wide v8

    cmp-long v2, v8, v26

    if-nez v2, :cond_18

    goto :goto_b

    :cond_18
    move-wide v6, v8

    :goto_b
    cmp-long v2, v6, v26

    if-eqz v2, :cond_19

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    goto :goto_c

    :cond_19
    move-object/from16 v14, v18

    :goto_c
    iput-object v14, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatz:Ljava/lang/Long;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgv()V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgs()J

    move-result-wide v6

    long-to-int v2, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzauk:Ljava/lang/Integer;

    const-wide/16 v6, 0x30a3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzaug:Ljava/lang/Long;

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatw:Ljava/lang/Long;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzaul:Ljava/lang/Boolean;

    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzatx:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/measurement/zzdy;->zzm(J)V

    iget-object v2, v5, Lcom/google/android/gms/internal/measurement/zzks;->zzaty:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/internal/measurement/zzdy;->zzn(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    move-object/from16 v2, v31

    :try_start_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvv()I

    move-result v3

    new-array v3, v3, [B

    array-length v5, v3

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzaby;->zzb([BII)Lcom/google/android/gms/internal/measurement/zzaby;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/zzacg;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzaby;->zzvn()V

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzkc;->zza([B)[B

    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    move-object v2, v0

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v4, "Data loss. Failed to bundle and serialize. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v18

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw v2
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzee;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 10
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzee;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/zzee;-><init>(Lcom/google/android/gms/internal/measurement/zzee;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzi(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzee;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    if-eqz v3, :cond_3

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-wide v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    iget-wide v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->triggerTimeout:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->triggerTimeout:J

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    iget-boolean v2, v1, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    iput-boolean v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-wide v5, v3, Lcom/google/android/gms/internal/measurement/zzjz;->zzarl:J

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v7

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjz;->origin:Ljava/lang/String;

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/measurement/zzjz;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v7

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjz;->origin:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/measurement/zzjz;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iput-boolean v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    move p1, v2

    :cond_4
    :goto_0
    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    new-instance v9, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    iget-wide v6, v1, Lcom/google/android/gms/internal/measurement/zzjz;->zzarl:J

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzkb;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "User property updated immediately"

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    :goto_1
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "(2)Too many active user properties, ignoring"

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    goto :goto_1

    :goto_2
    if-eqz p1, :cond_6

    iget-object p1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    if-eqz p1, :cond_6

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    iget-wide v2, v0, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    invoke-direct {p1, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Lcom/google/android/gms/internal/measurement/zzew;J)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzee;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p2, "Conditional property added"

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p2, "Too many conditional properties, ignoring"

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw p1
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 18
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iget-wide v12, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzagc:J

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/measurement/zzkc;->zzd(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)Z

    move-result v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    iget-boolean v5, v3, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v5, :cond_1

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    const-wide/16 v6, 0x0

    cmp-long v8, v12, v6

    const/4 v9, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-gez v8, :cond_2

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v8, "Invalid time querying timed out conditional properties"

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v5, v8, v10, v11}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_0

    :cond_2
    const-string v8, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    new-array v10, v9, [Ljava/lang/String;

    aput-object v4, v10, v14

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v15

    invoke-virtual {v5, v8, v10}, Lcom/google/android/gms/internal/measurement/zzej;->zzb(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzee;

    if-eqz v8, :cond_3

    iget-object v10, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v10

    const-string v11, "User property timed out"

    iget-object v15, v8, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v14, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v14

    iget-object v9, v8, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v9, v9, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iget-object v14, v8, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v11, v15, v9, v14}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v8, Lcom/google/android/gms/internal/measurement/zzee;->zzaer:Lcom/google/android/gms/internal/measurement/zzew;

    if-eqz v9, :cond_4

    new-instance v9, Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v10, v8, Lcom/google/android/gms/internal/measurement/zzee;->zzaer:Lcom/google/android/gms/internal/measurement/zzew;

    invoke-direct {v9, v10, v12, v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Lcom/google/android/gms/internal/measurement/zzew;J)V

    invoke-direct {v1, v9, v3}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v9

    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v9, v4, v8}, Lcom/google/android/gms/internal/measurement/zzej;->zzj(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v9, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    cmp-long v8, v12, v6

    if-gez v8, :cond_6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v8, "Invalid time querying expired conditional properties"

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v5, v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_2

    :cond_6
    const-string v8, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    const/4 v9, 0x2

    new-array v10, v9, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v4, v10, v9

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x1

    aput-object v9, v10, v11

    invoke-virtual {v5, v8, v10}, Lcom/google/android/gms/internal/measurement/zzej;->zzb(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    :goto_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzee;

    if-eqz v9, :cond_7

    iget-object v10, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v10

    const-string v11, "User property expired"

    iget-object v14, v9, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v15, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v15

    iget-object v6, v9, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v6, v6, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v15, v6}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v9, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v10, v11, v14, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    iget-object v7, v9, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v6, v4, v7}, Lcom/google/android/gms/internal/measurement/zzej;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v9, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    if-eqz v6, :cond_8

    iget-object v6, v9, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    iget-object v7, v9, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v6, v4, v7}, Lcom/google/android/gms/internal/measurement/zzej;->zzj(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v6, 0x0

    goto :goto_3

    :cond_9
    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v5, :cond_a

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzew;

    new-instance v9, Lcom/google/android/gms/internal/measurement/zzew;

    invoke-direct {v9, v7, v12, v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Lcom/google/android/gms/internal/measurement/zzew;J)V

    invoke-direct {v1, v9, v3}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_4

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    const-wide/16 v7, 0x0

    cmp-long v9, v12, v7

    if-gez v9, :cond_b

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v7

    const-string v8, "Invalid time querying triggered conditional properties"

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzff;->zzbi(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v7, v8, v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v14, 0x0

    goto :goto_5

    :cond_b
    const-string v7, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/String;

    const/4 v14, 0x0

    aput-object v4, v8, v14

    const/4 v4, 0x1

    aput-object v6, v8, v4

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v8, v6

    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzej;->zzb(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    :goto_5
    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzee;

    if-eqz v11, :cond_c

    iget-object v5, v11, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    new-instance v9, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v6, v11, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v7, v11, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-object v8, v5, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object v5, v9

    move-object v14, v9

    move-wide v9, v12

    move-object/from16 v17, v4

    move-object v4, v11

    move-object/from16 v11, v16

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v5, v14}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzkb;)Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "User property triggered"

    iget-object v7, v4, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v8

    iget-object v9, v14, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v14, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    :goto_7
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v5

    const-string v6, "Too many active user properties, ignoring"

    iget-object v7, v4, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v8

    iget-object v9, v14, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v14, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    goto :goto_7

    :goto_8
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    if-eqz v5, :cond_e

    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-direct {v5, v14}, Lcom/google/android/gms/internal/measurement/zzjz;-><init>(Lcom/google/android/gms/internal/measurement/zzkb;)V

    iput-object v5, v4, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    const/4 v5, 0x1

    iput-boolean v5, v4, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzee;)Z

    move-object/from16 v4, v17

    const/4 v14, 0x0

    goto/16 :goto_6

    :cond_f
    invoke-direct/range {p0 .. p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    check-cast v15, Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_9
    if-ge v4, v2, :cond_10

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzew;

    new-instance v6, Lcom/google/android/gms/internal/measurement/zzew;

    invoke-direct {v6, v5, v12, v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Lcom/google/android/gms/internal/measurement/zzew;J)V

    invoke-direct {v1, v6, v3}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_9

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw v2
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzjr;)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqu:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqu:I

    return-void
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 12
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zzce(Ljava/lang/String;)I

    move-result v4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x18

    if-eqz v4, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v6

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    move v7, p1

    goto :goto_0

    :cond_2
    move v7, v0

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v2

    iget-object v3, p2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const-string v5, "_ev"

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v3

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzkc;->zzi(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v8

    if-eqz v8, :cond_6

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    instance-of v1, p1, Ljava/lang/String;

    if-nez v1, :cond_4

    instance-of v1, p1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_5

    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_5
    move v11, v0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v6

    iget-object v7, p2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const-string v9, "_ev"

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjz;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzkc;->zzj(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzkb;

    iget-object v4, p2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iget-object v5, p1, Lcom/google/android/gms/internal/measurement/zzjz;->origin:Ljava/lang/String;

    iget-object v6, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    iget-wide v7, p1, Lcom/google/android/gms/internal/measurement/zzjz;->zzarl:J

    move-object v3, v1

    move-object v9, v0

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v2, "Setting user property"

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v3

    iget-object v4, v1, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzkb;)Z

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p2, "User property set"

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string v0, "Too many unique user properties are set. Ignoring user property"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v2

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    invoke-virtual {p1, v0, v2, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const/16 v2, 0x9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw p1
.end method

.method final zzb(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_a

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "onConfigFetched. Response size"

    array-length v3, p4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v1

    const/16 v2, 0xc8

    const/4 v3, 0x1

    const/16 v4, 0x130

    if-eq p2, v2, :cond_1

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_1

    if-ne p2, v4, :cond_2

    :cond_1
    if-nez p3, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    if-nez v1, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string p3, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    const/16 v5, 0x194

    if-nez v2, :cond_8

    if-ne p2, v5, :cond_4

    goto :goto_3

    :cond_4
    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p4

    invoke-interface {p4}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p4

    invoke-virtual {v1, p4, p5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzt(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p4

    invoke-virtual {p4, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    iget-object p4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p4

    const-string p5, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p5, v1, p3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbv(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzake:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_6

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_5

    goto :goto_2

    :cond_5
    move v3, v0

    :cond_6
    :goto_2
    if-eqz v3, :cond_7

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzfs;->zzakf:Lcom/google/android/gms/internal/measurement/zzfv;

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    :cond_7
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    goto/16 :goto_9

    :cond_8
    :goto_3
    const/4 p3, 0x0

    if-eqz p5, :cond_9

    const-string v2, "Last-Modified"

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/List;

    goto :goto_4

    :cond_9
    move-object p5, p3

    :goto_4
    if-eqz p5, :cond_a

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_a

    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    goto :goto_5

    :cond_a
    move-object p5, p3

    :goto_5
    if-eq p2, v5, :cond_c

    if-ne p2, v4, :cond_b

    goto :goto_7

    :cond_b
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object p3

    invoke-virtual {p3, p1, p4, p5}, Lcom/google/android/gms/internal/measurement/zzgg;->zza(Ljava/lang/String;[BLjava/lang/String;)Z

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez p3, :cond_d

    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    :goto_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqw:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzle()V

    return-void

    :cond_c
    :goto_7
    :try_start_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object p5

    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbt(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzkm;

    move-result-object p5

    if-nez p5, :cond_d

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object p5

    invoke-virtual {p5, p1, p3, p3}, Lcom/google/android/gms/internal/measurement/zzgg;->zza(Ljava/lang/String;[BLjava/lang/String;)Z

    move-result p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez p3, :cond_d

    :try_start_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_6

    :cond_d
    :try_start_5
    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzdy;->zzs(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p3

    invoke-virtual {p3, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    if-ne p2, v5, :cond_e

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziw()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string p3, "Config not found. Using empty config. appId"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_e
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p1

    const-string p3, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    array-length p4, p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p3, p2, p4}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkw()Lcom/google/android/gms/internal/measurement/zzfl;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfl;->zzex()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlc()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlb()V

    :goto_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_a
    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqw:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzle()V

    throw p1
.end method

.method public final zzbt()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method final zzc(Lcom/google/android/gms/internal/measurement/zzee;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzej;->zzi(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzee;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Removing conditional user property"

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v4

    iget-object v5, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v5, v5, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzj(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    if-eqz v2, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzew;->zzafr:Lcom/google/android/gms/internal/measurement/zzet;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzet;->zzij()Landroid/os/Bundle;

    move-result-object v1

    :cond_3
    move-object v2, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    iget-wide v5, p1, Lcom/google/android/gms/internal/measurement/zzew;->zzagc:J

    const/4 p1, 0x1

    const/4 v7, 0x0

    move-object v0, v1

    move-object v1, v3

    move-object v3, v4

    move-wide v4, v5

    move v6, p1

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzkc;->zza(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/internal/measurement/zzew;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_0

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string v0, "Conditional user property doesn\'t exist"

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw p1
.end method

.method final zzc(Lcom/google/android/gms/internal/measurement/zzew;Ljava/lang/String;)V
    .locals 27
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzdy;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v4, "_ui"

    iget-object v5, v1, Lcom/google/android/gms/internal/measurement/zzew;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v5, "Could not find package. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "App version does not match; dropping event. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    :goto_0
    new-instance v15, Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v6

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgp()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgq()J

    move-result-wide v9

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgr()J

    move-result-wide v11

    const/4 v13, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->isMeasurementEnabled()Z

    move-result v14

    const/16 v16, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgl()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhe()J

    move-result-wide v18

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhf()Z

    move-result v23

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhg()Z

    move-result v24

    const/16 v25, 0x0

    move-object v2, v15

    move-object/from16 v26, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    move-wide/from16 v17, v18

    move-wide/from16 v19, v20

    move/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v24

    move/from16 v24, v25

    invoke-direct/range {v2 .. v24}, Lcom/google/android/gms/internal/measurement/zzdz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZZ)V

    move-object/from16 v2, v26

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    return-void

    :cond_3
    :goto_1
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "No app data available; dropping event"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method final zzc(Lcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "Removing user property"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object p2

    const-string v0, "User property removed"

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzjz;->name:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/zzff;->zzbk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw p1
.end method

.method final zzca(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdz;
    .locals 25
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzdy;)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v4, "App version does not match; dropping. appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v4, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance v24, Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgp()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgq()J

    move-result-wide v8

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgr()J

    move-result-wide v10

    const/4 v12, 0x0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->isMeasurementEnabled()Z

    move-result v13

    const/4 v14, 0x0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgl()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhe()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhf()Z

    move-result v21

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzdy;->zzhg()Z

    move-result v22

    const/16 v23, 0x0

    move-object/from16 v1, v24

    invoke-direct/range {v1 .. v23}, Lcom/google/android/gms/internal/measurement/zzdz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZZ)V

    return-object v24

    :cond_2
    :goto_1
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v4, "No app data available; dropping"

    goto :goto_0
.end method

.method final zzd(Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 10
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarc:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarc:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v5, "apps"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "events"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "user_attributes"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "conditional_properties"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "raw_events"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "raw_events_metadata"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "queue"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "audience_filter_values"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v4, v5

    const-string v5, "main_event_params"

    const-string v6, "app_id=?"

    invoke-virtual {v2, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    add-int/2addr v4, v2

    if-lez v4, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Reset analytics data. app, records"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v3, "Error resetting analytics data. appId, error"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iget-object v4, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    iget-boolean v5, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzady:Z

    iget-boolean v7, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadz:Z

    iget-wide v8, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzaem:J

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZZJ)Lcom/google/android/gms/internal/measurement/zzdz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzeg;->zzay(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean p1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzf(Lcom/google/android/gms/internal/measurement/zzdz;)V

    :cond_3
    return-void
.end method

.method final zze(Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 20
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    iget-object v4, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/zzdy;->zzs(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zza(Lcom/google/android/gms/internal/measurement/zzdy;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkv()Lcom/google/android/gms/internal/measurement/zzgg;

    move-result-object v3

    iget-object v6, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/zzgg;->zzbw(Ljava/lang/String;)V

    :cond_1
    iget-boolean v3, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadw:Z

    if-nez v3, :cond_2

    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    return-void

    :cond_2
    iget-wide v6, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzaem:J

    cmp-long v3, v6, v4

    if-nez v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v6

    :cond_3
    iget v3, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzaen:I

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v15, :cond_4

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v9, "Incorrect app type, assuming installed app. appId, appType"

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v8, v9, v10, v3}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move v3, v14

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzej;->beginTransaction()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v8

    const/16 v16, 0x0

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->getGmpAppId()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzadm:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    iget-object v9, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v10, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzah()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-static {v8}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzej;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v10

    new-array v11, v15, [Ljava/lang/String;

    aput-object v8, v11, v14

    const-string v12, "events"

    const-string v13, "app_id=?"

    invoke-virtual {v10, v12, v13, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v12

    add-int/2addr v12, v14

    const-string v13, "user_attributes"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "conditional_properties"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "apps"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "raw_events"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "raw_events_metadata"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "event_filters"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "property_filters"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v13

    add-int/2addr v12, v13

    const-string v13, "audience_filter_values"

    const-string v14, "app_id=?"

    invoke-virtual {v10, v13, v14, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    add-int/2addr v12, v10

    if-lez v12, :cond_5

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v10

    const-string v11, "Deleted application data. app, records"

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v8, v12}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v10, v0

    :try_start_2
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v11, "Error deleting application data. appId, error"

    invoke-static {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v9, v11, v8, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_0
    move-object/from16 v8, v16

    :cond_6
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v9

    const-wide/32 v11, -0x80000000

    cmp-long v13, v9, v11

    if-eqz v13, :cond_7

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzgo()J

    move-result-wide v9

    iget-wide v11, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzads:J

    cmp-long v13, v9, v11

    if-eqz v13, :cond_8

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v10, "_pv"

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lcom/google/android/gms/internal/measurement/zzew;

    const-string v10, "_au"

    new-instance v11, Lcom/google/android/gms/internal/measurement/zzet;

    invoke-direct {v11, v9}, Lcom/google/android/gms/internal/measurement/zzet;-><init>(Landroid/os/Bundle;)V

    const-string v12, "auto"

    move-object v8, v14

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-wide v12, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/String;J)V

    :goto_1
    invoke-virtual {v1, v14, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzth:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v10, "_pv"

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzdy;->zzag()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v14, Lcom/google/android/gms/internal/measurement/zzew;

    const-string v10, "_au"

    new-instance v11, Lcom/google/android/gms/internal/measurement/zzet;

    invoke-direct {v11, v9}, Lcom/google/android/gms/internal/measurement/zzet;-><init>(Landroid/os/Bundle;)V

    const-string v12, "auto"

    move-object v8, v14

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-wide v12, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/String;J)V

    goto :goto_1

    :cond_8
    :goto_2
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    if-nez v3, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const-string v10, "_f"

    :goto_3
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzej;->zzf(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzes;

    move-result-object v8

    goto :goto_4

    :cond_9
    if-ne v3, v15, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const-string v10, "_v"

    goto :goto_3

    :cond_a
    move-object/from16 v8, v16

    :goto_4
    if-nez v8, :cond_16

    const-wide/32 v8, 0x36ee80

    div-long v10, v6, v8

    const-wide/16 v13, 0x1

    add-long v17, v13, v10

    mul-long v8, v8, v17

    if-nez v3, :cond_13

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzjz;

    const-string v10, "_fot"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const-string v17, "auto"

    move-object v8, v3

    move-object v9, v10

    move-wide v10, v6

    move-wide v4, v13

    move-object/from16 v13, v17

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzjz;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v8, "_c"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_r"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_uwa"

    const-wide/16 v9, 0x0

    invoke-virtual {v3, v8, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_pfo"

    invoke-virtual {v3, v8, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_sys"

    invoke-virtual {v3, v8, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_sysu"

    invoke-virtual {v3, v8, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzeg;->zzay(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-boolean v8, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzaeo:Z

    if-eqz v8, :cond_b

    const-string v8, "_dac"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_b
    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    if-nez v8, :cond_c

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v9, "PackageManager is null, first open report might be inaccurate. appId"

    iget-object v10, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_9

    :cond_c
    :try_start_3
    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v8
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v8, v0

    :try_start_4
    iget-object v9, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v10, "Package info is null, first open report might be inaccurate. appId"

    iget-object v11, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v10, v11, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v8, v16

    :goto_5
    if-eqz v8, :cond_f

    iget-wide v9, v8, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v11, 0x0

    cmp-long v13, v9, v11

    if-eqz v13, :cond_f

    iget-wide v9, v8, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iget-wide v11, v8, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v8, v9, v11

    if-eqz v8, :cond_d

    const-string v8, "_uwa"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/4 v8, 0x0

    goto :goto_6

    :cond_d
    move v8, v15

    :goto_6
    new-instance v14, Lcom/google/android/gms/internal/measurement/zzjz;

    const-string v9, "_fi"

    if-eqz v8, :cond_e

    move-wide v10, v4

    goto :goto_7

    :cond_e
    const-wide/16 v10, 0x0

    :goto_7
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const-string v13, "auto"

    move-object v8, v14

    move-wide v10, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzjz;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v14, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_f
    :try_start_5
    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v8
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v8, v0

    :try_start_6
    iget-object v9, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v9

    const-string v10, "Application info is null, first open report might be inaccurate. appId"

    iget-object v11, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v10, v11, v8}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v8, v16

    :goto_8
    if-eqz v8, :cond_11

    iget v9, v8, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/2addr v9, v15

    if-eqz v9, :cond_10

    const-string v9, "_sys"

    invoke-virtual {v3, v9, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_10
    iget v8, v8, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v8, v8, 0x80

    if-eqz v8, :cond_11

    const-string v8, "_sysu"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_11
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    const-string v10, "first_open_count"

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzej;->zzm(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-ltz v12, :cond_12

    const-string v10, "_pfo"

    invoke-virtual {v3, v10, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_12
    new-instance v14, Lcom/google/android/gms/internal/measurement/zzew;

    const-string v9, "_f"

    new-instance v10, Lcom/google/android/gms/internal/measurement/zzet;

    invoke-direct {v10, v3}, Lcom/google/android/gms/internal/measurement/zzet;-><init>(Landroid/os/Bundle;)V

    const-string v11, "auto"

    move-object v8, v14

    move-wide v12, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/String;J)V

    :goto_a
    invoke-virtual {v1, v14, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_b

    :cond_13
    move-wide v4, v13

    if-ne v3, v15, :cond_15

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzjz;

    const-string v10, "_fvt"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const-string v13, "auto"

    move-object v8, v3

    move-object v9, v10

    move-wide v10, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzjz;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzjz;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v8, "_c"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_r"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v8, v1, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v8

    iget-object v9, v2, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzeg;->zzay(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_14

    iget-boolean v8, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzaeo:Z

    if-eqz v8, :cond_14

    const-string v8, "_dac"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_14
    new-instance v14, Lcom/google/android/gms/internal/measurement/zzew;

    const-string v9, "_v"

    new-instance v10, Lcom/google/android/gms/internal/measurement/zzet;

    invoke-direct {v10, v3}, Lcom/google/android/gms/internal/measurement/zzet;-><init>(Landroid/os/Bundle;)V

    const-string v11, "auto"

    move-object v8, v14

    move-wide v12, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/String;J)V

    goto :goto_a

    :cond_15
    :goto_b
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v8, "_et"

    invoke-virtual {v3, v8, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v4, Lcom/google/android/gms/internal/measurement/zzew;

    const-string v9, "_e"

    new-instance v10, Lcom/google/android/gms/internal/measurement/zzet;

    invoke-direct {v10, v3}, Lcom/google/android/gms/internal/measurement/zzet;-><init>(Landroid/os/Bundle;)V

    const-string v11, "auto"

    move-object v8, v4

    move-wide v12, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/String;J)V

    :goto_c
    invoke-virtual {v1, v4, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzew;Lcom/google/android/gms/internal/measurement/zzdz;)V

    goto :goto_d

    :cond_16
    iget-boolean v3, v2, Lcom/google/android/gms/internal/measurement/zzdz;->zzael:Z

    if-eqz v3, :cond_17

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/measurement/zzew;

    const-string v9, "_cd"

    new-instance v10, Lcom/google/android/gms/internal/measurement/zzet;

    invoke-direct {v10, v3}, Lcom/google/android/gms/internal/measurement/zzet;-><init>(Landroid/os/Bundle;)V

    const-string v11, "auto"

    move-object v8, v4

    move-wide v12, v6

    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/measurement/zzew;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzet;Ljava/lang/String;J)V

    goto :goto_c

    :cond_17
    :goto_d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->setTransactionSuccessful()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzej;->endTransaction()V

    throw v2
.end method

.method final zzg(Ljava/lang/Runnable;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqt:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqt:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqt:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zzgb()Lcom/google/android/gms/internal/measurement/zzff;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgb()Lcom/google/android/gms/internal/measurement/zzff;

    move-result-object v0

    return-object v0
.end method

.method public final zzgc()Lcom/google/android/gms/internal/measurement/zzkc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgc()Lcom/google/android/gms/internal/measurement/zzkc;

    move-result-object v0

    return-object v0
.end method

.method public final zzge()Lcom/google/android/gms/internal/measurement/zzgh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    return-object v0
.end method

.method public final zzgf()Lcom/google/android/gms/internal/measurement/zzfh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    return-object v0
.end method

.method public final zzgh()Lcom/google/android/gms/internal/measurement/zzeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v0

    return-object v0
.end method

.method public final zzgi()Lcom/google/android/gms/internal/measurement/zzec;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(Lcom/google/android/gms/internal/measurement/zzdz;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzjw;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/zzjw;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzdz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzgh;->zzb(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x7530

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Failed to get app instance id. appId"

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final zzjc()Lcom/google/android/gms/internal/measurement/zzjy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqq:Lcom/google/android/gms/internal/measurement/zzjy;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqq:Lcom/google/android/gms/internal/measurement/zzjy;

    return-object v0
.end method

.method public final zzjd()Lcom/google/android/gms/internal/measurement/zzeb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqp:Lcom/google/android/gms/internal/measurement/zzeb;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqp:Lcom/google/android/gms/internal/measurement/zzeb;

    return-object v0
.end method

.method public final zzje()Lcom/google/android/gms/internal/measurement/zzej;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqm:Lcom/google/android/gms/internal/measurement/zzej;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqm:Lcom/google/android/gms/internal/measurement/zzej;

    return-object v0
.end method

.method public final zzkw()Lcom/google/android/gms/internal/measurement/zzfl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaql:Lcom/google/android/gms/internal/measurement/zzfl;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaql:Lcom/google/android/gms/internal/measurement/zzfl;

    return-object v0
.end method

.method final zzkz()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzvo:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UploadController is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public final zzlb()V
    .locals 14
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqy:Z

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfy()Lcom/google/android/gms/internal/measurement/zzij;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzij;->zzko()Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Upload data called on the client side before use of service was decided"

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqy:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzle()V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Upload called in the client side when service should be used"

    goto :goto_0

    :cond_2
    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqs:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_3

    :goto_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;

    if-eqz v2, :cond_4

    move v2, v0

    goto :goto_3

    :cond_4
    move v2, v1

    :goto_3
    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Uploading requested multiple times"

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkw()Lcom/google/android/gms/internal/measurement/zzfl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfl;->zzex()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhm()J

    move-result-wide v6

    sub-long v8, v2, v6

    const/4 v6, 0x0

    invoke-direct {p0, v6, v8, v9}, Lcom/google/android/gms/internal/measurement/zzjs;->zzd(Ljava/lang/String;J)Z

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v7

    iget-object v7, v7, Lcom/google/android/gms/internal/measurement/zzfs;->zzakd:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfv;->get()J

    move-result-wide v7

    cmp-long v9, v7, v4

    if-eqz v9, :cond_7

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v4

    const-string v5, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v9, v2, v7

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Lcom/google/android/gms/internal/measurement/zzfj;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzej;->zzhr()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const-wide/16 v7, -0x1

    if-nez v5, :cond_13

    iget-wide v9, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzard:J

    cmp-long v5, v9, v7

    if-nez v5, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzej;->zzhy()J

    move-result-wide v7

    iput-wide v7, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzard:J

    :cond_8
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v5

    sget-object v7, Lcom/google/android/gms/internal/measurement/zzey;->zzagv:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v5, v4, v7}, Lcom/google/android/gms/internal/measurement/zzeg;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzey$zza;)I

    move-result v5

    iget-object v7, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/measurement/zzey;->zzagw:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v7, v4, v8}, Lcom/google/android/gms/internal/measurement/zzeg;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzey$zza;)I

    move-result v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v8

    invoke-virtual {v8, v4, v5, v7}, Lcom/google/android/gms/internal/measurement/zzej;->zzb(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/util/Pair;

    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v9, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzauh:Ljava/lang/String;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/zzks;->zzauh:Ljava/lang/String;

    goto :goto_4

    :cond_a
    move-object v7, v6

    :goto_4
    if-eqz v7, :cond_c

    move v8, v1

    :goto_5
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_c

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/util/Pair;

    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzks;

    iget-object v10, v9, Lcom/google/android/gms/internal/measurement/zzks;->zzauh:Ljava/lang/String;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_b

    iget-object v9, v9, Lcom/google/android/gms/internal/measurement/zzks;->zzauh:Ljava/lang/String;

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    invoke-interface {v5, v1, v8}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    goto :goto_6

    :cond_b
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_c
    :goto_6
    new-instance v7, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-direct {v7}, Lcom/google/android/gms/internal/measurement/zzkr;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    new-array v8, v8, [Lcom/google/android/gms/internal/measurement/zzks;

    iput-object v8, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzeg;->zzho()Z

    move-result v9

    if-eqz v9, :cond_d

    iget-object v9, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v9

    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/measurement/zzeg;->zzas(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    move v9, v0

    goto :goto_7

    :cond_d
    move v9, v1

    :goto_7
    move v10, v1

    :goto_8
    iget-object v11, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    array-length v11, v11

    if-ge v10, v11, :cond_f

    iget-object v11, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/util/Pair;

    iget-object v12, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzks;

    aput-object v12, v11, v10

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Pair;

    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Long;

    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v11, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    aget-object v11, v11, v10

    const-wide/16 v12, 0x30a3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v11, Lcom/google/android/gms/internal/measurement/zzks;->zzaug:Ljava/lang/Long;

    iget-object v11, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    aget-object v11, v11, v10

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v11, Lcom/google/android/gms/internal/measurement/zzks;->zzatw:Ljava/lang/Long;

    iget-object v11, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    aget-object v11, v11, v10

    iget-object v12, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgi()Lcom/google/android/gms/internal/measurement/zzec;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    iput-object v12, v11, Lcom/google/android/gms/internal/measurement/zzks;->zzaul:Ljava/lang/Boolean;

    if-nez v9, :cond_e

    iget-object v11, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    aget-object v11, v11, v10

    iput-object v6, v11, Lcom/google/android/gms/internal/measurement/zzks;->zzaut:Ljava/lang/String;

    :cond_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_f
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v5

    const/4 v9, 0x2

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/zzfh;->isLoggable(I)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/zzjy;->zzb(Lcom/google/android/gms/internal/measurement/zzkr;)Ljava/lang/String;

    move-result-object v6

    :cond_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/zzjy;->zza(Lcom/google/android/gms/internal/measurement/zzkr;)[B

    move-result-object v11

    sget-object v5, Lcom/google/android/gms/internal/measurement/zzey;->zzahf:Lcom/google/android/gms/internal/measurement/zzey$zza;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzey$zza;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v10, Ljava/net/URL;

    invoke-direct {v10, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    xor-int/2addr v9, v0

    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    iget-object v9, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;

    if-eqz v9, :cond_11

    iget-object v8, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v8

    const-string v9, "Set uploading progress before finishing the previous upload"

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    goto :goto_9

    :cond_11
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v9, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzarb:Ljava/util/List;

    :goto_9
    iget-object v8, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgg()Lcom/google/android/gms/internal/measurement/zzfs;

    move-result-object v8

    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/zzfs;->zzake:Lcom/google/android/gms/internal/measurement/zzfv;

    invoke-virtual {v8, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfv;->set(J)V

    const-string v2, "?"

    iget-object v3, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    array-length v3, v3

    if-lez v3, :cond_12

    iget-object v2, v7, Lcom/google/android/gms/internal/measurement/zzkr;->zzatr:[Lcom/google/android/gms/internal/measurement/zzks;

    aget-object v2, v2, v1

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzks;->zzti:Ljava/lang/String;

    :cond_12
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v3

    const-string v7, "Uploading data. app, uncompressed size, data"

    array-length v8, v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v3, v7, v2, v8, v6}, Lcom/google/android/gms/internal/measurement/zzfj;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqx:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkw()Lcom/google/android/gms/internal/measurement/zzfl;

    move-result-object v8

    new-instance v13, Lcom/google/android/gms/internal/measurement/zzju;

    invoke-direct {v13, p0, v4}, Lcom/google/android/gms/internal/measurement/zzju;-><init>(Lcom/google/android/gms/internal/measurement/zzjs;Ljava/lang/String;)V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzab()V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzjr;->zzch()V

    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v11}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzhh;->zzge()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzfp;

    const/4 v12, 0x0

    move-object v7, v2

    move-object v9, v4

    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/internal/measurement/zzfp;-><init>(Lcom/google/android/gms/internal/measurement/zzfl;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/internal/measurement/zzfn;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzgh;->zzd(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1

    :catch_0
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v2, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/zzfh;->zzbl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v5}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_13
    iput-wide v7, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzard:J

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzeg;->zzhm()J

    move-result-wide v4

    sub-long v6, v2, v4

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/measurement/zzej;->zzab(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Lcom/google/android/gms/internal/measurement/zzdy;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqy:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzle()V

    throw v0
.end method

.method final zzlg()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqr:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zzix()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "This instance being marked as an uploader"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzkz()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlh()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlf()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzara:Ljava/nio/channels/FileChannel;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Ljava/nio/channels/FileChannel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfw()Lcom/google/android/gms/internal/measurement/zzfc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc;->zzip()I

    move-result v1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzab()V

    if-le v0, v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    if-ge v0, v1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzara:Ljava/nio/channels/FileChannel;

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(ILjava/nio/channels/FileChannel;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zziz()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Storage version upgraded. Previous, current version"

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzgm;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfh;->zzis()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v2

    const-string v3, "Storage version upgrade failed. Previous, current version"

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqr:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    :cond_3
    return-void
.end method

.method final zzli()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqv:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzaqv:I

    return-void
.end method

.method final zzlj()Lcom/google/android/gms/internal/measurement/zzgm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjs;->zzacw:Lcom/google/android/gms/internal/measurement/zzgm;

    return-object v0
.end method

.method public final zzm(Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzld()V

    return-void
.end method
