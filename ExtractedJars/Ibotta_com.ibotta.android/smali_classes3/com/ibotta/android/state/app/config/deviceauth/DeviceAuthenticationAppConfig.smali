.class public Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;
.super Ljava/lang/Object;
.source "DeviceAuthenticationAppConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;
    }
.end annotation


# instance fields
.field private button:Ljava/lang/String;

.field private cashOutExplanation:Ljava/lang/String;

.field private countryCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;",
            ">;"
        }
    .end annotation
.end field

.field private helpLinkName:Ljava/lang/String;

.field private helpLinkUrl:Ljava/lang/String;

.field private launchExplanation:Ljava/lang/String;

.field private optional:Z

.field private pinRegex:Ljava/lang/String;

.field private repromptIntervalMs:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->countryCodes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getButton()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->button:Ljava/lang/String;

    return-object v0
.end method

.method public getCashOutExplanation()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->cashOutExplanation:Ljava/lang/String;

    return-object v0
.end method

.method public getCountryCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->countryCodes:Ljava/util/List;

    return-object v0
.end method

.method public getHelpLinkName()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->helpLinkName:Ljava/lang/String;

    return-object v0
.end method

.method public getHelpLinkUrl()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->helpLinkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLaunchExplanation()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->launchExplanation:Ljava/lang/String;

    return-object v0
.end method

.method public getPinRegex()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->pinRegex:Ljava/lang/String;

    return-object v0
.end method

.method public getRepromptIntervalMs()J
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->repromptIntervalMs:J

    return-wide v0
.end method

.method public isOptional()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->optional:Z

    return v0
.end method

.method public setButton(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->button:Ljava/lang/String;

    return-void
.end method

.method public setCashOutExplanation(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->cashOutExplanation:Ljava/lang/String;

    return-void
.end method

.method public setCountryCodes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;",
            ">;)V"
        }
    .end annotation

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->countryCodes:Ljava/util/List;

    return-void
.end method

.method public setHelpLinkName(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->helpLinkName:Ljava/lang/String;

    return-void
.end method

.method public setHelpLinkUrl(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->helpLinkUrl:Ljava/lang/String;

    return-void
.end method

.method public setLaunchExplanation(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->launchExplanation:Ljava/lang/String;

    return-void
.end method

.method public setOptional(Z)V
    .locals 0

    .line 67
    iput-boolean p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->optional:Z

    return-void
.end method

.method public setPinRegex(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->pinRegex:Ljava/lang/String;

    return-void
.end method

.method public setRepromptIntervalMs(J)V
    .locals 0

    .line 75
    iput-wide p1, p0, Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig;->repromptIntervalMs:J

    return-void
.end method
