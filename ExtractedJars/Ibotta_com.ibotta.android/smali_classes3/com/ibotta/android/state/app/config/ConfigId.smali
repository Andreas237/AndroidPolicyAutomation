.class public Lcom/ibotta/android/state/app/config/ConfigId;
.super Ljava/lang/Object;
.source "ConfigId.java"


# instance fields
.field private appConfigKey:Ljava/lang/String;

.field private appConfigValue:Ljava/lang/String;

.field private configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

.field private defaultValue:Ljava/lang/Object;

.field private prefsKey:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/state/app/config/ConfigParserType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigKey:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigValue:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lcom/ibotta/android/state/app/config/ConfigId;->prefsKey:Ljava/lang/String;

    .line 30
    iput-object p5, p0, Lcom/ibotta/android/state/app/config/ConfigId;->defaultValue:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 91
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 94
    :cond_2
    check-cast p1, Lcom/ibotta/android/state/app/config/ConfigId;

    .line 95
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

    iget-object v2, p1, Lcom/ibotta/android/state/app/config/ConfigId;->configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 96
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigKey:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigKey:Ljava/lang/String;

    .line 97
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigValue:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigValue:Ljava/lang/String;

    .line 98
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->prefsKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/ibotta/android/state/app/config/ConfigId;->prefsKey:Ljava/lang/String;

    .line 99
    invoke-virtual {v0, v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getAppConfigKey()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigKey:Ljava/lang/String;

    return-object v0
.end method

.method public getAppConfigValue()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigValue:Ljava/lang/String;

    return-object v0
.end method

.method public getConfigParserType()Lcom/ibotta/android/state/app/config/ConfigParserType;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigId;->configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

    return-object v0
.end method

.method public getDefaultValue()Ljava/lang/Object;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigId;->defaultValue:Ljava/lang/Object;

    return-object v0
.end method

.method public getPrefsKey()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigId;->prefsKey:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 75
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x83f

    const/16 v2, 0x1e3d

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

    .line 76
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigKey:Ljava/lang/String;

    .line 77
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigValue:Ljava/lang/String;

    .line 78
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->prefsKey:Ljava/lang/String;

    .line 79
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public setAppConfigKey(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigKey:Ljava/lang/String;

    return-void
.end method

.method public setAppConfigValue(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->appConfigValue:Ljava/lang/String;

    return-void
.end method

.method public setConfigParserType(Lcom/ibotta/android/state/app/config/ConfigParserType;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->configParserType:Lcom/ibotta/android/state/app/config/ConfigParserType;

    return-void
.end method

.method public setDefaultValue(Ljava/lang/Object;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->defaultValue:Ljava/lang/Object;

    return-void
.end method

.method public setPrefsKey(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigId;->prefsKey:Ljava/lang/String;

    return-void
.end method
