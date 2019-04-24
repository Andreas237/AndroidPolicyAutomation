.class public Lcom/huawei/login/ui/login/util/LoginCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sAccessToken:Ljava/lang/String;

.field private static sDeviceId:Ljava/lang/String;

.field private static sDeviceType:Ljava/lang/String;

.field private static sServerToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static configAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 26
    sput-object p0, Lcom/huawei/login/ui/login/util/LoginCache;->sAccessToken:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public static configDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 42
    sput-object p0, Lcom/huawei/login/ui/login/util/LoginCache;->sDeviceId:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public static configDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 34
    sput-object p0, Lcom/huawei/login/ui/login/util/LoginCache;->sDeviceType:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public static configServerToken(Ljava/lang/String;)V
    .locals 0

    .line 18
    sput-object p0, Lcom/huawei/login/ui/login/util/LoginCache;->sServerToken:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public static fetchAccessToken()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginCache;->sAccessToken:Ljava/lang/String;

    return-object v0
.end method

.method public static fetchDeviceId()Ljava/lang/String;
    .locals 1

    .line 46
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginCache;->sDeviceId:Ljava/lang/String;

    return-object v0
.end method

.method public static fetchDeviceType()Ljava/lang/String;
    .locals 1

    .line 38
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginCache;->sDeviceType:Ljava/lang/String;

    return-object v0
.end method

.method public static fetchServerToken()Ljava/lang/String;
    .locals 1

    .line 22
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginCache;->sServerToken:Ljava/lang/String;

    return-object v0
.end method
