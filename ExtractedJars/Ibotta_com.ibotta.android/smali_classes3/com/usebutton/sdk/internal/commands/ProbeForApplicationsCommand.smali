.class public Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "ProbeForApplicationsCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field public static final DEFAULT_DETECTABLE:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ProbeForApplications"

.field private static final TIME_BETWEEN_CHECKS:J


# instance fields
.field private final mForceProbe:Z

.field private final mPackageManager:Landroid/content/pm/PackageManager;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->TIME_BETWEEN_CHECKS:J

    .line 20
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->DEFAULT_DETECTABLE:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Landroid/content/pm/PackageManager;Z)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;)V

    .line 26
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mPackageManager:Landroid/content/pm/PackageManager;

    .line 27
    iput-boolean p4, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mForceProbe:Z

    return-void
.end method

.method public static areSetValuesIdentical(Ljava/util/Set;Ljava/util/Set;)Z
    .locals 4
    .param p0    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 106
    :cond_0
    invoke-static {p0}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->safeSize(Ljava/util/Set;)I

    move-result v1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->safeSize(Ljava/util/Set;)I

    move-result v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    .line 107
    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, p0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v3
.end method

.method private findInstalledApplications(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ProbeForApplications"

    const-string v1, "Looking for: %s"

    const/4 v2, 0x1

    .line 79
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 81
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->isApplicationInstalled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 82
    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private isApplicationInstalled(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "ProbeForApplications"

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Probing for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mPackageManager:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catch_0
    return v0
.end method

.method private probeAndReport(Ljava/util/Set;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 55
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 56
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 57
    invoke-direct {p0, p1, v0, v1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->findInstalledApplications(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V

    .line 58
    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->reportApplications(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private reportApplications(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 62
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    const-string v0, "ProbeForApplications"

    const-string v1, "Reporting installed:%n%s%nnot installed:%s"

    const/4 v2, 0x2

    .line 63
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->reportProbedApplications(Ljava/util/Collection;Ljava/util/Collection;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "object"

    .line 65
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "probe"

    .line 66
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->toSet(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private static safeSize(Ljava/util/Set;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 113
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private toSet(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 71
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    .line 72
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 73
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 17
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->execute()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public execute()Ljava/lang/Void;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/core/Storage;->getTimeOfLastApplicationProbe()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 36
    iget-boolean v2, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mForceProbe:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string v0, "ProbeForApplications"

    const-string v1, "Forced to probe, will ignore time since last check."

    .line 37
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 38
    :cond_0
    sget-wide v4, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->TIME_BETWEEN_CHECKS:J

    cmp-long v2, v0, v4

    if-gez v2, :cond_1

    const-string v2, "ProbeForApplications"

    const-string v4, "Only %ds since last check, return."

    const/4 v5, 0x1

    .line 39
    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-wide/16 v7, 0x3e8

    div-long/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-static {v2, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3

    .line 43
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getDetectableApplications()Ljava/util/Set;

    move-result-object v0

    .line 44
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->probeAndReport(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 47
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->areSetValuesIdentical(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 48
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->setDetectableApplications(Ljava/util/Set;)V

    .line 49
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->probeAndReport(Ljava/util/Set;)Ljava/util/Set;

    :cond_2
    return-object v3
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 101
    const-class v0, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
