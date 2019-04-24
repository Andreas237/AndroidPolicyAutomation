.class public abstract Lorg/jivesoftware/smack/initializer/UrlInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/initializer/SmackInitializer;


# static fields
.field private static final TAG:Ljava/lang/String; = "UrlInitializer"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected getConfigUrl()Ljava/lang/String;
    .locals 1

    .line 83
    const/4 v0, 0x0

    return-object v0
.end method

.method protected getProvidersUrl()Ljava/lang/String;
    .locals 1

    .line 79
    const/4 v0, 0x0

    return-object v0
.end method

.method public initialize()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Exception;>;"
        }
    .end annotation

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 43
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 44
    invoke-virtual {p0}, Lorg/jivesoftware/smack/initializer/UrlInitializer;->getProvidersUrl()Ljava/lang/String;

    move-result-object v5

    .line 45
    if-eqz v5, :cond_1

    if-eqz v3, :cond_1

    .line 47
    :try_start_0
    invoke-static {v5, v3}, Lorg/jivesoftware/smack/util/FileUtils;->getStreamForUrl(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/io/InputStream;

    move-result-object v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    const-string v0, "UrlInitializer"

    const-string v1, "Loading providers for providerUrl"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    new-instance v6, Lorg/jivesoftware/smack/provider/ProviderFileLoader;

    invoke-direct {v6, v2, v3}, Lorg/jivesoftware/smack/provider/ProviderFileLoader;-><init>(Ljava/io/InputStream;Ljava/lang/ClassLoader;)V

    .line 52
    invoke-static {v6}, Lorg/jivesoftware/smack/provider/ProviderManager;->addLoader(Lorg/jivesoftware/smack/provider/ProviderLoader;)V

    .line 53
    invoke-virtual {v6}, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->getLoadingExceptions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 54
    goto :goto_0

    .line 56
    :cond_0
    const-string v0, "UrlInitializer"

    const-string v1, "No input stream created"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No input stream created"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :goto_0
    goto :goto_1

    .line 60
    :catch_0
    move-exception v6

    .line 61
    const-string v0, "UrlInitializer"

    const-string v1, "Error trying to load provider"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lorg/jivesoftware/smack/initializer/UrlInitializer;->getConfigUrl()Ljava/lang/String;

    move-result-object v6

    .line 66
    if-eqz v6, :cond_2

    .line 68
    :try_start_1
    invoke-static {v6, v3}, Lorg/jivesoftware/smack/util/FileUtils;->getStreamForUrl(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/io/InputStream;

    move-result-object v2

    .line 69
    invoke-static {v2, v4, v3}, Lorg/jivesoftware/smack/SmackInitialization;->processConfigFile(Ljava/io/InputStream;Ljava/util/Collection;Ljava/lang/ClassLoader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    goto :goto_2

    .line 71
    :catch_1
    move-exception v7

    .line 72
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_2
    :goto_2
    return-object v4
.end method
