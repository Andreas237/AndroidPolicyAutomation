.class public Lnet/toddm/comm/MapConfigurationProvider;
.super Ljava/lang/Object;
.source "MapConfigurationProvider.java"

# interfaces
.implements Lnet/toddm/comm/ConfigurationProvider;


# instance fields
.field private final _configMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/comm/MapConfigurationProvider;->_configMap:Ljava/util/Map;

    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'config\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public contains(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 41
    iget-object v0, p0, Lnet/toddm/comm/MapConfigurationProvider;->_configMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'name\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation

    .line 48
    invoke-virtual {p0, p1}, Lnet/toddm/comm/MapConfigurationProvider;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lnet/toddm/comm/MapConfigurationProvider;->_configMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 48
    :cond_0
    new-instance v0, Lnet/toddm/comm/ConfigurationException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Config does not contain a value for \'%1$s\'"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/toddm/comm/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation

    .line 83
    invoke-virtual {p0, p1}, Lnet/toddm/comm/MapConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 84
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 85
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 84
    :cond_0
    new-instance v0, Lnet/toddm/comm/ConfigurationException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Value for \'%1$s\' can not be cast as an Boolean"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/toddm/comm/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation

    .line 65
    invoke-virtual {p0, p1}, Lnet/toddm/comm/MapConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 66
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 67
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 66
    :cond_0
    new-instance v0, Lnet/toddm/comm/ConfigurationException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Value for \'%1$s\' can not be cast as an Integer"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/toddm/comm/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation

    .line 74
    invoke-virtual {p0, p1}, Lnet/toddm/comm/MapConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 75
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 76
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 75
    :cond_0
    new-instance v0, Lnet/toddm/comm/ConfigurationException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Value for \'%1$s\' can not be cast as an Long"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/toddm/comm/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation

    .line 56
    invoke-virtual {p0, p1}, Lnet/toddm/comm/MapConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 57
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 58
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 57
    :cond_0
    new-instance v0, Lnet/toddm/comm/ConfigurationException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "Value for \'%1$s\' can not be cast as a String"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/toddm/comm/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
