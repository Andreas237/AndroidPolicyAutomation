.class public Lnet/toddm/comm/tests/TestConfigurationProvider;
.super Ljunit/framework/TestCase;
.source "TestConfigurationProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method

.method private validateConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)V
    .locals 4

    :try_start_0
    const-string v0, "missing_key"

    .line 53
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "Getting a non existent key did not throw a ConfigurationException"

    .line 54
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->fail(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/toddm/comm/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    const-string v0, "key_string"

    .line 58
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getInt(Ljava/lang/String;)I

    const-string v0, "Getting a String as an int did not throw a ConfigurationException"

    .line 59
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->fail(Ljava/lang/String;)V
    :try_end_1
    .catch Lnet/toddm/comm/ConfigurationException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    const-string v0, "key_int"

    .line 63
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "Getting an int as a String did not throw a ConfigurationException"

    .line 64
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->fail(Ljava/lang/String;)V
    :try_end_2
    .catch Lnet/toddm/comm/ConfigurationException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    const-string v0, "key_long"

    .line 68
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "Getting a long as a String did not throw a ConfigurationException"

    .line 69
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->fail(Ljava/lang/String;)V
    :try_end_3
    .catch Lnet/toddm/comm/ConfigurationException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    const-string v0, "key_boolean"

    .line 73
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "Getting a boolean as a String did not throw a ConfigurationException"

    .line 74
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->fail(Ljava/lang/String;)V
    :try_end_4
    .catch Lnet/toddm/comm/ConfigurationException; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    const-string v0, "key_object"

    .line 77
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 78
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 79
    instance-of v0, v0, Ljava/util/UUID;

    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertTrue(Z)V

    const-string v0, "key_string"

    .line 80
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 81
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 82
    instance-of v0, v0, Ljava/lang/String;

    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertTrue(Z)V

    const-string v0, "key_int"

    .line 83
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 84
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 85
    instance-of v0, v0, Ljava/lang/Integer;

    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertTrue(Z)V

    const-string v0, "key_long"

    .line 86
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 87
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 88
    instance-of v0, v0, Ljava/lang/Long;

    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertTrue(Z)V

    const-string v0, "key_boolean"

    .line 89
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 90
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 91
    instance-of v0, v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertTrue(Z)V

    const-string v0, "key_string"

    .line 93
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-static {v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertNotNull(Ljava/lang/Object;)V

    const-string v1, "string value"

    .line 95
    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "key_int"

    .line 96
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xd

    .line 97
    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertEquals(II)V

    const-string v0, "key_long"

    .line 98
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0xd

    .line 99
    invoke-static {v2, v3, v0, v1}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertEquals(JJ)V

    const-string v0, "key_boolean"

    .line 100
    invoke-interface {p1, v0}, Lnet/toddm/comm/ConfigurationProvider;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 101
    invoke-static {p1}, Lnet/toddm/comm/tests/TestConfigurationProvider;->assertTrue(Z)V

    return-void
.end method


# virtual methods
.method public testMapConfigurationProvider()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "key_object"

    .line 31
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "key_string"

    const-string v2, "string value"

    .line 32
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "key_int"

    const/16 v2, 0xd

    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "key_long"

    const-wide/16 v2, 0xd

    .line 34
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "key_boolean"

    const/4 v2, 0x1

    .line 35
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    new-instance v1, Lnet/toddm/comm/MapConfigurationProvider;

    invoke-direct {v1, v0}, Lnet/toddm/comm/MapConfigurationProvider;-><init>(Ljava/util/Map;)V

    .line 37
    invoke-direct {p0, v1}, Lnet/toddm/comm/tests/TestConfigurationProvider;->validateConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)V

    return-void
.end method
