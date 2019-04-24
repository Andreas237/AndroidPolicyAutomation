.class public Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/myfitnesspal/shared/utils/Ln$Config;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/myfitnesspal/shared/utils/Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BaseConfig"
.end annotation


# instance fields
.field protected minimumLogLevel:I

.field protected packageName:Ljava/lang/String;

.field protected scope:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    const/4 v0, 0x2

    iput v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    .line 169
    const-string v0, ""

    iput-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    .line 170
    const-string v0, ""

    iput-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->scope:Ljava/lang/String;

    .line 173
    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 6

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    const/4 v0, 0x2

    iput v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    .line 169
    const-string v0, ""

    iput-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    .line 170
    const-string v0, ""

    iput-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->scope:Ljava/lang/String;

    .line 178
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    .line 180
    invoke-virtual {p1}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    .line 181
    if-eqz v4, :cond_0

    iget v5, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 182
    :goto_0
    and-int/lit8 v0, v5, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto :goto_1

    :cond_1
    const/4 v0, 0x4

    :goto_1
    iput v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    .line 183
    iget-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v0, ""

    :goto_2
    iput-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->scope:Ljava/lang/String;

    .line 185
    const-string v0, "Configuring Logging, minimum log level is %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    invoke-static {v2}, Lcom/myfitnesspal/shared/utils/Ln;->logLevelToString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    goto :goto_3

    .line 187
    :catch_0
    move-exception v4

    .line 188
    iget-object v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error configuring logger for package \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 190
    :goto_3
    return-void
.end method


# virtual methods
.method public getLoggingLevel()I
    .locals 1

    .line 193
    iget v0, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    return v0
.end method

.method public setLoggingLevel(I)V
    .locals 0

    .line 197
    iput p1, p0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    .line 198
    return-void
.end method
