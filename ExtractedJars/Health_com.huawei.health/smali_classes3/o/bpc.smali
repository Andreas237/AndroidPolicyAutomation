.class public Lo/bpc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const-class v0, Lo/bpc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bpc;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;Z)Z
    .locals 5

    .line 33
    move v2, p1

    .line 35
    if-nez p0, :cond_0

    .line 37
    return v2

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 41
    if-nez v3, :cond_1

    .line 43
    return v2

    .line 48
    :cond_1
    const-string v0, "sns_from_hms_sdk"

    :try_start_0
    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 53
    goto :goto_0

    .line 50
    :catch_0
    move-exception v4

    .line 52
    sget-object v0, Lo/bpc;->d:Ljava/lang/String;

    const-string v1, "HMSUtil get intent data exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :goto_0
    return v2
.end method
