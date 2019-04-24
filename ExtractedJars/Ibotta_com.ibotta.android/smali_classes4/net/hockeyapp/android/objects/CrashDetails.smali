.class public Lnet/hockeyapp/android/objects/CrashDetails;
.super Ljava/lang/Object;
.source "CrashDetails.java"


# static fields
.field public static final DATE_FORMAT:Ljava/text/SimpleDateFormat;


# instance fields
.field private appCrashDate:Ljava/util/Date;

.field private appPackage:Ljava/lang/String;

.field private appStartDate:Ljava/util/Date;

.field private appVersionCode:Ljava/lang/String;

.field private appVersionName:Ljava/lang/String;

.field private final crashIdentifier:Ljava/lang/String;

.field private deviceManufacturer:Ljava/lang/String;

.field private deviceModel:Ljava/lang/String;

.field private osBuild:Ljava/lang/String;

.field private osVersion:Ljava/lang/String;

.field private reporterKey:Ljava/lang/String;

.field private threadName:Ljava/lang/String;

.field private throwableStackTrace:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "EEE MMM dd HH:mm:ss zzz yyyy"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lnet/hockeyapp/android/objects/CrashDetails;->DATE_FORMAT:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->crashIdentifier:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 62
    invoke-direct {p0, p1}, Lnet/hockeyapp/android/objects/CrashDetails;-><init>(Ljava/lang/String;)V

    .line 64
    new-instance p1, Ljava/io/StringWriter;

    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 65
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 66
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->throwableStackTrace:Ljava/lang/String;

    return-void
.end method

.method private writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\n"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public setAppCrashDate(Ljava/util/Date;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appCrashDate:Ljava/util/Date;

    return-void
.end method

.method public setAppPackage(Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appPackage:Ljava/lang/String;

    return-void
.end method

.method public setAppStartDate(Ljava/util/Date;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appStartDate:Ljava/util/Date;

    return-void
.end method

.method public setAppVersionCode(Ljava/lang/String;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appVersionCode:Ljava/lang/String;

    return-void
.end method

.method public setAppVersionName(Ljava/lang/String;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appVersionName:Ljava/lang/String;

    return-void
.end method

.method public setDeviceManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->deviceManufacturer:Ljava/lang/String;

    return-void
.end method

.method public setDeviceModel(Ljava/lang/String;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->deviceModel:Ljava/lang/String;

    return-void
.end method

.method public setOsBuild(Ljava/lang/String;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->osBuild:Ljava/lang/String;

    return-void
.end method

.method public setOsVersion(Ljava/lang/String;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->osVersion:Ljava/lang/String;

    return-void
.end method

.method public setReporterKey(Ljava/lang/String;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->reporterKey:Ljava/lang/String;

    return-void
.end method

.method public setThreadName(Ljava/lang/String;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->threadName:Ljava/lang/String;

    return-void
.end method

.method public writeCrashReport()V
    .locals 4

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lnet/hockeyapp/android/Constants;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->crashIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".stacktrace"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Writing unhandled exception to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 148
    :try_start_0
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, v0}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v0, "Package"

    .line 150
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appPackage:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Version Code"

    .line 151
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appVersionCode:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Version Name"

    .line 152
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appVersionName:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Android"

    .line 153
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->osVersion:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Android Build"

    .line 154
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->osBuild:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Manufacturer"

    .line 155
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->deviceManufacturer:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Model"

    .line 156
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->deviceModel:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Thread"

    .line 157
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->threadName:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "CrashReporter Key"

    .line 158
    iget-object v1, p0, Lnet/hockeyapp/android/objects/CrashDetails;->reporterKey:Ljava/lang/String;

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Start Date"

    .line 160
    sget-object v1, Lnet/hockeyapp/android/objects/CrashDetails;->DATE_FORMAT:Ljava/text/SimpleDateFormat;

    iget-object v3, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appStartDate:Ljava/util/Date;

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Date"

    .line 161
    sget-object v1, Lnet/hockeyapp/android/objects/CrashDetails;->DATE_FORMAT:Ljava/text/SimpleDateFormat;

    iget-object v3, p0, Lnet/hockeyapp/android/objects/CrashDetails;->appCrashDate:Ljava/util/Date;

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lnet/hockeyapp/android/objects/CrashDetails;->writeHeader(Ljava/io/Writer;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "\n"

    .line 163
    invoke-virtual {v2, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lnet/hockeyapp/android/objects/CrashDetails;->throwableStackTrace:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v1, v2

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_0
    :try_start_3
    const-string v2, "Error saving crash report!"

    .line 169
    invoke-static {v2, v0}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_0

    .line 173
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v1, "Error saving crash report!"

    .line 176
    invoke-static {v1, v0}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    return-void

    :goto_2
    if-eqz v2, :cond_1

    .line 173
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_3
    move-exception v1

    const-string v2, "Error saving crash report!"

    .line 176
    invoke-static {v2, v1}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    :cond_1
    :goto_3
    throw v0
.end method
