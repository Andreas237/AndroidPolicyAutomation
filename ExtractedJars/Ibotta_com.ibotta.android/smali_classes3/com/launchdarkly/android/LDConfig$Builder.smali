.class public Lcom/launchdarkly/android/LDConfig$Builder;
.super Ljava/lang/Object;
.source "LDConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/LDConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private allAttributesPrivate:Z

.field private backgroundPollingIntervalMillis:I

.field private baseUri:Landroid/net/Uri;

.field private connectionTimeoutMillis:I

.field private disableBackgroundUpdating:Z

.field private eventsCapacity:I

.field private eventsFlushIntervalMillis:I

.field private eventsUri:Landroid/net/Uri;

.field private inlineUsersInEvents:Z

.field private mobileKey:Ljava/lang/String;

.field private offline:Z

.field private pollingIntervalMillis:I

.field private privateAttributeNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private secondaryMobileKeys:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stream:Z

.field private streamUri:Landroid/net/Uri;

.field private useReport:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    sget-object v0, Lcom/launchdarkly/android/LDConfig;->DEFAULT_BASE_URI:Landroid/net/Uri;

    iput-object v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->baseUri:Landroid/net/Uri;

    .line 194
    sget-object v0, Lcom/launchdarkly/android/LDConfig;->DEFAULT_EVENTS_URI:Landroid/net/Uri;

    iput-object v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsUri:Landroid/net/Uri;

    .line 195
    sget-object v0, Lcom/launchdarkly/android/LDConfig;->DEFAULT_STREAM_URI:Landroid/net/Uri;

    iput-object v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->streamUri:Landroid/net/Uri;

    const/16 v0, 0x64

    .line 197
    iput v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsCapacity:I

    const/4 v0, 0x0

    .line 198
    iput v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    const/16 v1, 0x2710

    .line 199
    iput v1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->connectionTimeoutMillis:I

    const v1, 0x493e0

    .line 200
    iput v1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    const v1, 0x36ee80

    .line 201
    iput v1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    .line 203
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->offline:Z

    const/4 v1, 0x1

    .line 204
    iput-boolean v1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->stream:Z

    .line 205
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->disableBackgroundUpdating:Z

    .line 206
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->useReport:Z

    .line 208
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->allAttributesPrivate:Z

    .line 209
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->privateAttributeNames:Ljava/util/Set;

    .line 211
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->inlineUsersInEvents:Z

    return-void
.end method


# virtual methods
.method public allAttributesPrivate()Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 217
    iput-boolean v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->allAttributesPrivate:Z

    return-object p0
.end method

.method public build()Lcom/launchdarkly/android/LDConfig;
    .locals 20

    move-object/from16 v0, p0

    .line 422
    iget-boolean v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->stream:Z

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const v5, 0xdbba0

    if-nez v1, :cond_2

    .line 423
    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    const v6, 0x493e0

    if-ge v1, v6, :cond_0

    const-string v7, "setPollingIntervalMillis: %s was set below the allowed minimum of: %s. Ignoring and using minimum value."

    .line 424
    new-array v8, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v3

    invoke-static {v7, v8}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    iput v6, v0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    .line 428
    :cond_0
    iget-boolean v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->disableBackgroundUpdating:Z

    if-nez v1, :cond_1

    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    iget v6, v0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    if-ge v1, v6, :cond_1

    const-string v6, "BackgroundPollingIntervalMillis: %s was set below the foreground polling interval: %s. Ignoring and using minimum value for background polling."

    .line 429
    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v4

    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v3

    invoke-static {v6, v7}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    iput v5, v0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    .line 433
    :cond_1
    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    if-nez v1, :cond_2

    .line 434
    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    iput v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    const-string v6, "Streaming is disabled, so we\'re setting the events flush interval to the polling interval value: %s"

    .line 435
    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v4

    invoke-static {v6, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    :cond_2
    iget-boolean v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->disableBackgroundUpdating:Z

    if-nez v1, :cond_3

    .line 440
    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    if-ge v1, v5, :cond_3

    const-string v6, "BackgroundPollingIntervalMillis: %s was set below the minimum allowed: %s. Ignoring and using minimum value."

    .line 441
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v3

    invoke-static {v6, v2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    iput v5, v0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    .line 446
    :cond_3
    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    if-nez v1, :cond_4

    const/16 v1, 0x7530

    .line 447
    iput v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    .line 450
    :cond_4
    iget v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    sput v1, Lcom/launchdarkly/android/PollingUpdater;->backgroundPollingIntervalMillis:I

    .line 453
    iget-object v1, v0, Lcom/launchdarkly/android/LDConfig$Builder;->secondaryMobileKeys:Ljava/util/Map;

    if-nez v1, :cond_5

    .line 454
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    move-object v4, v1

    goto :goto_0

    .line 457
    :cond_5
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object v4, v2

    :goto_0
    const-string v1, "default"

    .line 459
    iget-object v2, v0, Lcom/launchdarkly/android/LDConfig$Builder;->mobileKey:Ljava/lang/String;

    invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    new-instance v1, Lcom/launchdarkly/android/LDConfig;

    move-object v3, v1

    iget-object v5, v0, Lcom/launchdarkly/android/LDConfig$Builder;->baseUri:Landroid/net/Uri;

    iget-object v6, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsUri:Landroid/net/Uri;

    iget-object v7, v0, Lcom/launchdarkly/android/LDConfig$Builder;->streamUri:Landroid/net/Uri;

    iget v8, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsCapacity:I

    iget v9, v0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    iget v10, v0, Lcom/launchdarkly/android/LDConfig$Builder;->connectionTimeoutMillis:I

    iget-boolean v11, v0, Lcom/launchdarkly/android/LDConfig$Builder;->offline:Z

    iget-boolean v12, v0, Lcom/launchdarkly/android/LDConfig$Builder;->stream:Z

    iget v13, v0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    iget v14, v0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    iget-boolean v15, v0, Lcom/launchdarkly/android/LDConfig$Builder;->disableBackgroundUpdating:Z

    iget-boolean v2, v0, Lcom/launchdarkly/android/LDConfig$Builder;->useReport:Z

    move/from16 v16, v2

    iget-boolean v2, v0, Lcom/launchdarkly/android/LDConfig$Builder;->allAttributesPrivate:Z

    move/from16 v17, v2

    iget-object v2, v0, Lcom/launchdarkly/android/LDConfig$Builder;->privateAttributeNames:Ljava/util/Set;

    move-object/from16 v18, v2

    iget-boolean v2, v0, Lcom/launchdarkly/android/LDConfig$Builder;->inlineUsersInEvents:Z

    move/from16 v19, v2

    invoke-direct/range {v3 .. v19}, Lcom/launchdarkly/android/LDConfig;-><init>(Ljava/util/Map;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;IIIZZIIZZZLjava/util/Set;Z)V

    return-object v1
.end method

.method public setBackgroundPollingIntervalMillis(I)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 382
    iput p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->backgroundPollingIntervalMillis:I

    return-object p0
.end method

.method public setBaseUri(Landroid/net/Uri;)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->baseUri:Landroid/net/Uri;

    return-object p0
.end method

.method public setConnectionTimeoutMillis(I)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 346
    iput p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->connectionTimeoutMillis:I

    return-object p0
.end method

.method public setDisableBackgroundUpdating(Z)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 392
    iput-boolean p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->disableBackgroundUpdating:Z

    return-object p0
.end method

.method public setEventsCapacity(I)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 322
    iput p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsCapacity:I

    return-object p0
.end method

.method public setEventsFlushIntervalMillis(I)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 334
    iput p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsFlushIntervalMillis:I

    return-object p0
.end method

.method public setEventsUri(Landroid/net/Uri;)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 300
    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->eventsUri:Landroid/net/Uri;

    return-object p0
.end method

.method public setInlineUsersInEvents(Z)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 417
    iput-boolean p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->inlineUsersInEvents:Z

    return-object p0
.end method

.method public setMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/launchdarkly/android/LDConfig$Builder;->secondaryMobileKeys:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 238
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The primary environment key cannot be in the secondary mobile keys."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 241
    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->mobileKey:Ljava/lang/String;

    return-object p0
.end method

.method public setOffline(Z)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 404
    iput-boolean p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->offline:Z

    return-object p0
.end method

.method public setPollingIntervalMillis(I)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 371
    iput p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->pollingIntervalMillis:I

    return-object p0
.end method

.method public setPrivateAttributeNames(Ljava/util/Set;)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/launchdarkly/android/LDConfig$Builder;"
        }
    .end annotation

    .line 226
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->privateAttributeNames:Ljava/util/Set;

    return-object p0
.end method

.method public setSecondaryMobileKeys(Ljava/util/Map;)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/launchdarkly/android/LDConfig$Builder;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 253
    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->secondaryMobileKeys:Ljava/util/Map;

    return-object p0

    .line 257
    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "default"

    .line 258
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 261
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 262
    iget-object v1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->mobileKey:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 263
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The primary environment key cannot be in the secondary mobile keys."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 265
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-ne v1, v0, :cond_3

    .line 269
    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->secondaryMobileKeys:Ljava/util/Map;

    return-object p0

    .line 266
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A key can only be used once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 259
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The primary environment name is not a valid key."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStream(Z)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 359
    iput-boolean p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->stream:Z

    return-object p0
.end method

.method public setStreamUri(Landroid/net/Uri;)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->streamUri:Landroid/net/Uri;

    return-object p0
.end method

.method public setUseReport(Z)Lcom/launchdarkly/android/LDConfig$Builder;
    .locals 0

    .line 278
    iput-boolean p1, p0, Lcom/launchdarkly/android/LDConfig$Builder;->useReport:Z

    return-object p0
.end method
