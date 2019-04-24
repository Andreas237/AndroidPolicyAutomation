.class public final Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;
.super Ljava/lang/Object;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:J

.field private final f:J

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Landroid/app/PendingIntent;


# direct methods
.method private constructor <init>(IIIJJLjava/util/List;Ljava/util/List;Landroid/app/PendingIntent;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIJJ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/app/PendingIntent;",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->b:I

    iput p2, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->c:I

    iput p3, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->d:I

    iput-wide p4, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->e:J

    iput-wide p6, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->f:J

    iput-object p8, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->g:Ljava/util/List;

    iput-object p9, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->h:Ljava/util/List;

    iput-object p10, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->i:Landroid/app/PendingIntent;

    iput-object p11, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a:Ljava/util/List;

    return-void
.end method

.method static a(Landroid/os/Bundle;)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;
    .locals 13

    new-instance v12, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    const-string v0, "session_id"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string/jumbo v0, "status"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v0, "error_code"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v0, "bytes_downloaded"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    const-string/jumbo v0, "total_bytes_to_download"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    const-string v0, "module_names"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v0, "languages"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    const-string/jumbo v0, "user_confirmation_intent"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/app/PendingIntent;

    const-string/jumbo v0, "split_file_intents"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;-><init>(IIIJJLjava/util/List;Ljava/util/List;Landroid/app/PendingIntent;Ljava/util/List;)V

    return-object v12
.end method


# virtual methods
.method final a(II)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;
    .locals 13

    new-instance v12, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    iget v1, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->b:I

    iget-wide v4, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->e:J

    iget-wide v6, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->f:J

    iget-object v8, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->g:Ljava/util/List;

    iget-object v9, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->h:Ljava/util/List;

    iget-object v10, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->i:Landroid/app/PendingIntent;

    iget-object v11, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a:Ljava/util/List;

    move-object v0, v12

    move v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v11}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;-><init>(IIIJJLjava/util/List;Ljava/util/List;Landroid/app/PendingIntent;Ljava/util/List;)V

    return-object v12
.end method

.method public final bytesDownloaded()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->e:J

    return-wide v0
.end method

.method public final errorCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->d:I

    return v0
.end method

.method public final moduleNames()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final resolutionIntent()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->i:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public final sessionId()I
    .locals 1

    iget v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->b:I

    return v0
.end method

.method public final status()I
    .locals 1

    iget v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->c:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->b:I

    iget v1, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->c:I

    iget v2, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->d:I

    iget-wide v3, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->e:J

    iget-wide v5, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->f:J

    iget-object v7, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->g:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->h:Ljava/util/List;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit16 v9, v9, 0xc1

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v9, "SplitInstallSessionState{sessionId="

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", errorCode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", bytesDownloaded="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ",totalBytesToDownload="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ",moduleNames="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "languages="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "}"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final totalBytesToDownload()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->f:J

    return-wide v0
.end method
