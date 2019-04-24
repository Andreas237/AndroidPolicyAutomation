.class public Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;
.super Ljava/lang/Object;
.source "OSDeprecationConfig.java"


# instance fields
.field private buttonTitle:Ljava/lang/String;

.field private interval:J

.field private message:Ljava/lang/String;

.field private minVersion:I

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getButtonTitle()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getInterval()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->interval:J

    return-wide v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getMinVersion()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->minVersion:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setButtonTitle(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->buttonTitle:Ljava/lang/String;

    return-void
.end method

.method public setInterval(J)V
    .locals 0

    .line 52
    iput-wide p1, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->interval:J

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->message:Ljava/lang/String;

    return-void
.end method

.method public setMinVersion(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->minVersion:I

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/osdeprecation/OSDeprecationConfig;->title:Ljava/lang/String;

    return-void
.end method
