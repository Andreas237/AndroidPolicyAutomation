.class public Lme/pushy/sdk/util/PushyAuthentication;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static clearDeviceCredentials(Landroid/content/Context;)V
    .locals 3

    const-string v0, "pushyToken"

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentPreferenceKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyPreferences;->remove(Ljava/lang/String;Landroid/content/Context;)V

    const-string v0, "pushyAuthKey"

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentPreferenceKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyPreferences;->remove(Ljava/lang/String;Landroid/content/Context;)V

    :try_start_0
    const-string v0, "registration.id"

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentExternalStoragePath(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lme/pushy/sdk/util/PushyIO;->deleteFile(Ljava/lang/String;)V

    const-string v0, "registration.key"

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentExternalStoragePath(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lme/pushy/sdk/util/PushyIO;->deleteFile(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "Pushy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clearing device credentials from external storage failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static getDeviceCredentials(Landroid/content/Context;)Lme/pushy/sdk/model/PushyDeviceCredentials;
    .locals 5

    new-instance v0, Lme/pushy/sdk/model/PushyDeviceCredentials;

    invoke-direct {v0}, Lme/pushy/sdk/model/PushyDeviceCredentials;-><init>()V

    const-string v1, "pushyToken"

    invoke-static {v1, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentPreferenceKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2, p0}, Lme/pushy/sdk/util/PushyPreferences;->getString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    const-string v1, "pushyAuthKey"

    invoke-static {v1, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentPreferenceKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2, p0}, Lme/pushy/sdk/util/PushyPreferences;->getString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    const-string v1, "registration.id"

    invoke-static {v1, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentExternalStoragePath(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "registration.key"

    invoke-static {v3, p0}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentExternalStoragePath(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    if-nez v4, :cond_2

    :try_start_0
    invoke-static {v1}, Lme/pushy/sdk/util/PushyIO;->fileExists(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v1}, Lme/pushy/sdk/util/PushyIO;->readFromFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    :cond_0
    invoke-static {v3}, Lme/pushy/sdk/util/PushyIO;->fileExists(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v3}, Lme/pushy/sdk/util/PushyIO;->readFromFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    :cond_1
    iget-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-static {v1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyAuthentication;->saveDeviceCredentials(Lme/pushy/sdk/model/PushyDeviceCredentials;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    const-string v1, "Pushy"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "External storage access failed: "

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lme/pushy/sdk/util/PushyIO;->fileExists(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-static {v3}, Lme/pushy/sdk/util/PushyIO;->fileExists(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    :try_start_1
    invoke-static {v0, p0}, Lme/pushy/sdk/util/PushyAuthentication;->saveDeviceCredentials(Lme/pushy/sdk/model/PushyDeviceCredentials;Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    const-string v1, "Pushy"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Persisting the credentials to external storage failed: "

    goto :goto_0

    :cond_4
    :goto_1
    iget-object p0, v0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    if-nez p0, :cond_5

    return-object v2

    :cond_5
    return-object v0
.end method

.method public static obtainDeviceAuthKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object v0

    new-instance v1, Lme/pushy/sdk/model/api/PushyAuthMigrationRequest;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lme/pushy/sdk/model/api/PushyAuthMigrationRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lme/pushy/sdk/util/PushyEndpoints;->getAPIEndpoint(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/devices/auth/migrate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lme/pushy/sdk/util/PushyHTTP;->post(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object v1

    const-class v2, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;

    invoke-virtual {v1, v0, v2}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;

    iget v1, v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;->code:I

    const/16 v2, 0x194

    if-ne v1, v2, :cond_0

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyFatalException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Authentication migration failed due to unknown device: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;->error:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyFatalException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    iget-object v1, v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;->error:Ljava/lang/String;

    invoke-static {v1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Authentication migration failed: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;->error:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object v1, v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;->auth:Ljava/lang/String;

    invoke-static {v1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyException;

    const-string p1, "Authentication migration failed, please try again later."

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object v0, v0, Lme/pushy/sdk/model/api/PushyAuthMigrationResponse;->auth:Ljava/lang/String;

    new-instance v1, Lme/pushy/sdk/model/PushyDeviceCredentials;

    invoke-direct {v1, p0, v0}, Lme/pushy/sdk/model/PushyDeviceCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, p1}, Lme/pushy/sdk/util/PushyAuthentication;->saveDeviceCredentials(Lme/pushy/sdk/model/PushyDeviceCredentials;Landroid/content/Context;)V

    invoke-static {v1, p1}, Lme/pushy/sdk/util/PushyAuthentication;->validateCredentials(Lme/pushy/sdk/model/PushyDeviceCredentials;Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_3

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyException;

    const-string p1, "Authentication validation failed, please try again later."

    invoke-direct {p0, p1}, Lme/pushy/sdk/util/exceptions/PushyException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-object v0
.end method

.method public static saveDeviceCredentials(Lme/pushy/sdk/model/PushyDeviceCredentials;Landroid/content/Context;)V
    .locals 2

    const-string v0, "pushyToken"

    invoke-static {v0, p1}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentPreferenceKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lme/pushy/sdk/util/PushyPreferences;->saveString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    iget-object v0, p0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "pushyAuthKey"

    invoke-static {v0, p1}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentPreferenceKey(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lme/pushy/sdk/util/PushyPreferences;->saveString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    :cond_0
    :try_start_0
    const-string v0, "registration.id"

    invoke-static {v0, p1}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentExternalStoragePath(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lme/pushy/sdk/model/PushyDeviceCredentials;->token:Ljava/lang/String;

    invoke-static {v0, v1}, Lme/pushy/sdk/util/PushyIO;->writeToFile(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "registration.key"

    invoke-static {v0, p1}, Lme/pushy/sdk/util/PushyPersistence;->getEnvironmentExternalStoragePath(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lme/pushy/sdk/model/PushyDeviceCredentials;->authKey:Ljava/lang/String;

    invoke-static {p1, p0}, Lme/pushy/sdk/util/PushyIO;->writeToFile(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "Pushy"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Saving credentials to external storage failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    return-void
.end method

.method public static validateCredentials(Lme/pushy/sdk/model/PushyDeviceCredentials;Landroid/content/Context;)Z
    .locals 3

    :try_start_0
    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object v0

    new-instance v1, Lme/pushy/sdk/model/api/PushyAuthRequest;

    invoke-direct {v1, p0}, Lme/pushy/sdk/model/api/PushyAuthRequest;-><init>(Lme/pushy/sdk/model/PushyDeviceCredentials;)V

    invoke-virtual {v0, v1}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lme/pushy/sdk/lib/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lme/pushy/sdk/util/PushyEndpoints;->getAPIEndpoint(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/devices/auth"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lme/pushy/sdk/util/PushyHTTP;->post(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_1
    invoke-static {}, Lme/pushy/sdk/util/PushySingleton;->getJackson()Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;

    move-result-object p1

    const-class v0, Lme/pushy/sdk/model/api/PushyAuthResponse;

    invoke-virtual {p1, p0, v0}, Lme/pushy/sdk/lib/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lme/pushy/sdk/model/api/PushyAuthResponse;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    iget-object p1, p0, Lme/pushy/sdk/model/api/PushyAuthResponse;->error:Ljava/lang/String;

    invoke-static {p1}, Lme/pushy/sdk/util/PushyStringUtils;->stringIsNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Pushy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device auth validation failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lme/pushy/sdk/model/api/PushyAuthResponse;->error:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    iget-boolean p0, p0, Lme/pushy/sdk/model/api/PushyAuthResponse;->success:Z

    if-nez p0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyJsonParseException;

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyJsonParseException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Lme/pushy/sdk/util/exceptions/PushyJsonParseException;

    invoke-virtual {p0}, Lme/pushy/sdk/lib/jackson/core/JsonProcessingException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lme/pushy/sdk/util/exceptions/PushyJsonParseException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
